package com.example.haibazo_test.service.impl;

import com.example.haibazo_test.dto.CartDTO;
import com.example.haibazo_test.exception.ApiException;
import com.example.haibazo_test.exception.ErrorCode;
import com.example.haibazo_test.model.Cart;
import com.example.haibazo_test.model.Product;
import com.example.haibazo_test.mapper.CartMapper;
import com.example.haibazo_test.repository.CartRepository;
import com.example.haibazo_test.repository.ProductRepository;
import com.example.haibazo_test.service.ICartService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartService implements ICartService {

     CartRepository cartRepository;

     ProductRepository productRepository;

     CartMapper cartMapper;

    public Cart addToCart(CartDTO cartAddDTO) {
        // Kiểm tra null cho productId
        if (cartAddDTO.getProductId() == null) {
            throw new IllegalArgumentException("Product ID must not be null");
        }

        Product product = productRepository.findById(cartAddDTO.getProductId())
                .orElseThrow(() -> new ApiException(ErrorCode.PRODUCT_NOT_EXIST));

        Cart cart = cartMapper.toCartEntity(cartAddDTO);
        cart.setProduct(product);
        cart.setQuantity(cartAddDTO.getQuantity());
        return cartRepository.save(cart);
    }
}
