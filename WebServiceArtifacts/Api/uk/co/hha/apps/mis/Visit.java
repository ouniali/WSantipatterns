
package uk.co.hha.apps.mis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Visit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Visit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExternalReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RunningAction" type="{http://apps.hha.co.uk/mis}ActionType"/>
 *         &lt;element name="Status" type="{http://apps.hha.co.uk/mis}StateType"/>
 *         &lt;element name="VesselName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VesselLloydsNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VesselGrossTonnage" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VesselLength" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VesselCallSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VesselNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromPort" type="{http://apps.hha.co.uk/mis}AreaLine" minOccurs="0"/>
 *         &lt;element name="ToPort" type="{http://apps.hha.co.uk/mis}AreaLine" minOccurs="0"/>
 *         &lt;element name="DraughtCurrent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ChangedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Actions" type="{http://apps.hha.co.uk/mis}ArrayOfAction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Visit", propOrder = {
    "id",
    "externalReference",
    "runningAction",
    "status",
    "vesselName",
    "vesselLloydsNumber",
    "vesselGrossTonnage",
    "vesselLength",
    "vesselCallSign",
    "vesselNote",
    "fromPort",
    "toPort",
    "draughtCurrent",
    "changedOn",
    "note",
    "actions"
})
public class Visit {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "ExternalReference")
    protected String externalReference;
    @XmlElement(name = "RunningAction", required = true)
    @XmlSchemaType(name = "string")
    protected ActionType runningAction;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected StateType status;
    @XmlElement(name = "VesselName")
    protected String vesselName;
    @XmlElement(name = "VesselLloydsNumber")
    protected int vesselLloydsNumber;
    @XmlElement(name = "VesselGrossTonnage")
    protected double vesselGrossTonnage;
    @XmlElement(name = "VesselLength")
    protected double vesselLength;
    @XmlElement(name = "VesselCallSign")
    protected String vesselCallSign;
    @XmlElement(name = "VesselNote")
    protected String vesselNote;
    @XmlElement(name = "FromPort")
    protected AreaLine fromPort;
    @XmlElement(name = "ToPort")
    protected AreaLine toPort;
    @XmlElement(name = "DraughtCurrent")
    protected double draughtCurrent;
    @XmlElement(name = "ChangedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedOn;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "Actions")
    protected ArrayOfAction actions;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Gets the value of the runningAction property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getRunningAction() {
        return runningAction;
    }

    /**
     * Sets the value of the runningAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setRunningAction(ActionType value) {
        this.runningAction = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setStatus(StateType value) {
        this.status = value;
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
     * Gets the value of the vesselLloydsNumber property.
     * 
     */
    public int getVesselLloydsNumber() {
        return vesselLloydsNumber;
    }

    /**
     * Sets the value of the vesselLloydsNumber property.
     * 
     */
    public void setVesselLloydsNumber(int value) {
        this.vesselLloydsNumber = value;
    }

    /**
     * Gets the value of the vesselGrossTonnage property.
     * 
     */
    public double getVesselGrossTonnage() {
        return vesselGrossTonnage;
    }

    /**
     * Sets the value of the vesselGrossTonnage property.
     * 
     */
    public void setVesselGrossTonnage(double value) {
        this.vesselGrossTonnage = value;
    }

    /**
     * Gets the value of the vesselLength property.
     * 
     */
    public double getVesselLength() {
        return vesselLength;
    }

    /**
     * Sets the value of the vesselLength property.
     * 
     */
    public void setVesselLength(double value) {
        this.vesselLength = value;
    }

    /**
     * Gets the value of the vesselCallSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselCallSign() {
        return vesselCallSign;
    }

    /**
     * Sets the value of the vesselCallSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselCallSign(String value) {
        this.vesselCallSign = value;
    }

    /**
     * Gets the value of the vesselNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselNote() {
        return vesselNote;
    }

    /**
     * Sets the value of the vesselNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselNote(String value) {
        this.vesselNote = value;
    }

    /**
     * Gets the value of the fromPort property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLine }
     *     
     */
    public AreaLine getFromPort() {
        return fromPort;
    }

    /**
     * Sets the value of the fromPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLine }
     *     
     */
    public void setFromPort(AreaLine value) {
        this.fromPort = value;
    }

    /**
     * Gets the value of the toPort property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLine }
     *     
     */
    public AreaLine getToPort() {
        return toPort;
    }

    /**
     * Sets the value of the toPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLine }
     *     
     */
    public void setToPort(AreaLine value) {
        this.toPort = value;
    }

    /**
     * Gets the value of the draughtCurrent property.
     * 
     */
    public double getDraughtCurrent() {
        return draughtCurrent;
    }

    /**
     * Sets the value of the draughtCurrent property.
     * 
     */
    public void setDraughtCurrent(double value) {
        this.draughtCurrent = value;
    }

    /**
     * Gets the value of the changedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangedOn() {
        return changedOn;
    }

    /**
     * Sets the value of the changedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangedOn(XMLGregorianCalendar value) {
        this.changedOn = value;
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
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAction }
     *     
     */
    public ArrayOfAction getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAction }
     *     
     */
    public void setActions(ArrayOfAction value) {
        this.actions = value;
    }

}
