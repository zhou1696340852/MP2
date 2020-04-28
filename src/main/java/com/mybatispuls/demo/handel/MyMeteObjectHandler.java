package com.mybatispuls.demo.handel;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: zhout
 * @Date: 2020/4/28 14:59
 * @Description:
 */
@Component
public class MyMeteObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("creationTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
        //版本默认填充1
        this.setFieldValByName("version", 1, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);

    }
}
