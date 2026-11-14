package edu.hitwh.factory_model.ParserExample.ParserFactory;

import edu.hitwh.factory_model.ParserExample.ParserMethod.IParser;
import edu.hitwh.factory_model.ParserExample.ParserMethod.XmlParser;

public class XmlParserFactory implements ParserFactory {
    public IParser createParser() {
        return new XmlParser();
    }
}
