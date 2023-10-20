package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepo itemRepo;
    @Autowired
    ModelMapper mapper;

    public ItemServiceImpl() {
        System.out.println("ItemServiceImpl : Instantiated");
    }

    @Override
    public void addItem(ItemDTO dto) {
        if (itemRepo.existsById(dto.getCode())) {
            throw new RuntimeException(dto.getCode()+" is already exists please insert new Item");
        }
        Item item = mapper.map(dto, Item.class);
        itemRepo.save(item);
    }

    @Override
    public void deleteItem(String id) {
        if (!itemRepo.existsById(id)){
            throw new RuntimeException(id+" is already exists deleted or not available!");
        }
        itemRepo.deleteById(id);
    }

    @Override
    public List<Item> getAllItem() {
        List<Item> all = itemRepo.findAll();
        return mapper.map(all,new TypeToken<List<Item>>(){}.getType());
    }

    @Override
    public ItemDTO searchItem(String code) {
        if (!itemRepo.existsById(code)) {
            throw new RuntimeException(code+" is not exists!");
        }
        Item item = itemRepo.findById(code).get();
        return mapper.map(item,ItemDTO.class);
    }

    @Override
    public void updateItem(ItemDTO dto) {
        if (!itemRepo.existsById(dto.getCode())) {
            throw new RuntimeException(dto.getCode()+" is not exists. Please insert correct Item Code!");
        }

        Item item = mapper.map(dto, Item.class);
        itemRepo.save(item);
    }
}
