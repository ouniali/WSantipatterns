
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
 *         &lt;element name="InterestInc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DividendInc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LTCGWhereSTTPaid" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NetAgriIncOrOthrIncRule7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShareOfProfitFirmAOP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Others" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalExemptInc">
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
    "interestInc",
    "dividendInc",
    "ltcgWhereSTTPaid",
    "netAgriIncOrOthrIncRule7",
    "shareOfProfitFirmAOP",
    "others",
    "totalExemptInc"
})
@XmlRootElement(name = "ScheduleEI")
public class ScheduleEI {

    @XmlElement(name = "InterestInc", defaultValue = "0")
    protected BigInteger interestInc;
    @XmlElement(name = "DividendInc", defaultValue = "0")
    protected BigInteger dividendInc;
    @XmlElement(name = "LTCGWhereSTTPaid", defaultValue = "0")
    protected BigInteger ltcgWhereSTTPaid;
    @XmlElement(name = "NetAgriIncOrOthrIncRule7", defaultValue = "0")
    protected BigInteger netAgriIncOrOthrIncRule7;
    @XmlElement(name = "ShareOfProfitFirmAOP", defaultValue = "0")
    protected BigInteger shareOfProfitFirmAOP;
    @XmlElement(name = "Others", defaultValue = "0")
    protected BigInteger others;
    @XmlElement(name = "TotalExemptInc", required = true, defaultValue = "0")
    protected BigInteger totalExemptInc;

    /**
     * Gets the value of the interestInc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInterestInc() {
        return interestInc;
    }

    /**
     * Sets the value of the interestInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInterestInc(BigInteger value) {
        this.interestInc = value;
    }

    /**
     * Gets the value of the dividendInc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDividendInc() {
        return dividendInc;
    }

    /**
     * Sets the value of the dividendInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDividendInc(BigInteger value) {
        this.dividendInc = value;
    }

    /**
     * Gets the value of the ltcgWhereSTTPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLTCGWhereSTTPaid() {
        return ltcgWhereSTTPaid;
    }

    /**
     * Sets the value of the ltcgWhereSTTPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLTCGWhereSTTPaid(BigInteger value) {
        this.ltcgWhereSTTPaid = value;
    }

    /**
     * Gets the value of the netAgriIncOrOthrIncRule7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNetAgriIncOrOthrIncRule7() {
        return netAgriIncOrOthrIncRule7;
    }

    /**
     * Sets the value of the netAgriIncOrOthrIncRule7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNetAgriIncOrOthrIncRule7(BigInteger value) {
        this.netAgriIncOrOthrIncRule7 = value;
    }

    /**
     * Gets the value of the shareOfProfitFirmAOP property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShareOfProfitFirmAOP() {
        return shareOfProfitFirmAOP;
    }

    /**
     * Sets the value of the shareOfProfitFirmAOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShareOfProfitFirmAOP(BigInteger value) {
        this.shareOfProfitFirmAOP = value;
    }

    /**
     * Gets the value of the others property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOthers() {
        return others;
    }

    /**
     * Sets the value of the others property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOthers(BigInteger value) {
        this.others = value;
    }

    /**
     * Gets the value of the totalExemptInc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalExemptInc() {
        return totalExemptInc;
    }

    /**
     * Sets the value of the totalExemptInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalExemptInc(BigInteger value) {
        this.totalExemptInc = value;
    }

}
