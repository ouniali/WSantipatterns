
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceMapping">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GeneralMapping">
 *       &lt;attribute name="SectionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SectionName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccountType" type="{http://www.opentravel.org/OTA/2003/05}EAccountType" />
 *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}AdditionalEntryType" />
 *       &lt;attribute name="Daily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceMapping")
public class ServiceMapping
    extends GeneralMapping
{

    @XmlAttribute(name = "SectionCode")
    protected String sectionCode;
    @XmlAttribute(name = "ServiceCode")
    protected String serviceCode;
    @XmlAttribute(name = "SectionName")
    protected String sectionName;
    @XmlAttribute(name = "ServiceName")
    protected String serviceName;
    @XmlAttribute(name = "AccountType")
    protected EAccountType accountType;
    @XmlAttribute(name = "Type")
    protected AdditionalEntryType type;
    @XmlAttribute(name = "Daily")
    protected Boolean daily;

    /**
     * Gets the value of the sectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /**
     * Sets the value of the sectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionCode(String value) {
        this.sectionCode = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the sectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * Sets the value of the sectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionName(String value) {
        this.sectionName = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link EAccountType }
     *     
     */
    public EAccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAccountType }
     *     
     */
    public void setAccountType(EAccountType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalEntryType }
     *     
     */
    public AdditionalEntryType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalEntryType }
     *     
     */
    public void setType(AdditionalEntryType value) {
        this.type = value;
    }

    /**
     * Gets the value of the daily property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDaily() {
        return daily;
    }

    /**
     * Sets the value of the daily property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDaily(Boolean value) {
        this.daily = value;
    }

}
