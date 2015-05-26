
package nl.lumc.conceptprofilemining.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listPredefinedConceptSetsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listPredefinedConceptSetsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://services.conceptprofilemining.lumc.nl/}predefinedConceptSetsWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listPredefinedConceptSetsResponse", propOrder = {
    "_return"
})
public class ListPredefinedConceptSetsResponse {

    @XmlElement(name = "return")
    protected PredefinedConceptSetsWrapper _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedConceptSetsWrapper }
     *     
     */
    public PredefinedConceptSetsWrapper getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedConceptSetsWrapper }
     *     
     */
    public void setReturn(PredefinedConceptSetsWrapper value) {
        this._return = value;
    }

}
