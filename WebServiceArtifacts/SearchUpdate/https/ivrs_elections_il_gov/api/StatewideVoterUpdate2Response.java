
package https.ivrs_elections_il_gov.api;

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
 *         &lt;element name="StatewideVoterUpdate2Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "statewideVoterUpdate2Result"
})
@XmlRootElement(name = "StatewideVoterUpdate2Response")
public class StatewideVoterUpdate2Response {

    @XmlElement(name = "StatewideVoterUpdate2Result")
    protected String statewideVoterUpdate2Result;

    /**
     * Gets the value of the statewideVoterUpdate2Result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatewideVoterUpdate2Result() {
        return statewideVoterUpdate2Result;
    }

    /**
     * Sets the value of the statewideVoterUpdate2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatewideVoterUpdate2Result(String value) {
        this.statewideVoterUpdate2Result = value;
    }

}
