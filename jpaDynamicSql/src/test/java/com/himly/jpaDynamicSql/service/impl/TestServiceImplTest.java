package com.himly.jpaDynamicSql.service.impl;

import com.himly.jpaDynamicSql.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * create_at:MaZheng
 * create_by:${date} ${time}
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceImplTest {

    @Autowired
    TestService testService;

    @Test
    public void getByConditions() throws Exception {
        testService.getByConditions("himly","","");
    }

}