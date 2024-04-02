package com.example.muk_table.domain.primary.owner.repository;

import com.example.muk_table.domain.primary.owner.model.entity.Owner;
import com.example.muk_table.domain.primary.owner.repository.querydsl.OwnerRepositoryQueryDsl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long>, OwnerRepositoryQueryDsl {
}
