
package common.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Holder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearExpiration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MonthExpiration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberPayments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CardOperator" type="{WS_2013.Common}eCreditCard"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCard", propOrder = {
    "holder",
    "cardNumber",
    "securityCode",
    "yearExpiration",
    "monthExpiration",
    "numberPayments",
    "cardOperator"
})
public class CreditCard {

    @XmlElement(name = "Holder")
    protected String holder;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "SecurityCode")
    protected String securityCode;
    @XmlElement(name = "YearExpiration")
    protected int yearExpiration;
    @XmlElement(name = "MonthExpiration")
    protected int monthExpiration;
    @XmlElement(name = "NumberPayments")
    protected int numberPayments;
    @XmlElement(name = "CardOperator", required = true)
    @XmlSchemaType(name = "string")
    protected ECreditCard cardOperator;

    /**
     * Gets the value of the holder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolder() {
        return holder;
    }

    /**
     * Sets the value of the holder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolder(String value) {
        this.holder = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the yearExpiration property.
     * 
     */
    public int getYearExpiration() {
        return yearExpiration;
    }

    /**
     * Sets the value of the yearExpiration property.
     * 
     */
    public void setYearExpiration(int value) {
        this.yearExpiration = value;
    }

    /**
     * Gets the value of the monthExpiration property.
     * 
     */
    public int getMonthExpiration() {
        return monthExpiration;
    }

    /**
     * Sets the value of the monthExpiration property.
     * 
     */
    public void setMonthExpiration(int value) {
        this.monthExpiration = value;
    }

    /**
     * Gets the value of the numberPayments property.
     * 
     */
    public int getNumberPayments() {
        return numberPayments;
    }

    /**
     * Sets the value of the numberPayments property.
     * 
     */
    public void setNumberPayments(int value) {
        this.numberPayments = value;
    }

    /**
     * Gets the value of the cardOperator property.
     * 
     * @return
     *     possible object is
     *     {@link ECreditCard }
     *     
     */
    public ECreditCard getCardOperator() {
        return cardOperator;
    }

    /**
     * Sets the value of the cardOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECreditCard }
     *     
     */
    public void setCardOperator(ECreditCard value) {
        this.cardOperator = value;
    }

}
