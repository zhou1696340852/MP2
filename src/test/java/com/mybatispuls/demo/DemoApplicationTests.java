package com.mybatispuls.demo;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.mybatispuls.demo.entity.User;
import com.mybatispuls.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> list = userMapper.selectList(null);
        System.out.println(list);
    }
    /**
     * 创建用户*/
    @Test
    void creation() {
        User user = new User();
        user.setAge(1);
        user.setName("aa2");
        user.setEmail("aa2@qq.com");
        userMapper.insert(user);
    }
    /**
     * 删除用户*/
    @Test
    void delete() {
        User user = new User();
        user.setAge(1);
        user.setName("aa2");
        user.setEmail("aa2@qq.com");
        //userMapper.selectOne(user);
        //Wrapper wrapper=new Wrapper<User>();

    }


}
