package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/form")
public class B_X_WWW_Url_Encoded_Controller {

    // 02 X-WWW-Form-Url-Encoded
    // How to access above type data from Spring
    // @Model Attribute

    // This will catch x-www-form-url-encoded data without any issue
    @PostMapping
    public String receiveDataWithFormData(String id, String name,String address){
        return "X-WWW-Form-URL-Encoded-Data : "+id+" "+name+" "+address;
    }
}
