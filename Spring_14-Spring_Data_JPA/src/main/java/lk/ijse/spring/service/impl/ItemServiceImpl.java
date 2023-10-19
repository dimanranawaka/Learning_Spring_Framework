package lk.ijse.spring.service.impl;

import lk.ijse.spring.service.ItemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    public ItemServiceImpl() {
        System.out.println("ItemServiceImpl : Instantiated");
    }
}
