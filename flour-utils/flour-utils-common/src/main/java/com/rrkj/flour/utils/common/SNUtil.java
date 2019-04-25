package com.rrkj.flour.utils.common;
/**
 * 文件名：SNUtil.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2016年5月4日 上午8:42:16
 *
 * 版权所有：软软科技
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Calendar;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2016年5月4日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class SNUtil {

	private static final String ENCODE_KEY = "MFwDQYJK";

	public static String generateSN(int i) throws Exception {
		// 日期 + id + UUID
		String dateStr = UtilDate.getOrderNum();

		char hour = (char) (48 + Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
		char min = (char) (48 + Calendar.getInstance().get(Calendar.MINUTE));
		char second = (char) (32 + Calendar.getInstance().get(Calendar.SECOND));
		String plainText = SNUtil.getMonthStr().substring(0, 1) + dateStr.substring(6, 8) + hour + min + second + i;
		return encryptDES(plainText, ENCODE_KEY);
	}

	private static String getMonthStr() {
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		String monthStr = month + "";
		if (month >= 10) {
			switch (month) {
				case 10:
					monthStr = "a";
					break;
				case 11:
					monthStr = "b";
					break;
				case 12:
					monthStr = "c";
					break;
				default:
					monthStr = month + "";
					break;
			}
		}

		return monthStr;
	}

	private static byte[] iv = { 1, 2, 3, 4, 5, 6, 7, 8 };

	public static String encryptDES(String encryptString, String encryptKey) throws Exception {
		IvParameterSpec zeroIv = new IvParameterSpec(iv);
		SecretKeySpec key = new SecretKeySpec(encryptKey.getBytes(), "DES");
		Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, key, zeroIv);
		byte[] encryptedData = cipher.doFinal(encryptString.getBytes());
		return byteArr2HexStr(encryptedData);
	}

	public static String decryptDES(String decryptString, String decryptKey) throws Exception {
		byte[] byteMi = hexStr2ByteArr(decryptString);

		IvParameterSpec zeroIv = new IvParameterSpec(iv);
		SecretKeySpec key = new SecretKeySpec(decryptKey.getBytes(), "DES");
		Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, key, zeroIv);
		byte decryptedData[] = cipher.doFinal(byteMi);

		return new String(decryptedData);

	}

	private static String byteArr2HexStr(byte[] arrB) {
		int iLen = arrB.length;
		// 每个byte用两个字符才能表示，所以字符串的长度是数组长度的两倍
		StringBuffer sb = new StringBuffer(iLen * 2);

		for (int i = 0; i < iLen; i++) {
			int intTmp = arrB[i];
			// 把负数转换为正数
			while (intTmp < 0) {
				intTmp = intTmp + 256;
			}
			// 小于0F的数需要在前面补0
			if (intTmp < 16) {
				sb.append("0");
			}
			sb.append(Integer.toString(intTmp, 16));
		}
		return sb.toString();
	}

	private static byte[] hexStr2ByteArr(String strIn) throws NumberFormatException {
		byte[] arrB = strIn.getBytes();
		int iLen = arrB.length;
		byte[] arrOut = new byte[iLen / 2];
		for (int i = 0; i < iLen; i = i + 2) {
			String strTmp = new String(arrB, i, 2);
			arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
		}

		return arrOut;
	}

	public static boolean verifySN(String snCode) throws Exception {
		String src = decryptDES(snCode, ENCODE_KEY);
		String dateStr = UtilDate.getOrderNum();
		String plainText = SNUtil.getMonthStr().substring(0, 1) + dateStr.substring(6, 8);
		if (plainText.equals(src.substring(0, 3))) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) throws Exception {
		File f = new File("/Users/suhs/ClearCodes.txt");

		if (!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();// 创建父级文件路径
			f.createNewFile();// 创建文件
		}
		String content = "";
		FileWriter fw = null;
		BufferedWriter bw = null;
		fw = new FileWriter(f.getAbsoluteFile());
		for (int i = 0; i < 10; i++) {
			String text = SNUtil.generateSN(i);

			content += text + "\r\n";
			System.out.println(text);
		}
		bw = new BufferedWriter(fw);
		bw.write(content);
		bw.flush();
		bw.close();

	}

}
