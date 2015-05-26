
package by.bisc.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="FindBlankWSnTBResult" type="{http://www.bisc.by/webservices}WSAnswerList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "findBlankWSnTBResult"
})
@XmlRootElement(name = "FindBlankWSnTBResponse")
public class FindBlankWSnTBResponse {

    @XmlElement(name = "FindBlankWSnTBResult")
    protected WSAnswerList findBlankWSnTBResult;

    /**
     * Gets the value of the findBlankWSnTBResult property.
     * 
     * @return
     *     possible object is
     *     {@link WSAnswerList }
     *     
     */
    public WSAnswerList getFindBlankWSnTBResult() {
        return findBlankWSnTBResult;
    }

    /**
     * Sets the value of the findBlankWSnTBResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSAnswerList }
     *     
     */
    public void setFindBlankWSnTBResult(WSAnswerList value) {
        this.findBlankWSnTBResult = value;
    }

}
