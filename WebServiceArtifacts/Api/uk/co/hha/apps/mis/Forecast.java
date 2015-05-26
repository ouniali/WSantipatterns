
package uk.co.hha.apps.mis;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Forecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Forecast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MisId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VesselLloydsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VesselName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VesselDraught" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ETA" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrivalPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonsOnBoard" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HazardousOnBoard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ignore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Cancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Log" type="{http://apps.hha.co.uk/mis}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Forecast", propOrder = {
    "uniqueIdentifier",
    "misId",
    "vesselLloydsNumber",
    "vesselName",
    "vesselDraught",
    "eta",
    "lastPort",
    "arrivalPort",
    "billingAgent",
    "personsOnBoard",
    "hazardousOnBoard",
    "note",
    "ignore",
    "force",
    "cancel",
    "log"
})
public class Forecast {

    @XmlElement(name = "UniqueIdentifier")
    protected String uniqueIdentifier;
    @XmlElement(name = "MisId")
    protected int misId;
    @XmlElement(name = "VesselLloydsNumber")
    protected String vesselLloydsNumber;
    @XmlElement(name = "VesselName")
    protected String vesselName;
    @XmlElement(name = "VesselDraught", required = true)
    protected BigDecimal vesselDraught;
    @XmlElement(name = "ETA", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eta;
    @XmlElement(name = "LastPort")
    protected String lastPort;
    @XmlElement(name = "ArrivalPort")
    protected String arrivalPort;
    @XmlElement(name = "BillingAgent")
    protected String billingAgent;
    @XmlElement(name = "PersonsOnBoard")
    protected int personsOnBoard;
    @XmlElement(name = "HazardousOnBoard")
    protected boolean hazardousOnBoard;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "Ignore")
    protected boolean ignore;
    @XmlElement(name = "Force")
    protected boolean force;
    @XmlElement(name = "Cancel")
    protected boolean cancel;
    @XmlElement(name = "Log")
    protected ArrayOfString log;

    /**
     * Gets the value of the uniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    /**
     * Sets the value of the uniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueIdentifier(String value) {
        this.uniqueIdentifier = value;
    }

    /**
     * Gets the value of the misId property.
     * 
     */
    public int getMisId() {
        return misId;
    }

    /**
     * Sets the value of the misId property.
     * 
     */
    public void setMisId(int value) {
        this.misId = value;
    }

    /**
     * Gets the value of the vesselLloydsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselLloydsNumber() {
        return vesselLloydsNumber;
    }

    /**
     * Sets the value of the vesselLloydsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselLloydsNumber(String value) {
        this.vesselLloydsNumber = value;
    }

    /**
     * Gets the value of the vesselName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselName() {
        return vesselName;
    }

    /**
     * Sets the value of the vesselName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselName(String value) {
        this.vesselName = value;
    }

    /**
     * Gets the value of the vesselDraught property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVesselDraught() {
        return vesselDraught;
    }

    /**
     * Sets the value of the vesselDraught property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVesselDraught(BigDecimal value) {
        this.vesselDraught = value;
    }

    /**
     * Gets the value of the eta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETA() {
        return eta;
    }

    /**
     * Sets the value of the eta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETA(XMLGregorianCalendar value) {
        this.eta = value;
    }

    /**
     * Gets the value of the lastPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPort() {
        return lastPort;
    }

    /**
     * Sets the value of the lastPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPort(String value) {
        this.lastPort = value;
    }

    /**
     * Gets the value of the arrivalPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalPort() {
        return arrivalPort;
    }

    /**
     * Sets the value of the arrivalPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalPort(String value) {
        this.arrivalPort = value;
    }

    /**
     * Gets the value of the billingAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAgent() {
        return billingAgent;
    }

    /**
     * Sets the value of the billingAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAgent(String value) {
        this.billingAgent = value;
    }

    /**
     * Gets the value of the personsOnBoard property.
     * 
     */
    public int getPersonsOnBoard() {
        return personsOnBoard;
    }

    /**
     * Sets the value of the personsOnBoard property.
     * 
     */
    public void setPersonsOnBoard(int value) {
        this.personsOnBoard = value;
    }

    /**
     * Gets the value of the hazardousOnBoard property.
     * 
     */
    public boolean isHazardousOnBoard() {
        return hazardousOnBoard;
    }

    /**
     * Sets the value of the hazardousOnBoard property.
     * 
     */
    public void setHazardousOnBoard(boolean value) {
        this.hazardousOnBoard = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the ignore property.
     * 
     */
    public boolean isIgnore() {
        return ignore;
    }

    /**
     * Sets the value of the ignore property.
     * 
     */
    public void setIgnore(boolean value) {
        this.ignore = value;
    }

    /**
     * Gets the value of the force property.
     * 
     */
    public boolean isForce() {
        return force;
    }

    /**
     * Sets the value of the force property.
     * 
     */
    public void setForce(boolean value) {
        this.force = value;
    }

    /**
     * Gets the value of the cancel property.
     * 
     */
    public boolean isCancel() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     * 
     */
    public void setCancel(boolean value) {
        this.cancel = value;
    }

    /**
     * Gets the value of the log property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getLog() {
        return log;
    }

    /**
     * Sets the value of the log property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setLog(ArrayOfString value) {
        this.log = value;
    }

}
