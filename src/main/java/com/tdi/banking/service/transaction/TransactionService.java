package com.tdi.banking.service.transaction;

import com.tdi.banking.domain.model.Transaction;
import com.tdi.banking.service.CommandService;
import com.tdi.banking.service.QueryService;

public interface TransactionService extends QueryService<Transaction>, CommandService<Transaction> {
}