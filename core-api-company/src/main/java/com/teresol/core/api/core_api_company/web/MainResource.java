/*! \brief <b>Folder Description </b> \n This is Class-Zero (Initiator) for recieving end-point Inputs via URL. passing further to Core DTO creation and DataAccess DA.
 *
 * 
 */

package com.teresol.core.api.core_api_company.web;

/**  
* import libraries and classes: 
* java.net.UnknownHostException to handle an exception of System Host Ip
* java.util.List: Manage lists being passed as arguments
* javax.inject.Inject: to use injection of MainCompanyService, Logger class in this class
* javax.ws.rs.Path: to declare of path of class or method
* javax.ws.rs.Produces: annotates that the method produces an output
* javax.ws.rs.core.MediaType: describes the type of output
* org.jboss.logging.Logger: to write logs when required
* javax.validation.Valid: to validate the dto properties
* javax.ws.rs.BeanParam: use to mapping value with dto property
*/

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
import com.teresol.core.api.core_api_company.services.MainCompanyService;
import java.net.UnknownHostException;
import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

/**
 * <b> Class : <i>MainResource</i> </b> \n &emsp;&emsp;&emsp;
 * This is Class-Zero (Initiator) for recieving end-point Inputs via URL.passing
 * further to Core DTO creation and DataAccess DA. \n &emsp;&emsp;&emsp;
 * <b>Service Names:</b> MainResource.java \n &emsp;&emsp;&emsp;
 * <b>Calling Class:</b> MainCompanyService.java \n &emsp;&emsp;&emsp;
 * 
 * @author Sumit Aakash, Abdul Samee
 * @version 1.1
 * @param url http://localhost:9080/core_api_company/
 * @return Final Resultset in form of List.
 */

@Path("/core-api-company")
public class MainResource {

  /** Logger object declaration */
  @Inject
  Logger loggerObj;

  /** Injection and declaration of MainCompanyService object */
  @Inject
  MainCompanyService companyServiceObj;

  /**
   * <b> Description </b> \n
   * <b>Request :</b> GET \n
   * <b>Path :</b> /core-api-company/companyAccountDetail \n
   * <b>Produces :</b> List of CompanyAccountResponseDto in JSON Format \n
   * <b>Consumes :</b>JSON \n
   * <b>Method :</b> fnGetCompanyAccountDetail
   * ***
   * 
   * @param companyAccountRequestDtoObj
   * @return List of CompanyAccountResponseDto in JSON format
   */

  @GET
  @Path("/companyAccountDetail")
  public List<GetCompanyAccountResponseDto> fnGetCompanyAccountDetail(
      @BeanParam @Valid GetCompanyAccountRequestDto companyAccountRequestDtoObj)
      throws InstantiationException, IllegalArgumentException, IllegalAccessException {

    loggerObj.debug("core: fnGetCompanyAccountDetail called");
    return companyServiceObj.fnGetCompanyAccount(companyAccountRequestDtoObj);

  }

  /**
   * <b> Description </b>\n
   * <b>Request :</b> /POST \n
   * <b>Path :</b> /core-api-company/validateCompanyAccount \n
   * <b>Produces :</b> ResponseDto's Property Boolean \n
   * <b>Consumes :</b> JSON \n
   * <b>Method : </b> fnValidateCompanyAccountDetail
   * ***
   * 
   * @param validateCompanyAccountRequestDtoObj
   * @return ResponseDto in JSON format
   */

  @POST
  @Path("/validateCompanyAccount")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public ResponseDto fnValidateCompanyAccountDetail(
      ValidateCompanyAccountRequestDto validateCompanyAccountRequestDtoObj) {

    loggerObj.debug("core: fnValidateCompanyAccountDetail called");
    return companyServiceObj.fnValidateCompanyAccountDetail(validateCompanyAccountRequestDtoObj);
  }

