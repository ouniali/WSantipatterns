
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MembershipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MembershipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Membership" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ProgramCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;attribute name="BonusCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;attribute name="AccountID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="PointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="TravelSector" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
@XmlType(name = "MembershipType", propOrder = {
    "membership"
})
public class MembershipType {

    @XmlElement(name = "Membership", required = true)
    protected List<MembershipType.Membership> membership;

    /**
     * Gets the value of the membership property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membership property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembership().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MembershipType.Membership }
     * 
     * 
     */
    public List<MembershipType.Membership> getMembership() {
        if (membership == null) {
            membership = new ArrayList<MembershipType.Membership>();
        }
        return this.membership;
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
     *       &lt;attribute name="ProgramCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="BonusCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="AccountID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="PointsEarned" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="TravelSector" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Membership {

        @XmlAttribute(name = "ProgramCode")
        protected String programCode;
        @XmlAttribute(name = "BonusCode")
        protected String bonusCode;
        @XmlAttribute(name = "AccountID")
        protected String accountID;
        @XmlAttribute(name = "PointsEarned")
        protected BigInteger pointsEarned;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;

        /**
         * Gets the value of the programCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramCode() {
            return programCode;
        }

        /**
         * Sets the value of the programCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramCode(String value) {
            this.programCode = value;
        }

        /**
         * Gets the value of the bonusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBonusCode() {
            return bonusCode;
        }

        /**
         * Sets the value of the bonusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBonusCode(String value) {
            this.bonusCode = value;
        }

        /**
         * Gets the value of the accountID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountID() {
            return accountID;
        }

        /**
         * Sets the value of the accountID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountID(String value) {
            this.accountID = value;
        }

        /**
         * Gets the value of the pointsEarned property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPointsEarned() {
            return pointsEarned;
        }

        /**
         * Sets the value of the pointsEarned property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPointsEarned(BigInteger value) {
            this.pointsEarned = value;
        }

        /**
         * Gets the value of the travelSector property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * Sets the value of the travelSector property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }

    }

}
