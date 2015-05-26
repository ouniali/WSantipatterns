
package com.xifin.schema.accessionsearch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.xifin.schema.msgheader.MessageHeader;
import com.xifin.schema.types.StatusType;


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
 *         &lt;element ref="{http://www.xifin.com/schema/msgHeader}MessageHeader"/>
 *         &lt;element name="Payload">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Status" type="{http://www.xifin.com/schema/types}StatusType" minOccurs="0"/>
 *                   &lt;element name="TotalPatientDueAmount" type="{http://www.xifin.com/schema/types}AmountType" minOccurs="0"/>
 *                   &lt;element name="TotalBalanceDueAmount" type="{http://www.xifin.com/schema/types}AmountType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.xifin.com/schema/accessionSearch}AccessionSearchResponseMessage" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "messageHeader",
    "payload"
})
@XmlRootElement(name = "AccessionSearchResponse")
public class AccessionSearchResponse {

    @XmlElement(name = "MessageHeader", namespace = "http://www.xifin.com/schema/msgHeader", required = true)
    protected MessageHeader messageHeader;
    @XmlElement(name = "Payload", required = true)
    protected AccessionSearchResponse.Payload payload;

    /**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader }
     *     
     */
    public MessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader }
     *     
     */
    public void setMessageHeader(MessageHeader value) {
        this.messageHeader = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link AccessionSearchResponse.Payload }
     *     
     */
    public AccessionSearchResponse.Payload getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessionSearchResponse.Payload }
     *     
     */
    public void setPayload(AccessionSearchResponse.Payload value) {
        this.payload = value;
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
     *         &lt;element name="Status" type="{http://www.xifin.com/schema/types}StatusType" minOccurs="0"/>
     *         &lt;element name="TotalPatientDueAmount" type="{http://www.xifin.com/schema/types}AmountType" minOccurs="0"/>
     *         &lt;element name="TotalBalanceDueAmount" type="{http://www.xifin.com/schema/types}AmountType" minOccurs="0"/>
     *         &lt;element ref="{http://www.xifin.com/schema/accessionSearch}AccessionSearchResponseMessage" maxOccurs="unbounded" minOccurs="0"/>
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
        "status",
        "totalPatientDueAmount",
        "totalBalanceDueAmount",
        "accessionSearchResponseMessage"
    })
    public static class Payload {

        @XmlElement(name = "Status")
        protected StatusType status;
        @XmlElement(name = "TotalPatientDueAmount")
        protected BigDecimal totalPatientDueAmount;
        @XmlElement(name = "TotalBalanceDueAmount")
        protected BigDecimal totalBalanceDueAmount;
        @XmlElement(name = "AccessionSearchResponseMessage")
        protected List<AccessionSearchResponseMessage> accessionSearchResponseMessage;

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link StatusType }
         *     
         */
        public StatusType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType }
         *     
         */
        public void setStatus(StatusType value) {
            this.status = value;
        }

        /**
         * Gets the value of the totalPatientDueAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalPatientDueAmount() {
            return totalPatientDueAmount;
        }

        /**
         * Sets the value of the totalPatientDueAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalPatientDueAmount(BigDecimal value) {
            this.totalPatientDueAmount = value;
        }

        /**
         * Gets the value of the totalBalanceDueAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalBalanceDueAmount() {
            return totalBalanceDueAmount;
        }

        /**
         * Sets the value of the totalBalanceDueAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalBalanceDueAmount(BigDecimal value) {
            this.totalBalanceDueAmount = value;
        }

        /**
         * Gets the value of the accessionSearchResponseMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accessionSearchResponseMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccessionSearchResponseMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccessionSearchResponseMessage }
         * 
         * 
         */
        public List<AccessionSearchResponseMessage> getAccessionSearchResponseMessage() {
            if (accessionSearchResponseMessage == null) {
                accessionSearchResponseMessage = new ArrayList<AccessionSearchResponseMessage>();
            }
            return this.accessionSearchResponseMessage;
        }

    }

}
