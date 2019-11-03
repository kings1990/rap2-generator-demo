package io.github.kings1990.rap2.generator.test.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    /**
     * 用户名
     */
    private String userName;

    /**
     * 年龄
     */
    private Integer age;
    
    /**
     * 生日
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
}


