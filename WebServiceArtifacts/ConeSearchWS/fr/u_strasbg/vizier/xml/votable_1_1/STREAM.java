
package fr.u_strasbg.vizier.xml.votable_1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for STREAM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STREAM">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="type" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}STREAMType" default="locator" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="actuate" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}STREAMActuate" default="onRequest" />
 *       &lt;attribute name="encoding" type="{http://vizier.u-strasbg.fr/xml/VOTable-1.1.xsd}encodingType" default="none" />
 *       &lt;attribute name="expires" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="rights" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STREAM", propOrder = {
    "value"
})
public class STREAM {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "type")
    protected STREAMType type;
    @XmlAttribute(name = "href")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "actuate")
    protected STREAMActuate actuate;
    @XmlAttribute(name = "encoding")
    protected EncodingType encoding;
    @XmlAttribute(name = "expires")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expires;
    @XmlAttribute(name = "rights")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String rights;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link STREAMType }
     *     
     */
    public STREAMType getType() {
        if (type == null) {
            return STREAMType.LOCATOR;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link STREAMType }
     *     
     */
    public void setType(STREAMType value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link STREAMActuate }
     *     
     */
    public STREAMActuate getActuate() {
        if (actuate == null) {
            return STREAMActuate.ON_REQUEST;
        } else {
            return actuate;
        }
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link STREAMActuate }
     *     
     */
    public void setActuate(STREAMActuate value) {
        this.actuate = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link EncodingType }
     *     
     */
    public EncodingType getEncoding() {
        if (encoding == null) {
            return EncodingType.NONE;
        } else {
            return encoding;
        }
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncodingType }
     *     
     */
    public void setEncoding(EncodingType value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the expires property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpires() {
        return expires;
    }

    /**
     * Sets the value of the expires property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpires(XMLGregorianCalendar value) {
        this.expires = value;
    }

    /**
     * Gets the value of the rights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRights() {
        return rights;
    }

    /**
     * Sets the value of the rights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRights(String value) {
        this.rights = value;
    }

}
