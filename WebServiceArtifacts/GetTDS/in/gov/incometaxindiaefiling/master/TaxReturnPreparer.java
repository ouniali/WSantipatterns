
package in.gov.incometaxindiaefiling.master;

import java.math.BigInteger;
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
 *         &lt;element name="IdentificationNoOfTRP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NameOfTRP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="125"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReImbFrmGov">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
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
    "identificationNoOfTRP",
    "nameOfTRP",
    "reImbFrmGov"
})
@XmlRootElement(name = "TaxReturnPreparer")
public class TaxReturnPreparer {

    @XmlElement(name = "IdentificationNoOfTRP", required = true)
    protected String identificationNoOfTRP;
    @XmlElement(name = "NameOfTRP", required = true)
    protected String nameOfTRP;
    @XmlElement(name = "ReImbFrmGov", required = true, defaultValue = "0")
    protected BigInteger reImbFrmGov;

    /**
     * Gets the value of the identificationNoOfTRP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationNoOfTRP() {
        return identificationNoOfTRP;
    }

    /**
     * Sets the value of the identificationNoOfTRP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationNoOfTRP(String value) {
        this.identificationNoOfTRP = value;
    }

    /**
     * Gets the value of the nameOfTRP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfTRP() {
        return nameOfTRP;
    }

    /**
     * Sets the value of the nameOfTRP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfTRP(String value) {
        this.nameOfTRP = value;
    }

    /**
     * Gets the value of the reImbFrmGov property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReImbFrmGov() {
        return reImbFrmGov;
    }

    /**
     * Sets the value of the reImbFrmGov property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReImbFrmGov(BigInteger value) {
        this.reImbFrmGov = value;
    }

}
