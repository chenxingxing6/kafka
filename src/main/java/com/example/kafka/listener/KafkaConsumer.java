package com.example.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    /**
     * 接收kafka消息 可接收多个topic消息
     * @param message
     */
    @KafkaListener(topics = {"lxh-topic"})
    public void receiveMessage(String message){
        System.out.println("--------开始接收消息--------");
        System.out.println("        接收消息 ："+message);
        System.out.println("--------结束接收消息--------");
    }
}
