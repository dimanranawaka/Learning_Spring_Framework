package lk.ijse.spring;


import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);

        ctx.refresh();

        ctx.registerShutdownHook();

        Boy boy = ctx.getBean(Boy.class);

        boy.chatWithGirl();

        /*Boy : Instantiated : Created By the Container
        Girl : Instantiated  : Created by the Container
        Girl : Instantiated  : Created by me inside chatWithGirl() method
        Hi, Handsome!*/

        // After , using @Autowired Annotation

        /*Boy : Instantiated
        Girl : Instantiated
        Hi, Handsome!*/
    }
}
