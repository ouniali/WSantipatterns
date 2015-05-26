
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingGuideResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingGuideResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Consignment" type="{http://www.bring.no/logistics/shippingguide/1.0}ConsignmentOutputType" minOccurs="0"/>
 *         &lt;element name="Packages" type="{http://www.bring.no/logistics/shippingguide/1.0}PackagesOutputType" minOccurs="0"/>
 *         &lt;element name="TraceMessages" type="{http://www.bring.no/logistics/shippingguide/1.0}TraceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingGuideResponseType", propOrder = {
    "consignment",
    "packages",
    "traceMessages"
})
public class ShippingGuideResponseType {

    @XmlElement(name = "Consignment")
    protected ConsignmentOutputType consignment;
    @XmlElement(name = "Packages")
    protected PackagesOutputType packages;
    @XmlElement(name = "TraceMessages")
    protected TraceType traceMessages;

    /**
     * Gets the value of the consignment property.
     * 
     * @return
     *     possible object is
     *     {@link ConsignmentOutputType }
     *     
     */
    public ConsignmentOutputType getConsignment() {
        return consignment;
    }

    /**
     * Sets the value of the consignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignmentOutputType }
     *     
     */
    public void setConsignment(ConsignmentOutputType value) {
        this.consignment = value;
    }

    /**
     * Gets the value of the packages property.
     * 
     * @return
     *     possible object is
     *     {@link PackagesOutputType }
     *     
     */
    public PackagesOutputType getPackages() {
        return packages;
    }

    /**
     * Sets the value of the packages property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagesOutputType }
     *     
     */
    public void setPackages(PackagesOutputType value) {
        this.packages = value;
    }

    /**
     * Gets the value of the traceMessages property.
     * 
     * @return
     *     possible object is
     *     {@link TraceType }
     *     
     */
    public TraceType getTraceMessages() {
        return traceMessages;
    }

    /**
     * Sets the value of the traceMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraceType }
     *     
     */
    public void setTraceMessages(TraceType value) {
        this.traceMessages = value;
    }

}
