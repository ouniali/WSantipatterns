
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
 *         &lt;element name="GetModelsResult" type="{http://www.diacomp.org/webservices/}ArrayOfModel" minOccurs="0"/>
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
    "getModelsResult"
})
@XmlRootElement(name = "GetModelsResponse")
public class GetModelsResponse {

    @XmlElement(name = "GetModelsResult")
    protected ArrayOfModel getModelsResult;

    /**
     * Gets the value of the getModelsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModel }
     *     
     */
    public ArrayOfModel getGetModelsResult() {
        return getModelsResult;
    }

    /**
     * Sets the value of the getModelsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModel }
     *     
     */
    public void setGetModelsResult(ArrayOfModel value) {
        this.getModelsResult = value;
    }

}
