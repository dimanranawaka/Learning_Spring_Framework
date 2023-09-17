package lk.ijse.spring_.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class PojoTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoTwo() {
        System.out.println("PojoTwo : Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("PojoTwo : Bean Name Awareness : "+name);
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoTwo : Bean Factory Awareness ");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoTwo : Application Context Awareness ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoTwo : Initializing Bean ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoTwo : Destroyed! ");
    }
}
