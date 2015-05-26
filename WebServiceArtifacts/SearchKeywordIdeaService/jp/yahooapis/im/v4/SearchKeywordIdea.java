
package jp.yahooapis.im.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchKeywordIdea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchKeywordIdea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchKeywordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="searchKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desktopSearchVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="smartPhoneSearchVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tabletSearchVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchKeywordIdea", propOrder = {
    "searchKeywordId",
    "searchKeyword",
    "desktopSearchVolume",
    "smartPhoneSearchVolume",
    "tabletSearchVolume"
})
public class SearchKeywordIdea {

    protected Long searchKeywordId;
    protected String searchKeyword;
    protected Long desktopSearchVolume;
    protected Long smartPhoneSearchVolume;
    protected Long tabletSearchVolume;

    /**
     * Gets the value of the searchKeywordId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSearchKeywordId() {
        return searchKeywordId;
    }

    /**
     * Sets the value of the searchKeywordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSearchKeywordId(Long value) {
        this.searchKeywordId = value;
    }

    /**
     * Gets the value of the searchKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchKeyword() {
        return searchKeyword;
    }

    /**
     * Sets the value of the searchKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchKeyword(String value) {
        this.searchKeyword = value;
    }

    /**
     * Gets the value of the desktopSearchVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDesktopSearchVolume() {
        return desktopSearchVolume;
    }

    /**
     * Sets the value of the desktopSearchVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDesktopSearchVolume(Long value) {
        this.desktopSearchVolume = value;
    }

    /**
     * Gets the value of the smartPhoneSearchVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSmartPhoneSearchVolume() {
        return smartPhoneSearchVolume;
    }

    /**
     * Sets the value of the smartPhoneSearchVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSmartPhoneSearchVolume(Long value) {
        this.smartPhoneSearchVolume = value;
    }

    /**
     * Gets the value of the tabletSearchVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTabletSearchVolume() {
        return tabletSearchVolume;
    }

    /**
     * Sets the value of the tabletSearchVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTabletSearchVolume(Long value) {
        this.tabletSearchVolume = value;
    }

}
