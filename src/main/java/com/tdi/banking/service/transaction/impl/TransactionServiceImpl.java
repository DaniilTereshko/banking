package com.tdi.banking.service.transaction.impl;

import com.tdi.banking.domain.model.Transaction;
import com.tdi.banking.service.transaction.TransactionCommandService;
import com.tdi.banking.service.transaction.TransactionQueryService;
import com.tdi.banking.service.transaction.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionQueryService queryService;
    private final TransactionCommandService commandService;

    @Override
    public void create(Transaction object) {
        commandService.create(object);
    }

    @Override
    public Transaction getById(UUID id) {
        return queryService.getById(id);
    }

}