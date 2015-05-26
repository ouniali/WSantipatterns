
package nl.textkernel.home.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="environment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessOptions" type="{http://home.textkernel.nl/search}accessOptions" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userOptions" type="{http://home.textkernel.nl/search}userOptions" minOccurs="0"/>
 *         &lt;element name="accessRoles" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMetadata", propOrder = {
    "environment",
    "password",
    "accessOptions",
    "language",
    "userOptions",
    "accessRoles"
})
public class GetMetadata {

    protected String environment;
    protected String password;
    protected AccessOptions accessOptions;
    protected String language;
    protected UserOptions userOptions;
    protected List<String> accessRoles;

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironment(String value) {
        this.environment = value;
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
     * Gets the value of the accessOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AccessOptions }
     *     
     */
    public AccessOptions getAccessOptions() {
        return accessOptions;
    }

    /**
     * Sets the value of the accessOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessOptions }
     *     
     */
    public void setAccessOptions(AccessOptions value) {
        this.accessOptions = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the userOptions property.
     * 
     * @return
     *     possible object is
     *     {@link UserOptions }
     *     
     */
    public UserOptions getUserOptions() {
        return userOptions;
    }

    /**
     * Sets the value of the userOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserOptions }
     *     
     */
    public void setUserOptions(UserOptions value) {
        this.userOptions = value;
    }

    /**
     * Gets the value of the accessRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccessRoles() {
        if (accessRoles == null) {
            accessRoles = new ArrayList<String>();
        }
        return this.accessRoles;
    }

}
