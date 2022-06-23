

package com.teresol.core.api.core_api_company.webclient;

/**  
* import libraries and classes: 
* javax.ws.rs.Path: to declare of path of class or method
* javax.ws.rs.GET: is  used to define request type
* javax.ws.rs.POST: is  used to define request type
* javax.ws.rs.Consumes: annotates that the method will consumes an input
* javax.ws.rs.Produces: annotates that the method produces an output
* org.eclipse.microprofile.rest.client.inject.RegisterRestClient: is used to register an interface DataaccessMsValidateCompany as a RegisterRestClient
*/
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.teresol.core.api.core_api_company.dto.ResponseDto;
import com.teresol.core.api.core_api_company.dto.validatebilldto.ValidateBillDetailRequestDto;
import com.teresol.core.api.core_api_company.dto.validatecompanydto.ValidateCompanyAccountRequestDto;
import com.teresol.core.api.core_api_company.dto.validatecompanydto.ValidateCompanyRequestDto;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
* <b> Interface : <i>DataaccessMsValidateCompany</i> </b> \n &emsp;&emsp;&emsp;
* This is an interface  to access DA layer/method with the same path/url.\n &emsp;&emsp;&emsp;
* <b>Service Names:</b> CompanyMain.java \n &emsp;&emsp;&emsp;
* <b>Calling Module:</b> Data Access Layer \n &emsp;&emsp;&emsp;
* @author       Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
* @version     1.1
*/

@Path("/dataaccess-ms-validatecompany")
@RegisterRestClient
public interface DataaccessMsValidateCompany {

  /**
   * POST Request
   * path /validateCompanyAccount
   * produced Boolean
   * Consumes JSON for
   * validateCompanyAccount
   */
  @POST
  @Path("/damsValidateCompanyAccount")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public ResponseDto fnValidateCompanyAccount(
      ValidateCompanyAccountRequestDto validateCompanyAccountRequestDTO);

  /**
   * POST Request
   * path /validateCompany
   * produced Boolean
   * Consumes JSON for
   * fnValidateCompany
   */
  @POST
  @Path("/damsValidateCompany")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public ResponseDto fnValidateCompany(
      ValidateCompanyRequestDto validateCompanyRequestDTO);

  /**
   * POST Request
   * path /validateBill
   * produced Boolean
   * Consumes JSON for
   * fnValidateBill
   */
  @POST
  @Path("/damsValidateBill")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public ResponseDto fnValidateBill(
          ValidateBillDetailRequestDto validateBillDetailRequestDto);

}
