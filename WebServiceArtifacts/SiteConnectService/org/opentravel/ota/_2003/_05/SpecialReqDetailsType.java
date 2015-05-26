
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SpecialReqDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialReqDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatRequests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SeatRequest" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SeatRequestType">
 *                           &lt;attribute name="TravelerRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                           &lt;attribute name="FlightRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                           &lt;attribute name="PartialSeatingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialServiceRequests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SpecialServiceRequest" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialServiceRequestType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightLeg" type="{http://www.opentravel.org/OTA/2003/05}FlightLegType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BirthDateGroup"/>
 *                           &lt;attribute name="TravelerRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                           &lt;attribute name="FlightRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherServiceInformations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherServiceInformation" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OtherServiceInfoType">
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Remarks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Remark" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialRemarks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SpecialRemark" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialRemarkType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightLeg" type="{http://www.opentravel.org/OTA/2003/05}FlightLegType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialReqDetailsType", propOrder = {
    "seatRequests",
    "specialServiceRequests",
    "otherServiceInformations",
    "remarks",
    "specialRemarks"
})
public class SpecialReqDetailsType {

    @XmlElement(name = "SeatRequests")
    protected SpecialReqDetailsType.SeatRequests seatRequests;
    @XmlElement(name = "SpecialServiceRequests")
    protected SpecialReqDetailsType.SpecialServiceRequests specialServiceRequests;
    @XmlElement(name = "OtherServiceInformations")
    protected SpecialReqDetailsType.OtherServiceInformations otherServiceInformations;
    @XmlElement(name = "Remarks")
    protected SpecialReqDetailsType.Remarks remarks;
    @XmlElement(name = "SpecialRemarks")
    protected SpecialReqDetailsType.SpecialRemarks specialRemarks;

    /**
     * Gets the value of the seatRequests property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialReqDetailsType.SeatRequests }
     *     
     */
    public SpecialReqDetailsType.SeatRequests getSeatRequests() {
        return seatRequests;
    }

    /**
     * Sets the value of the seatRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialReqDetailsType.SeatRequests }
     *     
     */
    public void setSeatRequests(SpecialReqDetailsType.SeatRequests value) {
        this.seatRequests = value;
    }

    /**
     * Gets the value of the specialServiceRequests property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialReqDetailsType.SpecialServiceRequests }
     *     
     */
    public SpecialReqDetailsType.SpecialServiceRequests getSpecialServiceRequests() {
        return specialServiceRequests;
    }

    /**
     * Sets the value of the specialServiceRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialReqDetailsType.SpecialServiceRequests }
     *     
     */
    public void setSpecialServiceRequests(SpecialReqDetailsType.SpecialServiceRequests value) {
        this.specialServiceRequests = value;
    }

    /**
     * Gets the value of the otherServiceInformations property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialReqDetailsType.OtherServiceInformations }
     *     
     */
    public SpecialReqDetailsType.OtherServiceInformations getOtherServiceInformations() {
        return otherServiceInformations;
    }

