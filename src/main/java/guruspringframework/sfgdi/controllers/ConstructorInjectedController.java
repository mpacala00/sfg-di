package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.GreetingService;

//when setting up the test select the SetUp tickbox
public class ConstructorInjectedController {
    //it is private and final
    private final GreetingService greetingService;

    //needs constructor to be set
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
