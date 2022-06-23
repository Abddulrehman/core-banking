/*! \brief <b>Folder Description </b> \n  This folder contains MainCompanyService class to call microservice interface from webclient.*/

package com.teresol.core.api.core_api_company.services;

/**
* import libraries:
* javax.enterprise.context.RequestScoped: to initiate once for every request
* java.util.List: Manage lists being passed as arguments
* javax.inject.Inject: to use injection of MainCompanyService, Logger class in this class
* org.jboss.logging.Logger: use to inject Logger class
* org.eclipse.microprofile.rest.client.inject.RestClient: Use the RestClient qualifier on an injection to point to indicate that this injection point is meant to use an instance of a Type-Safe Rest Client.
*/

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import com.teresol.core.api.core_api_company.dto.ResponseDto;
import com.teresol.core.api.core_api_company.dto.billdetaildto.CreateBillDetailRequestDto;
import com.teresol.core.api.core_api_company.dto.billdetaildto.CreateBillDetailResponseDto;
import com.teresol.core.api.core_api_company.dto.billdetaildto.DeleteBillRequestDto;
import com.teresol.core.api.core_api_company.dto.billdetaildto.DeleteBillResponseDto;
import com.teresol.core.api.core_api_company.dto.billdetaildto.GetBillDetailRequestDto;
import com.teresol.core.api.core_api_company.dto.billdetaildto.GetBillDetailResponseDto;
import com.teresol.core.api.core_api_company.dto.billdetaildto.UpdateBillDetailRequestDto;
import com.teresol.core.api.core_api_company.dto.billdetaildto.UpdateBillDetailResponseDto;
import com.teresol.core.api.core_api_company.dto.companyaccountdetaildto.GetCompanyAccountRequestDto;
import com.teresol.core.api.core_api_company.dto.companyaccountdetaildto.GetCompanyAccountResponseDto;
import com.teresol.core.api.core_api_company.dto.companydetaildto.CreateCompanyDetailRequestDto;
import com.teresol.core.api.core_api_company.dto.companydetaildto.CreateCompanyDetailResponseDto;
import com.teresol.core.api.core_api_company.dto.companydetaildto.GetCompanyDetailRequestDto;
import com.teresol.core.api.core_api_company.dto.companydetaildto.GetCompanyDetailResponseDto;
import com.teresol.core.api.core_api_company.dto.companydetaildto.GetCustomerDailyLimitRequestDto;
import com.teresol.core.api.core_api_company.dto.companydetaildto.GetCustomerDailyLimitResponseDto;
import com.teresol.core.api.core_api_company.dto.validatebilldto.ValidateBillDetailRequestDto;
import com.teresol.core.api.core_api_company.dto.validatecompanydto.ValidateCompanyAccountRequestDto;
import com.teresol.core.api.core_api_company.dto.validatecompanydto.ValidateCompanyRequestDto;
import com.teresol.core.api.core_api_company.webclient.DataaccessMsCompanyDetail;
import com.teresol.core.api.core_api_company.webclient.DataaccessMsBillDetail;
import com.teresol.core.api.core_api_company.webclient.DataaccessMsCompanyAccountDetail;
import com.teresol.core.api.core_api_company.webclient.DataaccessMsValidateCompany;

/**
 * <b> Class : <i>MainCompanyService</i> </b> \n &emsp;&emsp;&emsp;
 * This core class assigns values to DTO lists and passes it into \n
 * &emsp;&emsp;&emsp;
 * <b>Service Names:</b> CompanyMain.java method \n &emsp;&emsp;&emsp;
 * <b>Calling Class:</b> MainResource.java \n &emsp;&emsp;&emsp;
 * <b>Calling RestClients:</b> DataaccessMsBillDetail.java
 * ,DataaccessMsCompanyAccountDetail.java DataaccessMsCompanyDetail.java
 * DataaccessMsValidateCompany.java
 * 
 * @author Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
 * @version 1.1
 * @return Final Resultset is in the form of a list in JSON format .
 */

@RequestScoped
public class MainCompanyService {

  /** Logger object declaration */
  @Inject
  Logger loggerObj;

