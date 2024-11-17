package com.xml.dom4j;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.DOMReader;
import org.dom4j.io.SAXReader;

/**
 * 
 * @author pc
 * 
 * SAXReader 使用方法
 * DOMReader 使用方法
 */
public class Dom4jTest2 {

	public static void main(String[] args) throws Exception {
		SAXReader saxR = new SAXReader();
		
		Document doc = saxR.read(new File("student2.xml"));
		Element root = doc.getRootElement();
		System.out.println("root element :" + root.getName());
		
		List<?> list = root.elements();
		System.out.println("element size :" + list.size());
		
		List<?> childList = root.elements("hello");
		System.out.println("hello element :" + childList.size());
		
		Element first = root.element("world");
		System.out.println("world element's attribute.   talk=" + first.attributeValue("talk"));
		
		//迭代根元素下所有已知元素的属性的值
		for(Iterator<?> iter = root.elementIterator();iter.hasNext();){
			Element e = (Element) iter.next();
			System.out.println(e.attributeValue("talk"));
		}
		
		System.out.println("------------------------------------------------------------------");
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = dbf.newDocumentBuilder();
		org.w3c.dom.Document document = builder.parse(new File("student2.xml"));
		
		DOMReader domR = new DOMReader();
		//将JAXP的Document转换为dom4j的Document
		Document d = domR.read(document);
		Element rootElement = d.getRootElement();
		System.out.println("root element :" + rootElement.getName());//根元素的名字
		
		List<?> EList = rootElement.elements();
		System.out.println(EList.size());
		for(Object e : EList ){
			Element element =  (Element) e;
			System.out.println(element.getName());
		}
	}
}
