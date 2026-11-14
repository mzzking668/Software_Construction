package edu.hitwh.factory_model.ParserExample.AbstractFactory;

import edu.hitwh.factory_model.ParserExample.AbstractFactoryModel.IRuleConfigParser;
import edu.hitwh.factory_model.ParserExample.AbstractFactoryModel.ISysConfigParser;
import edu.hitwh.factory_model.ParserExample.AbstractFactoryModel.JsonRuleParser;
import edu.hitwh.factory_model.ParserExample.AbstractFactoryModel.JsonSysParser;

public class JsonAbstractParser implements AbstractParserFactory {
    @Override
    public ISysConfigParser createSysConfigParser() {
        return new JsonSysParser();

    }

    @Override
    public IRuleConfigParser createRuleConfigParser() {
        return new JsonRuleParser();
    }
}
