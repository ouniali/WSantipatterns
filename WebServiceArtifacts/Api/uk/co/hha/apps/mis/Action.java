
package uk.co.hha.apps.mis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Action complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Action">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Type" type="{http://apps.hha.co.uk/mis}ActionType"/>
 *         &lt;element name="Status" type="{http://apps.hha.co.uk/mis}StateType"/>
 *         &lt;element name="From" type="{http://apps.hha.co.uk/mis}AreaLine" minOccurs="0"/>
 *         &lt;element name="To" type="{http://apps.hha.co.uk/mis}AreaLine" minOccurs="0"/>
 *         &lt;element name="Heading" type="{http://apps.hha.co.uk/mis}HeadingType"/>
 *         &lt;element name="Draught" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ChangedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Times" type="{http://apps.hha.co.uk/mis}ArrayOfTime" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://apps.hha.co.uk/mis}ArrayOfEvent" minOccurs="0"/>
 *         &lt;element name="IsConfirmed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TugCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TugCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TugCompanyAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Action", propOrder = {
    "id",
    "sequence",
    "type",
    "status",
    "from",
    "to",
    "heading",
    "draught",
    "changedOn",
    "times",
    "events",
    "isConfirmed",
    "note",
    "tugCount",
    "tugCompany",
    "tugCompanyAbbreviation"
})
public class Action {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Sequence")
    protected int sequence;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected ActionType type;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected StateType status;
    @XmlElement(name = "From")
    protected AreaLine from;
    @XmlElement(name = "To")
    protected AreaLine to;
    @XmlElement(name = "Heading", required = true)
    @XmlSchemaType(name = "string")
    protected HeadingType heading;
    @XmlElement(name = "Draught")
    protected double draught;
    @XmlElement(name = "ChangedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedOn;
    @XmlElement(name = "Times")
    protected ArrayOfTime times;
    @XmlElement(name = "Events")
    protected ArrayOfEvent events;
    @XmlElement(name = "IsConfirmed")
    protected boolean isConfirmed;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "TugCount")
    protected int tugCount;
    @XmlElement(name = "TugCompany")
    protected String tugCompany;
    @XmlElement(name = "TugCompanyAbbreviation")
    protected String tugCompanyAbbreviation;

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
     * Gets the value of the sequence property.
     * 
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(int value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setType(ActionType value) {
        this.type = value;
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
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLine }
     *     
     */
    public AreaLine getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLine }
     *     
     */
    public void setFrom(AreaLine value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLine }
     *     
     */
    public AreaLine getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLine }
     *     
     */
    public void setTo(AreaLine value) {
        this.to = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link HeadingType }
     *     
     */
    public HeadingType getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadingType }
     *     
     */
    public void setHeading(HeadingType value) {
        this.heading = value;
    }

    /**
     * Gets the value of the draught property.
     * 
     */
    public double getDraught() {
        return draught;
    }

    /**
     * Sets the value of the draught property.
     * 
     */
    public void setDraught(double value) {
        this.draught = value;
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
     * Gets the value of the times property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTime }
     *     
     */
    public ArrayOfTime getTimes() {
        return times;
    }

    /**
     * Sets the value of the times property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTime }
     *     
     */
    public void setTimes(ArrayOfTime value) {
        this.times = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEvent }
     *     
     */
    public ArrayOfEvent getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEvent }
     *     
     */
    public void setEvents(ArrayOfEvent value) {
        this.events = value;
    }

    /**
     * Gets the value of the isConfirmed property.
     * 
     */
    public boolean isIsConfirmed() {
        return isConfirmed;
    }

    /**
     * Sets the value of the isConfirmed property.
     * 
     */
    public void setIsConfirmed(boolean value) {
        this.isConfirmed = value;
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
     * Gets the value of the tugCount property.
     * 
     */
    public int getTugCount() {
        return tugCount;
    }

    /**
     * Sets the value of the tugCount property.
     * 
     */
    public void setTugCount(int value) {
        this.tugCount = value;
    }

    /**
     * Gets the value of the tugCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTugCompany() {
        return tugCompany;
    }

    /**
     * Sets the value of the tugCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTugCompany(String value) {
        this.tugCompany = value;
    }

    /**
     * Gets the value of the tugCompanyAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTugCompanyAbbreviation() {
        return tugCompanyAbbreviation;
    }

    /**
     * Sets the value of the tugCompanyAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTugCompanyAbbreviation(String value) {
        this.tugCompanyAbbreviation = value;
    }

}
