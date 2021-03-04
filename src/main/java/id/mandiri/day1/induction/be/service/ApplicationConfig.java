package id.mandiri.day1.induction.be.service;

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
}
