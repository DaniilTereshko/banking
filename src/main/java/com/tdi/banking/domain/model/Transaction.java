package com.tdi.banking.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Table
@Entity
@Getter
@Setter
public class Transaction extends AbstractModel {

    @ManyToOne
    private Card from;

    @ManyToOne
    private Card to;

    private BigDecimal amount;

}