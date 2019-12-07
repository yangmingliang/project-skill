package com.example.demo.service;

import com.example.demo.DemoApplicationTests;
import com.example.demo.dao.HotelMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class DataAccessTest extends DemoApplicationTests {

    @Autowired
    private HotelMapper hotelMapper;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void acessdataDD() {
    }

    @Test
    public void getTest() {
        hotelMapper.getTest();
    }
}