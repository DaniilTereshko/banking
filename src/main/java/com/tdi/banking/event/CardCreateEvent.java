package com.tdi.banking.event;

import com.tdi.banking.domain.aggreagte.Aggregate;
import com.tdi.banking.domain.model.Card;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CardCreateEvent extends AbstractEvent {

    public CardCreateEvent(Card payload) {
        super(null, EventType.CARD_CREATE, payload);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }

}