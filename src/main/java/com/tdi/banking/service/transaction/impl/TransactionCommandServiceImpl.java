package com.tdi.banking.service.transaction.impl;

import com.tdi.banking.domain.model.Transaction;
import com.tdi.banking.event.TransactionCreateEvent;
import com.tdi.banking.service.event.EventService;
import com.tdi.banking.service.transaction.TransactionCommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionCommandServiceImpl implements TransactionCommandService {

    private final EventService eventService;

    @Override
    public void create(Transaction object) {
        var event = new TransactionCreateEvent(object);
        eventService.create(event);
    }

}