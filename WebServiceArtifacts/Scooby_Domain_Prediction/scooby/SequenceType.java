
package scooby;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sequenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sequenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{Scooby}seqId"/>
 *         &lt;element name="ranks" type="{Scooby}ranksType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="protID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sequenceType", propOrder = {
    "id",
    "ranks"
})
public class SequenceType {

    @XmlElement(required = true)
    protected SeqId id;
    @XmlElement(required = true)
    protected RanksType ranks;
    @XmlAttribute(name = "protID", required = true)
    protected String protID;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SeqId }
     *     
     */
    public SeqId getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeqId }
     *     
     */
    public void setId(SeqId value) {
        this.id = value;
    }

    /**
     * Gets the value of the ranks property.
     * 
     * @return
     *     possible object is
     *     {@link RanksType }
     *     
     */
    public RanksType getRanks() {
        return ranks;
    }

    /**
     * Sets the value of the ranks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RanksType }
     *     
     */
    public void setRanks(RanksType value) {
        this.ranks = value;
    }

    /**
     * Gets the value of the protID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtID() {
        return protID;
    }

    /**
     * Sets the value of the protID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtID(String value) {
        this.protID = value;
    }

}
