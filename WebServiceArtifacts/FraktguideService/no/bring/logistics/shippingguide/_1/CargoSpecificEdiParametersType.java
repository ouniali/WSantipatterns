
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 This section holds the data required to make a booking for Cargo.
 *             
 * 
 * <p>Java class for CargoSpecificEdiParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CargoSpecificEdiParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DispatchAgentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CargoTransportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CargoProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargoSpecificEdiParametersType", propOrder = {
    "dispatchAgentNumber",
    "cargoTransportType",
    "cargoProduct"
})
public class CargoSpecificEdiParametersType {

    @XmlElement(name = "DispatchAgentNumber", required = true)
    protected String dispatchAgentNumber;
    @XmlElement(name = "CargoTransportType")
    protected String cargoTransportType;
    @XmlElement(name = "CargoProduct")
    protected String cargoProduct;

    /**
     * Gets the value of the dispatchAgentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchAgentNumber() {
        return dispatchAgentNumber;
    }

    /**
     * Sets the value of the dispatchAgentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchAgentNumber(String value) {
        this.dispatchAgentNumber = value;
    }

    /**
     * Gets the value of the cargoTransportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoTransportType() {
        return cargoTransportType;
    }

    /**
     * Sets the value of the cargoTransportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoTransportType(String value) {
        this.cargoTransportType = value;
    }

    /**
     * Gets the value of the cargoProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoProduct() {
        return cargoProduct;
    }

    /**
     * Sets the value of the cargoProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoProduct(String value) {
        this.cargoProduct = value;
    }

}
