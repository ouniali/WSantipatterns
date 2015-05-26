
package in.gov.incometaxindiaefiling.master;

import java.math.BigInteger;
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
 *         &lt;element name="DeductSSIUs80_IB_3">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductJKLocUs80_IB_4">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductBackStatesUs80_IB_4">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductBackDisttUs80_IB_5">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductMultiplexUs80_IB_7A">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductConvCentUs80_IB_7B">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductScientificResUs80_IB_8A">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductMinOilUs80_IB_9">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductHousUs80_IB_10">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductColdChainUs80_IB_11">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductFruitVegUs80_IB_11A">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductFoodGrainUs80_IB_11A">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeductRurHospUs80_IB_11B">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotSchedule80_IB">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
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
    "deductSSIUs80IB3",
    "deductJKLocUs80IB4",
    "deductBackStatesUs80IB4",
    "deductBackDisttUs80IB5",
    "deductMultiplexUs80IB7A",
    "deductConvCentUs80IB7B",
    "deductScientificResUs80IB8A",
    "deductMinOilUs80IB9",
    "deductHousUs80IB10",
    "deductColdChainUs80IB11",
    "deductFruitVegUs80IB11A",
    "deductFoodGrainUs80IB11A",
    "deductRurHospUs80IB11B",
    "totSchedule80IB"
})
@XmlRootElement(name = "Schedule80_IB")
public class Schedule80IB {

    @XmlElement(name = "DeductSSIUs80_IB_3", required = true, defaultValue = "0")
    protected BigInteger deductSSIUs80IB3;
    @XmlElement(name = "DeductJKLocUs80_IB_4", required = true, defaultValue = "0")
    protected BigInteger deductJKLocUs80IB4;
    @XmlElement(name = "DeductBackStatesUs80_IB_4", required = true, defaultValue = "0")
    protected BigInteger deductBackStatesUs80IB4;
    @XmlElement(name = "DeductBackDisttUs80_IB_5", required = true, defaultValue = "0")
    protected BigInteger deductBackDisttUs80IB5;
    @XmlElement(name = "DeductMultiplexUs80_IB_7A", required = true, defaultValue = "0")
    protected BigInteger deductMultiplexUs80IB7A;
    @XmlElement(name = "DeductConvCentUs80_IB_7B", required = true, defaultValue = "0")
    protected BigInteger deductConvCentUs80IB7B;
    @XmlElement(name = "DeductScientificResUs80_IB_8A", required = true, defaultValue = "0")
    protected BigInteger deductScientificResUs80IB8A;
    @XmlElement(name = "DeductMinOilUs80_IB_9", required = true, defaultValue = "0")
    protected BigInteger deductMinOilUs80IB9;
    @XmlElement(name = "DeductHousUs80_IB_10", required = true, defaultValue = "0")
    protected BigInteger deductHousUs80IB10;
    @XmlElement(name = "DeductColdChainUs80_IB_11", required = true, defaultValue = "0")
    protected BigInteger deductColdChainUs80IB11;
    @XmlElement(name = "DeductFruitVegUs80_IB_11A", required = true, defaultValue = "0")
    protected BigInteger deductFruitVegUs80IB11A;
    @XmlElement(name = "DeductFoodGrainUs80_IB_11A", required = true, defaultValue = "0")
    protected BigInteger deductFoodGrainUs80IB11A;
    @XmlElement(name = "DeductRurHospUs80_IB_11B", required = true, defaultValue = "0")
    protected BigInteger deductRurHospUs80IB11B;
    @XmlElement(name = "TotSchedule80_IB", required = true, defaultValue = "0")
    protected BigInteger totSchedule80IB;

