package com.tdi.banking.domain.model.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.SneakyThrows;

@Converter
public class ObjectConverter implements AttributeConverter<Object, String> {

    private final static ObjectMapper objectMapper = new ObjectMapper();

    @Override
    @SneakyThrows
    public String convertToDatabaseColumn(Object attribute) {
        return objectMapper.writeValueAsString(attribute);
    }

    @Override
    public Object convertToEntityAttribute(String dbData) {
        return objectMapper.convertValue(dbData, Object.class);
    }

}