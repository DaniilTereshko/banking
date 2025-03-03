package com.tdi.banking.service.account.impl;

import com.tdi.banking.domain.model.Account;
import com.tdi.banking.repository.AccountRepository;
import com.tdi.banking.service.account.AccountQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.tdi.banking.domain.exception.ResourceNotFoundException.resourceNotFoundException;

@Service
@RequiredArgsConstructor
public class AccountQueryServiceImpl implements AccountQueryService {

    private final AccountRepository repository;

    @Override
    public Account getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(resourceNotFoundException("Объект не найден"));//TODO вынести
    }

}