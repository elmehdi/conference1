import org.diskdor.repository.HibernateSpeakerRepositoryImpl;
import org.diskdor.repository.SpeakerRepository;
import org.diskdor.service.SpeakerService;
import org.diskdor.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import util.CalendarFactory;

import java.util.Calendar;

// the bean is a singleton
@Configuration // like a register
@ComponentScan({"org.diskdor"}) //path from where start scanning for beans for autowired
// Scans the @Repository/@Service and consider them as beans
public class AppConfig { // this is what we need to start bootstrapping our application
    @Bean(name = "cal")
    public CalendarFactory calfactory(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calfactory().getObject();
    }
    /*
    @Bean(name = "speakerService") // the name is optional  - registry
    @Scope(value = BeanDefinition.SCOPE_SINGLETON) // optional because the singleton is the default scope
    public SpeakerService getSpeakerService(){
     //   SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository()); // Constructor Injection
        SpeakerServiceImpl service = new SpeakerServiceImpl(); // Automatically inject that speakerRepository bean into the setter that has @Autowired
**
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setRepository(getSpeakerRepository()); -- Setter Injection
**
        return service;
    }


    // WE CHANGED OUR REPOSITORY TO BE INJECTED THROUGH SETTER INJECTION INTO OUR SPEAKER SERVICE
    // the following Bean ga3ma kan, zednah fach zedna setter f service
    @Bean(name = "speakerRepository") // names will be useful while auto wiring
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }

     */
}