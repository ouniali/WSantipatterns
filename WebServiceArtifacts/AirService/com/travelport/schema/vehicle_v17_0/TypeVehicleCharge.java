
package com.travelport.schema.vehicle_v17_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Charges associated with a vehicle rental.
 * 
 * <p>Java class for typeVehicleCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeVehicleCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Amount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" minOccurs="0"/>
 *         &lt;element name="Percentage" type="{http://www.travelport.com/schema/common_v15_0}typePercentageWithDecimal" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="Category" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Tax"/>
 *             &lt;enumeration value="Surcharge"/>
 *             &lt;enumeration value="Coverage"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="NoCharge"/>
 *             &lt;enumeration value="Percent"/>
 *             &lt;enumeration value="Rental"/>
 *             &lt;enumeration value="PerContract"/>
 *             &lt;enumeration value="PerHour"/>
 *             &lt;enumeration value="PerDay"/>
 *             &lt;enumeration value="PerWeek"/>
 *             &lt;enumeration value="PerMonth"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="IncludedInRate">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="NotIncluded"/>
 *             &lt;enumeration value="IncludedInBase"/>
 *             &lt;enumeration value="IncludedInTotal"/>
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
@XmlType(name = "typeVehicleCharge", propOrder = {
    "amount",
    "percentage"
})
public class TypeVehicleCharge {

    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "Percentage")
    protected String percentage;
    @XmlAttribute(name = "Category", required = true)
    protected String category;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "IncludedInRate")
    protected String includedInRate;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentage(String value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the includedInRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludedInRate() {
        return includedInRate;
    }

    /**
     * Sets the value of the includedInRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludedInRate(String value) {
        this.includedInRate = value;
    }

}
