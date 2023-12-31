package com.familyfirstsoftware.Spring.Portfolio.Backend.ecommerce.controller;

import com.familyfirstsoftware.Spring.Portfolio.Backend.ecommerce.dto.Purchase;
import com.familyfirstsoftware.Spring.Portfolio.Backend.ecommerce.dto.PurchaseResponse;
import com.familyfirstsoftware.Spring.Portfolio.Backend.ecommerce.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    // @Autowired spring does automatically because we only have one constructor

    @Autowired
    public CheckoutController(CheckoutService checkoutService){
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }
}
