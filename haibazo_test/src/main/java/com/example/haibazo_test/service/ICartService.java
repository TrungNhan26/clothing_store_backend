package com.example.haibazo_test.service;

import com.example.haibazo_test.dto.CartDTO;
import com.example.haibazo_test.model.Cart;
import org.springframework.stereotype.Service;

@Service
public interface ICartService {
      Cart addToCart(CartDTO cartDTO);

}
