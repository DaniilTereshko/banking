package com.tdi.banking.service.client.impl;

import com.tdi.banking.domain.model.Client;
import com.tdi.banking.repository.ClientRepository;
import com.tdi.banking.service.client.ClientQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.tdi.banking.domain.exception.ResourceNotFoundException.resourceNotFoundException;

@Service
@RequiredArgsConstructor
public class ClientQueryServiceImpl implements ClientQueryService {

    private final ClientRepository repository;

    @Override
    public Client getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(resourceNotFoundException("Объект не найден"));//TODO вынести
    }

}