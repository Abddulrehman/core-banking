
package com.teresol.core.api.core_api_company.webclient;

/**  
* import libraries and classes: 
* java.util.List: is used to manage the list of CompanyDetailResponseDto
* javax.ws.rs.Path: to declare of path of class or method
* javax.ws.rs.GET: is  used to define request type GET
* javax.ws.rs.POST: is  used to define request type POST
* javax.ws.rs.PUT: is  used to define request type PUT
* javax.ws.rs.DELETE: is  used to define request DELETE
* javax.ws.rs.Produces: annotates that the method produces an output
* javax.ws.rs.BeanParam: use to mapping value with dto property
* javax.validation.Valid: to validate the dto properties
* org.eclipse.microprofile.rest.client.inject.RegisterRestClient: is used to register an interface DataaccessMsValidateCompany as a RegisterRestClient
*/
import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.teresol.core.api.core_api_company.dto.billdetaildto.CreateBillDetailRequestDto;
import com.teresol.core.api.core_api_company.dto.billdetaildto.CreateBillDetailResponseDto;
import com.teresol.core.api.core_api_company.dto.billdetaildto.DeleteBillRequestDto;
import com.teresol.core.api.core_api_company.dto.billdetaildto.DeleteBillResponseDto;
import com.teresol.core.api.core_api_company.dto.billdetaildto.GetBillDetailRequestDto;
import com.teresol.core.api.core_api_company.dto.billdetaildto.GetBillDetailResponseDto;
import com.teresol.core.api.core_api_company.dto.billdetaildto.UpdateBillDetailRequestDto;
import com.teresol.core.api.core_api_company.dto.billdetaildto.UpdateBillDetailResponseDto;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
* <b> Interface : <i>DataaccessMsBillDetail</i> </b> \n &emsp;&emsp;&emsp;
* This is an interface  to access DA layer/method with the same path/url.\n &emsp;&emsp;&emsp;
* <b>Service Names:</b> DataaccessMsBillDetail.java \n &emsp;&emsp;&emsp;
* <b>Calling Module:</b> Data Access Layer \n &emsp;&emsp;&emsp;
* @author       Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
* @version     1.1
*/



@Path("/dataaccess-ms-billDetail/damsBillDetail")
@RegisterRestClient
public interface DataaccessMsBillDetail {

  /**
   * Get Request
   * path /dataaccess-ms-billDetail/damsBillDetail
   * produced list of BillDetailResponseDto in JSON format
   * fnGetBillDetail
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<GetBillDetailResponseDto> fnGetBillDetail(
      @BeanParam @Valid GetBillDetailRequestDto getBillDetailRequestDtoObj);

  /**
   * POST Request
   * path /dataaccess-ms-billDetail/damsBillDetail
   * produced CreateBillDetailResponseDto in JSON format
   * fnCreteBillDetail
   */
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public CreateBillDetailResponseDto fnCreteBillDetail(
      @Valid CreateBillDetailRequestDto createBillDetailRequestDtoObj);

  /**
   * PUT Request
   * path /dataaccess-ms-billDetail/damsBillDetail
   * produced UpdateBillDetailResponseDto in JSON format
   * fnUpdateBillDetail
   */
  @PUT
  @Produces(MediaType.APPLICATION_JSON)
  public UpdateBillDetailResponseDto fnUpdateBillDetail(
      UpdateBillDetailRequestDto updateBillDetailRequestDtoObj);

  /**
   * DELETE Request
   * path /dataaccess-ms-billDetail/damsBillDetail
   * produced DeleteBillResponseDto's property in JSON format
   * fnDeleteBillDetail
   */
  @DELETE
  @Produces(MediaType.APPLICATION_JSON)
  public DeleteBillResponseDto fnDeleteBillDetail(
      @BeanParam @Valid DeleteBillRequestDto deleteBillRequestDtoObj);

}
