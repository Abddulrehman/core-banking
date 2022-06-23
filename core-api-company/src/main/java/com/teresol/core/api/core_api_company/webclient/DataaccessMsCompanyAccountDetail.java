
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
* org.eclipse.microprofile.rest.client.inject.RegisterRestClient: is used to register an interface DataaccessMsValidateCompany as a RegisterRestClient
*/
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.teresol.core.api.core_api_company.dto.companyaccountdetaildto.GetCompanyAccountRequestDto;
import com.teresol.core.api.core_api_company.dto.companyaccountdetaildto.GetCompanyAccountResponseDto;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
* <b> Interface : <i>DataaccessMsCompanyAccountDetail</i> </b> \n &emsp;&emsp;&emsp;
* This is an interface  to access DA layer/method with the same path/url.\n &emsp;&emsp;&emsp;
* <b>Service Names:</b> CompanyMain.java \n &emsp;&emsp;&emsp;
* <b>Calling Module:</b> Data Access Layer \n &emsp;&emsp;&emsp;
* @author      Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
* @version     1.1
*/


@Path("/dataaccess-ms-companyaccount/damsCompanyAccountDetail")
@RegisterRestClient
public interface DataaccessMsCompanyAccountDetail {

  /**
   * Get Request
   * path /dataaccess-ms-companyaccount/damsCompanyAccountDetail
   * produced List of CompanyAccountResponseDtos in JSON format.
   * consume fnGetCompanyAccountDetail
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<GetCompanyAccountResponseDto> fnGetCompanyAccountDetail(
      @BeanParam GetCompanyAccountRequestDto companyAccountRequestDtoObj);

}
