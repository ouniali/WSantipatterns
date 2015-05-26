
package org.diacomp.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ObjectHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.diacomp.org/webservices/}Object">
 *       &lt;sequence>
 *         &lt;element name="CreationID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="LastModifyID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectHistory", propOrder = {
    "creationID",
    "lastModifyID",
    "creationDate",
    "lastModifyDate"
})
public class ObjectHistory
    extends Object
{

    @XmlElement(name = "CreationID", required = true)
    protected ID creationID;
    @XmlElement(name = "LastModifyID", required = true)
    protected ID lastModifyID;
    @XmlElement(name = "CreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastModifyDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDate;

    /**
     * Gets the value of the creationID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getCreationID() {
        return creationID;
    }

    /**
     * Sets the value of the creationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setCreationID(ID value) {
        this.creationID = value;
    }

    /**
     * Gets the value of the lastModifyID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getLastModifyID() {
        return lastModifyID;
    }

    /**
     * Sets the value of the lastModifyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setLastModifyID(ID value) {
        this.lastModifyID = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the lastModifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifyDate() {
        return lastModifyDate;
    }

    /**
     * Sets the value of the lastModifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifyDate(XMLGregorianCalendar value) {
        this.lastModifyDate = value;
    }

}
