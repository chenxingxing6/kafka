package com.example.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    /**
     * 配置kafka系统组件
     */
    @Autowired
    KafkaAdmin kafkaAdmin;

    /**
     * kafkaTemplate 发送消息Template
     */
    @Autowired
    KafkaTemplate kafkaTemplate;

    /**
     * 发送消息
     */
    @RequestMapping("/send")
    public String  sendMessage(){
        for (int i = 0; i <10000 ; i++) {
            kafkaTemplate.send("lxh-topic","send test - msg:" + i);
        }
        return "success";
    }

}
