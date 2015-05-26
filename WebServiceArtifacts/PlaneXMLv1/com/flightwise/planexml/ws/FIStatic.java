
package com.flightwise.planexml.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FIStatic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FIStatic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HistoryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BBOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://planexml.flightwise.com/ws}FlightStatusType"/>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeptLat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeptLon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestLat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestLon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACTypeString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EquipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VFR" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Historical" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="FIDynamic" type="{http://planexml.flightwise.com/ws}FIDynamic" minOccurs="0"/>
 *         &lt;element name="DeptTimezoneOffset" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="DeptLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeptDST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FIStatic", propOrder = {
    "ident",
    "primaryPhoto",
    "historyNumber",
    "radioCall",
    "bbox",
    "owner",
    "status",
    "index",
    "departureTime",
    "dept",
    "deptName",
    "deptLat",
    "deptLon",
    "dest",
    "destName",
    "destLat",
    "destLon",
    "arrivalTime",
    "acType",
    "acTypeString",
    "equipCode",
    "vfr",
    "historical",
    "fiDynamic",
    "deptTimezoneOffset",
    "deptLoc",
    "destLoc",
    "deptDST"
})
public class FIStatic {

    @XmlElement(name = "Ident")
    protected String ident;
    @XmlElement(name = "PrimaryPhoto")
    protected String primaryPhoto;
    @XmlElement(name = "HistoryNumber")
    protected String historyNumber;
    @XmlElement(name = "RadioCall")
    protected String radioCall;
    @XmlElement(name = "BBOX")
    protected String bbox;
    @XmlElement(name = "Owner")
    protected String owner;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected FlightStatusType status;
    @XmlElement(name = "Index")
    protected String index;
    @XmlElement(name = "DepartureTime")
    protected String departureTime;
    @XmlElement(name = "Dept")
    protected String dept;
    @XmlElement(name = "DeptName")
    protected String deptName;
    @XmlElement(name = "DeptLat")
    protected String deptLat;
    @XmlElement(name = "DeptLon")
    protected String deptLon;
    @XmlElement(name = "Dest")
    protected String dest;
    @XmlElement(name = "DestName")
    protected String destName;
    @XmlElement(name = "DestLat")
    protected String destLat;
    @XmlElement(name = "DestLon")
    protected String destLon;
    @XmlElement(name = "ArrivalTime")
    protected String arrivalTime;
    @XmlElement(name = "ACType")
    protected String acType;
    @XmlElement(name = "ACTypeString")
    protected String acTypeString;
    @XmlElement(name = "EquipCode")
    protected String equipCode;
    @XmlElement(name = "VFR")
    protected short vfr;
    @XmlElement(name = "Historical")
    protected short historical;
    @XmlElement(name = "FIDynamic")
    protected FIDynamic fiDynamic;
    @XmlElement(name = "DeptTimezoneOffset")
    protected short deptTimezoneOffset;
    @XmlElement(name = "DeptLoc")
    protected String deptLoc;
    @XmlElement(name = "DestLoc")
    protected String destLoc;
    @XmlElement(name = "DeptDST")
    protected String deptDST;

    /**
     * Gets the value of the ident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Sets the value of the ident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Gets the value of the primaryPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPhoto() {
        return primaryPhoto;
    }

    /**
     * Sets the value of the primaryPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPhoto(String value) {
        this.primaryPhoto = value;
    }

    /**
     * Gets the value of the historyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryNumber() {
        return historyNumber;
    }

    /**
     * Sets the value of the historyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryNumber(String value) {
        this.historyNumber = value;
    }

    /**
     * Gets the value of the radioCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioCall() {
        return radioCall;
    }

    /**
     * Sets the value of the radioCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioCall(String value) {
        this.radioCall = value;
    }

    /**
     * Gets the value of the bbox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBOX() {
        return bbox;
    }

    /**
     * Sets the value of the bbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBOX(String value) {
        this.bbox = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatusType }
     *     
     */
    public FlightStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatusType }
     *     
     */
    public void setStatus(FlightStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the dept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * Sets the value of the dept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
    }

    /**
     * Gets the value of the deptName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * Sets the value of the deptName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptName(String value) {
        this.deptName = value;
    }

    /**
     * Gets the value of the deptLat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptLat() {
        return deptLat;
    }

    /**
     * Sets the value of the deptLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptLat(String value) {
        this.deptLat = value;
    }

    /**
     * Gets the value of the deptLon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptLon() {
        return deptLon;
    }

    /**
     * Sets the value of the deptLon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptLon(String value) {
        this.deptLon = value;
    }

    /**
     * Gets the value of the dest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDest() {
        return dest;
    }

    /**
     * Sets the value of the dest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDest(String value) {
        this.dest = value;
    }

    /**
     * Gets the value of the destName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestName() {
        return destName;
    }

    /**
     * Sets the value of the destName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestName(String value) {
        this.destName = value;
    }

    /**
     * Gets the value of the destLat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestLat() {
        return destLat;
    }

    /**
     * Sets the value of the destLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestLat(String value) {
        this.destLat = value;
    }

    /**
     * Gets the value of the destLon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestLon() {
        return destLon;
    }

    /**
     * Sets the value of the destLon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestLon(String value) {
        this.destLon = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the acType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACType() {
        return acType;
    }

    /**
     * Sets the value of the acType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACType(String value) {
        this.acType = value;
    }

    /**
     * Gets the value of the acTypeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTypeString() {
        return acTypeString;
    }

    /**
     * Sets the value of the acTypeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTypeString(String value) {
        this.acTypeString = value;
    }

    /**
     * Gets the value of the equipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipCode() {
        return equipCode;
    }

    /**
     * Sets the value of the equipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipCode(String value) {
        this.equipCode = value;
    }

    /**
     * Gets the value of the vfr property.
     * 
     */
    public short getVFR() {
        return vfr;
    }

    /**
     * Sets the value of the vfr property.
     * 
     */
    public void setVFR(short value) {
        this.vfr = value;
    }

    /**
     * Gets the value of the historical property.
     * 
     */
    public short getHistorical() {
        return historical;
    }

    /**
     * Sets the value of the historical property.
     * 
     */
    public void setHistorical(short value) {
        this.historical = value;
    }

    /**
     * Gets the value of the fiDynamic property.
     * 
     * @return
     *     possible object is
     *     {@link FIDynamic }
     *     
     */
    public FIDynamic getFIDynamic() {
        return fiDynamic;
    }

    /**
     * Sets the value of the fiDynamic property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIDynamic }
     *     
     */
    public void setFIDynamic(FIDynamic value) {
        this.fiDynamic = value;
    }

    /**
     * Gets the value of the deptTimezoneOffset property.
     * 
     */
    public short getDeptTimezoneOffset() {
        return deptTimezoneOffset;
    }

    /**
     * Sets the value of the deptTimezoneOffset property.
     * 
     */
    public void setDeptTimezoneOffset(short value) {
        this.deptTimezoneOffset = value;
    }

    /**
     * Gets the value of the deptLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptLoc() {
        return deptLoc;
    }

    /**
     * Sets the value of the deptLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptLoc(String value) {
        this.deptLoc = value;
    }

    /**
     * Gets the value of the destLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestLoc() {
        return destLoc;
    }

    /**
     * Sets the value of the destLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestLoc(String value) {
        this.destLoc = value;
    }

    /**
     * Gets the value of the deptDST property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptDST() {
        return deptDST;
    }

    /**
     * Sets the value of the deptDST property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptDST(String value) {
        this.deptDST = value;
    }

}
