
package org.datacontract.schemas._2004._07.mouzenidis_services_objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mouzenidis_services.Tour;


/**
 * <p>Java class for DictionaryBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DictionaryBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodeGlobal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupNameLat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameLat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DictionaryBase", propOrder = {
    "code",
    "codeGlobal",
    "groupName",
    "groupNameLat",
    "groupOrder",
    "id",
    "name",
    "nameLat",
    "order"
})
@XmlSeeAlso({
    Tour.class,
    TourDate.class,
    HotelFacility.class,
    HotelCategory.class,
    Meal.class,
    AirSeason.class,
    HotelGroup.class,
    RoomType.class,
    TypeTour.class,
    RealCourse.class,
    TouristCountDetail.class,
    AddDescript2 .class,
    AddDescript1 .class,
    Rate.class,
    ServiceList.class,
    Tariff.class,
    HotelRoom.class,
    Service.class,
    City.class,
    Charter.class,
    RoomCategory.class,
    AirLine.class,
    Airport.class,
    Transfer.class,
    Country.class,
    Accommodation.class,
    Transport.class,
    Aircraft.class,
    Hotel.class
})
public class DictionaryBase {

    @XmlElementRef(name = "Code", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "CodeGlobal", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeGlobal;
    @XmlElementRef(name = "GroupName", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupName;
    @XmlElementRef(name = "GroupNameLat", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupNameLat;
    @XmlElement(name = "GroupOrder")
    protected Integer groupOrder;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "NameLat", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nameLat;
    @XmlElement(name = "Order")
    protected Integer order;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCode(JAXBElement<String> value) {
        this.code = value;
    }

    /**
     * Gets the value of the codeGlobal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeGlobal() {
        return codeGlobal;
    }

    /**
     * Sets the value of the codeGlobal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeGlobal(JAXBElement<String> value) {
        this.codeGlobal = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupName(JAXBElement<String> value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the groupNameLat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupNameLat() {
        return groupNameLat;
    }

    /**
     * Sets the value of the groupNameLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupNameLat(JAXBElement<String> value) {
        this.groupNameLat = value;
    }

    /**
     * Gets the value of the groupOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupOrder() {
        return groupOrder;
    }

    /**
     * Sets the value of the groupOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupOrder(Integer value) {
        this.groupOrder = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameLat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameLat() {
        return nameLat;
    }

    /**
     * Sets the value of the nameLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameLat(JAXBElement<String> value) {
        this.nameLat = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

}
