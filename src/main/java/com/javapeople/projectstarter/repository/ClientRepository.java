package com.javapeople.projectstarter.repository;

import com.javapeople.projectstarter.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {



}
