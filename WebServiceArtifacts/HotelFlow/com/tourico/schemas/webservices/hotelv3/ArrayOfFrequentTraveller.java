
package com.tourico.schemas.webservices.hotelv3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFrequentTraveller complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFrequentTraveller">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrequentTraveller" type="{http://schemas.tourico.com/webservices/hotelv3}FrequentTraveller" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFrequentTraveller", propOrder = {
    "frequentTraveller"
})
public class ArrayOfFrequentTraveller {

    @XmlElement(name = "FrequentTraveller", nillable = true)
    protected List<FrequentTraveller> frequentTraveller;

    /**
     * Gets the value of the frequentTraveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequentTraveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequentTraveller().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequentTraveller }
     * 
     * 
     */
    public List<FrequentTraveller> getFrequentTraveller() {
        if (frequentTraveller == null) {
            frequentTraveller = new ArrayList<FrequentTraveller>();
        }
        return this.frequentTraveller;
    }

}
