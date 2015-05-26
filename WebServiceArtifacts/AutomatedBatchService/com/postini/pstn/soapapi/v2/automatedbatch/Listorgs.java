
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listorgs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listorgs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authElem" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}authElem"/>
 *         &lt;element name="queryString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queryParams" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}listorgsqueryParams"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listorgs", propOrder = {
    "authElem",
    "queryString",
    "queryParams"
})
public class Listorgs {

    @XmlElement(required = true)
    protected AuthElem authElem;
    @XmlElement(required = true)
    protected String queryString;
    @XmlElement(required = true)
    protected ListorgsqueryParams queryParams;

    /**
     * Gets the value of the authElem property.
     * 
     * @return
     *     possible object is
     *     {@link AuthElem }
     *     
     */
    public AuthElem getAuthElem() {
        return authElem;
    }

    /**
     * Sets the value of the authElem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthElem }
     *     
     */
    public void setAuthElem(AuthElem value) {
        this.authElem = value;
    }

    /**
     * Gets the value of the queryString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * Sets the value of the queryString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryString(String value) {
        this.queryString = value;
    }

    /**
     * Gets the value of the queryParams property.
     * 
     * @return
     *     possible object is
     *     {@link ListorgsqueryParams }
     *     
     */
    public ListorgsqueryParams getQueryParams() {
        return queryParams;
    }

    /**
     * Sets the value of the queryParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListorgsqueryParams }
     *     
     */
    public void setQueryParams(ListorgsqueryParams value) {
        this.queryParams = value;
    }

}
