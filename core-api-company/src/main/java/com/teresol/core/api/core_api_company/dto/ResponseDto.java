/*! \brief  <b>Folder Description </b> \n  This folder contain all request and response DTOs for Company Service
*
*
*/




package com.teresol.core.api.core_api_company.dto;

/**
* import libraries:
* java.math.BigDecimal: is used for set the type of properties
* java.sql.Time: is used to set property type Time
* java.util.Date: The class Date represents a specific instant in time
*/

import com.fasterxml.jackson.annotation.JsonInclude;

/**
* <b> Class : <i>BillDetailDto</i> </b> \n &emsp;&emsp;&emsp;
* This is ResponseDto with constructors & get/set method. \n &emsp;&emsp;&emsp;
* <b>Service Names:</b>BillDetailDto.java  \n &emsp;&emsp;&emsp;
* <b>Calling Class:</b>  MainCompanyService.java, MainResourse.java  \n &emsp;&emsp;&emsp;
* @author      Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
* @version     1.1
*/

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDto {

  private boolean validate;
  private String message;
  

  public boolean isValidate() {
    return validate;
  }

  public void setValidate(boolean validate) {
    this.validate = validate;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}
