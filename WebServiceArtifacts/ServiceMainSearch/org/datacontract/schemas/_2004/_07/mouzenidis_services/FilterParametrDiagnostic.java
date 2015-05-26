
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterParametr.Diagnostic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterParametr.Diagnostic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IterationFilterCOunt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IterationQuotaCheckCOunt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NotUseThread" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TimeIndexCreate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSearch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterParametr.Diagnostic", propOrder = {
    "iterationFilterCOunt",
    "iterationQuotaCheckCOunt",
    "notUseThread",
    "timeIndexCreate",
    "timeSearch"
})
public class FilterParametrDiagnostic {

    @XmlElement(name = "IterationFilterCOunt")
    protected Integer iterationFilterCOunt;
    @XmlElement(name = "IterationQuotaCheckCOunt")
    protected Integer iterationQuotaCheckCOunt;
    @XmlElement(name = "NotUseThread")
    protected Boolean notUseThread;
    @XmlElement(name = "TimeIndexCreate")
    protected Integer timeIndexCreate;
    @XmlElement(name = "TimeSearch")
    protected Integer timeSearch;

    /**
     * Gets the value of the iterationFilterCOunt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIterationFilterCOunt() {
        return iterationFilterCOunt;
    }

    /**
     * Sets the value of the iterationFilterCOunt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIterationFilterCOunt(Integer value) {
        this.iterationFilterCOunt = value;
    }

    /**
     * Gets the value of the iterationQuotaCheckCOunt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIterationQuotaCheckCOunt() {
        return iterationQuotaCheckCOunt;
    }

    /**
     * Sets the value of the iterationQuotaCheckCOunt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIterationQuotaCheckCOunt(Integer value) {
        this.iterationQuotaCheckCOunt = value;
    }

    /**
     * Gets the value of the notUseThread property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotUseThread() {
        return notUseThread;
    }

    /**
     * Sets the value of the notUseThread property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotUseThread(Boolean value) {
        this.notUseThread = value;
    }

    /**
     * Gets the value of the timeIndexCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeIndexCreate() {
        return timeIndexCreate;
    }

    /**
     * Sets the value of the timeIndexCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeIndexCreate(Integer value) {
        this.timeIndexCreate = value;
    }

    /**
     * Gets the value of the timeSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeSearch() {
        return timeSearch;
    }

    /**
     * Sets the value of the timeSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeSearch(Integer value) {
        this.timeSearch = value;
    }

}
