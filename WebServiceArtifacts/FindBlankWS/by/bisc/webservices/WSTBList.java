
package by.bisc.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTBList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTBList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TBList" type="{http://www.bisc.by/webservices}ArrayOfWSTBItemWSTBItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTBList", propOrder = {
    "tbList"
})
public class WSTBList {

    @XmlElement(name = "TBList")
    protected ArrayOfWSTBItemWSTBItem tbList;

    /**
     * Gets the value of the tbList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSTBItemWSTBItem }
     *     
     */
    public ArrayOfWSTBItemWSTBItem getTBList() {
        return tbList;
    }

    /**
     * Sets the value of the tbList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSTBItemWSTBItem }
     *     
     */
    public void setTBList(ArrayOfWSTBItemWSTBItem value) {
        this.tbList = value;
    }

}
