package com.example.apacheMqSender.controller;

import com.example.apacheMqSender.service.SendMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sender")
@RequiredArgsConstructor
public class SenderController {
    private final SendMessageService sendMessageService;

    @GetMapping("queue/send-message")
    public void sendMessage(@RequestParam("message") String message) {
        System.out.println("MESSAGE IS " + message);
        sendMessageService.sendMessage(message);
    }
}
