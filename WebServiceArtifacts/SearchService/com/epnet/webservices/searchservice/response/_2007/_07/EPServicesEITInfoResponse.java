
package com.epnet.webservices.searchservice.response._2007._07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EP.Services.EIT.InfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EP.Services.EIT.InfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epnet.com/webservices/SearchService/Response/2007/07/}Response">
 *       &lt;sequence>
 *         &lt;element name="dbInfo" type="{http://epnet.com/webservices/SearchService/Response/2007/07/}ArrayOfDatabaseWithAuth" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EP.Services.EIT.InfoResponse", propOrder = {
    "dbInfo"
})
public class EPServicesEITInfoResponse
    extends Response
{

    protected ArrayOfDatabaseWithAuth dbInfo;

    /**
     * Gets the value of the dbInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDatabaseWithAuth }
     *     
     */
    public ArrayOfDatabaseWithAuth getDbInfo() {
        return dbInfo;
    }

    /**
     * Sets the value of the dbInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDatabaseWithAuth }
     *     
     */
    public void setDbInfo(ArrayOfDatabaseWithAuth value) {
        this.dbInfo = value;
    }

}
