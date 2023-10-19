package lk.ijse.spring.controller;

import lk.ijse.spring.repo.ItemDAO;
import lk.ijse.spring.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemDAO itemDAO;

    @PostMapping
    public String addItem(Item dao){
        itemDAO.save(dao);
        return "Item Successfully Added!";
    }

    @DeleteMapping
    public String deleteItem(){
        itemDAO.deleteById("I001");
        return "Item deleted Successfully";
    }

    @GetMapping
    public List<Item> getAllItem(){
        return itemDAO.findAll();
    }
    @GetMapping(params = {"code"})
    public Item searchItem(String code){
       return itemDAO.findById(code).get();
    }
}
