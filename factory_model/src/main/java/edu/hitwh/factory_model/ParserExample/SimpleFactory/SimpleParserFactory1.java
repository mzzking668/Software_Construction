package edu.hitwh.factory_model.ParserExample.SimpleFactory;

import edu.hitwh.factory_model.ParserExample.ParserMethod.IParser;
import edu.hitwh.factory_model.ParserExample.ParserMethod.PropertiesParser;
import edu.hitwh.factory_model.ParserExample.ParserMethod.XmlParser;
import edu.hitwh.factory_model.ParserExample.ParserMethod.YamlParser;
//这是if-else的方法一
public class SimpleParserFactory1 {
    public IParser createParser(String type){
        if(type.equals("xml")){
            return new XmlParser();
        }else if(type.equals("yaml")){
            return new YamlParser();
        }else if(type.equals("properties")){
            return new PropertiesParser();
        }
        return null;
    }
}
