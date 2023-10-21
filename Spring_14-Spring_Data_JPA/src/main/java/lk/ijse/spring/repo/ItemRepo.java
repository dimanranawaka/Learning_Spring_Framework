package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;


public interface ItemRepo extends JpaRepository<Item,String> {
    Item findByQtyOnHand(int number);

    Item findByQtyOnHandAndUnitPrice(int number, BigDecimal number2);

    @Query(value = "select * from Item",nativeQuery = true)
    List<Item> getAll_Items();
}
