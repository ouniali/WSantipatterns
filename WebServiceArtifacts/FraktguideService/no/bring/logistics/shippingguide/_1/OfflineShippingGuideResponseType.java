
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineShippingGuideResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineShippingGuideResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataInformation" type="{http://www.bring.no/logistics/shippingguide/1.0}OfflineDataInformationType"/>
 *         &lt;element name="Products" type="{http://www.bring.no/logistics/shippingguide/1.0}OfflineProductsType"/>
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
@XmlType(name = "OfflineShippingGuideResponseType", propOrder = {
    "dataInformation",
    "products",
    "traceMessages"
})
public class OfflineShippingGuideResponseType {

    @XmlElement(name = "DataInformation", required = true)
    protected OfflineDataInformationType dataInformation;
    @XmlElement(name = "Products", required = true)
    protected OfflineProductsType products;
    @XmlElement(name = "TraceMessages")
    protected TraceType traceMessages;

    /**
     * Gets the value of the dataInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OfflineDataInformationType }
     *     
     */
    public OfflineDataInformationType getDataInformation() {
        return dataInformation;
    }

    /**
     * Sets the value of the dataInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflineDataInformationType }
     *     
     */
    public void setDataInformation(OfflineDataInformationType value) {
        this.dataInformation = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link OfflineProductsType }
     *     
     */
    public OfflineProductsType getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflineProductsType }
     *     
     */
    public void setProducts(OfflineProductsType value) {
        this.products = value;
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
