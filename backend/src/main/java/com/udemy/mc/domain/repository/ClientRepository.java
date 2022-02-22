package com.udemy.mc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.mc.domain.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
