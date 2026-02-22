package com.example.SpringEcom.model.dto;

import java.math.BigDecimal;

public record OrderItemResponse(
        String productName,
        int price,
        BigDecimal totalPrice
) { }
