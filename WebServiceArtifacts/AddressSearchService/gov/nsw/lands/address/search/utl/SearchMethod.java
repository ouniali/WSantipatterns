
package gov.nsw.lands.address.search.utl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.nsw.lands.address.ws.ArrayOfXsdNillableString;


/**
 * <p>Java class for SearchMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="methodDescriptions" type="{http://ws.address.lands.nsw.gov}ArrayOf_xsd_nillable_string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchMethod", propOrder = {
    "methodDescriptions"
})
public class SearchMethod {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableString methodDescriptions;

    /**
     * Gets the value of the methodDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public ArrayOfXsdNillableString getMethodDescriptions() {
        return methodDescriptions;
    }

    /**
     * Sets the value of the methodDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public void setMethodDescriptions(ArrayOfXsdNillableString value) {
        this.methodDescriptions = value;
    }

}
