/*! \brief <b>Folder Description </b> \n  This folder contains all request and response DTOs for  validate Bill Detail
*
*
*/


package com.teresol.core.api.core_api_company.dto.validatebilldto;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.ws.rs.QueryParam;

import io.smallrye.common.constraint.Nullable;



/**
* <b> Class : <i>GetCompanyAccountRequestDto</i> </b> \n &emsp;&emsp;&emsp;
* This class contains request DTO of table bill_col_tl with getter/setter methods, this DTOs will be used in where clause of db's query \n &emsp;&emsp;&emsp;
* <b>Service Names:</b> ValidateBillDetailRequestDto.java \n &emsp;&emsp;&emsp;
* <b>Calling Classes:</b> MainCompanyService.java, MainResourse.java \n &emsp;&emsp;&emsp;
* @author      Shandana Roheen, Abdul Rehman, Sumit Aakash, Abdul Samee
* @version     1.1
* @return      List
*/

public class ValidateBillDetailRequestDto {
  // Get annotations of NotBlank/NotEmpty reviewed

  @NotNull
  @QueryParam("branchCode")
  private BigDecimal branchCode;

  @NotNull
  @QueryParam("loginBranchCode")
  private String loginBranchCode;

  @Nullable
  @QueryParam("transactionReferenceNo")
  private BigDecimal transactionReferenceNo;

  @Nullable
  @QueryParam("transactionReferenceYear")
  private BigDecimal transactionReferenceYear;

  @Nullable
  @QueryParam("transactionDate")
  private Date transactionDate;

  @Nullable
  @QueryParam("status")
  private BigDecimal status;

  @Nullable
  @QueryParam("onlineReferenceNo")
  private BigDecimal onlineReferenceNo;

  @Nullable
  @QueryParam("sourceBranchCode")
  private BigDecimal sourceBranchCode;

  @Nullable
  @QueryParam("slipNo")
  private String slipNo;

  @Nullable
  @QueryParam("account1")
  private BigDecimal account1;

  @Nullable
  @QueryParam("transactionTime")
  private Time transactionTime;

  @Nullable
  @QueryParam("stan")
  private BigDecimal stan;

  @Nullable
  @QueryParam("companyId")
  private BigDecimal companyId;

  @Nullable
  @QueryParam("billMonth")
  private BigDecimal billMonth;

  @Nullable
  @QueryParam("contractAccount")
  private BigDecimal contractAccount;

  // Response
  @NotEmpty
  @QueryParam("response")
  private String response;

  

  public BigDecimal getBranchCode() {
    return branchCode;
  }



  public void setBranchCode(BigDecimal branchCode) {
    this.branchCode = branchCode;
  }



  public BigDecimal getStatus() {
    return status;
  }



  public void setStatus(BigDecimal status) {
    this.status = status;
  }



  public String getResponse() {
    return response;
  }



  public void setResponse(String response) {
    this.response = response;
  }

  

  public Date getTransactionDate() {
    return transactionDate;
  }



  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }

  

  public BigDecimal getTransactionReferenceNo() {
    return transactionReferenceNo;
  }



  public void setTransactionReferenceNo(BigDecimal transactionReferenceNo) {
    this.transactionReferenceNo = transactionReferenceNo;
  }



  public BigDecimal getTransactionReferenceYear() {
    return transactionReferenceYear;
  }



  public void setTransactionReferenceYear(BigDecimal transactionReferenceYear) {
    this.transactionReferenceYear = transactionReferenceYear;
  }

  

  public BigDecimal getOnlineReferenceNo() {
    return onlineReferenceNo;
  }



  public void setOnlineReferenceNo(BigDecimal onlineReferenceNo) {
    this.onlineReferenceNo = onlineReferenceNo;
  }

  

  public BigDecimal getSourceBranchCode() {
    return sourceBranchCode;
  }



  public void setSourceBranchCode(BigDecimal sourceBranchCode) {
    this.sourceBranchCode = sourceBranchCode;
  }



  public String getSlipNo() {
    return slipNo;
  }



  public void setSlipNo(String slipNo) {
    this.slipNo = slipNo;
  }



  public BigDecimal getAccount1() {
    return account1;
  }



  public void setAccount1(BigDecimal account1) {
    this.account1 = account1;
  }



  public Time getTransactionTime() {
    return transactionTime;
  }



  public void setTransactionTime(Time transactionTime) {
    this.transactionTime = transactionTime;
  }



  public BigDecimal getStan() {
    return stan;
  }



  public void setStan(BigDecimal stan) {
    this.stan = stan;
  }

  


  public BigDecimal getCompanyId() {
    return companyId;
  }



  public void setCompanyId(BigDecimal companyId) {
    this.companyId = companyId;
  }



  public BigDecimal getBillMonth() {
    return billMonth;
  }



  public void setBillMonth(BigDecimal billMonth) {
    this.billMonth = billMonth;
  }



  public BigDecimal getContractAccount() {
    return contractAccount;
  }



  public void setContractAccount(BigDecimal contractAccount) {
    this.contractAccount = contractAccount;
  }

  

  public String getLoginBranchCode() {
    return loginBranchCode;
}



public void setLoginBranchCode(String loginBranchCode) {
    this.loginBranchCode = loginBranchCode;
}



@Override
  public String toString() {
    return "ProductRequestDTO [branchCode=" + branchCode + ", status=" + status + ", response="
        + response + "]";
  }

}
