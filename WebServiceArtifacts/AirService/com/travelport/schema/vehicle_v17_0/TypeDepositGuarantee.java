
package com.travelport.schema.vehicle_v17_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.travelport.schema.common_v15_0.TypeReserveRequirement;


/**
 * The deposit and guarantee information for a vehicle rental.
 * 
 * <p>Java class for typeDepositGuarantee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeDepositGuarantee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Purpose" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeReserveRequirement" />
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="NumberOfDays"/>
 *             &lt;enumeration value="Amount"/>
 *             &lt;enumeration value="Percent"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Amount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="NumberOfDays" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="OptionType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="AfterBooking"/>
 *             &lt;enumeration value="PriorToPickup"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RequirementPassed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeDepositGuarantee")
public class TypeDepositGuarantee {

    @XmlAttribute(name = "Purpose", required = true)
    protected TypeReserveRequirement purpose;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Amount")
    protected String amount;
    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;
    @XmlAttribute(name = "DueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    @XmlAttribute(name = "NumberOfDays")
    protected BigInteger numberOfDays;
    @XmlAttribute(name = "OptionType")
    protected String optionType;
    @XmlAttribute(name = "Required")
    protected Boolean required;
    @XmlAttribute(name = "RequirementPassed")
    protected Boolean requirementPassed;

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link TypeReserveRequirement }
     *     
     */
    public TypeReserveRequirement getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReserveRequirement }
     *     
     */
    public void setPurpose(TypeReserveRequirement value) {
        this.purpose = value;
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
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the numberOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Sets the value of the numberOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDays(BigInteger value) {
        this.numberOfDays = value;
    }

    /**
     * Gets the value of the optionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionType() {
        return optionType;
    }

    /**
     * Sets the value of the optionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionType(String value) {
        this.optionType = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the requirementPassed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequirementPassed() {
        return requirementPassed;
    }

    /**
     * Sets the value of the requirementPassed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequirementPassed(Boolean value) {
        this.requirementPassed = value;
    }

}
