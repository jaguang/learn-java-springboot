package id.mandiri.day1.induction.be.config;

import id.mandiri.day1.induction.be.service.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Value("Hello")
    public String greeting;

    @Bean
    public GreetingService greetingService() {
        return new GreetingService("Hi");
    }

    @Bean
    public TimeService timeService() {
        return new TimeService(false);
    }

    @Bean
    public OutputService outputService() {
        return new OutputService(greetingService(),timeService());
    }

    @Bean
    public CatService catService() {
        return new CatService("angora",5000,2);
    }

    @Bean
    public FishService fishService() {
        return new FishService("Piranha", 200,10);
    }

    @Bean
    public TotalAnimalService totalAnimalService() {
        return  new TotalAnimalService(catService(),fishService());
    }
}
