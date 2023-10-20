package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.service.ItemService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {
    @Autowired
    ItemService service;

    @PostMapping
    public ResponseUtil addItem(ItemDTO dto){
        service.addItem(dto);
        return new ResponseUtil("Ok","Found It!",dto);
    }
    @GetMapping
    public ResponseUtil getAllItems(){
        List<Item> allItem = service.getAllItem();
        return new ResponseUtil("Ok","Successfully Loaded All Items",allItem);
    }
    @DeleteMapping(params = {"code"})
    public ResponseUtil deleteItem(String code){
        service.deleteItem(code);
        return new ResponseUtil("Ok","Successfully Deleted",code);
    }
    @PutMapping()
    public ResponseUtil updateItem(@RequestBody ItemDTO dto){
        service.updateItem(dto);
        return new ResponseUtil("Ok","Successfully Updated",dto);
    }
}
