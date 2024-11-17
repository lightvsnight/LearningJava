package com.md5;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

/**
 * MD5加密工具类
 * 
 * @author lhk
 *
 */
public class MD5Util {

	public static String getKey() {

		Properties prop = new Properties();
		try {
			InputStream in = MD5Util.class
					.getResourceAsStream("/chb.properties");
			prop.load(in);
			String key = (String) prop.get("MD5_key");
			in.close();
			return key;
		} catch (IOException e) {
			System.out.println("--------------get MD5_key fail!-------------");
			e.printStackTrace();
		}
		System.out.println("--------------get MD5_key fail!-------------");
		return null;
	}

	// md5加密
	public static String md5(String inputText) {

		String result = encrypt(inputText + getKey(), "md5");

		result = result.substring(8, 20);

		return encrypt(result, "md5");
	}

	// sha加密
	public static String sha(String inputText) {
		return encrypt(inputText, "sha-1");
	}

	/**
	 * md5或者sha-1加密
	 * 
	 * @param inputText
	 *            要加密的内容
	 * @param algorithmName
	 *            加密算法名称：md5或者sha-1，不区分大小写
	 * @return
	 */
	private static String encrypt(String inputText, String algorithmName) {
		if (inputText == null || "".equals(inputText.trim())) {
			throw new IllegalArgumentException("请输入要加密的内容");
		}
		if (algorithmName == null || "".equals(algorithmName.trim())) {
			algorithmName = "chb";// md5
		}
		String encryptText = null;

		try {
			MessageDigest m = MessageDigest.getInstance(algorithmName);
			m.update(inputText.getBytes("UTF8"));
			byte s[] = m.digest();
			// m.digest(inputText.getBytes("UTF8"));
			return hex(s);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return encryptText;
	}

	// 返回十六进制字符串
	private static String hex(byte[] arr) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; ++i) {
			sb.append(Integer.toHexString((arr[i] & 0xFF) | 0x100).substring(1,
					3));
		}
		return sb.toString();
	}

	/*
	 * public static void main(String[] args) { //md5加密测试 String md5_1 =
	 * md5("123"); String md5_2 = md5("abc"); System.out.println(md5_1 + "\n" +
	 * md5_2); System.out.println("md5 length: " + md5_1.length()); //sha加密测试
	 * String sha_1 = sha("123"); String sha_2 = sha("abc");
	 * System.out.println(sha_1 + "\n" + sha_2);
	 * System.out.println("sha length: " + sha_1.length()); //测试获取MD5_key
	 * System.out.println(getKey()); }
	 */
	public static void main(String[] args) {

		String pass = "000003";
		pass = md5(pass);
		// f7a5c99c58103f6b65c451efd0f81826
		System.out.println(pass);
	}
}
