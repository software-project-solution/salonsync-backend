package com.hiranwj.salonsync.repository;

import com.hiranwj.salonsync.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Optional<Customer> findByNicNumber(String nicNumber);

    Optional<Customer> findByUsername(String username);
}
