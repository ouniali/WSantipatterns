
package com.bajajallianz.travel.bjaztravelws_uat_wsdl.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeoTrvPremiumOutParamUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeoTrvPremiumOutParamUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl/types/}WeoTrvPremiumOutParamBase">
 *       &lt;sequence>
 *         &lt;element name="ploadingAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="pextraCol" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="pfullTermPremium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ptotalPremium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="pbasePremium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="pdiscountAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="pserviceTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="pextraCol2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="peduCessAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="pextraCol1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pspDiscountAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeoTrvPremiumOutParamUser", propOrder = {
    "ploadingAmt",
    "pextraCol",
    "pfullTermPremium",
    "ptotalPremium",
    "pbasePremium",
    "pdiscountAmt",
    "pserviceTax",
    "pextraCol2",
    "peduCessAmt",
    "pextraCol1",
    "pspDiscountAmt"
})
public class WeoTrvPremiumOutParamUser
    extends WeoTrvPremiumOutParamBase
{

    @XmlElement(required = true, nillable = true)
    protected BigDecimal ploadingAmt;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal pextraCol;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal pfullTermPremium;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal ptotalPremium;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal pbasePremium;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal pdiscountAmt;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal pserviceTax;
    @XmlElement(required = true, nillable = true)
    protected String pextraCol2;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal peduCessAmt;
    @XmlElement(required = true, nillable = true)
    protected String pextraCol1;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal pspDiscountAmt;

    /**
     * Gets the value of the ploadingAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPloadingAmt() {
        return ploadingAmt;
    }

    /**
     * Sets the value of the ploadingAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPloadingAmt(BigDecimal value) {
        this.ploadingAmt = value;
    }

    /**
     * Gets the value of the pextraCol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPextraCol() {
        return pextraCol;
    }

    /**
     * Sets the value of the pextraCol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPextraCol(BigDecimal value) {
        this.pextraCol = value;
    }

    /**
     * Gets the value of the pfullTermPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPfullTermPremium() {
        return pfullTermPremium;
    }

    /**
     * Sets the value of the pfullTermPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPfullTermPremium(BigDecimal value) {
        this.pfullTermPremium = value;
    }

    /**
     * Gets the value of the ptotalPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPtotalPremium() {
        return ptotalPremium;
    }

    /**
     * Sets the value of the ptotalPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPtotalPremium(BigDecimal value) {
        this.ptotalPremium = value;
    }

    /**
     * Gets the value of the pbasePremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPbasePremium() {
        return pbasePremium;
    }

    /**
     * Sets the value of the pbasePremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPbasePremium(BigDecimal value) {
        this.pbasePremium = value;
    }

    /**
     * Gets the value of the pdiscountAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPdiscountAmt() {
        return pdiscountAmt;
    }

    /**
     * Sets the value of the pdiscountAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPdiscountAmt(BigDecimal value) {
        this.pdiscountAmt = value;
    }

    /**
     * Gets the value of the pserviceTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPserviceTax() {
        return pserviceTax;
    }

    /**
     * Sets the value of the pserviceTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPserviceTax(BigDecimal value) {
        this.pserviceTax = value;
    }

    /**
     * Gets the value of the pextraCol2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPextraCol2() {
        return pextraCol2;
    }

    /**
     * Sets the value of the pextraCol2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPextraCol2(String value) {
        this.pextraCol2 = value;
    }

    /**
     * Gets the value of the peduCessAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeduCessAmt() {
        return peduCessAmt;
    }

    /**
     * Sets the value of the peduCessAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeduCessAmt(BigDecimal value) {
        this.peduCessAmt = value;
    }

    /**
     * Gets the value of the pextraCol1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPextraCol1() {
        return pextraCol1;
    }

    /**
     * Sets the value of the pextraCol1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPextraCol1(String value) {
        this.pextraCol1 = value;
    }

    /**
     * Gets the value of the pspDiscountAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPspDiscountAmt() {
        return pspDiscountAmt;
    }

    /**
     * Sets the value of the pspDiscountAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPspDiscountAmt(BigDecimal value) {
        this.pspDiscountAmt = value;
    }

}
