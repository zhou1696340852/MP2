package com.mybatispuls.demo;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatispuls.demo.entity.User;
import com.mybatispuls.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
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
    /**
     * 测试乐观锁*/
    @Test
    void testOptimisticLockerInterceptor() {

        User user = userMapper.selectById(1255179677170499585L);
        user.setAge(111);
        userMapper.updateById(user);

    }
    /**
     * 多个id批量查询*/
    @Test
    void ByIds() {
        List<User> list = userMapper.selectBatchIds(Arrays.asList(1L, 2L, 3L));
    }

    /**
     * 测试分页*/
    @Test
    void page() {
        //创建分页条件  当前页，每页条数
        Page<User> page=new Page<>(2,2);
        userMapper.selectPage(page,null);
    }

}
