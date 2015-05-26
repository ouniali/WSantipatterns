
package au.gov.business.abr.abrxmlsearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ResponseBusinessEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseBusinessEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}ResponseBody">
 *       &lt;sequence>
 *         &lt;element name="recordLastUpdatedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ABN" type="{http://abr.business.gov.au/ABRXMLSearch/}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entityStatus" type="{http://abr.business.gov.au/ABRXMLSearch/}EntityStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ASICNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityType" type="{http://abr.business.gov.au/ABRXMLSearch/}EntityType"/>
 *         &lt;element name="goodsAndServicesTax" type="{http://abr.business.gov.au/ABRXMLSearch/}GoodsAndServicesTax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dgrEndorsement" type="{http://abr.business.gov.au/ABRXMLSearch/}DGREndorsement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="legalName" type="{http://abr.business.gov.au/ABRXMLSearch/}IndividualName" minOccurs="0"/>
 *           &lt;element name="mainName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationName" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="mainTradingName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherTradingName" type="{http://abr.business.gov.au/ABRXMLSearch/}OrganisationName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mainBusinessPhysicalAddress" type="{http://abr.business.gov.au/ABRXMLSearch/}AddressDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dgrFund" type="{http://abr.business.gov.au/ABRXMLSearch/}DgrFund" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBusinessEntity", propOrder = {
    "recordLastUpdatedDate",
    "abn",
    "entityStatus",
    "asicNumber",
    "entityType",
    "goodsAndServicesTax",
    "dgrEndorsement",
    "legalNameOrMainName",
    "mainTradingName",
    "otherTradingName",
    "mainBusinessPhysicalAddress",
    "dgrFund"
})
@XmlSeeAlso({
    ResponseBusinessEntity200506 .class
})
public class ResponseBusinessEntity
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
    protected List<DGREndorsement> dgrEndorsement;
    @XmlElements({
        @XmlElement(name = "legalName", type = IndividualName.class),
        @XmlElement(name = "mainName", type = OrganisationName.class)
    })
    protected List<Object> legalNameOrMainName;
    @XmlElement(nillable = true)
    protected List<OrganisationName> mainTradingName;
    @XmlElement(nillable = true)
    protected List<OrganisationName> otherTradingName;
    @XmlElement(nillable = true)
    protected List<AddressDetails> mainBusinessPhysicalAddress;
    @XmlElement(nillable = true)
    protected List<DgrFund> dgrFund;

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
     * {@link DGREndorsement }
     * 
     * 
     */
    public List<DGREndorsement> getDgrEndorsement() {
        if (dgrEndorsement == null) {
            dgrEndorsement = new ArrayList<DGREndorsement>();
        }
        return this.dgrEndorsement;
    }

    /**
     * Gets the value of the legalNameOrMainName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legalNameOrMainName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalNameOrMainName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualName }
     * {@link OrganisationName }
     * 
     * 
     */
    public List<Object> getLegalNameOrMainName() {
        if (legalNameOrMainName == null) {
            legalNameOrMainName = new ArrayList<Object>();
        }
        return this.legalNameOrMainName;
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
     * {@link DgrFund }
     * 
     * 
     */
    public List<DgrFund> getDgrFund() {
        if (dgrFund == null) {
            dgrFund = new ArrayList<DgrFund>();
        }
        return this.dgrFund;
    }

}
