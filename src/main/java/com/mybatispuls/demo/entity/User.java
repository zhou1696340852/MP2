package com.mybatispuls.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
public class User {

    //@TableId(type = IdType.ID_WORKER) //mp自带策略，生成19位值，数字类型使用这种策略，比如long
    //@TableId(type = IdType.ID_WORKER_STR) //mp自带策略，生成19位值，字符串类型使用这种策略
    private Long id;

    private String name;
    private Integer age;
    private String email;
}
