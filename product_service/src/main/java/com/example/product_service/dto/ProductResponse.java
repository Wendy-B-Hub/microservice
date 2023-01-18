package com.example.product_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ProductResponse {
    @Id   //spring.data, specify this id unique
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
