package io.github.kings1990.rap2.generator.test;

import io.github.kings1990.rap2.generator.config.ParseConfig;
import io.github.kings1990.rap2.generator.core.Rap2Generator;
import io.github.kings1990.rap2.generator.util.ParseConfigJsonUtil;
import org.junit.Test;

public class UserModuleRap2Generator {
    @Test
    public void queryUser() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("用户/用户模块/用户查询.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void saveUser() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("用户/用户模块/新建用户.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }
    
}


