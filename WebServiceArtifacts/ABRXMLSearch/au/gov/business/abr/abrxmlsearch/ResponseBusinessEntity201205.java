
package au.gov.business.abr.abrxmlsearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseBusinessEntity201205 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseBusinessEntity201205">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}ResponseBusinessEntity200709">
 *       &lt;sequence>
 *         &lt;element name="businessName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBusinessEntity201205", propOrder = {
    "businessName"
})
public class ResponseBusinessEntity201205
    extends ResponseBusinessEntity200709
{

    @XmlElement(nillable = true)
    protected List<OrganisationName> businessName;

    /**
     * Gets the value of the businessName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationName }
     * 
     * 
     */
    public List<OrganisationName> getBusinessName() {
        if (businessName == null) {
            businessName = new ArrayList<OrganisationName>();
        }
        return this.businessName;
    }

}
