package com.kings.rap2.test.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p class="detail">
 * 功能:时间类型,针对不同注解的支持
 * </p>
 *
 * @author Kings
 * @version V1.0
 * @date 2019.11.02
 */
@Data
public class DateVo {
    /**
     * date类型
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date date;

    /**
     * localDate类型
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate localDate;

    /**
     * localDateTime类型
     */
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private LocalDateTime localDateTime;

    public static void main(String[] args) throws NoSuchFieldException {
        DateTimeFormat localDateTime = DateVo.class.getDeclaredField("localDateTime").getAnnotation(DateTimeFormat.class);
        System.out.println(localDateTime.pattern());
    }
}


