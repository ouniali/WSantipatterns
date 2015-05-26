
package com.flightaware.flightxml.soap.flightxml2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirlineFlightInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineFlightInfoStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faFlightID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeshares" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="tailnumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="meal_service" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gate_orig" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gate_dest" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="terminal_orig" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="terminal_dest" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bag_claim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seats_cabin_first" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seats_cabin_business" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seats_cabin_coach" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineFlightInfoStruct", propOrder = {
    "faFlightID",
    "ident",
    "codeshares",
    "tailnumber",
    "mealService",
    "gateOrig",
    "gateDest",
    "terminalOrig",
    "terminalDest",
    "bagClaim",
    "seatsCabinFirst",
    "seatsCabinBusiness",
    "seatsCabinCoach"
})
public class AirlineFlightInfoStruct {

    @XmlElement(required = true)
    protected String faFlightID;
    @XmlElement(required = true)
    protected String ident;
    @XmlElement(required = true)
    protected List<String> codeshares;
    @XmlElement(required = true)
    protected String tailnumber;
    @XmlElement(name = "meal_service", required = true)
    protected String mealService;
    @XmlElement(name = "gate_orig", required = true)
    protected String gateOrig;
    @XmlElement(name = "gate_dest", required = true)
    protected String gateDest;
    @XmlElement(name = "terminal_orig", required = true)
    protected String terminalOrig;
    @XmlElement(name = "terminal_dest", required = true)
    protected String terminalDest;
    @XmlElement(name = "bag_claim", required = true)
    protected String bagClaim;
    @XmlElement(name = "seats_cabin_first")
    protected int seatsCabinFirst;
    @XmlElement(name = "seats_cabin_business")
    protected int seatsCabinBusiness;
    @XmlElement(name = "seats_cabin_coach")
    protected int seatsCabinCoach;

    /**
     * Gets the value of the faFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaFlightID() {
        return faFlightID;
    }

    /**
     * Sets the value of the faFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaFlightID(String value) {
        this.faFlightID = value;
    }

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
     * Gets the value of the codeshares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeshares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeshares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCodeshares() {
        if (codeshares == null) {
            codeshares = new ArrayList<String>();
        }
        return this.codeshares;
    }

    /**
     * Gets the value of the tailnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailnumber() {
        return tailnumber;
    }

    /**
     * Sets the value of the tailnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTailnumber(String value) {
        this.tailnumber = value;
    }

    /**
     * Gets the value of the mealService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealService() {
        return mealService;
    }

    /**
     * Sets the value of the mealService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealService(String value) {
        this.mealService = value;
    }

    /**
     * Gets the value of the gateOrig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateOrig() {
        return gateOrig;
    }

    /**
     * Sets the value of the gateOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateOrig(String value) {
        this.gateOrig = value;
    }

    /**
     * Gets the value of the gateDest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateDest() {
        return gateDest;
    }

    /**
     * Sets the value of the gateDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateDest(String value) {
        this.gateDest = value;
    }

    /**
     * Gets the value of the terminalOrig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalOrig() {
        return terminalOrig;
    }

    /**
     * Sets the value of the terminalOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalOrig(String value) {
        this.terminalOrig = value;
    }

    /**
     * Gets the value of the terminalDest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalDest() {
        return terminalDest;
    }

    /**
     * Sets the value of the terminalDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalDest(String value) {
        this.terminalDest = value;
    }

    /**
     * Gets the value of the bagClaim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagClaim() {
        return bagClaim;
    }

    /**
     * Sets the value of the bagClaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagClaim(String value) {
        this.bagClaim = value;
    }

    /**
     * Gets the value of the seatsCabinFirst property.
     * 
     */
    public int getSeatsCabinFirst() {
        return seatsCabinFirst;
    }

    /**
     * Sets the value of the seatsCabinFirst property.
     * 
     */
    public void setSeatsCabinFirst(int value) {
        this.seatsCabinFirst = value;
    }

    /**
     * Gets the value of the seatsCabinBusiness property.
     * 
     */
    public int getSeatsCabinBusiness() {
        return seatsCabinBusiness;
    }

    /**
     * Sets the value of the seatsCabinBusiness property.
     * 
     */
    public void setSeatsCabinBusiness(int value) {
        this.seatsCabinBusiness = value;
    }

    /**
     * Gets the value of the seatsCabinCoach property.
     * 
     */
    public int getSeatsCabinCoach() {
        return seatsCabinCoach;
    }

    /**
     * Sets the value of the seatsCabinCoach property.
     * 
     */
    public void setSeatsCabinCoach(int value) {
        this.seatsCabinCoach = value;
    }

}
