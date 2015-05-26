
package com.bajajallianz.bjaztravelws_wsdl.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeoTrvIntermediaryUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeoTrvIntermediaryUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/bajajallianz/BjazTravelWS.wsdl/types/}WeoTrvIntermediaryBase">
 *       &lt;sequence>
 *         &lt;element name="PAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeoTrvIntermediaryUser", propOrder = {
    "pAgentCode"
})
public class WeoTrvIntermediaryUser
    extends WeoTrvIntermediaryBase
{

    @XmlElement(name = "PAgentCode", required = true, nillable = true)
    protected String pAgentCode;

    /**
     * Gets the value of the pAgentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAgentCode() {
        return pAgentCode;
    }

    /**
     * Sets the value of the pAgentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAgentCode(String value) {
        this.pAgentCode = value;
    }

}
