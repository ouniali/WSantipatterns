
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotaFlightTariffs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotaFlightTariffs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuotaFlightTariffStates" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}ArrayOfQuotaFlightTariffState" minOccurs="0"/>
 *         &lt;element name="Tariff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TariffId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TariffName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaFlightTariffs", propOrder = {
    "quotaFlightTariffStates",
    "tariff",
    "tariffId",
    "tariffName"
})
public class QuotaFlightTariffs {

    @XmlElementRef(name = "QuotaFlightTariffStates", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfQuotaFlightTariffState> quotaFlightTariffStates;
    @XmlElementRef(name = "Tariff", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tariff;
    @XmlElement(name = "TariffId")
    protected Integer tariffId;
    @XmlElementRef(name = "TariffName", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tariffName;

    /**
     * Gets the value of the quotaFlightTariffStates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotaFlightTariffState }{@code >}
     *     
     */
    public JAXBElement<ArrayOfQuotaFlightTariffState> getQuotaFlightTariffStates() {
        return quotaFlightTariffStates;
    }

    /**
     * Sets the value of the quotaFlightTariffStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotaFlightTariffState }{@code >}
     *     
     */
    public void setQuotaFlightTariffStates(JAXBElement<ArrayOfQuotaFlightTariffState> value) {
        this.quotaFlightTariffStates = value;
    }

    /**
     * Gets the value of the tariff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTariff() {
        return tariff;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTariff(JAXBElement<String> value) {
        this.tariff = value;
    }

    /**
     * Gets the value of the tariffId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTariffId() {
        return tariffId;
    }

    /**
     * Sets the value of the tariffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTariffId(Integer value) {
        this.tariffId = value;
    }

    /**
     * Gets the value of the tariffName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTariffName() {
        return tariffName;
    }

    /**
     * Sets the value of the tariffName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTariffName(JAXBElement<String> value) {
        this.tariffName = value;
    }

}
