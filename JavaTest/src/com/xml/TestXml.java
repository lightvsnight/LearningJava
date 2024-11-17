package com.xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class TestXml {
	
	// 创建xml文件，G:\javaTest
	static {
		// 先创建目录
		File file = new File("G:\\javaTest\\xml");
		if (!file.isDirectory()) {
			file.mkdir();
		}
		// 在创建文件 \\test.xml
		System.out.println(file.getAbsolutePath());
		File xml = new File(file.getAbsolutePath() + "\\text.xml");
		if (!xml.isFile()) {
			try {
				xml.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void writer(String fileName, Document content) throws Exception {
		// 准备一个字符串数组
		//char[] buffer = new char[content.length()];

		// 将字符串copy到字符数组

		/**
		 * String.getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		 * srcBegin 字符串起始位置 srcEnd 字符串结束位置 dst 目标数组 dstBegin 目标起始位置
		 */
		//content.getChars(0, content.length(), buffer, 0);

		/**
		 * 通过 org.dom4j.io.OutputFormat 来设置XML文档输出格式
		 */
		OutputFormat format = OutputFormat.createPrettyPrint(); // 设置XML文档输出格式
		format.setEncoding("UTF-8"); // 设置XML文档的编码类型
		format.setSuppressDeclaration(false);
		// format.setIndent(true); //设置是否缩进
		// format.setIndent("   "); //以空格方式实现缩进
		// format.setNewlines(true); //设置是否换行

		/**
		 * 输出到目标文件
		 * 
		 * xml Writer 是从字符流转化为字节流，在写入文件中
		 */

		/*
		 * FileWriter fw = new FileWriter(fileName); for (int i = 0; i <
		 * buffer.length; i++) { fw.write(content); } fw.close();
		 */

		XMLWriter xw = new XMLWriter(new FileWriter(fileName), format);
		xw.write(content);

		xw.close();
	}

	// 创建XML根元素
	private Document createXml() {
		Document document = DocumentHelper.createDocument();
		Element root = DocumentHelper.createElement("message");
		document.setRootElement(root);
		return document;
	}

	// 构建XML元素和内容
	public String addXMLContent(String args) {
		Document document = this.createXml();
		Element root = document.getRootElement();
		Element type = root.addElement("type");
		type.setText("1");
		Element user = root.addElement("user");
		user.setText(args);

		return document.asXML();
	}

	// 构建XML元素和内容
	public Document addXMLContentDoc(String args) {
		Document document = this.createXml();
		Element root = document.getRootElement();
		Element type = root.addElement("type");
		type.setText("1");
		Element user = root.addElement("user");
		user.setText(args);

		return document;
	}

	public static void main(String[] args) {
		TestXml tx = new TestXml();
		String xml = tx.addXMLContent("xiaoxiao");
		try {
			// G:\\javaTest\\xml\\
			tx.writer("text.xml", tx.addXMLContentDoc("xiaoxiao"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
