
package com.teresol.core.api.core_api_company.dto.billdetaildto;

/**
* import libraries:
* java.lang.reflect.Field: A Field provides information about and dynamic access to a single field of a class
* java.math.BigDecimal: is used for set the type of properties
* java.sql.Time: is used to set property type Time
* java.sql.Date: The class Date represents a specific instant in Date
* java.util.ArrayList: is used to manage the list of response feilds
* java.util.List:  is used to manage the list of response feilds
* javax.validation.constraints.Size: The annotated element size must be between the specified boundaries (included).
* com.fasterxml.jackson.annotation.JsonInclude: is used to Value that indicates that only properties with non-null values are to be included.
*/

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.teresol.core.api.core_api_company.util.annotations.ResponseParam;




/**
* <b> Class : <i>GetBillDetailResponseDto</i> </b> \n &emsp;&emsp;&emsp;
* This is GetBillDetailResponseDto class for DTO of multiple tables and get/set method. \n &emsp;&emsp;&emsp;
* <b>Service Names: MainCompanyService.java \n &emsp;&emsp;&emsp;
* <b>Calling Classes: MainCompanyService.java, MainResourse.java \n &emsp;&emsp;&emsp;
* @author       Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
* @version     1.1
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBillDetailResponseDto {

  /** description of variables */
 
  @ResponseParam(name = "transactionReferenceNo")
  private BigDecimal transactionReferenceNo;


  @ResponseParam(name = "transactionReferenceYear")
  private BigDecimal transactionReferenceYear;

 
  @ResponseParam(name = "billMonth")
  private BigDecimal billMonth;


  @ResponseParam(name = "account1")
  private String account1;

  
  @ResponseParam(name = "companyId")
  private BigDecimal companyId;


  @ResponseParam(name = "slipNo")
  @Size(max = 25)
  private String slipNo;


  @ResponseParam(name = "transferAmount")
  private BigDecimal transferAmount;

 
  @ResponseParam(name = "transferDate")
  private Date transferDate;


  @ResponseParam(name = "transferTime")
  private Time transferTime;


  @ResponseParam(name = "onlineReferenceNo")
  private BigDecimal onlineRefNo;


  @ResponseParam(name = "sourceBranchCode")
  private BigDecimal sourceBranchCode;

  @ResponseParam(name = "targetBranchCode")
  private BigDecimal targetBranchCode;

  @ResponseParam(name = "receiverBranchCode")
  private BigDecimal receiverBranchCode;


  @ResponseParam(name = "stan")
  private String stan;


  @ResponseParam(name = "company")
  private String company;

  @ResponseParam(name = "remarks")
  @Size(max = 15)
  private String remarks;

  @ResponseParam(name = "status")
  private BigDecimal status;


  @ResponseParam(name = "postBy")
  private String postBy;


  @ResponseParam(name = "authBy")
  private String authBy;

  
  @ResponseParam(name = "customerId")
  private String customerId;


  @ResponseParam(name = "contactAccount")
  private String contactAccount;

  private boolean mBoolean;
  private String errorMessage;

  

  public GetBillDetailResponseDto() {
  }

  

  public GetBillDetailResponseDto(boolean mBoolean, String errorMessage) {
    this.mBoolean = mBoolean;
    this.errorMessage = errorMessage;
  }



  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public BigDecimal getTransactionReferenceNo() {
    return transactionReferenceNo;
  }

  public void setTransactionReferenceNo(BigDecimal transactionReferenceNo) {
    this.transactionReferenceNo = transactionReferenceNo;
  }

  public boolean ismBoolean() {
    return mBoolean;
  }

  public void setmBoolean(boolean mBoolean) {
    this.mBoolean = mBoolean;
  }

  public BigDecimal getTransactionReferenceYear() {
    return transactionReferenceYear;
  }

  public void setTransactionReferenceYear(BigDecimal transactionReferenceYear) {
    this.transactionReferenceYear = transactionReferenceYear;
  }

  public BigDecimal getBillMonth() {
    return billMonth;
  }

  public void setBillMonth(BigDecimal billMonth) {
    this.billMonth = billMonth;
  }

  public String getAccount1() {
    return account1;
  }

  public void setAccount1(String account1) {
    this.account1 = account1;
  }

  public BigDecimal getCompanyId() {
    return companyId;
  }

  public void setCompanyId(BigDecimal companyId) {
    this.companyId = companyId;
  }

  public String getSlipNo() {
    return slipNo;
  }

  public void setSlipNo(String slipNo) {
    this.slipNo = slipNo;
  }

  public BigDecimal getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(BigDecimal transferAmount) {
    this.transferAmount = transferAmount;
  }

  public Date getTransferDate() {
    return transferDate;
  }

  public void setTransferDate(Date transferDate) {
    this.transferDate = transferDate;
  }

  public Time getTransferTime() {
    return transferTime;
  }

  public void setTransferTime(Time transferTime) {
    this.transferTime = transferTime;
  }

  public BigDecimal getOnlineRefNo() {
    return onlineRefNo;
  }

  public void setOnlineRefNo(BigDecimal onlineRefNo) {
    this.onlineRefNo = onlineRefNo;
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

  public BigDecimal getReceiverBranchCode() {
    return receiverBranchCode;
  }

  public void setReceiverBranchCode(BigDecimal receiverBranchCode) {
    this.receiverBranchCode = receiverBranchCode;
  }

  public String getStan() {
    return stan;
  }

  public void setStan(String stan) {
    this.stan = stan;
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

  public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
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

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getContactAccount() {
    return contactAccount;
  }

  public void setContactAccount(String contactAccount) {
    this.contactAccount = contactAccount;
  }

 

}
