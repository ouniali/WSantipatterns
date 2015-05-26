
package com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.inforcyl.services.xsd.OutputMethods;


/**
 * <p>Java class for InsuranceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.inforcyl.com/xsd}OutputMethods">
 *       &lt;sequence>
 *         &lt;element name="insuranceAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="insuranceCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceFactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceData", propOrder = {
    "insuranceAmount",
    "insuranceCompany",
    "insuranceFactor",
    "terms"
})
public class InsuranceData
    extends OutputMethods
{

    @XmlElementRef(name = "insuranceAmount", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> insuranceAmount;
    @XmlElementRef(name = "insuranceCompany", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceCompany;
    @XmlElementRef(name = "insuranceFactor", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceFactor;
    @XmlElementRef(name = "terms", namespace = "http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> terms;

    /**
     * Gets the value of the insuranceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     * Sets the value of the insuranceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setInsuranceAmount(JAXBElement<Double> value) {
        this.insuranceAmount = value;
    }

    /**
     * Gets the value of the insuranceCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceCompany() {
        return insuranceCompany;
    }

    /**
     * Sets the value of the insuranceCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceCompany(JAXBElement<String> value) {
        this.insuranceCompany = value;
    }

    /**
     * Gets the value of the insuranceFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceFactor() {
        return insuranceFactor;
    }

    /**
     * Sets the value of the insuranceFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceFactor(JAXBElement<String> value) {
        this.insuranceFactor = value;
    }

    /**
     * Gets the value of the terms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTerms() {
        return terms;
    }

    /**
     * Sets the value of the terms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTerms(JAXBElement<String> value) {
        this.terms = value;
    }

}
