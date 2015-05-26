
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultParcelValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultParcelValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeDepot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DSort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationDepot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoPostCodeBarre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoPostNumeroColis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupingPriorityLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OSort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reservationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signaletiqueProduit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="skybillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultParcelValue", propOrder = {
    "codeDepot",
    "codeService",
    "dSort",
    "destinationDepot",
    "geoPostCodeBarre",
    "geoPostNumeroColis",
    "groupingPriorityLabel",
    "oSort",
    "reservationNumber",
    "serviceMark",
    "serviceName",
    "signaletiqueProduit",
    "skybillNumber"
})
public class ResultParcelValue {

    protected String codeDepot;
    protected String codeService;
    @XmlElement(name = "DSort")
    protected String dSort;
    protected String destinationDepot;
    protected String geoPostCodeBarre;
    protected String geoPostNumeroColis;
    protected String groupingPriorityLabel;
    @XmlElement(name = "OSort")
    protected String oSort;
    protected String reservationNumber;
    protected String serviceMark;
    protected String serviceName;
    protected String signaletiqueProduit;
    protected String skybillNumber;

    /**
     * Gets the value of the codeDepot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDepot() {
        return codeDepot;
    }

    /**
     * Sets the value of the codeDepot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDepot(String value) {
        this.codeDepot = value;
    }

    /**
     * Gets the value of the codeService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeService() {
        return codeService;
    }

    /**
     * Sets the value of the codeService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeService(String value) {
        this.codeService = value;
    }

    /**
     * Gets the value of the dSort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSort() {
        return dSort;
    }

    /**
     * Sets the value of the dSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSort(String value) {
        this.dSort = value;
    }

    /**
     * Gets the value of the destinationDepot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationDepot() {
        return destinationDepot;
    }

    /**
     * Sets the value of the destinationDepot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationDepot(String value) {
        this.destinationDepot = value;
    }

    /**
     * Gets the value of the geoPostCodeBarre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoPostCodeBarre() {
        return geoPostCodeBarre;
    }

    /**
     * Sets the value of the geoPostCodeBarre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoPostCodeBarre(String value) {
        this.geoPostCodeBarre = value;
    }

    /**
     * Gets the value of the geoPostNumeroColis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoPostNumeroColis() {
        return geoPostNumeroColis;
    }

    /**
     * Sets the value of the geoPostNumeroColis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoPostNumeroColis(String value) {
        this.geoPostNumeroColis = value;
    }

    /**
     * Gets the value of the groupingPriorityLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupingPriorityLabel() {
        return groupingPriorityLabel;
    }

    /**
     * Sets the value of the groupingPriorityLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupingPriorityLabel(String value) {
        this.groupingPriorityLabel = value;
    }

    /**
     * Gets the value of the oSort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSort() {
        return oSort;
    }

    /**
     * Sets the value of the oSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSort(String value) {
        this.oSort = value;
    }

    /**
     * Gets the value of the reservationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationNumber() {
        return reservationNumber;
    }

    /**
     * Sets the value of the reservationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationNumber(String value) {
        this.reservationNumber = value;
    }

    /**
     * Gets the value of the serviceMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceMark() {
        return serviceMark;
    }

    /**
     * Sets the value of the serviceMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceMark(String value) {
        this.serviceMark = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the signaletiqueProduit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignaletiqueProduit() {
        return signaletiqueProduit;
    }

    /**
     * Sets the value of the signaletiqueProduit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignaletiqueProduit(String value) {
        this.signaletiqueProduit = value;
    }

    /**
     * Gets the value of the skybillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkybillNumber() {
        return skybillNumber;
    }

    /**
     * Sets the value of the skybillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkybillNumber(String value) {
        this.skybillNumber = value;
    }

}
