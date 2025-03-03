package com.tdi.banking.service.client.impl;

import com.tdi.banking.domain.model.Client;
import com.tdi.banking.service.client.ClientCommandService;
import com.tdi.banking.service.client.ClientQueryService;
import com.tdi.banking.service.client.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientQueryService queryService;
    private final ClientCommandService commandService;

    @Override
    public void create(Client object) {
        commandService.create(object);
    }

    @Override
    public Client getById(UUID id) {
        return queryService.getById(id);
    }

}