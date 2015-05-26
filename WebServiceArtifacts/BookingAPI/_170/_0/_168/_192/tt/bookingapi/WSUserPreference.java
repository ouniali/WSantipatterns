
package _170._0._168._192.tt.bookingapi;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSUserPreference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSUserPreference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubDomainSiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiteTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TagLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowLogo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowHeader" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HeaderDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HeaderImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HeaderText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowFooter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Footer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowMenuBar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowLoginPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowContact" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowAbout" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="About" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowCarrers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Careers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllowInternational" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowDomestic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowBooking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowTicketing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Fee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ServiceTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ServiceCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Layout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WaitingLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WaitingText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeftTopPanelText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HdfcPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OxiCashPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmexPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IciciPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CcavenuePaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketValaPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AxisPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeamPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TechProcessPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NiblPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayPalPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillDeskPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SbiPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalTxnFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AboutContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrivacyContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermsContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowHomePageMiddleImage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowHomePageRightImage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HomePageMiddleImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePageRightImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GoogleScriptType" type="{http://192.168.0.170/TT/BookingAPI}WSGoogleScriptType"/>
 *         &lt;element name="GoogleScript" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPGOwnedByTBO" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsProgressiveSearchAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PreferredCurrencyWL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredCurrencyPG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GdsAirlineSourceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GdsInternationalAirlineSourceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AirAsiaAirlineSourceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AirArabiaAirlineSourceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TigerAirwaysAirlineSourceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BhutanAirlinesAirlineSourceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FlyDubaiAirlineSourceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SpicejetAirlineSourceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ParamountAirlineSourceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AirIndiaExpressAirlineSourceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IndigoAirlineSourceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GoAirAirlineSourceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MdlrAirlineSourceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AirCostaAirlineSourceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SpecialReturnAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EBSPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CitrusPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirecpayPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GoogleMapLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayUPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AtomPaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeywordsForFlight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MetaDescriptionForFlight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSUserPreference", propOrder = {
    "siteName",
    "subDomainSiteName",
    "siteTitle",
    "tradingName",
    "tagLine",
    "showLogo",
    "logo",
    "showHeader",
    "header",
    "headerDetail",
    "headerImage",
    "headerText",
    "showFooter",
    "footer",
    "showMenuBar",
    "showLoginPage",
    "showContact",
    "contact",
    "showAbout",
    "about",
    "showCarrers",
    "careers",
    "allowInternational",
    "allowDomestic",
    "allowBooking",
    "allowTicketing",
    "fee",
    "discount",
    "serviceTax",
    "serviceCharge",
    "layout",
    "emailId",
    "phoneNum",
    "faxNum",
    "waitingLogo",
    "waitingText",
    "homePageUrl",
    "leftTopPanelText",
    "hdfcPaymentGateway",
    "oxiCashPaymentGateway",
    "amexPaymentGateway",
    "iciciPaymentGateway",
    "ccavenuePaymentGateway",
    "ticketValaPaymentGateway",
    "axisPaymentGateway",
    "beamPaymentGateway",
    "techProcessPaymentGateway",
    "niblPaymentGateway",
    "payPalPaymentGateway",
    "billDeskPaymentGateway",
    "sbiPaymentGateway",
    "additionalTxnFee",
    "aboutContent",
    "contactContent",
    "privacyContent",
    "termsContent",
    "showHomePageMiddleImage",
    "showHomePageRightImage",
    "homePageMiddleImage",
    "homePageRightImage",
    "googleScriptType",
    "googleScript",
    "isPGOwnedByTBO",
    "isProgressiveSearchAllowed",
    "preferredCurrencyWL",
    "preferredCurrencyPG",
    "gdsAirlineSourceAllowed",
    "gdsInternationalAirlineSourceAllowed",
    "airAsiaAirlineSourceAllowed",
    "airArabiaAirlineSourceAllowed",
    "tigerAirwaysAirlineSourceAllowed",
    "bhutanAirlinesAirlineSourceAllowed",
    "flyDubaiAirlineSourceAllowed",
    "spicejetAirlineSourceAllowed",
    "paramountAirlineSourceAllowed",
    "airIndiaExpressAirlineSourceAllowed",
    "indigoAirlineSourceAllowed",
    "goAirAirlineSourceAllowed",
    "mdlrAirlineSourceAllowed",
    "airCostaAirlineSourceAllowed",
    "specialReturnAllowed",
    "ebsPaymentGateway",
    "citrusPaymentGateway",
    "direcpayPaymentGateway",
    "googleMapLink",
    "payUPaymentGateway",
    "atomPaymentGateway",
    "keywordsForFlight",
    "metaDescriptionForFlight"
})
public class WSUserPreference {

