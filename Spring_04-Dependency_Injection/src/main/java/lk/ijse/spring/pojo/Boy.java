package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Boy implements BeanNameAware, BeanFactoryAware , ApplicationContextAware, InitializingBean, DisposableBean {
    @Autowired
    GoodGirl girl;
    public Boy() {
        System.out.println("Boy : Instantiated");
    }
    public void chatWithGirl(){
        // Girl girl = new Girl(); This is wrong in Spring Framework
        girl.chat();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Boy : Bean Factory Awareness");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Boy : Bean Name Awareness");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Boy : Destroyed!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Boy : Initializing Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Boy : Application Context Awareness");
    }
}