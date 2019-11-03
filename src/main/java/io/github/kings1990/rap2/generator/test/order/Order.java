package io.github.kings1990.rap2.generator.test.order;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    /**
     * 订单标号
     */
    private String orderId;

    /**
     * 支付方式【1-线上 2-线下】
     */
    private Integer payWay;

    /**
     * 所选商品
     */
    private List<Goods> goodsList;
}


