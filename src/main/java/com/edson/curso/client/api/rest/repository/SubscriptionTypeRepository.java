package com.edson.curso.client.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edson.curso.client.api.rest.model.SubscriptionType;

import java.util.Optional;

@Repository
public interface SubscriptionTypeRepository extends JpaRepository<SubscriptionType,Long> {

    Optional<SubscriptionType> findByProductKey(String productKey);

}