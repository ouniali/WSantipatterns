
package nl.ru.cmbi.mrs.mrsws.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BooleanQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BooleanQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operation" type="{http://mrs.cmbi.ru.nl/mrsws/search}BooleanQueryOperation"/>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leafs" type="{http://mrs.cmbi.ru.nl/mrsws/search}BooleanQuery" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BooleanQuery", propOrder = {
    "operation",
    "index",
    "value",
    "leafs"
})
public class BooleanQuery {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BooleanQueryOperation operation;
    @XmlElement(required = true)
    protected String index;
    @XmlElement(required = true)
    protected String value;
    protected List<BooleanQuery> leafs;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanQueryOperation }
     *     
     */
    public BooleanQueryOperation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanQueryOperation }
     *     
     */
    public void setOperation(BooleanQueryOperation value) {
        this.operation = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the leafs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leafs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeafs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BooleanQuery }
     * 
     * 
     */
    public List<BooleanQuery> getLeafs() {
        if (leafs == null) {
            leafs = new ArrayList<BooleanQuery>();
        }
        return this.leafs;
    }

}
