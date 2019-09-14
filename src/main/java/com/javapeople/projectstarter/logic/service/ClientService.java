package com.javapeople.projectstarter.logic.service;

import com.javapeople.projectstarter.domain.Client;
import com.javapeople.projectstarter.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;


    public List<Client> findClients() {
        return clientRepository.findAll();
    }
}
