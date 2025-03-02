package com.tdi.banking.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Table
@Getter
@Setter
@Entity
public class Account extends AbstractModel {

    private String number;

    private BigDecimal balance;

    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
    private Set<Card> cards;

}