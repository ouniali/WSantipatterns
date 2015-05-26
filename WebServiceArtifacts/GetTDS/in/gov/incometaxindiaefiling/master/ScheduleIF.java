
package in.gov.incometaxindiaefiling.master;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="PartnerFirmDetails" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FirmName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="75"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FirmPAN">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                         &lt;whiteSpace value="collapse"/>
 *                         &lt;pattern value="[A-Z][A-Z][A-Z][A-Z][A-Z]\d\d\d\d[A-Z]"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ProfitSharePercent">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ProfitShareAmt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FirmCapBalOn31Mar">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalProfitShareAmt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalFirmCapBalOn31Mar">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
    "partnerFirmDetails",
    "totalProfitShareAmt",
    "totalFirmCapBalOn31Mar"
})
@XmlRootElement(name = "ScheduleIF")
public class ScheduleIF {

    @XmlElement(name = "PartnerFirmDetails", required = true)
    protected List<ScheduleIF.PartnerFirmDetails> partnerFirmDetails;
    @XmlElement(name = "TotalProfitShareAmt", defaultValue = "0")
    protected long totalProfitShareAmt;
    @XmlElement(name = "TotalFirmCapBalOn31Mar", defaultValue = "0")
    protected long totalFirmCapBalOn31Mar;

    /**
     * Gets the value of the partnerFirmDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerFirmDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerFirmDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleIF.PartnerFirmDetails }
     * 
     * 
     */
    public List<ScheduleIF.PartnerFirmDetails> getPartnerFirmDetails() {
        if (partnerFirmDetails == null) {
            partnerFirmDetails = new ArrayList<ScheduleIF.PartnerFirmDetails>();
        }
        return this.partnerFirmDetails;
    }

    /**
     * Gets the value of the totalProfitShareAmt property.
     * 
     */
    public long getTotalProfitShareAmt() {
        return totalProfitShareAmt;
    }

    /**
     * Sets the value of the totalProfitShareAmt property.
     * 
     */
    public void setTotalProfitShareAmt(long value) {
        this.totalProfitShareAmt = value;
    }

    /**
     * Gets the value of the totalFirmCapBalOn31Mar property.
     * 
     */
    public long getTotalFirmCapBalOn31Mar() {
        return totalFirmCapBalOn31Mar;
    }

    /**
     * Sets the value of the totalFirmCapBalOn31Mar property.
     * 
     */
    public void setTotalFirmCapBalOn31Mar(long value) {
        this.totalFirmCapBalOn31Mar = value;
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
     *         &lt;element name="FirmName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="75"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FirmPAN">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *               &lt;whiteSpace value="collapse"/>
     *               &lt;pattern value="[A-Z][A-Z][A-Z][A-Z][A-Z]\d\d\d\d[A-Z]"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ProfitSharePercent">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ProfitShareAmt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FirmCapBalOn31Mar">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "firmName",
        "firmPAN",
        "profitSharePercent",
        "profitShareAmt",
        "firmCapBalOn31Mar"
    })
    public static class PartnerFirmDetails {

        @XmlElement(name = "FirmName", required = true)
        protected String firmName;
        @XmlElement(name = "FirmPAN", required = true)
        protected String firmPAN;
        @XmlElement(name = "ProfitSharePercent", defaultValue = "0")
        protected double profitSharePercent;
        @XmlElement(name = "ProfitShareAmt", defaultValue = "0")
        protected long profitShareAmt;
        @XmlElement(name = "FirmCapBalOn31Mar", defaultValue = "0")
        protected long firmCapBalOn31Mar;

        /**
         * Gets the value of the firmName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirmName() {
            return firmName;
        }

        /**
         * Sets the value of the firmName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirmName(String value) {
            this.firmName = value;
        }

        /**
         * Gets the value of the firmPAN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirmPAN() {
            return firmPAN;
        }

        /**
         * Sets the value of the firmPAN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirmPAN(String value) {
            this.firmPAN = value;
        }

        /**
         * Gets the value of the profitSharePercent property.
         * 
         */
        public double getProfitSharePercent() {
            return profitSharePercent;
        }

        /**
         * Sets the value of the profitSharePercent property.
         * 
         */
        public void setProfitSharePercent(double value) {
            this.profitSharePercent = value;
        }

        /**
         * Gets the value of the profitShareAmt property.
         * 
         */
        public long getProfitShareAmt() {
            return profitShareAmt;
        }

        /**
         * Sets the value of the profitShareAmt property.
         * 
         */
        public void setProfitShareAmt(long value) {
            this.profitShareAmt = value;
        }

        /**
         * Gets the value of the firmCapBalOn31Mar property.
         * 
         */
        public long getFirmCapBalOn31Mar() {
            return firmCapBalOn31Mar;
        }

        /**
         * Sets the value of the firmCapBalOn31Mar property.
         * 
         */
        public void setFirmCapBalOn31Mar(long value) {
            this.firmCapBalOn31Mar = value;
        }

    }

}
