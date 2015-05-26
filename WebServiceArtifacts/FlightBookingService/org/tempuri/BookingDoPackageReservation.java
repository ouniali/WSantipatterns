
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.goquo_dp.CreditCardsEN;
import org.datacontract.schemas._2004._07.goquo_dp.CustUserPaymentType;
import org.datacontract.schemas._2004._07.goquo_dp.CustomerUserPaymentMethodsEN;
import org.datacontract.schemas._2004._07.goquo_dp.PaxLoginsEN;
import org.datacontract.schemas._2004._07.goquo_dp.ReservationsCardTransactionsEN;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="argEn" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}CreditCardsEN" minOccurs="0"/>
 *         &lt;element name="argEnTrans" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ReservationsCardTransactionsEN" minOccurs="0"/>
 *         &lt;element name="argEnPM" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}CustomerUserPaymentMethodsEN" minOccurs="0"/>
 *         &lt;element name="custUserPaymentType" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils}CustUserPaymentType" minOccurs="0"/>
 *         &lt;element name="IsPaymentMade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPaymentProcessed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="paxLoginEN" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}PaxLoginsEN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "argEn",
    "argEnTrans",
    "argEnPM",
    "custUserPaymentType",
    "isPaymentMade",
    "isPaymentProcessed",
    "paxLoginEN"
})
@XmlRootElement(name = "Booking_DoPackageReservation")
public class BookingDoPackageReservation {

    @XmlElementRef(name = "argEn", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditCardsEN> argEn;
    @XmlElementRef(name = "argEnTrans", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ReservationsCardTransactionsEN> argEnTrans;
    @XmlElementRef(name = "argEnPM", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomerUserPaymentMethodsEN> argEnPM;
    @XmlSchemaType(name = "string")
    protected CustUserPaymentType custUserPaymentType;
    @XmlElement(name = "IsPaymentMade")
    protected Boolean isPaymentMade;
    @XmlElement(name = "IsPaymentProcessed")
    protected Boolean isPaymentProcessed;
    @XmlElementRef(name = "paxLoginEN", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<PaxLoginsEN> paxLoginEN;

    /**
     * Gets the value of the argEn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditCardsEN }{@code >}
     *     
     */
    public JAXBElement<CreditCardsEN> getArgEn() {
        return argEn;
    }

    /**
     * Sets the value of the argEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditCardsEN }{@code >}
     *     
     */
    public void setArgEn(JAXBElement<CreditCardsEN> value) {
        this.argEn = value;
    }

    /**
     * Gets the value of the argEnTrans property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReservationsCardTransactionsEN }{@code >}
     *     
     */
    public JAXBElement<ReservationsCardTransactionsEN> getArgEnTrans() {
        return argEnTrans;
    }

    /**
     * Sets the value of the argEnTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReservationsCardTransactionsEN }{@code >}
     *     
     */
    public void setArgEnTrans(JAXBElement<ReservationsCardTransactionsEN> value) {
        this.argEnTrans = value;
    }

    /**
     * Gets the value of the argEnPM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomerUserPaymentMethodsEN }{@code >}
     *     
     */
    public JAXBElement<CustomerUserPaymentMethodsEN> getArgEnPM() {
        return argEnPM;
    }

    /**
     * Sets the value of the argEnPM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomerUserPaymentMethodsEN }{@code >}
     *     
     */
    public void setArgEnPM(JAXBElement<CustomerUserPaymentMethodsEN> value) {
        this.argEnPM = value;
    }

    /**
     * Gets the value of the custUserPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link CustUserPaymentType }
     *     
     */
    public CustUserPaymentType getCustUserPaymentType() {
        return custUserPaymentType;
    }

    /**
     * Sets the value of the custUserPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustUserPaymentType }
     *     
     */
    public void setCustUserPaymentType(CustUserPaymentType value) {
        this.custUserPaymentType = value;
    }

    /**
     * Gets the value of the isPaymentMade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPaymentMade() {
        return isPaymentMade;
    }

    /**
     * Sets the value of the isPaymentMade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPaymentMade(Boolean value) {
        this.isPaymentMade = value;
    }

    /**
     * Gets the value of the isPaymentProcessed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPaymentProcessed() {
        return isPaymentProcessed;
    }

    /**
     * Sets the value of the isPaymentProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPaymentProcessed(Boolean value) {
        this.isPaymentProcessed = value;
    }

    /**
     * Gets the value of the paxLoginEN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaxLoginsEN }{@code >}
     *     
     */
    public JAXBElement<PaxLoginsEN> getPaxLoginEN() {
        return paxLoginEN;
    }

    /**
     * Sets the value of the paxLoginEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaxLoginsEN }{@code >}
     *     
     */
    public void setPaxLoginEN(JAXBElement<PaxLoginsEN> value) {
        this.paxLoginEN = value;
    }

}
