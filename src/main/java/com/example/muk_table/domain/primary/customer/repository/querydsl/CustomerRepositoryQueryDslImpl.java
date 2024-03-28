package com.example.muk_table.domain.primary.customer.repository.querydsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CustomerRepositoryQueryDslImpl implements CustomerRepositoryQueryDsl {
    private final JPAQueryFactory queryFactory;
}
