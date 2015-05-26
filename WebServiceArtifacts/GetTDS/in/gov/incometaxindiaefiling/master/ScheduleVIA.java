
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}DeductUndChapVIA" minOccurs="0"/>
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
    "deductUndChapVIA"
})
@XmlRootElement(name = "ScheduleVIA")
public class ScheduleVIA {

    @XmlElement(name = "DeductUndChapVIA")
    protected DeductUndChapVIA deductUndChapVIA;

    /**
     * Gets the value of the deductUndChapVIA property.
     * 
     * @return
     *     possible object is
     *     {@link DeductUndChapVIA }
     *     
     */
    public DeductUndChapVIA getDeductUndChapVIA() {
        return deductUndChapVIA;
    }

    /**
     * Sets the value of the deductUndChapVIA property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductUndChapVIA }
     *     
     */
    public void setDeductUndChapVIA(DeductUndChapVIA value) {
        this.deductUndChapVIA = value;
    }

}
