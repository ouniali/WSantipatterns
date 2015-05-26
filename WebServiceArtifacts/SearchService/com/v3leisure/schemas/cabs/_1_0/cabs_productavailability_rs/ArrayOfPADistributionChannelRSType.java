
package com.v3leisure.schemas.cabs._1_0.cabs_productavailability_rs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.v3leisure.schemas.cabs._1_0.cabs_common.PADistributionChannelRSType;


/**
 * <p>Java class for ArrayOfPA_DistributionChannelRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPA_DistributionChannelRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PA_DistributionChannelRSType" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PA_DistributionChannelRSType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPA_DistributionChannelRSType", propOrder = {
    "paDistributionChannelRSType"
})
public class ArrayOfPADistributionChannelRSType {

    @XmlElement(name = "PA_DistributionChannelRSType", nillable = true)
    protected List<PADistributionChannelRSType> paDistributionChannelRSType;

    /**
     * Gets the value of the paDistributionChannelRSType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paDistributionChannelRSType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPADistributionChannelRSType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PADistributionChannelRSType }
     * 
     * 
     */
    public List<PADistributionChannelRSType> getPADistributionChannelRSType() {
        if (paDistributionChannelRSType == null) {
            paDistributionChannelRSType = new ArrayList<PADistributionChannelRSType>();
        }
        return this.paDistributionChannelRSType;
    }

}
