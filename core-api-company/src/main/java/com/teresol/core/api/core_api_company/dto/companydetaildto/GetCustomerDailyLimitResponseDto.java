package com.teresol.core.api.core_api_company.dto.companydetaildto;

/**
 * import libraries:
 * java.math.BigDecimal: is used for managing BigDecimal datatype
 * java.math.BigInteger: is used for managing BigInteger datatype
 * com.fasterxml.jackson.annotation.JsonInclude: to manage the NON_NULL Json fields
 */
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.teresol.core.api.core_api_company.util.annotations.ResponseParam;

/**
 * <b> Class : <i>GetCustomerDailyLimitResponseDto</i> </b> \n
 * &emsp;&emsp;&emsp;
 * This is GetCustomerDailyLimitResponseDto Class for DTO for response from
 * CUSTDAYLMTL table with constructors & get/set method. \n
 * &emsp;&emsp;&emsp;
 * <b>Service Names:</b> GetCustomerDailyLimitResponseDto.java \n
 * &emsp;&emsp;&emsp;
 * <b>Calling Classes:</b> MainCompanyDetailService.java \n
 * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
 * MainResource.java \n
 * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
 * DataaccessmsCompanyDetail.java
 * 
 * @author Shandana Roheen, Abdul Rehman, Sumit Aakash, Abdul Samee
 * @version 1.1
 * @return GetCustomerDailyLimitResponseDto as a response dto in JSON format
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCustomerDailyLimitResponseDto {

    public GetCustomerDailyLimitResponseDto() {
    }

    public GetCustomerDailyLimitResponseDto(String errorMessage, boolean mBoolean) {
        this.errorMessage = errorMessage;
        this.mBoolean = mBoolean;
    }

    /** declaration of variables */

    @ResponseParam(name = "dayLimit")
    private BigDecimal dayLimit;
    private String errorMessage;
    private boolean mBoolean;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

 

    public BigDecimal getDayLimit() {
        return dayLimit;
    }

    public void setDayLimit(BigDecimal dayLimit) {
        this.dayLimit = dayLimit;
    }

    public boolean ismBoolean() {
        return mBoolean;
    }

    public void setmBoolean(boolean mBoolean) {
        this.mBoolean = mBoolean;
    }

    @Override
    public String toString() {
        return "GetCustomerDailyLimitResponseDto [dayLimit=" + dayLimit + ", errorMessage=" + errorMessage
                + ", mBoolean=" + mBoolean + "]";
    }

   

}
