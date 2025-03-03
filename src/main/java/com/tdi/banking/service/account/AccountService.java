package com.tdi.banking.service.account;

import com.tdi.banking.domain.model.Account;
import com.tdi.banking.service.CommandService;
import com.tdi.banking.service.QueryService;

public interface AccountService extends QueryService<Account>, CommandService<Account> {
}