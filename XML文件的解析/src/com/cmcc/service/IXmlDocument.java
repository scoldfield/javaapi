package com.cmcc.service;

import java.io.FileNotFoundException;

import org.dom4j.DocumentException;

/*
 * xml文件的解析接口
 */
public interface IXmlDocument {

    public void parseXml(String fileName) throws DocumentException, FileNotFoundException;
}
