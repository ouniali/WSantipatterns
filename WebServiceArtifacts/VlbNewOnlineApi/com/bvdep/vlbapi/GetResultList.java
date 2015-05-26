
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
 *         &lt;element name="LoginInfo" type="{http://vlbapi.bvdep.com/}LoginInfo"/>
 *         &lt;element name="SearchId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SelectedDatabase" type="{http://vlbapi.bvdep.com/}DatabaseType"/>
 *         &lt;element name="Layout" type="{http://vlbapi.bvdep.com/}Layout"/>
 *         &lt;element name="StartIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oSortInfo" type="{http://vlbapi.bvdep.com/}SortInfo"/>
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
    "loginInfo",
    "searchId",
    "selectedDatabase",
    "layout",
    "startIndex",
    "length",
    "oSortInfo"
})
@XmlRootElement(name = "GetResultList")
public class GetResultList {

    @XmlElement(name = "LoginInfo", required = true)
    protected LoginInfo loginInfo;
    @XmlElement(name = "SearchId")
    protected int searchId;
    @XmlList
    @XmlElement(name = "SelectedDatabase", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> selectedDatabase;
    @XmlElement(name = "Layout", required = true)
    protected Layout layout;
    @XmlElement(name = "StartIndex")
    protected int startIndex;
    @XmlElement(name = "Length")
    protected int length;
    @XmlElement(required = true)
    protected SortInfo oSortInfo;

    /**
     * Gets the value of the loginInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LoginInfo }
     *     
     */
    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    /**
     * Sets the value of the loginInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginInfo }
     *     
     */
    public void setLoginInfo(LoginInfo value) {
        this.loginInfo = value;
    }

    /**
     * Gets the value of the searchId property.
     * 
     */
    public int getSearchId() {
        return searchId;
    }

    /**
     * Sets the value of the searchId property.
     * 
     */
    public void setSearchId(int value) {
        this.searchId = value;
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
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link Layout }
     *     
     */
    public Layout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Layout }
     *     
     */
    public void setLayout(Layout value) {
        this.layout = value;
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

}
