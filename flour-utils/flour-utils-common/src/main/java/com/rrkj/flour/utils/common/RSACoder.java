package com.rrkj.flour.utils.common;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;

/**
 * RSA加密与解密
 * @author 卜时熙
 *
 */
public class RSACoder {

	public static final String KEY_ALGORITHM = "RSA";

	private static final String PUBLIC_KEY = "RSAPublicKey";

	private static final String PRIVATE_KEY = "RSAPrivateKey";

	private static final int KEY_SIZE = 512;

	private static final String CHAR_SET = "utf-8";

	public static final String SIGN_ALGORITHMS = "SHA1WithRSA";

	/**
	* RSA签名
	* @param content 待签名数据
	* @param privateKey 私钥
	* @return 签名值
	*/
	public static String sign(String content, String privateKey) {
		try {
			PrivateKey priKey = getPrivateKey(privateKey);
			java.security.Signature signature = java.security.Signature.getInstance(SIGN_ALGORITHMS);
			signature.initSign(priKey);
			signature.update(content.getBytes(CHAR_SET));
			byte[] signed = signature.sign();
			return Base64.getEncoder().encodeToString(signed);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	* RSA验签名检查
	* @param content 待签名数据
	* @param sign 签名值
	* @param publicKey 公钥
	* @return 布尔值
	*/
	public static boolean verify(String content, String sign, String publicKey) {
		try {
			PublicKey pubKey = getPublicKey(publicKey);
			java.security.Signature signature = java.security.Signature.getInstance(SIGN_ALGORITHMS);
			signature.initVerify(pubKey);
			signature.update(content.getBytes(CHAR_SET));
			boolean bverify = signature.verify(Base64.getDecoder().decode(sign));
			return bverify;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 使用私钥进行解密
	 * @param data
	 * @param privateKey
	 * @return
	 */
	public static String decryptByPrivateKey(String data, String privateKey) throws Exception {
		PrivateKey pk = getPrivateKey(privateKey);
		byte[] decryptByte = decryptByPrivateKey(Base64.getDecoder().decode(data), pk);
		return new String(decryptByte);
	}

	/**
	 * 使用私钥进行解密
	 * @param date
	 * @param privateKey
	 * @return
	 * @throws Exception
	 */
	private static byte[] decryptByPrivateKey(byte[] date, PrivateKey privateKey) throws Exception {
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		return cipher.doFinal(date);
	}

	/**
	 * 使用公钥进行加密
	 * @param data
	 * @param publicKey
	 * @return
	 * @throws Exception
	 */
	public static String encryptByPublicKey(String data, String publicKey) throws Exception {
		PublicKey pk = getPublicKey(publicKey);
		byte[] enctryptByte = encryptByPublicKey(data.getBytes(), pk);
		return Base64.getEncoder().encodeToString(enctryptByte);
	}

	/**
	 * 使用公钥进行加密
	 * @param date
	 * @param publicKey
	 * @return
	 * @throws Exception
	 */
	private static byte[] encryptByPublicKey(byte[] date, PublicKey publicKey) throws Exception {
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		return cipher.doFinal(date);
	}

	/**
	* 得到私钥
	* @param key 密钥字符串（经过base64编码）
	* @throws Exception
	*/
	public static PrivateKey getPrivateKey(String key) throws Exception {
		byte[] keyBytes;
		keyBytes = Base64.getDecoder().decode(key);
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
		return privateKey;
	}

	/**
	 * 得到公钥
	 * @param key 密钥字符串（经过base64编码）
	 * @return
	 * @throws Exception
	 */
	public static PublicKey getPublicKey(String key) throws Exception {
		byte[] keyBytes;
		keyBytes = Base64.getDecoder().decode(key);
		X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PublicKey publicKey = keyFactory.generatePublic(keySpec);
		return publicKey;
	}

	/**
	 * 这个方法用于生成密钥,如果已经有密钥了就不需要在调用方法生成了
	 * @return
	 * @throws Exception
	 */
	public static Map<String, String> initKey() throws Exception {
		KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance(KEY_ALGORITHM);
		keyPairGen.initialize(KEY_SIZE);
		KeyPair keyPair = keyPairGen.generateKeyPair();
		RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
		RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
		Map<String, String> keyMap = new HashMap<String, String>();
		keyMap.put(PRIVATE_KEY, Base64.getEncoder().encodeToString(privateKey.getEncoded()));
		keyMap.put(PUBLIC_KEY, Base64.getEncoder().encodeToString(publicKey.getEncoded()));
		return keyMap;
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 1; i++) {

			Map<String, String> keys = initKey();
			// System.out.println(keys.get(PRIVATE_KEY));
			System.out.println("\n\n");
			// System.out.println(keys.get(PUBLIC_KEY));

			String data = "abc123AAA";
			String pubKey = keys.get(PUBLIC_KEY);
			String priKey = keys.get(PRIVATE_KEY);

			String encryped = RSACoder.encryptByPublicKey(data, pubKey);
			System.out.println(encryped);

			String decryped = RSACoder.decryptByPrivateKey(encryped, priKey);

			// System.out.println(decryped);

		}

	}
}
