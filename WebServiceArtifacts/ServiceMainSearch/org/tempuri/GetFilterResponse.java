
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mouzenidis_services_objects.ArrayOfReturnObject;


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
 *         &lt;element name="GetFilterResult" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}ArrayOfReturnObject" minOccurs="0"/>
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
    "getFilterResult"
})
@XmlRootElement(name = "GetFilterResponse")
public class GetFilterResponse {

    @XmlElementRef(name = "GetFilterResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReturnObject> getFilterResult;

    /**
     * Gets the value of the getFilterResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReturnObject }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReturnObject> getGetFilterResult() {
        return getFilterResult;
    }

    /**
     * Sets the value of the getFilterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReturnObject }{@code >}
     *     
     */
    public void setGetFilterResult(JAXBElement<ArrayOfReturnObject> value) {
        this.getFilterResult = value;
    }

}
