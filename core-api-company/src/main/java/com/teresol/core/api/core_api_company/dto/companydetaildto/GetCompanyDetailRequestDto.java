
package com.teresol.core.api.core_api_company.dto.companydetaildto;

/**
 * import libraries:
 * java.util.List: is used for managing list
 * javax.validation.constraints.NotEmpty: is used to manage NotEmpty constraint of fields
 * javax.ws.rs.QueryParam: to manage the queryparams
 * io.smallrye.common.constraint.Nullable: is used to manage Nullable constraint of fields
 */
import java.util.List;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.ws.rs.QueryParam;
import io.smallrye.common.constraint.Nullable;

/**
* <b> Class : <i>GetCompanyDetailRequestDto</i> </b> \n &emsp;&emsp;&emsp;
* This class contains request DTO of table cmgmt_comp_info ,cmgmt_comp_ac_tl ,barcode_mapping, col_company_tl, company_barcode_tl, \n &emsp;&emsp;&emsp; go_dealer_info_tl, go_product_info_tl, mw_company_setup_tl,mw_rate_setup_tl, tl_wp_otc_company, branchtl with getter/setter methods, this DTOs will be used in where clause of db's query \n &emsp;&emsp;&emsp;
* <b>Service Names:</b> GetCompanyDetailRequestDto.java \n &emsp;&emsp;&emsp;
* <b>Calling Classes:</b> MainCompanyService.java, MainResourse.java \n &emsp;&emsp;&emsp;
* @author      Shandana Roheen, Abdul Rehman, Sumit Aakash, Abdul Samee
* @version     1.1
* @return      List
*/


public class GetCompanyDetailRequestDto {

    /** Optional */
    @Nullable
    @QueryParam("identifier")
    private String identifier;

    /** Optional */
    @Nullable
    @QueryParam("companyAccount")
    private String companyAccount;

    /** Optional */
    @Nullable
    @QueryParam("separatorExist")
    private String separatorExist;

    /** Optional */
    @Nullable
    @QueryParam("transferType")
    private String transferType;

    /** Optional */
    @Nullable
    @QueryParam("barcodeLength")
    private String barcodeLength;

    /** Optional */
    @Nullable
    @QueryParam("isEnabled")
    private String isEnabled;

    /** Optional */
    @Nullable
    @QueryParam("companyId")
    private String companyId;

    /** Optional */
    @Nullable
    @QueryParam("companyName")
    private String companyName;

    /** Optional */
    @Nullable
    @QueryParam("mappingCode")
    private String mappingCode;

    /** Optional */
    @Nullable
    @QueryParam("companyCode")
    private String companyCode;

    /** Optional */
    @Nullable
    @QueryParam("rateCompanyCode")
    private String rateCompanyCode;

    /** Optional */
    @Nullable
    @QueryParam("collectionBranchAllow")
    private String collectionBranchAllow;

    /** Optional */
    @Nullable
    @QueryParam("active")
    private String active;

    /** Optional */
    @Nullable
    @QueryParam("dealerCode")
    private String dealerCode;

    /** Optional */
    @Nullable
    @QueryParam("instrumentType")
    private String instrumentType;

    /** Optional */
    @Nullable
    @QueryParam("collectionCompanyShortName")
    private String collectionCompanyShortName;

    /** Optional */
    @Nullable
    @QueryParam("customerNo")
    private String customerNo;

    /** Optional */
    @Nullable
    @QueryParam("mapCode")
    private String mapCode;

    /** Optional */
    @Nullable
    @QueryParam("clearingAccount")
    private String clearingAccount;

    /** Optional */
    @Nullable
    @QueryParam("franchiseId")
    private String franchiseId;

    /** Required */
    @NotNull    
    @QueryParam("loginBranchCode")
    private String loginBranchCode;

    /** Response */
    @NotEmpty
    @QueryParam("response")
    List<String> response;



    /* declaration of getter/setter and toString methods */

    
    

    public String getCollectionCompanyShortName() {
        return collectionCompanyShortName;
    }

    public String getFranchiseId() {
        return franchiseId;
    }

    public void setFranchiseId(String franchiseId) {
        this.franchiseId = franchiseId;
    }

    public String getCompanyAccount() {
        return companyAccount;
    }

    public void setCompanyAccount(String companyAccount) {
        this.companyAccount = companyAccount;
    }

    public String getLoginBranchCode() {
        return loginBranchCode;
    }

    public void setLoginBranchCode(String loginBranchCode) {
        this.loginBranchCode = loginBranchCode;
    }

    public String getClearingAccount() {
        return clearingAccount;
    }

    public void setClearingAccount(String clearingAccount) {
        this.clearingAccount = clearingAccount;
    }

    public String getMapCode() {
        return mapCode;
    }

    public void setMapCode(String mapCode) {
        this.mapCode = mapCode;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getSeparatorExist() {
        return separatorExist;
    }

    public void setSeparatorExist(String separatorExist) {
        this.separatorExist = separatorExist;
    }

    public void setCollectionCompanyShortName(String collectionCompanyShortName) {
        this.collectionCompanyShortName = collectionCompanyShortName;
    }

    public String getMappingCode() {
        return mappingCode;
    }

    public void setMappingCode(String mappingCode) {
        this.mappingCode = mappingCode;
    }

    public String getRateCompanyCode() {
        return rateCompanyCode;
    }

    public void setRateCompanyCode(String rateCompanyCode) {
        this.rateCompanyCode = rateCompanyCode;
    }

    public String getBarcodeLength() {
        return this.barcodeLength;
    }

    public void setBarcodeLength(String barcodeLength) {
        this.barcodeLength = barcodeLength;
    }

    public String getIsEnabled() {
        return this.isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCollectionBranchAllow() {
        return this.collectionBranchAllow;
    }

    public void setCollectionBranchAllow(String collectionBranchAllow) {
        this.collectionBranchAllow = collectionBranchAllow;
    }

    public String getActive() {
        return this.active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getDealerCode() {
        return this.dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public List<String> getResponse() {
        return response;
    }

    public void setResponse(List<String> response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "GetCompanyDetailRequestDto [active=" + active + ", barcodeLength=" + barcodeLength
                + ", clearingAccount=" + clearingAccount + ", collectionBranchAllow=" + collectionBranchAllow
                + ", collectionCompanyShortName=" + collectionCompanyShortName + ", companyCode=" + companyCode
                + ", companyId=" + companyId + ", companyName=" + companyName + ", customerNo=" + customerNo
                + ", dealerCode=" + dealerCode + ", identifier=" + identifier + ", instrumentType=" + instrumentType
                + ", isEnabled=" + isEnabled + ", mapCode=" + mapCode + ", mappingCode=" + mappingCode
                + ", rateCompanyCode=" + rateCompanyCode + ", response=" + response + ", separatorExist="
                + separatorExist + ", transferType=" + transferType + "]";
    }

}
