package pl.edu.wat.wcy.prz.projektv01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wat.wcy.prz.projektv01.controller.DTO.OrderDTO;
import pl.edu.wat.wcy.prz.projektv01.model.entity.OrderEntity;
import pl.edu.wat.wcy.prz.projektv01.model.entity.PartEntity;
import pl.edu.wat.wcy.prz.projektv01.model.repository.OrderRepository;
import pl.edu.wat.wcy.prz.projektv01.model.repository.PartRepository;

import java.util.*;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private PartRepository partRepository;

    public OrderEntity createOrder(OrderDTO dto){

        if (dto.getParts().size() <= 0){
            throw new NullPointerException("Can't create order without parts!");
        }

        List<String> parts = dto.getParts();
        Date date = dto.getDate();


        List<PartEntity> orderedParts = new ArrayList<PartEntity>();
        for (String part : parts){
            orderedParts.add(partRepository.findByName(part));
        }

        OrderEntity orderEntity = new OrderEntity();

        orderEntity.setParts(orderedParts);
        orderEntity.setDate(date);

        return orderRepository.save(orderEntity);
    }

    public List<OrderEntity> listAllOrders(){
        return orderRepository.findAll();
    }

    public List<OrderEntity> listAllByDate(OrderDTO dto){
        return orderRepository.findAllByDate(dto.getDate());
    }

}