    @XmlElement(name = "SiteName")
    protected String siteName;
    @XmlElement(name = "SubDomainSiteName")
    protected String subDomainSiteName;
    @XmlElement(name = "SiteTitle")
    protected String siteTitle;
    @XmlElement(name = "TradingName")
    protected String tradingName;
    @XmlElement(name = "TagLine")
    protected String tagLine;
    @XmlElement(name = "ShowLogo")
    protected boolean showLogo;
    @XmlElement(name = "Logo")
    protected String logo;
    @XmlElement(name = "ShowHeader")
    protected boolean showHeader;
    @XmlElement(name = "Header")
    protected String header;
    @XmlElement(name = "HeaderDetail")
    protected String headerDetail;
    @XmlElement(name = "HeaderImage")
    protected String headerImage;
    @XmlElement(name = "HeaderText")
    protected String headerText;
    @XmlElement(name = "ShowFooter")
    protected boolean showFooter;
    @XmlElement(name = "Footer")
    protected String footer;
    @XmlElement(name = "ShowMenuBar")
    protected boolean showMenuBar;
    @XmlElement(name = "ShowLoginPage")
    protected boolean showLoginPage;
    @XmlElement(name = "ShowContact")
    protected boolean showContact;
    @XmlElement(name = "Contact")
    protected String contact;
    @XmlElement(name = "ShowAbout")
    protected boolean showAbout;
    @XmlElement(name = "About")
    protected String about;
    @XmlElement(name = "ShowCarrers")
    protected boolean showCarrers;
    @XmlElement(name = "Careers")
    protected String careers;
    @XmlElement(name = "AllowInternational")
    protected boolean allowInternational;
    @XmlElement(name = "AllowDomestic")
    protected boolean allowDomestic;
    @XmlElement(name = "AllowBooking")
    protected boolean allowBooking;
    @XmlElement(name = "AllowTicketing")
    protected boolean allowTicketing;
    @XmlElement(name = "Fee", required = true)
    protected BigDecimal fee;
    @XmlElement(name = "Discount", required = true)
    protected BigDecimal discount;
    @XmlElement(name = "ServiceTax", required = true)
    protected BigDecimal serviceTax;
    @XmlElement(name = "ServiceCharge", required = true)
    protected BigDecimal serviceCharge;
    @XmlElement(name = "Layout")
    protected String layout;
    @XmlElement(name = "EmailId")
    protected String emailId;
    @XmlElement(name = "PhoneNum")
    protected String phoneNum;
    @XmlElement(name = "FaxNum")
    protected String faxNum;
    @XmlElement(name = "WaitingLogo")
    protected String waitingLogo;
    @XmlElement(name = "WaitingText")
    protected String waitingText;
    @XmlElement(name = "HomePageUrl")
    protected String homePageUrl;
    @XmlElement(name = "LeftTopPanelText")
    protected String leftTopPanelText;
    @XmlElement(name = "HdfcPaymentGateway")
    protected String hdfcPaymentGateway;
    @XmlElement(name = "OxiCashPaymentGateway")
    protected String oxiCashPaymentGateway;
    @XmlElement(name = "AmexPaymentGateway")
    protected String amexPaymentGateway;
    @XmlElement(name = "IciciPaymentGateway")
    protected String iciciPaymentGateway;
    @XmlElement(name = "CcavenuePaymentGateway")
    protected String ccavenuePaymentGateway;
    @XmlElement(name = "TicketValaPaymentGateway")
    protected String ticketValaPaymentGateway;
    @XmlElement(name = "AxisPaymentGateway")
    protected String axisPaymentGateway;
    @XmlElement(name = "BeamPaymentGateway")
    protected String beamPaymentGateway;
    @XmlElement(name = "TechProcessPaymentGateway")
    protected String techProcessPaymentGateway;
    @XmlElement(name = "NiblPaymentGateway")
    protected String niblPaymentGateway;
    @XmlElement(name = "PayPalPaymentGateway")
    protected String payPalPaymentGateway;
    @XmlElement(name = "BillDeskPaymentGateway")
    protected String billDeskPaymentGateway;
    @XmlElement(name = "SbiPaymentGateway")
    protected String sbiPaymentGateway;
    @XmlElement(name = "AdditionalTxnFee")
    protected String additionalTxnFee;
    @XmlElement(name = "AboutContent")
    protected String aboutContent;
    @XmlElement(name = "ContactContent")
    protected String contactContent;
    @XmlElement(name = "PrivacyContent")
    protected String privacyContent;
    @XmlElement(name = "TermsContent")
    protected String termsContent;
    @XmlElement(name = "ShowHomePageMiddleImage")
    protected boolean showHomePageMiddleImage;
    @XmlElement(name = "ShowHomePageRightImage")
    protected boolean showHomePageRightImage;
    @XmlElement(name = "HomePageMiddleImage")
    protected String homePageMiddleImage;
    @XmlElement(name = "HomePageRightImage")
    protected String homePageRightImage;
    @XmlElement(name = "GoogleScriptType", required = true)
    @XmlSchemaType(name = "string")
    protected WSGoogleScriptType googleScriptType;
    @XmlElement(name = "GoogleScript")
    protected String googleScript;
    @XmlElement(name = "IsPGOwnedByTBO")
    protected boolean isPGOwnedByTBO;
    @XmlElement(name = "IsProgressiveSearchAllowed")
    protected boolean isProgressiveSearchAllowed;
    @XmlElement(name = "PreferredCurrencyWL")
    protected String preferredCurrencyWL;
    @XmlElement(name = "PreferredCurrencyPG")
    protected String preferredCurrencyPG;
    @XmlElement(name = "GdsAirlineSourceAllowed")
    protected boolean gdsAirlineSourceAllowed;
    @XmlElement(name = "GdsInternationalAirlineSourceAllowed")
    protected boolean gdsInternationalAirlineSourceAllowed;
    @XmlElement(name = "AirAsiaAirlineSourceAllowed")
    protected boolean airAsiaAirlineSourceAllowed;
    @XmlElement(name = "AirArabiaAirlineSourceAllowed")
    protected boolean airArabiaAirlineSourceAllowed;
    @XmlElement(name = "TigerAirwaysAirlineSourceAllowed")
    protected boolean tigerAirwaysAirlineSourceAllowed;
    @XmlElement(name = "BhutanAirlinesAirlineSourceAllowed")
    protected boolean bhutanAirlinesAirlineSourceAllowed;
    @XmlElement(name = "FlyDubaiAirlineSourceAllowed")
    protected boolean flyDubaiAirlineSourceAllowed;
    @XmlElement(name = "SpicejetAirlineSourceAllowed")
    protected boolean spicejetAirlineSourceAllowed;
    @XmlElement(name = "ParamountAirlineSourceAllowed")
    protected boolean paramountAirlineSourceAllowed;
    @XmlElement(name = "AirIndiaExpressAirlineSourceAllowed")
    protected boolean airIndiaExpressAirlineSourceAllowed;
    @XmlElement(name = "IndigoAirlineSourceAllowed")
    protected boolean indigoAirlineSourceAllowed;
    @XmlElement(name = "GoAirAirlineSourceAllowed")
    protected boolean goAirAirlineSourceAllowed;
    @XmlElement(name = "MdlrAirlineSourceAllowed")
    protected boolean mdlrAirlineSourceAllowed;
    @XmlElement(name = "AirCostaAirlineSourceAllowed")
    protected boolean airCostaAirlineSourceAllowed;
    @XmlElement(name = "SpecialReturnAllowed")
    protected boolean specialReturnAllowed;
    @XmlElement(name = "EBSPaymentGateway")
    protected String ebsPaymentGateway;
    @XmlElement(name = "CitrusPaymentGateway")
    protected String citrusPaymentGateway;
    @XmlElement(name = "DirecpayPaymentGateway")
    protected String direcpayPaymentGateway;
    @XmlElement(name = "GoogleMapLink")
    protected String googleMapLink;
    @XmlElement(name = "PayUPaymentGateway")
    protected String payUPaymentGateway;
    @XmlElement(name = "AtomPaymentGateway")
    protected String atomPaymentGateway;
    @XmlElement(name = "KeywordsForFlight")
    protected String keywordsForFlight;
    @XmlElement(name = "MetaDescriptionForFlight")
    protected String metaDescriptionForFlight;

