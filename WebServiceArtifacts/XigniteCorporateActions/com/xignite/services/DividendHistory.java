
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DividendHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DividendHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceObj">
 *       &lt;sequence>
 *         &lt;element name="Instrument" type="{http://www.xignite.com/services/}Instrument" minOccurs="0"/>
 *         &lt;element name="MatchingSecurity" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="Dividends" type="{http://www.xignite.com/services/}ArrayOfDividend" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DividendHistory", propOrder = {
    "instrument",
    "matchingSecurity",
    "dividends"
})
public class DividendHistory
    extends AbstractPublicWebServiceObj
{

    @XmlElement(name = "Instrument")
    protected Instrument instrument;
    @XmlElement(name = "MatchingSecurity")
    protected Security matchingSecurity;
    @XmlElement(name = "Dividends")
    protected ArrayOfDividend dividends;

    /**
     * Gets the value of the instrument property.
     * 
     * @return
     *     possible object is
     *     {@link Instrument }
     *     
     */
    public Instrument getInstrument() {
        return instrument;
    }

    /**
     * Sets the value of the instrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instrument }
     *     
     */
    public void setInstrument(Instrument value) {
        this.instrument = value;
    }

    /**
     * Gets the value of the matchingSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getMatchingSecurity() {
        return matchingSecurity;
    }

    /**
     * Sets the value of the matchingSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setMatchingSecurity(Security value) {
        this.matchingSecurity = value;
    }

    /**
     * Gets the value of the dividends property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDividend }
     *     
     */
    public ArrayOfDividend getDividends() {
        return dividends;
    }

    /**
     * Sets the value of the dividends property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDividend }
     *     
     */
    public void setDividends(ArrayOfDividend value) {
        this.dividends = value;
    }

}
