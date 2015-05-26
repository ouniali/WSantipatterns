
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoveragePricedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoveragePricedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coverage" type="{http://www.opentravel.org/OTA/2003/05}CoverageType"/>
 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/>
 *         &lt;element name="Deductible" type="{http://www.opentravel.org/OTA/2003/05}DeductibleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoveragePricedType", propOrder = {
    "coverage",
    "charge",
    "deductible"
})
public class CoveragePricedType {

    @XmlElement(name = "Coverage", required = true)
    protected CoverageType coverage;
    @XmlElement(name = "Charge", required = true)
    protected VehicleChargeType charge;
    @XmlElement(name = "Deductible")
    protected DeductibleType deductible;
    @XmlAttribute(name = "Required")
    protected Boolean required;

    /**
     * Gets the value of the coverage property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageType }
     *     
     */
    public CoverageType getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageType }
     *     
     */
    public void setCoverage(CoverageType value) {
        this.coverage = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleChargeType }
     *     
     */
    public VehicleChargeType getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleChargeType }
     *     
     */
    public void setCharge(VehicleChargeType value) {
        this.charge = value;
    }

    /**
     * Gets the value of the deductible property.
     * 
     * @return
     *     possible object is
     *     {@link DeductibleType }
     *     
     */
    public DeductibleType getDeductible() {
        return deductible;
    }

    /**
     * Sets the value of the deductible property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductibleType }
     *     
     */
    public void setDeductible(DeductibleType value) {
        this.deductible = value;
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

}