    /**
     * Gets the value of the siteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

    /**
     * Gets the value of the subDomainSiteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDomainSiteName() {
        return subDomainSiteName;
    }

    /**
     * Sets the value of the subDomainSiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDomainSiteName(String value) {
        this.subDomainSiteName = value;
    }

    /**
     * Gets the value of the siteTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteTitle() {
        return siteTitle;
    }

    /**
     * Sets the value of the siteTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteTitle(String value) {
        this.siteTitle = value;
    }

    /**
     * Gets the value of the tradingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingName() {
        return tradingName;
    }

    /**
     * Sets the value of the tradingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingName(String value) {
        this.tradingName = value;
    }

    /**
     * Gets the value of the tagLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagLine() {
        return tagLine;
    }

    /**
     * Sets the value of the tagLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagLine(String value) {
        this.tagLine = value;
    }

    /**
     * Gets the value of the showLogo property.
     * 
     */
    public boolean isShowLogo() {
        return showLogo;
    }

    /**
     * Sets the value of the showLogo property.
     * 
     */
    public void setShowLogo(boolean value) {
        this.showLogo = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogo(String value) {
        this.logo = value;
    }

    /**
     * Gets the value of the showHeader property.
     * 
     */
    public boolean isShowHeader() {
        return showHeader;
    }

    /**
     * Sets the value of the showHeader property.
     * 
     */
    public void setShowHeader(boolean value) {
        this.showHeader = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the headerDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderDetail() {
        return headerDetail;
    }

    /**
     * Sets the value of the headerDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderDetail(String value) {
        this.headerDetail = value;
    }

    /**
     * Gets the value of the headerImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderImage() {
        return headerImage;
    }

    /**
     * Sets the value of the headerImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderImage(String value) {
        this.headerImage = value;
    }

    /**
     * Gets the value of the headerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderText() {
        return headerText;
    }

    /**
     * Sets the value of the headerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderText(String value) {
        this.headerText = value;
    }

    /**
     * Gets the value of the showFooter property.
     * 
     */
    public boolean isShowFooter() {
        return showFooter;
    }

    /**
     * Sets the value of the showFooter property.
     * 
     */
    public void setShowFooter(boolean value) {
        this.showFooter = value;
    }

    /**
     * Gets the value of the footer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooter() {
        return footer;
    }

    /**
     * Sets the value of the footer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooter(String value) {
        this.footer = value;
    }

    /**
     * Gets the value of the showMenuBar property.
     * 
     */
    public boolean isShowMenuBar() {
        return showMenuBar;
    }

    /**
     * Sets the value of the showMenuBar property.
     * 
     */
    public void setShowMenuBar(boolean value) {
        this.showMenuBar = value;
    }

    /**
     * Gets the value of the showLoginPage property.
     * 
     */
    public boolean isShowLoginPage() {
        return showLoginPage;
    }

    /**
     * Sets the value of the showLoginPage property.
     * 
     */
    public void setShowLoginPage(boolean value) {
        this.showLoginPage = value;
    }

    /**
     * Gets the value of the showContact property.
     * 
     */
    public boolean isShowContact() {
        return showContact;
    }

    /**
     * Sets the value of the showContact property.
     * 
     */
    public void setShowContact(boolean value) {
        this.showContact = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the showAbout property.
     * 
     */
    public boolean isShowAbout() {
        return showAbout;
    }

    /**
     * Sets the value of the showAbout property.
     * 
     */
    public void setShowAbout(boolean value) {
        this.showAbout = value;
    }

    /**
     * Gets the value of the about property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbout() {
        return about;
    }

    /**
     * Sets the value of the about property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbout(String value) {
        this.about = value;
    }

    /**
     * Gets the value of the showCarrers property.
     * 
     */
    public boolean isShowCarrers() {
        return showCarrers;
    }

    /**
     * Sets the value of the showCarrers property.
     * 
     */
    public void setShowCarrers(boolean value) {
        this.showCarrers = value;
    }

    /**
     * Gets the value of the careers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareers() {
        return careers;
    }

    /**
     * Sets the value of the careers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareers(String value) {
        this.careers = value;
    }

    /**
     * Gets the value of the allowInternational property.
     * 
     */
    public boolean isAllowInternational() {
        return allowInternational;
    }

    /**
     * Sets the value of the allowInternational property.
     * 
     */
    public void setAllowInternational(boolean value) {
        this.allowInternational = value;
    }

    /**
     * Gets the value of the allowDomestic property.
     * 
     */
    public boolean isAllowDomestic() {
        return allowDomestic;
    }

    /**
     * Sets the value of the allowDomestic property.
     * 
     */
    public void setAllowDomestic(boolean value) {
        this.allowDomestic = value;
    }

    /**
     * Gets the value of the allowBooking property.
     * 
     */
    public boolean isAllowBooking() {
        return allowBooking;
    }

    /**
     * Sets the value of the allowBooking property.
     * 
     */
    public void setAllowBooking(boolean value) {
        this.allowBooking = value;
    }

    /**
     * Gets the value of the allowTicketing property.
     * 
     */
    public boolean isAllowTicketing() {
        return allowTicketing;
    }

    /**
     * Sets the value of the allowTicketing property.
     * 
     */
    public void setAllowTicketing(boolean value) {
        this.allowTicketing = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFee(BigDecimal value) {
        this.fee = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the serviceTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceTax() {
        return serviceTax;
    }

    /**
     * Sets the value of the serviceTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceTax(BigDecimal value) {
        this.serviceTax = value;
    }

    /**
     * Gets the value of the serviceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    /**
     * Sets the value of the serviceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceCharge(BigDecimal value) {
        this.serviceCharge = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayout(String value) {
        this.layout = value;
    }

    /**
     * Gets the value of the emailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * Sets the value of the emailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailId(String value) {
        this.emailId = value;
    }

    /**
     * Gets the value of the phoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNum(String value) {
        this.phoneNum = value;
    }

    /**
     * Gets the value of the faxNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNum() {
        return faxNum;
    }

    /**
     * Sets the value of the faxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNum(String value) {
        this.faxNum = value;
    }

    /**
     * Gets the value of the waitingLogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitingLogo() {
        return waitingLogo;
    }

    /**
     * Sets the value of the waitingLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitingLogo(String value) {
        this.waitingLogo = value;
    }

    /**
     * Gets the value of the waitingText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitingText() {
        return waitingText;
    }

    /**
     * Sets the value of the waitingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitingText(String value) {
        this.waitingText = value;
    }

    /**
     * Gets the value of the homePageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePageUrl() {
        return homePageUrl;
    }

    /**
     * Sets the value of the homePageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePageUrl(String value) {
        this.homePageUrl = value;
    }

    /**
     * Gets the value of the leftTopPanelText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftTopPanelText() {
        return leftTopPanelText;
    }

    /**
     * Sets the value of the leftTopPanelText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftTopPanelText(String value) {
        this.leftTopPanelText = value;
    }

    /**
     * Gets the value of the hdfcPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdfcPaymentGateway() {
        return hdfcPaymentGateway;
    }

    /**
     * Sets the value of the hdfcPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdfcPaymentGateway(String value) {
        this.hdfcPaymentGateway = value;
    }

    /**
     * Gets the value of the oxiCashPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOxiCashPaymentGateway() {
        return oxiCashPaymentGateway;
    }

    /**
     * Sets the value of the oxiCashPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOxiCashPaymentGateway(String value) {
        this.oxiCashPaymentGateway = value;
    }

    /**
     * Gets the value of the amexPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmexPaymentGateway() {
        return amexPaymentGateway;
    }

    /**
     * Sets the value of the amexPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmexPaymentGateway(String value) {
        this.amexPaymentGateway = value;
    }

    /**
     * Gets the value of the iciciPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIciciPaymentGateway() {
        return iciciPaymentGateway;
    }

    /**
     * Sets the value of the iciciPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIciciPaymentGateway(String value) {
        this.iciciPaymentGateway = value;
    }

    /**
     * Gets the value of the ccavenuePaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcavenuePaymentGateway() {
        return ccavenuePaymentGateway;
    }

    /**
     * Sets the value of the ccavenuePaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcavenuePaymentGateway(String value) {
        this.ccavenuePaymentGateway = value;
    }

    /**
     * Gets the value of the ticketValaPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketValaPaymentGateway() {
        return ticketValaPaymentGateway;
    }

    /**
     * Sets the value of the ticketValaPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketValaPaymentGateway(String value) {
        this.ticketValaPaymentGateway = value;
    }

    /**
     * Gets the value of the axisPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxisPaymentGateway() {
        return axisPaymentGateway;
    }

    /**
     * Sets the value of the axisPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxisPaymentGateway(String value) {
        this.axisPaymentGateway = value;
    }

    /**
     * Gets the value of the beamPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeamPaymentGateway() {
        return beamPaymentGateway;
    }

    /**
     * Sets the value of the beamPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeamPaymentGateway(String value) {
        this.beamPaymentGateway = value;
    }

    /**
     * Gets the value of the techProcessPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechProcessPaymentGateway() {
        return techProcessPaymentGateway;
    }

    /**
     * Sets the value of the techProcessPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechProcessPaymentGateway(String value) {
        this.techProcessPaymentGateway = value;
    }

    /**
     * Gets the value of the niblPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNiblPaymentGateway() {
        return niblPaymentGateway;
    }

    /**
     * Sets the value of the niblPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNiblPaymentGateway(String value) {
        this.niblPaymentGateway = value;
    }

    /**
     * Gets the value of the payPalPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalPaymentGateway() {
        return payPalPaymentGateway;
    }

    /**
     * Sets the value of the payPalPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalPaymentGateway(String value) {
        this.payPalPaymentGateway = value;
    }

    /**
     * Gets the value of the billDeskPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillDeskPaymentGateway() {
        return billDeskPaymentGateway;
    }

    /**
     * Sets the value of the billDeskPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillDeskPaymentGateway(String value) {
        this.billDeskPaymentGateway = value;
    }

    /**
     * Gets the value of the sbiPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbiPaymentGateway() {
        return sbiPaymentGateway;
    }

    /**
     * Sets the value of the sbiPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbiPaymentGateway(String value) {
        this.sbiPaymentGateway = value;
    }

    /**
     * Gets the value of the additionalTxnFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalTxnFee() {
        return additionalTxnFee;
    }

    /**
     * Sets the value of the additionalTxnFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalTxnFee(String value) {
        this.additionalTxnFee = value;
    }

    /**
     * Gets the value of the aboutContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAboutContent() {
        return aboutContent;
    }

    /**
     * Sets the value of the aboutContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAboutContent(String value) {
        this.aboutContent = value;
    }

    /**
     * Gets the value of the contactContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactContent() {
        return contactContent;
    }

    /**
     * Sets the value of the contactContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactContent(String value) {
        this.contactContent = value;
    }

    /**
     * Gets the value of the privacyContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacyContent() {
        return privacyContent;
    }

    /**
     * Sets the value of the privacyContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacyContent(String value) {
        this.privacyContent = value;
    }

    /**
     * Gets the value of the termsContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsContent() {
        return termsContent;
    }

    /**
     * Sets the value of the termsContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsContent(String value) {
        this.termsContent = value;
    }

    /**
     * Gets the value of the showHomePageMiddleImage property.
     * 
     */
    public boolean isShowHomePageMiddleImage() {
        return showHomePageMiddleImage;
    }

    /**
     * Sets the value of the showHomePageMiddleImage property.
     * 
     */
    public void setShowHomePageMiddleImage(boolean value) {
        this.showHomePageMiddleImage = value;
    }

    /**
     * Gets the value of the showHomePageRightImage property.
     * 
     */
    public boolean isShowHomePageRightImage() {
        return showHomePageRightImage;
    }

    /**
     * Sets the value of the showHomePageRightImage property.
     * 
     */
    public void setShowHomePageRightImage(boolean value) {
        this.showHomePageRightImage = value;
    }

    /**
     * Gets the value of the homePageMiddleImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePageMiddleImage() {
        return homePageMiddleImage;
    }

    /**
     * Sets the value of the homePageMiddleImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePageMiddleImage(String value) {
        this.homePageMiddleImage = value;
    }

    /**
     * Gets the value of the homePageRightImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePageRightImage() {
        return homePageRightImage;
    }

    /**
     * Sets the value of the homePageRightImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePageRightImage(String value) {
        this.homePageRightImage = value;
    }

    /**
     * Gets the value of the googleScriptType property.
     * 
     * @return
     *     possible object is
     *     {@link WSGoogleScriptType }
     *     
     */
    public WSGoogleScriptType getGoogleScriptType() {
        return googleScriptType;
    }

    /**
     * Sets the value of the googleScriptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSGoogleScriptType }
     *     
     */
    public void setGoogleScriptType(WSGoogleScriptType value) {
        this.googleScriptType = value;
    }

    /**
     * Gets the value of the googleScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoogleScript() {
        return googleScript;
    }

    /**
     * Sets the value of the googleScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoogleScript(String value) {
        this.googleScript = value;
    }

    /**
     * Gets the value of the isPGOwnedByTBO property.
     * 
     */
    public boolean isIsPGOwnedByTBO() {
        return isPGOwnedByTBO;
    }

    /**
     * Sets the value of the isPGOwnedByTBO property.
     * 
     */
    public void setIsPGOwnedByTBO(boolean value) {
        this.isPGOwnedByTBO = value;
    }

    /**
     * Gets the value of the isProgressiveSearchAllowed property.
     * 
     */
    public boolean isIsProgressiveSearchAllowed() {
        return isProgressiveSearchAllowed;
    }

    /**
     * Sets the value of the isProgressiveSearchAllowed property.
     * 
     */
    public void setIsProgressiveSearchAllowed(boolean value) {
        this.isProgressiveSearchAllowed = value;
    }

    /**
     * Gets the value of the preferredCurrencyWL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredCurrencyWL() {
        return preferredCurrencyWL;
    }

    /**
     * Sets the value of the preferredCurrencyWL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredCurrencyWL(String value) {
        this.preferredCurrencyWL = value;
    }

    /**
     * Gets the value of the preferredCurrencyPG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredCurrencyPG() {
        return preferredCurrencyPG;
    }

    /**
     * Sets the value of the preferredCurrencyPG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredCurrencyPG(String value) {
        this.preferredCurrencyPG = value;
    }

    /**
     * Gets the value of the gdsAirlineSourceAllowed property.
     * 
     */
    public boolean isGdsAirlineSourceAllowed() {
        return gdsAirlineSourceAllowed;
    }

    /**
     * Sets the value of the gdsAirlineSourceAllowed property.
     * 
     */
    public void setGdsAirlineSourceAllowed(boolean value) {
        this.gdsAirlineSourceAllowed = value;
    }

    /**
     * Gets the value of the gdsInternationalAirlineSourceAllowed property.
     * 
     */
    public boolean isGdsInternationalAirlineSourceAllowed() {
        return gdsInternationalAirlineSourceAllowed;
    }

    /**
     * Sets the value of the gdsInternationalAirlineSourceAllowed property.
     * 
     */
    public void setGdsInternationalAirlineSourceAllowed(boolean value) {
        this.gdsInternationalAirlineSourceAllowed = value;
    }

    /**
     * Gets the value of the airAsiaAirlineSourceAllowed property.
     * 
     */
    public boolean isAirAsiaAirlineSourceAllowed() {
        return airAsiaAirlineSourceAllowed;
    }

    /**
     * Sets the value of the airAsiaAirlineSourceAllowed property.
     * 
     */
    public void setAirAsiaAirlineSourceAllowed(boolean value) {
        this.airAsiaAirlineSourceAllowed = value;
    }

    /**
     * Gets the value of the airArabiaAirlineSourceAllowed property.
     * 
     */
    public boolean isAirArabiaAirlineSourceAllowed() {
        return airArabiaAirlineSourceAllowed;
    }

    /**
     * Sets the value of the airArabiaAirlineSourceAllowed property.
     * 
     */
    public void setAirArabiaAirlineSourceAllowed(boolean value) {
        this.airArabiaAirlineSourceAllowed = value;
    }

    /**
     * Gets the value of the tigerAirwaysAirlineSourceAllowed property.
     * 
     */
    public boolean isTigerAirwaysAirlineSourceAllowed() {
        return tigerAirwaysAirlineSourceAllowed;
    }

    /**
     * Sets the value of the tigerAirwaysAirlineSourceAllowed property.
     * 
     */
    public void setTigerAirwaysAirlineSourceAllowed(boolean value) {
        this.tigerAirwaysAirlineSourceAllowed = value;
    }

    /**
     * Gets the value of the bhutanAirlinesAirlineSourceAllowed property.
     * 
     */
    public boolean isBhutanAirlinesAirlineSourceAllowed() {
        return bhutanAirlinesAirlineSourceAllowed;
    }

    /**
     * Sets the value of the bhutanAirlinesAirlineSourceAllowed property.
     * 
     */
    public void setBhutanAirlinesAirlineSourceAllowed(boolean value) {
        this.bhutanAirlinesAirlineSourceAllowed = value;
    }

    /**
     * Gets the value of the flyDubaiAirlineSourceAllowed property.
     * 
     */
    public boolean isFlyDubaiAirlineSourceAllowed() {
        return flyDubaiAirlineSourceAllowed;
    }

    /**
     * Sets the value of the flyDubaiAirlineSourceAllowed property.
     * 
     */
    public void setFlyDubaiAirlineSourceAllowed(boolean value) {
        this.flyDubaiAirlineSourceAllowed = value;
    }

    /**
     * Gets the value of the spicejetAirlineSourceAllowed property.
     * 
     */
    public boolean isSpicejetAirlineSourceAllowed() {
        return spicejetAirlineSourceAllowed;
    }

    /**
     * Sets the value of the spicejetAirlineSourceAllowed property.
     * 
     */
    public void setSpicejetAirlineSourceAllowed(boolean value) {
        this.spicejetAirlineSourceAllowed = value;
    }

    /**
     * Gets the value of the paramountAirlineSourceAllowed property.
     * 
     */
    public boolean isParamountAirlineSourceAllowed() {
        return paramountAirlineSourceAllowed;
    }

    /**
     * Sets the value of the paramountAirlineSourceAllowed property.
     * 
     */
    public void setParamountAirlineSourceAllowed(boolean value) {
        this.paramountAirlineSourceAllowed = value;
    }

    /**
     * Gets the value of the airIndiaExpressAirlineSourceAllowed property.
     * 
     */
    public boolean isAirIndiaExpressAirlineSourceAllowed() {
        return airIndiaExpressAirlineSourceAllowed;
    }

    /**
     * Sets the value of the airIndiaExpressAirlineSourceAllowed property.
     * 
     */
    public void setAirIndiaExpressAirlineSourceAllowed(boolean value) {
        this.airIndiaExpressAirlineSourceAllowed = value;
    }

    /**
     * Gets the value of the indigoAirlineSourceAllowed property.
     * 
     */
    public boolean isIndigoAirlineSourceAllowed() {
        return indigoAirlineSourceAllowed;
    }

    /**
     * Sets the value of the indigoAirlineSourceAllowed property.
     * 
     */
    public void setIndigoAirlineSourceAllowed(boolean value) {
        this.indigoAirlineSourceAllowed = value;
    }

    /**
     * Gets the value of the goAirAirlineSourceAllowed property.
     * 
     */
    public boolean isGoAirAirlineSourceAllowed() {
        return goAirAirlineSourceAllowed;
    }

    /**
     * Sets the value of the goAirAirlineSourceAllowed property.
     * 
     */
    public void setGoAirAirlineSourceAllowed(boolean value) {
        this.goAirAirlineSourceAllowed = value;
    }

    /**
     * Gets the value of the mdlrAirlineSourceAllowed property.
     * 
     */
    public boolean isMdlrAirlineSourceAllowed() {
        return mdlrAirlineSourceAllowed;
    }

    /**
     * Sets the value of the mdlrAirlineSourceAllowed property.
     * 
     */
    public void setMdlrAirlineSourceAllowed(boolean value) {
        this.mdlrAirlineSourceAllowed = value;
    }

    /**
     * Gets the value of the airCostaAirlineSourceAllowed property.
     * 
     */
    public boolean isAirCostaAirlineSourceAllowed() {
        return airCostaAirlineSourceAllowed;
    }

    /**
     * Sets the value of the airCostaAirlineSourceAllowed property.
     * 
     */
    public void setAirCostaAirlineSourceAllowed(boolean value) {
        this.airCostaAirlineSourceAllowed = value;
    }

    /**
     * Gets the value of the specialReturnAllowed property.
     * 
     */
    public boolean isSpecialReturnAllowed() {
        return specialReturnAllowed;
    }

    /**
     * Sets the value of the specialReturnAllowed property.
     * 
     */
    public void setSpecialReturnAllowed(boolean value) {
        this.specialReturnAllowed = value;
    }

    /**
     * Gets the value of the ebsPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBSPaymentGateway() {
        return ebsPaymentGateway;
    }

    /**
     * Sets the value of the ebsPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBSPaymentGateway(String value) {
        this.ebsPaymentGateway = value;
    }

    /**
     * Gets the value of the citrusPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitrusPaymentGateway() {
        return citrusPaymentGateway;
    }

    /**
     * Sets the value of the citrusPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitrusPaymentGateway(String value) {
        this.citrusPaymentGateway = value;
    }

    /**
     * Gets the value of the direcpayPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirecpayPaymentGateway() {
        return direcpayPaymentGateway;
    }

    /**
     * Sets the value of the direcpayPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirecpayPaymentGateway(String value) {
        this.direcpayPaymentGateway = value;
    }

    /**
     * Gets the value of the googleMapLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoogleMapLink() {
        return googleMapLink;
    }

    /**
     * Sets the value of the googleMapLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoogleMapLink(String value) {
        this.googleMapLink = value;
    }

    /**
     * Gets the value of the payUPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayUPaymentGateway() {
        return payUPaymentGateway;
    }

    /**
     * Sets the value of the payUPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayUPaymentGateway(String value) {
        this.payUPaymentGateway = value;
    }

    /**
     * Gets the value of the atomPaymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtomPaymentGateway() {
        return atomPaymentGateway;
    }

    /**
     * Sets the value of the atomPaymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtomPaymentGateway(String value) {
        this.atomPaymentGateway = value;
    }

    /**
     * Gets the value of the keywordsForFlight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywordsForFlight() {
        return keywordsForFlight;
    }

    /**
     * Sets the value of the keywordsForFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywordsForFlight(String value) {
        this.keywordsForFlight = value;
    }

    /**
     * Gets the value of the metaDescriptionForFlight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDescriptionForFlight() {
        return metaDescriptionForFlight;
    }

    /**
     * Sets the value of the metaDescriptionForFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDescriptionForFlight(String value) {
        this.metaDescriptionForFlight = value;
    }

}
