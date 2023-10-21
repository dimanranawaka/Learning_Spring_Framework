package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,String> {
    Customer findCustomerByAddress(String address);

    Customer findByAddressAndName(String address,String name);
}
