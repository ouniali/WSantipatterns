
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *       &lt;attribute name="IsStaffedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TicketPrinterInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SST_MachineInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationType")
public class StationType
    extends LocationType
{

    @XmlAttribute(name = "IsStaffedInd")
    protected Boolean isStaffedInd;
    @XmlAttribute(name = "TicketPrinterInd")
    protected Boolean ticketPrinterInd;
    @XmlAttribute(name = "SST_MachineInd")
    protected Boolean sstMachineInd;
    @XmlAttribute(name = "TimeZoneOffset")
    protected String timeZoneOffset;

    /**
     * Gets the value of the isStaffedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStaffedInd() {
        return isStaffedInd;
    }

    /**
     * Sets the value of the isStaffedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStaffedInd(Boolean value) {
        this.isStaffedInd = value;
    }

    /**
     * Gets the value of the ticketPrinterInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketPrinterInd() {
        return ticketPrinterInd;
    }

    /**
     * Sets the value of the ticketPrinterInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketPrinterInd(Boolean value) {
        this.ticketPrinterInd = value;
    }

    /**
     * Gets the value of the sstMachineInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSSTMachineInd() {
        return sstMachineInd;
    }

    /**
     * Sets the value of the sstMachineInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSSTMachineInd(Boolean value) {
        this.sstMachineInd = value;
    }

    /**
     * Gets the value of the timeZoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneOffset() {
        return timeZoneOffset;
    }

    /**
     * Sets the value of the timeZoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneOffset(String value) {
        this.timeZoneOffset = value;
    }

}
