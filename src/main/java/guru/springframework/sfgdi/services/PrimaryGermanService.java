package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
@Profile("DE")
@Service
@Primary
public class PrimaryGermanService implements GreetingService {

    public GreetingRepository greetingRepository;

    public PrimaryGermanService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hallo Welt - DE";
    }
}
