

package com.teresol.core.api.core_api_company.dto.billdetaildto;

/**
* import libraries:
* java.math.BigDecimal: is used for set the type of properties
* java.sql.Time: is used to set property type Time
* java.util.Date: The class Date represents a specific instant in time
* javax.validation.constraints.NotNull: is used to The annotated element must not be null
* javax.ws.rs.QueryParam: is used to get value in  query parameter
* io.smallrye.common.constraint.Nullable: An annotation indicating that the given variable is nullable.
*/
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.ws.rs.QueryParam;

import io.smallrye.common.constraint.Nullable;


/**
* <b> Class : <i>CreateBillDetailRequestDto</i> </b> \n &emsp;&emsp;&emsp;
* This class contains request DTO of table BILL_COL_TL with getter/setter methods, this DTOs will be used in where clause of db's query \n &emsp;&emsp;&emsp;
* <b>Service Names:</b> MainCompanyService.java \n &emsp;&emsp;&emsp;
* <b>Calling Classes:</b> MainCompanyService.java, MainResourse.java \n &emsp;&emsp;&emsp;
* @author       Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
* @version     1.1
*/


public class CreateBillDetailRequestDto {

  /** declaration of variables */
  @NotNull
  @QueryParam("branchCode")
  private BigDecimal branchCode;

  /** Required */
  @NotNull
  @QueryParam("loginBranchCode")
  private String loginBranchCode; 

  /** Required */
  @NotNull
  private  List <String> branchCodeList;

  

  /** Nullable */
  @Nullable
  @QueryParam("transactionReferenceNo")
  private BigDecimal transactionReferenceNo;

  /** Nullable */
  @Nullable
  @QueryParam("transactionReferenceYear")
  private BigDecimal transactionReferenceYear;

  /** Nullable */
  @NotNull
  @QueryParam("transactionDate")
  private Date transactionDate;
  
  /** Nullable */
  @NotNull
  @QueryParam("transactionTime")
  private Time transactionTime;

 /** Nullable */
  @NotNull
  @QueryParam("slipNo")
  private String slipNo;

  /** Nullable */
  @NotNull
  @QueryParam("companyId")
  private BigDecimal companyId;

  /** Nullable */
  @NotNull
  @QueryParam("billMonth")
  private BigDecimal billMonth;

  /** Nullable */
  @Nullable
  @QueryParam("onlineReferenceNo")
  private BigDecimal onlineReferenceNo;

  /** Nullable */
  @Nullable
  @QueryParam("sourceBranchCode")
  private BigDecimal sourceBranchCode;

  /** Nullable */
  @Nullable
  @QueryParam("targetBranchCode")
  private BigDecimal targetBranchCode;

  /** Nullable */
  @Nullable
  @QueryParam("rsvBranchCode")
  private BigDecimal rsvBranchCode;

  /** Nullable */
  @Nullable
  @QueryParam("status")
  private BigDecimal status;

  /** Nullable */
  @Nullable
  @QueryParam("transactionAmount")
  private BigDecimal transactionAmount;

  /** Nullable */
  @Nullable
  @QueryParam("account1")
  private BigDecimal account1;

  @Nullable
  @QueryParam("company")
  private String company;

  @Nullable
  @QueryParam("remarks")
  private String remarks;

  @Nullable
  @QueryParam("postBy")
  private String postBy;

  @Nullable
  @QueryParam("authBy")
  private String authBy;

  @Nullable
  @QueryParam("stan")
  private BigDecimal stan;

  @Nullable
  @QueryParam("contractAccount")
  private BigDecimal contractAccount;

  @Nullable
  @QueryParam("chequeNumber")
  private BigDecimal chequeNumber;

  @Nullable
  @QueryParam("barcode")
  private String barcode;

  @Nullable
  @QueryParam("chequeAmount")
  private BigDecimal chequeAmount;

  @Nullable
  @QueryParam("accountType")
  private BigDecimal accountType;

  @Nullable
  @QueryParam("customerNumber")
  private BigDecimal customerNumber;

  @Nullable
  @QueryParam("runNo")
  private BigDecimal runNo;

  @Nullable
  @QueryParam("checkDigit")
  private BigDecimal checkDigit;

  @Nullable
  @QueryParam("customerId")
  private String customerId;

