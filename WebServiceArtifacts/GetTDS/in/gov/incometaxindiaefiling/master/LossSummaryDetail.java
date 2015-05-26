
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
 *         &lt;element name="HPLossCF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BusLossOthThanSpecLossCF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LossFrmSpecBusCF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LossFrmSpecifiedBusCF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STCGLossCF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LTCGLossCF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OthSrcLossRaceHorseCF" minOccurs="0">
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
    "hpLossCF",
    "busLossOthThanSpecLossCF",
    "lossFrmSpecBusCF",
    "lossFrmSpecifiedBusCF",
    "stcgLossCF",
    "ltcgLossCF",
    "othSrcLossRaceHorseCF"
})
@XmlRootElement(name = "LossSummaryDetail")
public class LossSummaryDetail {

    @XmlElement(name = "HPLossCF", defaultValue = "0")
    protected BigInteger hpLossCF;
    @XmlElement(name = "BusLossOthThanSpecLossCF", defaultValue = "0")
    protected BigInteger busLossOthThanSpecLossCF;
    @XmlElement(name = "LossFrmSpecBusCF", defaultValue = "0")
    protected BigInteger lossFrmSpecBusCF;
    @XmlElement(name = "LossFrmSpecifiedBusCF", defaultValue = "0")
    protected BigInteger lossFrmSpecifiedBusCF;
    @XmlElement(name = "STCGLossCF", defaultValue = "0")
    protected BigInteger stcgLossCF;
    @XmlElement(name = "LTCGLossCF", defaultValue = "0")
    protected BigInteger ltcgLossCF;
    @XmlElement(name = "OthSrcLossRaceHorseCF", defaultValue = "0")
    protected BigInteger othSrcLossRaceHorseCF;

    /**
     * Gets the value of the hpLossCF property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHPLossCF() {
        return hpLossCF;
    }

    /**
     * Sets the value of the hpLossCF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHPLossCF(BigInteger value) {
        this.hpLossCF = value;
    }

    /**
     * Gets the value of the busLossOthThanSpecLossCF property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusLossOthThanSpecLossCF() {
        return busLossOthThanSpecLossCF;
    }

    /**
     * Sets the value of the busLossOthThanSpecLossCF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusLossOthThanSpecLossCF(BigInteger value) {
        this.busLossOthThanSpecLossCF = value;
    }

    /**
     * Gets the value of the lossFrmSpecBusCF property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLossFrmSpecBusCF() {
        return lossFrmSpecBusCF;
    }

    /**
     * Sets the value of the lossFrmSpecBusCF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLossFrmSpecBusCF(BigInteger value) {
        this.lossFrmSpecBusCF = value;
    }

    /**
     * Gets the value of the lossFrmSpecifiedBusCF property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLossFrmSpecifiedBusCF() {
        return lossFrmSpecifiedBusCF;
    }

    /**
     * Sets the value of the lossFrmSpecifiedBusCF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLossFrmSpecifiedBusCF(BigInteger value) {
        this.lossFrmSpecifiedBusCF = value;
    }

    /**
     * Gets the value of the stcgLossCF property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSTCGLossCF() {
        return stcgLossCF;
    }

    /**
     * Sets the value of the stcgLossCF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSTCGLossCF(BigInteger value) {
        this.stcgLossCF = value;
    }

    /**
     * Gets the value of the ltcgLossCF property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLTCGLossCF() {
        return ltcgLossCF;
    }

    /**
     * Sets the value of the ltcgLossCF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLTCGLossCF(BigInteger value) {
        this.ltcgLossCF = value;
    }

    /**
     * Gets the value of the othSrcLossRaceHorseCF property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOthSrcLossRaceHorseCF() {
        return othSrcLossRaceHorseCF;
    }

    /**
     * Sets the value of the othSrcLossRaceHorseCF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOthSrcLossRaceHorseCF(BigInteger value) {
        this.othSrcLossRaceHorseCF = value;
    }

}
