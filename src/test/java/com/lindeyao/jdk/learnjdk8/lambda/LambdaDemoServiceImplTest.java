package com.lindeyao.jdk.learnjdk8.lambda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LambdaDemoServiceImplTest {

    @Autowired
    LambdaDemoService lambdaDemoService;

    @Test
    public void lambdaDemo() {
        lambdaDemoService.LambdaDemo();
    }

    @Test
    public void clockDemo() {
        lambdaDemoService.clockDemo();
    }

    @Test
    public void base64Demo() {
        lambdaDemoService.base64Demo();
    }

    @Test
    public void streamDemo() { lambdaDemoService.streamDemo(); }
}