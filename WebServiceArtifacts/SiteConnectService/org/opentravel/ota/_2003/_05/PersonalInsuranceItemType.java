
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonalInsuranceItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalInsuranceItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerCounts" type="{http://www.opentravel.org/OTA/2003/05}CustomerCountsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}PkgPersonalInsuranceCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalInsuranceItemType", propOrder = {
    "customerCounts"
})
public class PersonalInsuranceItemType {

    @XmlElement(name = "CustomerCounts", required = true)
    protected CustomerCountsType customerCounts;
    @XmlAttribute(name = "Code", required = true)
    protected PkgPersonalInsuranceCode code;

    /**
     * Gets the value of the customerCounts property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCountsType }
     *     
     */
    public CustomerCountsType getCustomerCounts() {
        return customerCounts;
    }

    /**
     * Sets the value of the customerCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCountsType }
     *     
     */
    public void setCustomerCounts(CustomerCountsType value) {
        this.customerCounts = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link PkgPersonalInsuranceCode }
     *     
     */
    public PkgPersonalInsuranceCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link PkgPersonalInsuranceCode }
     *     
     */
    public void setCode(PkgPersonalInsuranceCode value) {
        this.code = value;
    }

}
