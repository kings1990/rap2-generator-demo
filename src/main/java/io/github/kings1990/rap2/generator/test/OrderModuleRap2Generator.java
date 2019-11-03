package io.github.kings1990.rap2.generator.test;

import io.github.kings1990.rap2.generator.config.ParseConfig;
import io.github.kings1990.rap2.generator.core.Rap2Generator;
import io.github.kings1990.rap2.generator.util.ParseConfigJsonUtil;
import org.junit.Test;

public class OrderModuleRap2Generator {
    @Test
    public void queryOrder() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("order/订单查询.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void saveOrder() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("order/新建订单.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }
    
}


