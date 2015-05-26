
package ws_2013.cangooroo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingDetailBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingDetailBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfBookingRooms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BaseID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNPJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponsibleOperator" type="{Cangooroo.WS_2013}UserDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingDetailBase", propOrder = {
    "bookingNumber",
    "controlNumber",
    "clientComment",
    "clientID",
    "clientName",
    "numberOfBookingRooms",
    "baseID",
    "baseName",
    "cnpj",
    "responsibleOperator"
})
@XmlSeeAlso({
    BookingDetail.class
})
public abstract class BookingDetailBase {

    @XmlElement(name = "BookingNumber")
    protected int bookingNumber;
    @XmlElement(name = "ControlNumber")
    protected String controlNumber;
    @XmlElement(name = "ClientComment")
    protected String clientComment;
    @XmlElement(name = "ClientID")
    protected int clientID;
    @XmlElement(name = "ClientName")
    protected String clientName;
    @XmlElement(name = "NumberOfBookingRooms")
    protected int numberOfBookingRooms;
    @XmlElement(name = "BaseID")
    protected int baseID;
    @XmlElement(name = "BaseName")
    protected String baseName;
    @XmlElement(name = "CNPJ")
    protected String cnpj;
    @XmlElement(name = "ResponsibleOperator")
    protected UserDetail responsibleOperator;

    /**
     * Gets the value of the bookingNumber property.
     * 
     */
    public int getBookingNumber() {
        return bookingNumber;
    }

    /**
     * Sets the value of the bookingNumber property.
     * 
     */
    public void setBookingNumber(int value) {
        this.bookingNumber = value;
    }

    /**
     * Gets the value of the controlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /**
     * Sets the value of the controlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlNumber(String value) {
        this.controlNumber = value;
    }

    /**
     * Gets the value of the clientComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientComment() {
        return clientComment;
    }

    /**
     * Sets the value of the clientComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientComment(String value) {
        this.clientComment = value;
    }

    /**
     * Gets the value of the clientID property.
     * 
     */
    public int getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     */
    public void setClientID(int value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the numberOfBookingRooms property.
     * 
     */
    public int getNumberOfBookingRooms() {
        return numberOfBookingRooms;
    }

    /**
     * Sets the value of the numberOfBookingRooms property.
     * 
     */
    public void setNumberOfBookingRooms(int value) {
        this.numberOfBookingRooms = value;
    }

    /**
     * Gets the value of the baseID property.
     * 
     */
    public int getBaseID() {
        return baseID;
    }

    /**
     * Sets the value of the baseID property.
     * 
     */
    public void setBaseID(int value) {
        this.baseID = value;
    }

    /**
     * Gets the value of the baseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseName() {
        return baseName;
    }

    /**
     * Sets the value of the baseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseName(String value) {
        this.baseName = value;
    }

    /**
     * Gets the value of the cnpj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNPJ() {
        return cnpj;
    }

    /**
     * Sets the value of the cnpj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNPJ(String value) {
        this.cnpj = value;
    }

    /**
     * Gets the value of the responsibleOperator property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetail }
     *     
     */
    public UserDetail getResponsibleOperator() {
        return responsibleOperator;
    }

    /**
     * Sets the value of the responsibleOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetail }
     *     
     */
    public void setResponsibleOperator(UserDetail value) {
        this.responsibleOperator = value;
    }

}
