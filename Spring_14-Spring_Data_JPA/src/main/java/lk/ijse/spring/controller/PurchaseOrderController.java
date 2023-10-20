package lk.ijse.spring.controller;

import lk.ijse.spring.dto.OrderDTO;
import lk.ijse.spring.service.PurchaseOrdersService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchase")
@CrossOrigin
public class PurchaseOrderController {

    // Order Table
    // Order Details One or More

    @Autowired
    PurchaseOrdersService purchaseOrdersService;
    @PostMapping
    public ResponseUtil purchaseOrder(@RequestBody OrderDTO orderDTO){
        purchaseOrdersService.purchaseOrder(orderDTO);
        return new ResponseUtil("Ok","Successfully Purchased",orderDTO);
    }
}
