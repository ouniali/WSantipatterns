
package in.gov.incometaxindiaefiling.master;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}PropertyDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RentOfEarlierYrSec25AandAA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RentArearsSec25BAfter30pcDeduct" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalIncomeChargeableUnHP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "propertyDetails",
    "rentOfEarlierYrSec25AandAA",
    "rentArearsSec25BAfter30PcDeduct",
    "totalIncomeChargeableUnHP"
})
@XmlRootElement(name = "ScheduleHP")
public class ScheduleHP {

    @XmlElement(name = "PropertyDetails")
    protected List<PropertyDetails> propertyDetails;
    @XmlElement(name = "RentOfEarlierYrSec25AandAA", defaultValue = "0")
    protected BigInteger rentOfEarlierYrSec25AandAA;
    @XmlElement(name = "RentArearsSec25BAfter30pcDeduct", defaultValue = "0")
    protected BigInteger rentArearsSec25BAfter30PcDeduct;
    @XmlElement(name = "TotalIncomeChargeableUnHP", defaultValue = "0")
    protected long totalIncomeChargeableUnHP;

    /**
     * Gets the value of the propertyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyDetails }
     * 
     * 
     */
    public List<PropertyDetails> getPropertyDetails() {
        if (propertyDetails == null) {
            propertyDetails = new ArrayList<PropertyDetails>();
        }
        return this.propertyDetails;
    }

    /**
     * Gets the value of the rentOfEarlierYrSec25AandAA property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRentOfEarlierYrSec25AandAA() {
        return rentOfEarlierYrSec25AandAA;
    }

    /**
     * Sets the value of the rentOfEarlierYrSec25AandAA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRentOfEarlierYrSec25AandAA(BigInteger value) {
        this.rentOfEarlierYrSec25AandAA = value;
    }

    /**
     * Gets the value of the rentArearsSec25BAfter30PcDeduct property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRentArearsSec25BAfter30PcDeduct() {
        return rentArearsSec25BAfter30PcDeduct;
    }

    /**
     * Sets the value of the rentArearsSec25BAfter30PcDeduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRentArearsSec25BAfter30PcDeduct(BigInteger value) {
        this.rentArearsSec25BAfter30PcDeduct = value;
    }

    /**
     * Gets the value of the totalIncomeChargeableUnHP property.
     * 
     */
    public long getTotalIncomeChargeableUnHP() {
        return totalIncomeChargeableUnHP;
    }

    /**
     * Sets the value of the totalIncomeChargeableUnHP property.
     * 
     */
    public void setTotalIncomeChargeableUnHP(long value) {
        this.totalIncomeChargeableUnHP = value;
    }

}
