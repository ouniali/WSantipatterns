
package com.bvdep.vlbapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="oLoginInfo" type="{http://vlbapi.bvdep.com/}LoginInfo"/>
 *         &lt;element name="strQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatabaseMask" type="{http://vlbapi.bvdep.com/}DatabaseType"/>
 *         &lt;element name="SelectedDatabase" type="{http://vlbapi.bvdep.com/}DatabaseType"/>
 *         &lt;element name="DtFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DtTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MediaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oLayout" type="{http://vlbapi.bvdep.com/}Layout"/>
 *         &lt;element name="oSortInfo" type="{http://vlbapi.bvdep.com/}SortInfo"/>
 *         &lt;element name="eProductType" type="{http://vlbapi.bvdep.com/}eProductType"/>
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
    "oLoginInfo",
    "strQuery",
    "databaseMask",
    "selectedDatabase",
    "dtFrom",
    "dtTo",
    "mediaType",
    "startIndex",
    "length",
    "oLayout",
    "oSortInfo",
    "eProductType"
})
@XmlRootElement(name = "SearchAndGetResult")
public class SearchAndGetResult {

    @XmlElement(required = true)
    protected LoginInfo oLoginInfo;
    protected String strQuery;
    @XmlList
    @XmlElement(name = "DatabaseMask", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> databaseMask;
    @XmlList
    @XmlElement(name = "SelectedDatabase", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> selectedDatabase;
    @XmlElement(name = "DtFrom")
    protected String dtFrom;
    @XmlElement(name = "DtTo")
    protected String dtTo;
    @XmlElement(name = "MediaType")
    protected String mediaType;
    @XmlElement(name = "StartIndex")
    protected int startIndex;
    @XmlElement(name = "Length")
    protected int length;
    @XmlElement(required = true)
    protected Layout oLayout;
    @XmlElement(required = true)
    protected SortInfo oSortInfo;
    @XmlList
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> eProductType;

    /**
     * Gets the value of the oLoginInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LoginInfo }
     *     
     */
    public LoginInfo getOLoginInfo() {
        return oLoginInfo;
    }

    /**
     * Sets the value of the oLoginInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginInfo }
     *     
     */
    public void setOLoginInfo(LoginInfo value) {
        this.oLoginInfo = value;
    }

    /**
     * Gets the value of the strQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrQuery() {
        return strQuery;
    }

    /**
     * Sets the value of the strQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrQuery(String value) {
        this.strQuery = value;
    }

    /**
     * Gets the value of the databaseMask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the databaseMask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatabaseMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDatabaseMask() {
        if (databaseMask == null) {
            databaseMask = new ArrayList<String>();
        }
        return this.databaseMask;
    }

    /**
     * Gets the value of the selectedDatabase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedDatabase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedDatabase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSelectedDatabase() {
        if (selectedDatabase == null) {
            selectedDatabase = new ArrayList<String>();
        }
        return this.selectedDatabase;
    }

    /**
     * Gets the value of the dtFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtFrom() {
        return dtFrom;
    }

    /**
     * Sets the value of the dtFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtFrom(String value) {
        this.dtFrom = value;
    }

    /**
     * Gets the value of the dtTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtTo() {
        return dtTo;
    }

    /**
     * Sets the value of the dtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtTo(String value) {
        this.dtTo = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     */
    public void setStartIndex(int value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Gets the value of the oLayout property.
     * 
     * @return
     *     possible object is
     *     {@link Layout }
     *     
     */
    public Layout getOLayout() {
        return oLayout;
    }

    /**
     * Sets the value of the oLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Layout }
     *     
     */
    public void setOLayout(Layout value) {
        this.oLayout = value;
    }

    /**
     * Gets the value of the oSortInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SortInfo }
     *     
     */
    public SortInfo getOSortInfo() {
        return oSortInfo;
    }

    /**
     * Sets the value of the oSortInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortInfo }
     *     
     */
    public void setOSortInfo(SortInfo value) {
        this.oSortInfo = value;
    }

    /**
     * Gets the value of the eProductType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eProductType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEProductType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEProductType() {
        if (eProductType == null) {
            eProductType = new ArrayList<String>();
        }
        return this.eProductType;
    }

}
