package guruspringframework.sfgdi;

import guruspringframework.sfgdi.controllers.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		//SpringApplication.run(SfgDiApplication.class, args);
		//a way to get a handle of the spring app context
		ApplicationContext ctx = run(SfgDiApplication.class, args);

		I18NController i18NController = (I18NController) ctx.getBean("i18NController");
		System.out.println(i18NController.sayHello());


		//beans are named after classes but begin with a lower case
		//You have to cast otherwise it returns object type
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("primary bean");
		System.out.println(myController.sayHello());

		System.out.println("property");

		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		/* This wont work because of 2 things:
		 * propertyInjectedController is not annotated as Controller,
		 * there is a NullPointerException being thrown because
		 * GreetingServiceImpl does not have @Service annotation
		 * Also, greetingService in this particular controller need to be @Autowired
		 * it means an instance of greetingService will be injected
		 */

		System.out.println("setter");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		//Same thing again here - 2 annotations added, @Autowired and @Controller

		System.out.println("constructor");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		//Situation here is a litte different: @Autowired is OPTIONAL
	}

}
