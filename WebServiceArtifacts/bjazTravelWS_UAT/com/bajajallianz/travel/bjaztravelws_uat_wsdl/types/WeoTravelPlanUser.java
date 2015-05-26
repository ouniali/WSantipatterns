
package com.bajajallianz.travel.bjaztravelws_uat_wsdl.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeoTravelPlanUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeoTravelPlanUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/bajajallianz/travel/BjazTravelWS_UAT.wsdl/types/}WeoTravelPlanBase">
 *       &lt;sequence>
 *         &lt;element name="countPplan" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="pplan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeoTravelPlanUser", propOrder = {
    "countPplan",
    "pplan"
})
public class WeoTravelPlanUser
    extends WeoTravelPlanBase
{

    @XmlElement(required = true, nillable = true)
    protected BigDecimal countPplan;
    @XmlElement(required = true, nillable = true)
    protected String pplan;

    /**
     * Gets the value of the countPplan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCountPplan() {
        return countPplan;
    }

    /**
     * Sets the value of the countPplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCountPplan(BigDecimal value) {
        this.countPplan = value;
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

}
