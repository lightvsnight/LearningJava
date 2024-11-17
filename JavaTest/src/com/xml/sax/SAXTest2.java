package com.xml.sax;

import java.io.File;
import java.util.Stack;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class SAXTest2 {

	public static void main(String[] args) throws Exception {
		
		//step 1: 创建SAX解析工厂
		SAXParserFactory saxPF = SAXParserFactory.newInstance();
		
		//step 2: 获取SAX解析器
		SAXParser saxP = saxPF.newSAXParser();
		
		//step 3: 开始解析XML
		saxP.parse(new File("students.xml"),new MyHandler());
		
		
	}
}

/**
 * 
 * @author L.hk
 * 自定义解析器事件监听器
 */
class MyHandler extends DefaultHandler{
	
	private Stack<String> stack = new Stack<String>();
	
	private String name;
	
	private String gender;
	
	private String age;
	
	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
	}
	
	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attr) throws SAXException {
		stack.push(qName);
		for(int i = 0; i < attr.getLength(); i++){
			String attrName =  attr.getQName(i);
			String attrValue = attr.getValue(i);
			System.out.print(attrName + "=" + attrValue);
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		
		String tag = stack.peek();
		if("姓名".equals(tag)){
			name = new String(ch,start,length);
		}
		else if("性别".equals(tag)){
			gender = new String(ch,start,length);
		}
		else if("年龄".equals(tag)){
			age = new String(ch,start,length);
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		stack.pop(); //表示该元素已经解析完毕，需要从栈中弹出
		
		if("学生".equals(qName)){
			System.out.println("姓名:" + name);
			System.out.println("性别:" + gender);
			System.out.println("年龄:" + age);
		}
		System.out.println();
	}

}