  /**
   * Injection and declaration of dataaccessMsCompanyAccountDetailObj as
   * RestClient
   */
  @Inject
  @RestClient
  DataaccessMsCompanyDetail dataaccessMsCompanyDetailObj;

  /**
   * Injection and declaration of dataaccessMsCompanyAccountDetailObj as
   * RestClient
   */
  @Inject
  @RestClient
  DataaccessMsCompanyAccountDetail dataaccessMsCompanyAccountDetailObj;

  /**
   * I
   * njection and declaration of dataaccessMsValidateCompanyObj
   * as RestClient
   */
  @Inject
  @RestClient
  DataaccessMsValidateCompany dataaccessMsValidateCompanyObj;

  /**
   * Injection and declaration of dataaccessMsBillDetailObj
   * as RestClient
   */
  @Inject
  @RestClient
  DataaccessMsBillDetail dataaccessMsBillDetailObj;

  /**
   * **
   * <b>Description </b> \n &emsp;&emsp;&emsp;
   * <b>Table Used: </b> CMGMT_COMP_AC_TL \n &emsp;&emsp;&emsp;
   * <b>No of cases: 2 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case1 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input: </b> Branch Code,Account Type, Customer Number,Run Number \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Response: </b> Account Type,Customer Number,Run Number, Check Digit,Post
   * by,Post Time,Auth BY,Auth Time \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Retrun:</b>List of Company Accounts \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case2 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input: </b> Branch Code, Account Type, Customer Number, Run Number \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Response: </b> Account Type ,Customer Number, Run Number,Check Digit,Post
   * by,Post Time,Auth BY,Auth Time \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Retrun:</b> List of company accounts based on
   * ***
   * 
   * @param productConditionDetailRequestDtoObj
   * @return List of Company Accounts
   */
  public List<GetCompanyAccountResponseDto> fnGetCompanyAccount(
      GetCompanyAccountRequestDto companyAccountRequestDtoObj) {

    loggerObj.debug("core-company-service: fnGetCompanyAccount called");
    return dataaccessMsCompanyAccountDetailObj.fnGetCompanyAccountDetail(companyAccountRequestDtoObj);
  }

  /**
   * <b> Description </b> \n &emsp;&emsp;&emsp;
   * <b>Table Used: </b> actyptl,ccy_tl,product_limit_tl \n &emsp;&emsp;&emsp;
   * <b>Input: </b> Branch Code, Account Type, Customer Number,Run Number \n
   * &emsp;&emsp;&emsp;
   * <b>Response: </b>Branch Code \n
   * ***
   * 
   * @param ValidateCompanyAccountRequestDto
   * @return Response of either true or false
   */

  public ResponseDto fnValidateCompanyAccountDetail(
      ValidateCompanyAccountRequestDto validateCompanyAccountRequestDtoObj) {

    loggerObj.debug("core-company-service: fnValidateCompanyAccountDetail called");
    return dataaccessMsValidateCompanyObj.fnValidateCompanyAccount(validateCompanyAccountRequestDtoObj);
  }

  /**
   * <b> Description </b> \n &emsp;&emsp;&emsp;
   * <b>Table Used: </b> CMGMT_COMP_INFO \n &emsp;&emsp;&emsp;
   * <b>Input: </b> BranchCode \n &emsp;&emsp;&emsp;
   * <b>Response: </b>Branch Code \n
   * ***
   * 
   * @param ValidateCompanyRequestDto
   * @return Response of either true or false
   */

  public ResponseDto fnValidateCompanyDetail(
      ValidateCompanyRequestDto validateCompanyRequestDtoObj) {

    loggerObj.debug("core-company-service: fnValidateCompanyDetail called");
    return dataaccessMsValidateCompanyObj.fnValidateCompany(validateCompanyRequestDtoObj);
  }

