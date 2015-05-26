
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareCodeOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareCodeOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareRemark" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareGroup"/>
 *       &lt;attribute name="ListOfFareQualifierCode" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="FareDescription" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareCodeOptionType", propOrder = {
    "fareRemark"
})
public class FareCodeOptionType {

    @XmlElement(name = "FareRemark")
    protected FareCodeOptionType.FareRemark fareRemark;
    @XmlAttribute(name = "ListOfFareQualifierCode")
    protected List<String> listOfFareQualifierCode;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "FareDescription")
    protected String fareDescription;
    @XmlAttribute(name = "FareCode")
    protected String fareCode;
    @XmlAttribute(name = "GroupCode")
    protected String groupCode;

    /**
     * Gets the value of the fareRemark property.
     * 
     * @return
     *     possible object is
     *     {@link FareCodeOptionType.FareRemark }
     *     
     */
    public FareCodeOptionType.FareRemark getFareRemark() {
        return fareRemark;
    }

    /**
     * Sets the value of the fareRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareCodeOptionType.FareRemark }
     *     
     */
    public void setFareRemark(FareCodeOptionType.FareRemark value) {
        this.fareRemark = value;
    }

    /**
     * Gets the value of the listOfFareQualifierCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfFareQualifierCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfFareQualifierCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListOfFareQualifierCode() {
        if (listOfFareQualifierCode == null) {
            listOfFareQualifierCode = new ArrayList<String>();
        }
        return this.listOfFareQualifierCode;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the fareDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareDescription() {
        return fareDescription;
    }

    /**
     * Sets the value of the fareDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareDescription(String value) {
        this.fareDescription = value;
    }

    /**
     * Gets the value of the fareCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCode() {
        return fareCode;
    }

    /**
     * Sets the value of the fareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCode(String value) {
        this.fareCode = value;
    }

    /**
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FareRemark
        extends FreeTextType
    {


    }

}
