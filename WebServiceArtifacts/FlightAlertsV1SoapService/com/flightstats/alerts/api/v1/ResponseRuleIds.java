
package com.flightstats.alerts.api.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseRuleIds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseRuleIds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://v1.api.alerts.flightstats.com/}requestRuleIds" minOccurs="0"/>
 *         &lt;element name="ruleIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ruleId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="error" type="{http://v1.api.alerts.flightstats.com/}apiResponseError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseRuleIds", propOrder = {
    "request",
    "ruleIds",
    "error"
})
public class ResponseRuleIds {

    protected RequestRuleIds request;
    protected ResponseRuleIds.RuleIds ruleIds;
    protected ApiResponseError error;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestRuleIds }
     *     
     */
    public RequestRuleIds getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestRuleIds }
     *     
     */
    public void setRequest(RequestRuleIds value) {
        this.request = value;
    }

    /**
     * Gets the value of the ruleIds property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseRuleIds.RuleIds }
     *     
     */
    public ResponseRuleIds.RuleIds getRuleIds() {
        return ruleIds;
    }

    /**
     * Sets the value of the ruleIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseRuleIds.RuleIds }
     *     
     */
    public void setRuleIds(ResponseRuleIds.RuleIds value) {
        this.ruleIds = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ApiResponseError }
     *     
     */
    public ApiResponseError getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiResponseError }
     *     
     */
    public void setError(ApiResponseError value) {
        this.error = value;
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
     *         &lt;element name="ruleId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
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
        "ruleId"
    })
    public static class RuleIds {

        @XmlElement(type = Integer.class)
        protected List<Integer> ruleId;

        /**
         * Gets the value of the ruleId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ruleId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRuleId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getRuleId() {
            if (ruleId == null) {
                ruleId = new ArrayList<Integer>();
            }
            return this.ruleId;
        }

    }

}
