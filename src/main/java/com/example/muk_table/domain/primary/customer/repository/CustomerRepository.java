package com.example.muk_table.domain.primary.customer.repository;

import com.example.muk_table.domain.primary.customer.model.entity.Customer;
import com.example.muk_table.domain.primary.customer.repository.querydsl.CustomerRepositoryQueryDsl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryQueryDsl {
}
