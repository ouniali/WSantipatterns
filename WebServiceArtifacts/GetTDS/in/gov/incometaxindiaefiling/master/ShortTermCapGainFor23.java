
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}NRIAssetSec48"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}OtherAsset"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}AmtDeemedCGSec54"/>
 *         &lt;element name="TotalSTCG">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STCGSec111A">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STCGNotSec111A">
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
    "otherAsset",
    "amtDeemedCGSec54",
    "totalSTCG",
    "stcgSec111A",
    "stcgNotSec111A"
})
@XmlRootElement(name = "ShortTermCapGainFor23")
public class ShortTermCapGainFor23 {

    @XmlElement(name = "NRIAssetSec48", defaultValue = "0")
    protected long nriAssetSec48;
    @XmlElement(name = "OtherAsset", required = true)
    protected OtherAsset otherAsset;
    @XmlElement(name = "AmtDeemedCGSec54", required = true, defaultValue = "0")
    protected BigInteger amtDeemedCGSec54;
    @XmlElement(name = "TotalSTCG", defaultValue = "0")
    protected long totalSTCG;
    @XmlElement(name = "STCGSec111A", defaultValue = "0")
    protected long stcgSec111A;
    @XmlElement(name = "STCGNotSec111A", defaultValue = "0")
    protected long stcgNotSec111A;

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
     * Gets the value of the otherAsset property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAsset }
     *     
     */
    public OtherAsset getOtherAsset() {
        return otherAsset;
    }

    /**
     * Sets the value of the otherAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAsset }
     *     
     */
    public void setOtherAsset(OtherAsset value) {
        this.otherAsset = value;
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
     * Gets the value of the totalSTCG property.
     * 
     */
    public long getTotalSTCG() {
        return totalSTCG;
    }

    /**
     * Sets the value of the totalSTCG property.
     * 
     */
    public void setTotalSTCG(long value) {
        this.totalSTCG = value;
    }

    /**
     * Gets the value of the stcgSec111A property.
     * 
     */
    public long getSTCGSec111A() {
        return stcgSec111A;
    }

    /**
     * Sets the value of the stcgSec111A property.
     * 
     */
    public void setSTCGSec111A(long value) {
        this.stcgSec111A = value;
    }

    /**
     * Gets the value of the stcgNotSec111A property.
     * 
     */
    public long getSTCGNotSec111A() {
        return stcgNotSec111A;
    }

    /**
     * Sets the value of the stcgNotSec111A property.
     * 
     */
    public void setSTCGNotSec111A(long value) {
        this.stcgNotSec111A = value;
    }

}
