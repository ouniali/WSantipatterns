
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for skybillValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="skybillValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bulkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="content1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customsCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customsValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="evtCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuredCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuredValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="masterSkybillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="shipHour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="skybillRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="weightUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "skybillValue", propOrder = {
    "bulkNumber",
    "codCurrency",
    "codValue",
    "content1",
    "content2",
    "content3",
    "content4",
    "content5",
    "customsCurrency",
    "customsValue",
    "evtCode",
    "insuredCurrency",
    "insuredValue",
    "masterSkybillNumber",
    "objectType",
    "portCurrency",
    "portValue",
    "productCode",
    "service",
    "shipDate",
    "shipHour",
    "skybillRank",
    "weight",
    "weightUnit"
})
@XmlSeeAlso({
    SkybillWithDimensionsValue.class
})
public class SkybillValue {

    protected String bulkNumber;
    protected String codCurrency;
    protected Float codValue;
    protected String content1;
    protected String content2;
    protected String content3;
    protected String content4;
    protected String content5;
    protected String customsCurrency;
    protected Float customsValue;
    protected String evtCode;
    protected String insuredCurrency;
    protected Float insuredValue;
    protected String masterSkybillNumber;
    protected String objectType;
    protected String portCurrency;
    protected Float portValue;
    protected String productCode;
    protected String service;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipDate;
    protected int shipHour;
    protected String skybillRank;
    protected Float weight;
    protected String weightUnit;

    /**
     * Gets the value of the bulkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkNumber() {
        return bulkNumber;
    }

    /**
     * Sets the value of the bulkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkNumber(String value) {
        this.bulkNumber = value;
    }

    /**
     * Gets the value of the codCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCurrency() {
        return codCurrency;
    }

    /**
     * Sets the value of the codCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCurrency(String value) {
        this.codCurrency = value;
    }

    /**
     * Gets the value of the codValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCodValue() {
        return codValue;
    }

    /**
     * Sets the value of the codValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCodValue(Float value) {
        this.codValue = value;
    }

    /**
     * Gets the value of the content1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent1() {
        return content1;
    }

    /**
     * Sets the value of the content1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent1(String value) {
        this.content1 = value;
    }

    /**
     * Gets the value of the content2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent2() {
        return content2;
    }

    /**
     * Sets the value of the content2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent2(String value) {
        this.content2 = value;
    }

    /**
     * Gets the value of the content3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent3() {
        return content3;
    }

    /**
     * Sets the value of the content3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent3(String value) {
        this.content3 = value;
    }

    /**
     * Gets the value of the content4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent4() {
        return content4;
    }

    /**
     * Sets the value of the content4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent4(String value) {
        this.content4 = value;
    }

    /**
     * Gets the value of the content5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent5() {
        return content5;
    }

    /**
     * Sets the value of the content5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent5(String value) {
        this.content5 = value;
    }

    /**
     * Gets the value of the customsCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsCurrency() {
        return customsCurrency;
    }

    /**
     * Sets the value of the customsCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsCurrency(String value) {
        this.customsCurrency = value;
    }

    /**
     * Gets the value of the customsValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCustomsValue() {
        return customsValue;
    }

    /**
     * Sets the value of the customsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCustomsValue(Float value) {
        this.customsValue = value;
    }

    /**
     * Gets the value of the evtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtCode() {
        return evtCode;
    }

    /**
     * Sets the value of the evtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtCode(String value) {
        this.evtCode = value;
    }

    /**
     * Gets the value of the insuredCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredCurrency() {
        return insuredCurrency;
    }

    /**
     * Sets the value of the insuredCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredCurrency(String value) {
        this.insuredCurrency = value;
    }

    /**
     * Gets the value of the insuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInsuredValue() {
        return insuredValue;
    }

    /**
     * Sets the value of the insuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInsuredValue(Float value) {
        this.insuredValue = value;
    }

    /**
     * Gets the value of the masterSkybillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterSkybillNumber() {
        return masterSkybillNumber;
    }

    /**
     * Sets the value of the masterSkybillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterSkybillNumber(String value) {
        this.masterSkybillNumber = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the portCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortCurrency() {
        return portCurrency;
    }

    /**
     * Sets the value of the portCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortCurrency(String value) {
        this.portCurrency = value;
    }

    /**
     * Gets the value of the portValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPortValue() {
        return portValue;
    }

    /**
     * Sets the value of the portValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPortValue(Float value) {
        this.portValue = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the shipHour property.
     * 
     */
    public int getShipHour() {
        return shipHour;
    }

    /**
     * Sets the value of the shipHour property.
     * 
     */
    public void setShipHour(int value) {
        this.shipHour = value;
    }

    /**
     * Gets the value of the skybillRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkybillRank() {
        return skybillRank;
    }

    /**
     * Sets the value of the skybillRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkybillRank(String value) {
        this.skybillRank = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeight(Float value) {
        this.weight = value;
    }

    /**
     * Gets the value of the weightUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Sets the value of the weightUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightUnit(String value) {
        this.weightUnit = value;
    }

}
