
package net.cangooroo.services.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import clientcredential.ws_2013.ClientCredential;
import hotel.ws_2013.ResultManipulation;
import hotel.ws_2013.SearchFilter;


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
 *         &lt;element name="credential" type="{WS_2013.ClientCredential}ClientCredential" minOccurs="0"/>
 *         &lt;element name="resultPagination" type="{WS_2013.Hotel}SearchFilter" minOccurs="0"/>
 *         &lt;element name="resultManipulation" type="{WS_2013.Hotel}ResultManipulation" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "credential",
    "resultPagination",
    "resultManipulation",
    "token"
})
@XmlRootElement(name = "getSessionResult")
public class GetSessionResult {

    protected ClientCredential credential;
    protected SearchFilter resultPagination;
    protected ResultManipulation resultManipulation;
    protected String token;

    /**
     * Gets the value of the credential property.
     * 
     * @return
     *     possible object is
     *     {@link ClientCredential }
     *     
     */
    public ClientCredential getCredential() {
        return credential;
    }

    /**
     * Sets the value of the credential property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientCredential }
     *     
     */
    public void setCredential(ClientCredential value) {
        this.credential = value;
    }

    /**
     * Gets the value of the resultPagination property.
     * 
     * @return
     *     possible object is
     *     {@link SearchFilter }
     *     
     */
    public SearchFilter getResultPagination() {
        return resultPagination;
    }

    /**
     * Sets the value of the resultPagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFilter }
     *     
     */
    public void setResultPagination(SearchFilter value) {
        this.resultPagination = value;
    }

    /**
     * Gets the value of the resultManipulation property.
     * 
     * @return
     *     possible object is
     *     {@link ResultManipulation }
     *     
     */
    public ResultManipulation getResultManipulation() {
        return resultManipulation;
    }

    /**
     * Sets the value of the resultManipulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultManipulation }
     *     
     */
    public void setResultManipulation(ResultManipulation value) {
        this.resultManipulation = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
