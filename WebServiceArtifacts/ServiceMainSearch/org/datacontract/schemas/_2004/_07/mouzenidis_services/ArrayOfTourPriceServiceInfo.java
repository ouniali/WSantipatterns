
package org.datacontract.schemas._2004._07.mouzenidis_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTourPriceServiceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTourPriceServiceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TourPriceServiceInfo" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}TourPriceServiceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTourPriceServiceInfo", propOrder = {
    "tourPriceServiceInfo"
})
public class ArrayOfTourPriceServiceInfo {

    @XmlElement(name = "TourPriceServiceInfo", nillable = true)
    protected List<TourPriceServiceInfo> tourPriceServiceInfo;

    /**
     * Gets the value of the tourPriceServiceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourPriceServiceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourPriceServiceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourPriceServiceInfo }
     * 
     * 
     */
    public List<TourPriceServiceInfo> getTourPriceServiceInfo() {
        if (tourPriceServiceInfo == null) {
            tourPriceServiceInfo = new ArrayList<TourPriceServiceInfo>();
        }
        return this.tourPriceServiceInfo;
    }

}
