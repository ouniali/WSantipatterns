
package com.familytreemaker.service.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.familytreemaker.service.EndpointType;
import com.familytreemaker.service.MediaType;


/**
 * <p>Java class for RecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Focus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Clans" type="{urn:service.familytreemaker.com/Search}ArrayOfClanType" minOccurs="0"/>
 *         &lt;element name="People" type="{urn:service.familytreemaker.com/Search}ArrayOfPersonType" minOccurs="0"/>
 *         &lt;element name="Citation" type="{urn:service.familytreemaker.com/Search}CitationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:service.familytreemaker.com/Search}SourceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Repository" type="{urn:service.familytreemaker.com/Search}RepositoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Media" type="{urn:service.familytreemaker.com}MediaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="View" type="{urn:service.familytreemaker.com}EndpointType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProviderID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordType", propOrder = {
    "focus",
    "clans",
    "people",
    "citation",
    "source",
    "repository",
    "media",
    "view"
})
public class RecordType {

    @XmlElement(name = "Focus")
    protected String focus;
    @XmlElement(name = "Clans")
    protected ArrayOfClanType clans;
    @XmlElement(name = "People")
    protected ArrayOfPersonType people;
    @XmlElement(name = "Citation")
    protected List<CitationType> citation;
    @XmlElement(name = "Source")
    protected List<SourceType> source;
    @XmlElement(name = "Repository")
    protected List<RepositoryType> repository;
    @XmlElement(name = "Media")
    protected List<MediaType> media;
    @XmlElement(name = "View")
    protected EndpointType view;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "ProviderID")
    protected Integer providerID;
    @XmlAttribute(name = "PID")
    protected String pid;

    /**
     * Gets the value of the focus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocus() {
        return focus;
    }

    /**
     * Sets the value of the focus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocus(String value) {
        this.focus = value;
    }

    /**
     * Gets the value of the clans property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClanType }
     *     
     */
    public ArrayOfClanType getClans() {
        return clans;
    }

    /**
     * Sets the value of the clans property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClanType }
     *     
     */
    public void setClans(ArrayOfClanType value) {
        this.clans = value;
    }

    /**
     * Gets the value of the people property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonType }
     *     
     */
    public ArrayOfPersonType getPeople() {
        return people;
    }

    /**
     * Sets the value of the people property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonType }
     *     
     */
    public void setPeople(ArrayOfPersonType value) {
        this.people = value;
    }

    /**
     * Gets the value of the citation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitationType }
     * 
     * 
     */
    public List<CitationType> getCitation() {
        if (citation == null) {
            citation = new ArrayList<CitationType>();
        }
        return this.citation;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceType }
     * 
     * 
     */
    public List<SourceType> getSource() {
        if (source == null) {
            source = new ArrayList<SourceType>();
        }
        return this.source;
    }

    /**
     * Gets the value of the repository property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repository property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepository().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepositoryType }
     * 
     * 
     */
    public List<RepositoryType> getRepository() {
        if (repository == null) {
            repository = new ArrayList<RepositoryType>();
        }
        return this.repository;
    }

    /**
     * Gets the value of the media property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the media property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaType }
     * 
     * 
     */
    public List<MediaType> getMedia() {
        if (media == null) {
            media = new ArrayList<MediaType>();
        }
        return this.media;
    }

    /**
     * Gets the value of the view property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointType }
     *     
     */
    public EndpointType getView() {
        return view;
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointType }
     *     
     */
    public void setView(EndpointType value) {
        this.view = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProviderID(Integer value) {
        this.providerID = value;
    }

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPID() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPID(String value) {
        this.pid = value;
    }

}
