
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseException">
 *   &lt;complexContent>
 *     &lt;extension base="{http://abr.business.gov.au/ABRXMLSearch/}ResponseBody">
 *       &lt;sequence>
 *         &lt;element name="exceptionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exceptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseException", propOrder = {
    "exceptionDescription",
    "exceptionCode"
})
public class ResponseException
    extends ResponseBody
{

    protected String exceptionDescription;
    protected String exceptionCode;

    /**
     * Gets the value of the exceptionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionDescription() {
        return exceptionDescription;
    }

    /**
     * Sets the value of the exceptionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionDescription(String value) {
        this.exceptionDescription = value;
    }

    /**
     * Gets the value of the exceptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionCode() {
        return exceptionCode;
    }

    /**
     * Sets the value of the exceptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionCode(String value) {
        this.exceptionCode = value;
    }

}
