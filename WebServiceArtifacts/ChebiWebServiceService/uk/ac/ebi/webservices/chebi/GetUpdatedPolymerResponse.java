
package uk.ac.ebi.webservices.chebi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUpdatedPolymerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUpdatedPolymerResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.ebi.ac.uk/webservices/chebi}UpdatedPolymer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUpdatedPolymerResponse", propOrder = {
    "_return"
})
public class GetUpdatedPolymerResponse {

    @XmlElement(name = "return", required = true)
    protected UpdatedPolymer _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedPolymer }
     *     
     */
    public UpdatedPolymer getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedPolymer }
     *     
     */
    public void setReturn(UpdatedPolymer value) {
        this._return = value;
    }

}
