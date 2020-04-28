package com.mybatispuls.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatispuls.demo.entity.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Author: zhout
 * @Date: 2020/4/27 16:48
 * @Description:
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
