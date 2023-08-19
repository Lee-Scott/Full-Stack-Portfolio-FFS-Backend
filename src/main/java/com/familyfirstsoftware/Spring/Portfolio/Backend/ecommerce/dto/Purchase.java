package com.familyfirstsoftware.Spring.Portfolio.Backend.ecommerce.dto;

import com.familyfirstsoftware.Spring.Portfolio.Backend.ecommerce.entity.Address;
import com.familyfirstsoftware.Spring.Portfolio.Backend.ecommerce.entity.Customer;
import com.familyfirstsoftware.Spring.Portfolio.Backend.ecommerce.entity.Order;
import com.familyfirstsoftware.Spring.Portfolio.Backend.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