  @Nullable
  @QueryParam("dueDate")
  private Date dueDate;

  @Nullable
  @QueryParam("billAmount")
  private BigDecimal billAmount;

  @Nullable
  @QueryParam("afterDueDateAmount")
  private BigDecimal afterDueDateAmount;

  @Nullable
  @QueryParam("otcId")
  private BigDecimal otcId;

  @Nullable
  @QueryParam("validityDate")
  private Date validityDate;

  @Nullable
  @QueryParam("transactionType")
  private String transactionType;

  /** generation of constructors */
  CreateBillDetailRequestDto() {
    this.setBranchCode(BigDecimal.valueOf(0));
    this.setTransactionReferenceNo(BigDecimal.valueOf(0));
    this.setTransactionReferenceYear(BigDecimal.valueOf(0));
    this.setCompanyId(BigDecimal.valueOf(0));
    this.setBillMonth(BigDecimal.valueOf(0));
  }

  /** generation of getter/setter */
  
  
  public BigDecimal getBranchCode() {
    return branchCode;
  }

  public List<String> getBranchCodeList() {
    return branchCodeList;
  }

  public void setBranchCodeList(List<String> branchCodeList) {
    this.branchCodeList = branchCodeList;
  }

  public String getLoginBranchCode() {
    return loginBranchCode;
  }

  public void setLoginBranchCode(String loginBranchCode) {
    this.loginBranchCode = loginBranchCode;
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

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public BigDecimal getCompanyId() {
    return companyId;
  }

  public void setCompanyId(BigDecimal companyId) {
    this.companyId = companyId;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
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

  public BigDecimal getRsvBranchCode() {
    return rsvBranchCode;
  }

  public void setRsvBranchCode(BigDecimal rsvBranchCode) {
    this.rsvBranchCode = rsvBranchCode;
  }

  public BigDecimal getTargetBranchCode() {
    return targetBranchCode;
  }

  public void setTargetBranchCode(BigDecimal targetBranchCode) {
    this.targetBranchCode = targetBranchCode;
  }

  public BigDecimal getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(BigDecimal transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public String getPostBy() {
    return postBy;
  }

  public void setPostBy(String postBy) {
    this.postBy = postBy;
  }

  public String getAuthBy() {
    return authBy;
  }

  public void setAuthBy(String authBy) {
    this.authBy = authBy;
  }

  public BigDecimal getChequeNumber() {
    return chequeNumber;
  }

  public void setChequeNumber(BigDecimal chequeNumber) {
    this.chequeNumber = chequeNumber;
  }

  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public BigDecimal getChequeAmount() {
    return chequeAmount;
  }

  public void setChequeAmount(BigDecimal chequeAmount) {
    this.chequeAmount = chequeAmount;
  }

  public BigDecimal getAccountType() {
    return accountType;
  }

  public void setAccountType(BigDecimal accountType) {
    this.accountType = accountType;
  }

  public BigDecimal getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(BigDecimal customerNumber) {
    this.customerNumber = customerNumber;
  }

  public BigDecimal getRunNo() {
    return runNo;
  }

  public void setRunNo(BigDecimal runNo) {
    this.runNo = runNo;
  }

  public BigDecimal getCheckDigit() {
    return checkDigit;
  }

  public void setCheckDigit(BigDecimal checkDigit) {
    this.checkDigit = checkDigit;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  public BigDecimal getBillAmount() {
    return billAmount;
  }

  public void setBillAmount(BigDecimal billAmount) {
    this.billAmount = billAmount;
  }

  public BigDecimal getAfterDueDateAmount() {
    return afterDueDateAmount;
  }

  public void setAfterDueDateAmount(BigDecimal afterDueDateAmount) {
    this.afterDueDateAmount = afterDueDateAmount;
  }

  public BigDecimal getOtcId() {
    return otcId;
  }

  public void setOtcId(BigDecimal otcId) {
    this.otcId = otcId;
  }

  public Date getValidityDate() {
    return validityDate;
  }

  public void setValidityDate(Date validityDate) {
    this.validityDate = validityDate;
  }

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  @Override
  public String toString() {
    return "ProductRequestDTO [branchCode=" + branchCode + ", status=" + status +
    // ", response="
    // + response +
        "]";
  }
}
