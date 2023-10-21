package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;


public interface ItemRepo extends JpaRepository<Item,String> {
    Item findByQtyOnHand(int number);

    Item findByQtyOnHandAndUnitPrice(int number, BigDecimal number2);
}
