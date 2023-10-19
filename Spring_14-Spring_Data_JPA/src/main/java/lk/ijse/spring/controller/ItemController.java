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


}
