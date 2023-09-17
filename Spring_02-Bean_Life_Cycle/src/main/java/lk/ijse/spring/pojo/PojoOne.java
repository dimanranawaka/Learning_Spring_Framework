package lk.ijse.spring.pojo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements BeanNameAware {
    public PojoOne() {
        System.out.println("PojoOne : Instantiated");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("PojoOne : Bean Name Awareness");
    }

}
