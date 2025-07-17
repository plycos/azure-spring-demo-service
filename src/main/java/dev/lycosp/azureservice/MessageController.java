package dev.lycosp.azureservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/message")
public class MessageController {
    @GetMapping
    public Message message() {
        Random r = new Random();
        int num = r.nextInt(10000);
        return new Message(num, "Hello World!!!");
    }
}

