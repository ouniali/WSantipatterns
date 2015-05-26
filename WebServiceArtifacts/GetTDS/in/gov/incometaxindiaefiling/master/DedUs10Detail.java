
package in.gov.incometaxindiaefiling.master;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Undertaking">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DedFromUndertaking" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalDedUs10Sub">
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
    "undertaking",
    "totalDedUs10Sub"
})
@XmlRootElement(name = "DedUs10Detail")
public class DedUs10Detail {

    @XmlElement(name = "Undertaking", required = true)
    protected DedUs10Detail.Undertaking undertaking;
    @XmlElement(name = "TotalDedUs10Sub", required = true, defaultValue = "0")
    protected BigInteger totalDedUs10Sub;

    /**
     * Gets the value of the undertaking property.
     * 
     * @return
     *     possible object is
     *     {@link DedUs10Detail.Undertaking }
     *     
     */
    public DedUs10Detail.Undertaking getUndertaking() {
        return undertaking;
    }

    /**
     * Sets the value of the undertaking property.
     * 
     * @param value
     *     allowed object is
     *     {@link DedUs10Detail.Undertaking }
     *     
     */
    public void setUndertaking(DedUs10Detail.Undertaking value) {
        this.undertaking = value;
    }

    /**
     * Gets the value of the totalDedUs10Sub property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDedUs10Sub() {
        return totalDedUs10Sub;
    }

    /**
     * Sets the value of the totalDedUs10Sub property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDedUs10Sub(BigInteger value) {
        this.totalDedUs10Sub = value;
    }


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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DedFromUndertaking" maxOccurs="unbounded"/>
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
        "dedFromUndertaking"
    })
    public static class Undertaking {

        @XmlElement(name = "DedFromUndertaking", required = true, defaultValue = "0")
        protected List<BigInteger> dedFromUndertaking;

        /**
         * Gets the value of the dedFromUndertaking property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dedFromUndertaking property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDedFromUndertaking().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getDedFromUndertaking() {
            if (dedFromUndertaking == null) {
                dedFromUndertaking = new ArrayList<BigInteger>();
            }
            return this.dedFromUndertaking;
        }

    }

}
