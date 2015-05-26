
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
 *         &lt;element name="GetFilter4Result" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}ArrayOfReturnObject" minOccurs="0"/>
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
    "getFilter4Result"
})
@XmlRootElement(name = "GetFilter4Response")
public class GetFilter4Response {

    @XmlElementRef(name = "GetFilter4Result", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReturnObject> getFilter4Result;

    /**
     * Gets the value of the getFilter4Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReturnObject }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReturnObject> getGetFilter4Result() {
        return getFilter4Result;
    }

    /**
     * Sets the value of the getFilter4Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReturnObject }{@code >}
     *     
     */
    public void setGetFilter4Result(JAXBElement<ArrayOfReturnObject> value) {
        this.getFilter4Result = value;
    }

}
