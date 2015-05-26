
package linjegodswebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Documents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Documents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PODs" type="{LinjegodsWebServices}ArrayOfPOD" minOccurs="0"/>
 *         &lt;element name="ColliObservations" type="{LinjegodsWebServices}ArrayOfColliObservation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Documents", propOrder = {
    "poDs",
    "colliObservations"
})
public class Documents {

    @XmlElement(name = "PODs")
    protected ArrayOfPOD poDs;
    @XmlElement(name = "ColliObservations")
    protected ArrayOfColliObservation colliObservations;

    /**
     * Gets the value of the poDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPOD }
     *     
     */
    public ArrayOfPOD getPODs() {
        return poDs;
    }

    /**
     * Sets the value of the poDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPOD }
     *     
     */
    public void setPODs(ArrayOfPOD value) {
        this.poDs = value;
    }

    /**
     * Gets the value of the colliObservations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfColliObservation }
     *     
     */
    public ArrayOfColliObservation getColliObservations() {
        return colliObservations;
    }

    /**
     * Sets the value of the colliObservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfColliObservation }
     *     
     */
    public void setColliObservations(ArrayOfColliObservation value) {
        this.colliObservations = value;
    }

}
