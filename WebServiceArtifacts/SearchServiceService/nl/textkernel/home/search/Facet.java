
package nl.textkernel.home.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for facet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="facet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://home.textkernel.nl/search}datatype" minOccurs="0"/>
 *         &lt;element name="combinationType" type="{http://home.textkernel.nl/search}combinationtype" minOccurs="0"/>
 *         &lt;element name="guiType" type="{http://home.textkernel.nl/search}guitype" minOccurs="0"/>
 *         &lt;element name="cloudType" type="{http://home.textkernel.nl/search}cloudtype" minOccurs="0"/>
 *         &lt;element name="collapsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hideFacetIfAllZero" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hideZeroCountItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultCondition" type="{http://home.textkernel.nl/search}condition" minOccurs="0"/>
 *         &lt;element name="hideConditionWidget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reverseItemOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="items" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distances" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="textInputOnFacet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="childFacets" type="{http://home.textkernel.nl/search}facet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facet", propOrder = {
    "field",
    "dataType",
    "combinationType",
    "guiType",
    "cloudType",
    "collapsed",
    "hideFacetIfAllZero",
    "hideZeroCountItems",
    "defaultCondition",
    "hideConditionWidget",
    "reverseItemOrder",
    "items",
    "distances",
    "textInputOnFacet",
    "groupName",
    "childFacets"
})
public class Facet {

    protected String field;
    @XmlSchemaType(name = "string")
    protected Datatype dataType;
    @XmlSchemaType(name = "string")
    protected Combinationtype combinationType;
    @XmlSchemaType(name = "string")
    protected Guitype guiType;
    @XmlSchemaType(name = "string")
    protected Cloudtype cloudType;
    protected Boolean collapsed;
    protected Boolean hideFacetIfAllZero;
    protected Boolean hideZeroCountItems;
    @XmlSchemaType(name = "string")
    protected Condition defaultCondition;
    protected Boolean hideConditionWidget;
    protected Boolean reverseItemOrder;
    @XmlElement(nillable = true)
    protected List<String> items;
    @XmlElement(nillable = true)
    protected List<String> distances;
    protected Boolean textInputOnFacet;
    protected String groupName;
    @XmlElement(nillable = true)
    protected List<Facet> childFacets;

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link Datatype }
     *     
     */
    public Datatype getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Datatype }
     *     
     */
    public void setDataType(Datatype value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the combinationType property.
     * 
     * @return
     *     possible object is
     *     {@link Combinationtype }
     *     
     */
    public Combinationtype getCombinationType() {
        return combinationType;
    }

    /**
     * Sets the value of the combinationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Combinationtype }
     *     
     */
    public void setCombinationType(Combinationtype value) {
        this.combinationType = value;
    }

    /**
     * Gets the value of the guiType property.
     * 
     * @return
     *     possible object is
     *     {@link Guitype }
     *     
     */
    public Guitype getGuiType() {
        return guiType;
    }

    /**
     * Sets the value of the guiType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guitype }
     *     
     */
    public void setGuiType(Guitype value) {
        this.guiType = value;
    }

    /**
     * Gets the value of the cloudType property.
     * 
     * @return
     *     possible object is
     *     {@link Cloudtype }
     *     
     */
    public Cloudtype getCloudType() {
        return cloudType;
    }

    /**
     * Sets the value of the cloudType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cloudtype }
     *     
     */
    public void setCloudType(Cloudtype value) {
        this.cloudType = value;
    }

    /**
     * Gets the value of the collapsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollapsed() {
        return collapsed;
    }

    /**
     * Sets the value of the collapsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollapsed(Boolean value) {
        this.collapsed = value;
    }

    /**
     * Gets the value of the hideFacetIfAllZero property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideFacetIfAllZero() {
        return hideFacetIfAllZero;
    }

    /**
     * Sets the value of the hideFacetIfAllZero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideFacetIfAllZero(Boolean value) {
        this.hideFacetIfAllZero = value;
    }

    /**
     * Gets the value of the hideZeroCountItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideZeroCountItems() {
        return hideZeroCountItems;
    }

    /**
     * Sets the value of the hideZeroCountItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideZeroCountItems(Boolean value) {
        this.hideZeroCountItems = value;
    }

    /**
     * Gets the value of the defaultCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getDefaultCondition() {
        return defaultCondition;
    }

    /**
     * Sets the value of the defaultCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setDefaultCondition(Condition value) {
        this.defaultCondition = value;
    }

    /**
     * Gets the value of the hideConditionWidget property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideConditionWidget() {
        return hideConditionWidget;
    }

    /**
     * Sets the value of the hideConditionWidget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideConditionWidget(Boolean value) {
        this.hideConditionWidget = value;
    }

    /**
     * Gets the value of the reverseItemOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverseItemOrder() {
        return reverseItemOrder;
    }

    /**
     * Sets the value of the reverseItemOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverseItemOrder(Boolean value) {
        this.reverseItemOrder = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getItems() {
        if (items == null) {
            items = new ArrayList<String>();
        }
        return this.items;
    }

    /**
     * Gets the value of the distances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDistances() {
        if (distances == null) {
            distances = new ArrayList<String>();
        }
        return this.distances;
    }

    /**
     * Gets the value of the textInputOnFacet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTextInputOnFacet() {
        return textInputOnFacet;
    }

    /**
     * Sets the value of the textInputOnFacet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextInputOnFacet(Boolean value) {
        this.textInputOnFacet = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the childFacets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childFacets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildFacets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Facet }
     * 
     * 
     */
    public List<Facet> getChildFacets() {
        if (childFacets == null) {
            childFacets = new ArrayList<Facet>();
        }
        return this.childFacets;
    }

}
