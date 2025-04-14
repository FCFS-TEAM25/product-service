package com.sparta.limited.product_service.presentation.controller;

import com.sparta.limited.product_service.application.dto.request.ProductCreateRequest;
import com.sparta.limited.product_service.application.dto.response.ProductCreateResponse;
import com.sparta.limited.product_service.application.dto.response.ProductReadResponse;
import com.sparta.limited.product_service.application.service.ProductService;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductCreateResponse> createProduct(
        @RequestBody ProductCreateRequest request) {
        ProductCreateResponse response = productService.createProduct(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("{productId}")
    public ResponseEntity<ProductReadResponse> getProduct(@PathVariable UUID productId) {
        ProductReadResponse response = productService.getProduct(productId);
        return ResponseEntity.ok(response);
    }

}
