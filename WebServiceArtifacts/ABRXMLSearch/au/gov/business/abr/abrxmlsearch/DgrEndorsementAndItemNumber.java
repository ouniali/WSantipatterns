
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DgrEndorsementAndItemNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DgrEndorsementAndItemNumber">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}DGREndorsement">
 *       &lt;sequence>
 *         &lt;element name="entityEndorsement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DgrEndorsementAndItemNumber", propOrder = {
    "entityEndorsement",
    "itemNumber"
})
public class DgrEndorsementAndItemNumber
    extends DGREndorsement
{

    protected String entityEndorsement;
    protected String itemNumber;

    /**
     * Gets the value of the entityEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityEndorsement() {
        return entityEndorsement;
    }

    /**
     * Sets the value of the entityEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityEndorsement(String value) {
        this.entityEndorsement = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumber(String value) {
        this.itemNumber = value;
    }

}
