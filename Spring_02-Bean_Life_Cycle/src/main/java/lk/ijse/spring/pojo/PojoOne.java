package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements BeanNameAware, BeanFactoryAware {
    public PojoOne() {
        System.out.println("PojoOne : Instantiated");
    }
    // Set the bean name
    @Override
    public void setBeanName(String name) {
        System.out.println("PojoOne : Bean Name Awareness : "+name);
    }
    // Set Dependency Features
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoOne : Bean Factory Awareness : "+beanFactory);
    }

}
