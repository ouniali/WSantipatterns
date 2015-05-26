
package com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.returnchangeoutboundticketsdata.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.inforcyl.services.xsd.InputMethods;


/**
 * <p>Java class for ChangeOutboundTicketsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeOutboundTicketsData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.inforcyl.com/xsd}InputMethods">
 *       &lt;sequence>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serieAdmon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeOutboundTicketsData", propOrder = {
    "company",
    "product",
    "serieAdmon",
    "ticket"
})
public class ChangeOutboundTicketsData
    extends InputMethods
{

    @XmlElementRef(name = "company", namespace = "http://returnchangeoutboundticketsdata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> company;
    @XmlElementRef(name = "product", namespace = "http://returnchangeoutboundticketsdata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product;
    @XmlElementRef(name = "serieAdmon", namespace = "http://returnchangeoutboundticketsdata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serieAdmon;
    @XmlElementRef(name = "ticket", namespace = "http://returnchangeoutboundticketsdata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ticket;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompany(JAXBElement<String> value) {
        this.company = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct(JAXBElement<String> value) {
        this.product = value;
    }

    /**
     * Gets the value of the serieAdmon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerieAdmon() {
        return serieAdmon;
    }

    /**
     * Sets the value of the serieAdmon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerieAdmon(JAXBElement<String> value) {
        this.serieAdmon = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTicket(JAXBElement<String> value) {
        this.ticket = value;
    }

}
