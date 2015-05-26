
package org.datacontract.schemas._2004._07.mouzenidis_services_objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelCategory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}DictionaryBase">
 *       &lt;sequence>
 *         &lt;element name="CodeGlobalLat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelCategory", propOrder = {
    "codeGlobalLat"
})
public class HotelCategory
    extends DictionaryBase
{

    @XmlElementRef(name = "CodeGlobalLat", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeGlobalLat;

    /**
     * Gets the value of the codeGlobalLat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeGlobalLat() {
        return codeGlobalLat;
    }

    /**
     * Sets the value of the codeGlobalLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeGlobalLat(JAXBElement<String> value) {
        this.codeGlobalLat = value;
    }

}
