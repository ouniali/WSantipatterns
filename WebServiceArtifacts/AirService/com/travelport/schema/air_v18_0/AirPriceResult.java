
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.TypeResultMessage;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirPricingSolution" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirPriceError" type="{http://www.travelport.com/schema/common_v15_0}typeResultMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CommandKey">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airPricingSolution",
    "fareRule",
    "airPriceError"
})
@XmlRootElement(name = "AirPriceResult")
public class AirPriceResult {

    @XmlElement(name = "AirPricingSolution")
    protected AirPricingSolution airPricingSolution;
    @XmlElement(name = "FareRule")
    protected List<FareRule> fareRule;
    @XmlElement(name = "AirPriceError")
    protected TypeResultMessage airPriceError;
    @XmlAttribute(name = "CommandKey")
    protected String commandKey;

    /**
     * Gets the value of the airPricingSolution property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingSolution }
     *     
     */
    public AirPricingSolution getAirPricingSolution() {
        return airPricingSolution;
    }

    /**
     * Sets the value of the airPricingSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingSolution }
     *     
     */
    public void setAirPricingSolution(AirPricingSolution value) {
        this.airPricingSolution = value;
    }

    /**
     * Gets the value of the fareRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRule }
     * 
     * 
     */
    public List<FareRule> getFareRule() {
        if (fareRule == null) {
            fareRule = new ArrayList<FareRule>();
        }
        return this.fareRule;
    }

    /**
     * Gets the value of the airPriceError property.
     * 
     * @return
     *     possible object is
     *     {@link TypeResultMessage }
     *     
     */
    public TypeResultMessage getAirPriceError() {
        return airPriceError;
    }

    /**
     * Sets the value of the airPriceError property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeResultMessage }
     *     
     */
    public void setAirPriceError(TypeResultMessage value) {
        this.airPriceError = value;
    }

    /**
     * Gets the value of the commandKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandKey() {
        return commandKey;
    }

    /**
     * Sets the value of the commandKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandKey(String value) {
        this.commandKey = value;
    }

}
