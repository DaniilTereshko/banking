package com.tdi.banking.service.transaction.impl;

import com.tdi.banking.domain.model.Transaction;
import com.tdi.banking.repository.TransactionRepository;
import com.tdi.banking.service.transaction.TransactionQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.tdi.banking.domain.exception.ResourceNotFoundException.resourceNotFoundException;

@Service
@RequiredArgsConstructor
public class TransactionQueryServiceImpl implements TransactionQueryService {

    private final TransactionRepository repository;

    @Override
    public Transaction getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(resourceNotFoundException("Объект не найден"));//TODO вынести
    }

}