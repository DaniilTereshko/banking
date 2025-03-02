package com.tdi.banking.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
public class Client extends AbstractModel {

    private String name;

    private String username;

    private String password;

    @OneToOne
    private Account account;

}