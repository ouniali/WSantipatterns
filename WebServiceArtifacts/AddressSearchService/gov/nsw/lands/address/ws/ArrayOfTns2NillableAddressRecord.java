
package gov.nsw.lands.address.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.nsw.lands.address.data.AddressRecord;


/**
 * <p>Java class for ArrayOf_tns2_nillable_AddressRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns2_nillable_AddressRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressRecord" type="{http://data.address.lands.nsw.gov}AddressRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns2_nillable_AddressRecord", propOrder = {
    "addressRecord"
})
public class ArrayOfTns2NillableAddressRecord {

    @XmlElement(name = "AddressRecord", nillable = true)
    protected List<AddressRecord> addressRecord;

    /**
     * Gets the value of the addressRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressRecord }
     * 
     * 
     */
    public List<AddressRecord> getAddressRecord() {
        if (addressRecord == null) {
            addressRecord = new ArrayList<AddressRecord>();
        }
        return this.addressRecord;
    }

}
