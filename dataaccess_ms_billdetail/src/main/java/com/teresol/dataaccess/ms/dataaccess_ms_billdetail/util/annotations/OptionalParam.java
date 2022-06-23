package com.teresol.dataaccess.ms.dataaccess_ms_billdetail.util.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface OptionalParam {
    public String columnName();
}
