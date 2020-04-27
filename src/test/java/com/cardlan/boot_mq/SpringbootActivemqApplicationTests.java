package com.cardlan.boot_mq;

import com.cardlan.boot_mq.produce.Queue_Produce;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//(classes = SpringbootActivemqApplication.class)
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
class SpringbootActivemqApplicationTests {


    @Autowired
    private Queue_Produce queue_produce;

    @Test
    public void testSend() {
        queue_produce.produceMsg();
    }

}