    /**
     * Gets the value of the deductSSIUs80IB3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductSSIUs80IB3() {
        return deductSSIUs80IB3;
    }

    /**
     * Sets the value of the deductSSIUs80IB3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductSSIUs80IB3(BigInteger value) {
        this.deductSSIUs80IB3 = value;
    }

    /**
     * Gets the value of the deductJKLocUs80IB4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductJKLocUs80IB4() {
        return deductJKLocUs80IB4;
    }

    /**
     * Sets the value of the deductJKLocUs80IB4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductJKLocUs80IB4(BigInteger value) {
        this.deductJKLocUs80IB4 = value;
    }

    /**
     * Gets the value of the deductBackStatesUs80IB4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductBackStatesUs80IB4() {
        return deductBackStatesUs80IB4;
    }

    /**
     * Sets the value of the deductBackStatesUs80IB4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductBackStatesUs80IB4(BigInteger value) {
        this.deductBackStatesUs80IB4 = value;
    }

    /**
     * Gets the value of the deductBackDisttUs80IB5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductBackDisttUs80IB5() {
        return deductBackDisttUs80IB5;
    }

    /**
     * Sets the value of the deductBackDisttUs80IB5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductBackDisttUs80IB5(BigInteger value) {
        this.deductBackDisttUs80IB5 = value;
    }

    /**
     * Gets the value of the deductMultiplexUs80IB7A property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductMultiplexUs80IB7A() {
        return deductMultiplexUs80IB7A;
    }

    /**
     * Sets the value of the deductMultiplexUs80IB7A property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductMultiplexUs80IB7A(BigInteger value) {
        this.deductMultiplexUs80IB7A = value;
    }

    /**
     * Gets the value of the deductConvCentUs80IB7B property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductConvCentUs80IB7B() {
        return deductConvCentUs80IB7B;
    }

    /**
     * Sets the value of the deductConvCentUs80IB7B property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductConvCentUs80IB7B(BigInteger value) {
        this.deductConvCentUs80IB7B = value;
    }

    /**
     * Gets the value of the deductScientificResUs80IB8A property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductScientificResUs80IB8A() {
        return deductScientificResUs80IB8A;
    }

    /**
     * Sets the value of the deductScientificResUs80IB8A property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductScientificResUs80IB8A(BigInteger value) {
        this.deductScientificResUs80IB8A = value;
    }

    /**
     * Gets the value of the deductMinOilUs80IB9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductMinOilUs80IB9() {
        return deductMinOilUs80IB9;
    }

    /**
     * Sets the value of the deductMinOilUs80IB9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductMinOilUs80IB9(BigInteger value) {
        this.deductMinOilUs80IB9 = value;
    }

    /**
     * Gets the value of the deductHousUs80IB10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductHousUs80IB10() {
        return deductHousUs80IB10;
    }

    /**
     * Sets the value of the deductHousUs80IB10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductHousUs80IB10(BigInteger value) {
        this.deductHousUs80IB10 = value;
    }

    /**
     * Gets the value of the deductColdChainUs80IB11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductColdChainUs80IB11() {
        return deductColdChainUs80IB11;
    }

    /**
     * Sets the value of the deductColdChainUs80IB11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductColdChainUs80IB11(BigInteger value) {
        this.deductColdChainUs80IB11 = value;
    }

    /**
     * Gets the value of the deductFruitVegUs80IB11A property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductFruitVegUs80IB11A() {
        return deductFruitVegUs80IB11A;
    }

    /**
     * Sets the value of the deductFruitVegUs80IB11A property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductFruitVegUs80IB11A(BigInteger value) {
        this.deductFruitVegUs80IB11A = value;
    }

    /**
     * Gets the value of the deductFoodGrainUs80IB11A property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductFoodGrainUs80IB11A() {
        return deductFoodGrainUs80IB11A;
    }

    /**
     * Sets the value of the deductFoodGrainUs80IB11A property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductFoodGrainUs80IB11A(BigInteger value) {
        this.deductFoodGrainUs80IB11A = value;
    }

    /**
     * Gets the value of the deductRurHospUs80IB11B property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeductRurHospUs80IB11B() {
        return deductRurHospUs80IB11B;
    }

    /**
     * Sets the value of the deductRurHospUs80IB11B property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeductRurHospUs80IB11B(BigInteger value) {
        this.deductRurHospUs80IB11B = value;
    }

    /**
     * Gets the value of the totSchedule80IB property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotSchedule80IB() {
        return totSchedule80IB;
    }

    /**
     * Sets the value of the totSchedule80IB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotSchedule80IB(BigInteger value) {
        this.totSchedule80IB = value;
    }

}
