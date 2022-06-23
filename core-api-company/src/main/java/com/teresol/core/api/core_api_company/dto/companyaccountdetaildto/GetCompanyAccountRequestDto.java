/*! \brief <b>Folder Description </b> \n This folder contains all request and response DTOs for Company Account Detail.*/


package com.teresol.core.api.core_api_company.dto.companyaccountdetaildto;

/**
 * import libraries:
 * java.math.BigDecimal: is used for managing type of DTO Properties
 * java.util.List:is used to manage list of response 
 * javax.validation.constraints.NotEmpty: is used for set the Propert that should not be Empty
 * javax.ws.rs.QueryParam: is used for get values in Query Parametters
 * javax.validation.constraints.NotNull: is used for set the Propert that should not be Null
 * javax.validation.constraints.NotEmpty: The annotated element must not be null nor empty.
 * io.smallrye.common.constraint.Nullable: An advisory annotation indicating that the given variable is nullable.
 */
import java.math.BigDecimal;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.ws.rs.QueryParam;
import io.smallrye.common.constraint.Nullable;

/**
* <b> Class : <i>GetCompanyAccountRequestDto</i> </b> \n &emsp;&emsp;&emsp;
* This class contains request DTO of table cmgmt_comp_ac_tl with getter/setter methods, this DTOs will be used in where clause of db's query \n &emsp;&emsp;&emsp;
* <b>Service Names:</b> GetCompanyAccountRequestDto.java \n &emsp;&emsp;&emsp;
* <b>Calling Classes:</b> MainCompanyService.java \n &emsp;&emsp;&emsp;
* @author       Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
* @version     1.1
*/
public class GetCompanyAccountRequestDto {

  /** declaration of variables */

  // Required
  @NotNull
  @QueryParam("branchCode")
  private BigDecimal branchCode;

  // Required
  @NotNull
  @QueryParam("accountType")
  private BigDecimal accountType;

  // Required
  @NotNull
  @QueryParam("customerNo")
  private BigDecimal customerNo;

  // Required
  @NotNull
  @QueryParam("runningNo")
  private BigDecimal runningNo;

  // Required
  @NotNull
  @QueryParam("loginBranchCode")
  private String loginBranchCode;

  @Nullable
  @QueryParam("identifier")
  private String identifier;



  // Response
  @NotEmpty
  @QueryParam("response")
  List<String> response;

  /** declaration of getter/setter */

  
  
  public BigDecimal getBranchCode() {
    return branchCode;
  }




  public String getIdentifier() {
    return identifier;
  }




  public void setIdentifier(String identifier) {
    this.identifier = identifier;
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

  public String getLoginBranchCode() {
    return loginBranchCode;
  }

  public void setLoginBranchCode(String loginBranchCode) {
    this.loginBranchCode = loginBranchCode;
  }

  public List<String> getResponse() {
    return response;
  }

  public void setResponse(List<String> response) {
    this.response = response;
  }

  @Override
  public String toString() {
    return "GetCompanyAccountRequestDto [accountType=" + accountType + ", branchCode=" + branchCode + ", customerNo="
        + customerNo + ", loginBranchCode=" + loginBranchCode + ", response=" + response + ", runningNo=" + runningNo
        + "]";
  }
}