package com.tdi.banking.service.event;

import com.tdi.banking.event.AbstractEvent;

public interface EventService {

    void create(AbstractEvent event);

}