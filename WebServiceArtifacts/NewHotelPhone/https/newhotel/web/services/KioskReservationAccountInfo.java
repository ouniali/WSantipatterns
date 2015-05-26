
package https.newhotel.web.services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskReservationAccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskReservationAccountInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Movements" type="{https://NewHotel/Web/Services/}ArrayOfKioskReservationAccountLineInfo" minOccurs="0"/>
 *         &lt;element name="TotalCredits" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalDebits" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PendingValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskReservationAccountInfo", propOrder = {
    "movements",
    "totalCredits",
    "totalDebits",
    "pendingValue"
})
public class KioskReservationAccountInfo {

    @XmlElement(name = "Movements")
    protected ArrayOfKioskReservationAccountLineInfo movements;
    @XmlElement(name = "TotalCredits", required = true)
    protected BigDecimal totalCredits;
    @XmlElement(name = "TotalDebits", required = true)
    protected BigDecimal totalDebits;
    @XmlElement(name = "PendingValue", required = true)
    protected BigDecimal pendingValue;

    /**
     * Gets the value of the movements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskReservationAccountLineInfo }
     *     
     */
    public ArrayOfKioskReservationAccountLineInfo getMovements() {
        return movements;
    }

    /**
     * Sets the value of the movements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskReservationAccountLineInfo }
     *     
     */
    public void setMovements(ArrayOfKioskReservationAccountLineInfo value) {
        this.movements = value;
    }

    /**
     * Gets the value of the totalCredits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCredits() {
        return totalCredits;
    }

    /**
     * Sets the value of the totalCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCredits(BigDecimal value) {
        this.totalCredits = value;
    }

    /**
     * Gets the value of the totalDebits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDebits() {
        return totalDebits;
    }

    /**
     * Sets the value of the totalDebits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDebits(BigDecimal value) {
        this.totalDebits = value;
    }

    /**
     * Gets the value of the pendingValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPendingValue() {
        return pendingValue;
    }

    /**
     * Sets the value of the pendingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPendingValue(BigDecimal value) {
        this.pendingValue = value;
    }

}
