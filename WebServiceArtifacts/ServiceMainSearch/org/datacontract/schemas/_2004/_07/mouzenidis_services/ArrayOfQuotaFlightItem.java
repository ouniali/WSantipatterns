
package org.datacontract.schemas._2004._07.mouzenidis_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQuotaFlightItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQuotaFlightItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuotaFlightItem" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}QuotaFlightItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQuotaFlightItem", propOrder = {
    "quotaFlightItem"
})
public class ArrayOfQuotaFlightItem {

    @XmlElement(name = "QuotaFlightItem", nillable = true)
    protected List<QuotaFlightItem> quotaFlightItem;

    /**
     * Gets the value of the quotaFlightItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotaFlightItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotaFlightItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotaFlightItem }
     * 
     * 
     */
    public List<QuotaFlightItem> getQuotaFlightItem() {
        if (quotaFlightItem == null) {
            quotaFlightItem = new ArrayList<QuotaFlightItem>();
        }
        return this.quotaFlightItem;
    }

}
