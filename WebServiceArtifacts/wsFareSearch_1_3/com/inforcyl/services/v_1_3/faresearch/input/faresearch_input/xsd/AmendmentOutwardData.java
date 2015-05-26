
package com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.inforcyl.services.xsd.InputMethods;


/**
 * <p>Java class for AmendmentOutwardData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendmentOutwardData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.inforcyl.com/xsd}InputMethods">
 *       &lt;sequence>
 *         &lt;element name="ourwardOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outwardBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outwardDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outwardService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outwardTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendmentOutwardData", propOrder = {
    "ourwardOrigin",
    "outwardBrand",
    "outwardDate",
    "outwardDestination",
    "outwardService",
    "outwardTime"
})
public class AmendmentOutwardData
    extends InputMethods
{

    @XmlElementRef(name = "ourwardOrigin", namespace = "http://faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ourwardOrigin;
    @XmlElementRef(name = "outwardBrand", namespace = "http://faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outwardBrand;
    @XmlElementRef(name = "outwardDate", namespace = "http://faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outwardDate;
    @XmlElementRef(name = "outwardDestination", namespace = "http://faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outwardDestination;
    @XmlElementRef(name = "outwardService", namespace = "http://faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outwardService;
    @XmlElementRef(name = "outwardTime", namespace = "http://faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outwardTime;

    /**
     * Gets the value of the ourwardOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOurwardOrigin() {
        return ourwardOrigin;
    }

    /**
     * Sets the value of the ourwardOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOurwardOrigin(JAXBElement<String> value) {
        this.ourwardOrigin = value;
    }

    /**
     * Gets the value of the outwardBrand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutwardBrand() {
        return outwardBrand;
    }

    /**
     * Sets the value of the outwardBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutwardBrand(JAXBElement<String> value) {
        this.outwardBrand = value;
    }

    /**
     * Gets the value of the outwardDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutwardDate() {
        return outwardDate;
    }

    /**
     * Sets the value of the outwardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutwardDate(JAXBElement<String> value) {
        this.outwardDate = value;
    }

    /**
     * Gets the value of the outwardDestination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutwardDestination() {
        return outwardDestination;
    }

    /**
     * Sets the value of the outwardDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutwardDestination(JAXBElement<String> value) {
        this.outwardDestination = value;
    }

    /**
     * Gets the value of the outwardService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutwardService() {
        return outwardService;
    }

    /**
     * Sets the value of the outwardService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutwardService(JAXBElement<String> value) {
        this.outwardService = value;
    }

    /**
     * Gets the value of the outwardTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutwardTime() {
        return outwardTime;
    }

    /**
     * Sets the value of the outwardTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutwardTime(JAXBElement<String> value) {
        this.outwardTime = value;
    }

}
