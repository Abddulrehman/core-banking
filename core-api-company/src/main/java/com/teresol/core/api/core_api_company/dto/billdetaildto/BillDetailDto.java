/*! \brief <b>Folder Description </b>This folder contains all request and response DTOs for Bill Detail microservice.*/


package com.teresol.core.api.core_api_company.dto.billdetaildto;

/**
* import libraries:
* java.math.BigDecimal: is used for set the type of properties
* java.sql.Time: is used to set property type Time
* java.util.Date: The class Date represents a specific instant in time
*/

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

/**
* <b> Class : <i>BillDetailDto</i> </b> \n &emsp;&emsp;&emsp;
* This class contains request DTO of table BILL_COL_TL with getter/setter methods, this DTOs will be used in where clause of db's query.  \n &emsp;&emsp;&emsp; 
* <b>Service Names:</b> MainCompanyService.java \n &emsp;&emsp;&emsp;
* <b>Calling Classes:</b> MainCompanyService.java, MainResourse.java \n &emsp;&emsp;&emsp;
* @author       Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
* @version     1.1
*/
public class BillDetailDto {

  /* declaration of variables */
  private BigDecimal branchCode;
  private BigDecimal transactionReferenceNo;
  private BigDecimal transactionReferenceYear;
  private Date transactionDate;
  private Time transactionTime;
  private String slipNo;
  private BigDecimal companyId;
  private BigDecimal billMonth;
  private BigDecimal onlineReferenceNo;
  private BigDecimal sourceBranchCode;
  private BigDecimal targetBranchCode;
  private BigDecimal rsvBranchCode;
  private String status;
  private BigDecimal transactionAmount;
  private BigDecimal account1;
  private String company;
  private String remarks;
  private String postBy;
  private String authBy;
  private BigDecimal stan;
  private BigDecimal contractAccount;
  private BigDecimal chequeNumber;
  private String barcode;
  private BigDecimal chequeAmount;
  private BigDecimal accountType;
  private BigDecimal customerNumber;
  private BigDecimal runNo;
  private BigDecimal checkDigit;
  private String customerId;
  private Date dueDate;
  private BigDecimal billAmount;
  private BigDecimal afterDueDateAmount;
  private BigDecimal otcId;
  private Date validityDate;
  private String transactionType;


  public BigDecimal getBranchCode() {
    return branchCode;
  }

  public void setBranchCode(BigDecimal branchCode) {
    this.branchCode = branchCode;
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

  public Date getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Time getTransactionTime() {
    return transactionTime;
  }

  public void setTransactionTime(Time transactionTime) {
    this.transactionTime = transactionTime;
  }

  public String getSlipNo() {
    return slipNo;
  }

  public void setSlipNo(String slipNo) {
    this.slipNo = slipNo;
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

  public BigDecimal getTargetBranchCode() {
    return targetBranchCode;
  }

  public void setTargetBranchCode(BigDecimal targetBranchCode) {
    this.targetBranchCode = targetBranchCode;
  }

  public BigDecimal getRsvBranchCode() {
    return rsvBranchCode;
  }

  public void setRsvBranchCode(BigDecimal rsvBranchCode) {
    this.rsvBranchCode = rsvBranchCode;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BigDecimal getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(BigDecimal transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public BigDecimal getAccount1() {
    return account1;
  }

  public void setAccount1(BigDecimal account1) {
    this.account1 = account1;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
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

  public BigDecimal getStan() {
    return stan;
  }

  public void setStan(BigDecimal stan) {
    this.stan = stan;
  }

  public BigDecimal getContractAccount() {
    return contractAccount;
  }

  public void setContractAccount(BigDecimal contractAccount) {
    this.contractAccount = contractAccount;
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

}
