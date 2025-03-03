package com.tdi.banking.service.card;

import com.tdi.banking.domain.model.Card;
import com.tdi.banking.service.CommandService;
import com.tdi.banking.service.QueryService;

public interface CardService extends QueryService<Card>, CommandService<Card> {
}