  /**
   * <b> Description </b>\n
   * <b>Request :</b> POST \n
   * <b>Path :</b> /core-api-company/validateCompany \n
   * <b>Produces :</b> ResponseDto's Property Boolean in JSON Format \n
   * <b>Consumes :</b> JSON \n
   * <b>Method :</b> fnValidateCompanyDetail \n
   * ***
   * 
   * @param validateCompanyRequestDtoObj
   * @return ResponseDto in JSON format
   */

  @POST
  @Path("/validateCompany")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public ResponseDto fnValidateCompanyDetail(
      ValidateCompanyRequestDto validateCompanyRequestDtoObj) {

    loggerObj.debug("core: fnValidateCompanyDetail called");
    return companyServiceObj.fnValidateCompanyDetail(validateCompanyRequestDtoObj);
  }

  /**
   * <b> Description </b>\n
   * <b>Request :</b> GET \n
   * <b>Path :</b> /core-api-company/companyDetail \n
   * <b>Produces :</b> List of CompanyDetailResponseDto in JSON Format \n
   * <b>Consumes :</b> JSON \n
   * <b>Method :</b> fnGetCompanyDetail
   * ***
   * 
   * @param getCompanyDetailRequestDtoObj
   * @return List of GetCompanyDetailResponseDto in JSON format
   */

  @GET
  @Path("/companyDetail")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public List<GetCompanyDetailResponseDto> fnGetCompanyDetail(
      @BeanParam @Valid GetCompanyDetailRequestDto getCompanyDetailRequestDtoObj) {
    loggerObj.debug("core: fnGetCompanyDetail called");

    return companyServiceObj.fnGetCompany(getCompanyDetailRequestDtoObj);
  }

  /**
   * <b> Description </b> \n
   * <b>Request :</b> POST \n
   * <b>Path :</b> /core-api-company/companyDetail \n
   * <b>Produces :</b> List of CompanyDetailResponseDto in JSON Format \n
   * <b>Consumes :</b> CreateCompanyDetailRequestDto \n
   * <b>Methood :</b> fnCreateCompanyDetail \n
   * ***
   * 
   * @param createCompanyDetailRequestDtoObj
   * @return CreateCompanyDetailResponseDto in JSON format
   */

  @POST
  @Path("/companyDetail")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public CreateCompanyDetailResponseDto fnCreateCompanyDetail(
      CreateCompanyDetailRequestDto createCompanyDetailRequestDtoObj) {

    String terminalId;

    try {
      terminalId = java.net.InetAddress.getLocalHost().getHostAddress();
      createCompanyDetailRequestDtoObj.setTerminalId(terminalId);
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }

    loggerObj.debug("core: fnCreateCompanyDetail called");
    return companyServiceObj.fnCreateCompany(createCompanyDetailRequestDtoObj);
  }

  /**
   * <b> Description </b>\n
   * <b>Request :</b> GET \n
   * <b>Path :</b> /core-api-company/billDetail \n
   * <b>Produces :</b> List of GetBillDetailResponseDto in JSON Format \n
   * <b>Consumes :</b> CreateCompanyDetailRequestDto \n
   * <b>Method :</b> fnGetBillDetail \n
   ** ***
   * 
   * @param getBillDetailRequestDtoObj
   * @return List of GetBillDetailResponseDto in JSON format
   */

  @GET
  @Path("/billDetail")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public List<GetBillDetailResponseDto> fnGetBillDetail(
      @BeanParam @Valid GetBillDetailRequestDto getBillDetailRequestDtoObj) {

    loggerObj.debug("core: fnGetBillDetail called");

    return companyServiceObj.fnGetBill(getBillDetailRequestDtoObj);
  }

  /**
   * <b> Description </b> \n
   * <b>Request :</b> POST \n
   * <b>Path :</b> /core-api-company/billDetail \n
   * <b>Produces :</b> List of CreateBillDetailResponseDto in JSON Format \n
   * <b>Consumes :</b> CreateBillDetailRequestDto \n
   * <b>Method :</b> fnCreateBillDetail \n
   ** ***
   * 
   * @param createBillerDetailRequestDtoObj
   * @return CreateBillDetailResponseDto in JSON format
   */

