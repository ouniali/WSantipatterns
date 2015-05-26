
package jp.co.est.btonic.zipcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FindCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalFindCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item" type="{http://btonic.est.co.jp/zipcode/}ArrayOfFindItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindList", propOrder = {
    "isSuccess",
    "findCount",
    "totalFindCount",
    "errorMessage",
    "item"
})
public class FindList {

    @XmlElement(name = "IsSuccess")
    protected boolean isSuccess;
    @XmlElement(name = "FindCount")
    protected int findCount;
    @XmlElement(name = "TotalFindCount")
    protected int totalFindCount;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "Item")
    protected ArrayOfFindItem item;

    /**
     * Gets the value of the isSuccess property.
     * 
     */
    public boolean isIsSuccess() {
        return isSuccess;
    }

    /**
     * Sets the value of the isSuccess property.
     * 
     */
    public void setIsSuccess(boolean value) {
        this.isSuccess = value;
    }

    /**
     * Gets the value of the findCount property.
     * 
     */
    public int getFindCount() {
        return findCount;
    }

    /**
     * Sets the value of the findCount property.
     * 
     */
    public void setFindCount(int value) {
        this.findCount = value;
    }

    /**
     * Gets the value of the totalFindCount property.
     * 
     */
    public int getTotalFindCount() {
        return totalFindCount;
    }

    /**
     * Sets the value of the totalFindCount property.
     * 
     */
    public void setTotalFindCount(int value) {
        this.totalFindCount = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFindItem }
     *     
     */
    public ArrayOfFindItem getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFindItem }
     *     
     */
    public void setItem(ArrayOfFindItem value) {
        this.item = value;
    }

}
