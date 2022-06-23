/*! \brief ValidateCompanyRequestDto is for returning values for select(validate) queries
*
*
*/


package com.teresol.core.api.core_api_company.dto.validatecompanydto;

/**
 * import libraries:
 * io.smallrye.common.constraint.Nullable: is used to manage Nullable constraint of field
 */
import io.smallrye.common.constraint.NotNull;



/**
* <b> Class : <i>ValidateCompanyRequestDto</i> </b> \n &emsp;&emsp;&emsp;
* This class contains request DTO of table cmgmt_comp_info with getter/setter methods, this DTOs will be used in where clause of db's query \n &emsp;&emsp;&emsp;
* <b>Service Names:</b> ValidateCompanyRequestDto.java \n &emsp;&emsp;&emsp;
* <b>Calling Classes:</b> MainCompanyService.java, MainResourse.java \n &emsp;&emsp;&emsp;
* @author      Shandana Roheen, Abdul Rehman, Sumit Aakash, Abdul Samee
* @version     1.1
* @return      List
*/
public class ValidateCompanyRequestDto {

  /** declaration of variable */
  // Required
  @NotNull
  private String branchCode;

   // Required
   @NotNull
   private String loginBranchCode;


   /** Required */
 @NotNull
 private String accountType;
 
  /** Required */
  @NotNull
  private String customerNo;

   /** Required */
   @NotNull
   private String runningNo;

   /** Required */
   @NotNull
   private String checkDigit;


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

  public String getLoginBranchCode() {
    return loginBranchCode;
  }

  public void setLoginBranchCode(String loginBranchCode) {
    this.loginBranchCode = loginBranchCode;
  }

  /** declairation of toString method */
  @Override
  public String toString() {
    return "CompanyValidateRequestDTO [branchCode=" + branchCode + "]";
  }
}
