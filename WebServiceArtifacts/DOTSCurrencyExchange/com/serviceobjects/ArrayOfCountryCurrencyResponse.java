
package com.serviceobjects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCountryCurrencyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCountryCurrencyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryCurrencyResponse" type="{http://www.serviceobjects.com/}CountryCurrencyResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCountryCurrencyResponse", propOrder = {
    "countryCurrencyResponse"
})
public class ArrayOfCountryCurrencyResponse {

    @XmlElement(name = "CountryCurrencyResponse", nillable = true)
    protected List<CountryCurrencyResponse> countryCurrencyResponse;

    /**
     * Gets the value of the countryCurrencyResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryCurrencyResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryCurrencyResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCurrencyResponse }
     * 
     * 
     */
    public List<CountryCurrencyResponse> getCountryCurrencyResponse() {
        if (countryCurrencyResponse == null) {
            countryCurrencyResponse = new ArrayList<CountryCurrencyResponse>();
        }
        return this.countryCurrencyResponse;
    }

}
