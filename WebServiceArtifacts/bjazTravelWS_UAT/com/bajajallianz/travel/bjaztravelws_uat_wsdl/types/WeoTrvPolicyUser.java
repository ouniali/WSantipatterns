
package com.bajajallianz.travel.bjaztravelws_uat_wsdl.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeoTrvPolicyUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeoTrvPolicyUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl/types/}WeoTrvPolicyBase">
 *       &lt;sequence>
 *         &lt;element name="passigneeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfullTermPremium" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ptelephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pdepartureDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paddressLine2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paddressLine3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ppolicyRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paddressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pgrossPremium" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pserviceTaxAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pplan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pdateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="preturnDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pimdcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="psurname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recString20" type="{http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl/types/}WeoRecStrings20User"/>
 *         &lt;element name="parea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcustomerTextName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ppostcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ppartId" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ppassportNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pspCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pentryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeoTrvPolicyUser", propOrder = {
    "passigneeName",
    "pfullTermPremium",
    "ptelephone",
    "pdepartureDate",
    "paddressLine2",
    "paddressLine3",
    "ppolicyRef",
    "paddressLine1",
    "pgrossPremium",
    "pserviceTaxAmt",
    "pplan",
    "pdateOfBirth",
    "preturnDate",
    "pimdcode",
    "psurname",
    "recString20",
    "parea",
    "pcustomerTextName",
    "pfirstName",
    "ppostcode",
    "ppartId",
    "ppassportNo",
    "pspCondition",
    "pentryDate"
})
public class WeoTrvPolicyUser
    extends WeoTrvPolicyBase
{

    @XmlElement(required = true, nillable = true)
    protected String passigneeName;
    @XmlElement(required = true, nillable = true)
    protected String pfullTermPremium;
    @XmlElement(required = true, nillable = true)
    protected String ptelephone;
    @XmlElement(required = true, nillable = true)
    protected String pdepartureDate;
    @XmlElement(required = true, nillable = true)
    protected String paddressLine2;
    @XmlElement(required = true, nillable = true)
    protected String paddressLine3;
    @XmlElement(required = true, nillable = true)
    protected String ppolicyRef;
    @XmlElement(required = true, nillable = true)
    protected String paddressLine1;
    @XmlElement(required = true, nillable = true)
    protected String pgrossPremium;
    @XmlElement(required = true, nillable = true)
    protected String pserviceTaxAmt;
    @XmlElement(required = true, nillable = true)
    protected String pplan;
    @XmlElement(required = true, nillable = true)
    protected String pdateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected String preturnDate;
    @XmlElement(required = true, nillable = true)
    protected String pimdcode;
    @XmlElement(required = true, nillable = true)
    protected String psurname;
    @XmlElement(required = true, nillable = true)
    protected WeoRecStrings20User recString20;
    @XmlElement(required = true, nillable = true)
    protected String parea;
    @XmlElement(required = true, nillable = true)
    protected String pcustomerTextName;
    @XmlElement(required = true, nillable = true)
    protected String pfirstName;
    @XmlElement(required = true, nillable = true)
    protected String ppostcode;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal ppartId;
    @XmlElement(required = true, nillable = true)
    protected String ppassportNo;
    @XmlElement(required = true, nillable = true)
    protected String pspCondition;
    @XmlElement(required = true, nillable = true)
    protected String pentryDate;

    /**
     * Gets the value of the passigneeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassigneeName() {
        return passigneeName;
    }

    /**
     * Sets the value of the passigneeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassigneeName(String value) {
        this.passigneeName = value;
    }

    /**
     * Gets the value of the pfullTermPremium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfullTermPremium() {
        return pfullTermPremium;
    }

    /**
     * Sets the value of the pfullTermPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfullTermPremium(String value) {
        this.pfullTermPremium = value;
    }

    /**
     * Gets the value of the ptelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtelephone() {
        return ptelephone;
    }

    /**
     * Sets the value of the ptelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtelephone(String value) {
        this.ptelephone = value;
    }

    /**
     * Gets the value of the pdepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdepartureDate() {
        return pdepartureDate;
    }

    /**
     * Sets the value of the pdepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdepartureDate(String value) {
        this.pdepartureDate = value;
    }

    /**
     * Gets the value of the paddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddressLine2() {
        return paddressLine2;
    }

    /**
     * Sets the value of the paddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddressLine2(String value) {
        this.paddressLine2 = value;
    }

    /**
     * Gets the value of the paddressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddressLine3() {
        return paddressLine3;
    }

    /**
     * Sets the value of the paddressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddressLine3(String value) {
        this.paddressLine3 = value;
    }

    /**
     * Gets the value of the ppolicyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpolicyRef() {
        return ppolicyRef;
    }

    /**
     * Sets the value of the ppolicyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpolicyRef(String value) {
        this.ppolicyRef = value;
    }

    /**
     * Gets the value of the paddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddressLine1() {
        return paddressLine1;
    }

    /**
     * Sets the value of the paddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddressLine1(String value) {
        this.paddressLine1 = value;
    }

    /**
     * Gets the value of the pgrossPremium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgrossPremium() {
        return pgrossPremium;
    }

    /**
     * Sets the value of the pgrossPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgrossPremium(String value) {
        this.pgrossPremium = value;
    }

    /**
     * Gets the value of the pserviceTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPserviceTaxAmt() {
        return pserviceTaxAmt;
    }

    /**
     * Sets the value of the pserviceTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPserviceTaxAmt(String value) {
        this.pserviceTaxAmt = value;
    }

    /**
     * Gets the value of the pplan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPplan() {
        return pplan;
    }

    /**
     * Sets the value of the pplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPplan(String value) {
        this.pplan = value;
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
     * Gets the value of the preturnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreturnDate() {
        return preturnDate;
    }

    /**
     * Sets the value of the preturnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreturnDate(String value) {
        this.preturnDate = value;
    }

    /**
     * Gets the value of the pimdcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPimdcode() {
        return pimdcode;
    }

    /**
     * Sets the value of the pimdcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPimdcode(String value) {
        this.pimdcode = value;
    }

    /**
     * Gets the value of the psurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsurname() {
        return psurname;
    }

    /**
     * Sets the value of the psurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsurname(String value) {
        this.psurname = value;
    }

    /**
     * Gets the value of the recString20 property.
     * 
     * @return
     *     possible object is
     *     {@link WeoRecStrings20User }
     *     
     */
    public WeoRecStrings20User getRecString20() {
        return recString20;
    }

    /**
     * Sets the value of the recString20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeoRecStrings20User }
     *     
     */
    public void setRecString20(WeoRecStrings20User value) {
        this.recString20 = value;
    }

    /**
     * Gets the value of the parea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParea() {
        return parea;
    }

    /**
     * Sets the value of the parea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParea(String value) {
        this.parea = value;
    }

    /**
     * Gets the value of the pcustomerTextName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcustomerTextName() {
        return pcustomerTextName;
    }

    /**
     * Sets the value of the pcustomerTextName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcustomerTextName(String value) {
        this.pcustomerTextName = value;
    }

    /**
     * Gets the value of the pfirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfirstName() {
        return pfirstName;
    }

    /**
     * Sets the value of the pfirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfirstName(String value) {
        this.pfirstName = value;
    }

    /**
     * Gets the value of the ppostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpostcode() {
        return ppostcode;
    }

    /**
     * Sets the value of the ppostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpostcode(String value) {
        this.ppostcode = value;
    }

    /**
     * Gets the value of the ppartId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPpartId() {
        return ppartId;
    }

    /**
     * Sets the value of the ppartId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPpartId(BigDecimal value) {
        this.ppartId = value;
    }

    /**
     * Gets the value of the ppassportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpassportNo() {
        return ppassportNo;
    }

    /**
     * Sets the value of the ppassportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpassportNo(String value) {
        this.ppassportNo = value;
    }

    /**
     * Gets the value of the pspCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPspCondition() {
        return pspCondition;
    }

    /**
     * Sets the value of the pspCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPspCondition(String value) {
        this.pspCondition = value;
    }

    /**
     * Gets the value of the pentryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPentryDate() {
        return pentryDate;
    }

    /**
     * Sets the value of the pentryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPentryDate(String value) {
        this.pentryDate = value;
    }

}
