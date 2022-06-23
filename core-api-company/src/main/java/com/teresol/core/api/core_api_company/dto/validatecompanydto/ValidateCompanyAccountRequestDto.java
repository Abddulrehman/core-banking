/*! \brief <b>Folder Description </b> \n This folder contains all request and response DTOs for  Validate endpoints of Company and Company Account.*/





package com.teresol.core.api.core_api_company.dto.validatecompanydto;

/**
 * import libraries:
 * javax.validation.constraints.NotNull: is used to manage NotNull constraint of field
 * io.smallrye.common.constraint.Nullable: is used to manage Nullable constraint of field
 */
import javax.validation.constraints.NotNull;
import io.smallrye.common.constraint.Nullable;

/**
* <b> Class : <i>ValidateCompanyAccountRequestDto</i> </b> \n &emsp;&emsp;&emsp;
* This class contains request DTO of table cmgmt_comp_ac_tl with getter/setter methods, this DTOs will be used in where clause of db's query \n &emsp;&emsp;&emsp;
* <b>Service Names:</b> ValidateCompanyAccountRequestDto.java \n &emsp;&emsp;&emsp;
* C<b>alling Classes:</b> MainCompanyService.java, MainResourse.java \n &emsp;&emsp;&emsp;
* @author      Shandana Roheen, Abdul Rehman, Sumit Aakash, Abdul Samee
* @version     1.1
* @return      List
*/
public class ValidateCompanyAccountRequestDto {

  /** declaration of Variables */
  // Optional
  @Nullable
  private String branchCode;

  // Optional
  @Nullable
  private String accountType;

  // Optional
  @Nullable
  private String customerNo;

  // Optional
  @Nullable
  private String runningNo;

  // Required
  @NotNull
  private String loginBranchCode;

  // Optional
  @Nullable
  private String colBranchCode;

  // Optional
  @Nullable
  private String colAccountType;

  // Optional
  @Nullable
  private String colCustomerNo;

  // Optional
  @Nullable
  private String colRunningNo;

  // Optional
  @Nullable
  private String name;

    /** Optional */
    @Nullable
    private String checkDigit;
     /** Optional */
  @Nullable
  private String identifier;

  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }
    
    public String getCheckDigit() {
      return checkDigit;
    }
  
  
  
  
    public void setCheckDigit(String checkDigit) {
      this.checkDigit = checkDigit;
    }

  /** declaration of getter/setter */

  
  public String getBranchCode() {
    return branchCode;
  }

  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public String getCustomerNo() {
    return customerNo;
  }

  public void setCustomerNo(String customerNo) {
    this.customerNo = customerNo;
  }

  public String getRunningNo() {
    return runningNo;
  }

  public void setRunningNo(String runningNo) {
    this.runningNo = runningNo;
  }

  public String getLoginBranchCode() {
    return loginBranchCode;
  }

  public void setLoginBranchCode(String loginBranchCode) {
    this.loginBranchCode = loginBranchCode;
  }

  public String getColBranchCode() {
    return colBranchCode;
  }

  public void setColBranchCode(String colBranchCode) {
    this.colBranchCode = colBranchCode;
  }

  public String getColAccountType() {
    return colAccountType;
  }

  public void setColAccountType(String colAccountType) {
    this.colAccountType = colAccountType;
  }

  public String getColCustomerNo() {
    return colCustomerNo;
  }

  public void setColCustomerNo(String colCustomerNo) {
    this.colCustomerNo = colCustomerNo;
  }

  public String getColRunningNo() {
    return colRunningNo;
  }

  public void setColRunningNo(String colRunningNo) {
    this.colRunningNo = colRunningNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /** declaration of toString method */
  @Override
  public String toString() {
    return "ValidateCompanyAccountRequestDTO [accountType=" + accountType + ", branchCode=" + branchCode
        + ", colAccountType=" + colAccountType + ", colBranchCode=" + colBranchCode + ", colCustomerNo=" + colCustomerNo
        + ", colRunningNo=" + colRunningNo + ", customerNo=" + customerNo + ", loginBranchCode=" + loginBranchCode
        + ", name=" + name + ", runningNo=" + runningNo + "]";
  }

}
