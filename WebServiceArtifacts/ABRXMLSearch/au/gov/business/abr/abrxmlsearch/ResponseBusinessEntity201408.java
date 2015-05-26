
package au.gov.business.abr.abrxmlsearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ResponseBusinessEntity201408 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseBusinessEntity201408">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}ResponseBody">
 *       &lt;sequence>
 *         &lt;element name="recordLastUpdatedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ABN" type="{http://abr.business.gov.au/ABRXMLSearch/}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entityStatus" type="{http://abr.business.gov.au/ABRXMLSearch/}EntityStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ASICNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityType" type="{http://abr.business.gov.au/ABRXMLSearch/}EntityType"/>
 *         &lt;element name="goodsAndServicesTax" type="{http://abr.business.gov.au/ABRXMLSearch/}GoodsAndServicesTax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dgrEndorsement" type="{http://abr.business.gov.au/ABRXMLSearch/}DgrEndorsementAndItemNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="mainName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationName" minOccurs="0"/>
 *           &lt;element name="legalName" type="{http://abr.business.gov.au/ABRXMLSearch/}IndividualName" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="mainTradingName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherTradingName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mainBusinessPhysicalAddress" type="{http://abr.business.gov.au/ABRXMLSearch/}AddressDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dgrFund" type="{http://abr.business.gov.au/ABRXMLSearch/}DgrFundAndItemNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="charityType" type="{http://abr.business.gov.au/ABRXMLSearch/}CharityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taxConcessionCharityEndorsement" type="{http://abr.business.gov.au/ABRXMLSearch/}CharityConcession" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="publicBenevolentInstitutionEmployer" type="{http://abr.business.gov.au/ABRXMLSearch/}CharitableFund" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="superannuationStatus" type="{http://abr.business.gov.au/ABRXMLSearch/}SuperannuationStatus" minOccurs="0"/>
 *         &lt;element name="mainPostalPhysicalAddress" type="{http://abr.business.gov.au/ABRXMLSearch/}AddressFull" minOccurs="0"/>
 *         &lt;element name="businessName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ACNCRegistration" type="{http://abr.business.gov.au/ABRXMLSearch/}Registration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBusinessEntity201408", propOrder = {
    "recordLastUpdatedDate",
    "abn",
    "entityStatus",
    "asicNumber",
    "entityType",
    "goodsAndServicesTax",
    "dgrEndorsement",
    "mainNameOrLegalName",
    "mainTradingName",
    "otherTradingName",
    "mainBusinessPhysicalAddress",
    "dgrFund",
    "charityType",
    "taxConcessionCharityEndorsement",
    "publicBenevolentInstitutionEmployer",
    "superannuationStatus",
    "mainPostalPhysicalAddress",
    "businessName",
    "acncRegistration"
})
public class ResponseBusinessEntity201408
    extends ResponseBody
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recordLastUpdatedDate;
    @XmlElement(name = "ABN")
    protected List<Identifier> abn;
    protected List<EntityStatus> entityStatus;
    @XmlElement(name = "ASICNumber")
    protected String asicNumber;
    @XmlElement(required = true, nillable = true)
    protected EntityType entityType;
    @XmlElement(nillable = true)
    protected List<GoodsAndServicesTax> goodsAndServicesTax;
    @XmlElement(nillable = true)
    protected List<DgrEndorsementAndItemNumber> dgrEndorsement;
    @XmlElements({
        @XmlElement(name = "mainName", type = OrganisationName.class),
        @XmlElement(name = "legalName", type = IndividualName.class)
    })
    protected List<Object> mainNameOrLegalName;
    @XmlElement(nillable = true)
    protected List<OrganisationName> mainTradingName;
    @XmlElement(nillable = true)
    protected List<OrganisationName> otherTradingName;
    @XmlElement(nillable = true)
    protected List<AddressDetails> mainBusinessPhysicalAddress;
    @XmlElement(nillable = true)
    protected List<DgrFundAndItemNumber> dgrFund;
    @XmlElement(nillable = true)
    protected List<CharityType> charityType;
    @XmlElement(nillable = true)
    protected List<CharityConcession> taxConcessionCharityEndorsement;
    @XmlElement(nillable = true)
    protected List<CharitableFund> publicBenevolentInstitutionEmployer;
    protected SuperannuationStatus superannuationStatus;
    protected AddressFull mainPostalPhysicalAddress;
    @XmlElement(nillable = true)
    protected List<OrganisationName> businessName;
    @XmlElement(name = "ACNCRegistration")
    protected List<Registration> acncRegistration;

    /**
     * Gets the value of the recordLastUpdatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecordLastUpdatedDate() {
        return recordLastUpdatedDate;
    }

    /**
     * Sets the value of the recordLastUpdatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecordLastUpdatedDate(XMLGregorianCalendar value) {
        this.recordLastUpdatedDate = value;
    }

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
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getABN() {
        if (abn == null) {
            abn = new ArrayList<Identifier>();
        }
        return this.abn;
    }

    /**
     * Gets the value of the entityStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityStatus }
     * 
     * 
     */
    public List<EntityStatus> getEntityStatus() {
        if (entityStatus == null) {
            entityStatus = new ArrayList<EntityStatus>();
        }
        return this.entityStatus;
    }

    /**
     * Gets the value of the asicNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASICNumber() {
        return asicNumber;
    }

    /**
     * Sets the value of the asicNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASICNumber(String value) {
        this.asicNumber = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setEntityType(EntityType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the goodsAndServicesTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsAndServicesTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsAndServicesTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsAndServicesTax }
     * 
     * 
     */
    public List<GoodsAndServicesTax> getGoodsAndServicesTax() {
        if (goodsAndServicesTax == null) {
            goodsAndServicesTax = new ArrayList<GoodsAndServicesTax>();
        }
        return this.goodsAndServicesTax;
    }

    /**
     * Gets the value of the dgrEndorsement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dgrEndorsement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgrEndorsement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DgrEndorsementAndItemNumber }
     * 
     * 
     */
    public List<DgrEndorsementAndItemNumber> getDgrEndorsement() {
        if (dgrEndorsement == null) {
            dgrEndorsement = new ArrayList<DgrEndorsementAndItemNumber>();
        }
        return this.dgrEndorsement;
    }

    /**
     * Gets the value of the mainNameOrLegalName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainNameOrLegalName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainNameOrLegalName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationName }
     * {@link IndividualName }
     * 
     * 
     */
    public List<Object> getMainNameOrLegalName() {
        if (mainNameOrLegalName == null) {
            mainNameOrLegalName = new ArrayList<Object>();
        }
        return this.mainNameOrLegalName;
    }

    /**
     * Gets the value of the mainTradingName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainTradingName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainTradingName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationName }
     * 
     * 
     */
    public List<OrganisationName> getMainTradingName() {
        if (mainTradingName == null) {
            mainTradingName = new ArrayList<OrganisationName>();
        }
        return this.mainTradingName;
    }

    /**
     * Gets the value of the otherTradingName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherTradingName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherTradingName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationName }
     * 
     * 
     */
    public List<OrganisationName> getOtherTradingName() {
        if (otherTradingName == null) {
            otherTradingName = new ArrayList<OrganisationName>();
        }
        return this.otherTradingName;
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
     * {@link AddressDetails }
     * 
     * 
     */
    public List<AddressDetails> getMainBusinessPhysicalAddress() {
        if (mainBusinessPhysicalAddress == null) {
            mainBusinessPhysicalAddress = new ArrayList<AddressDetails>();
        }
        return this.mainBusinessPhysicalAddress;
    }

    /**
     * Gets the value of the dgrFund property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dgrFund property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgrFund().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DgrFundAndItemNumber }
     * 
     * 
     */
    public List<DgrFundAndItemNumber> getDgrFund() {
        if (dgrFund == null) {
            dgrFund = new ArrayList<DgrFundAndItemNumber>();
        }
        return this.dgrFund;
    }

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

    /**
     * Gets the value of the superannuationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SuperannuationStatus }
     *     
     */
    public SuperannuationStatus getSuperannuationStatus() {
        return superannuationStatus;
    }

    /**
     * Sets the value of the superannuationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuperannuationStatus }
     *     
     */
    public void setSuperannuationStatus(SuperannuationStatus value) {
        this.superannuationStatus = value;
    }

    /**
     * Gets the value of the mainPostalPhysicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressFull }
     *     
     */
    public AddressFull getMainPostalPhysicalAddress() {
        return mainPostalPhysicalAddress;
    }

    /**
     * Sets the value of the mainPostalPhysicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressFull }
     *     
     */
    public void setMainPostalPhysicalAddress(AddressFull value) {
        this.mainPostalPhysicalAddress = value;
    }

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

    /**
     * Gets the value of the acncRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acncRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACNCRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Registration }
     * 
     * 
     */
    public List<Registration> getACNCRegistration() {
        if (acncRegistration == null) {
            acncRegistration = new ArrayList<Registration>();
        }
        return this.acncRegistration;
    }

}
