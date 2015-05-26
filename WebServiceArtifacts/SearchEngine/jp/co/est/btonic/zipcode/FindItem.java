
package jp.co.est.btonic.zipcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OldZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Yomi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kanji" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindItem", propOrder = {
    "oldZipCode",
    "zipCode",
    "yomi",
    "kanji"
})
public class FindItem {

    @XmlElement(name = "OldZipCode")
    protected String oldZipCode;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "Yomi")
    protected String yomi;
    @XmlElement(name = "Kanji")
    protected String kanji;

    /**
     * Gets the value of the oldZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldZipCode() {
        return oldZipCode;
    }

    /**
     * Sets the value of the oldZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldZipCode(String value) {
        this.oldZipCode = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the yomi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYomi() {
        return yomi;
    }

    /**
     * Sets the value of the yomi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYomi(String value) {
        this.yomi = value;
    }

    /**
     * Gets the value of the kanji property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKanji() {
        return kanji;
    }

    /**
     * Sets the value of the kanji property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKanji(String value) {
        this.kanji = value;
    }

}
