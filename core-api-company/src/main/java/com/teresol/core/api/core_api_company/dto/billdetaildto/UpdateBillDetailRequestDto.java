
package com.teresol.core.api.core_api_company.dto.billdetaildto;

/**
 * import libraries:
 */



/**
* <b> Class : <i>UpdateBillDetailRequestDto</i> </b> \n &emsp;&emsp;&emsp;
* This class contains request DTO of table BILL_COL_TL with getter/setter methods, this DTOs will be used in where clause of db's query \n &emsp;&emsp;&emsp;
* <b>Service Names:</b> MainCompanyService.java \n &emsp;&emsp;&emsp;
* <b>Calling Classes:</b> MainCompanyService.java, MainResourse.java \n &emsp;&emsp;&emsp;
* @author       Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
* @version     1.1
*/

public class UpdateBillDetailRequestDto {

  /** description of variables */
  private BillDetailDto current;
  private BillDetailDto updated;
  private String loginBranchCode;

  /** generation of getters/setters */
  
  
  public BillDetailDto getCurrent() {
    return current;
  }


  public String getLoginBranchCode() {
    return loginBranchCode;
  }


  public void setLoginBranchCode(String loginBranchCode) {
    this.loginBranchCode = loginBranchCode;
  }


  public void setCurrent(BillDetailDto current) {
    this.current = current;
  }

  public BillDetailDto getUpdated() {
    return updated;
  }

  public void setUpdated(BillDetailDto updated) {
    this.updated = updated;
  }
}
