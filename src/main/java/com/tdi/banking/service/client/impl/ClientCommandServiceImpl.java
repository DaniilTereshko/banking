package com.tdi.banking.service.client.impl;

import com.tdi.banking.domain.model.Client;
import com.tdi.banking.event.ClientCreateEvent;
import com.tdi.banking.service.client.ClientCommandService;
import com.tdi.banking.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientCommandServiceImpl implements ClientCommandService {

    private final EventService eventService;

    @Override
    public void create(Client object) {
        var event = new ClientCreateEvent(object);
        eventService.create(event);
    }

}