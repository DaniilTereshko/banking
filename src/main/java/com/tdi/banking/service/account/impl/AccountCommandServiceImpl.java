package com.tdi.banking.service.account.impl;

import com.tdi.banking.domain.model.Account;
import com.tdi.banking.event.AccountCreateEvent;
import com.tdi.banking.service.account.AccountCommandService;
import com.tdi.banking.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountCommandServiceImpl implements AccountCommandService {

    private final EventService eventService;

    @Override
    public void create(Account object) {
        var event = new AccountCreateEvent(object);
        eventService.create(event);
    }

}