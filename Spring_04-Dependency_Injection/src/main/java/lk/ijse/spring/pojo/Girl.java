package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Girl implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Girl() {
        System.out.println("Girl : Instantiated");
    }
    public void chat(){
        System.out.println("Hi, Handsome!");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Girl : Bean Factory Awareness");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Girl : Bean Name Awareness");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Girl : Destroyed!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Girl : Initializing the bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Girl : Application Context Awareness");
    }
}
