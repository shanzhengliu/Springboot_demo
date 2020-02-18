package com.sam.sample.sam;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class mycontrollerTest {

    @Before
    public void init()
    {
        System.out.println("开始测试");
    }
    @Test
    void say() {


          String a = "hi";
        Assert.assertSame("hi",a);

    }

    @Test
    void touch() {

        String a = "helloworld";
        Assert.assertSame("helloworld",a);
    }
    @After
    public void after()
    {

    }
}