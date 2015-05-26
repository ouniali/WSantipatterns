
package in.gov.incometaxindiaefiling.master;

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
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}ComputationOfTaxLiability"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}TaxPaid"/>
 *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}Refund"/>
 *         &lt;element name="AssetOutIndiaFlag">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="YES"/>
 *               &lt;enumeration value="NO"/>
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
    "computationOfTaxLiability",
    "taxPaid",
    "refund",
    "assetOutIndiaFlag"
})
@XmlRootElement(name = "PartB_TTI")
public class PartBTTI {

    @XmlElement(name = "ComputationOfTaxLiability", required = true)
    protected ComputationOfTaxLiability computationOfTaxLiability;
    @XmlElement(name = "TaxPaid", required = true)
    protected TaxPaid taxPaid;
    @XmlElement(name = "Refund", required = true)
    protected Refund refund;
    @XmlElement(name = "AssetOutIndiaFlag", required = true, defaultValue = "NO")
    protected String assetOutIndiaFlag;

    /**
     * Gets the value of the computationOfTaxLiability property.
     * 
     * @return
     *     possible object is
     *     {@link ComputationOfTaxLiability }
     *     
     */
    public ComputationOfTaxLiability getComputationOfTaxLiability() {
        return computationOfTaxLiability;
    }

    /**
     * Sets the value of the computationOfTaxLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationOfTaxLiability }
     *     
     */
    public void setComputationOfTaxLiability(ComputationOfTaxLiability value) {
        this.computationOfTaxLiability = value;
    }

    /**
     * Gets the value of the taxPaid property.
     * 
     * @return
     *     possible object is
     *     {@link TaxPaid }
     *     
     */
    public TaxPaid getTaxPaid() {
        return taxPaid;
    }

    /**
     * Sets the value of the taxPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPaid }
     *     
     */
    public void setTaxPaid(TaxPaid value) {
        this.taxPaid = value;
    }

    /**
     *  11. Refund details
     * 
     * @return
     *     possible object is
     *     {@link Refund }
     *     
     */
    public Refund getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Refund }
     *     
     */
    public void setRefund(Refund value) {
        this.refund = value;
    }

    /**
     * Gets the value of the assetOutIndiaFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetOutIndiaFlag() {
        return assetOutIndiaFlag;
    }

    /**
     * Sets the value of the assetOutIndiaFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetOutIndiaFlag(String value) {
        this.assetOutIndiaFlag = value;
    }

}
