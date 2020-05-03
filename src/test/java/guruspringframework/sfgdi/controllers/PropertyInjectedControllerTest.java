package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Test by properties - not the recommended method
class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    //Command + N - setup method
    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImpl();
    }

    //Green arrow on the left to run the test
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}