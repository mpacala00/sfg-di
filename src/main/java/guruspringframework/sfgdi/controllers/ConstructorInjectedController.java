package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//when setting up the test select the SetUp tickbox
@Controller
public class ConstructorInjectedController {
    //it is private and final
    //@Autowired - optional for this type of injection
    private final GreetingService greetingService;

    //Using qualifier so Spring knows what service to inject
    //Has to be lower case, that is a bean in this case
    public ConstructorInjectedController( @Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
