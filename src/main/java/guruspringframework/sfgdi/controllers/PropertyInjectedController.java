package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.GreetingService;

//Option + Enter - create test
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
