
package in.gov.incometaxindiaefiling.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="DesigOfficerWardorCircle" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="75"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReturnFileSec">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;totalDigits value="2"/>
 *               &lt;enumeration value="11"/>
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="13"/>
 *               &lt;enumeration value="14"/>
 *               &lt;enumeration value="15"/>
 *               &lt;enumeration value="16"/>
 *               &lt;enumeration value="17"/>
 *               &lt;enumeration value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AckNoOriginalReturn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NoticeNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NoticeDate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="2012-04-01"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReturnType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *               &lt;enumeration value="O"/>
 *               &lt;enumeration value="R"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReceiptNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OrigRetFiledDate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="2012-04-01"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResidentialStatus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *               &lt;enumeration value="RES"/>
 *               &lt;enumeration value="NRI"/>
 *               &lt;enumeration value="NOR"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TaxStatus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="TR"/>
 *               &lt;enumeration value="TP"/>
 *               &lt;enumeration value="NT"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AsseseeRepFlg" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}AssesseeRep" minOccurs="0"/>
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
    "desigOfficerWardorCircle",
    "returnFileSec",
    "ackNoOriginalReturn",
    "noticeNo",
    "noticeDate",
    "returnType",
    "receiptNo",
    "origRetFiledDate",
    "residentialStatus",
    "taxStatus",
    "asseseeRepFlg",
    "assesseeRep"
})
@XmlRootElement(name = "FilingStatus")
public class FilingStatus {

    @XmlElement(name = "DesigOfficerWardorCircle")
    protected String desigOfficerWardorCircle;
    @XmlElement(name = "ReturnFileSec", defaultValue = "11")
    protected long returnFileSec;
    @XmlElement(name = "AckNoOriginalReturn")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ackNoOriginalReturn;
    @XmlElement(name = "NoticeNo")
    protected String noticeNo;
    @XmlElement(name = "NoticeDate")
    protected XMLGregorianCalendar noticeDate;
    @XmlElement(name = "ReturnType", required = true)
    protected String returnType;
    @XmlElement(name = "ReceiptNo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String receiptNo;
    @XmlElement(name = "OrigRetFiledDate")
    protected XMLGregorianCalendar origRetFiledDate;
    @XmlElement(name = "ResidentialStatus", required = true)
    protected String residentialStatus;
    @XmlElement(name = "TaxStatus", required = true)
    protected String taxStatus;
    @XmlElement(name = "AsseseeRepFlg")
    protected String asseseeRepFlg;
    @XmlElement(name = "AssesseeRep")
    protected AssesseeRep assesseeRep;

    /**
     * Gets the value of the desigOfficerWardorCircle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesigOfficerWardorCircle() {
        return desigOfficerWardorCircle;
    }

    /**
     * Sets the value of the desigOfficerWardorCircle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesigOfficerWardorCircle(String value) {
        this.desigOfficerWardorCircle = value;
    }

    /**
     * Gets the value of the returnFileSec property.
     * 
     */
    public long getReturnFileSec() {
        return returnFileSec;
    }

    /**
     * Sets the value of the returnFileSec property.
     * 
     */
    public void setReturnFileSec(long value) {
        this.returnFileSec = value;
    }

    /**
     * Gets the value of the ackNoOriginalReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckNoOriginalReturn() {
        return ackNoOriginalReturn;
    }

    /**
     * Sets the value of the ackNoOriginalReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAckNoOriginalReturn(String value) {
        this.ackNoOriginalReturn = value;
    }

    /**
     * Gets the value of the noticeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoticeNo() {
        return noticeNo;
    }

    /**
     * Sets the value of the noticeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoticeNo(String value) {
        this.noticeNo = value;
    }

    /**
     * Gets the value of the noticeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNoticeDate() {
        return noticeDate;
    }

    /**
     * Sets the value of the noticeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNoticeDate(XMLGregorianCalendar value) {
        this.noticeDate = value;
    }

    /**
     * Gets the value of the returnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnType() {
        return returnType;
    }

    /**
     * Sets the value of the returnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnType(String value) {
        this.returnType = value;
    }

    /**
     * Gets the value of the receiptNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptNo() {
        return receiptNo;
    }

    /**
     * Sets the value of the receiptNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptNo(String value) {
        this.receiptNo = value;
    }

    /**
     * Gets the value of the origRetFiledDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigRetFiledDate() {
        return origRetFiledDate;
    }

    /**
     * Sets the value of the origRetFiledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigRetFiledDate(XMLGregorianCalendar value) {
        this.origRetFiledDate = value;
    }

    /**
     * Gets the value of the residentialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialStatus() {
        return residentialStatus;
    }

    /**
     * Sets the value of the residentialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialStatus(String value) {
        this.residentialStatus = value;
    }

    /**
     * Gets the value of the taxStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxStatus() {
        return taxStatus;
    }

    /**
     * Sets the value of the taxStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxStatus(String value) {
        this.taxStatus = value;
    }

    /**
     * Gets the value of the asseseeRepFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsseseeRepFlg() {
        return asseseeRepFlg;
    }

    /**
     * Sets the value of the asseseeRepFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsseseeRepFlg(String value) {
        this.asseseeRepFlg = value;
    }

    /**
     * Gets the value of the assesseeRep property.
     * 
     * @return
     *     possible object is
     *     {@link AssesseeRep }
     *     
     */
    public AssesseeRep getAssesseeRep() {
        return assesseeRep;
    }

    /**
     * Sets the value of the assesseeRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssesseeRep }
     *     
     */
    public void setAssesseeRep(AssesseeRep value) {
        this.assesseeRep = value;
    }

}
