
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Salaries" maxOccurs="unbounded"/>
 *         &lt;element name="TotIncUnderHeadSalaries" minOccurs="0">
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
    "salaries",
    "totIncUnderHeadSalaries"
})
@XmlRootElement(name = "ScheduleS")
public class ScheduleS {

    @XmlElement(name = "Salaries", required = true)
    protected List<Salaries> salaries;
    @XmlElement(name = "TotIncUnderHeadSalaries", defaultValue = "0")
    protected BigInteger totIncUnderHeadSalaries;

    /**
     * Gets the value of the salaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Salaries }
     * 
     * 
     */
    public List<Salaries> getSalaries() {
        if (salaries == null) {
            salaries = new ArrayList<Salaries>();
        }
        return this.salaries;
    }

    /**
     * Gets the value of the totIncUnderHeadSalaries property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotIncUnderHeadSalaries() {
        return totIncUnderHeadSalaries;
    }

    /**
     * Sets the value of the totIncUnderHeadSalaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotIncUnderHeadSalaries(BigInteger value) {
        this.totIncUnderHeadSalaries = value;
    }

}
