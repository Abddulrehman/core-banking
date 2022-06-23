/*! \brief <b>Folder Description </b> \n This folder contains all request and response DTOs for Company Detail.*/



package com.teresol.core.api.core_api_company.dto.companydetaildto;

/**
 * import libraries:
 * java.math.BigDecimal: is used for managing BigDecimal datatype
 * java.sql.Date: is used for managing Date datatype
 * java.sql.Time: is used for managing Time datatype
 * javax.validation.constraints.NotNull: is used to manage NotNull constraint of field
 * io.smallrye.common.constraint.Nullable: is used to manage Nullable constraint of field
 */

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.validation.constraints.NotNull;
import io.smallrye.common.constraint.Nullable;

/**
* <b> Class : <i>CreateCompanyDetailRequestDto</i> </b> \n &emsp;&emsp;&emsp; 
* This class contains request DTO of table cmgmt_comp_info with getter/setter methods, this DTOs will be used in where clause of db's query \n &emsp;&emsp;&emsp;
* <b>Service Names:</b> CreateCompanyDetailRequestDto.java  \n &emsp;&emsp;&emsp;
* <b>Calling Class:</b> Calling Classes: MainCompanyService.java, MainResourse.java \n &emsp;&emsp;&emsp;
* @author      Shandana Roheen, Abdul Rehman, Sumit Aakash, Abdul Samee
* @version     1.1
* @return      List
*/


public class CreateCompanyDetailRequestDto {

  /** declaration of variables */

  /** Required */

   /** Required */
   @NotNull
   private  List <String> branchCodeList;
   
  @NotNull
  private BigDecimal branchCode;


  /** Required */
  @NotNull
  private BigDecimal accountType;

  /** Required */
  @NotNull
  private BigDecimal customerNo;

  /** Required */
  @NotNull
  private BigDecimal runningNo;

  /** Required */
  @NotNull
  private BigDecimal checkDigit;

  /** Optional */
  @Nullable
  private String name;

  /** Optional */
  @Nullable
  private String postBy;

  /** Optional */
  @NotNull
  private Time postTime;

  /** Optional */
  @Nullable
  private String authorizeBy;

  /** Optional */
  @NotNull
  private Time authorizeTime;

  /** Optional */
  @Nullable
  private String terminalId;

  /** Optional */
  @NotNull
  private Date postDate;

  /** Required */
  @NotNull
  private String loginBranchCode;

  /** Required */
  @NotNull
  private BigDecimal colBranchCode;

  /** Required */
  @NotNull
  private BigDecimal colAccountType;

  /** Required */
  @NotNull
  private BigDecimal colCustomerNo;

  /** Required */
  @NotNull
  private BigDecimal colRunningNo;

  /** Optional */
  @Nullable
  private BigDecimal chequeLogdeFlag;

  /** Optional */
  @Nullable
  private BigDecimal chequeRealizeFlag;

  /** Optional */
  @Nullable
  private BigDecimal cashDepositType;

  /** Optional */
  @Nullable
  private BigDecimal colTransferType;

  /** Optional */
  @Nullable
  private BigDecimal colTransferMode;

  /** Optional */
  @Nullable
  private BigDecimal depositTransferType;

  /** Optional */
  @Nullable
  private BigDecimal depositTransferMode;

  /** Optional */
  @Nullable
  private BigDecimal updateFlag;

  /** Optional */
  @Nullable
  private BigDecimal currencyCode;

  /** construction of getter/setter and toString methods */
  

  public BigDecimal getBranchCode() {
    return branchCode;
  }

  public void setBranchCode(BigDecimal branchCode) {
    this.branchCode = branchCode;
  }

  public BigDecimal getAccountType() {
    return accountType;
  }

  public void setAccountType(BigDecimal accountType) {
    this.accountType = accountType;
  }

  public BigDecimal getCustomerNo() {
    return customerNo;
  }

  public void setCustomerNo(BigDecimal customerNo) {
    this.customerNo = customerNo;
  }

  public BigDecimal getRunningNo() {
    return runningNo;
  }

  public void setRunningNo(BigDecimal runningNo) {
    this.runningNo = runningNo;
  }

  public BigDecimal getCheckDigit() {
    return checkDigit;
  }

