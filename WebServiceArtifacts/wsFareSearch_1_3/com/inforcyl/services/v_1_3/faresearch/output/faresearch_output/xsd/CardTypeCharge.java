
package com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.inforcyl.services.xsd.OutputMethods;


/**
 * <p>Java class for CardTypeCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardTypeCharge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.inforcyl.com/xsd}OutputMethods">
 *       &lt;sequence>
 *         &lt;element name="cardAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cardFactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTypeCharge", propOrder = {
    "cardAmount",
    "cardFactor",
    "cardProduct",
    "cardSum",
    "cardType"
})
public class CardTypeCharge
    extends OutputMethods
{

    @XmlElementRef(name = "cardAmount", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cardAmount;
    @XmlElementRef(name = "cardFactor", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardFactor;
    @XmlElementRef(name = "cardProduct", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardProduct;
    @XmlElementRef(name = "cardSum", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardSum;
    @XmlElementRef(name = "cardType", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardType;

    /**
     * Gets the value of the cardAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCardAmount() {
        return cardAmount;
    }

    /**
     * Sets the value of the cardAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCardAmount(JAXBElement<Double> value) {
        this.cardAmount = value;
    }

    /**
     * Gets the value of the cardFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardFactor() {
        return cardFactor;
    }

    /**
     * Sets the value of the cardFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardFactor(JAXBElement<String> value) {
        this.cardFactor = value;
    }

    /**
     * Gets the value of the cardProduct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardProduct() {
        return cardProduct;
    }

    /**
     * Sets the value of the cardProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardProduct(JAXBElement<String> value) {
        this.cardProduct = value;
    }

    /**
     * Gets the value of the cardSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardSum() {
        return cardSum;
    }

    /**
     * Sets the value of the cardSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardSum(JAXBElement<String> value) {
        this.cardSum = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardType(JAXBElement<String> value) {
        this.cardType = value;
    }

}
