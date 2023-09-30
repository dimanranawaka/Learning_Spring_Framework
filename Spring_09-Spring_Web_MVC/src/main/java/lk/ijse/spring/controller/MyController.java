package lk.ijse.spring.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public MyController() {
        System.out.println("MyController : Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyController : Bean Factory Aware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("MyController : Bean Name Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyController : Destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyController : Initializing");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyController : Application Context Aware");
    }
}
