package guruspringframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//using profiles - check aplication properties
@Profile("EN")
//service qualifier
@Service("i18NService")
public class i18NEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World! - EN";
    }
}
