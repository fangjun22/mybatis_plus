package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @author 方俊
 * @date 2021-1-4 , 0004 14:00
 */
@Repository//代表持久层
public interface UserMapper extends BaseMapper<User> {

}
