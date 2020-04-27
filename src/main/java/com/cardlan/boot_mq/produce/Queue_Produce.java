package com.cardlan.boot_mq.produce;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;

import javax.jms.Queue;
import java.util.UUID;

//@Component
public class Queue_Produce {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    public void produceMsg(){
        jmsMessagingTemplate.convertAndSend(queue,"*****:"+ UUID.randomUUID().toString().substring(0,6));
    }

    //间隔时间3秒
    @Scheduled(fixedDelay = 3000)
    public void produceMsgScheduled(){
        jmsMessagingTemplate.convertAndSend(queue,"*****队列消息:"+ UUID.randomUUID().toString().substring(0,6));
        System.out.println("produceMsgScheduled send 发送成功");
    }
}
