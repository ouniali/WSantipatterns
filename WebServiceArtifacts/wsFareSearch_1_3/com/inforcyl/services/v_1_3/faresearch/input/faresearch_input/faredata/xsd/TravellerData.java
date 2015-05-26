
package com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.faredata.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.faredata.travellerdata.xsd.Discounts;
import com.inforcyl.services.xsd.InputMethods;


/**
 * <p>Java class for TravellerData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.inforcyl.com/xsd}InputMethods">
 *       &lt;sequence>
 *         &lt;element name="promotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectedDiscounts" type="{http://travellerdata.faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd}Discounts" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerData", propOrder = {
    "promotionCode",
    "selectedDiscounts"
})
public class TravellerData
    extends InputMethods
{

    @XmlElementRef(name = "promotionCode", namespace = "http://faredata.faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotionCode;
    @XmlElement(nillable = true)
    protected List<Discounts> selectedDiscounts;

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromotionCode(JAXBElement<String> value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the selectedDiscounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedDiscounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedDiscounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Discounts }
     * 
     * 
     */
    public List<Discounts> getSelectedDiscounts() {
        if (selectedDiscounts == null) {
            selectedDiscounts = new ArrayList<Discounts>();
        }
        return this.selectedDiscounts;
    }

}
