
package org.datacontract.schemas._2004._07.mouzenidis_services_objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealCourse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealCourse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}DictionaryBase">
 *       &lt;sequence>
 *         &lt;element name="CourseCB" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CourseInternal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CourseTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CurrencyCodeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCodeTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealCourse", propOrder = {
    "courseCB",
    "courseInternal",
    "courseTotal",
    "currencyCodeFrom",
    "currencyCodeTo"
})
public class RealCourse
    extends DictionaryBase
{

    @XmlElement(name = "CourseCB")
    protected Double courseCB;
    @XmlElement(name = "CourseInternal")
    protected Double courseInternal;
    @XmlElement(name = "CourseTotal")
    protected Double courseTotal;
    @XmlElementRef(name = "CurrencyCodeFrom", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCodeFrom;
    @XmlElementRef(name = "CurrencyCodeTo", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCodeTo;

    /**
     * Gets the value of the courseCB property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCourseCB() {
        return courseCB;
    }

    /**
     * Sets the value of the courseCB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCourseCB(Double value) {
        this.courseCB = value;
    }

    /**
     * Gets the value of the courseInternal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCourseInternal() {
        return courseInternal;
    }

    /**
     * Sets the value of the courseInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCourseInternal(Double value) {
        this.courseInternal = value;
    }

    /**
     * Gets the value of the courseTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCourseTotal() {
        return courseTotal;
    }

    /**
     * Sets the value of the courseTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCourseTotal(Double value) {
        this.courseTotal = value;
    }

    /**
     * Gets the value of the currencyCodeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCodeFrom() {
        return currencyCodeFrom;
    }

    /**
     * Sets the value of the currencyCodeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCodeFrom(JAXBElement<String> value) {
        this.currencyCodeFrom = value;
    }

    /**
     * Gets the value of the currencyCodeTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCodeTo() {
        return currencyCodeTo;
    }

    /**
     * Sets the value of the currencyCodeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCodeTo(JAXBElement<String> value) {
        this.currencyCodeTo = value;
    }

}