  public void setCheckDigit(BigDecimal checkDigit) {
    this.checkDigit = checkDigit;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPostBy() {
    return postBy;
  }

  public void setPostBy(String postBy) {
    this.postBy = postBy;
  }

  public Time getPostTime() {
    return postTime;
  }

  public void setPostTime(Time postTime) {
    this.postTime = postTime;
  }

  public String getAuthorizeBy() {
    return authorizeBy;
  }

  public void setAuthorizeBy(String authorizeBy) {
    this.authorizeBy = authorizeBy;
  }

  public Time getAuthorizeTime() {
    return authorizeTime;
  }

  public void setAuthorizeTime(Time authorizeTime) {
    this.authorizeTime = authorizeTime;
  }

  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public Date getPostDate() {
    return postDate;
  }

  public void setPostDate(Date postDate) {
    this.postDate = postDate;
  }

  public String getLoginBranchCode() {
    return loginBranchCode;
  }

  public void setLoginBranchCode(String loginBranchCode) {
    this.loginBranchCode = loginBranchCode;
  }

  public BigDecimal getColBranchCode() {
    return colBranchCode;
  }

  public void setColBranchCode(BigDecimal colBranchCode) {
    this.colBranchCode = colBranchCode;
  }

  public BigDecimal getColAccountType() {
    return colAccountType;
  }

  public void setColAccountType(BigDecimal colAccountType) {
    this.colAccountType = colAccountType;
  }

  public BigDecimal getColCustomerNo() {
    return colCustomerNo;
  }

  public void setColCustomerNo(BigDecimal colCustomerNo) {
    this.colCustomerNo = colCustomerNo;
  }

  public BigDecimal getColRunningNo() {
    return colRunningNo;
  }

  public void setColRunningNo(BigDecimal colRunningNo) {
    this.colRunningNo = colRunningNo;
  }

  public BigDecimal getChequeLogdeFlag() {
    return chequeLogdeFlag;
  }

  public void setChequeLogdeFlag(BigDecimal chequeLogdeFlag) {
    this.chequeLogdeFlag = chequeLogdeFlag;
  }

  public BigDecimal getChequeRealizeFlag() {
    return chequeRealizeFlag;
  }

  public void setChequeRealizeFlag(BigDecimal chequeRealizeFlag) {
    this.chequeRealizeFlag = chequeRealizeFlag;
  }

  public BigDecimal getCashDepositType() {
    return cashDepositType;
  }

  public void setCashDepositType(BigDecimal cashDepositType) {
    this.cashDepositType = cashDepositType;
  }

  public BigDecimal getColTransferType() {
    return colTransferType;
  }

  public void setColTransferType(BigDecimal colTransferType) {
    this.colTransferType = colTransferType;
  }

  public BigDecimal getColTransferMode() {
    return colTransferMode;
  }

  public void setColTransferMode(BigDecimal colTransferMode) {
    this.colTransferMode = colTransferMode;
  }

  public BigDecimal getDepositTransferType() {
    return depositTransferType;
  }

  public void setDepositTransferType(BigDecimal depositTransferType) {
    this.depositTransferType = depositTransferType;
  }

  public BigDecimal getDepositTransferMode() {
    return depositTransferMode;
  }

  public void setDepositTransferMode(BigDecimal depositTransferMode) {
    this.depositTransferMode = depositTransferMode;
  }

  public BigDecimal getUpdateFlag() {
    return updateFlag;
  }

  public void setUpdateFlag(BigDecimal updateFlag) {
    this.updateFlag = updateFlag;
  }

  public BigDecimal getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(BigDecimal currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  public List<String> getBranchCodeList() {
    return branchCodeList;
  }

  public void setBranchCodeList(List<String> branchCodeList) {
    this.branchCodeList = branchCodeList;
  }

  @Override
  public String toString() {
    return "CompanyInsertionDTO [accountType=" + accountType + ", authorizeBy=" + authorizeBy + ", authorizeTime="
        + authorizeTime + ", branchCode=" + branchCode + ", cashDepositType="
        + cashDepositType + ", checkDigit=" + checkDigit + ", chequeLogdeFlag=" + chequeLogdeFlag
        + ", chequeRealizeFlag=" + chequeRealizeFlag + ", colAccountType=" + colAccountType + ", colBranchCode="
        + colBranchCode + ", colCustomerNo=" + colCustomerNo + ", colRunningNo=" + colRunningNo + ", colTransferMode="
        + colTransferMode + ", colTransferType=" + colTransferType + ", currencyCode=" + currencyCode + ", customerNo="
        + customerNo + ", depositTransferMode=" + depositTransferMode + ", depositTransferType=" + depositTransferType
        + ", loginBranchCode=" + loginBranchCode + ", name=" + name + ", postBy=" + postBy + ", postDate=" + postDate
        + ", postTime=" + postTime + ", runningNo=" + runningNo + ", terminalId=" + terminalId + ", updateFlag="
        + updateFlag + "]";
  }

}
