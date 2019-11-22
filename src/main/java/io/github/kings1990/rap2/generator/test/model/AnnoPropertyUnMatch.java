package io.github.kings1990.rap2.generator.test.model;

import lombok.Data;

@Data
public class AnnoPropertyUnMatch {
    
    private String id;
    
    private String name;

    //aaa
    /**
     * 性别
     */
    public int sex;

    
    private String id1;
    
    //type
    public int type;

    //****#########
    /**
     * 性别1
     */
    public int sex1;

    
    public int type1;
    
}


