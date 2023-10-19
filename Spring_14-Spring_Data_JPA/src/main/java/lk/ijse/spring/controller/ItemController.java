package lk.ijse.spring.controller;

import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemRepo itemRepo;

    @PostMapping
    public String addItem(Item dao){
        itemRepo.save(dao);
        return "Item Successfully Added!";
    }

    @DeleteMapping
    public String deleteItem(){
        itemRepo.deleteById("I001");
        return "Item deleted Successfully";
    }

    @GetMapping
    public List<Item> getAllItem(){
        return itemRepo.findAll();
    }
    @GetMapping(params = {"code"})
    public Item searchItem(String code){
       return itemRepo.findById(code).get();
    }
}
