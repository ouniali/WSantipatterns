
package amendablepolicy.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmendablePolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendablePolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CanBeModified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CancellationType" type="{WS_2013.AmendablePolicy}eTypeCancellation"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendablePolicy", propOrder = {
    "canBeModified",
    "cancellationType",
    "description"
})
public class AmendablePolicy {

    @XmlElement(name = "CanBeModified")
    protected boolean canBeModified;
    @XmlElement(name = "CancellationType", required = true)
    @XmlSchemaType(name = "string")
    protected ETypeCancellation cancellationType;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the canBeModified property.
     * 
     */
    public boolean isCanBeModified() {
        return canBeModified;
    }

    /**
     * Sets the value of the canBeModified property.
     * 
     */
    public void setCanBeModified(boolean value) {
        this.canBeModified = value;
    }

    /**
     * Gets the value of the cancellationType property.
     * 
     * @return
     *     possible object is
     *     {@link ETypeCancellation }
     *     
     */
    public ETypeCancellation getCancellationType() {
        return cancellationType;
    }

    /**
     * Sets the value of the cancellationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETypeCancellation }
     *     
     */
    public void setCancellationType(ETypeCancellation value) {
        this.cancellationType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
