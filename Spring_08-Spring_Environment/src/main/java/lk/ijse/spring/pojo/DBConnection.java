package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnection implements InitializingBean {
    @Value("${os.name}") // Property Placeholder
    private String myOSName;
    @Value("${user.name}")
    private String userName; // Property Placeholder
    public DBConnection() {
        System.out.println("DBConnection : Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(myOSName);
        System.out.println(userName);
    }
}
