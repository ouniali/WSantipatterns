
package trainticket.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrainSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EquipmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrainNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainSearch", propOrder = {
    "equipmentCode",
    "equipmentDescription",
    "trainNumber"
})
public class TrainSearch {

    @XmlElement(name = "EquipmentCode")
    protected String equipmentCode;
    @XmlElement(name = "EquipmentDescription")
    protected String equipmentDescription;
    @XmlElement(name = "TrainNumber")
    protected int trainNumber;

    /**
     * Gets the value of the equipmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentCode() {
        return equipmentCode;
    }

    /**
     * Sets the value of the equipmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentCode(String value) {
        this.equipmentCode = value;
    }

    /**
     * Gets the value of the equipmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentDescription() {
        return equipmentDescription;
    }

    /**
     * Sets the value of the equipmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentDescription(String value) {
        this.equipmentDescription = value;
    }

    /**
     * Gets the value of the trainNumber property.
     * 
     */
    public int getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     */
    public void setTrainNumber(int value) {
        this.trainNumber = value;
    }

}
