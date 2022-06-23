
package com.teresol.core.api.core_api_company.dto.companydetaildto;

/**
 * import Libraries
 * com.fasterxml.jackson.annotation.JsonInclude: to manage the NON_NULL Json fields
 */
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * <b> Class : <i>CreateCompanyDetailResponseDto</i> </b> \n &emsp;&emsp;&emsp;
 * This is CreateCompanyDetailResponseDto Class for DTO for response for
 * cmgmt_comp_info tables with constructors & get/set method. \n
 * &emsp;&emsp;&emsp;
 * <b>Service Names:</b> CreateCompanyDetailResponseDto.java \n
 * &emsp;&emsp;&emsp;
 * <b>Calling Classes:</b> MainCompanyService.java, MainResourse.java \n
 * &emsp;&emsp;&emsp;
 * 
 * @author Shandana Roheen, Abdul Rehman, Sumit Aakash, Abdul Samee
 * @version 1.1
 * @return List
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCompanyDetailResponseDto {

  /** declaration of variables */
  private int rowsInserted;

  private String errorMessage;
  private boolean mBoolean;

  /** construction of constructors and getter/setter methods */
  public CreateCompanyDetailResponseDto() {
  }

  public CreateCompanyDetailResponseDto(int rowsInserted, boolean mBoolean) {
    this.rowsInserted = rowsInserted;
    this.mBoolean = mBoolean;
  }

  public CreateCompanyDetailResponseDto(int rowsInserted, String errorMessage, boolean mBoolean) {
    this.rowsInserted = rowsInserted;
    this.mBoolean = mBoolean;
    this.errorMessage = errorMessage;
  }

  public int getRowsInserted() {
    return rowsInserted;
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

  public boolean ismBoolean() {
    return mBoolean;
  }

  public void setmBoolean(boolean mBoolean) {
    this.mBoolean = mBoolean;
  }
  

}
