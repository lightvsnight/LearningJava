package com.xml.jdom;

import java.io.FileOutputStream;

import org.jdom.Attribute;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class JdomTest1 {

	public static void main(String[] args) throws Exception {
		Attribute attr = null;
		Document document = new Document();
		
		Element root = new Element("root");
		document.addContent(root);
		Comment comment = new Comment("This is my comments");
		root.addContent(comment);
		
		Element hello = new Element("hello");
		attr = new Attribute("encoding","utf-8",Attribute.CDATA_TYPE);
		hello.setAttribute(attr);
		hello.addContent("helloWorld");
		root.addContent(hello);
		
		Element world = new Element("world");
		attr = new Attribute("encoding","gbk",Attribute.CDATA_TYPE);
		world.setAttribute(attr);
		world.addContent("helloWorld");
		root.addContent(world);
		
		
		//JDOM提供XML格式 rowformat 原生的格式
		Format format = Format.getRawFormat();
		
		//JDOM提供XML格式 rowformat 漂亮的格式
		format = Format.getPrettyFormat();
		
		format.setIndent("    ");//缩进4个空格
		
		XMLOutputter out = new XMLOutputter(format);
		out.output(document,new FileOutputStream("jdom.xml"));
	}
}
