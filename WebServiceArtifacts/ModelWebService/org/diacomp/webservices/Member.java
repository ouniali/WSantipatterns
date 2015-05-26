
package org.diacomp.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Member complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Member">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.diacomp.org/webservices/}IDObject">
 *       &lt;sequence>
 *         &lt;element name="MemberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Institution" type="{http://www.diacomp.org/webservices/}Institution" minOccurs="0"/>
 *         &lt;element name="Laboratory" type="{http://www.diacomp.org/webservices/}Laboratory" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact" type="{http://www.diacomp.org/webservices/}Contact" minOccurs="0"/>
 *         &lt;element name="TitleID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="TitleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Member", propOrder = {
    "memberID",
    "institution",
    "laboratory",
    "firstName",
    "lastName",
    "name",
    "commaName",
    "contact",
    "titleID",
    "titleName"
})
@XmlSeeAlso({
    Investigator.class
})
public class Member
    extends IDObject
{

    @XmlElement(name = "MemberID")
    protected String memberID;
    @XmlElement(name = "Institution")
    protected Institution institution;
    @XmlElement(name = "Laboratory")
    protected Laboratory laboratory;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "CommaName")
    protected String commaName;
    @XmlElement(name = "Contact")
    protected Contact contact;
    @XmlElement(name = "TitleID", required = true)
    protected ID titleID;
    @XmlElement(name = "TitleName")
    protected String titleName;

    /**
     * Gets the value of the memberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberID() {
        return memberID;
    }

    /**
     * Sets the value of the memberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberID(String value) {
        this.memberID = value;
    }

    /**
     * Gets the value of the institution property.
     * 
     * @return
     *     possible object is
     *     {@link Institution }
     *     
     */
    public Institution getInstitution() {
        return institution;
    }

    /**
     * Sets the value of the institution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Institution }
     *     
     */
    public void setInstitution(Institution value) {
        this.institution = value;
    }

    /**
     * Gets the value of the laboratory property.
     * 
     * @return
     *     possible object is
     *     {@link Laboratory }
     *     
     */
    public Laboratory getLaboratory() {
        return laboratory;
    }

    /**
     * Sets the value of the laboratory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Laboratory }
     *     
     */
    public void setLaboratory(Laboratory value) {
        this.laboratory = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

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
     * Gets the value of the commaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommaName() {
        return commaName;
    }

    /**
     * Sets the value of the commaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommaName(String value) {
        this.commaName = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the titleID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getTitleID() {
        return titleID;
    }

    /**
     * Sets the value of the titleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setTitleID(ID value) {
        this.titleID = value;
    }

    /**
     * Gets the value of the titleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * Sets the value of the titleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleName(String value) {
        this.titleName = value;
    }

}
