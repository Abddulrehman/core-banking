
package com.teresol.core.api.core_api_company.dto.billdetaildto;

/**
* import libraries:* com.fasterxml.jackson.annotation.JsonInclude: is used to Value that indicates that only properties with non-null values are to be included.
*/
import com.fasterxml.jackson.annotation.JsonInclude;



/**
* <b> Class : <i>UpdateBillDetailResponseDto</i> </b> \n &emsp;&emsp;&emsp;
* This is UpdateBillDetailResponseDto class for DTO of multiple tables and get/set method. \n &emsp;&emsp;&emsp;
* <b>Service Names:</b>MainCompanyService.java \n &emsp;&emsp;&emsp;
* <b>Calling Classes:</b> MainCompanyService.java, MainResourse.java \n &emsp;&emsp;&emsp;
* @author       Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
* @version     1.1
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateBillDetailResponseDto {

  /** declaration of variables */
  private int rowsUpdated;
  
  private String errorMessage;
  private boolean mBoolean;

  /** generation of constructors */
  public UpdateBillDetailResponseDto() {
  }

  public UpdateBillDetailResponseDto(int rowsUpdated, boolean mBoolean) {
    this.rowsUpdated = rowsUpdated;
    this.mBoolean = mBoolean;

  }

  public UpdateBillDetailResponseDto(int rowsUpdated,  String errorMessage,boolean mBoolean) {
    this.rowsUpdated = rowsUpdated;
    this.mBoolean = mBoolean;
    
    this.errorMessage = errorMessage;
  }

  /** generation of getter/setter */
  
  public int getRowsUpdated() {
    return rowsUpdated;
  }

  public boolean ismBoolean() {
    return mBoolean;
  }

  public void setmBoolean(boolean mBoolean) {
    this.mBoolean = mBoolean;
  }

  public void setRowsUpdated(int rowsUpdated) {
    this.rowsUpdated = rowsUpdated;
  }



  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}
