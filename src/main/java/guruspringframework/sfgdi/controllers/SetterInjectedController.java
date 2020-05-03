package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.GreetingService;

//setter based controller - not the recommended method
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
