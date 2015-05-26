
package com.travelport.schema.common_v15_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v18_0.AirSegment;
import com.travelport.schema.rail_v12_0.RailSegment;


/**
 * The base segment type
 * 
 * <p>Java class for Segment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Segment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}SegmentRemark" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Passive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TravelOrder" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Segment", propOrder = {
    "segmentRemark"
})
@XmlSeeAlso({
    TravelSegment.class,
    RailSegment.class,
    AirSegment.class
})
public class Segment {

    @XmlElement(name = "SegmentRemark")
    protected List<SegmentRemark> segmentRemark;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "Passive")
    protected Boolean passive;
    @XmlAttribute(name = "TravelOrder")
    protected BigInteger travelOrder;

    /**
     * Gets the value of the segmentRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentRemark }
     * 
     * 
     */
    public List<SegmentRemark> getSegmentRemark() {
        if (segmentRemark == null) {
            segmentRemark = new ArrayList<SegmentRemark>();
        }
        return this.segmentRemark;
    }

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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the passive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassive() {
        return passive;
    }

    /**
     * Sets the value of the passive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassive(Boolean value) {
        this.passive = value;
    }

    /**
     * Gets the value of the travelOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelOrder() {
        return travelOrder;
    }

    /**
     * Sets the value of the travelOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTravelOrder(BigInteger value) {
        this.travelOrder = value;
    }

}
