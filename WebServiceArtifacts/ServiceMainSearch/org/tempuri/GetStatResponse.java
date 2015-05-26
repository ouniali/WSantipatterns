
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mouzenidis_services.ArrayOfStatItem;


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
 *         &lt;element name="GetStatResult" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch}ArrayOfStatItem" minOccurs="0"/>
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
    "getStatResult"
})
@XmlRootElement(name = "GetStatResponse")
public class GetStatResponse {

    @XmlElementRef(name = "GetStatResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStatItem> getStatResult;

    /**
     * Gets the value of the getStatResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStatItem> getGetStatResult() {
        return getStatResult;
    }

    /**
     * Sets the value of the getStatResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatItem }{@code >}
     *     
     */
    public void setGetStatResult(JAXBElement<ArrayOfStatItem> value) {
        this.getStatResult = value;
    }

}
