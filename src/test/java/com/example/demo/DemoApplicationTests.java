package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplicationTests.class)
@WebAppConfiguration
@MapperScan(value = "com.example.demo.dao")
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

}
