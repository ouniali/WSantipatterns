
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ArrayOfViewershipsTypeViewershipDistributorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfViewershipsTypeViewershipDistributorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DistributorType" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="DistributorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DistributorTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "ArrayOfViewershipsTypeViewershipDistributorType", propOrder = {
    "distributorType"
})
public class ArrayOfViewershipsTypeViewershipDistributorType {

    @XmlElement(name = "DistributorType")
    protected List<ArrayOfViewershipsTypeViewershipDistributorType.DistributorType> distributorType;

    /**
     * Gets the value of the distributorType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributorType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributorType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfViewershipsTypeViewershipDistributorType.DistributorType }
     * 
     * 
     */
    public List<ArrayOfViewershipsTypeViewershipDistributorType.DistributorType> getDistributorType() {
        if (distributorType == null) {
            distributorType = new ArrayList<ArrayOfViewershipsTypeViewershipDistributorType.DistributorType>();
        }
        return this.distributorType;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="DistributorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DistributorTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class DistributorType {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "DistributorCode")
        protected String distributorCode;
        @XmlAttribute(name = "DistributorTypeCode")
        protected String distributorTypeCode;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the distributorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistributorCode() {
            return distributorCode;
        }

        /**
         * Sets the value of the distributorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistributorCode(String value) {
            this.distributorCode = value;
        }

        /**
         * Gets the value of the distributorTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistributorTypeCode() {
            return distributorTypeCode;
        }

        /**
         * Sets the value of the distributorTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistributorTypeCode(String value) {
            this.distributorTypeCode = value;
        }

    }

}
