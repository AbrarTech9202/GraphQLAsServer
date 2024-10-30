package com.graph.resource;

import com.graph.entity.Orders;
import com.graph.service.IOrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class OrdersController {

    private final IOrdersService ordersService;

    @MutationMapping
    public Orders createOrders(@Argument String orderDetails, @Argument String address, @Argument int price) {
        Orders orders = new Orders();
        orders.setOrderDetails(orderDetails);
        orders.setAddress(address);
        orders.setPrice(price);
        return ordersService.createOrders(orders);
    }

    @QueryMapping
    public List<Orders> getOrdersByAddress(@Argument String address) {
        return ordersService.getOrdersByAddress(address);
    }

    @QueryMapping
    public List<Orders> getAllOrders() {
        return ordersService.getAllOrders();
    }

    @MutationMapping
    public Orders updateOrders(@Argument int orderId, @Argument String address) {
        return ordersService.updateOrders(orderId, address);
    }
}
