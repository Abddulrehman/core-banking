/*! \brief 
 <b>Folder Description </b> 
 \n This folder has the MainResource class that has all the exported http endpoints from this service.
 *
 * 
 */

package com.teresol.dataaccess.ms.dataaccess_ms_companydetail.web;

/**  
* import libraries and classes: 
* java.sql.SQLException: to throw SQL related exceptions being generated from the MainCompanyAccountService.java
* java.util.List: Manage lists being passed as arguments
* javax.inject.Inject: to use injection of MainCompanyAccountService class in this class
* javax.ws.rs.Path: to declare of path of class or method
* javax.ws.rs.Produces: annotates that the method produces an output
* javax.ws.rs.core.MediaType: describes the type of output
* org.jboss.logging.Logger: to write logs when required
* MainCompanyAccountService.mainCompanyAccountService: to use an object for calling BatchCore method
* DTO.CompanyAccountRequestDTO: to use an object to recieve in dynamic method as parameter
* DTO.CompanyInsertionDTO: to use an object to recieve in dynamic method as parameter
* DTO.CompanyAccountResponseDTO: to use an object to produce response of company Account
* DTO.ResponseDTO: used to set properties which produced response
* DTO.ValidateCompanyAccountRequestDTO: to use an object to recieve in dynamic method as parameter
* DTO.ValidateCompanyRequestDTO: tonuse an object to recive in dynamic method as parameter
*/

import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.teresol.dataaccess.ms.dataaccess_ms_companydetail.dto.CreateCompanyDetailRequestDto;
import com.teresol.dataaccess.ms.dataaccess_ms_companydetail.dto.CreateCompanyDetailResponseDto;
import com.teresol.dataaccess.ms.dataaccess_ms_companydetail.dto.GetCompanyDetailRequestDto;
import com.teresol.dataaccess.ms.dataaccess_ms_companydetail.dto.GetCompanyDetailResponseDto;
import com.teresol.dataaccess.ms.dataaccess_ms_companydetail.dto.GetCustomerDailyLimitRequestDto;
import com.teresol.dataaccess.ms.dataaccess_ms_companydetail.dto.GetCustomerDailyLimitResponseDto;
import com.teresol.dataaccess.ms.dataaccess_ms_companydetail.services.MainCompanyDetailService;

import org.jboss.logging.Logger;

/**
 * <b> Class : <i>MainResource</i> </b> \n &emsp;&emsp;&emsp;
 * This is main Class for calling companyDetail with seperate input and output
 * parts of the query. \n &emsp;&emsp;&emsp;
 * <b>Service Names:</b> companyDetail \n &emsp;&emsp;&emsp;
 * <b>Calling Classes:</b> MainCompanyDetailService.java \n &emsp;&emsp;&emsp;
 * CompanyAccountDTO.java \n &emsp;&emsp;&emsp;
 * 
 * @author Abdul Rehman , Shandana Roheen, Abdul Samee, Sumit Aakash
 * @version 1.1
 * @param url http://localhost:8091/
 * @return Final Resultset in form of List.
 */

@Path("/dataaccess-ms-companydetail")
public class MainResource {

  /** Injection and declaration of Logger object */
  @Inject
  Logger loggerObj;

  /** Injection and declaration of MainCompanyAccountService object */
  @Inject
  MainCompanyDetailService companyDetailServiceObj;

  /**
   * <b> Description </b> \n
   * <b>Request :</b>  POST  \n
   * <b>Path :</b> /damsCompanyDetail \n 
   * <b>Produces :</b> CreateCompanyDetailResponseDto \n
   * <b>Consumes :</b> JSON \n
   * <b>Method :</b> fnCreateCompanyDetail
   * ***  
   * @param getcompanyDetailRequestDtoObj
   * @return CreateCompanyDetailResponseDto in JSON Format
   */
  @POST
  @Path("/damsCompanyDetail")
  @Produces(MediaType.APPLICATION_JSON)
  public CreateCompanyDetailResponseDto fnCreateCompanyDetail(
      CreateCompanyDetailRequestDto createCompanyDetailRequestDtoObj) {
        loggerObj.debug("companyDetail-web : fnCreateCompanyDetail called");
    return companyDetailServiceObj.fnCreateCompany(createCompanyDetailRequestDtoObj);
  }

  /**
  * <b> Description </b> \n
   * <b>Request :</b>  GET  \n
   * <b>Path :</b> /damsCompanyDetail \n 
   * <b>Produces :</b>  List of GetCompanyDetailResponseDto in JSON Format \n
   * <b>Consumes :</b> JSON \n
   * <b>Method :</b> fnGetCompanyDetail
   * ***  
   * @param getcompanyDetailRequestDtoObj
   * @return List of GetCompanyDetailResponseDto in JSON Format
  */
  @GET
  @Path("/damsCompanyDetail")
  @Produces(MediaType.APPLICATION_JSON)
  public List<GetCompanyDetailResponseDto> fnGetCompanyDetail(
      @BeanParam @Valid GetCompanyDetailRequestDto getcompanyDetailRequestDtoObj) {

        loggerObj.debug("companyDetail-web : fnGetCompanyDetail called");
    return companyDetailServiceObj.fnGetCompany(getcompanyDetailRequestDtoObj);
  }

  /**
  * <b> Description </b> \n
   * <b>Request :</b>  GET  \n
   * <b>Path :</b> /damsCustomerDailyLimit \n 
   * <b>Produces :</b>  GetCustomerDailyLimitResponseDto dto in JSON Format \n
   * <b>Consumes :</b> JSON \n
   * <b>Method :</b> fnGetCustomerDailyLimit
   * ***  
   * @param getCustomerDailyLimitRequestDtoObj
   * @return GetCompanyDetailResponseDto dto in JSON Format
  */
  
  @GET
  @Path("/damsCustomerDailyLimit")
  @Produces(MediaType.APPLICATION_JSON)
  public GetCustomerDailyLimitResponseDto fnGetCustomerDailyLimit(
      @BeanParam @Valid GetCustomerDailyLimitRequestDto getCustomerDailyLimitRequestDtoObj) {
      
        loggerObj.debug("companyDetail-web : fnGetCompanyDetail called");
    return companyDetailServiceObj.fnGetCustomerDailyLimit(getCustomerDailyLimitRequestDtoObj);
  }


 


}
