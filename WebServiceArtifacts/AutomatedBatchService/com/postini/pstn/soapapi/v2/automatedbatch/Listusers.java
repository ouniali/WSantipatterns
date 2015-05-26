
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listusers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listusers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authElem" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}authElem"/>
 *         &lt;element name="queryString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queryParams" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}listusersqueryParams" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listusers", propOrder = {
    "authElem",
    "queryString",
    "queryParams"
})
public class Listusers {

    @XmlElement(required = true)
    protected AuthElem authElem;
    @XmlElement(required = true)
    protected String queryString;
    protected ListusersqueryParams queryParams;

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
     *     {@link ListusersqueryParams }
     *     
     */
    public ListusersqueryParams getQueryParams() {
        return queryParams;
    }

    /**
     * Sets the value of the queryParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListusersqueryParams }
     *     
     */
    public void setQueryParams(ListusersqueryParams value) {
        this.queryParams = value;
    }

}