  /**
   * <b>Description </b> \n &emsp;&emsp;&emsp;
   * <b>Table Used: </b> CMGMT_COMP_AC_TL \n &emsp;&emsp;&emsp;
   * <b>No of cases: 2 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case1 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input: </b> Multiple inputs based on desired output. \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Response: </b> Account Type,Customer Number,Run Number, Check Digit,Post
   * by,Post Time,Auth BY,Auth Time \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Retrun:</b>List of Company Accounts \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case2 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input: </b> Branch Code, Account Type, Customer Number, Run Number \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Response: </b> Account Type ,Customer Number, Run Number,Check Digit,Post
   * by,Post Time,Auth BY,Auth Time \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Retrun:</b> List of company accounts based on
   * ***
   * 
   * @param getCompanyDetailRequestDtoObj
   * @return List of GetCompanyDetailResponseDto based on given input(s).
   */
  public List<GetCompanyDetailResponseDto> fnGetCompany(GetCompanyDetailRequestDto getCompanyDetailRequestDtoObj) {

    loggerObj.debug("core-company-service: fnGetCompany called");
    return dataaccessMsCompanyDetailObj.fnGetCompanyDetail(getCompanyDetailRequestDtoObj);
  }

  /**
   * <b> Description </b> \n &emsp;&emsp;&emsp;
   * <b>Table Used: </b> CMGMT_COMP_INFO,MGMT_COMP_AC_TL \n &emsp;&emsp;&emsp;
   * <b>Input: </b> All the fields of CreateCompanyDetailRequestDto \n
   * &emsp;&emsp;&emsp;
   * <b>Response: </b>CreateCompanyDetailResponseDto: rowsEffected (If query
   * executed successfully).
   * Error and errorMessage (If there is an error executing th query). \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;
   * ***
   * 
   * @param createCompanyDetailRequestDtoObj
   * @return CreateCompanyDetailResponseDto
   */

  public CreateCompanyDetailResponseDto fnCreateCompany(
      CreateCompanyDetailRequestDto createCompanyDetailRequestDtoObj) {

    loggerObj.debug("core-company-service: fnCreateCompany called");
    return dataaccessMsCompanyDetailObj.fnCreateCompanyDetail(createCompanyDetailRequestDtoObj);
  }

  /**
   * <b> Description </b> \n &emsp;&emsp;&emsp;
   * <b>Table Used: </b> BILL_COL_TL \n &emsp;&emsp;&emsp;
   * <b>Input: </b> Branch Code \n &emsp;&emsp;&emsp;
   * <b>Response:
   * </b>transactionRefernceNo,transactionReferenceYear,billMonth,postBy,account1,companyId,slipNo,transactionAmont,
   * transactionDate,onlineReferenceNo,sourceBrnchCode \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;
   * ***
   * 
   * @param GetBillDetailRequestDto
   * @return List of BillDetails
   */

  public List<GetBillDetailResponseDto> fnGetBill(GetBillDetailRequestDto getBillDetailRequestDtoObj) {

    loggerObj.debug("core-company-service: fnGetBill called");
    return dataaccessMsBillDetailObj.fnGetBillDetail(getBillDetailRequestDtoObj);
  }

  /**
   * <b> Description </b> \n &emsp;&emsp;&emsp;
   * <b>Table Used: </b> BILL_COL_TL \n &emsp;&emsp;&emsp;
   * <b>Input: </b> All Table Rows \n &emsp;&emsp;&emsp;
   * <b>Response: </b> RowsAffected \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;
   * ***
   * 
   * @param CreateBillDetailRequestDto
   * @return CreateBillDetailResponseDto
   */
  public CreateBillDetailResponseDto fnCreateBillDetail(CreateBillDetailRequestDto createBillDetailRequestDtoObj) {

    loggerObj.debug("core-company-service: fnCreateBillDetail called");
    return dataaccessMsBillDetailObj.fnCreteBillDetail(createBillDetailRequestDtoObj);
  }

