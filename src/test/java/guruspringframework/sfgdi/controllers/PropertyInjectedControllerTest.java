package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//Test by properties - not the recommended method
class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    //Command + N - setup method
    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();
    }

    //Green arrow on the left to run the test
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}