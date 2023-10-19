package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService service;

    @PostMapping
    public String addItem(ItemDTO dto){
        service.addItem(dto);
        return "Item "+dto.getCode()+"is saved!";
    }
    @GetMapping
    public List<Item> getAllItems(){
        return service.getAllItem();
    }
    @DeleteMapping(params = {"code"})
    public String deleteItem(String code){
        service.deleteItem(code);
        return "Item "+code+" is deleted!";
    }
    @PutMapping()
    public String updateItem(@RequestBody ItemDTO dto){
        service.updateItem(dto);
        return "Item "+dto.getCode()+" is updated!";
    }
}
