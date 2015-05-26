
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
 *         &lt;element name="DeductSEZ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DedUs10Detail"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "deductSEZ"
})
@XmlRootElement(name = "Schedule10AA")
public class Schedule10AA {

    @XmlElement(name = "DeductSEZ", required = true)
    protected Schedule10AA.DeductSEZ deductSEZ;

    /**
     * Gets the value of the deductSEZ property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule10AA.DeductSEZ }
     *     
     */
    public Schedule10AA.DeductSEZ getDeductSEZ() {
        return deductSEZ;
    }

    /**
     * Sets the value of the deductSEZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule10AA.DeductSEZ }
     *     
     */
    public void setDeductSEZ(Schedule10AA.DeductSEZ value) {
        this.deductSEZ = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DedUs10Detail"/>
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
        "dedUs10Detail"
    })
    public static class DeductSEZ {

        @XmlElement(name = "DedUs10Detail", required = true)
        protected DedUs10Detail dedUs10Detail;

        /**
         * Gets the value of the dedUs10Detail property.
         * 
         * @return
         *     possible object is
         *     {@link DedUs10Detail }
         *     
         */
        public DedUs10Detail getDedUs10Detail() {
            return dedUs10Detail;
        }

        /**
         * Sets the value of the dedUs10Detail property.
         * 
         * @param value
         *     allowed object is
         *     {@link DedUs10Detail }
         *     
         */
        public void setDedUs10Detail(DedUs10Detail value) {
            this.dedUs10Detail = value;
        }

    }

}
