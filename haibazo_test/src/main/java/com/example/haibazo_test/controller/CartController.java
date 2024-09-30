package com.example.haibazo_test.controller;

import com.example.haibazo_test.dto.APIResponse;
import com.example.haibazo_test.dto.CartDTO;
import com.example.haibazo_test.model.Cart;
import com.example.haibazo_test.service.ICartService;
import com.example.haibazo_test.util.JsonResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carts")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartController {
    ICartService cartService;
    @PostMapping("/add")
    public ResponseEntity<APIResponse<Cart>> addToCart(@RequestBody CartDTO cartAddDTO) {
        Cart cart = cartService.addToCart(cartAddDTO);
        return JsonResponse.ok(cart);
    }


}
