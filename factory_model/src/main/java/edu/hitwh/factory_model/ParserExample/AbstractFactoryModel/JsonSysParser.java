package edu.hitwh.factory_model.ParserExample.AbstractFactoryModel;

public class JsonSysParser implements ISysConfigParser {
    @Override
    public void parse() {
        System.out.println("JsonSysParser正在工作");
    }
}
