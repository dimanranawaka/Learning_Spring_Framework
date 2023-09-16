package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {

        // Creating Container
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        // Registering the config file to the container
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.close();
    }
}
