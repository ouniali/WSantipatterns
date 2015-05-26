
package by.bisc.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSAnswerList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSAnswerList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsFound" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Blanks" type="{http://www.bisc.by/webservices}ArrayOfWSAnswerWSAnswer" minOccurs="0"/>
 *         &lt;element name="BlanksTB" type="{http://www.bisc.by/webservices}ArrayOfBlanksTBItemLong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSAnswerList", propOrder = {
    "isFound",
    "blanks",
    "blanksTB"
})
public class WSAnswerList {

    @XmlElement(name = "IsFound")
    protected Long isFound;
    @XmlElement(name = "Blanks")
    protected ArrayOfWSAnswerWSAnswer blanks;
    @XmlElement(name = "BlanksTB")
    protected ArrayOfBlanksTBItemLong blanksTB;

    /**
     * Gets the value of the isFound property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsFound() {
        return isFound;
    }

    /**
     * Sets the value of the isFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsFound(Long value) {
        this.isFound = value;
    }

    /**
     * Gets the value of the blanks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSAnswerWSAnswer }
     *     
     */
    public ArrayOfWSAnswerWSAnswer getBlanks() {
        return blanks;
    }

    /**
     * Sets the value of the blanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSAnswerWSAnswer }
     *     
     */
    public void setBlanks(ArrayOfWSAnswerWSAnswer value) {
        this.blanks = value;
    }

    /**
     * Gets the value of the blanksTB property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBlanksTBItemLong }
     *     
     */
    public ArrayOfBlanksTBItemLong getBlanksTB() {
        return blanksTB;
    }

    /**
     * Sets the value of the blanksTB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBlanksTBItemLong }
     *     
     */
    public void setBlanksTB(ArrayOfBlanksTBItemLong value) {
        this.blanksTB = value;
    }

}
