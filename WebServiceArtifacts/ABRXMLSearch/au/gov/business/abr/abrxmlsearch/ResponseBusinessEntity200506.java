
package au.gov.business.abr.abrxmlsearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseBusinessEntity200506 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseBusinessEntity200506">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}ResponseBusinessEntity">
 *       &lt;sequence>
 *         &lt;element name="charityType" type="{http://abr.business.gov.au/ABRXMLSearch/}CharityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taxConcessionCharityEndorsement" type="{http://abr.business.gov.au/ABRXMLSearch/}CharityConcession" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="publicBenevolentInstitutionEmployer" type="{http://abr.business.gov.au/ABRXMLSearch/}CharitableFund" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBusinessEntity200506", propOrder = {
    "charityType",
    "taxConcessionCharityEndorsement",
    "publicBenevolentInstitutionEmployer"
})
@XmlSeeAlso({
    ResponseBusinessEntity200709 .class
})
public class ResponseBusinessEntity200506
    extends ResponseBusinessEntity
{

    @XmlElement(nillable = true)
    protected List<CharityType> charityType;
    @XmlElement(nillable = true)
    protected List<CharityConcession> taxConcessionCharityEndorsement;
    @XmlElement(nillable = true)
    protected List<CharitableFund> publicBenevolentInstitutionEmployer;

    /**
     * Gets the value of the charityType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charityType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharityType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharityType }
     * 
     * 
     */
    public List<CharityType> getCharityType() {
        if (charityType == null) {
            charityType = new ArrayList<CharityType>();
        }
        return this.charityType;
    }

    /**
     * Gets the value of the taxConcessionCharityEndorsement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxConcessionCharityEndorsement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxConcessionCharityEndorsement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharityConcession }
     * 
     * 
     */
    public List<CharityConcession> getTaxConcessionCharityEndorsement() {
        if (taxConcessionCharityEndorsement == null) {
            taxConcessionCharityEndorsement = new ArrayList<CharityConcession>();
        }
        return this.taxConcessionCharityEndorsement;
    }

    /**
     * Gets the value of the publicBenevolentInstitutionEmployer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicBenevolentInstitutionEmployer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicBenevolentInstitutionEmployer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharitableFund }
     * 
     * 
     */
    public List<CharitableFund> getPublicBenevolentInstitutionEmployer() {
        if (publicBenevolentInstitutionEmployer == null) {
            publicBenevolentInstitutionEmployer = new ArrayList<CharitableFund>();
        }
        return this.publicBenevolentInstitutionEmployer;
    }

}
