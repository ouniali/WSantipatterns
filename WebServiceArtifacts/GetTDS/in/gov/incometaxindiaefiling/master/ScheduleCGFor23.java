
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}ShortTermCapGainFor23" minOccurs="0"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}LongTermCapGain23" minOccurs="0"/>
 *         &lt;element name="TotScheduleCGFor23">
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
    "shortTermCapGainFor23",
    "longTermCapGain23",
    "totScheduleCGFor23",
    "accruOrRecOfCG"
})
@XmlRootElement(name = "ScheduleCGFor23")
public class ScheduleCGFor23 {

    @XmlElement(name = "ShortTermCapGainFor23")
    protected ShortTermCapGainFor23 shortTermCapGainFor23;
    @XmlElement(name = "LongTermCapGain23")
    protected LongTermCapGain23 longTermCapGain23;
    @XmlElement(name = "TotScheduleCGFor23", defaultValue = "0")
    protected long totScheduleCGFor23;
    @XmlElement(name = "AccruOrRecOfCG")
    protected AccruOrRecOfCG accruOrRecOfCG;

    /**
     * Gets the value of the shortTermCapGainFor23 property.
     * 
     * @return
     *     possible object is
     *     {@link ShortTermCapGainFor23 }
     *     
     */
    public ShortTermCapGainFor23 getShortTermCapGainFor23() {
        return shortTermCapGainFor23;
    }

    /**
     * Sets the value of the shortTermCapGainFor23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortTermCapGainFor23 }
     *     
     */
    public void setShortTermCapGainFor23(ShortTermCapGainFor23 value) {
        this.shortTermCapGainFor23 = value;
    }

    /**
     * Gets the value of the longTermCapGain23 property.
     * 
     * @return
     *     possible object is
     *     {@link LongTermCapGain23 }
     *     
     */
    public LongTermCapGain23 getLongTermCapGain23() {
        return longTermCapGain23;
    }

    /**
     * Sets the value of the longTermCapGain23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongTermCapGain23 }
     *     
     */
    public void setLongTermCapGain23(LongTermCapGain23 value) {
        this.longTermCapGain23 = value;
    }

    /**
     * Gets the value of the totScheduleCGFor23 property.
     * 
     */
    public long getTotScheduleCGFor23() {
        return totScheduleCGFor23;
    }

    /**
     * Sets the value of the totScheduleCGFor23 property.
     * 
     */
    public void setTotScheduleCGFor23(long value) {
        this.totScheduleCGFor23 = value;
    }

    /**
     * Info about accrual or reciept of Capital Gains after Adjustments of Losses. Do not enter in case of loss. 
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
