package com.example.apacheMqReceiver.service.impl;

import com.example.apacheMqReceiver.service.MessageReceiver;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiverImpl implements MessageReceiver {
    @Override
    @JmsListener(destination = "learning")
    public void receiveMessage(String message) {
        System.out.println(message);
    }
}
