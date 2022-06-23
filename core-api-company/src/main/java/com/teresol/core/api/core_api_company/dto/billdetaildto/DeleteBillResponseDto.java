
package com.teresol.core.api.core_api_company.dto.billdetaildto;

/**
* import libraries:
* java.math.BigDecimal: is used for set the type of properties
* com.fasterxml.jackson.annotation.JsonInclude: is used to Value that indicates that only properties with non-null values are to be included.
*/

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.teresol.core.api.core_api_company.util.annotations.ResponseParam;


/** 
* <b> Class : <i>DeleteBillResponseDto</i> </b> \n &emsp;&emsp;&emsp;
* This is DeleteBillResponseDto class for DTO of multiple tables and get/set method. \n &emsp;&emsp;&emsp;
* <b>Service Names:</b> MainCompanyService.java \n &emsp;&emsp;&emsp;
* <b>Calling Classes:</b> MainCompanyService.java, MainResourse.java \n &emsp;&emsp;&emsp;
* @author       Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
* @version     1.1
*/


@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteBillResponseDto {

  /** declaration of variables */

  @ResponseParam(name = "branchCode")
  private BigDecimal branchCode;

  @ResponseParam(name = "companyId")
  private BigDecimal companyId;

  @ResponseParam(name = "consumerNo")
  private String consumerNo;


  @ResponseParam(name = "billMonth")
  private String billMonth;

  private int rowsDeleted;

  private String errorMessage;

  private boolean mBoolean;

  /** generation of constructors */
  DeleteBillResponseDto() {
  }

  public DeleteBillResponseDto(int rowsDeleted, boolean mBoolean) {
    this.rowsDeleted = rowsDeleted;
    this.mBoolean = mBoolean;
    
  }

  public DeleteBillResponseDto(int rowsDeleted,  String errorMessage,  boolean mBoolean) {
    this.rowsDeleted = rowsDeleted;
    this.mBoolean = mBoolean;
 
    this.errorMessage = errorMessage;

  }

  /** generation of getter/setter */

  
  public int getRowsDeleted() {
    return rowsDeleted;
  }

  public boolean ismBoolean() {
    return mBoolean;
  }

  public void setmBoolean(boolean mBoolean) {
    this.mBoolean = mBoolean;
  }

  public void setRowsDeleted(int rowsDeleted) {
    this.rowsDeleted = rowsDeleted;
  }

  public BigDecimal getBranchCode() {
    return branchCode;
  }

  public void setBranchCode(BigDecimal branchCode) {
    this.branchCode = branchCode;
  }

  public BigDecimal getCompanyId() {
    return companyId;
  }

  public void setCompanyId(BigDecimal companyId) {
    this.companyId = companyId;
  }

  public String getConsumerNo() {
    return consumerNo;
  }

  public void setConsumerNo(String consumerNo) {
    this.consumerNo = consumerNo;
  }

  public String getBillMonth() {
    return billMonth;
  }

  public void setBillMonth(String billMonth) {
    this.billMonth = billMonth;
  }

 

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

}
