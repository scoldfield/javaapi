package com.cmcc.test;

import java.io.FileNotFoundException;

import org.dom4j.DocumentException;

import com.cmcc.service.impl.XmlDocument;

public class Test {
    
    @org.junit.Test
    public void testXmlParser() throws DocumentException, FileNotFoundException {
        new XmlDocument().parseXml("test.xml");     //不是web项目，不能用classpath来获取地址
    }

}
