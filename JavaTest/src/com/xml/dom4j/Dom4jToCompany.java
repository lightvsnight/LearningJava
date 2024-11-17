package com.xml.dom4j;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * 
 * @author L.hk
 * 生成 company
 */
public class Dom4jToCompany {

	public static void main(String[] args) throws Exception {
		Document document = DocumentHelper.createDocument();
		Element root = DocumentHelper.createElement("联系人列表");
		document.add(root);
		
		root.addAttribute("公司","A集团");
		
		Element e1 = root.addElement("联系人");
		Element name1 = e1.addElement("姓名");
		name1.addText("张三");
		Element company1 = e1.addElement("公司");
		company1.addText("A公司");
		Element tell1 = e1.addElement("电话");
		tell1.addText("(021)5555666");
		Element address1 = e1.addElement("地址");
		Element street1 = address1.addElement("街道");
		street1.addText("5街");
		Element city1  = address1.addElement("城市");
		city1.addText("上海市");
		Element province1 = address1.addElement("省份");
		province1.addText("上海");
		
		Element e2 = root.addElement("联系人");
		Element name2 = e2.addElement("姓名");
		name2.addText("王三");
		Element company2 = e2.addElement("公司");
		company2.addText("B公司");
		Element tell2 = e2.addElement("电话");
		tell2.addText("(021)5555777");
		Element address2 = e2.addElement("地址");
		Element street2 = address2.addElement("街道");
		street2.addText("87 街");
		Element city2  = address2.addElement("城市");
		city2.addText("上海市");
		Element province2 = address2.addElement("省份");
		province2.addText("上海");
		
		OutputFormat format = new OutputFormat();
		format.setIndent("    ");//缩进字符
		format.setNewlines(true);//是否另起新的一行
		format.setEncoding("GB2312");
		XMLWriter writer1 = new XMLWriter(format);
		writer1.write(document);
		
		XMLWriter writer = new XMLWriter(new FileOutputStream("company.xml"),format);
		writer.write(document);
		writer.close();
	}
}
