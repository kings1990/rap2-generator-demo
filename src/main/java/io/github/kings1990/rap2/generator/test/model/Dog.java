package io.github.kings1990.rap2.generator.test.model;

import lombok.Data;

import java.util.List;

/**
 * <p class="detail">
 * 功能:
 * </p>
 *
 * @author Kings
 * @version V1.0
 * @date 2019.11.21
 */
@Data
public abstract class Dog extends Animal {

    /**
     * 类型【1-大型犬 2-中型犬 3-小型犬】
     */
    private Integer type;

    private Integer sex;

    /**
     * 额外属性
     */
    private List<KingsVo> kingsVos;

}


