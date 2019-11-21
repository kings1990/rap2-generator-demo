package io.github.kings1990.rap2.generator.test.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BorderCollie extends Dog implements Serializable {
    /**
     * 昵称
     */
    private String nickName;
}


