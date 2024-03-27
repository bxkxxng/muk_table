package com.example.muk_table.core.service.reservation;

import com.example.muk_table.core.dto.request.reservation.ReservationRequest;
import com.example.muk_table.core.service.customer.CustomerService;
import com.example.muk_table.core.service.restaurant.RestaurantService;
import com.example.muk_table.domain.primary.customer.model.entity.Customer;
import com.example.muk_table.domain.primary.reservation.model.entity.Reservation;
import com.example.muk_table.domain.primary.reservation.repository.ReservationRepository;
import com.example.muk_table.domain.primary.restaurant.model.entity.Restaurant;
import java.time.LocalDate;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final CustomerService customerService;
    private final RestaurantService restaurantService;
    private final ReservationRepository reservationRepository;

    public List<Reservation> getReservationList() {
        LocalDate today = LocalDate.now();
        List<Reservation> reservationList = reservationRepository.findAllReservationList(today);
        return reservationList;
    }

    public Long saveReservation(ReservationRequest reservationRequest) {

        Customer customer = customerService.getCustomer(reservationRequest.getCustomerId());
        Restaurant restaurant = restaurantService.getRestaurant(reservationRequest.getRestaurantId());

        return reservationRepository.save(Reservation.builder()
                        .customer(customer)
                        .restaurant(restaurant)
                        .notice(reservationRequest.getNotice())
                        .status(reservationRequest.getStatus())
                        .build())
                .getId();
    }


}
