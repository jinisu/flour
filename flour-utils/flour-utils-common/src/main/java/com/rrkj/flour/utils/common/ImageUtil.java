/**
 * 文件名：ImageUtil.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2016年8月22日 下午3:10:34
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.common;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2016年8月22日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class ImageUtil {

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2016年8月22日
	 * @author: suhs - jinisu@163.com
	 * @update: 2016年8月22日 下午3:12:02  suhs
	 */
	public static BufferedImage mergeImageVertical(List<BufferedImage> lists) throws IOException {
		// 计算大小
		int width = 0;
		int height = 0;
		for (BufferedImage image : lists) {
			width = Math.max(width, image.getWidth());
			height += image.getHeight();
		}

		BufferedImage combined = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		// paint both images, preserving the alpha channels
		Graphics g = combined.getGraphics();
		int heightTemp = 0;
		for (BufferedImage image : lists) {
			g.drawImage(image, 0, heightTemp, null);
			heightTemp += image.getHeight();
		}
		return combined;
	}

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2016年8月22日
	 * @author: suhs - jinisu@163.com
	 * @update: 2016年8月22日 下午3:12:07  suhs
	 */
	public static BufferedImage mergeImageHorizontal(List<BufferedImage> lists) throws IOException {
		// 计算大小
		int width = 0;
		int height = 0;
		for (BufferedImage image : lists) {
			height = Math.max(height, image.getHeight());
			width += image.getWidth();
		}

		BufferedImage combined = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		// paint both images, preserving the alpha channels
		Graphics g = combined.getGraphics();
		int temp = 0;
		for (BufferedImage image : lists) {
			g.drawImage(image, temp, 0, null);
			temp += image.getWidth();
		}
		return combined;
	}

	/** 
	 * 改变图片的大小到宽为size，然后高随着宽等比例变化 
	 * @param is 上传的图片的输入流 
	 * @param os 改变了图片的大小后，把图片的流输出到目标OutputStream 
	 * @param size 新图片的宽 
	 * @param format 新图片的格式 
	 * @throws IOException 
	 */
	public static void resizeImage(InputStream is, OutputStream os, int size, String format) throws IOException {
		BufferedImage prevImage = ImageIO.read(is);
		double width = prevImage.getWidth();
		double height = prevImage.getHeight();
		double percent = size / width;
		int newWidth = (int) (width * percent);
		int newHeight = (int) (height * percent);
		BufferedImage image = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_BGR);
		Graphics graphics = image.createGraphics();
		graphics.drawImage(prevImage, 0, 0, newWidth, newHeight, null);
		ImageIO.write(image, format, os);
		os.flush();
		is.close();
		os.close();
	}

	/** 
	 * 改变图片的大小到宽为size，然后高随着宽等比例变化 
	 * @param size 新图片的宽 
	 * @param format 新图片的格式 
	 * @throws IOException 
	 */
	public static BufferedImage resizeImage(BufferedImage prevImage, int size, String format) throws IOException {
		double width = prevImage.getWidth();
		double height = prevImage.getHeight();
		double percent = size / width;
		int newWidth = (int) (width * percent);
		int newHeight = (int) (height * percent);
		BufferedImage image = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_BGR);
		Graphics g2d = image.createGraphics();

		Graphics2D graphics = (Graphics2D) g2d.create();
		graphics.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION,
				RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphics.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		graphics.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
		graphics.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
		graphics.drawImage(prevImage, 0, 0, newWidth, newHeight, null);
		return image;
	}

	public static BufferedImage cutPngImage(BufferedImage prevImage, int x, int y, int w, int h) throws IOException {
		Iterator<ImageReader> it = ImageIO.getImageReadersByFormatName("png");
		ImageReader reader = it.next();
		ImageInputStream iis = ImageIO
				.createImageInputStream(new ByteArrayInputStream(bufferedImageToByteArray(prevImage, "png")));
		reader.setInput(iis, true);
		ImageReadParam param = reader.getDefaultReadParam();
		Rectangle rect = new Rectangle(x, y, w, h);
		param.setSourceRegion(rect);
		BufferedImage bi = reader.read(0, param);
		return bi;
	}

	public static byte[] bufferedImageToByteArray(BufferedImage prevImage, String format) throws IOException {
		ByteArrayOutputStream outputs = new ByteArrayOutputStream();
		ImageIO.write(prevImage, format, outputs);
		return outputs.toByteArray();
	}

	/*
	 * 图片缩放
	 */
	public static BufferedImage zoomImage(BufferedImage bufImg, int w, int h) throws Exception {
		double wr = 0, hr = 0;
		Image Itemp = bufImg.getScaledInstance(w, h, bufImg.SCALE_SMOOTH);
		wr = w * 1.0 / bufImg.getWidth();
		hr = h * 1.0 / bufImg.getHeight();
		AffineTransformOp ato = new AffineTransformOp(AffineTransform.getScaleInstance(wr, hr), null);
		Itemp = ato.filter(bufImg, null);
		return toBufferedImage(Itemp);
	}

	public static BufferedImage toBufferedImage(Image image) {
		if (image instanceof BufferedImage) {
			return (BufferedImage) image;
		}
		image = new ImageIcon(image).getImage();
		BufferedImage bimage = null;
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		try {
			int transparency = Transparency.OPAQUE;
			GraphicsDevice gs = ge.getDefaultScreenDevice();
			GraphicsConfiguration gc = gs.getDefaultConfiguration();
			bimage = gc.createCompatibleImage(image.getWidth(null), image.getHeight(null), transparency);
		} catch (HeadlessException e) {
		}

		if (bimage == null) {
			int type = BufferedImage.TYPE_INT_RGB;
			bimage = new BufferedImage(image.getWidth(null), image.getHeight(null), type);
		}
		Graphics g = bimage.createGraphics();
		g.drawImage(image, 0, 0, null);
		g.dispose();
		return bimage;
	}
}
