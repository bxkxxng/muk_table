package com.example.muk_table.core.service.owner;

import com.example.muk_table.core.service.reservation.ReservationService;
import com.example.muk_table.domain.primary.owner.repository.OwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OwnerService {

    private final OwnerRepository ownerRepository;
    private final ReservationService reservationService;


}
