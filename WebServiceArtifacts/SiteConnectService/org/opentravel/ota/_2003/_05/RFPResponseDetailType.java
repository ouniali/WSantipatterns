
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for RFP_ResponseDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFP_ResponseDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeliveryResponseGroup"/>
 *       &lt;attribute name="DetailIncludedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DeclineIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DeclineReasonCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="CodeDetail" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFP_ResponseDetailType", propOrder = {
    "comments"
})
public class RFPResponseDetailType {

    @XmlElement(name = "Comments")
    protected RFPResponseDetailType.Comments comments;
    @XmlAttribute(name = "DetailIncludedIndicator")
    protected Boolean detailIncludedIndicator;
    @XmlAttribute(name = "DeclineIndicator")
    protected Boolean declineIndicator;
    @XmlAttribute(name = "DeclineReasonCode")
    protected String declineReasonCode;
    @XmlAttribute(name = "CodeDetail")
    protected String codeDetail;
    @XmlAttribute(name = "MinimumTime")
    protected Duration minimumTime;
    @XmlAttribute(name = "MaximumTime")
    protected Duration maximumTime;
    @XmlAttribute(name = "ResponseMethod")
    protected String responseMethod;
    @XmlAttribute(name = "ResponseTimeUnit")
    protected String responseTimeUnit;

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link RFPResponseDetailType.Comments }
     *     
     */
    public RFPResponseDetailType.Comments getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFPResponseDetailType.Comments }
     *     
     */
    public void setComments(RFPResponseDetailType.Comments value) {
        this.comments = value;
    }

    /**
     * Gets the value of the detailIncludedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetailIncludedIndicator() {
        return detailIncludedIndicator;
    }

    /**
     * Sets the value of the detailIncludedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetailIncludedIndicator(Boolean value) {
        this.detailIncludedIndicator = value;
    }

    /**
     * Gets the value of the declineIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeclineIndicator() {
        return declineIndicator;
    }

    /**
     * Sets the value of the declineIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeclineIndicator(Boolean value) {
        this.declineIndicator = value;
    }

    /**
     * Gets the value of the declineReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclineReasonCode() {
        return declineReasonCode;
    }

    /**
     * Sets the value of the declineReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclineReasonCode(String value) {
        this.declineReasonCode = value;
    }

    /**
     * Gets the value of the codeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDetail() {
        return codeDetail;
    }

    /**
     * Sets the value of the codeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDetail(String value) {
        this.codeDetail = value;
    }

    /**
     * Gets the value of the minimumTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumTime() {
        return minimumTime;
    }

    /**
     * Sets the value of the minimumTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumTime(Duration value) {
        this.minimumTime = value;
    }

    /**
     * Gets the value of the maximumTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumTime() {
        return maximumTime;
    }

    /**
     * Sets the value of the maximumTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumTime(Duration value) {
        this.maximumTime = value;
    }

    /**
     * Gets the value of the responseMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMethod() {
        return responseMethod;
    }

    /**
     * Sets the value of the responseMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMethod(String value) {
        this.responseMethod = value;
    }

    /**
     * Gets the value of the responseTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseTimeUnit() {
        return responseTimeUnit;
    }

    /**
     * Sets the value of the responseTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseTimeUnit(String value) {
        this.responseTimeUnit = value;
    }


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
     *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="99"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "comment"
    })
    public static class Comments {

        @XmlElement(name = "Comment", required = true)
        protected List<ParagraphType> comment;

        /**
         * Gets the value of the comment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the comment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParagraphType }
         * 
         * 
         */
        public List<ParagraphType> getComment() {
            if (comment == null) {
                comment = new ArrayList<ParagraphType>();
            }
            return this.comment;
        }

    }

}
