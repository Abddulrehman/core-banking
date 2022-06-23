

package com.teresol.core.api.core_api_company.dto.billdetaildto;

/**
* import libraries:
* java.math.BigDecimal: is used for set the type of properties
* java.sql.Time: is used to set property type Time
* java.sql.Date: The class Date represents a specific instant in Date
* javax.validation.constraints.NotNull: is used to The annotated element must not be null
* javax.validation.constraints.NotNull: The annotated element must not be null
* javax.ws.rs.QueryParam: is used to get value in  query parameter
* io.smallrye.common.constraint.Nullable: An annotation indicating that the given variable is nullable.
*/
import java.math.BigDecimal;
import java.sql.Date;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.ws.rs.QueryParam;
import io.smallrye.common.constraint.Nullable;

/** 
* <b> Class : <i>GetBillDetailRequestDto</i> </b> \n &emsp;&emsp;&emsp;
* This class contains request DTO of table BILL_COL_TL with getter/setter methods, this DTOs will be used in where clause of db's query \n &emsp;&emsp;&emsp;
* <b>Service Names:</b> MainCompanyService.java \n &emsp;&emsp;&emsp;
* <b>Calling Classes:</b> MainCompanyService.java, MainResourse.java \n &emsp;&emsp;&emsp;
* @author       Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
* @version     1.1
*/



public class GetBillDetailRequestDto {

  /** declaration of variables */

  @NotNull
  @QueryParam("loginBranchCode")
  private String loginBranchCode; 

  @NotNull
  @QueryParam("branchCode")
  private String branchCode;

  @Nullable
  @QueryParam("transactionReferenceNo")
  private BigDecimal transactionReferenceNo;

  @Nullable
  @QueryParam("status")
  private BigDecimal status;

  @Nullable
  @QueryParam("chequeNo")
  private BigDecimal chequeNo;

  @Nullable
  @QueryParam("transferDate")
  private Date transferDate;

  @Nullable
  @QueryParam("companyId")
  private BigDecimal companyId;

  @NotEmpty
  @QueryParam("response")
  private String response;


  /** generation of getter/setter */
  
  public String getBranchCode() {
    return branchCode;
  }

  public String getLoginBranchCode() {
    return loginBranchCode;
  }

  public void setLoginBranchCode(String loginBranchCode) {
    this.loginBranchCode = loginBranchCode;
  }

  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }

  public BigDecimal getTransactionReferenceNo() {
    return transactionReferenceNo;
  }

  public void setTransactionReferenceNo(BigDecimal transactionReferenceNo) {
    this.transactionReferenceNo = transactionReferenceNo;
  }

  public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public BigDecimal getChequeNo() {
    return chequeNo;
  }

  public void setChequeNo(BigDecimal chequeNo) {
    this.chequeNo = chequeNo;
  }

  public Date getTransferDate() {
    return transferDate;
  }

  public void setTransferDate(Date transferDate) {
    this.transferDate = transferDate;
  }

  public BigDecimal getCompanyId() {
    return companyId;
  }

  public void setCompanyId(BigDecimal companyId) {
    this.companyId = companyId;
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  /** generation of toString method */
  @Override
  public String toString() {
    return "BillRequestDTO [branchCode=" + branchCode + ", chequeNo=" + chequeNo + ", companyId=" + companyId
        + ", response=" + response + ", status=" + status + ", transactionReferenceNo=" + transactionReferenceNo
        + ", transferDate=" + transferDate + "]";
  }

}
