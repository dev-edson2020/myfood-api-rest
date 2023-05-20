package com.edson.curso.client.api.rest.service;

import java.util.List;

import com.edson.curso.client.api.rest.model.SubscriptionType;

public interface SubscriptionTypeService {

    List<SubscriptionType> findAll();

    SubscriptionType findById(Long id);

    SubscriptionType create(SubscriptionTypeDto dto);

    SubscriptionType update(Long id, SubscriptionTypeDto dto);

    void delete(Long id);
}