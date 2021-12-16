package com.smile.mapper;

import com.smile.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

//Mapper 来源于：mybatis-spring-boot-starter
@Mapper     //这个注解表示了这是mybatis中的maper类   //也可以使用@MapperScan("com.smile.mapper"
@Repository   //被spring整合
public interface UserMapper {

    List<User> queryUserList();

    User queryUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUserById(int id);


}
