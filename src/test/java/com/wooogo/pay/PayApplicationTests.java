package com.wooogo.pay;

import com.wooogo.pay.pojo.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PayApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testOrder(){
        Order order = new Order();
    }

}