  @POST
  @Path("/billDetail")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public CreateBillDetailResponseDto fnCreateBillDetail(
      @Valid CreateBillDetailRequestDto createBillerDetailRequestDtoObj) {
    loggerObj.debug("core: fnCreateBillDetail called");

    return companyServiceObj.fnCreateBillDetail(createBillerDetailRequestDtoObj);
  }

  /**
   * <b> Description </b> \n
   * <b>Request :</b> PUT \n
   * <b>Path :</b> /core-api-company/billDetail \n
   * <b>Produces :</b> UpdateBillDetailResponseDto in JSON Format \n
   * <b>Consumes :</b> UpdateBillDetailRequestDto \n
   * <b>Method :</b> fnUpdateBillDetail \n
   ** ***
   * 
   * @param updateBillDetailRequestDtoObj
   * @return List of UpdateBillDetailResponseDto in JSON format
   */

  @PUT
  @Path("/billDetail")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public UpdateBillDetailResponseDto fnUpdateBillDetail(UpdateBillDetailRequestDto updateBillDetailRequestDtoObj) {
    loggerObj.debug("core: fnUpdateBillDetail called");
    return companyServiceObj.fnUpdateBill(updateBillDetailRequestDtoObj);
  }

  /**
   * <b> Description </b> \n
   * <b>Request :</b> DELETE \n
   * <b>Path :</b> /core-api-company/billDetail \n
   * <b>Produces :</b> DeleteBillResponseDto's propertie rowsDeleted in JSON
   * Format \n
   * <b>Consumes :</b> DeleteBillRequestDto \n
   * <b> Method :</b> fnDeleteBillDetail \n
   ** ***
   * 
   * @param deleteBillDetailRequestDtoObj
   * @return DeleteBillResponseDto in JSON format
   */

  @DELETE
  @Path("/billDetail")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public DeleteBillResponseDto fnDeleteBillDetail(
      @BeanParam @Valid DeleteBillRequestDto deleteBillDetailRequestDtoObj) {
    loggerObj.debug("core: fnDeleteBillDetail called");

    return companyServiceObj.fnDeleteBill(deleteBillDetailRequestDtoObj);
  }

  /**
   * <b> Description </b>c \n
   * <b>Request :</b> POST \n
   * <b>Path :</b>/core-api-company/validateBill \n
   * <b>Produces :</b> ResponseDto's Property Boolean \n
   * <b>Consumes </b> :JSON \n
   * <b>Method :</b> fnValidateBill \n
   ** ***
   * 
   * @param validateBillDetailRequestDto
   * @return ResponseDto in JSON format
   */

  @POST
  @Path("/validateBill")
  @Produces(MediaType.APPLICATION_JSON)
  public ResponseDto fnValidateBillDetails(ValidateBillDetailRequestDto validateBillDetailRequestDto) {

    loggerObj.debug("core: fnValidateBillDetails called");

    return companyServiceObj.fnValidateBill(validateBillDetailRequestDto);
  }

  /**
   * <b> Description </b>\n
   * <b>Request :</b> GET \n
   * <b>Path :</b> /core-api-company/customerDailyLimit \n
   * <b>Produces :</b> GetCustomerDailyLimitResponseDto dto in JSON Format \n
   * <b>Consumes :</b> GetCustomerDailyLimitRequestDto \n
   * <b>Method :</b> fnGetCustomerDailyLimit \n
   ** ***
   * 
   * @param getBillDetailRequestDtoObj
   * @return List of GetBillDetailResponseDto in JSON format
   */
  @GET
  @Path("/customerDailyLimit")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public GetCustomerDailyLimitResponseDto fnGetCustomerDailyLimit(
      @BeanParam @Valid GetCustomerDailyLimitRequestDto getCustomerDailyLimitRequestDtoObj) {

    loggerObj.info("companyDetail-web : fnGetCustomerDailyLimit called ");
    return companyServiceObj.fnGetCustomerDailyLimit(getCustomerDailyLimitRequestDtoObj);
  }

}
