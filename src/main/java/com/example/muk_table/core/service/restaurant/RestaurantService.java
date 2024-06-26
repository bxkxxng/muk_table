package com.example.muk_table.core.service.restaurant;

import com.example.muk_table.core.common.exception.BusinessException;
import com.example.muk_table.core.common.response.ResponseCode;
import com.example.muk_table.domain.primary.restaurant.model.entity.Restaurant;
import com.example.muk_table.domain.primary.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public Restaurant getRestaurant(long restaurantId) {
        return restaurantRepository.findById(restaurantId).orElseThrow(()-> new BusinessException(ResponseCode.RESTAURANT_NOT_FOUND));
    }


}
