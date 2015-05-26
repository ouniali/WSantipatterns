
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
 *         &lt;element name="PersumptiveIncHeavyVehicle">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PersumptiveIncOtherVehicle">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotPersumInc44AE">
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
    "persumptiveIncHeavyVehicle",
    "persumptiveIncOtherVehicle",
    "totPersumInc44AE"
})
@XmlRootElement(name = "PersumptiveInc44AE")
public class PersumptiveInc44AE {

    @XmlElement(name = "PersumptiveIncHeavyVehicle", required = true, defaultValue = "0")
    protected BigInteger persumptiveIncHeavyVehicle;
    @XmlElement(name = "PersumptiveIncOtherVehicle", required = true, defaultValue = "0")
    protected BigInteger persumptiveIncOtherVehicle;
    @XmlElement(name = "TotPersumInc44AE", required = true, defaultValue = "0")
    protected BigInteger totPersumInc44AE;

    /**
     * Gets the value of the persumptiveIncHeavyVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersumptiveIncHeavyVehicle() {
        return persumptiveIncHeavyVehicle;
    }

    /**
     * Sets the value of the persumptiveIncHeavyVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersumptiveIncHeavyVehicle(BigInteger value) {
        this.persumptiveIncHeavyVehicle = value;
    }

    /**
     * Gets the value of the persumptiveIncOtherVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersumptiveIncOtherVehicle() {
        return persumptiveIncOtherVehicle;
    }

    /**
     * Sets the value of the persumptiveIncOtherVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersumptiveIncOtherVehicle(BigInteger value) {
        this.persumptiveIncOtherVehicle = value;
    }

    /**
     * Gets the value of the totPersumInc44AE property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotPersumInc44AE() {
        return totPersumInc44AE;
    }

    /**
     * Sets the value of the totPersumInc44AE property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotPersumInc44AE(BigInteger value) {
        this.totPersumInc44AE = value;
    }

}
