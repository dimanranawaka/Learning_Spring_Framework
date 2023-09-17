package lk.ijse.spring_;

import lk.ijse.spring_.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);

        ctx.refresh();

        ctx.registerShutdownHook();

    }
}
