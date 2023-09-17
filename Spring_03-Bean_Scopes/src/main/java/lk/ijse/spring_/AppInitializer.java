package lk.ijse.spring_;

import lk.ijse.spring_.config.AppConfig;
import lk.ijse.spring_.pojo.PojoOne;
import lk.ijse.spring_.pojo.PojoTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);

        ctx.refresh();

        ctx.registerShutdownHook();

        // Requesting different types of objects using @Scope(used in PojoOne.class)

        PojoOne bean1 = ctx.getBean(PojoOne.class);
        PojoOne bean2 = ctx.getBean(PojoOne.class);

        System.out.println(bean1);
        System.out.println(bean2);

    }
}
