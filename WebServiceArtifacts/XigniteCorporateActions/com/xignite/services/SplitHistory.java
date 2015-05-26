
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SplitHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceObj">
 *       &lt;sequence>
 *         &lt;element name="Instrument" type="{http://www.xignite.com/services/}Instrument" minOccurs="0"/>
 *         &lt;element name="MatchingSecurity" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="Splits" type="{http://www.xignite.com/services/}ArrayOfSplit" minOccurs="0"/>
 *         &lt;element name="PreviousSplitHistory" type="{http://www.xignite.com/services/}SplitHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitHistory", propOrder = {
    "instrument",
    "matchingSecurity",
    "splits",
    "previousSplitHistory"
})
public class SplitHistory
    extends AbstractPublicWebServiceObj
{

    @XmlElement(name = "Instrument")
    protected Instrument instrument;
    @XmlElement(name = "MatchingSecurity")
    protected Security matchingSecurity;
    @XmlElement(name = "Splits")
    protected ArrayOfSplit splits;
    @XmlElement(name = "PreviousSplitHistory")
    protected SplitHistory previousSplitHistory;

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
     * Gets the value of the splits property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSplit }
     *     
     */
    public ArrayOfSplit getSplits() {
        return splits;
    }

    /**
     * Sets the value of the splits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSplit }
     *     
     */
    public void setSplits(ArrayOfSplit value) {
        this.splits = value;
    }

    /**
     * Gets the value of the previousSplitHistory property.
     * 
     * @return
     *     possible object is
     *     {@link SplitHistory }
     *     
     */
    public SplitHistory getPreviousSplitHistory() {
        return previousSplitHistory;
    }

    /**
     * Sets the value of the previousSplitHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitHistory }
     *     
     */
    public void setPreviousSplitHistory(SplitHistory value) {
        this.previousSplitHistory = value;
    }

}
