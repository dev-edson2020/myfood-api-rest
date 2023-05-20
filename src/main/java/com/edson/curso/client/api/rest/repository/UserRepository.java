package com.edson.curso.client.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edson.curso.client.api.rest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}