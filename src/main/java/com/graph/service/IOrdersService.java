package com.graph.service;

import com.graph.entity.Orders;

import java.util.List;

public interface IOrdersService {

    public Orders createOrders(Orders orders);

    public List<Orders> getOrdersByAddress(String address);

    public List<Orders> getAllOrders();

    public Orders updateOrders(int orderId, String address);

}
