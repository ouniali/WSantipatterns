
package org.datacontract.schemas._2004._07.mouzenidis_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQuotaHotelRoomVariant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQuotaHotelRoomVariant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuotaHotelRoomVariant" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}QuotaHotelRoomVariant" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQuotaHotelRoomVariant", propOrder = {
    "quotaHotelRoomVariant"
})
public class ArrayOfQuotaHotelRoomVariant {

    @XmlElement(name = "QuotaHotelRoomVariant", nillable = true)
    protected List<QuotaHotelRoomVariant> quotaHotelRoomVariant;

    /**
     * Gets the value of the quotaHotelRoomVariant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotaHotelRoomVariant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotaHotelRoomVariant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotaHotelRoomVariant }
     * 
     * 
     */
    public List<QuotaHotelRoomVariant> getQuotaHotelRoomVariant() {
        if (quotaHotelRoomVariant == null) {
            quotaHotelRoomVariant = new ArrayList<QuotaHotelRoomVariant>();
        }
        return this.quotaHotelRoomVariant;
    }

}
