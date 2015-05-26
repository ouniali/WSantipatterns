
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyPointsAccrualsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyPointsAccrualsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedLoyalty" maxOccurs="99">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/>
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
@XmlType(name = "LoyaltyPointsAccrualsType", propOrder = {
    "selectedLoyalty"
})
public class LoyaltyPointsAccrualsType {

    @XmlElement(name = "SelectedLoyalty", required = true)
    protected List<LoyaltyPointsAccrualsType.SelectedLoyalty> selectedLoyalty;

    /**
     * Gets the value of the selectedLoyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedLoyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyPointsAccrualsType.SelectedLoyalty }
     * 
     * 
     */
    public List<LoyaltyPointsAccrualsType.SelectedLoyalty> getSelectedLoyalty() {
        if (selectedLoyalty == null) {
            selectedLoyalty = new ArrayList<LoyaltyPointsAccrualsType.SelectedLoyalty>();
        }
        return this.selectedLoyalty;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedLoyalty {

        @XmlAttribute(name = "ReservationActionType")
        protected String reservationActionType;
        @XmlAttribute(name = "SelectedLoyaltyRPH")
        protected String selectedLoyaltyRPH;
        @XmlAttribute(name = "ProgramCode")
        protected String programCode;
        @XmlAttribute(name = "BonusCode")
        protected String bonusCode;
        @XmlAttribute(name = "AccountID")
        protected String accountID;
        @XmlAttribute(name = "PointsEarned")
        protected String pointsEarned;

        /**
         * Gets the value of the reservationActionType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReservationActionType() {
            return reservationActionType;
        }

        /**
         * Sets the value of the reservationActionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReservationActionType(String value) {
            this.reservationActionType = value;
        }

        /**
         * Gets the value of the selectedLoyaltyRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectedLoyaltyRPH() {
            return selectedLoyaltyRPH;
        }

        /**
         * Sets the value of the selectedLoyaltyRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectedLoyaltyRPH(String value) {
            this.selectedLoyaltyRPH = value;
        }

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
         *     {@link String }
         *     
         */
        public String getPointsEarned() {
            return pointsEarned;
        }

        /**
         * Sets the value of the pointsEarned property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPointsEarned(String value) {
            this.pointsEarned = value;
        }

    }

}
