
package ca.ubc.cstudies.netpub.dotnet.webservices.financialfunctions;

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
 *         &lt;element name="EffectiveInterestResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "effectiveInterestResult"
})
@XmlRootElement(name = "EffectiveInterestResponse")
public class EffectiveInterestResponse {

    @XmlElement(name = "EffectiveInterestResult")
    protected double effectiveInterestResult;

    /**
     * Gets the value of the effectiveInterestResult property.
     * 
     */
    public double getEffectiveInterestResult() {
        return effectiveInterestResult;
    }

    /**
     * Sets the value of the effectiveInterestResult property.
     * 
     */
    public void setEffectiveInterestResult(double value) {
        this.effectiveInterestResult = value;
    }

}
