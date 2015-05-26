
package com.epostcode.ws.uk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Geographic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Geographic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grid_Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="x_Coord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="y_Coord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude_Deg_Min_Sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude_Deg_Min_Sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude_Degrees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude_Degrees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Administrative_County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Local_Auth_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Local_Auth_Ward_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Local_Auth_Ward_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NHS_Regional_Office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NHS_Strat_Health_Board_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NHS_Strat_Health_Board_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NHS_Primary_Health_Auth_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NHS_Primary_Health_Board_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NHS_Primary_Health_Board_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="M_Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="G_Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Return_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geographic", propOrder = {
    "postcode",
    "gridReference",
    "xCoord",
    "yCoord",
    "latitudeDegMinSec",
    "longitudeDegMinSec",
    "latitudeDegrees",
    "longitudeDegrees",
    "countryCode",
    "countryName",
    "administrativeCounty",
    "localAuthName",
    "localAuthWardCode",
    "localAuthWardName",
    "nhsRegionalOffice",
    "nhsStratHealthBoardCode",
    "nhsStratHealthBoardName",
    "nhsPrimaryHealthAuthCode",
    "nhsPrimaryHealthBoardCode",
    "nhsPrimaryHealthBoardName",
    "mDetails",
    "gDetails",
    "returnCode"
})
public class Geographic {

    @XmlElement(name = "Postcode")
    protected String postcode;
    @XmlElement(name = "Grid_Reference")
    protected String gridReference;
    @XmlElement(name = "x_Coord")
    protected String xCoord;
    @XmlElement(name = "y_Coord")
    protected String yCoord;
    @XmlElement(name = "Latitude_Deg_Min_Sec")
    protected String latitudeDegMinSec;
    @XmlElement(name = "Longitude_Deg_Min_Sec")
    protected String longitudeDegMinSec;
    @XmlElement(name = "Latitude_Degrees")
    protected String latitudeDegrees;
    @XmlElement(name = "Longitude_Degrees")
    protected String longitudeDegrees;
    @XmlElement(name = "Country_Code")
    protected String countryCode;
    @XmlElement(name = "Country_Name")
    protected String countryName;
    @XmlElement(name = "Administrative_County")
    protected String administrativeCounty;
    @XmlElement(name = "Local_Auth_Name")
    protected String localAuthName;
    @XmlElement(name = "Local_Auth_Ward_Code")
    protected String localAuthWardCode;
    @XmlElement(name = "Local_Auth_Ward_Name")
    protected String localAuthWardName;
    @XmlElement(name = "NHS_Regional_Office")
    protected String nhsRegionalOffice;
    @XmlElement(name = "NHS_Strat_Health_Board_Code")
    protected String nhsStratHealthBoardCode;
    @XmlElement(name = "NHS_Strat_Health_Board_Name")
    protected String nhsStratHealthBoardName;
    @XmlElement(name = "NHS_Primary_Health_Auth_Code")
    protected String nhsPrimaryHealthAuthCode;
    @XmlElement(name = "NHS_Primary_Health_Board_Code")
    protected String nhsPrimaryHealthBoardCode;
    @XmlElement(name = "NHS_Primary_Health_Board_Name")
    protected String nhsPrimaryHealthBoardName;
    @XmlElement(name = "M_Details")
    protected String mDetails;
    @XmlElement(name = "G_Details")
    protected String gDetails;
    @XmlElement(name = "Return_Code")
    protected String returnCode;

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the gridReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridReference() {
        return gridReference;
    }

