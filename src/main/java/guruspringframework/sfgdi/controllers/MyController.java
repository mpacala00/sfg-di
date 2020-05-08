package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    //no need to use qualifier, it will use the primary bean
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.sayGreeting();
    }
}
