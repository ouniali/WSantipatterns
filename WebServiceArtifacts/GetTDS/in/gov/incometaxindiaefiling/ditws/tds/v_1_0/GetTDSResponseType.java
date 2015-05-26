
package in.gov.incometaxindiaefiling.ditws.tds.v_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTDSResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTDSResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TDSonSalaries" type="{http://incometaxindiaefiling.gov.in/ditws/tds/v_1_0}TDSonSalariesType"/>
 *         &lt;element name="TDSonOthThanSals" type="{http://incometaxindiaefiling.gov.in/ditws/tds/v_1_0}TDSonOthThanSalsType"/>
 *         &lt;element name="ScheduleTCS" type="{http://incometaxindiaefiling.gov.in/ditws/tds/v_1_0}ScheduleTCSType"/>
 *         &lt;element name="TaxPayments" type="{http://incometaxindiaefiling.gov.in/ditws/tds/v_1_0}TaxPaymentsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTDSResponseType", propOrder = {
    "tdSonSalaries",
    "tdSonOthThanSals",
    "scheduleTCS",
    "taxPayments"
})
public class GetTDSResponseType {

    @XmlElement(name = "TDSonSalaries", required = true, nillable = true)
    protected TDSonSalariesType tdSonSalaries;
    @XmlElement(name = "TDSonOthThanSals", required = true, nillable = true)
    protected TDSonOthThanSalsType tdSonOthThanSals;
    @XmlElement(name = "ScheduleTCS", required = true, nillable = true)
    protected ScheduleTCSType scheduleTCS;
    @XmlElement(name = "TaxPayments", required = true, nillable = true)
    protected TaxPaymentsType taxPayments;

    /**
     * Gets the value of the tdSonSalaries property.
     * 
     * @return
     *     possible object is
     *     {@link TDSonSalariesType }
     *     
     */
    public TDSonSalariesType getTDSonSalaries() {
        return tdSonSalaries;
    }

    /**
     * Sets the value of the tdSonSalaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDSonSalariesType }
     *     
     */
    public void setTDSonSalaries(TDSonSalariesType value) {
        this.tdSonSalaries = value;
    }

    /**
     * Gets the value of the tdSonOthThanSals property.
     * 
     * @return
     *     possible object is
     *     {@link TDSonOthThanSalsType }
     *     
     */
    public TDSonOthThanSalsType getTDSonOthThanSals() {
        return tdSonOthThanSals;
    }

    /**
     * Sets the value of the tdSonOthThanSals property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDSonOthThanSalsType }
     *     
     */
    public void setTDSonOthThanSals(TDSonOthThanSalsType value) {
        this.tdSonOthThanSals = value;
    }

    /**
     * Gets the value of the scheduleTCS property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleTCSType }
     *     
     */
    public ScheduleTCSType getScheduleTCS() {
        return scheduleTCS;
    }

    /**
     * Sets the value of the scheduleTCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleTCSType }
     *     
     */
    public void setScheduleTCS(ScheduleTCSType value) {
        this.scheduleTCS = value;
    }

    /**
     * Gets the value of the taxPayments property.
     * 
     * @return
     *     possible object is
     *     {@link TaxPaymentsType }
     *     
     */
    public TaxPaymentsType getTaxPayments() {
        return taxPayments;
    }

    /**
     * Sets the value of the taxPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPaymentsType }
     *     
     */
    public void setTaxPayments(TaxPaymentsType value) {
        this.taxPayments = value;
    }

}
