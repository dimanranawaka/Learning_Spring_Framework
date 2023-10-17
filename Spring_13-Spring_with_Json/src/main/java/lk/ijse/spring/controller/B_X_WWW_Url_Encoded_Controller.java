package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    @PostMapping(path = "/a")
    public String receiveDataWithFormData1(String id, String name,String address){
        return "X-WWW-Form-URL-Encoded-Data1 : "+id+" "+name+" "+address;
    }

    // If we have more from the front end we can use encapsulate object to fetch
    // the data directly to the object
    // here we can use @ModelAttribute annotation - this is known as a model attribute
    // But is not a required annotation like @RequestParam
    // Supporting data types (Query String & x-www-form-url-encoded)

    @PostMapping(path = "/aa")
    public String receiveDataWithFormData(@ModelAttribute CustomerDTO dto){
        return "X-WWW-Form-URL-Encoded-Data : "+dto.getId()+" "+dto.getName()+" "+dto.getAddress()+" "+dto.getSalary()+
                " "+dto.getTp();
    }

    // OUTPUT - X-WWW-Form-URL-Encoded-Data : C002 Diman Matara 5000000.0 0772868308

    @PostMapping
    public String receiveDataWithFormData2(CustomerDTO dto){
        return "X-WWW-Form-URL-Encoded-Data : "+dto.toString();
    }

    // OUTPUT - X-WWW-Form-URL-Encoded-Data : CustomerDTO(id=C002, name=Diman, address=Matara, salary=5000000.0, tp=0772868308)
}
