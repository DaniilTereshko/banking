package com.tdi.banking.service.card.impl;

import com.tdi.banking.domain.model.Card;
import com.tdi.banking.repository.CardRepository;
import com.tdi.banking.service.card.CardQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.tdi.banking.domain.exception.ResourceNotFoundException.resourceNotFoundException;

@Service
@RequiredArgsConstructor
public class CardQueryServiceImpl implements CardQueryService {

    private final CardRepository repository;

    @Override
    public Card getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(resourceNotFoundException("Объект не найден"));//TODO вынести
    }

}