package io.github.kings1990.rap2.generator.test;


import io.github.kings1990.rap2.generator.config.ParseConfig;
import io.github.kings1990.rap2.generator.core.Rap2Generator;
import io.github.kings1990.rap2.generator.util.ParseConfigJsonUtil;
import org.junit.Test;

public class TestRap2Generator {

    @Test
    public void test4BodyParam() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("rap2-generator-test/测试模块/body入参.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void test4QueryParam() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("rap2-generator-test/测试模块/query入参.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void test4ModelWithAuthor() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("rap2-generator-test/测试模块/携带类名注释.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void test4BasecTypeResponse() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("rap2-generator-test/测试模块/基础类型.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void testPagination() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("rap2-generator-test/测试模块/分页.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void testComplexObject() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("rap2-generator-test/测试模块/返回单个复杂对象.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void testCustomResponseTemplate() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("rap2-generator-test/测试模块/自定义响应模板.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void testDayPattern() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("rap2-generator-test/测试模块/时间类型支持.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void testEmptyIn() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("rap2-generator-test/测试模块/空输入.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void testEmptyOut() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("rap2-generator-test/测试模块/空输出.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }

    @Test
    public void testAnno() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByJsonFile("rap2-generator-test/测试模块/兼容注释.json");
        Rap2Generator rap2Generator = new Rap2Generator();
        rap2Generator.setParseConfig(parseConfig);
        rap2Generator.generate();
    }
    
}


