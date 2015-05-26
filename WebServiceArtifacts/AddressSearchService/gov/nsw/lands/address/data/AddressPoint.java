
package gov.nsw.lands.address.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coordRefSys" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="centreX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="centreY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressPoint", propOrder = {
    "coordRefSys",
    "centreX",
    "centreY"
})
public class AddressPoint {

    @XmlElement(required = true, nillable = true)
    protected String coordRefSys;
    protected double centreX;
    protected double centreY;

    /**
     * Gets the value of the coordRefSys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordRefSys() {
        return coordRefSys;
    }

    /**
     * Sets the value of the coordRefSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordRefSys(String value) {
        this.coordRefSys = value;
    }

    /**
     * Gets the value of the centreX property.
     * 
     */
    public double getCentreX() {
        return centreX;
    }

    /**
     * Sets the value of the centreX property.
     * 
     */
    public void setCentreX(double value) {
        this.centreX = value;
    }

    /**
     * Gets the value of the centreY property.
     * 
     */
    public double getCentreY() {
        return centreY;
    }

    /**
     * Sets the value of the centreY property.
     * 
     */
    public void setCentreY(double value) {
        this.centreY = value;
    }

}
