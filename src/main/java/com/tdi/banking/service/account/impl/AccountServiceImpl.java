package com.tdi.banking.service.account.impl;

import com.tdi.banking.domain.model.Account;
import com.tdi.banking.service.account.AccountCommandService;
import com.tdi.banking.service.account.AccountQueryService;
import com.tdi.banking.service.account.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountQueryService queryService;
    private final AccountCommandService commandService;

    @Override
    public void create(Account object) {
        commandService.create(object);
    }

    @Override
    public Account getById(UUID id) {
        return queryService.getById(id);
    }

}