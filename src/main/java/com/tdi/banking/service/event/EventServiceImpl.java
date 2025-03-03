package com.tdi.banking.service.event;

import com.tdi.banking.event.AbstractEvent;
import com.tdi.banking.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventRepository repository;

    @Override
    public void create(AbstractEvent event) {
        repository.save(event);
    }

}