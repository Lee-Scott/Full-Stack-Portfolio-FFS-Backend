package com.familyfirstsoftware.Spring.Portfolio.Backend.ecommerce.service;

import com.familyfirstsoftware.Spring.Portfolio.Backend.ecommerce.dto.Purchase;
import com.familyfirstsoftware.Spring.Portfolio.Backend.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}

