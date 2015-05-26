
package travel.whl.api.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The ContactInfo class is used to define the contacts for consumers and technical people at the hotel facility, including various telephone numbers and e-mail addresses, or any respective attribute or affiliation for the hotel.
 * 
 * <p>Java class for ContactInfoRootType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoRootType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.whl.travel/soap}ContactInfoType">
 *       &lt;attribute name="ContactProfileID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ContactProfileType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoRootType")
public class ContactInfoRootType
    extends ContactInfoType
{

    @XmlAttribute(name = "ContactProfileID")
    protected String contactProfileID;
    @XmlAttribute(name = "ContactProfileType")
    protected String contactProfileType;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;

    /**
     * Gets the value of the contactProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactProfileID() {
        return contactProfileID;
    }

    /**
     * Sets the value of the contactProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactProfileID(String value) {
        this.contactProfileID = value;
    }

    /**
     * Gets the value of the contactProfileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactProfileType() {
        return contactProfileType;
    }

    /**
     * Sets the value of the contactProfileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactProfileType(String value) {
        this.contactProfileType = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

}
