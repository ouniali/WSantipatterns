
package gov.nsw.lands.address.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.nsw.lands.address.search.utl.SearchMethod;
import gov.nsw.lands.address.ws.ArrayOfTns2NillableLotAddressRecord;


/**
 * <p>Java class for LotAddressResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotAddressResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresses" type="{http://ws.address.lands.nsw.gov}ArrayOf_tns2_nillable_LotAddressRecord"/>
 *         &lt;element name="errMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numRecs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="searchMethod" type="{http://utl.search.address.lands.nsw.gov}SearchMethod"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LotAddressResult", propOrder = {
    "addresses",
    "errMsg",
    "numRecs",
    "searchMethod"
})
public class LotAddressResult {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2NillableLotAddressRecord addresses;
    @XmlElement(required = true, nillable = true)
    protected String errMsg;
    protected int numRecs;
    @XmlElement(required = true, nillable = true)
    protected SearchMethod searchMethod;

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2NillableLotAddressRecord }
     *     
     */
    public ArrayOfTns2NillableLotAddressRecord getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2NillableLotAddressRecord }
     *     
     */
    public void setAddresses(ArrayOfTns2NillableLotAddressRecord value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the errMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * Sets the value of the errMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrMsg(String value) {
        this.errMsg = value;
    }

    /**
     * Gets the value of the numRecs property.
     * 
     */
    public int getNumRecs() {
        return numRecs;
    }

    /**
     * Sets the value of the numRecs property.
     * 
     */
    public void setNumRecs(int value) {
        this.numRecs = value;
    }

    /**
     * Gets the value of the searchMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMethod }
     *     
     */
    public SearchMethod getSearchMethod() {
        return searchMethod;
    }

    /**
     * Sets the value of the searchMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMethod }
     *     
     */
    public void setSearchMethod(SearchMethod value) {
        this.searchMethod = value;
    }

}
