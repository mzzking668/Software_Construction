package edu.hitwh.factory_model.ParserExample.AbstractFactory;

import edu.hitwh.factory_model.ParserExample.AbstractFactoryModel.IRuleConfigParser;
import edu.hitwh.factory_model.ParserExample.AbstractFactoryModel.ISysConfigParser;
import edu.hitwh.factory_model.ParserExample.AbstractFactoryModel.YamlRuleParser;
import edu.hitwh.factory_model.ParserExample.AbstractFactoryModel.YamlSysParser;

public class YamlAbstractParser implements AbstractParserFactory {
    @Override
    public IRuleConfigParser createRuleConfigParser() {
        return new YamlRuleParser();
    }

    @Override
    public ISysConfigParser createSysConfigParser() {
        return new YamlSysParser();
    }
}
