package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.PojoOne;
import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(AppConfig.class);
        context.refresh();

        /* Disposable Beans state only works when container closing */

        // context.close();
        // context.registerShutdownHook();

        // PojoOne bean = context.getBean(PojoOne.class);

        // System.out.println(bean);

        PojoTwo bean = context.getBean(PojoTwo.class);

        System.out.println(bean);

        context.registerShutdownHook();
    }
}
