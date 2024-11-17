package com.xml.dom4j;

import java.io.FileOutputStream;
import java.io.FileWriter;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * 
 * @author pc
 * sax 创建元素的方法
 */
public class Dom4jTest {

	public static void main(String[] args) throws Exception {
		 
		//step 1: 创建文档并设置文档的根元素节点：第一种方式
		//Document document = DocumentHelper.createDocument();
		//step 2: 创建一个根元素
		//Element root = DocumentHelper.createElement("student");
		//step 3: 创建一个根节点放入根元素
		//document.setRootElement(root); //设置根元素
		
		//step 1: 创建文档并设置文档的根元素节点：第二种方式
		Element root = DocumentHelper.createElement("student");
		Document document = DocumentHelper.createDocument(root);
		
		root.addAttribute("name","shangsan");
		
		Element helloElement = root.addElement("hello");
		Element worldElement = root.addElement("world");
		helloElement.addText("hello");
		worldElement.addText("world");
		
		helloElement.addAttribute("talk","1");
		worldElement.addAttribute("talk","2");
		
		//dom4j 输出格式
		OutputFormat format = new OutputFormat("    ",true);
		
		//step 1:dom4j 输出到控制台
		XMLWriter writer = new XMLWriter(format);
		writer.write(document); //输出到控制台
	   
		//step 2:dom4j 输出到硬盘
		XMLWriter writer2 = new XMLWriter(new FileOutputStream("student2.xml"),format);
		writer2.write(document);
		
		//step 3:dom4j 输出到硬盘
		XMLWriter writer3 = new XMLWriter(new FileWriter("student3.xml"),format);
		writer3.write(document);
		writer3.close();
	}
}
