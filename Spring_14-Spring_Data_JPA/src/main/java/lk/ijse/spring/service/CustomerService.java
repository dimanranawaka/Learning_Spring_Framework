package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface CustomerService {
     void addCustomer(CustomerDTO customerDTO);
     String deleteCustomer(String id);
     List<CustomerDTO> getAllCustomer();
     CustomerDTO searchCustomer(String id);
     void updateCustomer(CustomerDTO c);
}
