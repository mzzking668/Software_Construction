package edu.hitwh.factory_model.ParserExample.ParserFactory;

import edu.hitwh.factory_model.ParserExample.ParserMethod.IParser;

public interface ParserFactory {
    public IParser createParser();
}
