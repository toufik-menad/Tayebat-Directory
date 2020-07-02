/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.controllers;

import java.util.List;

import com.services.ProductSearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import core.com.entities.jpaentities.ProductEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author T.Menad
 */
@RestController
@RequestMapping(value = "products", produces="application/json")
@Api(tags="Products", consumes="application/json", produces="application/json")
public class ProductEntityController {
    
    
    @Autowired
    private ProductSearchService<ProductEntity> productSearchService;
    
    
    @PostMapping("/getProductByBarCode")
    @ApiOperation(value="Gets a product by its barcode.")
    public @ResponseBody ResponseEntity<List<ProductEntity>> getProductByBarCode(@RequestParam(name = "barCode")final String barCode){
        return ResponseEntity.ok(this.productSearchService.searchProductByBarCode(barCode));
    }
    
    @PostMapping("/getClassification")
    @ApiOperation(value="Gets a product by its barcode.")
    public @ResponseBody ResponseEntity<List<ProductEntity>> getClassification(@RequestParam(name = "barCode")final String barCode){
        return ResponseEntity.ok(this.productSearchService.searchIngredientByProduct(barCode));
    }

}
