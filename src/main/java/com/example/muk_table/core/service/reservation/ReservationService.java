package com.example.muk_table.core.service.reservation;

import com.example.muk_table.core.common.exception.BusinessException;
import com.example.muk_table.core.common.response.ResponseCode;
import com.example.muk_table.core.dto.request.reservation.ReservationRequest;
import com.example.muk_table.core.dto.request.restaurant.RestaurantRequest;
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
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final CustomerService customerService;
    private final RestaurantService restaurantService;
    private final ReservationRepository reservationRepository;

    //예약현황 리스트
    public List<Reservation> getReservationList() {
        LocalDate today = LocalDate.now();
        return reservationRepository.findAllReservationListByDate(today);
    }

    //예약현황 갯수 조회
    public Long getReservationCount() {
        return (long) getReservationList().size();
    }

    //예약정보 조회
    public Reservation getReservationById(Long reservationId) {
        return reservationRepository.findById(reservationId).orElseThrow(() -> new BusinessException(ResponseCode.CUSTOMER_NOT_FOUND));
    }

    @Transactional
    public Long saveReservation(ReservationRequest reservationRequest) {

        Customer customer = customerService.saveCustomer(reservationRequest.getPeopleNumber(), reservationRequest.getPhoneNumber(), reservationRequest.getRestaurantId());
        Restaurant restaurant = restaurantService.getRestaurant(reservationRequest.getRestaurantId());

        return reservationRepository.save(Reservation.builder()
                        .customer(customer)
                        .restaurant(restaurant)
                        .notice(reservationRequest.getNotice())
                        .status(reservationRequest.getStatus())
                        .build())
                .getId();
    }

    public Long updateCustomerStatus(Long reservationId) {
        Reservation reservation = getReservationById(reservationId);
        ReservationRequest updateReservation = ReservationRequest.builder()
                .id(reservation.getId())
                .status("01")
                .build();

        return saveReservation(updateReservation);
    }
}
