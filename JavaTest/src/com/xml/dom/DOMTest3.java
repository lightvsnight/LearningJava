package com.xml.dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 
 * @author pc
 * 使用递归解析给定的任意一个XML文档，并且将其内容输出到命令行上
 */
public class DOMTest3 {

	public static void main(String[] args) throws Exception, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		Document document = db.parse(new File("students.xml"));
		
		//获取根元素节点
		Element root = document.getDocumentElement();
		//System.out.println(root.getTagName());
		
		
		parseElement(root);
	}
	
	//迭代方法
	private static void parseElement(Element element){

		String tagName = element.getTagName();
		
		//该元素下所有子元素
		NodeList children = element.getChildNodes();
		System.out.print("<" + tagName);
		//该元素的属性
		NamedNodeMap map = element.getAttributes();
		if(null != map){
			for(int i = 0; i < map.getLength(); i++){
				Attr attr = (Attr) map.item(i);
				String attrName = attr.getName();
				String attrValue = attr.getValue();
				System.out.print(" "+attrName +"=\""+attrValue+"\"");
			}
		}
		System.out.print(">");
		
		for(int i = 0; i < children.getLength(); i++){
			Node node = children.item(i);
			short nodeType = node.getNodeType();
			//如果该节点是元素
			if(nodeType == Node.ELEMENT_NODE){//如果是元素
				parseElement((Element)node);
			}
			else if(nodeType == Node.TEXT_NODE){//如果是文本
				//递归出口
				System.out.print(node.getNodeValue());
			}
			else if(nodeType == Node.COMMENT_NODE){ //如果是一个注释
				System.out.print("<!--");
				Comment comment = (Comment)node;
				
				String data = comment.getData();
				System.out.print(data);
				System.out.print("-->");
			}
		}
		System.out.print("</" + tagName + ">");
	}
}
