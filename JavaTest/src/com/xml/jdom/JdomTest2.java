package com.xml.jdom;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.DOMBuilder;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class JdomTest2 {

	public static void main(String[] args) throws Exception {
		
		SAXBuilder saxB = new SAXBuilder();
		
		Document doc = saxB.build(new File("jdom.xml"));
		Element root = doc.getRootElement();
		
		System.out.println(root.getName());
		
		Element hello = root.getChild("hello");
		System.out.println(hello.getName());
		
//		Attribute attr = hello.getAttribute("encoding");
//		System.out.println(attr.getName());
		
		@SuppressWarnings("unchecked")
		List<Attribute> attrList= hello.getAttributes();
		for(Attribute attr:attrList){
			String name = attr.getName();
			String value = attr.getValue();
			System.out.println(name+"="+value);
		}
		
		
		root.removeChild("world");
		
		XMLOutputter out = new XMLOutputter(Format.getPrettyFormat().setIndent("    "));
		out.output(doc,new FileOutputStream("jdom2.xml"));
	}
}
