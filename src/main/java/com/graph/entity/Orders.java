package com.graph.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    private String orderDetails;

    @Column(name = "Oder_address")
    private String address;

    @Column(name = "Oder_price")
    private int price;

    @ManyToOne
    private User user;
}
