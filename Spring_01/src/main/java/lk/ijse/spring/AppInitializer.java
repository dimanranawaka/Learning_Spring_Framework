package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.BasicDataSource;
import lk.ijse.spring.pojo.Customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {

        // Creating Container
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        // Registering the config file to the container
        ctx.register(AppConfig.class);

        ctx.refresh();

        // Context Invocation

        Customer c1 = ctx.getBean(Customer.class);
        Customer c2 = ctx.getBean(Customer.class);

        BasicDataSource basicDataSource = ctx.getBean(BasicDataSource.class);



        /* These are singleton typed object : Because we received same reference twice */

        c1.getCustomerName();
        System.out.println(c1);

        c2.getCustomerName();
        System.out.println(c2);

        basicDataSource.getName();


        // Hooking Processes

        /*Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                ctx.close();
                System.out.println("Context is closed!");
            }
        }));*/

        ctx.registerShutdownHook();

        // Context Invocation : Using Bean ID

        // Customer -> customer (beanID) get the class name and then convert the first letter into simple letter

        Customer customer = (Customer) ctx.getBean("customer");

        System.out.println(customer);

        Customer bean = ctx.getBean(Customer.class);

        bean.getCustomerName();


    }
}
