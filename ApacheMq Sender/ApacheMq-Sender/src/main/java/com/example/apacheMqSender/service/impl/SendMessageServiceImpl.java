package com.example.apacheMqSender.service.impl;

import com.example.apacheMqSender.service.SendMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SendMessageServiceImpl implements SendMessageService {
    private final JmsTemplate jmsTemplate;
    private static String QUEUE_NAME = "learning";

    @Override
    public void sendMessage(String message) {
        jmsTemplate.convertAndSend(QUEUE_NAME, message);
        System.out.println("Sent to Queue: " + message);
    }
}
