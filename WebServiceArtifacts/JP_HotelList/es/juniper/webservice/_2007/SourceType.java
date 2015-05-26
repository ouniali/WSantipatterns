
package es.juniper.webservice._2007;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestorID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.juniper.es/webservice/2007/}UniqueID_Type">
 *                 &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="AgentDutyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceType", propOrder = {
    "requestorID"
})
public class SourceType {

    @XmlElement(name = "RequestorID")
    protected SourceType.RequestorID requestorID;
    @XmlAttribute(name = "AgentDutyCode")
    protected String agentDutyCode;

    /**
     * Gets the value of the requestorID property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType.RequestorID }
     *     
     */
    public SourceType.RequestorID getRequestorID() {
        return requestorID;
    }

    /**
     * Sets the value of the requestorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType.RequestorID }
     *     
     */
    public void setRequestorID(SourceType.RequestorID value) {
        this.requestorID = value;
    }

    /**
     * Gets the value of the agentDutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentDutyCode() {
        return agentDutyCode;
    }

    /**
     * Sets the value of the agentDutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentDutyCode(String value) {
        this.agentDutyCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.juniper.es/webservice/2007/}UniqueID_Type">
     *       &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RequestorID
        extends UniqueIDType
    {

        @XmlAttribute(name = "MessagePassword")
        protected String messagePassword;

        /**
         * Gets the value of the messagePassword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessagePassword() {
            return messagePassword;
        }

        /**
         * Sets the value of the messagePassword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessagePassword(String value) {
            this.messagePassword = value;
        }

    }

}
