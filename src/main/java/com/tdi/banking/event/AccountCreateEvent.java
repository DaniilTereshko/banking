package com.tdi.banking.event;

import com.tdi.banking.domain.aggreagte.Aggregate;
import com.tdi.banking.domain.model.Account;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AccountCreateEvent extends AbstractEvent {

    public AccountCreateEvent(Account payload) {
        super(null, EventType.ACCOUNT_CREATE, payload);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }

}