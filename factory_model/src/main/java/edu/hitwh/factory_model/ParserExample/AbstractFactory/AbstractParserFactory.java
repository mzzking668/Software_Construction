package edu.hitwh.factory_model.ParserExample.AbstractFactory;

import edu.hitwh.factory_model.ParserExample.AbstractFactoryModel.IRuleConfigParser;
import edu.hitwh.factory_model.ParserExample.AbstractFactoryModel.ISysConfigParser;

public interface AbstractParserFactory {
    public IRuleConfigParser createRuleConfigParser();
    public ISysConfigParser createSysConfigParser();
}
