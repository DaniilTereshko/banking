package com.tdi.banking.service.client;

import com.tdi.banking.domain.model.Client;
import com.tdi.banking.service.CommandService;
import com.tdi.banking.service.QueryService;

public interface ClientService extends QueryService<Client>, CommandService<Client> {
}