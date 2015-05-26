
package linjegodswebservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for POD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsignmentNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="URIToTiffImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POD", propOrder = {
    "consignmentNo",
    "documentType",
    "regDT",
    "uriToTiffImage"
})
public class POD {

    @XmlElement(name = "ConsignmentNo")
    protected String consignmentNo;
    @XmlElement(name = "DocumentType")
    protected String documentType;
    @XmlElement(name = "RegDT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDT;
    @XmlElement(name = "URIToTiffImage")
    protected String uriToTiffImage;

    /**
     * Gets the value of the consignmentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignmentNo() {
        return consignmentNo;
    }

    /**
     * Sets the value of the consignmentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignmentNo(String value) {
        this.consignmentNo = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the regDT property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDT() {
        return regDT;
    }

    /**
     * Sets the value of the regDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDT(XMLGregorianCalendar value) {
        this.regDT = value;
    }

    /**
     * Gets the value of the uriToTiffImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURIToTiffImage() {
        return uriToTiffImage;
    }

    /**
     * Sets the value of the uriToTiffImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURIToTiffImage(String value) {
        this.uriToTiffImage = value;
    }

}
