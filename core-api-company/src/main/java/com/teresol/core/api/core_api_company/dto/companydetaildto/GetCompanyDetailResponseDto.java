
package com.teresol.core.api.core_api_company.dto.companydetaildto;

/**
 * import libraries:
 * java.math.BigDecimal: is used for managing BigDecimal datatype
 * java.math.BigInteger: is used for managing BigInteger datatype
 * com.fasterxml.jackson.annotation.JsonInclude: to manage the NON_NULL Json fields
 */
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.teresol.core.api.core_api_company.util.annotations.ResponseParam;

/**
 * <b> Class : <i>GetCompanyDetailResponseDto</i> </b> \n &emsp;&emsp;&emsp;
 * This is GetCompanyDetailResponseDto Class for DTO for response for
 * cmgmt_comp_info ,cmgmt_comp_ac_tl ,barcode_mapping, col_company_tl,
 * company_barcode_tl tables with constructors & get/set method. \n
 * &emsp;&emsp;&emsp;
 * <b>Service Names:</b> GetCompanyDetailResponseDto.java \n &emsp;&emsp;&emsp;
 * <b>Calling Classes:</b> MainCompanyService.java, MainResourse.java \n
 * &emsp;&emsp;&emsp;
 * 
 * @author Shandana Roheen, Abdul Rehman, Sumit Aakash, Abdul Samee
 * @version 1.1
 * @return List
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCompanyDetailResponseDto {

    /** declaration of variables */

    @ResponseParam(name = "branchCode")
    private BigDecimal branchCode;

    @ResponseParam(name = "companyBarcodeCompanyId")
    private Integer companyBarcodeCompanyId;

    @ResponseParam(name = "name")
    private String name;

    @ResponseParam(name = "companyId")
    private BigDecimal companyId;

    @ResponseParam(name = "barcodeMappingBarcodeLength")
    private String barcodeMappingBarcodeLength;

    @ResponseParam(name = "companyBarcodeLength")
    private Integer companyBarcodeLength;

    @ResponseParam(name = "separatorExist")
    private String separatorExist;

    @ResponseParam(name = "companyName")
    private String companyName;

    @ResponseParam(name = "companyAccount")
    private String companyAccount;

    @ResponseParam(name = "mappingCode")
    private String mappingCode;

    @ResponseParam(name = "companyAbr")
    private String companyAbr;

    @ResponseParam(name = "companyCode")
    private String companyCode;

    @ResponseParam(name = "creditTransactionCode")
    private Long creditTransactionCode;

    @ResponseParam(name = "creditActivityCode")
    private String creditActivityCode;

    @ResponseParam(name = "debitTransactionCode")
    private Long debitTransactionCode;

    @ResponseParam(name = "debitActivityCode")
    private String debitActivityCode;

    @ResponseParam(name = "incomeTransactionCode")
    private Long incomeTransactionCode;

    @ResponseParam(name = "incomeActivityCode")
    private String incomeActivityCode;

    @ResponseParam(name = "fedTransactionCode")
    private Long fedTransactionCode;

    @ResponseParam(name = "fedActivityCode")
    private String fedActivityCode;

    @ResponseParam(name = "extraTransactionCode")
    private BigInteger extraTransactionCode;

    @ResponseParam(name = "extraActivityCode")
    private String extraActivityCode;

    @ResponseParam(name = "prmFlagName")
    private String prmFlagName;

    @ResponseParam(name = "minimumAmount")
    private Double minimumAmount;

    @ResponseParam(name = "maximumAmount")
    private Double maximumAmount;

    @ResponseParam(name = "rateCode")
    private Integer rateCode;

    @ResponseParam(name = "companyOrganizationName")
    private String companyOrganizationName;

    @ResponseParam(name = "collecitonCompanyShortName")
    private String collecitonCompanyShortName;

    @ResponseParam(name = "dealerCode")
    private String dealerCode;

    @ResponseParam(name = "dealerName")
    private String dealerName;

    @ResponseParam(name = "productCode")
    private String productCode;

    @ResponseParam(name = "productName")
    private String productName;

    @ResponseParam(name = "mapCode")
    private String mapCode;

    @ResponseParam(name = "collectionBranch")
    private BigDecimal collectionBranch;

    @ResponseParam(name = "branchname")
    private String branchname;

    @ResponseParam(name = "title")
    private String title;

    @ResponseParam(name = "accountType")
    private BigDecimal accountType;

    @ResponseParam(name = "customerNo")
    private BigDecimal customerNo;

    @ResponseParam(name = "runningNo")
    private BigDecimal runningNo;

    @ResponseParam(name = "checkDigit")
    private BigDecimal checkDigit;

    @ResponseParam(name = "active")
    private String active;

    @ResponseParam(name = "accountNo")
    private String accountNo;

    @ResponseParam(name = "collectionBranchAllow")
    private String collectionBranchAllow;

    @ResponseParam(name = "otcCompanyId")
    private Long otcCompanyId;

    @ResponseParam(name = "companyDescription")
    private String companyDescription;

    @ResponseParam(name = "otcAccountNo")
    private String otcAccountNo;

    @ResponseParam(name = "enable")
    private String enable;

    @ResponseParam(name = "otcCompanyCode")
    private String otcCompanyCode;

    @ResponseParam(name = "allowedModes")
    private String allowedModes;

    @ResponseParam(name = "charges")
    private Integer charges;

    @ResponseParam(name = "clearingAccount")
    private String clearingAccount;

    @ResponseParam(name = "isIntegrated")
    private String isIntegrated;

    @ResponseParam(name = "consumerNoLimit")
    private BigDecimal consumerNoLimit;

    @ResponseParam(name = "field1")
    private String field1;

    @ResponseParam(name = "field2")
    private String field2;

    @ResponseParam(name = "field3")
    private String field3;

    @ResponseParam(name = "field4")
    private String field4;

    @ResponseParam(name = "field5")
    private String field5;

    @ResponseParam(name = "field6")
    private String field6;

    @ResponseParam(name = "field7")
    private String field7;

    @ResponseParam(name = "field8")
    private String field8;

    @ResponseParam(name = "field9")
    private String field9;

    @ResponseParam(name = "field1Display")
    private String field1Display;

    @ResponseParam(name = "field2Display")
    private String field2Display;

    @ResponseParam(name = "field3Display")
    private String field3Display;

    @ResponseParam(name = "field4Display")
    private String field4Display;

    @ResponseParam(name = "field5Display")
    private String field5Display;

    @ResponseParam(name = "field6Display")
    private String field6Display;

    @ResponseParam(name = "field7Display")
    private String field7Display;

    @ResponseParam(name = "field8Display")
    private String field8Display;

    @ResponseParam(name = "field9Display")
    private String field9Display;

    @ResponseParam(name = "field1Description")
    private String field1Description;

    @ResponseParam(name = "field2Description")
    private String field2Description;

    @ResponseParam(name = "field3Description")
    private String field3Description;

    @ResponseParam(name = "field4Description")
    private String field4Description;

    @ResponseParam(name = "field5Description")
    private String field5Description;

    @ResponseParam(name = "field6Description")
    private String field6Description;

    @ResponseParam(name = "field7Description")
    private String field7Description;

    @ResponseParam(name = "field8Description")
    private String field8Description;

    @ResponseParam(name = "field9Description")
    private String field9Description;

    @ResponseParam(name = "separatorValue")
    private String separatorValue;

    @ResponseParam(name = "franchiseId")
    private String franchiseId;

    @ResponseParam(name = "franchiseName")
    private String franchiseName;

    private String errorMessage;
    private boolean mBoolean;

    /** declaration of constructors, getter/setters and toString method */

    public GetCompanyDetailResponseDto() {

    }

    
    public GetCompanyDetailResponseDto(String errorMessage, boolean mBoolean) {
        this.errorMessage = errorMessage;
        this.mBoolean = mBoolean;
    }




    public boolean ismBoolean() {
        return mBoolean;
    }


    public void setmBoolean(boolean mBoolean) {
        this.mBoolean = mBoolean;
    }

    

    public String getFranchiseId() {
        return franchiseId;
    }


    public void setFranchiseId(String franchiseId) {
        this.franchiseId = franchiseId;
    }


    public String getFranchiseName() {
        return franchiseName;
    }


    public void setFranchiseName(String franchiseName) {
        this.franchiseName = franchiseName;
    }


    public BigDecimal getBranchCode() {
        return branchCode;
    }


    public void setBranchCode(BigDecimal branchCode) {
        this.branchCode = branchCode;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public BigDecimal getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
    }

    public String getIsIntegrated() {
        return isIntegrated;
    }

    public void setIsIntegrated(String isIntegrated) {
        this.isIntegrated = isIntegrated;
    }

    public BigDecimal getConsumerNoLimit() {
        return consumerNoLimit;
    }

    public void setConsumerNoLimit(BigDecimal consumerNoLimit) {
        this.consumerNoLimit = consumerNoLimit;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

    public String getField6() {
        return field6;
    }

    public void setField6(String field6) {
        this.field6 = field6;
    }

    public String getField7() {
        return field7;
    }

    public void setField7(String field7) {
        this.field7 = field7;
    }

    public String getField8() {
        return field8;
    }

    public void setField8(String field8) {
        this.field8 = field8;
    }

    public String getField9() {
        return field9;
    }

    public void setField9(String field9) {
        this.field9 = field9;
    }

    public String getField1Display() {
        return field1Display;
    }

    public void setField1Display(String field1Display) {
        this.field1Display = field1Display;
    }

    public String getField2Display() {
        return field2Display;
    }

    public void setField2Display(String field2Display) {
        this.field2Display = field2Display;
    }

    public String getField3Display() {
        return field3Display;
    }

    public void setField3Display(String field3Display) {
        this.field3Display = field3Display;
    }

    public String getField4Display() {
        return field4Display;
    }

    public void setField4Display(String field4Display) {
        this.field4Display = field4Display;
    }

    public String getField5Display() {
        return field5Display;
    }

    public void setField5Display(String field5Display) {
        this.field5Display = field5Display;
    }

    public String getField6Display() {
        return field6Display;
    }

    public void setField6Display(String field6Display) {
        this.field6Display = field6Display;
    }

    public String getField7Display() {
        return field7Display;
    }

    public void setField7Display(String field7Display) {
        this.field7Display = field7Display;
    }

    public String getField8Display() {
        return field8Display;
    }

    public void setField8Display(String field8Display) {
        this.field8Display = field8Display;
    }

    public String getField9Display() {
        return field9Display;
    }

    public void setField9Display(String field9Display) {
        this.field9Display = field9Display;
    }

    public String getField1Description() {
        return field1Description;
    }

    public void setField1Description(String field1Description) {
        this.field1Description = field1Description;
    }

    public String getField2Description() {
        return field2Description;
    }

    public void setField2Description(String field2Description) {
        this.field2Description = field2Description;
    }

    public String getField3Description() {
        return field3Description;
    }

    public void setField3Description(String field3Description) {
        this.field3Description = field3Description;
    }

    public String getField4Description() {
        return field4Description;
    }

    public void setField4Description(String field4Description) {
        this.field4Description = field4Description;
    }

    public String getField5Description() {
        return field5Description;
    }

    public void setField5Description(String field5Description) {
        this.field5Description = field5Description;
    }

    public String getField6Description() {
        return field6Description;
    }

    public void setField6Description(String field6Description) {
        this.field6Description = field6Description;
    }

    public String getField7Description() {
        return field7Description;
    }

    public void setField7Description(String field7Description) {
        this.field7Description = field7Description;
    }

    public String getField8Description() {
        return field8Description;
    }

    public void setField8Description(String field8Description) {
        this.field8Description = field8Description;
    }

    public String getField9Description() {
        return field9Description;
    }

    public void setField9Description(String field9Description) {
        this.field9Description = field9Description;
    }

    public String getSeparatorValue() {
        return separatorValue;
    }

    public void setSeparatorValue(String separatorValue) {
        this.separatorValue = separatorValue;
    }

    public Long getOtcCompanyId() {
        return otcCompanyId;
    }

    public void setOtcCompanyId(Long otcCompanyId) {
        this.otcCompanyId = otcCompanyId;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public String getOtcAccountNo() {
        return otcAccountNo;
    }

    public void setOtcAccountNo(String otcAccountNo) {
        this.otcAccountNo = otcAccountNo;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getOtcCompanyCode() {
        return otcCompanyCode;
    }

    public void setOtcCompanyCode(String otcCompanyCode) {
        this.otcCompanyCode = otcCompanyCode;
    }

    public String getAllowedModes() {
        return allowedModes;
    }

    public void setAllowedModes(String allowedModes) {
        this.allowedModes = allowedModes;
    }

    public Integer getCharges() {
        return charges;
    }

    public void setCharges(Integer charges) {
        this.charges = charges;
    }

    public String getClearingAccount() {
        return clearingAccount;
    }

    public void setClearingAccount(String clearingAccount) {
        this.clearingAccount = clearingAccount;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getCollectionBranchAllow() {
        return collectionBranchAllow;
    }

    public void setCollectionBranchAllow(String collectionBranchAllow) {
        this.collectionBranchAllow = collectionBranchAllow;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getAccountType() {
        return accountType;
    }

    public void setAccountType(BigDecimal accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(BigDecimal customerNo) {
        this.customerNo = customerNo;
    }

    public BigDecimal getRunningNo() {
        return runningNo;
    }

    public void setRunningNo(BigDecimal runningNo) {
        this.runningNo = runningNo;
    }

    public BigDecimal getCheckDigit() {
        return checkDigit;
    }

    public void setCheckDigit(BigDecimal checkDigit) {
        this.checkDigit = checkDigit;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public BigDecimal getCollectionBranch() {
        return collectionBranch;
    }

    public void setCollectionBranch(BigDecimal collectionBranch) {
        this.collectionBranch = collectionBranch;
    }

    public String getMapCode() {
        return this.mapCode;
    }

    public void setMapCode(String mapCode) {
        this.mapCode = mapCode;
    }

    public Integer getCompanyBarcodeCompanyId() {
        return this.companyBarcodeCompanyId;
    }

    public void setCompanyBarcodeCompanyId(Integer companyBarcodeCompanyId) {
        this.companyBarcodeCompanyId = companyBarcodeCompanyId;
    }

    public String getBarcodeMappingBarcodeLength() {
        return this.barcodeMappingBarcodeLength;
    }

    public void setBarcodeMappingBarcodeLength(String barcodeMappingBarcodeLength) {
        this.barcodeMappingBarcodeLength = barcodeMappingBarcodeLength;
    }

    public Integer getCompanyBarcodeLength() {
        return this.companyBarcodeLength;
    }

    public void setCompanyBarcodeLength(Integer companyBarcodeLength) {
        this.companyBarcodeLength = companyBarcodeLength;
    }

    public String getSeparatorExist() {
        return this.separatorExist;
    }

    public void setSeparatorExist(String separatorExist) {
        this.separatorExist = separatorExist;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAccount() {
        return this.companyAccount;
    }

    public void setCompanyAccount(String companyAccount) {
        this.companyAccount = companyAccount;
    }

    public String getMappingCode() {
        return this.mappingCode;
    }

    public void setMappingCode(String mappingCode) {
        this.mappingCode = mappingCode;
    }

    public String getCompanyAbr() {
        return this.companyAbr;
    }

    public void setCompanyAbr(String companyAbr) {
        this.companyAbr = companyAbr;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public Long getCreditTransactionCode() {
        return this.creditTransactionCode;
    }

    public void setCreditTransactionCode(Long creditTransactionCode) {
        this.creditTransactionCode = creditTransactionCode;
    }

    public String getCreditActivityCode() {
        return this.creditActivityCode;
    }

    public void setCreditActivityCode(String creditActivityCode) {
        this.creditActivityCode = creditActivityCode;
    }

    public Long getDebitTransactionCode() {
        return this.debitTransactionCode;
    }

    public void setDebitTransactionCode(Long debitTransactionCode) {
        this.debitTransactionCode = debitTransactionCode;
    }

    public String getDebitActivityCode() {
        return this.debitActivityCode;
    }

    public void setDebitActivityCode(String debitActivityCode) {
        this.debitActivityCode = debitActivityCode;
    }

    public Long getIncomeTransactionCode() {
        return this.incomeTransactionCode;
    }

    public void setIncomeTransactionCode(Long incomeTransactionCode) {
        this.incomeTransactionCode = incomeTransactionCode;
    }

    public String getIncomeActivityCode() {
        return this.incomeActivityCode;
    }

    public void setIncomeActivityCode(String incomeActivityCode) {
        this.incomeActivityCode = incomeActivityCode;
    }

    public Long getFedTransactionCode() {
        return this.fedTransactionCode;
    }

    public void setFedTransactionCode(Long fedTransactionCode) {
        this.fedTransactionCode = fedTransactionCode;
    }

    public String getFedActivityCode() {
        return this.fedActivityCode;
    }

    public void setFedActivityCode(String fedActivityCode) {
        this.fedActivityCode = fedActivityCode;
    }

    public BigInteger getExtraTransactionCode() {
        return this.extraTransactionCode;
    }

    public void setExtraTransactionCode(BigInteger extraTransactionCode) {
        this.extraTransactionCode = extraTransactionCode;
    }

    public String getExtraActivityCode() {
        return this.extraActivityCode;
    }

    public void setExtraActivityCode(String extraActivityCode) {
        this.extraActivityCode = extraActivityCode;
    }

    public String getPrmFlagName() {
        return this.prmFlagName;
    }

    public void setPrmFlagName(String prmFlagName) {
        this.prmFlagName = prmFlagName;
    }

    public String getCompanyOrganizationName() {
        return this.companyOrganizationName;
    }

    public void setCompanyOrganizationName(String companyOrganizationName) {
        this.companyOrganizationName = companyOrganizationName;
    }

    public String getCollecitonCompanyShortName() {
        return this.collecitonCompanyShortName;
    }

    public void setCollecitonCompanyShortName(String collecitonCompanyShortName) {
        this.collecitonCompanyShortName = collecitonCompanyShortName;
    }

    public String getDealerCode() {
        return this.dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public String getDealerName() {
        return this.dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(Double minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public Double getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(Double maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public Integer getRateCode() {
        return rateCode;
    }

    public void setRateCode(Integer rateCode) {
        this.rateCode = rateCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "GetCompanyDetailResponseDto [accountNo=" + accountNo + ", accountType=" + accountType + ", active="
                + active + ", allowedModes=" + allowedModes + ", barcodeMappingBarcodeLength="
                + barcodeMappingBarcodeLength + ", branchname=" + branchname + ", charges=" + charges + ", checkDigit="
                + checkDigit + ", clearingAccount=" + clearingAccount + ", collecitonCompanyShortName="
                + collecitonCompanyShortName + ", collectionBranch=" + collectionBranch + ", collectionBranchAllow="
                + collectionBranchAllow + ", companyAbr=" + companyAbr + ", companyAccount=" + companyAccount
                + ", companyBarcodeCompanyId=" + companyBarcodeCompanyId + ", companyBarcodeLength="
                + companyBarcodeLength + ", companyCode=" + companyCode + ", companyDescription=" + companyDescription
                + ", companyId=" + companyId + ", companyName=" + companyName + ", companyOrganizationName="
                + companyOrganizationName + ", consumerNoLimit=" + consumerNoLimit + ", creditActivityCode="
                + creditActivityCode + ", creditTransactionCode=" + creditTransactionCode + ", customerNo=" + customerNo
                + ", dealerCode=" + dealerCode + ", dealerName=" + dealerName + ", debitActivityCode="
                + debitActivityCode + ", debitTransactionCode=" + debitTransactionCode + ", enable=" + enable
                + ", errorMessage=" + errorMessage + ", extraActivityCode=" + extraActivityCode
                + ", extraTransactionCode=" + extraTransactionCode + ", fedActivityCode=" + fedActivityCode
                + ", fedTransactionCode=" + fedTransactionCode + ", field1=" + field1 + ", field1Description="
                + field1Description + ", field1Display=" + field1Display + ", field2=" + field2 + ", field2Description="
                + field2Description + ", field2Display=" + field2Display + ", field3=" + field3 + ", field3Description="
                + field3Description + ", field3Display=" + field3Display + ", field4=" + field4 + ", field4Description="
                + field4Description + ", field4Display=" + field4Display + ", field5=" + field5 + ", field5Description="
                + field5Description + ", field5Display=" + field5Display + ", field6=" + field6 + ", field6Description="
                + field6Description + ", field6Display=" + field6Display + ", field7=" + field7 + ", field7Description="
                + field7Description + ", field7Display=" + field7Display + ", field8=" + field8 + ", field8Description="
                + field8Description + ", field8Display=" + field8Display + ", field9=" + field9 + ", field9Description="
                + field9Description + ", field9Display=" + field9Display + ", incomeActivityCode=" + incomeActivityCode
                + ", incomeTransactionCode=" + incomeTransactionCode + ", isIntegrated=" + isIntegrated + ", mapCode="
                + mapCode + ", mappingCode=" + mappingCode + ", maximumAmount=" + maximumAmount + ", minimumAmount="
                + minimumAmount + ", otcAccountNo=" + otcAccountNo + ", otcCompanyCode=" + otcCompanyCode
                + ", otcCompanyId=" + otcCompanyId + ", prmFlagName=" + prmFlagName + ", productCode=" + productCode
                + ", productName=" + productName + ", rateCode=" + rateCode + ", runningNo=" + runningNo
                + ", separatorExist=" + separatorExist + ", separatorValue=" + separatorValue + ", title=" + title
                + "]";
    }

}
