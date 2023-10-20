package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.OrderDTO;
import lk.ijse.spring.entity.Orders;
import lk.ijse.spring.repo.OrderDetailsRepo;
import lk.ijse.spring.repo.OrdersRepo;
import lk.ijse.spring.service.PurchaseOrdersService;
import lk.ijse.spring.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PurchaseOrdersServiceImpl implements PurchaseOrdersService {
    @Autowired
    OrdersRepo ordersRepo;
    @Autowired
    OrderDetailsRepo orderDetailsRepo;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public void purchaseOrder(OrderDTO orderDTO) {

        if (ordersRepo.existsById(orderDTO.getOid())) {
            throw new RuntimeException(orderDTO.getOid()+" Is already available");
        }
        Orders map = modelMapper.map(orderDTO, Orders.class);
        ordersRepo.save(map);

        // Add Order details also

    }
}
