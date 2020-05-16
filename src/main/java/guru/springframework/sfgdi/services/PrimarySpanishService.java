package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
@Profile("ES")
@Service
@Primary
public class PrimarySpanishService implements GreetingService {

    public GreetingRepository greetingRepository;

    public PrimarySpanishService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
