package com.teresol.dataaccess.ms.dataaccess_ms_billdetail.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

@Provider
public class ResponseListConverterProvider implements ParamConverterProvider {
    @SuppressWarnings("unchecked")
    @Override
    public <T> ParamConverter<T> getConverter(Class<T> rawType,
            Type genericType,
            Annotation[] annotations) {
        // if (rawType.isAssignableFrom((String.class))) {
        // return (ParamConverter<T>) new QueryParamConverter();
        // }
        if (rawType.isAssignableFrom((List.class))) {
            return (ParamConverter<T>) new ResponseListConverter();
        }
        return null;
    }
}

@Provider
class ResponseListConverter implements ParamConverter<List<String>> {

    public List<String> fromString(String value) {
        return Arrays.asList(value.split(","));
    }

    public String toString(List<String> value) {
        return value.toString();
    }
}

// @Provider
// class QueryParamConverter implements ParamConverter<String> {

// public String fromString(String value) {
// try {
// return value.toUpperCase(); // Decode here
// } catch (DateTimeParseException e) {

// }
// return null;
// }

// public String toString(String value) {
// return value.toString();
// }
// }