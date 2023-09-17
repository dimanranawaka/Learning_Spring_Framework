package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Boy {
    public Boy() {
        System.out.println("Boy : Instantiated");
    }
    public void chatWithGirl(){
        Girl girl = new Girl();
        girl.chat();
    }
}
