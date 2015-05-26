
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
 *         &lt;element name="IncOfCurYrUnderThatHead">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HPlossCurYrSetoff" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BusLossSetoff" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OthSrcLossNoRaceHorseSetoff" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IncOfCurYrAfterSetOff">
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
    "incOfCurYrUnderThatHead",
    "hPlossCurYrSetoff",
    "busLossSetoff",
    "othSrcLossNoRaceHorseSetoff",
    "incOfCurYrAfterSetOff"
})
@XmlRootElement(name = "IncCYLA")
public class IncCYLA {

    @XmlElement(name = "IncOfCurYrUnderThatHead", required = true, defaultValue = "0")
    protected BigInteger incOfCurYrUnderThatHead;
    @XmlElement(name = "HPlossCurYrSetoff", defaultValue = "0")
    protected BigInteger hPlossCurYrSetoff;
    @XmlElement(name = "BusLossSetoff", defaultValue = "0")
    protected BigInteger busLossSetoff;
    @XmlElement(name = "OthSrcLossNoRaceHorseSetoff", defaultValue = "0")
    protected BigInteger othSrcLossNoRaceHorseSetoff;
    @XmlElement(name = "IncOfCurYrAfterSetOff", required = true, defaultValue = "0")
    protected BigInteger incOfCurYrAfterSetOff;

    /**
     * Gets the value of the incOfCurYrUnderThatHead property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncOfCurYrUnderThatHead() {
        return incOfCurYrUnderThatHead;
    }

    /**
     * Sets the value of the incOfCurYrUnderThatHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncOfCurYrUnderThatHead(BigInteger value) {
        this.incOfCurYrUnderThatHead = value;
    }

    /**
     * Gets the value of the hPlossCurYrSetoff property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHPlossCurYrSetoff() {
        return hPlossCurYrSetoff;
    }

    /**
     * Sets the value of the hPlossCurYrSetoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHPlossCurYrSetoff(BigInteger value) {
        this.hPlossCurYrSetoff = value;
    }

    /**
     * Gets the value of the busLossSetoff property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusLossSetoff() {
        return busLossSetoff;
    }

    /**
     * Sets the value of the busLossSetoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusLossSetoff(BigInteger value) {
        this.busLossSetoff = value;
    }

    /**
     * Gets the value of the othSrcLossNoRaceHorseSetoff property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOthSrcLossNoRaceHorseSetoff() {
        return othSrcLossNoRaceHorseSetoff;
    }

    /**
     * Sets the value of the othSrcLossNoRaceHorseSetoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOthSrcLossNoRaceHorseSetoff(BigInteger value) {
        this.othSrcLossNoRaceHorseSetoff = value;
    }

    /**
     * Gets the value of the incOfCurYrAfterSetOff property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncOfCurYrAfterSetOff() {
        return incOfCurYrAfterSetOff;
    }

    /**
     * Sets the value of the incOfCurYrAfterSetOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncOfCurYrAfterSetOff(BigInteger value) {
        this.incOfCurYrAfterSetOff = value;
    }

}
