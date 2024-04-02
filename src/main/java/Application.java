import org.diskdor.model.Speaker;
import org.diskdor.service.SpeakerService;
import org.diskdor.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args)
    {
        /*Loading Spring and the configuration files
        * when the line under is run it will create a registry of the beans in it*/
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // SpeakerService service = new SpeakerServiceImpl();

        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class); // this is an instance of the bean

        System.out.println(service);
        System.out.println(service.findAll().get(0).getFirstName()  );

        SpeakerService service1 = applicationContext.getBean("speakerService", SpeakerService.class); // this is another instance of the bean

        System.out.println(service); // to make sure that the address instances are the same - Singleton dayer khdemtou

    }
}
