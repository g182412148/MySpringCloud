package com.erlang.amqp;

import com.erlang.amqp.util.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AmqpApplicationTests.class)
@ComponentScan(basePackages = {"com.erlang.amqp"})
public class AmqpApplicationTests {
    @Autowired
    private Sender sender;
    @Test
    public void contextLoads() {
        sender.send();
    }

}
