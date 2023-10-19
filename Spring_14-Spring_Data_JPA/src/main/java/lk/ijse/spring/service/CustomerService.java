package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import java.util.List;

public interface CustomerService {
     void addCustomer(CustomerDTO customerDTO);
     void deleteCustomer(String id);
     List<CustomerDTO> getAllCustomer();
     CustomerDTO searchCustomer(String id);
     void updateCustomer(CustomerDTO c);
}
