
package com._2sms.webservices._2_0.simple;

import java.math.BigDecimal;
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
 *         &lt;element name="GetBalanceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnyTimeBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OffPeakBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ResultText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getBalanceResult",
    "anyTimeBalance",
    "offPeakBalance",
    "resultText",
    "code"
})
@XmlRootElement(name = "GetBalanceResponse")
public class GetBalanceResponse {

    @XmlElement(name = "GetBalanceResult")
    protected String getBalanceResult;
    @XmlElement(name = "AnyTimeBalance", required = true)
    protected BigDecimal anyTimeBalance;
    @XmlElement(name = "OffPeakBalance", required = true)
    protected BigDecimal offPeakBalance;
    @XmlElement(name = "ResultText")
    protected String resultText;
    @XmlElement(name = "Code")
    protected String code;

    /**
     * Gets the value of the getBalanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetBalanceResult() {
        return getBalanceResult;
    }

    /**
     * Sets the value of the getBalanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetBalanceResult(String value) {
        this.getBalanceResult = value;
    }

    /**
     * Gets the value of the anyTimeBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnyTimeBalance() {
        return anyTimeBalance;
    }

    /**
     * Sets the value of the anyTimeBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnyTimeBalance(BigDecimal value) {
        this.anyTimeBalance = value;
    }

    /**
     * Gets the value of the offPeakBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffPeakBalance() {
        return offPeakBalance;
    }

    /**
     * Sets the value of the offPeakBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffPeakBalance(BigDecimal value) {
        this.offPeakBalance = value;
    }

    /**
     * Gets the value of the resultText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultText() {
        return resultText;
    }

    /**
     * Sets the value of the resultText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultText(String value) {
        this.resultText = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
