package edu.hitwh.factory_model.ParserExample.AbstractFactoryModel;

public class YamlSysParser implements ISysConfigParser {
    @Override
    public void parse() {
        System.out.println("YamlSysParser正在工作");
    }
}
