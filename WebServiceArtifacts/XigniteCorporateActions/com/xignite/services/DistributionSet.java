
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionSet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceObj">
 *       &lt;sequence>
 *         &lt;element name="DistributionSetDataSourceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistributionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="From" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntitledPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDefaultDistribution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DistributionDividends" type="{http://www.xignite.com/services/}ArrayOfDistributionDividend" minOccurs="0"/>
 *         &lt;element name="DistributionPayments" type="{http://www.xignite.com/services/}ArrayOfDistributionPayment" minOccurs="0"/>
 *         &lt;element name="DistributionSubsets" type="{http://www.xignite.com/services/}ArrayOfDistributionSet" minOccurs="0"/>
 *         &lt;element name="Instrument" type="{http://www.xignite.com/services/}Instrument" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionSet", propOrder = {
    "distributionSetDataSourceIdentifier",
    "distributionType",
    "from",
    "to",
    "entitledPerson",
    "setType",
    "isDefaultDistribution",
    "distributionDividends",
    "distributionPayments",
    "distributionSubsets",
    "instrument"
})
public class DistributionSet
    extends AbstractPublicWebServiceObj
{

    @XmlElement(name = "DistributionSetDataSourceIdentifier")
    protected String distributionSetDataSourceIdentifier;
    @XmlElement(name = "DistributionType")
    protected String distributionType;
    @XmlElement(name = "From")
    protected String from;
    @XmlElement(name = "To")
    protected String to;
    @XmlElement(name = "EntitledPerson")
    protected String entitledPerson;
    @XmlElement(name = "SetType")
    protected String setType;
    @XmlElement(name = "IsDefaultDistribution")
    protected boolean isDefaultDistribution;
    @XmlElement(name = "DistributionDividends")
    protected ArrayOfDistributionDividend distributionDividends;
    @XmlElement(name = "DistributionPayments")
    protected ArrayOfDistributionPayment distributionPayments;
    @XmlElement(name = "DistributionSubsets")
    protected ArrayOfDistributionSet distributionSubsets;
    @XmlElement(name = "Instrument")
    protected Instrument instrument;

    /**
     * Gets the value of the distributionSetDataSourceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionSetDataSourceIdentifier() {
        return distributionSetDataSourceIdentifier;
    }

    /**
     * Sets the value of the distributionSetDataSourceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionSetDataSourceIdentifier(String value) {
        this.distributionSetDataSourceIdentifier = value;
    }

    /**
     * Gets the value of the distributionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionType() {
        return distributionType;
    }

    /**
     * Sets the value of the distributionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionType(String value) {
        this.distributionType = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the entitledPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitledPerson() {
        return entitledPerson;
    }

    /**
     * Sets the value of the entitledPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitledPerson(String value) {
        this.entitledPerson = value;
    }

    /**
     * Gets the value of the setType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetType() {
        return setType;
    }

    /**
     * Sets the value of the setType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetType(String value) {
        this.setType = value;
    }

    /**
     * Gets the value of the isDefaultDistribution property.
     * 
     */
    public boolean isIsDefaultDistribution() {
        return isDefaultDistribution;
    }

    /**
     * Sets the value of the isDefaultDistribution property.
     * 
     */
    public void setIsDefaultDistribution(boolean value) {
        this.isDefaultDistribution = value;
    }

    /**
     * Gets the value of the distributionDividends property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDistributionDividend }
     *     
     */
    public ArrayOfDistributionDividend getDistributionDividends() {
        return distributionDividends;
    }

    /**
     * Sets the value of the distributionDividends property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDistributionDividend }
     *     
     */
    public void setDistributionDividends(ArrayOfDistributionDividend value) {
        this.distributionDividends = value;
    }

    /**
     * Gets the value of the distributionPayments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDistributionPayment }
     *     
     */
    public ArrayOfDistributionPayment getDistributionPayments() {
        return distributionPayments;
    }

    /**
     * Sets the value of the distributionPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDistributionPayment }
     *     
     */
    public void setDistributionPayments(ArrayOfDistributionPayment value) {
        this.distributionPayments = value;
    }

    /**
     * Gets the value of the distributionSubsets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDistributionSet }
     *     
     */
    public ArrayOfDistributionSet getDistributionSubsets() {
        return distributionSubsets;
    }

    /**
     * Sets the value of the distributionSubsets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDistributionSet }
     *     
     */
    public void setDistributionSubsets(ArrayOfDistributionSet value) {
        this.distributionSubsets = value;
    }

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

}
