package com.example.muk_table.domain.primary.restaurant.repository.querydsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class RestaurantRepositoryQueryDslImpl implements RestaurantRepositoryQueryDsl {

    private final JPAQueryFactory jpaQueryFactory;

}
