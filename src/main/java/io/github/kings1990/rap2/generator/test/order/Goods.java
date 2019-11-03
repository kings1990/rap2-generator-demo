package io.github.kings1990.rap2.generator.test.order;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Goods {
    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private String code;

    /**
     * 单价
     */
    private BigDecimal price;
}


