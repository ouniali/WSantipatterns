
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Browser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Browser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DotNetVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cookies" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Frames" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="JavaApplets" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="JavaScript" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VBScript" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Browser", propOrder = {
    "name",
    "version",
    "platform",
    "dotNetVersion",
    "cookies",
    "frames",
    "javaApplets",
    "javaScript",
    "vbScript"
})
public class Browser {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Platform")
    protected String platform;
    @XmlElement(name = "DotNetVersion")
    protected String dotNetVersion;
    @XmlElement(name = "Cookies")
    protected boolean cookies;
    @XmlElement(name = "Frames")
    protected boolean frames;
    @XmlElement(name = "JavaApplets")
    protected boolean javaApplets;
    @XmlElement(name = "JavaScript")
    protected boolean javaScript;
    @XmlElement(name = "VBScript")
    protected boolean vbScript;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatform(String value) {
        this.platform = value;
    }

    /**
     * Gets the value of the dotNetVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDotNetVersion() {
        return dotNetVersion;
    }

    /**
     * Sets the value of the dotNetVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDotNetVersion(String value) {
        this.dotNetVersion = value;
    }

    /**
     * Gets the value of the cookies property.
     * 
     */
    public boolean isCookies() {
        return cookies;
    }

    /**
     * Sets the value of the cookies property.
     * 
     */
    public void setCookies(boolean value) {
        this.cookies = value;
    }

    /**
     * Gets the value of the frames property.
     * 
     */
    public boolean isFrames() {
        return frames;
    }

    /**
     * Sets the value of the frames property.
     * 
     */
    public void setFrames(boolean value) {
        this.frames = value;
    }

    /**
     * Gets the value of the javaApplets property.
     * 
     */
    public boolean isJavaApplets() {
        return javaApplets;
    }

    /**
     * Sets the value of the javaApplets property.
     * 
     */
    public void setJavaApplets(boolean value) {
        this.javaApplets = value;
    }

    /**
     * Gets the value of the javaScript property.
     * 
     */
    public boolean isJavaScript() {
        return javaScript;
    }

    /**
     * Sets the value of the javaScript property.
     * 
     */
    public void setJavaScript(boolean value) {
        this.javaScript = value;
    }

    /**
     * Gets the value of the vbScript property.
     * 
     */
    public boolean isVBScript() {
        return vbScript;
    }

    /**
     * Sets the value of the vbScript property.
     * 
     */
    public void setVBScript(boolean value) {
        this.vbScript = value;
    }

}
