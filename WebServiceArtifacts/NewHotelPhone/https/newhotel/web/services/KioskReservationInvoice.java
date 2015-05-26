
package https.newhotel.web.services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KioskReservationInvoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskReservationInvoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InvoiceId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="InvoiceSerial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lines" type="{https://NewHotel/Web/Services/}ArrayOfKioskReservationInvoiceLine" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{https://NewHotel/Web/Services/}ArrayOfKioskReservationInvoiceTaxLine" minOccurs="0"/>
 *         &lt;element name="TotalGross" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalNet" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CityTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskReservationInvoice", propOrder = {
    "creationDate",
    "invoiceId",
    "invoiceSerial",
    "lines",
    "taxes",
    "totalGross",
    "totalNet",
    "cityTax"
})
public class KioskReservationInvoice {

    @XmlElement(name = "CreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "InvoiceId", required = true)
    protected String invoiceId;
    @XmlElement(name = "InvoiceSerial")
    protected String invoiceSerial;
    @XmlElement(name = "Lines")
    protected ArrayOfKioskReservationInvoiceLine lines;
    @XmlElement(name = "Taxes")
    protected ArrayOfKioskReservationInvoiceTaxLine taxes;
    @XmlElement(name = "TotalGross", required = true)
    protected BigDecimal totalGross;
    @XmlElement(name = "TotalNet", required = true)
    protected BigDecimal totalNet;
    @XmlElement(name = "CityTax", required = true)
    protected BigDecimal cityTax;

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the invoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceId(String value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the invoiceSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceSerial() {
        return invoiceSerial;
    }

    /**
     * Sets the value of the invoiceSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceSerial(String value) {
        this.invoiceSerial = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskReservationInvoiceLine }
     *     
     */
    public ArrayOfKioskReservationInvoiceLine getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskReservationInvoiceLine }
     *     
     */
    public void setLines(ArrayOfKioskReservationInvoiceLine value) {
        this.lines = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskReservationInvoiceTaxLine }
     *     
     */
    public ArrayOfKioskReservationInvoiceTaxLine getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskReservationInvoiceTaxLine }
     *     
     */
    public void setTaxes(ArrayOfKioskReservationInvoiceTaxLine value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the totalGross property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGross() {
        return totalGross;
    }

    /**
     * Sets the value of the totalGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalGross(BigDecimal value) {
        this.totalGross = value;
    }

    /**
     * Gets the value of the totalNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalNet() {
        return totalNet;
    }

    /**
     * Sets the value of the totalNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalNet(BigDecimal value) {
        this.totalNet = value;
    }

    /**
     * Gets the value of the cityTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCityTax() {
        return cityTax;
    }

    /**
     * Sets the value of the cityTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCityTax(BigDecimal value) {
        this.cityTax = value;
    }

}
