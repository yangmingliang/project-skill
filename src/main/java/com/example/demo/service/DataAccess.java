package com.example.demo.service;

import com.example.demo.dao.HotelMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import java.util.Properties;
@Service
public class DataAccess {

    @Autowired
    private HotelMapper hotelMapper;

    public void acessdataDD(){
        //动态配置数据库参数
        Properties properties = new Properties();
        properties.setProperty("jdbc.driver", "动态设置");
        properties.setProperty("jdbc.url", "动态设置");
        properties.setProperty("jdbc.username", "动态设置");
        properties.setProperty("jdbc.password", "动态设置");

        //加载mybatis配置文件和映射文件
        String resource = "mybatis/mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader, properties);
        SqlSession session = factory.openSession();
//获取对象
        session.selectList("");

    }

    public List<Map<String,String>> getTest() {
        List<Map<String,String>> list =  hotelMapper.getTest();
        return list;
    }
}
