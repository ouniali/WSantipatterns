
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOfferTypeOfferRuleInventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOfferTypeOfferRuleInventory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Inventory" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="InvCodeApplication">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="DoesNotApply"/>
 *                       &lt;enumeration value="InvCode"/>
 *                       &lt;enumeration value="InvGroupingCode"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AppliesToIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfOfferTypeOfferRuleInventory", propOrder = {
    "inventory"
})
public class ArrayOfOfferTypeOfferRuleInventory {

    @XmlElement(name = "Inventory")
    protected List<ArrayOfOfferTypeOfferRuleInventory.Inventory> inventory;

    /**
     * Gets the value of the inventory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOfferTypeOfferRuleInventory.Inventory }
     * 
     * 
     */
    public List<ArrayOfOfferTypeOfferRuleInventory.Inventory> getInventory() {
        if (inventory == null) {
            inventory = new ArrayList<ArrayOfOfferTypeOfferRuleInventory.Inventory>();
        }
        return this.inventory;
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
     *       &lt;attribute name="InvCodeApplication">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="DoesNotApply"/>
     *             &lt;enumeration value="InvCode"/>
     *             &lt;enumeration value="InvGroupingCode"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AppliesToIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Inventory {

        @XmlAttribute(name = "InvCodeApplication")
        protected String invCodeApplication;
        @XmlAttribute(name = "InvCode")
        protected String invCode;
        @XmlAttribute(name = "InvType")
        protected String invType;
        @XmlAttribute(name = "InvTypeCode")
        protected String invTypeCode;
        @XmlAttribute(name = "IsRoom")
        protected Boolean isRoom;
        @XmlAttribute(name = "AppliesToIndicator", required = true)
        protected boolean appliesToIndicator;

        /**
         * Gets the value of the invCodeApplication property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvCodeApplication() {
            return invCodeApplication;
        }

        /**
         * Sets the value of the invCodeApplication property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvCodeApplication(String value) {
            this.invCodeApplication = value;
        }

        /**
         * Gets the value of the invCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvCode() {
            return invCode;
        }

        /**
         * Sets the value of the invCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvCode(String value) {
            this.invCode = value;
        }

        /**
         * Gets the value of the invType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvType() {
            return invType;
        }

        /**
         * Sets the value of the invType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvType(String value) {
            this.invType = value;
        }

        /**
         * Gets the value of the invTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvTypeCode() {
            return invTypeCode;
        }

        /**
         * Sets the value of the invTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvTypeCode(String value) {
            this.invTypeCode = value;
        }

        /**
         * Gets the value of the isRoom property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsRoom() {
            return isRoom;
        }

        /**
         * Sets the value of the isRoom property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsRoom(Boolean value) {
            this.isRoom = value;
        }

        /**
         * Gets the value of the appliesToIndicator property.
         * 
         */
        public boolean isAppliesToIndicator() {
            return appliesToIndicator;
        }

        /**
         * Sets the value of the appliesToIndicator property.
         * 
         */
        public void setAppliesToIndicator(boolean value) {
            this.appliesToIndicator = value;
        }

    }

}
