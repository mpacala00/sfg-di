package guruspringframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//this simple annotation - @Primary - will select this as the primary bean
//when in doubt, Spring will always inject this one
//for example when there are multiple services
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - PRIMARY bean";
    }
}
