package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    @Autowired
    GoodGirl girl;
    public Boy() {
        System.out.println("Boy : Instantiated");
    }
    public void chatWithGirl(){
        // Girl girl = new Girl(); This is wrong in Spring Framework
        girl.chat();
    }

}
