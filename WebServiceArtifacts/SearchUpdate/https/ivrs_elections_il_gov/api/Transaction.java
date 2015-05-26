
package https.ivrs_elections_il_gov.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="TransactID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LocalID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StateID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StateStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Transaction" use="required" type="{https://ivrs.elections.il.gov/api}VoterTransactionQueueTypes" />
 *       &lt;attribute name="Param1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Param2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Explanation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction")
public class Transaction {

    @XmlAttribute(name = "TransactID")
    protected String transactID;
    @XmlAttribute(name = "LocalID")
    protected String localID;
    @XmlAttribute(name = "StateID")
    protected String stateID;
    @XmlAttribute(name = "StateStatus")
    protected String stateStatus;
    @XmlAttribute(name = "Transaction", required = true)
    protected VoterTransactionQueueTypes transaction;
    @XmlAttribute(name = "Param1")
    protected String param1;
    @XmlAttribute(name = "Param2")
    protected String param2;
    @XmlAttribute(name = "DateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlAttribute(name = "Reason")
    protected String reason;
    @XmlAttribute(name = "Explanation")
    protected String explanation;

    /**
     * Gets the value of the transactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactID() {
        return transactID;
    }

    /**
     * Sets the value of the transactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactID(String value) {
        this.transactID = value;
    }

    /**
     * Gets the value of the localID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalID() {
        return localID;
    }

    /**
     * Sets the value of the localID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalID(String value) {
        this.localID = value;
    }

    /**
     * Gets the value of the stateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateID() {
        return stateID;
    }

    /**
     * Sets the value of the stateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateID(String value) {
        this.stateID = value;
    }

    /**
     * Gets the value of the stateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateStatus() {
        return stateStatus;
    }

    /**
     * Sets the value of the stateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateStatus(String value) {
        this.stateStatus = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link VoterTransactionQueueTypes }
     *     
     */
    public VoterTransactionQueueTypes getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoterTransactionQueueTypes }
     *     
     */
    public void setTransaction(VoterTransactionQueueTypes value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the param1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam1() {
        return param1;
    }

    /**
     * Sets the value of the param1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam1(String value) {
        this.param1 = value;
    }

    /**
     * Gets the value of the param2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam2() {
        return param2;
    }

    /**
     * Sets the value of the param2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam2(String value) {
        this.param2 = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanation(String value) {
        this.explanation = value;
    }

}
