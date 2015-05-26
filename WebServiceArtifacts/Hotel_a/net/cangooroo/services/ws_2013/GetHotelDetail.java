
package net.cangooroo.services.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import clientcredential.ws_2013.ClientCredential;


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
 *         &lt;element name="credential" type="{WS_2013.ClientCredential}ClientCredential" minOccurs="0"/>
 *         &lt;element name="hotelID" type="{http://ws_2013.services.cangooroo.net/}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="descriptionLangISO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "credential",
    "hotelID",
    "descriptionLangISO"
})
@XmlRootElement(name = "getHotelDetail")
public class GetHotelDetail {

    protected ClientCredential credential;
    protected ArrayOfInt hotelID;
    protected String descriptionLangISO;

    /**
     * Gets the value of the credential property.
     * 
     * @return
     *     possible object is
     *     {@link ClientCredential }
     *     
     */
    public ClientCredential getCredential() {
        return credential;
    }

    /**
     * Sets the value of the credential property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientCredential }
     *     
     */
    public void setCredential(ClientCredential value) {
        this.credential = value;
    }

    /**
     * Gets the value of the hotelID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getHotelID() {
        return hotelID;
    }

    /**
     * Sets the value of the hotelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setHotelID(ArrayOfInt value) {
        this.hotelID = value;
    }

    /**
     * Gets the value of the descriptionLangISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionLangISO() {
        return descriptionLangISO;
    }

    /**
     * Sets the value of the descriptionLangISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionLangISO(String value) {
        this.descriptionLangISO = value;
    }

}
