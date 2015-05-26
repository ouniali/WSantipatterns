
package ro.bvb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyAddress" type="{http://www.bvb.ro}Address" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Web" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="President" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Caen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaenDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Caen_Rev2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Caen_Rev2Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyInfo", propOrder = {
    "companyName",
    "fiscalCode",
    "registryCode",
    "companyAddress",
    "phone",
    "fax",
    "web",
    "email",
    "president",
    "caen",
    "caenDescription",
    "caenRev2",
    "caenRev2Description"
})
public class CompanyInfo {

    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "FiscalCode")
    protected String fiscalCode;
    @XmlElement(name = "RegistryCode")
    protected String registryCode;
    @XmlElement(name = "CompanyAddress")
    protected Address companyAddress;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Web")
    protected String web;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "President")
    protected String president;
    @XmlElement(name = "Caen")
    protected String caen;
    @XmlElement(name = "CaenDescription")
    protected String caenDescription;
    @XmlElement(name = "Caen_Rev2")
    protected String caenRev2;
    @XmlElement(name = "Caen_Rev2Description")
    protected String caenRev2Description;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the fiscalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalCode() {
        return fiscalCode;
    }

    /**
     * Sets the value of the fiscalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalCode(String value) {
        this.fiscalCode = value;
    }

    /**
     * Gets the value of the registryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryCode() {
        return registryCode;
    }

    /**
     * Sets the value of the registryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryCode(String value) {
        this.registryCode = value;
    }

    /**
     * Gets the value of the companyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getCompanyAddress() {
        return companyAddress;
    }

    /**
     * Sets the value of the companyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setCompanyAddress(Address value) {
        this.companyAddress = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the web property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeb() {
        return web;
    }

    /**
     * Sets the value of the web property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeb(String value) {
        this.web = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the president property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresident() {
        return president;
    }

    /**
     * Sets the value of the president property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresident(String value) {
        this.president = value;
    }

    /**
     * Gets the value of the caen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaen() {
        return caen;
    }

    /**
     * Sets the value of the caen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaen(String value) {
        this.caen = value;
    }

    /**
     * Gets the value of the caenDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaenDescription() {
        return caenDescription;
    }

    /**
     * Sets the value of the caenDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaenDescription(String value) {
        this.caenDescription = value;
    }

    /**
     * Gets the value of the caenRev2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaenRev2() {
        return caenRev2;
    }

    /**
     * Sets the value of the caenRev2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaenRev2(String value) {
        this.caenRev2 = value;
    }

    /**
     * Gets the value of the caenRev2Description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaenRev2Description() {
        return caenRev2Description;
    }

    /**
     * Sets the value of the caenRev2Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaenRev2Description(String value) {
        this.caenRev2Description = value;
    }

}
