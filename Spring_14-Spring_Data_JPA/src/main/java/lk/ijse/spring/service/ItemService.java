package lk.ijse.spring.service;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;

import java.util.List;

public interface ItemService {
    void addItem(ItemDTO dto);

    void deleteItem(String id);

    List<Item> getAllItem();

    ItemDTO searchItem(String code);

    void updateItem(ItemDTO dto);
}