    /**
     * Sets the value of the gridReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridReference(String value) {
        this.gridReference = value;
    }

    /**
     * Gets the value of the xCoord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXCoord() {
        return xCoord;
    }

    /**
     * Sets the value of the xCoord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXCoord(String value) {
        this.xCoord = value;
    }

    /**
     * Gets the value of the yCoord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYCoord() {
        return yCoord;
    }

    /**
     * Sets the value of the yCoord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYCoord(String value) {
        this.yCoord = value;
    }

    /**
     * Gets the value of the latitudeDegMinSec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudeDegMinSec() {
        return latitudeDegMinSec;
    }

    /**
     * Sets the value of the latitudeDegMinSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeDegMinSec(String value) {
        this.latitudeDegMinSec = value;
    }

    /**
     * Gets the value of the longitudeDegMinSec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitudeDegMinSec() {
        return longitudeDegMinSec;
    }

    /**
     * Sets the value of the longitudeDegMinSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudeDegMinSec(String value) {
        this.longitudeDegMinSec = value;
    }

    /**
     * Gets the value of the latitudeDegrees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudeDegrees() {
        return latitudeDegrees;
    }

    /**
     * Sets the value of the latitudeDegrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeDegrees(String value) {
        this.latitudeDegrees = value;
    }

    /**
     * Gets the value of the longitudeDegrees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitudeDegrees() {
        return longitudeDegrees;
    }

    /**
     * Sets the value of the longitudeDegrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudeDegrees(String value) {
        this.longitudeDegrees = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the administrativeCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeCounty() {
        return administrativeCounty;
    }

    /**
     * Sets the value of the administrativeCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeCounty(String value) {
        this.administrativeCounty = value;
    }

    /**
     * Gets the value of the localAuthName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalAuthName() {
        return localAuthName;
    }

    /**
     * Sets the value of the localAuthName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalAuthName(String value) {
        this.localAuthName = value;
    }

    /**
     * Gets the value of the localAuthWardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalAuthWardCode() {
        return localAuthWardCode;
    }

    /**
     * Sets the value of the localAuthWardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalAuthWardCode(String value) {
        this.localAuthWardCode = value;
    }

    /**
     * Gets the value of the localAuthWardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalAuthWardName() {
        return localAuthWardName;
    }

    /**
     * Sets the value of the localAuthWardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalAuthWardName(String value) {
        this.localAuthWardName = value;
    }

    /**
     * Gets the value of the nhsRegionalOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNHSRegionalOffice() {
        return nhsRegionalOffice;
    }

    /**
     * Sets the value of the nhsRegionalOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNHSRegionalOffice(String value) {
        this.nhsRegionalOffice = value;
    }

    /**
     * Gets the value of the nhsStratHealthBoardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNHSStratHealthBoardCode() {
        return nhsStratHealthBoardCode;
    }

    /**
     * Sets the value of the nhsStratHealthBoardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNHSStratHealthBoardCode(String value) {
        this.nhsStratHealthBoardCode = value;
    }

    /**
     * Gets the value of the nhsStratHealthBoardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNHSStratHealthBoardName() {
        return nhsStratHealthBoardName;
    }

    /**
     * Sets the value of the nhsStratHealthBoardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNHSStratHealthBoardName(String value) {
        this.nhsStratHealthBoardName = value;
    }

    /**
     * Gets the value of the nhsPrimaryHealthAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNHSPrimaryHealthAuthCode() {
        return nhsPrimaryHealthAuthCode;
    }

    /**
     * Sets the value of the nhsPrimaryHealthAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNHSPrimaryHealthAuthCode(String value) {
        this.nhsPrimaryHealthAuthCode = value;
    }

    /**
     * Gets the value of the nhsPrimaryHealthBoardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNHSPrimaryHealthBoardCode() {
        return nhsPrimaryHealthBoardCode;
    }

    /**
     * Sets the value of the nhsPrimaryHealthBoardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNHSPrimaryHealthBoardCode(String value) {
        this.nhsPrimaryHealthBoardCode = value;
    }

    /**
     * Gets the value of the nhsPrimaryHealthBoardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNHSPrimaryHealthBoardName() {
        return nhsPrimaryHealthBoardName;
    }

    /**
     * Sets the value of the nhsPrimaryHealthBoardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNHSPrimaryHealthBoardName(String value) {
        this.nhsPrimaryHealthBoardName = value;
    }

    /**
     * Gets the value of the mDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDetails() {
        return mDetails;
    }

    /**
     * Sets the value of the mDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDetails(String value) {
        this.mDetails = value;
    }

    /**
     * Gets the value of the gDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDetails() {
        return gDetails;
    }

    /**
     * Sets the value of the gDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDetails(String value) {
        this.gDetails = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

}
