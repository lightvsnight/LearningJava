package com.xml.dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMTest2 {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		DocumentBuilder db = dbf.newDocumentBuilder();

		Document document = db.parse(new File("students.xml"));

		// 编码
		// System.out.println(document.getXmlEncoding());
		// 版本号
		// System.out.println(document.getXmlVersion());
		// 是否是独立的xml
		// System.out.println(document.getXmlStandalone());

		Element root = document.getDocumentElement();
		System.out.println(root.getTagName());

		NodeList nodeList = root.getChildNodes();
		System.out.println(nodeList.getLength());

		System.out.println("-------------------------------------------------");
		for (int i = 0; i < nodeList.getLength(); i++) {

			Node n = nodeList.item(i);

			if (n.getNodeType() == Node.ELEMENT_NODE) {
				// 元素...
			} else if (n.getNodeType() == Node.TEXT_NODE) {
				// 文本...
			}
		}

		System.out.println("-------------------------------------------------");
		for (int i = 0; i < nodeList.getLength(); i++) {

			Node n = nodeList.item(i);
			System.out.println(n.getTextContent());
		}

		System.out.println("=================================================");

		for (int i = 0; i < nodeList.getLength(); i++) {

			System.out.println(nodeList.item(i).getNodeName());// 获取元素节点

			NamedNodeMap nnm = nodeList.item(i).getAttributes();

			if(nnm != null)
			{
				for (int j = 0; j < nnm.getLength(); j++) {
					Node n = nnm.item(j);
					if (n.getNodeType() == Node.ATTRIBUTE_NODE) 
					{
						System.out.println(n.getNodeName() + "=" + n.getNodeValue());
					}
				}
			}
		
		}
	}
}
