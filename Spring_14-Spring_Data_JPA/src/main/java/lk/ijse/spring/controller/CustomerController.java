package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @PostMapping
    public ResponseUtil addCustomer(CustomerDTO dto){
        customerService.addCustomer(dto);
        return new ResponseUtil("Ok","Successfully Added",dto);
    }
    @GetMapping
    public ResponseUtil getAllCustomers(){
        List<CustomerDTO> allCustomer = customerService.getAllCustomer();
        return new ResponseUtil("Ok","Successfully Got them",allCustomer);
    }
    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO dto){
        customerService.updateCustomer(dto);
        return new ResponseUtil("Ok","Successfully Updated",dto);
    }
    @DeleteMapping
    public ResponseUtil deleteCustomer(String id){
        customerService.deleteCustomer(id);
        return new ResponseUtil("Ok","Successfully Deleted",id);
    }
    @GetMapping(params = "id")
    public ResponseUtil searchCustomer(String id){
        CustomerDTO customerDTO = customerService.searchCustomer(id);
        return new ResponseUtil("Ok","Found It",customerDTO);
    }
}
