
package com.teresol.core.api.core_api_company.dto.billdetaildto;

/**
* import libraries:
* com.fasterxml.jackson.annotation.JsonInclude: is used to Value that indicates that only properties with non-null values are to be included. \n &emsp;&emsp;&emsp;
*/
import com.fasterxml.jackson.annotation.JsonInclude;

/**
* <b> Class : <i>CreateBillDetailResponseDto</i> </b> \n &emsp;&emsp;&emsp;
* This is CreateBillDetailResponseDto class for DTO of multiple tables and get/set method. \n &emsp;&emsp;&emsp;
* <b>Service Names:</b> MainCompanyService.java \n &emsp;&emsp;&emsp;
* <b>Calling Classes:</b> MainCompanyService.java, MainResourse.java \n &emsp;&emsp;&emsp;
* @author       Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
* @version     1.1
*/



@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateBillDetailResponseDto {

  /** declaration of variables */
  private int rowsInserted;

  private String errorMessage;

  private boolean mBoolean;

  /** generation of constructors */
  public CreateBillDetailResponseDto() {
  }

  public CreateBillDetailResponseDto(int rowsInserted,boolean mBoolean) {
    this.rowsInserted = rowsInserted;
    this.mBoolean = mBoolean;
  }

  public CreateBillDetailResponseDto(int rowsInserted,  String errorMessage,boolean mBoolean) {
    this.rowsInserted = rowsInserted;
   
    this.errorMessage = errorMessage;
    this.mBoolean = mBoolean;
  }

  /** generation of getter/setter */
  
  public int getRowsInserted() {
    return rowsInserted;
  }

  public boolean ismBoolean() {
    return mBoolean;
  }

  public void setmBoolean(boolean mBoolean) {
    this.mBoolean = mBoolean;
  }

  public void setRowsInserted(int rowsInserted) {
    this.rowsInserted = rowsInserted;
  }



  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}
