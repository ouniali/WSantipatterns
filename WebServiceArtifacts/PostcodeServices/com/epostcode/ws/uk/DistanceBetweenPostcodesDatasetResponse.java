
package com.epostcode.ws.uk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *         &lt;element name="DistanceBetween_Postcodes_DatasetResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any namespace='http://ws.epostcode.com/uk/PostcodeUtilities.xsd'/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "distanceBetweenPostcodesDatasetResult"
})
@XmlRootElement(name = "DistanceBetween_Postcodes_DatasetResponse")
public class DistanceBetweenPostcodesDatasetResponse {

    @XmlElement(name = "DistanceBetween_Postcodes_DatasetResult")
    protected DistanceBetweenPostcodesDatasetResponse.DistanceBetweenPostcodesDatasetResult distanceBetweenPostcodesDatasetResult;

    /**
     * Gets the value of the distanceBetweenPostcodesDatasetResult property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceBetweenPostcodesDatasetResponse.DistanceBetweenPostcodesDatasetResult }
     *     
     */
    public DistanceBetweenPostcodesDatasetResponse.DistanceBetweenPostcodesDatasetResult getDistanceBetweenPostcodesDatasetResult() {
        return distanceBetweenPostcodesDatasetResult;
    }

    /**
     * Sets the value of the distanceBetweenPostcodesDatasetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceBetweenPostcodesDatasetResponse.DistanceBetweenPostcodesDatasetResult }
     *     
     */
    public void setDistanceBetweenPostcodesDatasetResult(DistanceBetweenPostcodesDatasetResponse.DistanceBetweenPostcodesDatasetResult value) {
        this.distanceBetweenPostcodesDatasetResult = value;
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
     *         &lt;any namespace='http://ws.epostcode.com/uk/PostcodeUtilities.xsd'/>
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
        "any"
    })
    public static class DistanceBetweenPostcodesDatasetResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
