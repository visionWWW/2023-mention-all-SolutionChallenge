package com.mentionall.cpr2u.user.repository;

import com.mentionall.cpr2u.user.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> , AddressDslRepository, QuerydslPredicateExecutor<Address> {

    // TODO: Querydsl로 리팩토링
    @Query("SELECT DISTINCT a.sido FROM Address a")
    List<String> findAllSido();
}
