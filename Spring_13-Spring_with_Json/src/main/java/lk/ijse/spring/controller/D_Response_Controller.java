package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/response")
public class D_Response_Controller {

    // So how to send back data with JSON
    // In Java EE we use Json Processing in there ?

    // ResponseUtil
    // @ResponseStatus(HttpStatus.CREATED)

    @GetMapping
    public List<CustomerDTO> sendJsonData(){

        ArrayList<CustomerDTO> allCustomers = new ArrayList<>();

        allCustomers.add(new CustomerDTO("C001","Diman","Galle",10000.00,"0772868308",null));
        allCustomers.add(new CustomerDTO("C002","Dasun","Matara",50000.00,"123",null));
        allCustomers.add(new CustomerDTO("C003","Ranawaka","Akuressa",60000.00,"1456",null));
        allCustomers.add(new CustomerDTO("C004","Dreed","Galle",70000.00,"125",null));

        return allCustomers;
    }

    @PutMapping
    public CustomerDTO sameFrontEndDataAsResponse(@RequestBody CustomerDTO dto){
        return dto;
    }
}
