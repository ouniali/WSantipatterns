
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}ScheduleUD" maxOccurs="unbounded"/>
 *         &lt;element name="TotalBalCFNY">
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
    "scheduleUD",
    "totalBalCFNY"
})
@XmlRootElement(name = "ITR4ScheduleUD")
public class ITR4ScheduleUD {

    @XmlElement(name = "ScheduleUD", required = true)
    protected List<ScheduleUD> scheduleUD;
    @XmlElement(name = "TotalBalCFNY", required = true, defaultValue = "0")
    protected BigInteger totalBalCFNY;

    /**
     * Assessee name with Sur Name or Org Name mandatory.Gets the value of the scheduleUD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleUD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleUD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleUD }
     * 
     * 
     */
    public List<ScheduleUD> getScheduleUD() {
        if (scheduleUD == null) {
            scheduleUD = new ArrayList<ScheduleUD>();
        }
        return this.scheduleUD;
    }

    /**
     * Gets the value of the totalBalCFNY property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalBalCFNY() {
        return totalBalCFNY;
    }

    /**
     * Sets the value of the totalBalCFNY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalBalCFNY(BigInteger value) {
        this.totalBalCFNY = value;
    }

}
