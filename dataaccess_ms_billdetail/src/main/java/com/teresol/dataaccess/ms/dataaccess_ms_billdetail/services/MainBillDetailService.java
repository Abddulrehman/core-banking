/*! \brief  <b>Folder Description </b> \n 
This folder contains MainBillDetailService class containing all business logic of billDetail microservice.*/

package com.teresol.dataaccess.ms.dataaccess_ms_billdetail.services;

import java.lang.reflect.InvocationTargetException;

/**  
* import libraries and classes: 
* java.sql.Connection: to build connection to database
* java.sql.ResultSet: to store resultset of the executed database query
* java.sql.SQLException: to throw SQL related exceptions being generated from the DA layer
* java.sql.Statement: objeect used for executing a SQL statement and returning a resultset
* java.util.List: to manage three lists of type CompanyAccountDTO
* java.util.ArrayList: use to intanciate an ArrayList
* java.util.Arrays:use to hold an arrays
* java.util.Map: use to get a queryString and queryError from map
* javax.inject.Inject: to use injection of  AgroalDataSource , Utility,classes in this class
* javax.enterprise.context.RequestScoped: to initiate once for every request
* org.jboss.logging.Logger: to write logs when required
* io.agroal.api.AgroalDataSource: to use datasource object for retrieving data
*/

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.database.Datasources;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.CreateBillDetailRequestDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.CreateBillDetailResponseDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.DeleteBillRequestDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.DeleteBillResponseDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.GetBillDetailRequestDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.GetBillDetailResponseDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.UpdateBillDetailRequestDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.dto.UpdateBillDetailResponseDto;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.querystores.BillCollectionTlQueries;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.querystores.CompanyLogTlQueries;
import com.teresol.dataaccess.ms.dataaccess_ms_billdetail.util.ObjectMapper;

import org.jboss.logging.Logger;

/**
 * <b> Class : <i>MainBillDetailService</i> </b> \n &emsp;&emsp;&emsp;
 * This is main Class for calling BillDetail DA with seperate input and output
 * parts of the query \n &emsp;&emsp;&emsp;
 * <b>Service Names:</b> dataaccess_ms_billDetail_detail \n &emsp;&emsp;&emsp;
 * 
 * @author Shandana Roheen ,Abdul Rehman, Abdul Samee, Sumit Aakash
 * @version 1.1
 * @param url http://localhost:8094/
 * @return Final Resultset in form of List.
 */
@RequestScoped
public class MainBillDetailService {

  /** AgroalDataSource object declaration */
  @Inject
  Datasources dataSourcesObj;

  /** Utility object declaration */

  /** Logger object declaration */
  @Inject
  Logger loggerObj;

  public static final String CONNECTION_ERROR = "Connection Error";
  public static final String QUERY_STRING = "queryString";
  public static final String ERROR_MESSAGE = "errorMessage";

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
    loggerObj.debug("dataaccess-ms-billdetail services : fnGetBill called ");
    Map<String, String> query1;

    query1 = BillCollectionTlQueries.fnGetBillCollectionTlSelectQuery(getBillDetailRequestDtoObj);
    String query = query1.get(QUERY_STRING);

    if (getBillDetailRequestDtoObj.getTransactionReferenceNo() != null) {
      query += "  and   TRAN_REF_NO = '" + getBillDetailRequestDtoObj.getTransactionReferenceNo() + "' ";
    } else if (getBillDetailRequestDtoObj.getStatus() != null) {
      query += "  and   STATUS = '" + getBillDetailRequestDtoObj.getStatus() + "' ";
    } else if (getBillDetailRequestDtoObj.getChequeNo() != null) {
      query += "  and   cheque_no = '" + getBillDetailRequestDtoObj.getChequeNo() + "' ";
    } else if (getBillDetailRequestDtoObj.getTransferDate() != null) {
      query += "  and   TR_DATE = '" + getBillDetailRequestDtoObj.getTransferDate() + "' ";
    } else if (getBillDetailRequestDtoObj.getCompanyId() != null) {
      query += "  and   COMPANY_ID = '" + getBillDetailRequestDtoObj.getCompanyId() + "' ";
    }

    query1.put(QUERY_STRING, query);
    List<GetBillDetailResponseDto> dtoList = null;

    dtoList = fnExecuteQuery(GetBillDetailResponseDto.class,
        getBillDetailRequestDtoObj.getLoginBranchCode(),
        query1.get(QUERY_STRING),
        getBillDetailRequestDtoObj.getResponse());
    loggerObj.debug("dataaccess-ms-billdetail services : fnExecuteQuery called ");

