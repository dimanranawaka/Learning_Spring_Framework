package lk.ijse.spring.service;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;

import java.util.List;

public interface ItemService {
    String addItem(ItemDTO dto);

    String deleteItem(String id);

    List<Item> getAllItem();

    ItemDTO searchItem(String code);
}
