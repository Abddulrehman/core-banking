package com.teresol.dataaccess.ms.dataaccess_ms_billdetail.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.util.annotations.ResponseParam;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.util.annotations.Table;

public class QueryUtils {

    public static String fnGetDBColumnNamesForResponseFields(List<String> responseParams, Class<?> responseDTOClass) {
        List<String> dbColumns = new ArrayList<>();

        for (Field field : responseDTOClass.getDeclaredFields()) {
            Table column = field.getAnnotation(Table.class);
            ResponseParam responseParam = field.getAnnotation(ResponseParam.class);

            if (responseParams != null && responseParam != null && responseParams.contains(responseParam.name())) {
                dbColumns.add(column.column());
            }
        }

        return String.join(",", dbColumns);
    }

    // // Following method can be used to generate select query for
    // // the most used scenario of 'and, ='; RequiredParam, OptionalParam can be
    // used
    // public static String selectQuery(Object object, Class<?> responseDTOClass) {
    // try {
    // Class<?> zclass = object.getClass();
    // String criteria = "";
    // String projections = "";
    // String tableName = zclass.getAnnotation(Table.class).name();

    // for (Field field : zclass.getDeclaredFields()) {
    // field.setAccessible(true);

    // // Required params
    // if (field.getAnnotation(RequiredParam.class) != null && field.get(object) !=
    // null) {
    // String columnName = field.getAnnotation(RequiredParam.class).columnName();
    // if (criteria.length() == 0) {
    // criteria += " where " + columnName + " = " + "'" + field.get(object) + "'";
    // } else {
    // criteria += " and " + columnName + " = " + "'" + field.get(object) + "'";
    // }
    // }

    // // Optional params
    // if (field.getAnnotation(OptionalParam.class) != null && field.get(object) !=
    // null) {
    // String columnName = field.getAnnotation(OptionalParam.class).columnName();
    // if (criteria.length() == 0) {
    // criteria += " where " + columnName + " = " + "'" + field.get(object) + "'";
    // } else {
    // criteria += " and " + columnName + " = " + "'" + field.get(object) + "'";
    // }
    // }

    // // Projections
    // if (field.getAnnotation(OptionalParam.class) == null
    // && field.getAnnotation(RequiredParam.class) == null) {
    // projections = fnGetDBColumnNamesForResponseFields(
    // ((List<String>) field.get(object)), responseDTOClass);
    // }

    // }

    // return "select " + projections + " from " + tableName + criteria;

    // } catch (IllegalArgumentException e) {
    // e.printStackTrace();
    // } catch (IllegalAccessException e) {
    // e.printStackTrace();
    // }

    // return "";
    // }

    // public static String fnInsertQuery(Object object) {
    // try {
    // List<String> columns = new ArrayList<>();
    // List<String> values = new ArrayList<>();

    // Class<?> zclass = object.getClass();
    // String tableName = zclass.getAnnotation(Table.class).name();

    // for (Field field : zclass.getDeclaredFields()) {
    // field.setAccessible(true);
    // Table table = field.getAnnotation(Table.class);
    // if (table != null) {
    // String columnName = table.column();
    // Object value = field.get(object);
    // if (value != null) {
    // columns.add(columnName);
    // if (value.getClass() == String.class) {
    // values.add("'" + value.toString() + "'");
    // } else {
    // values.add(value.toString());
    // }

    // }
    // }

    // }

    // return "insert into " + tableName + "(" + String.join(",", columns) + ")" + "
    // values ("
    // + String.join(",", values) + ")";

    // } catch (IllegalArgumentException e) {
    // e.printStackTrace();
    // } catch (IllegalAccessException e) {
    // e.printStackTrace();
    // }

    // return "";
    // }

    // // Both Objects must be of same class
    // public static String fnUpdateQuery(Object currentRecord, Object newRecord) {
    // if (currentRecord.getClass() != newRecord.getClass()) {
    // return null;
    // }
    // try {

    // Class<?> zclass = currentRecord.getClass();
    // String tableName = zclass.getAnnotation(Table.class).name();

    // String set = "";

    // for (Field field : zclass.getDeclaredFields()) {
    // field.setAccessible(true);
    // Table table = field.getAnnotation(Table.class);
    // if (table != null) {
    // String columnName = table.column();
    // Object value = field.get(newRecord);
    // if (value != null) {
    // if (value.getClass() == String.class) {
    // set += columnName + " = " + "'" + value + "', ";
    // } else {
    // set += columnName + " = " + value + ", ";
    // }

    // }
    // }
    // }

    // String criteria = "";

    // for (Field field : zclass.getDeclaredFields()) {
    // field.setAccessible(true);
    // Table table = field.getAnnotation(Table.class);
    // if (table != null) {
    // String columnName = table.column();
    // Object value = field.get(currentRecord);
    // if (value != null) {
    // if (criteria.length() == 0) {
    // if (value.getClass() == String.class) {
    // criteria += " where " + columnName + " = " + "'" + value + "'";
    // } else {
    // criteria += " where " + columnName + " = " + value;
    // }

    // } else {
    // if (value.getClass() == String.class) {
    // criteria += " and " + columnName + " = " + "'" + value + "'";
    // } else {
    // criteria += " and " + columnName + " = " + value;
    // }
    // }
    // }
    // }

    // }
    // if (set.endsWith(", ")) {
    // set = set.substring(0, set.length() - 2);
    // }

    // return "update " + tableName + " set " + set + criteria;

    // } catch (IllegalArgumentException e) {
    // e.printStackTrace();
    // } catch (IllegalAccessException e) {
    // e.printStackTrace();
    // }

    // return "";
    // }
}
