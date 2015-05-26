
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}SummaryFromDeprSch"/>
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
    "summaryFromDeprSch"
})
@XmlRootElement(name = "ScheduleDEP")
public class ScheduleDEP {

    @XmlElement(name = "SummaryFromDeprSch", required = true)
    protected SummaryFromDeprSch summaryFromDeprSch;

    /**
     * Gets the value of the summaryFromDeprSch property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryFromDeprSch }
     *     
     */
    public SummaryFromDeprSch getSummaryFromDeprSch() {
        return summaryFromDeprSch;
    }

    /**
     * Sets the value of the summaryFromDeprSch property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryFromDeprSch }
     *     
     */
    public void setSummaryFromDeprSch(SummaryFromDeprSch value) {
        this.summaryFromDeprSch = value;
    }

}
