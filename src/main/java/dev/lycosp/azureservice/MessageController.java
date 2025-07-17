package dev.lycosp.azureservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
    @GetMapping
    public Message message() {
        return new Message("Hello World!!!");
    }
}

