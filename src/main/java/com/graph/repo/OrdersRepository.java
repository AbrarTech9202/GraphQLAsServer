package com.graph.repo;

import com.graph.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    public List<Orders> getOrdersByAddress(String address);
}
