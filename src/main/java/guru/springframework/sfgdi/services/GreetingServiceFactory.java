package guru.springframework.sfgdi.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {

        switch (lang) {
            case "EN":
                return new PrimaryGreetingService(greetingRepository);
            case "ES":
                return new PrimarySpanishService(greetingRepository);
            case "DE":
                return new PrimaryGermanService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
