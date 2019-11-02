package io.github.kings1990.rap2.generator.test;


import com.kings.rap.config.ParseConfig;
import com.kings.rap.core.Rap2Generator;
import com.kings.rap.util.ParseConfigJsonUtil;
import org.junit.Test;

public class TestRap2Generator {

    @Test
    public void test4BodyParam() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("body入参.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void test4QueryParam() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("query入参.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void test4ModelWithAuthor() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("携带类名注释.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void test4BasecTypeResponse() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("基础类型.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void testPagination() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("分页.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void testComplexObject() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("返回单个复杂对象.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void testCustomResponseTemplate() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("自定义响应模板.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void testDayPattern() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("时间类型支持.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }
    
}


