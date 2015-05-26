
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyValueResponseOfNomenclatureID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyValueResponseOfNomenclatureID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameValues" type="{https://NewHotel/Web/Services/}ArrayOfNameValueResponse" minOccurs="0"/>
 *         &lt;element name="Data" type="{https://NewHotel/Web/Services/}ArrayOfKeyValueIDResponseOfNomenclatureID" minOccurs="0"/>
 *         &lt;element name="Children" type="{https://NewHotel/Web/Services/}ArrayOfKeyValueIDCollectionResponseOfNomenclatureID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValueResponseOfNomenclatureID", propOrder = {
    "key",
    "code",
    "value",
    "comment",
    "nameValues",
    "data",
    "children"
})
@XmlSeeAlso({
    KeyValueIDResponseOfNomenclatureID.class
})
public class KeyValueResponseOfNomenclatureID {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "NameValues")
    protected ArrayOfNameValueResponse nameValues;
    @XmlElement(name = "Data")
    protected ArrayOfKeyValueIDResponseOfNomenclatureID data;
    @XmlElement(name = "Children")
    protected ArrayOfKeyValueIDCollectionResponseOfNomenclatureID children;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the nameValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNameValueResponse }
     *     
     */
    public ArrayOfNameValueResponse getNameValues() {
        return nameValues;
    }

    /**
     * Sets the value of the nameValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNameValueResponse }
     *     
     */
    public void setNameValues(ArrayOfNameValueResponse value) {
        this.nameValues = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueIDResponseOfNomenclatureID }
     *     
     */
    public ArrayOfKeyValueIDResponseOfNomenclatureID getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueIDResponseOfNomenclatureID }
     *     
     */
    public void setData(ArrayOfKeyValueIDResponseOfNomenclatureID value) {
        this.data = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueIDCollectionResponseOfNomenclatureID }
     *     
     */
    public ArrayOfKeyValueIDCollectionResponseOfNomenclatureID getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueIDCollectionResponseOfNomenclatureID }
     *     
     */
    public void setChildren(ArrayOfKeyValueIDCollectionResponseOfNomenclatureID value) {
        this.children = value;
    }

}
