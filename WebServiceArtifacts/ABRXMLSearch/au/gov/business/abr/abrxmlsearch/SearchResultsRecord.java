
package au.gov.business.abr.abrxmlsearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResultsRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResultsRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ABN" type="{http://abr.business.gov.au/ABRXMLSearch/}IdentifierSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="mainName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationSimpleName" minOccurs="0"/>
 *           &lt;element name="legalName" type="{http://abr.business.gov.au/ABRXMLSearch/}IndividualSimpleName" minOccurs="0"/>
 *           &lt;element name="PBIEName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationSimpleName" minOccurs="0"/>
 *           &lt;element name="mainTradingName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationSimpleName" minOccurs="0"/>
 *           &lt;element name="otherTradingName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationSimpleName" minOccurs="0"/>
 *           &lt;element name="AWEFName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationSimpleName" minOccurs="0"/>
 *           &lt;element name="dgrFundName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationSimpleName" minOccurs="0"/>
 *           &lt;element name="businessName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationSimpleName" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="mainBusinessPhysicalAddress" type="{http://abr.business.gov.au/ABRXMLSearch/}AddressSimple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResultsRecord", propOrder = {
    "abn",
    "mainNameOrLegalNameOrPBIEName",
    "mainBusinessPhysicalAddress"
})
public class SearchResultsRecord {

    @XmlElement(name = "ABN")
    protected List<IdentifierSummary> abn;
    @XmlElementRefs({
        @XmlElementRef(name = "otherTradingName", namespace = "http://abr.business.gov.au/ABRXMLSearch/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PBIEName", namespace = "http://abr.business.gov.au/ABRXMLSearch/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dgrFundName", namespace = "http://abr.business.gov.au/ABRXMLSearch/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "legalName", namespace = "http://abr.business.gov.au/ABRXMLSearch/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mainTradingName", namespace = "http://abr.business.gov.au/ABRXMLSearch/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mainName", namespace = "http://abr.business.gov.au/ABRXMLSearch/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "businessName", namespace = "http://abr.business.gov.au/ABRXMLSearch/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AWEFName", namespace = "http://abr.business.gov.au/ABRXMLSearch/", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> mainNameOrLegalNameOrPBIEName;
    @XmlElement(nillable = true)
    protected List<AddressSimple> mainBusinessPhysicalAddress;

    /**
     * Gets the value of the abn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getABN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierSummary }
     * 
     * 
     */
    public List<IdentifierSummary> getABN() {
        if (abn == null) {
            abn = new ArrayList<IdentifierSummary>();
        }
        return this.abn;
    }

    /**
     * Gets the value of the mainNameOrLegalNameOrPBIEName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainNameOrLegalNameOrPBIEName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainNameOrLegalNameOrPBIEName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OrganisationSimpleName }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationSimpleName }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationSimpleName }{@code >}
     * {@link JAXBElement }{@code <}{@link IndividualSimpleName }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationSimpleName }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationSimpleName }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationSimpleName }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationSimpleName }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getMainNameOrLegalNameOrPBIEName() {
        if (mainNameOrLegalNameOrPBIEName == null) {
            mainNameOrLegalNameOrPBIEName = new ArrayList<JAXBElement<?>>();
        }
        return this.mainNameOrLegalNameOrPBIEName;
    }

    /**
     * Gets the value of the mainBusinessPhysicalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainBusinessPhysicalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainBusinessPhysicalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressSimple }
     * 
     * 
     */
    public List<AddressSimple> getMainBusinessPhysicalAddress() {
        if (mainBusinessPhysicalAddress == null) {
            mainBusinessPhysicalAddress = new ArrayList<AddressSimple>();
        }
        return this.mainBusinessPhysicalAddress;
    }

}
