package edu.hitwh.factory_model.ParserExample.AbstractFactory;

import edu.hitwh.factory_model.ParserExample.AbstractFactoryModel.IRuleConfigParser;
import edu.hitwh.factory_model.ParserExample.AbstractFactoryModel.ISysConfigParser;
import edu.hitwh.factory_model.ParserExample.AbstractFactoryModel.XmlRuleParser;
import edu.hitwh.factory_model.ParserExample.AbstractFactoryModel.XmlSysParser;

public class XmlAbstractParser implements AbstractParserFactory {
    @Override
    public IRuleConfigParser createRuleConfigParser() {
        return new XmlRuleParser();
    }
    public ISysConfigParser createSysConfigParser() {
        return new XmlSysParser();
    }
}
