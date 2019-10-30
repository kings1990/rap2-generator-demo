package com.kings.rap2.test;


import com.kings.rap.config.ParseConfig;
import com.kings.rap.core.KingsRap2;
import com.kings.rap.util.ParseConfigJsonUtil;
import org.junit.Test;

public class TestRap2Generator {

    @Test
    public void test4BodyParam() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByFile("body入参.json");
        KingsRap2 kingsRap2 = new KingsRap2();
        kingsRap2.setParseConfig(parseConfig);
        kingsRap2.doRap2();
    }

    @Test
    public void test4QueryParam() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByFile("query入参.json");
        KingsRap2 kingsRap2 = new KingsRap2();
        kingsRap2.setParseConfig(parseConfig);
        kingsRap2.doRap2();
    }

    @Test
    public void test4ModelWithAuthor() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByFile("携带类名注释.json");
        KingsRap2 kingsRap2 = new KingsRap2();
        kingsRap2.setParseConfig(parseConfig);
        kingsRap2.doRap2();
    }

    @Test
    public void test4BasecTypeResponse() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByFile("基础类型.json");
        KingsRap2 kingsRap2 = new KingsRap2();
        kingsRap2.setParseConfig(parseConfig);
        kingsRap2.doRap2();
    }

    @Test
    public void testPagination() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByFile("分页.json");
        KingsRap2 kingsRap2 = new KingsRap2();
        kingsRap2.setParseConfig(parseConfig);
        kingsRap2.doRap2();
    }

    @Test
    public void testComplexObject() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByFile("返回单个复杂对象.json");
        KingsRap2 kingsRap2 = new KingsRap2();
        kingsRap2.setParseConfig(parseConfig);
        kingsRap2.doRap2();
    }

    @Test
    public void testCustomResponseTemplate() throws Exception {
        ParseConfig parseConfig = ParseConfigJsonUtil.parseByFile("自定义响应模板.json");
        KingsRap2 kingsRap2 = new KingsRap2();
        kingsRap2.setParseConfig(parseConfig);
        kingsRap2.doRap2();
    }
    
}


