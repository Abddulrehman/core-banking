

package com.teresol.core.api.core_api_company.webclient;

/**  
* import libraries and classes: 
* java.util.List: is used to manage the list of CompanyDetailResponseDto
* javax.ws.rs.Path: to declare of path of class or method
* javax.ws.rs.GET: is  used to define request type
* javax.ws.rs.POST: is  used to define request type
* javax.ws.rs.Consumes: annotates that the method will consumes an input
* javax.ws.rs.Produces: annotates that the method produces an output
* javax.ws.rs.BeanParam: use to mapping value with dto property
* javax.validation.Valid: to validate the dto properties
* org.eclipse.microprofile.rest.client.inject.RegisterRestClient: is used to register an interface DataaccessMsValidateCompany as a RegisterRestClient
*/
import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.teresol.core.api.core_api_company.dto.companydetaildto.CreateCompanyDetailRequestDto;
import com.teresol.core.api.core_api_company.dto.companydetaildto.CreateCompanyDetailResponseDto;
import com.teresol.core.api.core_api_company.dto.companydetaildto.GetCompanyDetailRequestDto;
import com.teresol.core.api.core_api_company.dto.companydetaildto.GetCompanyDetailResponseDto;
import com.teresol.core.api.core_api_company.dto.companydetaildto.GetCustomerDailyLimitRequestDto;
import com.teresol.core.api.core_api_company.dto.companydetaildto.GetCustomerDailyLimitResponseDto;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
* <b> Interface : <i>DataaccessMsCompanyDetail</i> </b> \n &emsp;&emsp;&emsp;
* This is an interface  to access DA layer/method with the same path/url.\n &emsp;&emsp;&emsp;
* <b> Service Names:</b> CompanyMain.java \n &emsp;&emsp;&emsp;
* <b>Calling Module:</b> Data Access Layer \n &emsp;&emsp;&emsp;
* @author       Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
* @version     1.1
*/



@Path("/dataaccess-ms-companydetail")
@RegisterRestClient
public interface DataaccessMsCompanyDetail {

  /**
   * GET Request
   * path /dataaccess-ms-companydetail/damsCompanyDetail
   * produced List of CompanyDetailResponseDto in JSON Format
   * Consumes JSON
   * fnGetCompanyDetail
   */
  @GET
  @Path("/damsCompanyDetail")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public List<GetCompanyDetailResponseDto> 
  fnGetCompanyDetail(
      @BeanParam @Valid GetCompanyDetailRequestDto getCompanyDetailRequestDtoObj);

  /**
   * POST Request
   * path /dataaccess-ms-companydetail/damsCompanyDetail
   * produced JSON
   * Consumes JSON for Insert
   * company Detail
   * ms_insertCompanyDetail
   */
  @POST
  @Path("/damsCompanyDetail")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public CreateCompanyDetailResponseDto fnCreateCompanyDetail(
      CreateCompanyDetailRequestDto createCompanyDetailRequestDtoObj);


       /**
   * GET Request
   * path /dataaccess-ms-companydetail/damsCustomerDailyLimit
   * produced GetCustomerDailyLimitResponseDto dto in JSON Format
   * Consumes JSON
   * fnGetCustomerDailyLimit
   */

@GET
@Path("/damsCustomerDailyLimit")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public GetCustomerDailyLimitResponseDto
fnGetCustomerDailyLimit(
    @BeanParam @Valid GetCustomerDailyLimitRequestDto getCompanyDetailRequestDtoObj);

}
    
