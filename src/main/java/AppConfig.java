import org.diskdor.repository.HibernateSpeakerRepositoryImpl;
import org.diskdor.repository.SpeakerRepository;
import org.diskdor.service.SpeakerService;
import org.diskdor.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

// the bean is a singleton
@Configuration // like a register
public class AppConfig { // this is what we need to start bootstrapping our application
    @Bean(name = "speakerService") // the name is optional  - registry
    @Scope(value = BeanDefinition.SCOPE_SINGLETON) // optional because the singleton is the default scope
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository()); // Constructor Injection
/*
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setRepository(getSpeakerRepository()); -- Setter Injection
*/
        return service;
    }

    // WE CHANGED OUR REPOSITORY TO BE INJECTED THROUGH SETTER INJECTION INTO OUR SPEAKER SERVICE
    // the following Bean ga3ma kan, zednah fach zedna setter f service
    @Bean(name = "speakerRepository") // names will be useful while auto wiring
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}