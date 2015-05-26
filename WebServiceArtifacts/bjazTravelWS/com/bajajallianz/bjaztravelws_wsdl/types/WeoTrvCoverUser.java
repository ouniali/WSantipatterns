
package com.bajajallianz.bjaztravelws_wsdl.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeoTrvCoverUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeoTrvCoverUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/bajajallianz/BjazTravelWS.wsdl/types/}WeoTrvCoverBase">
 *       &lt;sequence>
 *         &lt;element name="pbenefits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pdeductible" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plimits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeoTrvCoverUser", propOrder = {
    "pbenefits",
    "pdeductible",
    "plimits"
})
public class WeoTrvCoverUser
    extends WeoTrvCoverBase
{

    @XmlElement(required = true, nillable = true)
    protected String pbenefits;
    @XmlElement(required = true, nillable = true)
    protected String pdeductible;
    @XmlElement(required = true, nillable = true)
    protected String plimits;

    /**
     * Gets the value of the pbenefits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPbenefits() {
        return pbenefits;
    }

    /**
     * Sets the value of the pbenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPbenefits(String value) {
        this.pbenefits = value;
    }

    /**
     * Gets the value of the pdeductible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdeductible() {
        return pdeductible;
    }

    /**
     * Sets the value of the pdeductible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdeductible(String value) {
        this.pdeductible = value;
    }

    /**
     * Gets the value of the plimits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlimits() {
        return plimits;
    }

    /**
     * Sets the value of the plimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlimits(String value) {
        this.plimits = value;
    }

}
