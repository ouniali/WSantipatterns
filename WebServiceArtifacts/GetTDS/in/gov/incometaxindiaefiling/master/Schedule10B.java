
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
 *         &lt;element name="DeductEOU">
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
    "deductEOU"
})
@XmlRootElement(name = "Schedule10B")
public class Schedule10B {

    @XmlElement(name = "DeductEOU", required = true)
    protected Schedule10B.DeductEOU deductEOU;

    /**
     * Gets the value of the deductEOU property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule10B.DeductEOU }
     *     
     */
    public Schedule10B.DeductEOU getDeductEOU() {
        return deductEOU;
    }

    /**
     * Sets the value of the deductEOU property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule10B.DeductEOU }
     *     
     */
    public void setDeductEOU(Schedule10B.DeductEOU value) {
        this.deductEOU = value;
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
    public static class DeductEOU {

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
