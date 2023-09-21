package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Item {
    // This is wrong , Cause this value is assign before the Initializing Bean(Before the object create)
    @Value("IJSE")
    private String name;
    public Item() {
        System.out.println("Item : Instantiated");
        System.out.println(name);
    }

}
