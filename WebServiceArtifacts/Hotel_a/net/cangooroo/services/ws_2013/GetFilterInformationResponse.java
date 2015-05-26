
package net.cangooroo.services.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import hotel.ws_2013.cangooroo.SearchFilterInformationResponse;


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
 *         &lt;element name="getFilterInformationResult" type="{Cangooroo.WS_2013.Hotel}SearchFilterInformationResponse" minOccurs="0"/>
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
    "getFilterInformationResult"
})
@XmlRootElement(name = "getFilterInformationResponse")
public class GetFilterInformationResponse {

    protected SearchFilterInformationResponse getFilterInformationResult;

    /**
     * Gets the value of the getFilterInformationResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchFilterInformationResponse }
     *     
     */
    public SearchFilterInformationResponse getGetFilterInformationResult() {
        return getFilterInformationResult;
    }

    /**
     * Sets the value of the getFilterInformationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFilterInformationResponse }
     *     
     */
    public void setGetFilterInformationResult(SearchFilterInformationResponse value) {
        this.getFilterInformationResult = value;
    }

}
