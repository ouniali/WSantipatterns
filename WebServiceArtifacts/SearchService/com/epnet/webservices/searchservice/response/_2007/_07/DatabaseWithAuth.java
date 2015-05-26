
package com.epnet.webservices.searchservice.response._2007._07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatabaseWithAuth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatabaseWithAuth">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epnet.com/webservices/SearchService/Response/2007/07/}Database">
 *       &lt;sequence>
 *         &lt;element name="authorityInfo" type="{http://epnet.com/webservices/SearchService/Response/2007/07/}ArrayOfDatabase" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseWithAuth", propOrder = {
    "authorityInfo"
})
public class DatabaseWithAuth
    extends Database
{

    protected ArrayOfDatabase authorityInfo;

    /**
     * Gets the value of the authorityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDatabase }
     *     
     */
    public ArrayOfDatabase getAuthorityInfo() {
        return authorityInfo;
    }

    /**
     * Sets the value of the authorityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDatabase }
     *     
     */
    public void setAuthorityInfo(ArrayOfDatabase value) {
        this.authorityInfo = value;
    }

}
