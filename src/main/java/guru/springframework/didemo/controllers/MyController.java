package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService grettingService;

    public MyController(GreetingService grettingService) {
        this.grettingService = grettingService;
    }

    public String hello() {
        System.out.println("hello - from MyController");
        return grettingService.sayGreeting();
    }
}
