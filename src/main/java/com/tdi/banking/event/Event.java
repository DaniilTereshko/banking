package com.tdi.banking.event;

import com.tdi.banking.domain.aggreagte.Aggregate;

@FunctionalInterface
public interface Event {

    void apply(Aggregate aggregate);

}