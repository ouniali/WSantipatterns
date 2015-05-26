
package de.dkfz_heidelberg.menu.tomcat.as.alignment_dot_plots;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tstatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tstatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inProgress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="detailed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="erroneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="completed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="asString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="successful" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tstatus", propOrder = {
    "inProgress",
    "detailed",
    "erroneous",
    "description",
    "completed",
    "asString",
    "successful"
})
public class Tstatus {

    protected boolean inProgress;
    @XmlElement(required = true)
    protected String detailed;
    protected boolean erroneous;
    @XmlElement(required = true)
    protected String description;
    protected boolean completed;
    @XmlElement(required = true)
    protected String asString;
    protected boolean successful;

    /**
     * Gets the value of the inProgress property.
     * 
     */
    public boolean isInProgress() {
        return inProgress;
    }

    /**
     * Sets the value of the inProgress property.
     * 
     */
    public void setInProgress(boolean value) {
        this.inProgress = value;
    }

    /**
     * Gets the value of the detailed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailed() {
        return detailed;
    }

    /**
     * Sets the value of the detailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailed(String value) {
        this.detailed = value;
    }

    /**
     * Gets the value of the erroneous property.
     * 
     */
    public boolean isErroneous() {
        return erroneous;
    }

    /**
     * Sets the value of the erroneous property.
     * 
     */
    public void setErroneous(boolean value) {
        this.erroneous = value;
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

    /**
     * Gets the value of the completed property.
     * 
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Sets the value of the completed property.
     * 
     */
    public void setCompleted(boolean value) {
        this.completed = value;
    }

    /**
     * Gets the value of the asString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsString() {
        return asString;
    }

    /**
     * Sets the value of the asString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsString(String value) {
        this.asString = value;
    }

    /**
     * Gets the value of the successful property.
     * 
     */
    public boolean isSuccessful() {
        return successful;
    }

    /**
     * Sets the value of the successful property.
     * 
     */
    public void setSuccessful(boolean value) {
        this.successful = value;
    }

}
