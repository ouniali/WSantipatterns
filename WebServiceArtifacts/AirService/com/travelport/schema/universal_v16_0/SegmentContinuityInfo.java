
package com.travelport.schema.universal_v16_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}ArvlUnknSegment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}ContinuityOverrideRemark" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ArrivalUnknownSegmentCount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arvlUnknSegment",
    "continuityOverrideRemark"
})
@XmlRootElement(name = "SegmentContinuityInfo")
public class SegmentContinuityInfo {

    @XmlElement(name = "ArvlUnknSegment")
    protected List<ArvlUnknSegment> arvlUnknSegment;
    @XmlElement(name = "ContinuityOverrideRemark")
    protected List<ContinuityOverrideRemark> continuityOverrideRemark;
    @XmlAttribute(name = "ArrivalUnknownSegmentCount")
    protected BigInteger arrivalUnknownSegmentCount;

    /**
     * Gets the value of the arvlUnknSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arvlUnknSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArvlUnknSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArvlUnknSegment }
     * 
     * 
     */
    public List<ArvlUnknSegment> getArvlUnknSegment() {
        if (arvlUnknSegment == null) {
            arvlUnknSegment = new ArrayList<ArvlUnknSegment>();
        }
        return this.arvlUnknSegment;
    }

    /**
     * Gets the value of the continuityOverrideRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the continuityOverrideRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContinuityOverrideRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContinuityOverrideRemark }
     * 
     * 
     */
    public List<ContinuityOverrideRemark> getContinuityOverrideRemark() {
        if (continuityOverrideRemark == null) {
            continuityOverrideRemark = new ArrayList<ContinuityOverrideRemark>();
        }
        return this.continuityOverrideRemark;
    }

    /**
     * Gets the value of the arrivalUnknownSegmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArrivalUnknownSegmentCount() {
        return arrivalUnknownSegmentCount;
    }

    /**
     * Sets the value of the arrivalUnknownSegmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArrivalUnknownSegmentCount(BigInteger value) {
        this.arrivalUnknownSegmentCount = value;
    }

}
