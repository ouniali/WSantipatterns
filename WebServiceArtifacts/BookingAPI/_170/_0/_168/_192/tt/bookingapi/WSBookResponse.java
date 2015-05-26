
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSBookResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSBookResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://192.168.0.170/TT/BookingAPI}WSStatus" minOccurs="0"/>
 *         &lt;element name="SSRDenied" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SSRMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdType" type="{http://192.168.0.170/TT/BookingAPI}ProductType"/>
 *         &lt;element name="ConfirmationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSBookResponse", propOrder = {
    "pnr",
    "bookingId",
    "status",
    "ssrDenied",
    "ssrMessage",
    "prodType",
    "confirmationNo"
})
public class WSBookResponse {

    @XmlElement(name = "PNR")
    protected String pnr;
    @XmlElement(name = "BookingId")
    protected String bookingId;
    @XmlElement(name = "Status")
    protected WSStatus status;
    @XmlElement(name = "SSRDenied")
    protected boolean ssrDenied;
    @XmlElement(name = "SSRMessage")
    protected String ssrMessage;
    @XmlElement(name = "ProdType", required = true)
    @XmlSchemaType(name = "string")
    protected ProductType prodType;
    @XmlElement(name = "ConfirmationNo")
    protected String confirmationNo;

    /**
     * Gets the value of the pnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNR() {
        return pnr;
    }

    /**
     * Sets the value of the pnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNR(String value) {
        this.pnr = value;
    }

    /**
     * Gets the value of the bookingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingId() {
        return bookingId;
    }

    /**
     * Sets the value of the bookingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingId(String value) {
        this.bookingId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WSStatus }
     *     
     */
    public WSStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSStatus }
     *     
     */
    public void setStatus(WSStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the ssrDenied property.
     * 
     */
    public boolean isSSRDenied() {
        return ssrDenied;
    }

    /**
     * Sets the value of the ssrDenied property.
     * 
     */
    public void setSSRDenied(boolean value) {
        this.ssrDenied = value;
    }

    /**
     * Gets the value of the ssrMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRMessage() {
        return ssrMessage;
    }

    /**
     * Sets the value of the ssrMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRMessage(String value) {
        this.ssrMessage = value;
    }

    /**
     * Gets the value of the prodType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProdType() {
        return prodType;
    }

    /**
     * Sets the value of the prodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProdType(ProductType value) {
        this.prodType = value;
    }

    /**
     * Gets the value of the confirmationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNo() {
        return confirmationNo;
    }

    /**
     * Sets the value of the confirmationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNo(String value) {
        this.confirmationNo = value;
    }

}
