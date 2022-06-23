
package com.teresol.core.api.core_api_company.dto.billdetaildto;

/**
* import libraries:
* java.math.BigDecimal: is used for set the type of properties
* javax.validation.constraints.NotNull: is used to The annotated element must not be null
* javax.ws.rs.QueryParam: is used to get value in  query parameter
*/
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.ws.rs.QueryParam;



/**
* <b> Class : <i>DeleteBillRequestDto</i> </b> \n &emsp;&emsp;&emsp;
* This class contains request DTO of table BILL_COL_TL with getter/setter methods, this DTOs will be used in where clause of db's query \n &emsp;&emsp;&emsp;
* <b>Service Names:</b> MainCompanyService.java \n &emsp;&emsp;&emsp;
* <b>Calling Classes:</b> MainCompanyService.java, MainResourse.java \n &emsp;&emsp;&emsp;
* @author       Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
* @version     1.1
*/
public class DeleteBillRequestDto {

  /** declaration of variables */
  @NotNull
  @QueryParam("loginBranchCode")
  private String loginBranchCode;


  @QueryParam("branchCode")
  private BigDecimal branchCode;

  @NotNull
  @QueryParam("companyId")
  private BigDecimal companyId;

  @NotNull
  @QueryParam("consumerNo")
  private BigDecimal consumerNo;

  @NotNull
  @QueryParam("billMonth")
  private BigDecimal billMonth;


  /** generation of getter/setter */
  
  public BigDecimal getBranchCode() {
    return branchCode;
  }

  public String getLoginBranchCode() {
    return loginBranchCode;
  }

  public void setLoginBranchCode(String loginBranchCode) {
    this.loginBranchCode = loginBranchCode;
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

  public BigDecimal getConsumerNo() {
    return consumerNo;
  }

  public void setConsumerNo(BigDecimal consumerNo) {
    this.consumerNo = consumerNo;
  }

  public BigDecimal getBillMonth() {
    return billMonth;
  }

  public void setBillMonth(BigDecimal billMonth) {
    this.billMonth = billMonth;
  }

}
