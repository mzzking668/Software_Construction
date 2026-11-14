package edu.hitwh.factory_model.ParserExample.ParserFactory;

import edu.hitwh.factory_model.ParserExample.ParserMethod.IParser;
import edu.hitwh.factory_model.ParserExample.ParserMethod.YamlParser;

public class YamlParserFactory {
    public IParser createParser() {
        return new YamlParser();
    }
}
