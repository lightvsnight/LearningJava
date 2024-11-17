package com.xml.dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMTest1 {

	public static void main(String[] args) throws Exception {
		
		//step 1:获得DOM解析器工厂(工作的作用是用于创建具体的解析器 )
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		System.out.println("class name:" + dbf.getClass().getName());
		
		//step 2:获得具体的DOM解析器 (通过使用DOM解析器工厂类来创建DOM解析器)
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		System.out.println("class name:" + db.getClass().getName());
		
		//step 3:解析一个文档,获得Document对象(根节点)
		Document document = db.parse(new File("candidate.xml"));
		
		NodeList nodeList = document.getElementsByTagName("PERSON");
		
		for(int i =0 ;i<nodeList.getLength();i++){
			Node node = nodeList.item(i);
			Element element = (Element)node;
			String name = element.getElementsByTagName("NAME").item(0).getFirstChild().getNodeValue();
			String address = element.getElementsByTagName("ADDRESS").item(0).getFirstChild().getNodeValue();
			String tel = element.getElementsByTagName("TEL").item(0).getFirstChild().getNodeValue();
			String fax = element.getElementsByTagName("FAX").item(0).getFirstChild().getNodeValue();
			String email = element.getElementsByTagName("EMAIL").item(0).getFirstChild().getNodeValue();

			System.out.println("------------------------");
			System.out.println("name:"+name);
			System.out.println("address:"+address);
			System.out.println("tel:"+tel);
			System.out.println("fax:"+fax);
			System.out.println("email:"+email);
			System.out.println("------------------------");
			System.out.println();
		}
		System.out.println("===================================");
		for(int i = 0; i < nodeList.getLength(); i++){
			NamedNodeMap nnm = nodeList.item(i).getAttributes();
			
			for(int j = 0; j< nnm.getLength(); j++){
				Node n = nnm.item(j);
				if(n.getNodeType() == Node.ATTRIBUTE_NODE){
					System.out.println(n.getNodeName() + "=" +n.getNodeValue());
				}
			}
		}
		
	}
}
