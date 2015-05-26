
package com.bajajallianz.travel.bjaztravelws_uat_wsdl.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeoTygeErrorMessageUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeoTygeErrorMessageUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl/types/}WeoTygeErrorMessageBase">
 *       &lt;sequence>
 *         &lt;element name="errNumber" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="parName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parIndex" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="errLevel" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeoTygeErrorMessageUser", propOrder = {
    "errNumber",
    "parName",
    "property",
    "errText",
    "parIndex",
    "errLevel"
})
public class WeoTygeErrorMessageUser
    extends WeoTygeErrorMessageBase
{

    @XmlElement(required = true, nillable = true)
    protected BigDecimal errNumber;
    @XmlElement(required = true, nillable = true)
    protected String parName;
    @XmlElement(required = true, nillable = true)
    protected String property;
    @XmlElement(required = true, nillable = true)
    protected String errText;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal parIndex;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal errLevel;

    /**
     * Gets the value of the errNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getErrNumber() {
        return errNumber;
    }

    /**
     * Sets the value of the errNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setErrNumber(BigDecimal value) {
        this.errNumber = value;
    }

    /**
     * Gets the value of the parName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParName() {
        return parName;
    }

    /**
     * Sets the value of the parName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParName(String value) {
        this.parName = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

    /**
     * Gets the value of the errText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrText() {
        return errText;
    }

    /**
     * Sets the value of the errText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrText(String value) {
        this.errText = value;
    }

    /**
     * Gets the value of the parIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParIndex() {
        return parIndex;
    }

    /**
     * Sets the value of the parIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParIndex(BigDecimal value) {
        this.parIndex = value;
    }

    /**
     * Gets the value of the errLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getErrLevel() {
        return errLevel;
    }

    /**
     * Sets the value of the errLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setErrLevel(BigDecimal value) {
        this.errLevel = value;
    }

}
