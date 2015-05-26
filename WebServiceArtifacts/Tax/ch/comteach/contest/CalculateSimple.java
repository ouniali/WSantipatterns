
package ch.comteach.contest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Canton" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Borough" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CivilState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfChildren" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Religion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxableIncome" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TaxableWealth" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accessToken",
    "year",
    "canton",
    "borough",
    "civilState",
    "numberOfChildren",
    "religion",
    "taxableIncome",
    "taxableWealth"
})
@XmlRootElement(name = "CalculateSimple")
public class CalculateSimple {

    @XmlElement(name = "AccessToken")
    protected String accessToken;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "Canton")
    protected String canton;
    @XmlElement(name = "Borough")
    protected String borough;
    @XmlElement(name = "CivilState")
    protected String civilState;
    @XmlElement(name = "NumberOfChildren")
    protected int numberOfChildren;
    @XmlElement(name = "Religion")
    protected String religion;
    @XmlElement(name = "TaxableIncome")
    protected double taxableIncome;
    @XmlElement(name = "TaxableWealth")
    protected double taxableWealth;

    /**
     * Gets the value of the accessToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of the accessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the canton property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanton() {
        return canton;
    }

    /**
     * Sets the value of the canton property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanton(String value) {
        this.canton = value;
    }

    /**
     * Gets the value of the borough property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorough() {
        return borough;
    }

    /**
     * Sets the value of the borough property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorough(String value) {
        this.borough = value;
    }

    /**
     * Gets the value of the civilState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilState() {
        return civilState;
    }

    /**
     * Sets the value of the civilState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilState(String value) {
        this.civilState = value;
    }

    /**
     * Gets the value of the numberOfChildren property.
     * 
     */
    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    /**
     * Sets the value of the numberOfChildren property.
     * 
     */
    public void setNumberOfChildren(int value) {
        this.numberOfChildren = value;
    }

    /**
     * Gets the value of the religion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligion() {
        return religion;
    }

    /**
     * Sets the value of the religion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligion(String value) {
        this.religion = value;
    }

    /**
     * Gets the value of the taxableIncome property.
     * 
     */
    public double getTaxableIncome() {
        return taxableIncome;
    }

    /**
     * Sets the value of the taxableIncome property.
     * 
     */
    public void setTaxableIncome(double value) {
        this.taxableIncome = value;
    }

    /**
     * Gets the value of the taxableWealth property.
     * 
     */
    public double getTaxableWealth() {
        return taxableWealth;
    }

    /**
     * Sets the value of the taxableWealth property.
     * 
     */
    public void setTaxableWealth(double value) {
        this.taxableWealth = value;
    }

}
