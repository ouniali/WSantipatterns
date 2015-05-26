
package com.v3leisure.schemas.cabs._1_0.cabs_provideravailability_rs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.v3leisure.schemas.cabs._1_0.cabs_common.AVDistributionChannelRSType;


/**
 * <p>Java class for ArrayOfAV_DistributionChannelRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAV_DistributionChannelRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AV_DistributionChannelRSType" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}AV_DistributionChannelRSType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAV_DistributionChannelRSType", propOrder = {
    "avDistributionChannelRSType"
})
public class ArrayOfAVDistributionChannelRSType {

    @XmlElement(name = "AV_DistributionChannelRSType", nillable = true)
    protected List<AVDistributionChannelRSType> avDistributionChannelRSType;

    /**
     * Gets the value of the avDistributionChannelRSType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avDistributionChannelRSType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAVDistributionChannelRSType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AVDistributionChannelRSType }
     * 
     * 
     */
    public List<AVDistributionChannelRSType> getAVDistributionChannelRSType() {
        if (avDistributionChannelRSType == null) {
            avDistributionChannelRSType = new ArrayList<AVDistributionChannelRSType>();
        }
        return this.avDistributionChannelRSType;
    }

}
