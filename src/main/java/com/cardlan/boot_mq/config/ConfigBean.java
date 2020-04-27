package com.cardlan.boot_mq.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Topic;

@Configuration
@EnableJms
public class ConfigBean {

//    @Value("${myqueue}")
//    private String myQueue;
//
//
//    @Bean
//    public Queue queue(){
//        return new  ActiveMQQueue(myQueue);
//    }

//    ————————————————————————————————

    @Value("${mytopic}")
    private String topicName;

    @Bean
    public Topic topic(){
        return new ActiveMQTopic(topicName);
    }
}
