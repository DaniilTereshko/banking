package com.tdi.banking.domain.aggreagte;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public abstract class Aggregate {

    private UUID id;

}