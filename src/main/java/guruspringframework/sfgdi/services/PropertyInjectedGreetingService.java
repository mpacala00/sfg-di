package guruspringframework.sfgdi.services;

import org.springframework.stereotype.Service;

//Cmd + N - implement methods...
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - Property";
    }
}
