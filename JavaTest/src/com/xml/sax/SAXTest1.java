package com.xml.sax;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXTest1 {
	
	public static void main(String[] args) throws Exception {
		
		// step 1: 创建SAX解析工厂
		SAXParserFactory saxpf = SAXParserFactory.newInstance();
		
		// step 2: 获取SAX解析器实例
		SAXParser saxP = saxpf.newSAXParser();
		
		// step 3: 开始解析,解析XML文档对应的监听器
		saxP.parse(new File("students.xml"),new DefaultHandler(){
			@Override
			public void startDocument() throws SAXException {
				super.startDocument();
			}
			
			@Override
			public void startElement(String uri, String localName,
					String qName, Attributes attributes) throws SAXException {
				// TODO Auto-generated method stub
				//System.out.println(uri);
				//System.out.println(localName);
				System.out.println(qName);
				//System.out.println(attributes);
				//super.startElement(uri, localName, qName, attributes);
			}
			
			@Override
			public void endElement(String uri, String localName, String qName)
					throws SAXException {
				System.out.println(qName);
				//super.endElement(uri, localName, qName);
			}
			
			
			@Override
			public void endDocument() throws SAXException {
				// TODO Auto-generated method stub
				super.endDocument();
			}
		});
	}

}
