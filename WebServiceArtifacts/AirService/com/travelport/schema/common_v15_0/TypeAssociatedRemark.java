
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A textual remark container to hold Associated itinerary remarks
 * 
 * <p>Java class for typeAssociatedRemark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeAssociatedRemark">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}typeRemarkWithTravelerRef">
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAssociatedRemark")
@XmlSeeAlso({
    InvoiceRemark.class,
    com.travelport.schema.vehicle_v17_0.AssociatedRemark.class,
    com.travelport.schema.hotel_v17_0.AssociatedRemark.class,
    TypeAssociatedRemarkWithSegmentRef.class
})
public class TypeAssociatedRemark
    extends TypeRemarkWithTravelerRef
{

    @XmlAttribute(name = "Key")
    protected String key;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

}
