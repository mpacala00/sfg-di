package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

//when setting up the test select the SetUp tickbox
@Controller
public class ConstructorInjectedController {
    //it is private and final
    //@Autowired - optional for this type of injection
    private final GreetingService greetingService;

    //needs constructor to be set
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
