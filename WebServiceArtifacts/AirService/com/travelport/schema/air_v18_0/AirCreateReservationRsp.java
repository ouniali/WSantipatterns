
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseRsp;
import com.travelport.schema.common_v15_0.RequestKeyMappings;
import com.travelport.schema.universal_v16_0.UniversalRecord;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseRsp">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}UniversalRecord" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirSolutionChangedInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirSegmentSellFailureInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}RequestKeyMappings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "universalRecord",
    "airSolutionChangedInfo",
    "airSegmentSellFailureInfo",
    "requestKeyMappings"
})
@XmlRootElement(name = "AirCreateReservationRsp")
public class AirCreateReservationRsp
    extends BaseRsp
{

    @XmlElement(name = "UniversalRecord", namespace = "http://www.travelport.com/schema/universal_v16_0")
    protected UniversalRecord universalRecord;
    @XmlElement(name = "AirSolutionChangedInfo")
    protected List<AirSolutionChangedInfo> airSolutionChangedInfo;
    @XmlElement(name = "AirSegmentSellFailureInfo")
    protected AirSegmentSellFailureInfo airSegmentSellFailureInfo;
    @XmlElement(name = "RequestKeyMappings", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected RequestKeyMappings requestKeyMappings;

    /**
     * Gets the value of the universalRecord property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalRecord }
     *     
     */
    public UniversalRecord getUniversalRecord() {
        return universalRecord;
    }

    /**
     * Sets the value of the universalRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalRecord }
     *     
     */
    public void setUniversalRecord(UniversalRecord value) {
        this.universalRecord = value;
    }

    /**
     * Gets the value of the airSolutionChangedInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSolutionChangedInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSolutionChangedInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSolutionChangedInfo }
     * 
     * 
     */
    public List<AirSolutionChangedInfo> getAirSolutionChangedInfo() {
        if (airSolutionChangedInfo == null) {
            airSolutionChangedInfo = new ArrayList<AirSolutionChangedInfo>();
        }
        return this.airSolutionChangedInfo;
    }

    /**
     * Gets the value of the airSegmentSellFailureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AirSegmentSellFailureInfo }
     *     
     */
    public AirSegmentSellFailureInfo getAirSegmentSellFailureInfo() {
        return airSegmentSellFailureInfo;
    }

    /**
     * Sets the value of the airSegmentSellFailureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSegmentSellFailureInfo }
     *     
     */
    public void setAirSegmentSellFailureInfo(AirSegmentSellFailureInfo value) {
        this.airSegmentSellFailureInfo = value;
    }

    /**
     * Gets the value of the requestKeyMappings property.
     * 
     * @return
     *     possible object is
     *     {@link RequestKeyMappings }
     *     
     */
    public RequestKeyMappings getRequestKeyMappings() {
        return requestKeyMappings;
    }

    /**
     * Sets the value of the requestKeyMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestKeyMappings }
     *     
     */
    public void setRequestKeyMappings(RequestKeyMappings value) {
        this.requestKeyMappings = value;
    }

}
