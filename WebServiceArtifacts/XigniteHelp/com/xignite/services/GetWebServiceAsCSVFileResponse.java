
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="GetWebServiceAsCSVFileResult" type="{http://www.xignite.com/services/}CSVFile" minOccurs="0"/>
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
    "getWebServiceAsCSVFileResult"
})
@XmlRootElement(name = "GetWebServiceAsCSVFileResponse")
public class GetWebServiceAsCSVFileResponse {

    @XmlElement(name = "GetWebServiceAsCSVFileResult")
    protected CSVFile getWebServiceAsCSVFileResult;

    /**
     * Gets the value of the getWebServiceAsCSVFileResult property.
     * 
     * @return
     *     possible object is
     *     {@link CSVFile }
     *     
     */
    public CSVFile getGetWebServiceAsCSVFileResult() {
        return getWebServiceAsCSVFileResult;
    }

    /**
     * Sets the value of the getWebServiceAsCSVFileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSVFile }
     *     
     */
    public void setGetWebServiceAsCSVFileResult(CSVFile value) {
        this.getWebServiceAsCSVFileResult = value;
    }

}
