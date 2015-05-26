
package org.diacomp.webservices;

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
 *         &lt;element name="GetModelExperimentsResult" type="{http://www.diacomp.org/webservices/}ArrayOfInvestigator" minOccurs="0"/>
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
    "getModelExperimentsResult"
})
@XmlRootElement(name = "GetModelExperimentsResponse")
public class GetModelExperimentsResponse {

    @XmlElement(name = "GetModelExperimentsResult")
    protected ArrayOfInvestigator getModelExperimentsResult;

    /**
     * Gets the value of the getModelExperimentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvestigator }
     *     
     */
    public ArrayOfInvestigator getGetModelExperimentsResult() {
        return getModelExperimentsResult;
    }

    /**
     * Sets the value of the getModelExperimentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvestigator }
     *     
     */
    public void setGetModelExperimentsResult(ArrayOfInvestigator value) {
        this.getModelExperimentsResult = value;
    }

}