    /**
     * Sets the value of the otherServiceInformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialReqDetailsType.OtherServiceInformations }
     *     
     */
    public void setOtherServiceInformations(SpecialReqDetailsType.OtherServiceInformations value) {
        this.otherServiceInformations = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialReqDetailsType.Remarks }
     *     
     */
    public SpecialReqDetailsType.Remarks getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialReqDetailsType.Remarks }
     *     
     */
    public void setRemarks(SpecialReqDetailsType.Remarks value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the specialRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialReqDetailsType.SpecialRemarks }
     *     
     */
    public SpecialReqDetailsType.SpecialRemarks getSpecialRemarks() {
        return specialRemarks;
    }

    /**
     * Sets the value of the specialRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialReqDetailsType.SpecialRemarks }
     *     
     */
    public void setSpecialRemarks(SpecialReqDetailsType.SpecialRemarks value) {
        this.specialRemarks = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OtherServiceInformation" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OtherServiceInfoType">
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "otherServiceInformation"
    })
    public static class OtherServiceInformations {

        @XmlElement(name = "OtherServiceInformation", required = true)
        protected List<SpecialReqDetailsType.OtherServiceInformations.OtherServiceInformation> otherServiceInformation;

        /**
         * Gets the value of the otherServiceInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherServiceInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherServiceInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialReqDetailsType.OtherServiceInformations.OtherServiceInformation }
         * 
         * 
         */
        public List<SpecialReqDetailsType.OtherServiceInformations.OtherServiceInformation> getOtherServiceInformation() {
            if (otherServiceInformation == null) {
                otherServiceInformation = new ArrayList<SpecialReqDetailsType.OtherServiceInformations.OtherServiceInformation>();
            }
            return this.otherServiceInformation;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OtherServiceInfoType">
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OtherServiceInformation
            extends OtherServiceInfoType
        {

            @XmlAttribute(name = "RPH")
            protected String rph;
            @XmlAttribute(name = "Operation")
            protected ActionType operation;

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

            /**
             * Gets the value of the operation property.
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getOperation() {
                return operation;
            }

            /**
             * Sets the value of the operation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setOperation(ActionType value) {
                this.operation = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Remark" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "remark"
    })
    public static class Remarks {

        @XmlElement(name = "Remark", required = true)
        protected List<SpecialReqDetailsType.Remarks.Remark> remark;

        /**
         * Gets the value of the remark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialReqDetailsType.Remarks.Remark }
         * 
         * 
         */
        public List<SpecialReqDetailsType.Remarks.Remark> getRemark() {
            if (remark == null) {
                remark = new ArrayList<SpecialReqDetailsType.Remarks.Remark>();
            }
            return this.remark;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Remark {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "RPH")
            protected String rph;
            @XmlAttribute(name = "Operation")
            protected ActionType operation;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

            /**
             * Gets the value of the operation property.
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getOperation() {
                return operation;
            }

            /**
             * Sets the value of the operation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setOperation(ActionType value) {
                this.operation = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SeatRequest" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SeatRequestType">
     *                 &lt;attribute name="TravelerRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *                 &lt;attribute name="FlightRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *                 &lt;attribute name="PartialSeatingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "seatRequest"
    })
    public static class SeatRequests {

        @XmlElement(name = "SeatRequest", required = true)
        protected List<SpecialReqDetailsType.SeatRequests.SeatRequest> seatRequest;

        /**
         * Gets the value of the seatRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the seatRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeatRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialReqDetailsType.SeatRequests.SeatRequest }
         * 
         * 
         */
        public List<SpecialReqDetailsType.SeatRequests.SeatRequest> getSeatRequest() {
            if (seatRequest == null) {
                seatRequest = new ArrayList<SpecialReqDetailsType.SeatRequests.SeatRequest>();
            }
            return this.seatRequest;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SeatRequestType">
         *       &lt;attribute name="TravelerRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
         *       &lt;attribute name="FlightRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
         *       &lt;attribute name="PartialSeatingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SeatRequest
            extends SeatRequestType
        {

            @XmlAttribute(name = "TravelerRefNumberRPHList")
            protected List<String> travelerRefNumberRPHList;
            @XmlAttribute(name = "FlightRefNumberRPHList")
            protected List<String> flightRefNumberRPHList;
            @XmlAttribute(name = "PartialSeatingInd")
            protected Boolean partialSeatingInd;

            /**
             * Gets the value of the travelerRefNumberRPHList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the travelerRefNumberRPHList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTravelerRefNumberRPHList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getTravelerRefNumberRPHList() {
                if (travelerRefNumberRPHList == null) {
                    travelerRefNumberRPHList = new ArrayList<String>();
                }
                return this.travelerRefNumberRPHList;
            }

            /**
             * Gets the value of the flightRefNumberRPHList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightRefNumberRPHList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightRefNumberRPHList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getFlightRefNumberRPHList() {
                if (flightRefNumberRPHList == null) {
                    flightRefNumberRPHList = new ArrayList<String>();
                }
                return this.flightRefNumberRPHList;
            }

            /**
             * Gets the value of the partialSeatingInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPartialSeatingInd() {
                return partialSeatingInd;
            }

            /**
             * Sets the value of the partialSeatingInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPartialSeatingInd(Boolean value) {
                this.partialSeatingInd = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SpecialRemark" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialRemarkType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightLeg" type="{http://www.opentravel.org/OTA/2003/05}FlightLegType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "specialRemark"
    })
    public static class SpecialRemarks {

        @XmlElement(name = "SpecialRemark", required = true)
        protected List<SpecialReqDetailsType.SpecialRemarks.SpecialRemark> specialRemark;

        /**
         * Gets the value of the specialRemark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialRemark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialRemark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialReqDetailsType.SpecialRemarks.SpecialRemark }
         * 
         * 
         */
        public List<SpecialReqDetailsType.SpecialRemarks.SpecialRemark> getSpecialRemark() {
            if (specialRemark == null) {
                specialRemark = new ArrayList<SpecialReqDetailsType.SpecialRemarks.SpecialRemark>();
            }
            return this.specialRemark;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialRemarkType">
         *       &lt;sequence>
         *         &lt;element name="FlightLeg" type="{http://www.opentravel.org/OTA/2003/05}FlightLegType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "flightLeg"
        })
        public static class SpecialRemark
            extends SpecialRemarkType
        {

            @XmlElement(name = "FlightLeg")
            protected FlightLegType flightLeg;
            @XmlAttribute(name = "Operation")
            protected ActionType operation;
            @XmlAttribute(name = "RPH")
            protected String rph;

            /**
             * Gets the value of the flightLeg property.
             * 
             * @return
             *     possible object is
             *     {@link FlightLegType }
             *     
             */
            public FlightLegType getFlightLeg() {
                return flightLeg;
            }

            /**
             * Sets the value of the flightLeg property.
             * 
             * @param value
             *     allowed object is
             *     {@link FlightLegType }
             *     
             */
            public void setFlightLeg(FlightLegType value) {
                this.flightLeg = value;
            }

            /**
             * Gets the value of the operation property.
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getOperation() {
                return operation;
            }

            /**
             * Sets the value of the operation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setOperation(ActionType value) {
                this.operation = value;
            }

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SpecialServiceRequest" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialServiceRequestType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightLeg" type="{http://www.opentravel.org/OTA/2003/05}FlightLegType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BirthDateGroup"/>
     *                 &lt;attribute name="TravelerRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *                 &lt;attribute name="FlightRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "specialServiceRequest"
    })
    public static class SpecialServiceRequests {

        @XmlElement(name = "SpecialServiceRequest", required = true)
        protected List<SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest> specialServiceRequest;

        /**
         * Gets the value of the specialServiceRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialServiceRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialServiceRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest }
         * 
         * 
         */
        public List<SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest> getSpecialServiceRequest() {
            if (specialServiceRequest == null) {
                specialServiceRequest = new ArrayList<SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest>();
            }
            return this.specialServiceRequest;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialServiceRequestType">
         *       &lt;sequence>
         *         &lt;element name="FlightLeg" type="{http://www.opentravel.org/OTA/2003/05}FlightLegType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BirthDateGroup"/>
         *       &lt;attribute name="TravelerRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
         *       &lt;attribute name="FlightRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "flightLeg"
        })
        public static class SpecialServiceRequest
            extends SpecialServiceRequestType
        {

            @XmlElement(name = "FlightLeg")
            protected FlightLegType flightLeg;
            @XmlAttribute(name = "TravelerRefNumberRPHList")
            protected List<String> travelerRefNumberRPHList;
            @XmlAttribute(name = "FlightRefNumberRPHList")
            protected List<String> flightRefNumberRPHList;
            @XmlAttribute(name = "BirthDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar birthDate;

            /**
             * Gets the value of the flightLeg property.
             * 
             * @return
             *     possible object is
             *     {@link FlightLegType }
             *     
             */
            public FlightLegType getFlightLeg() {
                return flightLeg;
            }

            /**
             * Sets the value of the flightLeg property.
             * 
             * @param value
             *     allowed object is
             *     {@link FlightLegType }
             *     
             */
            public void setFlightLeg(FlightLegType value) {
                this.flightLeg = value;
            }

            /**
             * Gets the value of the travelerRefNumberRPHList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the travelerRefNumberRPHList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTravelerRefNumberRPHList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getTravelerRefNumberRPHList() {
                if (travelerRefNumberRPHList == null) {
                    travelerRefNumberRPHList = new ArrayList<String>();
                }
                return this.travelerRefNumberRPHList;
            }

            /**
             * Gets the value of the flightRefNumberRPHList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightRefNumberRPHList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightRefNumberRPHList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getFlightRefNumberRPHList() {
                if (flightRefNumberRPHList == null) {
                    flightRefNumberRPHList = new ArrayList<String>();
                }
                return this.flightRefNumberRPHList;
            }

            /**
             * Gets the value of the birthDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getBirthDate() {
                return birthDate;
            }

            /**
             * Sets the value of the birthDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setBirthDate(XMLGregorianCalendar value) {
                this.birthDate = value;
            }

        }

    }

}
