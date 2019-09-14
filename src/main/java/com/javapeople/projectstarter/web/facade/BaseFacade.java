package com.javapeople.projectstarter.web.facade;

import com.javapeople.projectstarter.domain.Client;
import com.javapeople.projectstarter.logic.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseFacade {

    @Autowired
    private ClientService clientService;


    public List<Client> getClients() {
        return clientService.findClients();
    }
}
