package com.xju;

import com.xju.mapper.UserMapper;
import com.xju.pojo.Me;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {


        String resource = "Mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Me> meList = userMapper.selectAll();
        for (Me me : meList) {
            // 对每个 Me 对象执行操作
            System.out.println("ID: " + me.getId());
            System.out.println("QQ: " + me.getQq());
            System.out.println("Email: " + me.getEmail());
            System.out.println("Username: " + me.getUsername());
            System.out.println("Message: " + me.getMess());
        }
        sqlSession.close();
    }
}
