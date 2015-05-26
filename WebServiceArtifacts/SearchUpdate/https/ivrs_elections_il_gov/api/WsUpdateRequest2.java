
package https.ivrs_elections_il_gov.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsUpdateRequest2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsUpdateRequest2">
 *   &lt;complexContent>
 *     &lt;extension base="{https://ivrs.elections.il.gov/api}WsUpdateRequest">
 *       &lt;attribute name="TransactID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrecinctID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrecinctSplit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsUpdateRequest2")
public class WsUpdateRequest2
    extends WsUpdateRequest
{

    @XmlAttribute(name = "TransactID")
    protected String transactID;
    @XmlAttribute(name = "PrecinctID")
    protected String precinctID;
    @XmlAttribute(name = "PrecinctSplit")
    protected String precinctSplit;

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
     * Gets the value of the precinctID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecinctID() {
        return precinctID;
    }

    /**
     * Sets the value of the precinctID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecinctID(String value) {
        this.precinctID = value;
    }

    /**
     * Gets the value of the precinctSplit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecinctSplit() {
        return precinctSplit;
    }

    /**
     * Sets the value of the precinctSplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecinctSplit(String value) {
        this.precinctSplit = value;
    }

}
