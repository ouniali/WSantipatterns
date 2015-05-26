
package com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.inforcyl.services.xsd.OutputMethods;


/**
 * <p>Java class for BookingCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingCharge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.inforcyl.com/xsd}OutputMethods">
 *       &lt;sequence>
 *         &lt;element name="bookingAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bookingFactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookingProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookingSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingCharge", propOrder = {
    "bookingAmount",
    "bookingFactor",
    "bookingProduct",
    "bookingSum",
    "bookingType"
})
public class BookingCharge
    extends OutputMethods
{

    @XmlElementRef(name = "bookingAmount", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> bookingAmount;
    @XmlElementRef(name = "bookingFactor", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingFactor;
    @XmlElementRef(name = "bookingProduct", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingProduct;
    @XmlElementRef(name = "bookingSum", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingSum;
    @XmlElementRef(name = "bookingType", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingType;

    /**
     * Gets the value of the bookingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBookingAmount() {
        return bookingAmount;
    }

    /**
     * Sets the value of the bookingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBookingAmount(JAXBElement<Double> value) {
        this.bookingAmount = value;
    }

    /**
     * Gets the value of the bookingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingFactor() {
        return bookingFactor;
    }

    /**
     * Sets the value of the bookingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingFactor(JAXBElement<String> value) {
        this.bookingFactor = value;
    }

    /**
     * Gets the value of the bookingProduct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingProduct() {
        return bookingProduct;
    }

    /**
     * Sets the value of the bookingProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingProduct(JAXBElement<String> value) {
        this.bookingProduct = value;
    }

    /**
     * Gets the value of the bookingSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingSum() {
        return bookingSum;
    }

    /**
     * Sets the value of the bookingSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingSum(JAXBElement<String> value) {
        this.bookingSum = value;
    }

    /**
     * Gets the value of the bookingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingType() {
        return bookingType;
    }

    /**
     * Sets the value of the bookingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingType(JAXBElement<String> value) {
        this.bookingType = value;
    }

}
