
package linjegodswebservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightPriceResultat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightPriceResultat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grossfreight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Freight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Netfreight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PrivateDeliverySurcharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ParcelVolumSurcharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GiroServiceSurcharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ConsigneeToPay" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CollectionSurcharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightPriceResultat", propOrder = {
    "messageId",
    "message",
    "grossfreight",
    "discount",
    "freight",
    "netfreight",
    "privateDeliverySurcharge",
    "parcelVolumSurcharge",
    "giroServiceSurcharge",
    "consigneeToPay",
    "collectionSurcharge"
})
public class FreightPriceResultat {

    @XmlElement(name = "MessageId")
    protected int messageId;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "Grossfreight", required = true)
    protected BigDecimal grossfreight;
    @XmlElement(name = "Discount", required = true)
    protected BigDecimal discount;
    @XmlElement(name = "Freight", required = true)
    protected BigDecimal freight;
    @XmlElement(name = "Netfreight", required = true)
    protected BigDecimal netfreight;
    @XmlElement(name = "PrivateDeliverySurcharge", required = true)
    protected BigDecimal privateDeliverySurcharge;
    @XmlElement(name = "ParcelVolumSurcharge", required = true)
    protected BigDecimal parcelVolumSurcharge;
    @XmlElement(name = "GiroServiceSurcharge", required = true)
    protected BigDecimal giroServiceSurcharge;
    @XmlElement(name = "ConsigneeToPay", required = true)
    protected BigDecimal consigneeToPay;
    @XmlElement(name = "CollectionSurcharge", required = true)
    protected BigDecimal collectionSurcharge;

    /**
     * Gets the value of the messageId property.
     * 
     */
    public int getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     */
    public void setMessageId(int value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the grossfreight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossfreight() {
        return grossfreight;
    }

    /**
     * Sets the value of the grossfreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossfreight(BigDecimal value) {
        this.grossfreight = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the freight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * Sets the value of the freight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreight(BigDecimal value) {
        this.freight = value;
    }

    /**
     * Gets the value of the netfreight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetfreight() {
        return netfreight;
    }

    /**
     * Sets the value of the netfreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetfreight(BigDecimal value) {
        this.netfreight = value;
    }

    /**
     * Gets the value of the privateDeliverySurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrivateDeliverySurcharge() {
        return privateDeliverySurcharge;
    }

    /**
     * Sets the value of the privateDeliverySurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrivateDeliverySurcharge(BigDecimal value) {
        this.privateDeliverySurcharge = value;
    }

    /**
     * Gets the value of the parcelVolumSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParcelVolumSurcharge() {
        return parcelVolumSurcharge;
    }

    /**
     * Sets the value of the parcelVolumSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParcelVolumSurcharge(BigDecimal value) {
        this.parcelVolumSurcharge = value;
    }

    /**
     * Gets the value of the giroServiceSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGiroServiceSurcharge() {
        return giroServiceSurcharge;
    }

    /**
     * Sets the value of the giroServiceSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGiroServiceSurcharge(BigDecimal value) {
        this.giroServiceSurcharge = value;
    }

    /**
     * Gets the value of the consigneeToPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsigneeToPay() {
        return consigneeToPay;
    }

    /**
     * Sets the value of the consigneeToPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsigneeToPay(BigDecimal value) {
        this.consigneeToPay = value;
    }

    /**
     * Gets the value of the collectionSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCollectionSurcharge() {
        return collectionSurcharge;
    }

    /**
     * Sets the value of the collectionSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCollectionSurcharge(BigDecimal value) {
        this.collectionSurcharge = value;
    }

}
