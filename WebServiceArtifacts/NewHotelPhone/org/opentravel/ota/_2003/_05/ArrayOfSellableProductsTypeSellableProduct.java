
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSellableProductsTypeSellableProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSellableProductsTypeSellableProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellableProduct" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DestinationSystemCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSellableProductsTypeSellableProductDestinationSystemCode" minOccurs="0"/>
 *                   &lt;choice>
 *                     &lt;element name="InventoryBlock" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="GuestRoom" type="{http://www.opentravel.org/OTA/2003/05}GuestRoomType" minOccurs="0"/>
 *                     &lt;element name="MeetingRooms" type="{http://www.opentravel.org/OTA/2003/05}MeetingRoomsType" minOccurs="0"/>
 *                   &lt;/choice>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                 &lt;attribute name="InvNotifType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="New"/>
 *                       &lt;enumeration value="Delta"/>
 *                       &lt;enumeration value="Overlay"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="InvStatusType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Initial"/>
 *                       &lt;enumeration value="Active"/>
 *                       &lt;enumeration value="Deactivated"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="InvGroupingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OrderSequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfSellableProductsTypeSellableProduct", propOrder = {
    "sellableProduct"
})
public class ArrayOfSellableProductsTypeSellableProduct {

    @XmlElement(name = "SellableProduct")
    protected List<ArrayOfSellableProductsTypeSellableProduct.SellableProduct> sellableProduct;

    /**
     * Gets the value of the sellableProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellableProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellableProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfSellableProductsTypeSellableProduct.SellableProduct }
     * 
     * 
     */
    public List<ArrayOfSellableProductsTypeSellableProduct.SellableProduct> getSellableProduct() {
        if (sellableProduct == null) {
            sellableProduct = new ArrayList<ArrayOfSellableProductsTypeSellableProduct.SellableProduct>();
        }
        return this.sellableProduct;
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
     *       &lt;sequence>
     *         &lt;element name="DestinationSystemCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSellableProductsTypeSellableProductDestinationSystemCode" minOccurs="0"/>
     *         &lt;choice>
     *           &lt;element name="InventoryBlock" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="GuestRoom" type="{http://www.opentravel.org/OTA/2003/05}GuestRoomType" minOccurs="0"/>
     *           &lt;element name="MeetingRooms" type="{http://www.opentravel.org/OTA/2003/05}MeetingRoomsType" minOccurs="0"/>
     *         &lt;/choice>
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *       &lt;attribute name="InvNotifType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="New"/>
     *             &lt;enumeration value="Delta"/>
     *             &lt;enumeration value="Overlay"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="InvStatusType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Initial"/>
     *             &lt;enumeration value="Active"/>
     *             &lt;enumeration value="Deactivated"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="InvGroupingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OrderSequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "destinationSystemCodes",
        "inventoryBlock",
        "guestRoom",
        "meetingRooms",
        "description",
        "uniqueID"
    })
    public static class SellableProduct {

        @XmlElement(name = "DestinationSystemCodes")
        protected ArrayOfSellableProductsTypeSellableProductDestinationSystemCode destinationSystemCodes;
        @XmlElement(name = "InventoryBlock")
        protected ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock inventoryBlock;
        @XmlElement(name = "GuestRoom")
        protected GuestRoomType guestRoom;
        @XmlElement(name = "MeetingRooms")
        protected MeetingRoomsType meetingRooms;
        @XmlElement(name = "Description")
        protected ParagraphType description;
        @XmlElement(name = "UniqueID")
        protected UniqueIDType uniqueID;
        @XmlAttribute(name = "RPH")
        protected String rph;
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
        @XmlAttribute(name = "InvNotifType")
        protected String invNotifType;
        @XmlAttribute(name = "InvStatusType")
        protected String invStatusType;
        @XmlAttribute(name = "InvGroupingCode")
        protected String invGroupingCode;
        @XmlAttribute(name = "OrderSequence")
        protected BigInteger orderSequence;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;

        /**
         * Gets the value of the destinationSystemCodes property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfSellableProductsTypeSellableProductDestinationSystemCode }
         *     
         */
        public ArrayOfSellableProductsTypeSellableProductDestinationSystemCode getDestinationSystemCodes() {
            return destinationSystemCodes;
        }

        /**
         * Sets the value of the destinationSystemCodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSellableProductsTypeSellableProductDestinationSystemCode }
         *     
         */
        public void setDestinationSystemCodes(ArrayOfSellableProductsTypeSellableProductDestinationSystemCode value) {
            this.destinationSystemCodes = value;
        }

        /**
         * Gets the value of the inventoryBlock property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock }
         *     
         */
        public ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock getInventoryBlock() {
            return inventoryBlock;
        }

        /**
         * Sets the value of the inventoryBlock property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock }
         *     
         */
        public void setInventoryBlock(ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock value) {
            this.inventoryBlock = value;
        }

        /**
         * Gets the value of the guestRoom property.
         * 
         * @return
         *     possible object is
         *     {@link GuestRoomType }
         *     
         */
        public GuestRoomType getGuestRoom() {
            return guestRoom;
        }

        /**
         * Sets the value of the guestRoom property.
         * 
         * @param value
         *     allowed object is
         *     {@link GuestRoomType }
         *     
         */
        public void setGuestRoom(GuestRoomType value) {
            this.guestRoom = value;
        }

        /**
         * Gets the value of the meetingRooms property.
         * 
         * @return
         *     possible object is
         *     {@link MeetingRoomsType }
         *     
         */
        public MeetingRoomsType getMeetingRooms() {
            return meetingRooms;
        }

        /**
         * Sets the value of the meetingRooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeetingRoomsType }
         *     
         */
        public void setMeetingRooms(MeetingRoomsType value) {
            this.meetingRooms = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link ParagraphType }
         *     
         */
        public ParagraphType getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link ParagraphType }
         *     
         */
        public void setDescription(ParagraphType value) {
            this.description = value;
        }

        /**
         * Gets the value of the uniqueID property.
         * 
         * @return
         *     possible object is
         *     {@link UniqueIDType }
         *     
         */
        public UniqueIDType getUniqueID() {
            return uniqueID;
        }

        /**
         * Sets the value of the uniqueID property.
         * 
         * @param value
         *     allowed object is
         *     {@link UniqueIDType }
         *     
         */
        public void setUniqueID(UniqueIDType value) {
            this.uniqueID = value;
        }

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

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
         * Gets the value of the invNotifType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvNotifType() {
            return invNotifType;
        }

        /**
         * Sets the value of the invNotifType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvNotifType(String value) {
            this.invNotifType = value;
        }

        /**
         * Gets the value of the invStatusType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvStatusType() {
            return invStatusType;
        }

        /**
         * Sets the value of the invStatusType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvStatusType(String value) {
            this.invStatusType = value;
        }

        /**
         * Gets the value of the invGroupingCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvGroupingCode() {
            return invGroupingCode;
        }

        /**
         * Sets the value of the invGroupingCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvGroupingCode(String value) {
            this.invGroupingCode = value;
        }

        /**
         * Gets the value of the orderSequence property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrderSequence() {
            return orderSequence;
        }

        /**
         * Sets the value of the orderSequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrderSequence(BigInteger value) {
            this.orderSequence = value;
        }

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
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
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InventoryBlock {

            @XmlAttribute(name = "Code")
            protected String code;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

        }

    }

}
