package edu.hitwh.factory_model;

import edu.hitwh.factory_model.ParserExample.ParserMethod.XmlParser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FactoryModelApplicationTests {

    @Test
    void contextLoads() {
        XmlParser xmlParser = new XmlParser();
    }

}
