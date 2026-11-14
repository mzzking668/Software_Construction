package edu.hitwh.factory_model.ParserExample.SimpleFactory;

import edu.hitwh.factory_model.ParserExample.ParserMethod.IParser;
import edu.hitwh.factory_model.ParserExample.ParserMethod.PropertiesParser;
import edu.hitwh.factory_model.ParserExample.ParserMethod.XmlParser;
import edu.hitwh.factory_model.ParserExample.ParserMethod.YamlParser;

import java.util.HashMap;
import java.util.Map;
//这是使用的Map查表法
public class SimpleParserFactory2 {
    private static final Map<String, IParser> parsers=new HashMap<String, IParser>();
    static{
        parsers.put("xml",new XmlParser());
        parsers.put("yaml",new YamlParser());
        parsers.put("properties",new PropertiesParser());
    }
    public IParser createParser(String type){
        IParser Aparser=parsers.get(type);
        return Aparser;
    }
}
