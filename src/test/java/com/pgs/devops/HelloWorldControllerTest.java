package com.pgs.devops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HelloWorldController.class)
public class HelloWorldControllerTest {

    @Autowired
    private HelloWorldController controller;
    
    @Test
    public void testSayHelloWorld() throws Exception {
    	assertEquals("Hello World!", controller.home());
    }
}
