
package com.conducivetech.cache.delayindex.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestFiltered complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestFiltered">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.delayindex.cache.conducivetech.com/}requestBase">
 *       &lt;sequence>
 *         &lt;element name="classification" type="{http://v1.service.delayindex.cache.conducivetech.com/}requestedInteger" minOccurs="0"/>
 *         &lt;element name="score" type="{http://v1.service.delayindex.cache.conducivetech.com/}requestedDouble" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestFiltered", propOrder = {
    "classification",
    "score"
})
@XmlSeeAlso({
    RequestState.class,
    RequestAirports.class,
    RequestCountry.class,
    RequestRegion.class
})
public abstract class RequestFiltered
    extends RequestBase
{

    protected RequestedInteger classification;
    protected RequestedDouble score;

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedInteger }
     *     
     */
    public RequestedInteger getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedInteger }
     *     
     */
    public void setClassification(RequestedInteger value) {
        this.classification = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDouble }
     *     
     */
    public RequestedDouble getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDouble }
     *     
     */
    public void setScore(RequestedDouble value) {
        this.score = value;
    }

}
