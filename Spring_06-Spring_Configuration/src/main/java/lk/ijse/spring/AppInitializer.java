package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.config.ConfigOne;
import lk.ijse.spring.config.ConfigTwo;
import lk.ijse.spring.pojo.PojoOne;
import lk.ijse.spring.pojo.PojoThree;
import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        // First Method : registering all config classes separately

       /* // Configuration Class One
        ctx.register(AppConfig.class);
        ctx.refresh();
        PojoOne pojoOne = ctx.getBean(PojoOne.class);
        System.out.println(pojoOne);

        // Configuration Class Two
        ctx.register(ConfigOne.class);
        PojoTwo pojoTwo = ctx.getBean(PojoTwo.class);
        System.out.println(pojoTwo);

        // Configuration Class Three
        ctx.register(ConfigTwo.class);
        PojoThree pojoThree = ctx.getBean(PojoThree.class);
        System.out.println(pojoThree);*/

        // Second-Method : using @Import Annotation in AppConfig class to import other config classes

        ctx.register(AppConfig.class);
        ctx.refresh();

        ctx.registerShutdownHook();

    }
}
