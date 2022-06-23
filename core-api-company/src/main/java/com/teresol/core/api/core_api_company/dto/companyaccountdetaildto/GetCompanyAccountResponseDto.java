

package com.teresol.core.api.core_api_company.dto.companyaccountdetaildto;

/**
 * import libraries:
 * java.math.BigDecimal: is used for managing type of DTO Properties
 * com.fasterxml.jackson.annotation.JsonInclude: to manage the NON_NULL Json fields
 */

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.teresol.core.api.core_api_company.util.annotations.ResponseParam;



/**
* <b> Class : <i>GetCompanyAccountResponseDto</i> </b> \n &emsp;&emsp;&emsp;
* This is GetCompanyAccountResponseDto Class for DTO of cmgmt_ac_tl table with constructors & get/set method. \n &emsp;&emsp;&emsp;
* <b>Service Names:</b> MainCompanyService.java \n &emsp;&emsp;&emsp;
* <b>Calling Classes:</b> MainCompanyService.java, MainResourse.java \n &emsp;&emsp;&emsp;
* @author     Shandana Roheen, Abdul Rehman, Sumit Aakash, Abdul Samee
* @version     1.1
* @return      List
*/

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCompanyAccountResponseDto {

  /** description of variables */

  @ResponseParam(name = "branchCode")
  private BigDecimal branchCode;


  @ResponseParam(name = "accountType")
  private BigDecimal accountType;


  @ResponseParam(name = "customerNo")
  private BigDecimal customerNo;

  @ResponseParam(name = "runningNo")
  private BigDecimal runningNo;


  @ResponseParam(name = "name")
  private String name;

 
  @ResponseParam(name = "loginBranchCode")
  private BigDecimal loginBranchCode;

  @ResponseParam(name = "colBranchCode")
  private BigDecimal colBranchCode;


  @ResponseParam(name = "colAccountType")
  private BigDecimal colAccountType;

  @ResponseParam(name = "colCustomerNo")
  private BigDecimal colCustomerNo;

 
  @ResponseParam(name = "colRunningNo")
  private BigDecimal colRunningNo;

  @ResponseParam(name = "checkDigit")
  private BigDecimal checkDigit;

  @ResponseParam(name = "address")
  private BigDecimal address;

 
  @ResponseParam(name = "centerOpeningDate")
  private BigDecimal centerOpeningDate;

 
  @ResponseParam(name = "postBy")
  private BigDecimal postBy;


  @ResponseParam(name = "postTime")
  private BigDecimal postTime;


  @ResponseParam(name = "authBy")
  private BigDecimal authBy;

  
  @ResponseParam(name = "authTime")
  private BigDecimal authTime;

  @ResponseParam(name = "terminalId")
  private BigDecimal terminalId;

 
  @ResponseParam(name = "postDate")
  private BigDecimal postDate;

  @ResponseParam(name = "chequeLogdeFlag")
  private BigDecimal chequeLogdeFlag;

  @ResponseParam(name = "checkRealizeFlag")
  private BigDecimal checkRealizeFlag;

  @ResponseParam(name = "cashDepositType")
  private BigDecimal cashDepositType;


  @ResponseParam(name = "colTransferType")
  private BigDecimal colTransferType;

  @ResponseParam(name = "colTransferMode")
  private BigDecimal colTransferMode;

  @ResponseParam(name = "depositTransferType")
  private BigDecimal depositTransferType;

 
  @ResponseParam(name = "depositTransferMode")
  private BigDecimal depositTransferMode;

 
  @ResponseParam(name = "currencyCode")
  private BigDecimal currencyCode;
  private String errorMessage;
  private boolean mBoolean;

  /** declaration of constructors */

  public GetCompanyAccountResponseDto() {

  }

  public GetCompanyAccountResponseDto( String errorMessage,boolean mBoolean) {

    this.errorMessage = errorMessage;
    this.mBoolean = mBoolean;
  }

  /** declaration of getter/setter */

  


  public String getErrorMessage() {
    return errorMessage;
  }

  public boolean ismBoolean() {
    return mBoolean;
  }

  public void setmBoolean(boolean mBoolean) {
    this.mBoolean = mBoolean;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getLoginBranchCode() {
    return loginBranchCode;
  }

  public void setLoginBranchCode(BigDecimal loginBranchCode) {
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

  public BigDecimal getCheckDigit() {
    return checkDigit;
  }

  public void setCheckDigit(BigDecimal checkDigit) {
    this.checkDigit = checkDigit;
  }

  public BigDecimal getAddress() {
    return address;
  }

  public void setAddress(BigDecimal address) {
    this.address = address;
  }

  public BigDecimal getCenterOpeningDate() {
    return centerOpeningDate;
  }

  public void setCenterOpeningDate(BigDecimal centerOpeningDate) {
    this.centerOpeningDate = centerOpeningDate;
  }

  public BigDecimal getPostBy() {
    return postBy;
  }

  public void setPostBy(BigDecimal postBy) {
    this.postBy = postBy;
  }

  public BigDecimal getPostTime() {
    return postTime;
  }

  public void setPostTime(BigDecimal postTime) {
    this.postTime = postTime;
  }

  public BigDecimal getAuthBy() {
    return authBy;
  }

  public void setAuthBy(BigDecimal authBy) {
    this.authBy = authBy;
  }

  public BigDecimal getAuthTime() {
    return authTime;
  }

  public void setAuthTime(BigDecimal authTime) {
    this.authTime = authTime;
  }

  public BigDecimal getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(BigDecimal terminalId) {
    this.terminalId = terminalId;
  }

  public BigDecimal getPostDate() {
    return postDate;
  }

  public void setPostDate(BigDecimal postDate) {
    this.postDate = postDate;
  }

  public BigDecimal getChequeLogdeFlag() {
    return chequeLogdeFlag;
  }

  public void setChequeLogdeFlag(BigDecimal chequeLogdeFlag) {
    this.chequeLogdeFlag = chequeLogdeFlag;
  }

  public BigDecimal getCheckRealizeFlag() {
    return checkRealizeFlag;
  }

  public void setCheckRealizeFlag(BigDecimal checkRealizeFlag) {
    this.checkRealizeFlag = checkRealizeFlag;
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

  public BigDecimal getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(BigDecimal currencyCode) {
    this.currencyCode = currencyCode;
  }

}
