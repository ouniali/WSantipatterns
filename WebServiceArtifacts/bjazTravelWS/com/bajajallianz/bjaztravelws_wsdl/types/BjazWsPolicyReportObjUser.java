
package com.bajajallianz.bjaztravelws_wsdl.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BjazWsPolicyReportObjUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BjazWsPolicyReportObjUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/bajajallianz/BjazTravelWS.wsdl/types/}BjazWsPolicyReportObjBase">
 *       &lt;sequence>
 *         &lt;element name="PIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PTermEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PCustName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PLocationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PImdCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PTermStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol10" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PImdName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol9" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PPolicyRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol8" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol6" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PGrossPremiumAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PPartnerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extCol1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BjazWsPolicyReportObjUser", propOrder = {
    "pIssueDate",
    "pTermEndDate",
    "pCustName",
    "pLocationCode",
    "pImdCode",
    "pTermStartDate",
    "extCol10",
    "pImdName",
    "extCol9",
    "pPolicyRef",
    "extCol8",
    "extCol7",
    "extCol6",
    "pGrossPremiumAmt",
    "extCol5",
    "extCol4",
    "pPartnerId",
    "extCol3",
    "extCol2",
    "extCol1",
    "pUserId"
})
public class BjazWsPolicyReportObjUser
    extends BjazWsPolicyReportObjBase
{

    @XmlElement(name = "PIssueDate", required = true, nillable = true)
    protected String pIssueDate;
    @XmlElement(name = "PTermEndDate", required = true, nillable = true)
    protected String pTermEndDate;
    @XmlElement(name = "PCustName", required = true, nillable = true)
    protected String pCustName;
    @XmlElement(name = "PLocationCode", required = true, nillable = true)
    protected String pLocationCode;
    @XmlElement(name = "PImdCode", required = true, nillable = true)
    protected String pImdCode;
    @XmlElement(name = "PTermStartDate", required = true, nillable = true)
    protected String pTermStartDate;
    @XmlElement(required = true, nillable = true)
    protected String extCol10;
    @XmlElement(name = "PImdName", required = true, nillable = true)
    protected String pImdName;
    @XmlElement(required = true, nillable = true)
    protected String extCol9;
    @XmlElement(name = "PPolicyRef", required = true, nillable = true)
    protected String pPolicyRef;
    @XmlElement(required = true, nillable = true)
    protected String extCol8;
    @XmlElement(required = true, nillable = true)
    protected String extCol7;
    @XmlElement(required = true, nillable = true)
    protected String extCol6;
    @XmlElement(name = "PGrossPremiumAmt", required = true, nillable = true)
    protected String pGrossPremiumAmt;
    @XmlElement(required = true, nillable = true)
    protected String extCol5;
    @XmlElement(required = true, nillable = true)
    protected String extCol4;
    @XmlElement(name = "PPartnerId", required = true, nillable = true)
    protected String pPartnerId;
    @XmlElement(required = true, nillable = true)
    protected String extCol3;
    @XmlElement(required = true, nillable = true)
    protected String extCol2;
    @XmlElement(required = true, nillable = true)
    protected String extCol1;
    @XmlElement(name = "PUserId", required = true, nillable = true)
    protected String pUserId;

    /**
     * Gets the value of the pIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIssueDate() {
        return pIssueDate;
    }

    /**
     * Sets the value of the pIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIssueDate(String value) {
        this.pIssueDate = value;
    }

    /**
     * Gets the value of the pTermEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTermEndDate() {
        return pTermEndDate;
    }

    /**
     * Sets the value of the pTermEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTermEndDate(String value) {
        this.pTermEndDate = value;
    }

    /**
     * Gets the value of the pCustName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCustName() {
        return pCustName;
    }

    /**
     * Sets the value of the pCustName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCustName(String value) {
        this.pCustName = value;
    }

    /**
     * Gets the value of the pLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLocationCode() {
        return pLocationCode;
    }

    /**
     * Sets the value of the pLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLocationCode(String value) {
        this.pLocationCode = value;
    }

    /**
     * Gets the value of the pImdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPImdCode() {
        return pImdCode;
    }

    /**
     * Sets the value of the pImdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPImdCode(String value) {
        this.pImdCode = value;
    }

    /**
     * Gets the value of the pTermStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTermStartDate() {
        return pTermStartDate;
    }

    /**
     * Sets the value of the pTermStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTermStartDate(String value) {
        this.pTermStartDate = value;
    }

    /**
     * Gets the value of the extCol10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol10() {
        return extCol10;
    }

    /**
     * Sets the value of the extCol10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol10(String value) {
        this.extCol10 = value;
    }

    /**
     * Gets the value of the pImdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPImdName() {
        return pImdName;
    }

    /**
     * Sets the value of the pImdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPImdName(String value) {
        this.pImdName = value;
    }

    /**
     * Gets the value of the extCol9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol9() {
        return extCol9;
    }

    /**
     * Sets the value of the extCol9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol9(String value) {
        this.extCol9 = value;
    }

    /**
     * Gets the value of the pPolicyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPolicyRef() {
        return pPolicyRef;
    }

    /**
     * Sets the value of the pPolicyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPolicyRef(String value) {
        this.pPolicyRef = value;
    }

    /**
     * Gets the value of the extCol8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol8() {
        return extCol8;
    }

    /**
     * Sets the value of the extCol8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol8(String value) {
        this.extCol8 = value;
    }

    /**
     * Gets the value of the extCol7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol7() {
        return extCol7;
    }

    /**
     * Sets the value of the extCol7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol7(String value) {
        this.extCol7 = value;
    }

    /**
     * Gets the value of the extCol6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol6() {
        return extCol6;
    }

    /**
     * Sets the value of the extCol6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol6(String value) {
        this.extCol6 = value;
    }

    /**
     * Gets the value of the pGrossPremiumAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPGrossPremiumAmt() {
        return pGrossPremiumAmt;
    }

    /**
     * Sets the value of the pGrossPremiumAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPGrossPremiumAmt(String value) {
        this.pGrossPremiumAmt = value;
    }

    /**
     * Gets the value of the extCol5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol5() {
        return extCol5;
    }

    /**
     * Sets the value of the extCol5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol5(String value) {
        this.extCol5 = value;
    }

    /**
     * Gets the value of the extCol4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol4() {
        return extCol4;
    }

    /**
     * Sets the value of the extCol4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol4(String value) {
        this.extCol4 = value;
    }

    /**
     * Gets the value of the pPartnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPartnerId() {
        return pPartnerId;
    }

    /**
     * Sets the value of the pPartnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPartnerId(String value) {
        this.pPartnerId = value;
    }

    /**
     * Gets the value of the extCol3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol3() {
        return extCol3;
    }

    /**
     * Sets the value of the extCol3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol3(String value) {
        this.extCol3 = value;
    }

    /**
     * Gets the value of the extCol2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol2() {
        return extCol2;
    }

    /**
     * Sets the value of the extCol2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol2(String value) {
        this.extCol2 = value;
    }

    /**
     * Gets the value of the extCol1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCol1() {
        return extCol1;
    }

    /**
     * Sets the value of the extCol1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCol1(String value) {
        this.extCol1 = value;
    }

    /**
     * Gets the value of the pUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUserId() {
        return pUserId;
    }

    /**
     * Sets the value of the pUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUserId(String value) {
        this.pUserId = value;
    }

}
