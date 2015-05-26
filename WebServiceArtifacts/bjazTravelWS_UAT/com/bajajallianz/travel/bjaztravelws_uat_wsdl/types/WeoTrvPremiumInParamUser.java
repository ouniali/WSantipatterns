
package com.bajajallianz.travel.bjaztravelws_uat_wsdl.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeoTrvPremiumInParamUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeoTrvPremiumInParamUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl/types/}WeoTrvPremiumInParamBase">
 *       &lt;sequence>
 *         &lt;element name="pspDiscount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ploading" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ptoDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ptravelplan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pdateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfromDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pareaplan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pdiscount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeoTrvPremiumInParamUser", propOrder = {
    "pspDiscount",
    "ploading",
    "ptoDate",
    "ptravelplan",
    "pdateOfBirth",
    "pfromDate",
    "pareaplan",
    "pdiscount"
})
public class WeoTrvPremiumInParamUser
    extends WeoTrvPremiumInParamBase
{

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pspDiscount;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal ploading;
    @XmlElement(required = true, nillable = true)
    protected String ptoDate;
    @XmlElement(required = true, nillable = true)
    protected String ptravelplan;
    @XmlElement(required = true, nillable = true)
    protected String pdateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected String pfromDate;
    @XmlElement(required = true, nillable = true)
    protected String pareaplan;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pdiscount;

    /**
     * Gets the value of the pspDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPspDiscount() {
        return pspDiscount;
    }

    /**
     * Sets the value of the pspDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPspDiscount(Integer value) {
        this.pspDiscount = value;
    }

    /**
     * Gets the value of the ploading property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPloading() {
        return ploading;
    }

    /**
     * Sets the value of the ploading property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPloading(BigDecimal value) {
        this.ploading = value;
    }

    /**
     * Gets the value of the ptoDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtoDate() {
        return ptoDate;
    }

    /**
     * Sets the value of the ptoDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtoDate(String value) {
        this.ptoDate = value;
    }

    /**
     * Gets the value of the ptravelplan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtravelplan() {
        return ptravelplan;
    }

    /**
     * Sets the value of the ptravelplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtravelplan(String value) {
        this.ptravelplan = value;
    }

    /**
     * Gets the value of the pdateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdateOfBirth() {
        return pdateOfBirth;
    }

    /**
     * Sets the value of the pdateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdateOfBirth(String value) {
        this.pdateOfBirth = value;
    }

    /**
     * Gets the value of the pfromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfromDate() {
        return pfromDate;
    }

    /**
     * Sets the value of the pfromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfromDate(String value) {
        this.pfromDate = value;
    }

    /**
     * Gets the value of the pareaplan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPareaplan() {
        return pareaplan;
    }

    /**
     * Sets the value of the pareaplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPareaplan(String value) {
        this.pareaplan = value;
    }

    /**
     * Gets the value of the pdiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPdiscount() {
        return pdiscount;
    }

    /**
     * Sets the value of the pdiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPdiscount(Integer value) {
        this.pdiscount = value;
    }

}
