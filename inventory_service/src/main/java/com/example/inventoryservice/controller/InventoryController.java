package com.example.inventoryservice.controller;


import com.example.inventoryservice.repository.InventoryRepository;
import com.example.inventoryservice.service.InventoryService;
import dto.InventoryResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Slf4j
public class InventoryController {


    private final InventoryService inventoryService;
    private final InventoryRepository inventoryRepository;

//    @GetMapping("/{sku-code}")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
//    public boolean isInStock(@PathVariable("sku-code") String skuCode){
//        return inventoryService.isInStock(skuCode);
//    }
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        log.info("Checking stock for product with skucode - " + skuCode);
//        return inventoryRepository.findBySkuCode(skuCode).isPresent();
        return inventoryService.isInStock(skuCode);
    }

}
