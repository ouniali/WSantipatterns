
package org.datacontract.schemas._2004._07.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerUserCardTypesEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerUserCardTypesEN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}CardTypesEN">
 *       &lt;sequence>
 *         &lt;element name="CustomerUserCardTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsCaptureCardDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Markup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="ShowMarkupinBookingPage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerUserCardTypesEN", propOrder = {
    "customerUserCardTypeID",
    "customerUserID",
    "isCaptureCardDetails",
    "markup",
    "resultMsg",
    "showMarkupinBookingPage"
})
public class CustomerUserCardTypesEN
    extends CardTypesEN
{

    @XmlElement(name = "CustomerUserCardTypeID")
    protected Integer customerUserCardTypeID;
    @XmlElement(name = "CustomerUserID")
    protected Integer customerUserID;
    @XmlElement(name = "IsCaptureCardDetails")
    protected Boolean isCaptureCardDetails;
    @XmlElement(name = "Markup")
    protected BigDecimal markup;
    @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> resultMsg;
    @XmlElement(name = "ShowMarkupinBookingPage")
    protected Boolean showMarkupinBookingPage;

    /**
     * Gets the value of the customerUserCardTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerUserCardTypeID() {
        return customerUserCardTypeID;
    }

    /**
     * Sets the value of the customerUserCardTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerUserCardTypeID(Integer value) {
        this.customerUserCardTypeID = value;
    }

    /**
     * Gets the value of the customerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerUserID() {
        return customerUserID;
    }

    /**
     * Sets the value of the customerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerUserID(Integer value) {
        this.customerUserID = value;
    }

    /**
     * Gets the value of the isCaptureCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCaptureCardDetails() {
        return isCaptureCardDetails;
    }

    /**
     * Sets the value of the isCaptureCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCaptureCardDetails(Boolean value) {
        this.isCaptureCardDetails = value;
    }

    /**
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkup() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarkup(BigDecimal value) {
        this.markup = value;
    }

    /**
     * Gets the value of the resultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public JAXBElement<Result> getResultMsg() {
        return resultMsg;
    }

    /**
     * Sets the value of the resultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public void setResultMsg(JAXBElement<Result> value) {
        this.resultMsg = value;
    }

    /**
     * Gets the value of the showMarkupinBookingPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowMarkupinBookingPage() {
        return showMarkupinBookingPage;
    }

    /**
     * Sets the value of the showMarkupinBookingPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMarkupinBookingPage(Boolean value) {
        this.showMarkupinBookingPage = value;
    }

}
