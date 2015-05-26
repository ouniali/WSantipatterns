
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.TypePassengerType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}typePassengerType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareGuaranteeInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareGuaranteeInfo"
})
@XmlRootElement(name = "PassengerType")
public class PassengerType
    extends TypePassengerType
{

    @XmlElement(name = "FareGuaranteeInfo")
    protected FareGuaranteeInfo fareGuaranteeInfo;

    /**
     * Gets the value of the fareGuaranteeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareGuaranteeInfo }
     *     
     */
    public FareGuaranteeInfo getFareGuaranteeInfo() {
        return fareGuaranteeInfo;
    }

    /**
     * Sets the value of the fareGuaranteeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareGuaranteeInfo }
     *     
     */
    public void setFareGuaranteeInfo(FareGuaranteeInfo value) {
        this.fareGuaranteeInfo = value;
    }

}
