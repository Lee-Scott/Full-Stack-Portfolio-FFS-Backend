package com.familyfirstsoftware.Spring.Portfolio.Backend.ecommerce.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

    // @Data makes will pass final fields in as contractor automatically
    /*public PurchaseResponse(String orderTrackingNumber){
        this.orderTrackingNumber = orderTrackingNumber;
    }*/

    private final String orderTrackingNumber;
}
