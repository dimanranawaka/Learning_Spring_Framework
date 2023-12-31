package lk.ijse.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

@Component
public class A implements DI{
    /*@Autowired*/
    SuperB superB; // Property Injection
    //Constructor Injection
    /*@Autowired*/
    public A(SuperB superB) {

        //Constructor Injection : If some Dependency is injecting through constructor it is called "Constructor Injection"
//        this.superB = superB;
        System.out.println("A : Instantiated");
    }
    // Setter Method Injection
    /*@Autowired*/
    public void setInjection(SuperB superB){
        /*this.superB = superB;*/
    }
    public void test(){
        superB.methodUseByA();
    }

    /* Interface through Injections */
    @Autowired
    @Override
    public void inject(SuperB superB) {
        this.superB = superB;
    }
}
