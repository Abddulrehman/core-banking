
package com.teresol.core.api.core_api_company.util.annotations;import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ResponseParam {
    public String name();
}
