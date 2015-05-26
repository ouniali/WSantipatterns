
package jp.co.est.btonic.zipcode;

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
 *         &lt;element name="FromAddressResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SearchResult" type="{http://btonic.est.co.jp/zipcode/}FindList" minOccurs="0"/>
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
    "fromAddressResult",
    "searchResult"
})
@XmlRootElement(name = "FromAddressResponse")
public class FromAddressResponse {

    @XmlElement(name = "FromAddressResult")
    protected boolean fromAddressResult;
    @XmlElement(name = "SearchResult")
    protected FindList searchResult;

    /**
     * Gets the value of the fromAddressResult property.
     * 
     */
    public boolean isFromAddressResult() {
        return fromAddressResult;
    }

    /**
     * Sets the value of the fromAddressResult property.
     * 
     */
    public void setFromAddressResult(boolean value) {
        this.fromAddressResult = value;
    }

    /**
     * Gets the value of the searchResult property.
     * 
     * @return
     *     possible object is
     *     {@link FindList }
     *     
     */
    public FindList getSearchResult() {
        return searchResult;
    }

    /**
     * Sets the value of the searchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindList }
     *     
     */
    public void setSearchResult(FindList value) {
        this.searchResult = value;
    }

}
