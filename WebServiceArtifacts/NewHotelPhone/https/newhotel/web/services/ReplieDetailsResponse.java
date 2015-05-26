
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplieDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplieDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescriptionReceived" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationChip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationChipDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HolderCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ARCDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignatureRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NumberRefTP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplieDetailsResponse", propOrder = {
    "codeResult",
    "descriptionReceived",
    "terminal",
    "applicationChip",
    "applicationChipDesc",
    "cardNumber",
    "tradeNumber",
    "cardMark",
    "holderCard",
    "bankName",
    "arcDesc",
    "signatureRequired",
    "numberRefTP"
})
public class ReplieDetailsResponse {

    @XmlElement(name = "CodeResult")
    protected String codeResult;
    @XmlElement(name = "DescriptionReceived")
    protected String descriptionReceived;
    @XmlElement(name = "Terminal")
    protected String terminal;
    @XmlElement(name = "ApplicationChip")
    protected String applicationChip;
    @XmlElement(name = "ApplicationChipDesc")
    protected String applicationChipDesc;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "TradeNumber")
    protected String tradeNumber;
    @XmlElement(name = "CardMark")
    protected String cardMark;
    @XmlElement(name = "HolderCard")
    protected String holderCard;
    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "ARCDesc")
    protected String arcDesc;
    @XmlElement(name = "SignatureRequired")
    protected boolean signatureRequired;
    @XmlElement(name = "NumberRefTP")
    protected String numberRefTP;

    /**
     * Gets the value of the codeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeResult() {
        return codeResult;
    }

    /**
     * Sets the value of the codeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeResult(String value) {
        this.codeResult = value;
    }

    /**
     * Gets the value of the descriptionReceived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionReceived() {
        return descriptionReceived;
    }

    /**
     * Sets the value of the descriptionReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionReceived(String value) {
        this.descriptionReceived = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the applicationChip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationChip() {
        return applicationChip;
    }

    /**
     * Sets the value of the applicationChip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationChip(String value) {
        this.applicationChip = value;
    }

    /**
     * Gets the value of the applicationChipDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationChipDesc() {
        return applicationChipDesc;
    }

    /**
     * Sets the value of the applicationChipDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationChipDesc(String value) {
        this.applicationChipDesc = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the tradeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeNumber() {
        return tradeNumber;
    }

    /**
     * Sets the value of the tradeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeNumber(String value) {
        this.tradeNumber = value;
    }

    /**
     * Gets the value of the cardMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardMark() {
        return cardMark;
    }

    /**
     * Sets the value of the cardMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardMark(String value) {
        this.cardMark = value;
    }

    /**
     * Gets the value of the holderCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderCard() {
        return holderCard;
    }

    /**
     * Sets the value of the holderCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderCard(String value) {
        this.holderCard = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the arcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARCDesc() {
        return arcDesc;
    }

    /**
     * Sets the value of the arcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARCDesc(String value) {
        this.arcDesc = value;
    }

    /**
     * Gets the value of the signatureRequired property.
     * 
     */
    public boolean isSignatureRequired() {
        return signatureRequired;
    }

    /**
     * Sets the value of the signatureRequired property.
     * 
     */
    public void setSignatureRequired(boolean value) {
        this.signatureRequired = value;
    }

    /**
     * Gets the value of the numberRefTP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberRefTP() {
        return numberRefTP;
    }

    /**
     * Sets the value of the numberRefTP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberRefTP(String value) {
        this.numberRefTP = value;
    }

}
