
package org.datacontract.schemas._2004._07.mouzenidis_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQuotaFlightTariffs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQuotaFlightTariffs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuotaFlightTariffs" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}QuotaFlightTariffs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQuotaFlightTariffs", propOrder = {
    "quotaFlightTariffs"
})
public class ArrayOfQuotaFlightTariffs {

    @XmlElement(name = "QuotaFlightTariffs", nillable = true)
    protected List<QuotaFlightTariffs> quotaFlightTariffs;

    /**
     * Gets the value of the quotaFlightTariffs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotaFlightTariffs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotaFlightTariffs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotaFlightTariffs }
     * 
     * 
     */
    public List<QuotaFlightTariffs> getQuotaFlightTariffs() {
        if (quotaFlightTariffs == null) {
            quotaFlightTariffs = new ArrayList<QuotaFlightTariffs>();
        }
        return this.quotaFlightTariffs;
    }

}
