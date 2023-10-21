package lk.ijse.spring.repo;

import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.entity.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
@WebAppConfiguration // Create testing context
@ContextConfiguration(classes = {WebRootConfig.class}) // Load the configurations which wanted for test context
@ExtendWith(SpringExtension.class) // We have to use Jupiter with Spring Test as a vendor
@Transactional // This will make sure test Item will not save to the db and also is it functional
class ItemRepoTest {
    @Autowired
    ItemRepo repo;
    @Test
    public void getAllItems(){
        List<Item> all = repo.findAll();
        for (Item item : all) {
            System.out.println(item.toString());
        }
    }
    @Test
    public void addItem(){
        Item item = new Item("I004", "MK14", 60, new BigDecimal(50000));
        repo.save(item);
    }

    @Test
    public void queryMethodOne(){
        Item byQtyOnHand = repo.findByQtyOnHand(60);
        System.out.println(byQtyOnHand.toString());
    }
    @Test
    public void queryMethodTwo(){
        Item byQtyOnHandAndUnitPrice = repo.findByQtyOnHandAndUnitPrice(60, new BigDecimal(50000));
        System.out.println(byQtyOnHandAndUnitPrice.toString());
    }
    @Test
    public void queryMethodThree(){
        List<Item> allItems = repo.getAll_Items();

        for (Item allItem : allItems) {
            System.out.println(allItem.toString());
        }
    }
}