package io.github.kings1990.rap2.generator.test.model;

import lombok.Data;

@Data
public class AnnoPropertyUnMatch {
    /**
     * id
     */
    private String id;
    
    private String name;

    /**
     * 性别
     */
    public int sex;
    
    public int type;
    
}


