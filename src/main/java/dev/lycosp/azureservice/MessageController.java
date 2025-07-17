package dev.lycosp.azureservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private RandomNumberRepository repository;

    @GetMapping
    public Message message() {
        Random r = new Random();
        int num = r.nextInt(10000);
        return new Message(num, "Hello World!!!");
    }

    @GetMapping("/random")
    public int getRandomNumber() {
        return repository.getRandomNumberFromDb();
    }
}

