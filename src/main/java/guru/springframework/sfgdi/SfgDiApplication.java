package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//this annotataion scans the components in the sfgdi directory (package where this class is placed)
//ComponentScan works on the whole package tree - the package we specified and all of the packages included
//@ComponentScan(basePackages = {"guru.springframework.packageName"}) - an example
//When doing that it is important to tell Spring about all directories, even those which were default previously
//Classes can also be used instead of packages
@ComponentScan(basePackages = {"guru.springframework.sfgdi"})
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);


		MyController myController = ctx.getBean("myController", MyController.class);

		//depending on profile there will be a different greeting displayed by myController
		System.out.println(myController.hello());

		System.out.println(ctx.getBean(PropertyInjectedController.class).getGreeting());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).getGreeting());
	}

}
