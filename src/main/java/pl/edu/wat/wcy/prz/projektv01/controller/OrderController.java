package pl.edu.wat.wcy.prz.projektv01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.wat.wcy.prz.projektv01.controller.DTO.OrderDTO;
import pl.edu.wat.wcy.prz.projektv01.model.entity.OrderEntity;
import pl.edu.wat.wcy.prz.projektv01.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/create")
    OrderEntity createOrder(OrderDTO orderDTO){
        return orderService.createOrder(orderDTO);
    }

    @GetMapping("/list")
    List<OrderEntity> listAllOrders(){
        return orderService.listAllOrders();
    }

    @GetMapping("/date")
    List<OrderEntity> listAllByDate(OrderDTO dto){
        return orderService.listAllByDate(dto);
    }

}
