
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LoyaltyProgramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyProgramType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength0to32">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SingleVendorIndGroup"/>
 *       &lt;attribute name="ProgramCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="LoyaltyLevel" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgramType", propOrder = {
    "value"
})
public class LoyaltyProgramType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ProgramCode")
    protected String programCode;
    @XmlAttribute(name = "LoyaltyLevel")
    protected String loyaltyLevel;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "PrimaryLoyaltyIndicator")
    protected Boolean primaryLoyaltyIndicator;
    @XmlAttribute(name = "SingleVendorInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String singleVendorInd;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the programCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCode() {
        return programCode;
    }

    /**
     * Sets the value of the programCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramCode(String value) {
        this.programCode = value;
    }

    /**
     * Gets the value of the loyaltyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyLevel() {
        return loyaltyLevel;
    }

    /**
     * Sets the value of the loyaltyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyLevel(String value) {
        this.loyaltyLevel = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Gets the value of the primaryLoyaltyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryLoyaltyIndicator() {
        return primaryLoyaltyIndicator;
    }

    /**
     * Sets the value of the primaryLoyaltyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryLoyaltyIndicator(Boolean value) {
        this.primaryLoyaltyIndicator = value;
    }

    /**
     * Gets the value of the singleVendorInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleVendorInd() {
        return singleVendorInd;
    }

    /**
     * Sets the value of the singleVendorInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleVendorInd(String value) {
        this.singleVendorInd = value;
    }

}
