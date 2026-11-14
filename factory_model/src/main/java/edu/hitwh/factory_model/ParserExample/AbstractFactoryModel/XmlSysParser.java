package edu.hitwh.factory_model.ParserExample.AbstractFactoryModel;

public class XmlSysParser implements ISysConfigParser {
    @Override
    public void parse() {
        System.out.println("XmlSysParser正在工作");
    }
}
