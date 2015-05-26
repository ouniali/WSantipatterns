
package org.datacontract.schemas._2004._07.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingChargesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingChargesInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdultSurcharge" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PaxTypeCharge" minOccurs="0"/>
 *         &lt;element name="ChildSurcharge" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PaxTypeCharge" minOccurs="0"/>
 *         &lt;element name="InfantSurcharge" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PaxTypeCharge" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingChargesInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", propOrder = {
    "adultSurcharge",
    "childSurcharge",
    "infantSurcharge"
})
public class BookingChargesInfo {

    @XmlElementRef(name = "AdultSurcharge", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<PaxTypeCharge> adultSurcharge;
    @XmlElementRef(name = "ChildSurcharge", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<PaxTypeCharge> childSurcharge;
    @XmlElementRef(name = "InfantSurcharge", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<PaxTypeCharge> infantSurcharge;

    /**
     * Gets the value of the adultSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaxTypeCharge }{@code >}
     *     
     */
    public JAXBElement<PaxTypeCharge> getAdultSurcharge() {
        return adultSurcharge;
    }

    /**
     * Sets the value of the adultSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaxTypeCharge }{@code >}
     *     
     */
    public void setAdultSurcharge(JAXBElement<PaxTypeCharge> value) {
        this.adultSurcharge = value;
    }

    /**
     * Gets the value of the childSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaxTypeCharge }{@code >}
     *     
     */
    public JAXBElement<PaxTypeCharge> getChildSurcharge() {
        return childSurcharge;
    }

    /**
     * Sets the value of the childSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaxTypeCharge }{@code >}
     *     
     */
    public void setChildSurcharge(JAXBElement<PaxTypeCharge> value) {
        this.childSurcharge = value;
    }

    /**
     * Gets the value of the infantSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaxTypeCharge }{@code >}
     *     
     */
    public JAXBElement<PaxTypeCharge> getInfantSurcharge() {
        return infantSurcharge;
    }

    /**
     * Sets the value of the infantSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaxTypeCharge }{@code >}
     *     
     */
    public void setInfantSurcharge(JAXBElement<PaxTypeCharge> value) {
        this.infantSurcharge = value;
    }

}
