package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(AppConfig.class);
        context.refresh();

        /* Disposable Beans state only works when container closing */

//        context.close();
//        context.registerShutdownHook();

    }
}
