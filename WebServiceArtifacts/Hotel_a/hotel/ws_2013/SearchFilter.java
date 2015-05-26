
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SortDirection" type="{WS_2013.Hotel}eSortDirection"/>
 *         &lt;element name="OrderByField" type="{WS_2013.Hotel}eSortField"/>
 *         &lt;element name="From" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Range" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchFilter", propOrder = {
    "sortDirection",
    "orderByField",
    "from",
    "range"
})
public class SearchFilter {

    @XmlElement(name = "SortDirection", required = true)
    @XmlSchemaType(name = "string")
    protected ESortDirection sortDirection;
    @XmlElement(name = "OrderByField", required = true)
    @XmlSchemaType(name = "string")
    protected ESortField orderByField;
    @XmlElement(name = "From")
    protected int from;
    @XmlElement(name = "Range")
    protected int range;

    /**
     * Gets the value of the sortDirection property.
     * 
     * @return
     *     possible object is
     *     {@link ESortDirection }
     *     
     */
    public ESortDirection getSortDirection() {
        return sortDirection;
    }

    /**
     * Sets the value of the sortDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESortDirection }
     *     
     */
    public void setSortDirection(ESortDirection value) {
        this.sortDirection = value;
    }

    /**
     * Gets the value of the orderByField property.
     * 
     * @return
     *     possible object is
     *     {@link ESortField }
     *     
     */
    public ESortField getOrderByField() {
        return orderByField;
    }

    /**
     * Sets the value of the orderByField property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESortField }
     *     
     */
    public void setOrderByField(ESortField value) {
        this.orderByField = value;
    }

    /**
     * Gets the value of the from property.
     * 
     */
    public int getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     */
    public void setFrom(int value) {
        this.from = value;
    }

    /**
     * Gets the value of the range property.
     * 
     */
    public int getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     */
    public void setRange(int value) {
        this.range = value;
    }

}
