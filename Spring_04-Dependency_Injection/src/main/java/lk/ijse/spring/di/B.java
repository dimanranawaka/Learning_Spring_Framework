package lk.ijse.spring.di;

import org.springframework.stereotype.Component;

@Component
public class B implements SuperB{
    public B() {
        System.out.println("B : Instantiated");
    }
    @Override
    public void methodUseByA(){

        System.out.println("Method that invoke by A");

    }
}
