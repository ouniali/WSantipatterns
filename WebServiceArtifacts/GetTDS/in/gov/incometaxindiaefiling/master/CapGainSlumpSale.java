
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
 *         &lt;element name="FullConsideration">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NetWorthOfUTDivn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CGSlumpSale">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DednUs54s">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NetCGSlumpSale">
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
    "fullConsideration",
    "netWorthOfUTDivn",
    "cgSlumpSale",
    "dednUs54S",
    "netCGSlumpSale"
})
@XmlRootElement(name = "CapGainSlumpSale")
public class CapGainSlumpSale {

    @XmlElement(name = "FullConsideration", required = true, defaultValue = "0")
    protected BigInteger fullConsideration;
    @XmlElement(name = "NetWorthOfUTDivn", required = true, defaultValue = "0")
    protected BigInteger netWorthOfUTDivn;
    @XmlElement(name = "CGSlumpSale", defaultValue = "0")
    protected long cgSlumpSale;
    @XmlElement(name = "DednUs54s", required = true, defaultValue = "0")
    protected BigInteger dednUs54S;
    @XmlElement(name = "NetCGSlumpSale", defaultValue = "0")
    protected long netCGSlumpSale;

    /**
     * Gets the value of the fullConsideration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFullConsideration() {
        return fullConsideration;
    }

    /**
     * Sets the value of the fullConsideration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFullConsideration(BigInteger value) {
        this.fullConsideration = value;
    }

    /**
     * Gets the value of the netWorthOfUTDivn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNetWorthOfUTDivn() {
        return netWorthOfUTDivn;
    }

    /**
     * Sets the value of the netWorthOfUTDivn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNetWorthOfUTDivn(BigInteger value) {
        this.netWorthOfUTDivn = value;
    }

    /**
     * Gets the value of the cgSlumpSale property.
     * 
     */
    public long getCGSlumpSale() {
        return cgSlumpSale;
    }

    /**
     * Sets the value of the cgSlumpSale property.
     * 
     */
    public void setCGSlumpSale(long value) {
        this.cgSlumpSale = value;
    }

    /**
     * Gets the value of the dednUs54S property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDednUs54S() {
        return dednUs54S;
    }

    /**
     * Sets the value of the dednUs54S property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDednUs54S(BigInteger value) {
        this.dednUs54S = value;
    }

    /**
     * Gets the value of the netCGSlumpSale property.
     * 
     */
    public long getNetCGSlumpSale() {
        return netCGSlumpSale;
    }

    /**
     * Sets the value of the netCGSlumpSale property.
     * 
     */
    public void setNetCGSlumpSale(long value) {
        this.netCGSlumpSale = value;
    }

}
