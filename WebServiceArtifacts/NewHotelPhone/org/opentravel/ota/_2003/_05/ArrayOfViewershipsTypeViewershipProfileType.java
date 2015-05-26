
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfViewershipsTypeViewershipProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfViewershipsTypeViewershipProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfileType" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
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
@XmlType(name = "ArrayOfViewershipsTypeViewershipProfileType", propOrder = {
    "profileType"
})
public class ArrayOfViewershipsTypeViewershipProfileType {

    @XmlElement(name = "ProfileType")
    protected List<ArrayOfViewershipsTypeViewershipProfileType.ProfileType> profileType;

    /**
     * Gets the value of the profileType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfViewershipsTypeViewershipProfileType.ProfileType }
     * 
     * 
     */
    public List<ArrayOfViewershipsTypeViewershipProfileType.ProfileType> getProfileType() {
        if (profileType == null) {
            profileType = new ArrayList<ArrayOfViewershipsTypeViewershipProfileType.ProfileType>();
        }
        return this.profileType;
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
     *       &lt;attribute name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProfileType {

        @XmlAttribute(name = "ProfileType")
        protected String profileType;

        /**
         * Gets the value of the profileType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfileType() {
            return profileType;
        }

        /**
         * Sets the value of the profileType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfileType(String value) {
            this.profileType = value;
        }

    }

}
