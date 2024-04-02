package com.example.muk_table.core.service.owner;

import com.example.muk_table.core.service.reservation.ReservationService;
import com.example.muk_table.core.service.restaurant.RestaurantService;
import com.example.muk_table.domain.primary.owner.model.entity.Owner;
import com.example.muk_table.domain.primary.owner.repository.OwnerRepository;
import com.example.muk_table.domain.primary.restaurant.model.entity.Restaurant;
import com.example.muk_table.domain.primary.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OwnerService {

    private final OwnerRepository ownerRepository;

    public Long saveOwner(Owner owner) {
        return ownerRepository.save(Owner.builder()
                        .ownerLoginId(owner.getOwnerLoginId())
                        .ownerPassword(owner.getOwnerPassword())
                        .build())
                .getId();
    }


}
