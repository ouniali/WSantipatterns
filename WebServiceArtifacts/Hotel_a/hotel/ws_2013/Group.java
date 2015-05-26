
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubGroups" type="{WS_2013.Hotel}ArrayOfSubGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", propOrder = {
    "name",
    "subGroups"
})
public class Group {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SubGroups")
    protected ArrayOfSubGroup subGroups;

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
     * Gets the value of the subGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubGroup }
     *     
     */
    public ArrayOfSubGroup getSubGroups() {
        return subGroups;
    }

    /**
     * Sets the value of the subGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubGroup }
     *     
     */
    public void setSubGroups(ArrayOfSubGroup value) {
        this.subGroups = value;
    }

}
