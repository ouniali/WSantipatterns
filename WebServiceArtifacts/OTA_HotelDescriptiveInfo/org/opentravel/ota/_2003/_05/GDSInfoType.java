
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GDS_InfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDS_InfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GDS_Codes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GDS_Code" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="GDS_CodeDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGDS_InfoTypeGDS_CodesGDS_CodeGDS_CodeDetail" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="GDS_PropertyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="GDS_Name" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Amadeus"/>
 *                                 &lt;enumeration value="ApolloGalileo"/>
 *                                 &lt;enumeration value="Sabre"/>
 *                                 &lt;enumeration value="Worldspan"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MasterChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDS_InfoType", propOrder = {
    "gdsCodes"
})
public class GDSInfoType {

    @XmlElement(name = "GDS_Codes")
    protected GDSInfoType.GDSCodes gdsCodes;
    @XmlAttribute(name = "MasterChainCode")
    protected String masterChainCode;

    /**
     * Gets the value of the gdsCodes property.
     * 
     * @return
     *     possible object is
     *     {@link GDSInfoType.GDSCodes }
     *     
     */
    public GDSInfoType.GDSCodes getGDSCodes() {
        return gdsCodes;
    }

    /**
     * Sets the value of the gdsCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDSInfoType.GDSCodes }
     *     
     */
    public void setGDSCodes(GDSInfoType.GDSCodes value) {
        this.gdsCodes = value;
    }

    /**
     * Gets the value of the masterChainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterChainCode() {
        return masterChainCode;
    }

    /**
     * Sets the value of the masterChainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterChainCode(String value) {
        this.masterChainCode = value;
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
     *         &lt;element name="GDS_Code" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="GDS_CodeDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGDS_InfoTypeGDS_CodesGDS_CodeGDS_CodeDetail" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="GDS_PropertyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="GDS_Name" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Amadeus"/>
     *                       &lt;enumeration value="ApolloGalileo"/>
     *                       &lt;enumeration value="Sabre"/>
     *                       &lt;enumeration value="Worldspan"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gdsCode"
    })
    public static class GDSCodes {

        @XmlElement(name = "GDS_Code")
        protected List<GDSInfoType.GDSCodes.GDSCode> gdsCode;
        @XmlAttribute(name = "LoadGDSIndicator")
        protected Boolean loadGDSIndicator;

        /**
         * Gets the value of the gdsCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gdsCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGDSCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GDSInfoType.GDSCodes.GDSCode }
         * 
         * 
         */
        public List<GDSInfoType.GDSCodes.GDSCode> getGDSCode() {
            if (gdsCode == null) {
                gdsCode = new ArrayList<GDSInfoType.GDSCodes.GDSCode>();
            }
            return this.gdsCode;
        }

        /**
         * Gets the value of the loadGDSIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLoadGDSIndicator() {
            return loadGDSIndicator;
        }

        /**
         * Sets the value of the loadGDSIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLoadGDSIndicator(Boolean value) {
            this.loadGDSIndicator = value;
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
         *         &lt;element name="GDS_CodeDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGDS_InfoTypeGDS_CodesGDS_CodeGDS_CodeDetail" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="GDS_PropertyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="GDS_Name" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Amadeus"/>
         *             &lt;enumeration value="ApolloGalileo"/>
         *             &lt;enumeration value="Sabre"/>
         *             &lt;enumeration value="Worldspan"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "gdsCodeDetails"
        })
        public static class GDSCode {

            @XmlElement(name = "GDS_CodeDetails")
            protected ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail gdsCodeDetails;
            @XmlAttribute(name = "ChainCode")
            protected String chainCode;
            @XmlAttribute(name = "GDS_PropertyCode")
            protected String gdsPropertyCode;
            @XmlAttribute(name = "GDS_Name", required = true)
            protected String gdsName;
            @XmlAttribute(name = "LoadGDSIndicator")
            protected Boolean loadGDSIndicator;

            /**
             * Gets the value of the gdsCodeDetails property.
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail }
             *     
             */
            public ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail getGDSCodeDetails() {
                return gdsCodeDetails;
            }

            /**
             * Sets the value of the gdsCodeDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail }
             *     
             */
            public void setGDSCodeDetails(ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail value) {
                this.gdsCodeDetails = value;
            }

            /**
             * Gets the value of the chainCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChainCode() {
                return chainCode;
            }

            /**
             * Sets the value of the chainCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChainCode(String value) {
                this.chainCode = value;
            }

            /**
             * Gets the value of the gdsPropertyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGDSPropertyCode() {
                return gdsPropertyCode;
            }

            /**
             * Sets the value of the gdsPropertyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGDSPropertyCode(String value) {
                this.gdsPropertyCode = value;
            }

            /**
             * Gets the value of the gdsName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGDSName() {
                return gdsName;
            }

            /**
             * Sets the value of the gdsName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGDSName(String value) {
                this.gdsName = value;
            }

            /**
             * Gets the value of the loadGDSIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLoadGDSIndicator() {
                return loadGDSIndicator;
            }

            /**
             * Sets the value of the loadGDSIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLoadGDSIndicator(Boolean value) {
                this.loadGDSIndicator = value;
            }

        }

    }

}
