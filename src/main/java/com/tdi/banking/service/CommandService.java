package com.tdi.banking.service;

public interface CommandService<T> {

    void create(T object);

}