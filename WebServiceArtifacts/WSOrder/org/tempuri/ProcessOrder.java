
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MOrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OrderSubTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Shipping" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CustomsDuties" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LocalShipping" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LocalTAX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OtherAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardCCV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardIBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardITelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing_Order" type="{http://tempuri.org/}OrderAddresses" minOccurs="0"/>
 *         &lt;element name="Shipping_Order" type="{http://tempuri.org/}OrderAddresses" minOccurs="0"/>
 *         &lt;element name="OrderDetail" type="{http://tempuri.org/}ArrayOfOrderDetail" minOccurs="0"/>
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
    "orderDate",
    "mOrderNumber",
    "orderTotal",
    "orderSubTotal",
    "shipping",
    "customsDuties",
    "localShipping",
    "localTAX",
    "otherAmount",
    "paymentType",
    "creditCardName",
    "creditCardNumber",
    "creditCardMonth",
    "creditCardYear",
    "creditCardCCV2",
    "creditCardIBN",
    "creditCardITelephone",
    "customerIP",
    "orderNotes",
    "billingOrder",
    "shippingOrder",
    "orderDetail"
})
@XmlRootElement(name = "ProcessOrder")
public class ProcessOrder {

    @XmlElement(name = "OrderDate")
    protected String orderDate;
    @XmlElement(name = "MOrderNumber")
    protected int mOrderNumber;
    @XmlElement(name = "OrderTotal")
    protected double orderTotal;
    @XmlElement(name = "OrderSubTotal")
    protected double orderSubTotal;
    @XmlElement(name = "Shipping")
    protected double shipping;
    @XmlElement(name = "CustomsDuties")
    protected double customsDuties;
    @XmlElement(name = "LocalShipping")
    protected double localShipping;
    @XmlElement(name = "LocalTAX")
    protected double localTAX;
    @XmlElement(name = "OtherAmount")
    protected double otherAmount;
    @XmlElement(name = "PaymentType")
    protected String paymentType;
    @XmlElement(name = "CreditCardName")
    protected String creditCardName;
    @XmlElement(name = "CreditCardNumber")
    protected String creditCardNumber;
    @XmlElement(name = "CreditCardMonth")
    protected String creditCardMonth;
    @XmlElement(name = "CreditCardYear")
    protected String creditCardYear;
    @XmlElement(name = "CreditCardCCV2")
    protected String creditCardCCV2;
    @XmlElement(name = "CreditCardIBN")
    protected String creditCardIBN;
    @XmlElement(name = "CreditCardITelephone")
    protected String creditCardITelephone;
    @XmlElement(name = "CustomerIP")
    protected String customerIP;
    @XmlElement(name = "OrderNotes")
    protected String orderNotes;
    @XmlElement(name = "Billing_Order")
    protected OrderAddresses billingOrder;
    @XmlElement(name = "Shipping_Order")
    protected OrderAddresses shippingOrder;
    @XmlElement(name = "OrderDetail")
    protected ArrayOfOrderDetail orderDetail;

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(String value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the mOrderNumber property.
     * 
     */
    public int getMOrderNumber() {
        return mOrderNumber;
    }

    /**
     * Sets the value of the mOrderNumber property.
     * 
     */
    public void setMOrderNumber(int value) {
        this.mOrderNumber = value;
    }

    /**
     * Gets the value of the orderTotal property.
     * 
     */
    public double getOrderTotal() {
        return orderTotal;
    }

    /**
     * Sets the value of the orderTotal property.
     * 
     */
    public void setOrderTotal(double value) {
        this.orderTotal = value;
    }

    /**
     * Gets the value of the orderSubTotal property.
     * 
     */
    public double getOrderSubTotal() {
        return orderSubTotal;
    }

    /**
     * Sets the value of the orderSubTotal property.
     * 
     */
    public void setOrderSubTotal(double value) {
        this.orderSubTotal = value;
    }

    /**
     * Gets the value of the shipping property.
     * 
     */
    public double getShipping() {
        return shipping;
    }

    /**
     * Sets the value of the shipping property.
     * 
     */
    public void setShipping(double value) {
        this.shipping = value;
    }

    /**
     * Gets the value of the customsDuties property.
     * 
     */
    public double getCustomsDuties() {
        return customsDuties;
    }

    /**
     * Sets the value of the customsDuties property.
     * 
     */
    public void setCustomsDuties(double value) {
        this.customsDuties = value;
    }

    /**
     * Gets the value of the localShipping property.
     * 
     */
    public double getLocalShipping() {
        return localShipping;
    }

    /**
     * Sets the value of the localShipping property.
     * 
     */
    public void setLocalShipping(double value) {
        this.localShipping = value;
    }

    /**
     * Gets the value of the localTAX property.
     * 
     */
    public double getLocalTAX() {
        return localTAX;
    }

    /**
     * Sets the value of the localTAX property.
     * 
     */
    public void setLocalTAX(double value) {
        this.localTAX = value;
    }

    /**
     * Gets the value of the otherAmount property.
     * 
     */
    public double getOtherAmount() {
        return otherAmount;
    }

    /**
     * Sets the value of the otherAmount property.
     * 
     */
    public void setOtherAmount(double value) {
        this.otherAmount = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the creditCardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardName() {
        return creditCardName;
    }

    /**
     * Sets the value of the creditCardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardName(String value) {
        this.creditCardName = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardMonth() {
        return creditCardMonth;
    }

    /**
     * Sets the value of the creditCardMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardMonth(String value) {
        this.creditCardMonth = value;
    }

    /**
     * Gets the value of the creditCardYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardYear() {
        return creditCardYear;
    }

    /**
     * Sets the value of the creditCardYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardYear(String value) {
        this.creditCardYear = value;
    }

    /**
     * Gets the value of the creditCardCCV2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardCCV2() {
        return creditCardCCV2;
    }

    /**
     * Sets the value of the creditCardCCV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardCCV2(String value) {
        this.creditCardCCV2 = value;
    }

    /**
     * Gets the value of the creditCardIBN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardIBN() {
        return creditCardIBN;
    }

    /**
     * Sets the value of the creditCardIBN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardIBN(String value) {
        this.creditCardIBN = value;
    }

    /**
     * Gets the value of the creditCardITelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardITelephone() {
        return creditCardITelephone;
    }

    /**
     * Sets the value of the creditCardITelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardITelephone(String value) {
        this.creditCardITelephone = value;
    }

    /**
     * Gets the value of the customerIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIP() {
        return customerIP;
    }

    /**
     * Sets the value of the customerIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIP(String value) {
        this.customerIP = value;
    }

    /**
     * Gets the value of the orderNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNotes() {
        return orderNotes;
    }

    /**
     * Sets the value of the orderNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNotes(String value) {
        this.orderNotes = value;
    }

    /**
     * Gets the value of the billingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link OrderAddresses }
     *     
     */
    public OrderAddresses getBillingOrder() {
        return billingOrder;
    }

    /**
     * Sets the value of the billingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderAddresses }
     *     
     */
    public void setBillingOrder(OrderAddresses value) {
        this.billingOrder = value;
    }

    /**
     * Gets the value of the shippingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link OrderAddresses }
     *     
     */
    public OrderAddresses getShippingOrder() {
        return shippingOrder;
    }

    /**
     * Sets the value of the shippingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderAddresses }
     *     
     */
    public void setShippingOrder(OrderAddresses value) {
        this.shippingOrder = value;
    }

    /**
     * Gets the value of the orderDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderDetail }
     *     
     */
    public ArrayOfOrderDetail getOrderDetail() {
        return orderDetail;
    }

    /**
     * Sets the value of the orderDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderDetail }
     *     
     */
    public void setOrderDetail(ArrayOfOrderDetail value) {
        this.orderDetail = value;
    }

}
