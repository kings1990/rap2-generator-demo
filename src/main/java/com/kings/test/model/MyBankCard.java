package com.kings.test.model;

import lombok.Data;


@Data
public class MyBankCard {
    /**
     * 卡号
     */
    private String cardNo;
    /**
     * 密码
     */
    private String password;
}