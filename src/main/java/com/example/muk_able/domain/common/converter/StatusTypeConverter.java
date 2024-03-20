package com.example.muk_able.domain.common.converter;

import com.example.muk_able.domain.common.enums.StatusType;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class StatusTypeConverter extends CodeValueConverter<StatusType> {
    StatusTypeConverter() { super(StatusType.class);}
}
