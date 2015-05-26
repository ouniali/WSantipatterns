
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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}SummaryFromDeprSchCG"/>
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
    "summaryFromDeprSchCG"
})
@XmlRootElement(name = "ScheduleDCG")
public class ScheduleDCG {

    @XmlElement(name = "SummaryFromDeprSchCG", required = true)
    protected SummaryFromDeprSchCG summaryFromDeprSchCG;

    /**
     * Gets the value of the summaryFromDeprSchCG property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryFromDeprSchCG }
     *     
     */
    public SummaryFromDeprSchCG getSummaryFromDeprSchCG() {
        return summaryFromDeprSchCG;
    }

    /**
     * Sets the value of the summaryFromDeprSchCG property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryFromDeprSchCG }
     *     
     */
    public void setSummaryFromDeprSchCG(SummaryFromDeprSchCG value) {
        this.summaryFromDeprSchCG = value;
    }

}
