package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware , InitializingBean , DisposableBean {
    public PojoOne() {
        System.out.println("PojoOne : Instantiated");
    }
    // Set the Bean name
    @Override
    public void setBeanName(String name) {
        System.out.println("PojoOne : Bean Name Awareness : "+name);
    }
    // Set Dependency Features
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoOne : Bean Factory Awareness");
    }
    // AOP , Declarative Programming
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoOne : Application Context Awareness");
    }
    // Bean is Full Ready
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoOne : Initializing Bean");
    }
    // Disposable Bean
    @Override
    public void destroy() throws Exception {
        System.out.println("PojoOne : Destroyed!");
    }
}
