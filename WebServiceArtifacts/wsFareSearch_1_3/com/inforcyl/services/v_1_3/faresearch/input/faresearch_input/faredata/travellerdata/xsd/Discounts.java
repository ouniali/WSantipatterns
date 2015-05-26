
package com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.faredata.travellerdata.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.inforcyl.services.xsd.InputMethods;


/**
 * <p>Java class for Discounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Discounts">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.inforcyl.com/xsd}InputMethods">
 *       &lt;sequence>
 *         &lt;element name="acumulativeWithOtherOffers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="border" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="discountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromOrToBorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Discounts", propOrder = {
    "acumulativeWithOtherOffers",
    "border",
    "discountPercentage",
    "discountType",
    "fromOrToBorder",
    "leg"
})
public class Discounts
    extends InputMethods
{

    @XmlElementRef(name = "acumulativeWithOtherOffers", namespace = "http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acumulativeWithOtherOffers;
    @XmlElementRef(name = "border", namespace = "http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> border;
    @XmlElementRef(name = "discountPercentage", namespace = "http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> discountPercentage;
    @XmlElementRef(name = "discountType", namespace = "http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> discountType;
    @XmlElementRef(name = "fromOrToBorder", namespace = "http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fromOrToBorder;
    @XmlElementRef(name = "leg", namespace = "http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leg;

    /**
     * Gets the value of the acumulativeWithOtherOffers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcumulativeWithOtherOffers() {
        return acumulativeWithOtherOffers;
    }

    /**
     * Sets the value of the acumulativeWithOtherOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcumulativeWithOtherOffers(JAXBElement<String> value) {
        this.acumulativeWithOtherOffers = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBorder(JAXBElement<String> value) {
        this.border = value;
    }

    /**
     * Gets the value of the discountPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * Sets the value of the discountPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDiscountPercentage(JAXBElement<Double> value) {
        this.discountPercentage = value;
    }

    /**
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDiscountType(JAXBElement<String> value) {
        this.discountType = value;
    }

    /**
     * Gets the value of the fromOrToBorder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFromOrToBorder() {
        return fromOrToBorder;
    }

    /**
     * Sets the value of the fromOrToBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFromOrToBorder(JAXBElement<String> value) {
        this.fromOrToBorder = value;
    }

    /**
     * Gets the value of the leg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLeg() {
        return leg;
    }

    /**
     * Sets the value of the leg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLeg(JAXBElement<String> value) {
        this.leg = value;
    }

}
