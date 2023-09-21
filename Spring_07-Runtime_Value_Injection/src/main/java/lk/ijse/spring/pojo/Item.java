package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Item implements InitializingBean {

    @Value("IJSE")
    private String name;
    public Item() {
        System.out.println("Item : Instantiated");
        // This is wrong , Cause this value("IJSE") is assign before the Initializing Bean (Before the object create)
        //System.out.println(name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
    }
}
