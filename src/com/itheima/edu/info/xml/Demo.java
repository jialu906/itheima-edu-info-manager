package com.itheima.edu.info.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read(new File("xml\\student.xml"));
        Element rootElement = read.getRootElement();
        List<Element> elements = rootElement.elements("student");
        ArrayList<Student>list=new ArrayList<>();
        for (Element element : elements) {

            //获取id属性
            Attribute id = element.attribute("id");
            //获取Id值
            String value = id.getValue();

            //获取调用者指定的name子标签
            Element name = element.element("name");
            String name1 = name.getText();

            Element age = element.element("age");
            String age1 = age.getText();

            Student s=new Student(name1,Integer.parseInt(value),Integer.parseInt(age1));
            list.add(s);
        }
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
