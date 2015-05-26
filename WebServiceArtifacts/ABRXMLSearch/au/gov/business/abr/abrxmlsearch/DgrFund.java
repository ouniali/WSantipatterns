
package au.gov.business.abr.abrxmlsearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DgrFund complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DgrFund">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dgrFundName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationSimpleName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="endorsedFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="endorsedTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DgrFund", propOrder = {
    "dgrFundName",
    "endorsedFrom",
    "endorsedTo"
})
@XmlSeeAlso({
    DgrFundAndItemNumber.class
})
public class DgrFund {

    protected List<OrganisationSimpleName> dgrFundName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endorsedFrom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endorsedTo;

    /**
     * Gets the value of the dgrFundName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dgrFundName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgrFundName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationSimpleName }
     * 
     * 
     */
    public List<OrganisationSimpleName> getDgrFundName() {
        if (dgrFundName == null) {
            dgrFundName = new ArrayList<OrganisationSimpleName>();
        }
        return this.dgrFundName;
    }

    /**
     * Gets the value of the endorsedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndorsedFrom() {
        return endorsedFrom;
    }

    /**
     * Sets the value of the endorsedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndorsedFrom(XMLGregorianCalendar value) {
        this.endorsedFrom = value;
    }

    /**
     * Gets the value of the endorsedTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndorsedTo() {
        return endorsedTo;
    }

    /**
     * Sets the value of the endorsedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndorsedTo(XMLGregorianCalendar value) {
        this.endorsedTo = value;
    }

}
