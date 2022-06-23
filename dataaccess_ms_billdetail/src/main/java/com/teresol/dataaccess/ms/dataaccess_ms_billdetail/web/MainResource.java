/*! \brief <b>Folder Description </b> \n This folder has the MainResource class that has all the exported http endpoints from this service.
 *
 * 
 */

package com.teresol.dataaccess.ms.dataaccess_ms_billdetail.web;

/**  
* import libraries and classes: 
* java.sql.SQLException: to throw SQL related exceptions being generated from the AccountService.java
* java.util.List: Manage lists being passed as arguments
* javax.inject.Inject: to use injection of AccountService class in this class
* javax.ws.rs.Path: to declare of path of class or method
* javax.ws.rs.Produces: annotates that the method produces an output
* javax.ws.rs.core.MediaType: describes the type of output
* org.jboss.logging.Logger: to write logs when required
* javax.validation.Valid: to validate the dto properties
* javax.ws.rs.BeanParam: use to mapping value with dto property
* MainCompanyAccountService.mainCompanyAccountService: to use an object for calling BatchCore method
* DTO.BillDetailResponseDTO: to use an object to recieve in dynamic method as parameter
* DTO.dto.BillDetailRequestDTO: to use an object to recieve in dynamic method as parameter
*/

import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.CreateBillDetailRequestDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.CreateBillDetailResponseDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.DeleteBillRequestDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.DeleteBillResponseDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.GetBillDetailRequestDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.GetBillDetailResponseDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.UpdateBillDetailRequestDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.UpdateBillDetailResponseDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.services.MainBillDetailService;

import org.jboss.logging.Logger;

/**
 * <b> Class : <i>MainResource</i> </b> \n &emsp;&emsp;&emsp;
 * This is main Class for calling BillDetail DA with seperate input and output
 * parts of the query \n &emsp;&emsp;&emsp;
 * <b>Service Names:</b> dataaccess-ms-billDetail_detail \n &emsp;&emsp;&emsp;
 * 
 * @author Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
 * @version 1.1
 * @param url http://localhost:8094/
 * @return Final Resultset in form of List.
 */
@Path("/dataaccess-ms-billDetail/damsBillDetail")
public class MainResource {

  /** Injection and declaration of Logger object */
  @Inject
  Logger loggerObj;

  /** Injection and declaration of MainBillDetailService object */
  @Inject
  MainBillDetailService mainBillDetailService;

  /**
   * <b> Description </b> \n
   * <b>Request :</b> GET \n
   * <b>Path :</b> /dataaccess-ms-billDetail/damsBillDetail \n
   * <b>Produces :</b> List of Bill Detail in JSON Format \n
   * <b>Consumes :</b> JSON \n
   * <b>Method :</b> fnGetBillDetail
   * ***
   * 
   * @param getBillDetailRequestDtoObj
   * @return List of getBillDetailRequestDtoObj in JSON format
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<GetBillDetailResponseDto> fnGetBillDetail(
      @BeanParam @Valid GetBillDetailRequestDto getBillDetailRequestDtoObj) {
    loggerObj.debug("dataaccess-ms-billdetail web : fnGetBillDetail called ");
    return mainBillDetailService.fnGetBill(getBillDetailRequestDtoObj);
  }

  /**
   * <b> Description </b> \n
   * <b>Request :</b> POST \n
   * <b>Path :</b> /dataaccess-ms-billDetail/damsBillDetail \n
   * <b>Produces :</b> CreateBillDetailResponseDtol in JSON Format \n
   * <b>Consumes :</b> CreateBillDetailRequestDto in JSON format \n
   * <b>Method :</b> fnCreateBillDetail
   * ***
   * 
   * @param createBillerDetailRequestDtoObj
   * @return CreateBillDetailResponseDto in JSON format
   */

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public CreateBillDetailResponseDto fnCreateBillDetail(
      @Valid CreateBillDetailRequestDto createBillerDetailRequestDtoObj) {
    loggerObj.debug("dataaccess-ms-billdetail web : fnCreateBillDetail called ");
    return mainBillDetailService.fnCreateBillDetail(createBillerDetailRequestDtoObj);
  }

  /**
   * <b> Description </b> \n
   * <b>Request :</b> PUT \n
   * <b>Path :</b> /dataaccess-ms-billDetail/damsBillDetail \n
   * <b>Produces :</b> UpdateBillDetailResponseDto in JSON Format \n
   * <b>Consumes :</b> UpdateBillDetailRequestDto in JSON format \n
   * <b>Method :</b> fnUpdateBillDetail
   * ***
   * 
   * @param updateBillDetailRequestDtoObj
   * @return UpdateBillDetailResponseDto in JSON format
   */

  @PUT
  @Produces(MediaType.APPLICATION_JSON)
  public UpdateBillDetailResponseDto fnUpdateBillDetail(UpdateBillDetailRequestDto updateBillDetailRequestDtoObj) {
    loggerObj.debug("dataaccess-ms-billdetail web : fnUpdateBillDetail called ");
    return mainBillDetailService.fnUpdateBillDetail(updateBillDetailRequestDtoObj);
  }

  /**
   * <b> Description </b> \n
   * <b>Request :</b> DELETE \n
   * <b>Path :</b> /dataaccess-ms-billDetail/damsBillDetail \n
   * <b>Produces :</b> DeleteBillResponseDto in JSON Format \n
   * <b>Consumes :</b> DeleteBillRequestDto in JSON format \n
   * <b>Method :</b> fnDeleteBillDetail
   * ***
   * 
   * @param deleteBillDetailRequestDtoObj
   * @return DeleteBillResponseDto in JSON format
   */

  @DELETE
  @Produces(MediaType.APPLICATION_JSON)
  public DeleteBillResponseDto fnDeleteBillDetail(
      @BeanParam @Valid DeleteBillRequestDto deleteBillDetailRequestDtoObj) {
    loggerObj.debug("dataaccess-ms-billdetail web : fnDeleteBillDetail called ");
    return mainBillDetailService.fnDeleteBillDetail(deleteBillDetailRequestDtoObj);
  }

}