  /**
   * <b>Description </b> \n &emsp;&emsp;&emsp;
   * <b>Table Used: </b> actyptl,ccy_tl,acctyp_cond_tl \n &emsp;&emsp;&emsp;
   * <b>No of cases: 5 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case 1 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input: </b> Branch Code, Transaction ReferenceNumber, Transaction
   * Reference Year, Status \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Response: </b> RowsAffected \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Retrun:</b> UpdateBillDetailResponseDto \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case 2 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input:</b> Branch Code, Transaction Reference, Number Transaction
   * Reference
   * Year, Slip Number</b> Account Type \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Response: </b> RowsAffected \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Retrun:</b> UpdateBillDetailResponseDto \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case 3 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input:</b> Branch Code, Transaction ReferenceNumber transaction Reference
   * Year</b> Account Type \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Response: </b> RowsAffected \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Retrun:</b> UpdateBillDetailResponseDto \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case 4 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input:</b> Online Reference Number, Source BranchCode, Transaction Date,
   * Transaction Time, Slip Number, Account1 \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Response: </b> RowsAffected \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Retrun:</b> UpdateBillDetailResponseDto \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case 5 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input:</b> Online Reference Number, Source BranchCode, Transaction Date,
   * Transaction Time, Slip Number, Account1 \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Response: </b> RowsAffected \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Retrun:</b> UpdateBillDetailResponseDto \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * ***
   * 
   * @param UpdateBillDetailRequestDto
   * @return UpdateBillDetailResponseDto
   */

  public UpdateBillDetailResponseDto fnUpdateBill(UpdateBillDetailRequestDto updateBillDetailRequestDtoObj) {

    loggerObj.debug("core-company-service: fnUpdateBill called");
    return dataaccessMsBillDetailObj.fnUpdateBillDetail(updateBillDetailRequestDtoObj);
  }

  /**
   * <b> Description </b> \n &emsp;&emsp;&emsp;
   * <b>Table Used: </b> company_log_tl \n &emsp;&emsp;&emsp;
   * <b>Input: </b> deleteBillRequestDtoObj \n &emsp;&emsp;&emsp;
   * <b>Response: </b> RowsAffected \n &emsp;&emsp;&emsp;
   * <b>Retrun:</b> DeleteBillResponseDto \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * ***
   * 
   * @param deleteBillRequestDtoObj
   * @return DeleteBillResponseDto
   */

  public DeleteBillResponseDto fnDeleteBill(DeleteBillRequestDto deleteBillRequestDtoObj) {

    loggerObj.debug("core-company-service: fnDeleteBill called");
    return dataaccessMsBillDetailObj.fnDeleteBillDetail(deleteBillRequestDtoObj);
  }

  /**
   * <b>Description </b> \n &emsp;&emsp;&emsp;
   * <b>Table Used: </b> BIL_COL_TL \n &emsp;&emsp;&emsp;
   * <b>No of cases: 7 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case 1 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input: </b> companyId,contractAccount \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case 2 </b>
   * \n&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input:</b>billMonth, companyId,contractAccount</b> Account Type \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case 3 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input:</b> billMonth, companyId, slipNo \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case 4 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input:</b>onlineReferenceNo, transactionDate,
   * account1,slipNo,transactionTime,sourceBranchCode \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case 5 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input:</b> onlineReferenceNo, transactionDate,account1,slipNo,
   * transactionTime, stan \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case 6 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input:</b>onlineReferenceNo, transactionDate, account1, slipNo,
   * sourceBranchCode \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   * <b>Case 7 </b> \n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * <b>Input:</b>branchCode,transactionReferenceNumber,
   * transactionReferenceYear\n
   * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;&emsp;
   * ***
   * 
   * @param ValidateBillDetailRequestDto
   * @return Response of either true or false
   */

  public ResponseDto fnValidateBill(ValidateBillDetailRequestDto validateBillDetailRequestDto) {

    loggerObj.debug("core-company-service: fnValidateBill called");
    return dataaccessMsValidateCompanyObj.fnValidateBill(validateBillDetailRequestDto);
  }

   /**
   * <b>Description</b> \n &emsp;&emsp;&emsp;
   * <b>Table used:</b> CUSTDAYLMTL \n &emsp;&emsp;&emsp;
   * <b>Input:</b> branchCode, accountType, customerNo, runningNo, checkDigit, date, response
   * 
   * @param getCustomerDailyLimitRequestDtoObj
   * @return GetCustomerDailyLimitResponseDto as a response dto.
   */
  public  GetCustomerDailyLimitResponseDto fnGetCustomerDailyLimit(GetCustomerDailyLimitRequestDto getCustomerDailyLimitRequestDtoObj) {

    loggerObj.debug("core-company-service: fnGetCustomerDailyLimit called");
    return dataaccessMsCompanyDetailObj.fnGetCustomerDailyLimit(getCustomerDailyLimitRequestDtoObj);
  }

}
