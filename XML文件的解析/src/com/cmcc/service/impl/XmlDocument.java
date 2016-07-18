package com.cmcc.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.cmcc.service.IXmlDocument;

public class XmlDocument implements IXmlDocument {

    @Override
    public void parseXml(String fileName) throws DocumentException, FileNotFoundException {
        File file = new File(fileName);
        if(!file.exists()) {
            throw new FileNotFoundException();
        }
        
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(file);
        Element users = document.getRootElement();
        Iterator rootIterator = users.elementIterator();
        while(rootIterator.hasNext()) {
            Element user = (Element) rootIterator.next();
            Iterator elementIterator = user.elementIterator();
            while(elementIterator.hasNext()) {
                Element node = (Element) elementIterator.next();
                System.out.println(node.getName() + ":" + node.getText());
            }
        }
    }

}
