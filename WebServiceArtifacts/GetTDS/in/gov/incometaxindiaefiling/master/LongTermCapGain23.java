
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
 *         &lt;element name="NRIAssetSec48">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}OtherAssetNoProviso112"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}OtherAssetProviso112"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}AmtDeemedCGSec54"/>
 *         &lt;element name="TotalLTCG">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalLTCGUS112Ex">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalLTCGUS112NotEx">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
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
    "nriAssetSec48",
    "otherAssetNoProviso112",
    "otherAssetProviso112",
    "amtDeemedCGSec54",
    "totalLTCG",
    "totalLTCGUS112Ex",
    "totalLTCGUS112NotEx"
})
@XmlRootElement(name = "LongTermCapGain23")
public class LongTermCapGain23 {

    @XmlElement(name = "NRIAssetSec48", defaultValue = "0")
    protected long nriAssetSec48;
    @XmlElement(name = "OtherAssetNoProviso112", required = true)
    protected OtherAssetNoProviso112 otherAssetNoProviso112;
    @XmlElement(name = "OtherAssetProviso112", required = true)
    protected OtherAssetProviso112 otherAssetProviso112;
    @XmlElement(name = "AmtDeemedCGSec54", required = true, defaultValue = "0")
    protected BigInteger amtDeemedCGSec54;
    @XmlElement(name = "TotalLTCG", defaultValue = "0")
    protected long totalLTCG;
    @XmlElement(name = "TotalLTCGUS112Ex", defaultValue = "0")
    protected long totalLTCGUS112Ex;
    @XmlElement(name = "TotalLTCGUS112NotEx", defaultValue = "0")
    protected long totalLTCGUS112NotEx;

    /**
     * Gets the value of the nriAssetSec48 property.
     * 
     */
    public long getNRIAssetSec48() {
        return nriAssetSec48;
    }

    /**
     * Sets the value of the nriAssetSec48 property.
     * 
     */
    public void setNRIAssetSec48(long value) {
        this.nriAssetSec48 = value;
    }

    /**
     * Gets the value of the otherAssetNoProviso112 property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAssetNoProviso112 }
     *     
     */
    public OtherAssetNoProviso112 getOtherAssetNoProviso112() {
        return otherAssetNoProviso112;
    }

    /**
     * Sets the value of the otherAssetNoProviso112 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAssetNoProviso112 }
     *     
     */
    public void setOtherAssetNoProviso112(OtherAssetNoProviso112 value) {
        this.otherAssetNoProviso112 = value;
    }

    /**
     * Gets the value of the otherAssetProviso112 property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAssetProviso112 }
     *     
     */
    public OtherAssetProviso112 getOtherAssetProviso112() {
        return otherAssetProviso112;
    }

    /**
     * Sets the value of the otherAssetProviso112 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAssetProviso112 }
     *     
     */
    public void setOtherAssetProviso112(OtherAssetProviso112 value) {
        this.otherAssetProviso112 = value;
    }

    /**
     * Gets the value of the amtDeemedCGSec54 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmtDeemedCGSec54() {
        return amtDeemedCGSec54;
    }

    /**
     * Sets the value of the amtDeemedCGSec54 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmtDeemedCGSec54(BigInteger value) {
        this.amtDeemedCGSec54 = value;
    }

    /**
     * Gets the value of the totalLTCG property.
     * 
     */
    public long getTotalLTCG() {
        return totalLTCG;
    }

    /**
     * Sets the value of the totalLTCG property.
     * 
     */
    public void setTotalLTCG(long value) {
        this.totalLTCG = value;
    }

    /**
     * Gets the value of the totalLTCGUS112Ex property.
     * 
     */
    public long getTotalLTCGUS112Ex() {
        return totalLTCGUS112Ex;
    }

    /**
     * Sets the value of the totalLTCGUS112Ex property.
     * 
     */
    public void setTotalLTCGUS112Ex(long value) {
        this.totalLTCGUS112Ex = value;
    }

    /**
     * Gets the value of the totalLTCGUS112NotEx property.
     * 
     */
    public long getTotalLTCGUS112NotEx() {
        return totalLTCGUS112NotEx;
    }

    /**
     * Sets the value of the totalLTCGUS112NotEx property.
     * 
     */
    public void setTotalLTCGUS112NotEx(long value) {
        this.totalLTCGUS112NotEx = value;
    }

}
