
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSAgencyCustomerListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSAgencyCustomerListRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SearchBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSAgencyCustomerListRequest", propOrder = {
    "agencyId",
    "customerID",
    "searchBy",
    "searchText"
})
public class WSAgencyCustomerListRequest {

    @XmlElement(name = "AgencyId")
    protected int agencyId;
    @XmlElement(name = "CustomerID")
    protected int customerID;
    @XmlElement(name = "SearchBy")
    protected String searchBy;
    @XmlElement(name = "SearchText")
    protected String searchText;

    /**
     * Gets the value of the agencyId property.
     * 
     */
    public int getAgencyId() {
        return agencyId;
    }

    /**
     * Sets the value of the agencyId property.
     * 
     */
    public void setAgencyId(int value) {
        this.agencyId = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     */
    public void setCustomerID(int value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the searchBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchBy() {
        return searchBy;
    }

    /**
     * Sets the value of the searchBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchBy(String value) {
        this.searchBy = value;
    }

    /**
     * Gets the value of the searchText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchText() {
        return searchText;
    }

    /**
     * Sets the value of the searchText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchText(String value) {
        this.searchText = value;
    }

}
