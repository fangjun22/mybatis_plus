package com.example.mybatis_plus;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusApplicationTests {

  //继承了BaseMapper,所有的方法都来自自己父类，也可以编写自己的方法
  @Autowired
  private UserMapper userMapper;
  @Test
  void contextLoads() {
    /**
     * 查询全部用户
     * 参数是一个Wrapper,条件构造器
     */
    List<User> users = userMapper.selectList(null);
    users.forEach(System.out::println);
  }

}
