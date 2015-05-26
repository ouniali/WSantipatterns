
package com.flightexplorer.webservices;

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
 *         &lt;element name="Userid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScratchPad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ImageHeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "userid",
    "password",
    "acid",
    "alias",
    "scratchPad",
    "imageFlags",
    "imageWidth",
    "imageHeight"
})
@XmlRootElement(name = "GetFlightImage")
public class GetFlightImage {

    @XmlElement(name = "Userid")
    protected String userid;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "ACID")
    protected String acid;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "ScratchPad")
    protected String scratchPad;
    @XmlElement(name = "ImageFlags")
    protected String imageFlags;
    @XmlElement(name = "ImageWidth")
    protected int imageWidth;
    @XmlElement(name = "ImageHeight")
    protected int imageHeight;

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the acid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACID() {
        return acid;
    }

    /**
     * Sets the value of the acid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACID(String value) {
        this.acid = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the scratchPad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScratchPad() {
        return scratchPad;
    }

    /**
     * Sets the value of the scratchPad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScratchPad(String value) {
        this.scratchPad = value;
    }

    /**
     * Gets the value of the imageFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFlags() {
        return imageFlags;
    }

    /**
     * Sets the value of the imageFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFlags(String value) {
        this.imageFlags = value;
    }

    /**
     * Gets the value of the imageWidth property.
     * 
     */
    public int getImageWidth() {
        return imageWidth;
    }

    /**
     * Sets the value of the imageWidth property.
     * 
     */
    public void setImageWidth(int value) {
        this.imageWidth = value;
    }

    /**
     * Gets the value of the imageHeight property.
     * 
     */
    public int getImageHeight() {
        return imageHeight;
    }

    /**
     * Sets the value of the imageHeight property.
     * 
     */
    public void setImageHeight(int value) {
        this.imageHeight = value;
    }

}
