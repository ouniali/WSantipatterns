
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}PersumptiveInc44AD"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}PersumptiveInc44AE"/>
 *         &lt;element name="IncChargeableUnderBus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}NoBooksOfAccBS"/>
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
    "persumptiveInc44AD",
    "persumptiveInc44AE",
    "incChargeableUnderBus",
    "noBooksOfAccBS"
})
@XmlRootElement(name = "ScheduleBPForITR4S")
public class ScheduleBPForITR4S {

    @XmlElement(name = "PersumptiveInc44AD", required = true)
    protected PersumptiveInc44AD persumptiveInc44AD;
    @XmlElement(name = "PersumptiveInc44AE", required = true)
    protected PersumptiveInc44AE persumptiveInc44AE;
    @XmlElement(name = "IncChargeableUnderBus", defaultValue = "0")
    protected long incChargeableUnderBus;
    @XmlElement(name = "NoBooksOfAccBS", required = true)
    protected NoBooksOfAccBS noBooksOfAccBS;

    /**
     * Gets the value of the persumptiveInc44AD property.
     * 
     * @return
     *     possible object is
     *     {@link PersumptiveInc44AD }
     *     
     */
    public PersumptiveInc44AD getPersumptiveInc44AD() {
        return persumptiveInc44AD;
    }

    /**
     * Sets the value of the persumptiveInc44AD property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersumptiveInc44AD }
     *     
     */
    public void setPersumptiveInc44AD(PersumptiveInc44AD value) {
        this.persumptiveInc44AD = value;
    }

    /**
     * Gets the value of the persumptiveInc44AE property.
     * 
     * @return
     *     possible object is
     *     {@link PersumptiveInc44AE }
     *     
     */
    public PersumptiveInc44AE getPersumptiveInc44AE() {
        return persumptiveInc44AE;
    }

    /**
     * Sets the value of the persumptiveInc44AE property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersumptiveInc44AE }
     *     
     */
    public void setPersumptiveInc44AE(PersumptiveInc44AE value) {
        this.persumptiveInc44AE = value;
    }

    /**
     * Gets the value of the incChargeableUnderBus property.
     * 
     */
    public long getIncChargeableUnderBus() {
        return incChargeableUnderBus;
    }

    /**
     * Sets the value of the incChargeableUnderBus property.
     * 
     */
    public void setIncChargeableUnderBus(long value) {
        this.incChargeableUnderBus = value;
    }

    /**
     * Gets the value of the noBooksOfAccBS property.
     * 
     * @return
     *     possible object is
     *     {@link NoBooksOfAccBS }
     *     
     */
    public NoBooksOfAccBS getNoBooksOfAccBS() {
        return noBooksOfAccBS;
    }

    /**
     * Sets the value of the noBooksOfAccBS property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoBooksOfAccBS }
     *     
     */
    public void setNoBooksOfAccBS(NoBooksOfAccBS value) {
        this.noBooksOfAccBS = value;
    }

}
