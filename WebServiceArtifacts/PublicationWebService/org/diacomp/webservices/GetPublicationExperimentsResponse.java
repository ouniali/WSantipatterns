
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
 *         &lt;element name="GetPublicationExperimentsResult" type="{http://www.diacomp.org/webservices/}ArrayOfExperiment" minOccurs="0"/>
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
    "getPublicationExperimentsResult"
})
@XmlRootElement(name = "GetPublicationExperimentsResponse")
public class GetPublicationExperimentsResponse {

    @XmlElement(name = "GetPublicationExperimentsResult")
    protected ArrayOfExperiment getPublicationExperimentsResult;

    /**
     * Gets the value of the getPublicationExperimentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExperiment }
     *     
     */
    public ArrayOfExperiment getGetPublicationExperimentsResult() {
        return getPublicationExperimentsResult;
    }

    /**
     * Sets the value of the getPublicationExperimentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExperiment }
     *     
     */
    public void setGetPublicationExperimentsResult(ArrayOfExperiment value) {
        this.getPublicationExperimentsResult = value;
    }

}
