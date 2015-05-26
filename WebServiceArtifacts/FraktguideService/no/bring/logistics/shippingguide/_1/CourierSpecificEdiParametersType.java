
package no.bring.logistics.shippingguide._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 This section holds the data required to make a booking for Courier Services.
 *             
 * 
 * <p>Java class for CourierSpecificEdiParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CourierSpecificEdiParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OperationsID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromRegion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToRegion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumberOfKilometers" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourierSpecificEdiParametersType", propOrder = {
    "department",
    "operationsID",
    "fromRegion",
    "toRegion",
    "fromZone",
    "toZone",
    "numberOfKilometers"
})
public class CourierSpecificEdiParametersType {

    @XmlElement(name = "Department", required = true)
    protected String department;
    @XmlElement(name = "OperationsID", required = true)
    protected String operationsID;
    @XmlElement(name = "FromRegion", required = true)
    protected String fromRegion;
    @XmlElement(name = "ToRegion", required = true)
    protected String toRegion;
    @XmlElement(name = "FromZone", required = true)
    protected String fromZone;
    @XmlElement(name = "ToZone", required = true)
    protected String toZone;
    @XmlElement(name = "NumberOfKilometers")
    protected BigInteger numberOfKilometers;

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the operationsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationsID() {
        return operationsID;
    }

    /**
     * Sets the value of the operationsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationsID(String value) {
        this.operationsID = value;
    }

    /**
     * Gets the value of the fromRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromRegion() {
        return fromRegion;
    }

    /**
     * Sets the value of the fromRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromRegion(String value) {
        this.fromRegion = value;
    }

    /**
     * Gets the value of the toRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRegion() {
        return toRegion;
    }

    /**
     * Sets the value of the toRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRegion(String value) {
        this.toRegion = value;
    }

    /**
     * Gets the value of the fromZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromZone() {
        return fromZone;
    }

    /**
     * Sets the value of the fromZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromZone(String value) {
        this.fromZone = value;
    }

    /**
     * Gets the value of the toZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToZone() {
        return toZone;
    }

    /**
     * Sets the value of the toZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToZone(String value) {
        this.toZone = value;
    }

    /**
     * Gets the value of the numberOfKilometers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfKilometers() {
        return numberOfKilometers;
    }

    /**
     * Sets the value of the numberOfKilometers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfKilometers(BigInteger value) {
        this.numberOfKilometers = value;
    }

}
