
package com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.types.xsd.FareData;
import com.inforcyl.services.xsd.OutputMethods;


/**
 * <p>Java class for Types complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Types">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.inforcyl.com/xsd}OutputMethods">
 *       &lt;sequence>
 *         &lt;element name="departureFare" type="{http://types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd}FareData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fareName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fareTotalPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Types", propOrder = {
    "departureFare",
    "fareName",
    "fareTotalPrice",
    "fareType"
})
public class Types
    extends OutputMethods
{

    @XmlElement(nillable = true)
    protected List<FareData> departureFare;
    @XmlElementRef(name = "fareName", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareName;
    @XmlElementRef(name = "fareTotalPrice", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> fareTotalPrice;
    @XmlElementRef(name = "fareType", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareType;

    /**
     * Gets the value of the departureFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departureFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareData }
     * 
     * 
     */
    public List<FareData> getDepartureFare() {
        if (departureFare == null) {
            departureFare = new ArrayList<FareData>();
        }
        return this.departureFare;
    }

    /**
     * Gets the value of the fareName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareName() {
        return fareName;
    }

    /**
     * Sets the value of the fareName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareName(JAXBElement<String> value) {
        this.fareName = value;
    }

    /**
     * Gets the value of the fareTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getFareTotalPrice() {
        return fareTotalPrice;
    }

    /**
     * Sets the value of the fareTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setFareTotalPrice(JAXBElement<Double> value) {
        this.fareTotalPrice = value;
    }

    /**
     * Gets the value of the fareType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareType() {
        return fareType;
    }

    /**
     * Sets the value of the fareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareType(JAXBElement<String> value) {
        this.fareType = value;
    }

}
