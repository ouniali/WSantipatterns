
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
 *         &lt;element name="FromOldZipCodeResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "fromOldZipCodeResult",
    "searchResult"
})
@XmlRootElement(name = "FromOldZipCodeResponse")
public class FromOldZipCodeResponse {

    @XmlElement(name = "FromOldZipCodeResult")
    protected boolean fromOldZipCodeResult;
    @XmlElement(name = "SearchResult")
    protected FindList searchResult;

    /**
     * Gets the value of the fromOldZipCodeResult property.
     * 
     */
    public boolean isFromOldZipCodeResult() {
        return fromOldZipCodeResult;
    }

    /**
     * Sets the value of the fromOldZipCodeResult property.
     * 
     */
    public void setFromOldZipCodeResult(boolean value) {
        this.fromOldZipCodeResult = value;
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
