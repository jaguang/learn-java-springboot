package id.mandiri.day1.induction.be;

import id.mandiri.day1.induction.be.service.ApplicationConfig;
import id.mandiri.day1.induction.be.service.GreetingService;
import id.mandiri.day1.induction.be.service.OutputService;
import id.mandiri.day1.induction.be.service.TimeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) throws Exception {
//        GreetingService greetingService = new GreetingService("Hello");
//        TimeService timeService = new TimeService(true);
//        OutputService outputService = new OutputService(greetingService, timeService);

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = context.getBean(OutputService.class);
        GreetingService greetingService = context.getBean(GreetingService.class);

        for (int i=0;i<5;i++){
            outputService.generateOutput("Frank");
            System.out.println(greetingService.getGreeting("bangsat"));
            Thread.sleep(5000);
        }
    }
}
