package com.tdi.banking.service.card.impl;

import com.tdi.banking.domain.model.Card;
import com.tdi.banking.event.CardCreateEvent;
import com.tdi.banking.service.card.CardCommandService;
import com.tdi.banking.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardCommandServiceImpl implements CardCommandService {

    private final EventService eventService;

    @Override
    public void create(Card object) {
        var event = new CardCreateEvent(object);
        eventService.create(event);
    }

}