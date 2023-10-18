package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
public class E_Customer_Controller {
    @PostMapping
    public ResponseUtil addCustomer(@RequestBody CustomerDTO dto){
        return new ResponseUtil("Ok","Successfully Added",dto);
    }
    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(@RequestParam String id){
        return new ResponseUtil("Ok","Successfully Deleted",id);
    }
    @GetMapping(params = "id")
    public ResponseUtil searchCustomer(@RequestParam String id){
        CustomerDTO customer = new CustomerDTO("C001", "Diman", "Matara", 10000.00, "0772868308", null);
        return new ResponseUtil("Ok","Successfully Searched",customer+" "+id);
    }
    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO dto){
        return new ResponseUtil("Ok","Successfully Updated",dto);
    }
    @GetMapping
    public ResponseUtil getAllCustomers(){

        ArrayList<CustomerDTO> allCustomers = new ArrayList<>();

        allCustomers.add(new CustomerDTO("C001","Diman","Galle",10000.00,"0772868308",null));
        allCustomers.add(new CustomerDTO("C002","Dasun","Matara",50000.00,"123",null));
        allCustomers.add(new CustomerDTO("C003","Ranawaka","Akuressa",60000.00,"1456",null));
        allCustomers.add(new CustomerDTO("C004","Dreed","Galle",70000.00,"125",null));

        return new ResponseUtil("Ok","Successfully Loaded",allCustomers);
    }
}
