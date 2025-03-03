package com.tdi.banking.service.card.impl;

import com.tdi.banking.domain.model.Card;
import com.tdi.banking.service.card.CardCommandService;
import com.tdi.banking.service.card.CardQueryService;
import com.tdi.banking.service.card.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardQueryService queryService;
    private final CardCommandService commandService;

    @Override
    public void create(Card object) {
        commandService.create(object);
    }

    @Override
    public Card getById(UUID id) {
        return queryService.getById(id);
    }

}