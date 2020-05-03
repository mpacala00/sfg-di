package guruspringframework.sfgdi;

import guruspringframework.sfgdi.controllers.MyController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		//SpringApplication.run(SfgDiApplication.class, args);
		//a way to get a handle of the spring app context
		ApplicationContext ctx = run(SfgDiApplication.class, args);

		//beans are named after classes but begin with a lower case
		//You have to cast otherwise it returns object type
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
