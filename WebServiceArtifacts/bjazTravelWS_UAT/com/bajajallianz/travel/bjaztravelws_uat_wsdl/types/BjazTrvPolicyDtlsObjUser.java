
package com.bajajallianz.travel.bjaztravelws_uat_wsdl.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BjazTrvPolicyDtlsObjUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BjazTrvPolicyDtlsObjUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl/types/}BjazTrvPolicyDtlsObjBase">
 *       &lt;sequence>
 *         &lt;element name="paymentMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extraCol4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extraCol5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extraCol2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="areaplan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extraCol3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extraCol1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="travelplan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="returnpath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="policyNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="masterpolicyno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="familyFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loading" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="assigneeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="systemip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="spCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestid" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="finalPremium" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BjazTrvPolicyDtlsObjUser", propOrder = {
    "paymentMode",
    "extraCol4",
    "extraCol5",
    "extraCol2",
    "areaplan",
    "extraCol3",
    "extraCol1",
    "userid",
    "travelplan",
    "returnpath",
    "policyNo",
    "masterpolicyno",
    "familyFlag",
    "productCode",
    "loading",
    "toDate",
    "assigneeName",
    "systemip",
    "destination",
    "discount",
    "fromDate",
    "dob",
    "spCondition",
    "requestid",
    "finalPremium"
})
public class BjazTrvPolicyDtlsObjUser
    extends BjazTrvPolicyDtlsObjBase
{

    @XmlElement(required = true, nillable = true)
    protected String paymentMode;
    @XmlElement(required = true, nillable = true)
    protected String extraCol4;
    @XmlElement(required = true, nillable = true)
    protected String extraCol5;
    @XmlElement(required = true, nillable = true)
    protected String extraCol2;
    @XmlElement(required = true, nillable = true)
    protected String areaplan;
    @XmlElement(required = true, nillable = true)
    protected String extraCol3;
    @XmlElement(required = true, nillable = true)
    protected String extraCol1;
    @XmlElement(required = true, nillable = true)
    protected String userid;
    @XmlElement(required = true, nillable = true)
    protected String travelplan;
    @XmlElement(required = true, nillable = true)
    protected String returnpath;
    @XmlElement(required = true, nillable = true)
    protected String policyNo;
    @XmlElement(required = true, nillable = true)
    protected String masterpolicyno;
    @XmlElement(required = true, nillable = true)
    protected String familyFlag;
    @XmlElement(required = true, nillable = true)
    protected String productCode;
    @XmlElement(required = true, nillable = true)
    protected String loading;
    @XmlElement(required = true, nillable = true)
    protected String toDate;
    @XmlElement(required = true, nillable = true)
    protected String assigneeName;
    @XmlElement(required = true, nillable = true)
    protected String systemip;
    @XmlElement(required = true, nillable = true)
    protected String destination;
    @XmlElement(required = true, nillable = true)
    protected String discount;
    @XmlElement(required = true, nillable = true)
    protected String fromDate;
    @XmlElement(required = true, nillable = true)
    protected String dob;
    @XmlElement(required = true, nillable = true)
    protected String spCondition;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal requestid;
    @XmlElement(required = true, nillable = true)
    protected String finalPremium;

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMode(String value) {
        this.paymentMode = value;
    }

    /**
     * Gets the value of the extraCol4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraCol4() {
        return extraCol4;
    }

    /**
     * Sets the value of the extraCol4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraCol4(String value) {
        this.extraCol4 = value;
    }

    /**
     * Gets the value of the extraCol5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraCol5() {
        return extraCol5;
    }

    /**
     * Sets the value of the extraCol5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraCol5(String value) {
        this.extraCol5 = value;
    }

    /**
     * Gets the value of the extraCol2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraCol2() {
        return extraCol2;
    }

    /**
     * Sets the value of the extraCol2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraCol2(String value) {
        this.extraCol2 = value;
    }

    /**
     * Gets the value of the areaplan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaplan() {
        return areaplan;
    }

    /**
     * Sets the value of the areaplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaplan(String value) {
        this.areaplan = value;
    }

    /**
     * Gets the value of the extraCol3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraCol3() {
        return extraCol3;
    }

    /**
     * Sets the value of the extraCol3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraCol3(String value) {
        this.extraCol3 = value;
    }

    /**
     * Gets the value of the extraCol1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraCol1() {
        return extraCol1;
    }

    /**
     * Sets the value of the extraCol1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraCol1(String value) {
        this.extraCol1 = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the travelplan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelplan() {
        return travelplan;
    }

    /**
     * Sets the value of the travelplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelplan(String value) {
        this.travelplan = value;
    }

    /**
     * Gets the value of the returnpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnpath() {
        return returnpath;
    }

    /**
     * Sets the value of the returnpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnpath(String value) {
        this.returnpath = value;
    }

    /**
     * Gets the value of the policyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNo() {
        return policyNo;
    }

    /**
     * Sets the value of the policyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNo(String value) {
        this.policyNo = value;
    }

    /**
     * Gets the value of the masterpolicyno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterpolicyno() {
        return masterpolicyno;
    }

    /**
     * Sets the value of the masterpolicyno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterpolicyno(String value) {
        this.masterpolicyno = value;
    }

    /**
     * Gets the value of the familyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyFlag() {
        return familyFlag;
    }

    /**
     * Sets the value of the familyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyFlag(String value) {
        this.familyFlag = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the loading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoading() {
        return loading;
    }

    /**
     * Sets the value of the loading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoading(String value) {
        this.loading = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDate(String value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the assigneeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigneeName() {
        return assigneeName;
    }

    /**
     * Sets the value of the assigneeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigneeName(String value) {
        this.assigneeName = value;
    }

    /**
     * Gets the value of the systemip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemip() {
        return systemip;
    }

    /**
     * Sets the value of the systemip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemip(String value) {
        this.systemip = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount(String value) {
        this.discount = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(String value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDob(String value) {
        this.dob = value;
    }

    /**
     * Gets the value of the spCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpCondition() {
        return spCondition;
    }

    /**
     * Sets the value of the spCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpCondition(String value) {
        this.spCondition = value;
    }

    /**
     * Gets the value of the requestid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestid() {
        return requestid;
    }

    /**
     * Sets the value of the requestid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestid(BigDecimal value) {
        this.requestid = value;
    }

    /**
     * Gets the value of the finalPremium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalPremium() {
        return finalPremium;
    }

    /**
     * Sets the value of the finalPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalPremium(String value) {
        this.finalPremium = value;
    }

}
