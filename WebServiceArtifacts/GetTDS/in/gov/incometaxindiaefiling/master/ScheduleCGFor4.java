
package in.gov.incometaxindiaefiling.master;

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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}ShortTermCapGainFor4" minOccurs="0"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}LongTermCapGain4" minOccurs="0"/>
 *         &lt;element name="IncChargeableHeadCapGains" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}AccruOrRecOfCG" minOccurs="0"/>
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
    "shortTermCapGainFor4",
    "longTermCapGain4",
    "incChargeableHeadCapGains",
    "accruOrRecOfCG"
})
@XmlRootElement(name = "ScheduleCGFor4")
public class ScheduleCGFor4 {

    @XmlElement(name = "ShortTermCapGainFor4")
    protected ShortTermCapGainFor4 shortTermCapGainFor4;
    @XmlElement(name = "LongTermCapGain4")
    protected LongTermCapGain4 longTermCapGain4;
    @XmlElement(name = "IncChargeableHeadCapGains", defaultValue = "0")
    protected Long incChargeableHeadCapGains;
    @XmlElement(name = "AccruOrRecOfCG")
    protected AccruOrRecOfCG accruOrRecOfCG;

    /**
     * Gets the value of the shortTermCapGainFor4 property.
     * 
     * @return
     *     possible object is
     *     {@link ShortTermCapGainFor4 }
     *     
     */
    public ShortTermCapGainFor4 getShortTermCapGainFor4() {
        return shortTermCapGainFor4;
    }

    /**
     * Sets the value of the shortTermCapGainFor4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortTermCapGainFor4 }
     *     
     */
    public void setShortTermCapGainFor4(ShortTermCapGainFor4 value) {
        this.shortTermCapGainFor4 = value;
    }

    /**
     * Gets the value of the longTermCapGain4 property.
     * 
     * @return
     *     possible object is
     *     {@link LongTermCapGain4 }
     *     
     */
    public LongTermCapGain4 getLongTermCapGain4() {
        return longTermCapGain4;
    }

    /**
     * Sets the value of the longTermCapGain4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongTermCapGain4 }
     *     
     */
    public void setLongTermCapGain4(LongTermCapGain4 value) {
        this.longTermCapGain4 = value;
    }

    /**
     * Gets the value of the incChargeableHeadCapGains property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncChargeableHeadCapGains() {
        return incChargeableHeadCapGains;
    }

    /**
     * Sets the value of the incChargeableHeadCapGains property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncChargeableHeadCapGains(Long value) {
        this.incChargeableHeadCapGains = value;
    }

    /**
     * Info about accrual or reciept of Capital Gains after Adjustments of Losses in Sch CYLA and BFLA
     * 
     * @return
     *     possible object is
     *     {@link AccruOrRecOfCG }
     *     
     */
    public AccruOrRecOfCG getAccruOrRecOfCG() {
        return accruOrRecOfCG;
    }

    /**
     * Sets the value of the accruOrRecOfCG property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccruOrRecOfCG }
     *     
     */
    public void setAccruOrRecOfCG(AccruOrRecOfCG value) {
        this.accruOrRecOfCG = value;
    }

}