    if (dtoList.isEmpty()) {
      dtoList.add(new GetBillDetailResponseDto(true, query1.get(ERROR_MESSAGE)));

    }

    return dtoList;
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
  public DeleteBillResponseDto fnDeleteBillDetail(
      DeleteBillRequestDto deleteBillRequestDtoObj) {
    loggerObj.debug("dataaccess-ms-billdetail services : fnDeleteBillDetail called ");
    Map<String, String> query1;
    query1 = CompanyLogTlQueries.fnGetCompanyLogTlDeleteQuery(deleteBillRequestDtoObj);
    String query = query1.get(QUERY_STRING);
    query1.put(QUERY_STRING, query);

    int rowsAffected = fnExecuteUpdate(deleteBillRequestDtoObj.getLoginBranchCode(),
        query1.get(QUERY_STRING));
    if (rowsAffected == 0) {
      return new DeleteBillResponseDto(rowsAffected,
          query1.get(ERROR_MESSAGE), true);
    }
    return new DeleteBillResponseDto(rowsAffected, true);
  }

  /**
   * <b>Description </b> \n &emsp;&emsp;&emsp;
   * fnExecuteQuery is create to build DB
   * connection and execute query to create,
   * update and delete records from table
   * 
   * @param getBillDetailRequestDtoObj
   * 
   * 
   * 
   * @return
   */
  public int fnExecuteUpdate(String loginBranchCode, String queryStr) {
    loggerObj.debug("dataaccess-ms-billdetail services : fnExecuteUpdate called ");
    int rowsAffected = 0;
    try (
        Connection connection = dataSourcesObj.getConnectionByBranch(loginBranchCode);
        Statement statement = connection.createStatement();) {
      rowsAffected = statement.executeUpdate(queryStr);
      loggerObj.info(rowsAffected);
    } catch (SQLException e) {
      loggerObj.error(e);
    }
    return rowsAffected;
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
    loggerObj.debug("dataaccess-ms-billdetail services : fnCreateBillDetail called ");
    Map<String, String> queryMapObj = BillCollectionTlQueries
        .fnGetBillCollectionTlInsertQuery(createBillDetailRequestDtoObj);

    int rowsAffected = fnExecuteUpdate(createBillDetailRequestDtoObj.getLoginBranchCode(),
        queryMapObj.get(QUERY_STRING));

    if (rowsAffected == 0) {
      return new CreateBillDetailResponseDto(rowsAffected,
          queryMapObj.get(ERROR_MESSAGE), true);
    }
    return new CreateBillDetailResponseDto(rowsAffected, false);
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
  public UpdateBillDetailResponseDto fnUpdateBillDetail(UpdateBillDetailRequestDto updateBillDetailRequestDtoObj) {
    loggerObj.debug("dataaccess-ms-billdetail services : fnUpdateBillDetail called ");
    Map<String, String> queryMapObj = BillCollectionTlQueries.fnGetBillCollectionTlUpdateQuery(
        updateBillDetailRequestDtoObj.getCurrent(),
        updateBillDetailRequestDtoObj.getUpdated());

    String loginBranchCode = updateBillDetailRequestDtoObj.getLoginBranchCode();

    int rowsAffected = fnExecuteUpdate(loginBranchCode, queryMapObj.get(QUERY_STRING));

    if (rowsAffected == 0) {
      return new UpdateBillDetailResponseDto(0,
          queryMapObj.get(ERROR_MESSAGE), true);
    }
    return new UpdateBillDetailResponseDto(rowsAffected, false);

  }

  /**
   * 
   * @param <T>
   * @param getBillDetailRequestDtoObj
   * @param branchCode
   * @param query
   * @param type
   * 
   * @return
   */
  public <T> List<T> fnExecuteQuery(Class<T> type, String loginBranchCode, String queryStr, List<String> projections) {
    loggerObj.debug("dataaccess-ms-billdetail services : fnExecuteQuery called ");
    List<T> list = new ArrayList<>();
    try (
        Connection connection = dataSourcesObj.getConnectionByBranch(loginBranchCode);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(queryStr);) {

      while (resultSet.next()) {
        T t = type.getDeclaredConstructor().newInstance();
        ObjectMapper.fnLoadResultSetIntoObject(resultSet, t, projections);
        list.add(t);
      }

    } catch (InstantiationException | IllegalAccessException | InvocationTargetException
        | NoSuchMethodException | SecurityException e) {
      loggerObj.error(e);
      // return (List<T>) Arrays.asList(new AccountTlDto(true, e.getMessage()))
    } catch (SQLException e) {
      loggerObj.error(e);
      // return (List<T>) Arrays.asList(new AccountTlDto(true, e.getMessage()))
    }
    return list;
  }

}
