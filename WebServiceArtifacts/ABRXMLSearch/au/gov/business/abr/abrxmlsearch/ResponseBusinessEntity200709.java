
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseBusinessEntity200709 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseBusinessEntity200709">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}ResponseBusinessEntity200506">
 *       &lt;sequence>
 *         &lt;element name="superannuationStatus" type="{http://abr.business.gov.au/ABRXMLSearch/}SuperannuationStatus" minOccurs="0"/>
 *         &lt;element name="mainPostalPhysicalAddress" type="{http://abr.business.gov.au/ABRXMLSearch/}AddressFull" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBusinessEntity200709", propOrder = {
    "superannuationStatus",
    "mainPostalPhysicalAddress"
})
@XmlSeeAlso({
    ResponseBusinessEntity201205 .class
})
public class ResponseBusinessEntity200709
    extends ResponseBusinessEntity200506
{

    protected SuperannuationStatus superannuationStatus;
    protected AddressFull mainPostalPhysicalAddress;

    /**
     * Gets the value of the superannuationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SuperannuationStatus }
     *     
     */
    public SuperannuationStatus getSuperannuationStatus() {
        return superannuationStatus;
    }

    /**
     * Sets the value of the superannuationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuperannuationStatus }
     *     
     */
    public void setSuperannuationStatus(SuperannuationStatus value) {
        this.superannuationStatus = value;
    }

    /**
     * Gets the value of the mainPostalPhysicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressFull }
     *     
     */
    public AddressFull getMainPostalPhysicalAddress() {
        return mainPostalPhysicalAddress;
    }

    /**
     * Sets the value of the mainPostalPhysicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressFull }
     *     
     */
    public void setMainPostalPhysicalAddress(AddressFull value) {
        this.mainPostalPhysicalAddress = value;
    }

}
