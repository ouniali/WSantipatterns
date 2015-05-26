
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
 *         &lt;element name="GetFilter3Result" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}ArrayOfReturnObject" minOccurs="0"/>
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
    "getFilter3Result"
})
@XmlRootElement(name = "GetFilter3Response")
public class GetFilter3Response {

    @XmlElementRef(name = "GetFilter3Result", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReturnObject> getFilter3Result;

    /**
     * Gets the value of the getFilter3Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReturnObject }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReturnObject> getGetFilter3Result() {
        return getFilter3Result;
    }

    /**
     * Sets the value of the getFilter3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReturnObject }{@code >}
     *     
     */
    public void setGetFilter3Result(JAXBElement<ArrayOfReturnObject> value) {
        this.getFilter3Result = value;
    }

}
