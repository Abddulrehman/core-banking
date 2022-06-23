package com.teresol.core.api.core_api_company.dto.companydetaildto;

import java.sql.Date;
/**
 * import libraries:
 * java.util.List: is used for managing list
 * javax.validation.constraints.NotEmpty: is used to manage NotEmpty constraint of fields
 * javax.ws.rs.QueryParam: to manage the queryparams
 * io.smallrye.common.constraint.Nullable: is used to manage Nullable constraint of fields
 */
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.ws.rs.QueryParam;

/**
 * <b> Class : <i>GetCustomerDailyLimitRequestDto</i> </b> \n &emsp;&emsp;&emsp;
 * This class contains request DTO of table CUSTDAYLMTL
 *  with getter/setter methods, this DTOs will be used in where clause
 * of db's query. \n &emsp;&emsp;&emsp;
 * <b>Service Names:</b> GetCustomerDailyLimitRequestDto.java \n &emsp;&emsp;&emsp;
 * <b>Calling Classes:</b> CustomerDatyLimitRequestDto \n
 * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
 * MainCompanyDetailService.java \n
 * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
 * MainResource.java \n
 * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
 * DataaccessmsCompanyDetail.java
 * 
 * @author Shandana Roheen, Abdul Rehman, Sumit Aakash, Abdul Samee
 * @version 1.1
 * @return GetCustomerDailyLimitRequestDto as a request dto in JSON format
 */

public class GetCustomerDailyLimitRequestDto {

    @NotNull
    @QueryParam("accountType")
    private String accountType;

    @NotNull
    @QueryParam("runningNo")
    private String runningNo;

    @NotNull
    @QueryParam("checkDigit")
    private String checkDigit;

    @NotNull
    @QueryParam("customerNo")
    private String customerNo;

    @NotNull
    @QueryParam("branchCode")
    private String branchCode;

    @NotNull
    @QueryParam("date")
    private Date date;

    @NotEmpty
    @QueryParam("response")
    List<String> response;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getRunningNo() {
        return runningNo;
    }

    public void setRunningNo(String runningNo) {
        this.runningNo = runningNo;
    }

    public String getCheckDigit() {
        return checkDigit;
    }

    public void setCheckDigit(String checkDigit) {
        this.checkDigit = checkDigit;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getResponse() {
        return response;
    }

    public void setResponse(List<String> response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "GetCustomerDailyLimitRequestDto [accountType=" + accountType + ", branchCode=" + branchCode
                + ", checkDigit=" + checkDigit + ", customerNo=" + customerNo + ", date=" + date + ", response="
                + response + ", runningNo=" + runningNo + "]";
    }

}
