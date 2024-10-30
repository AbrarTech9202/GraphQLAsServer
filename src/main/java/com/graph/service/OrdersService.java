package com.graph.service;

import com.graph.entity.Orders;
import com.graph.repo.OrdersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdersService implements IOrdersService {

    private final OrdersRepository ordersRepository;

    @Override
    public Orders createOrders(Orders orders) {
        return ordersRepository.save(orders) ;
    }

    @Override
    public List<Orders> getOrdersByAddress(String address) {
        return ordersRepository.getOrdersByAddress(address);
    }

    @Override
    public List<Orders> getAllOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public Orders updateOrders(int orderId, String address) {
        Orders orders = ordersRepository.findById(orderId).orElseThrow(() -> new RuntimeException("orderId not found in db" + orderId));
        orders.setAddress(address);
         return ordersRepository.save(orders);
    }
}
