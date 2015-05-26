
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
 *         &lt;element name="GetModelResult" type="{http://www.diacomp.org/webservices/}Model" minOccurs="0"/>
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
    "getModelResult"
})
@XmlRootElement(name = "GetModelResponse")
public class GetModelResponse {

    @XmlElement(name = "GetModelResult")
    protected Model getModelResult;

    /**
     * Gets the value of the getModelResult property.
     * 
     * @return
     *     possible object is
     *     {@link Model }
     *     
     */
    public Model getGetModelResult() {
        return getModelResult;
    }

    /**
     * Sets the value of the getModelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model }
     *     
     */
    public void setGetModelResult(Model value) {
        this.getModelResult = value;
    }

}
