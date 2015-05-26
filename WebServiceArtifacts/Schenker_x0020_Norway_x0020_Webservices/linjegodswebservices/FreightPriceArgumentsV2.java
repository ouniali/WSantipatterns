
package linjegodswebservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FreightPriceArgumentsV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightPriceArgumentsV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Volumd3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeOfGoods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HandleCodeOfPackes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsignorPostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsigneePostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcceptanceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NumberOfPackages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UnitNumbers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LengthCm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WidthCm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HeightCm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightPriceArgumentsV2", propOrder = {
    "customnumber",
    "paymentCode",
    "weight",
    "volumd3",
    "productCode",
    "typeOfGoods",
    "handleCodeOfPackes",
    "consignorPostCode",
    "consigneePostCode",
    "acceptanceDate",
    "numberOfPackages",
    "unitNumbers",
    "unitCode",
    "lengthCm",
    "widthCm",
    "heightCm"
})
public class FreightPriceArgumentsV2 {

    @XmlElement(name = "Customnumber")
    protected String customnumber;
    @XmlElement(name = "PaymentCode")
    protected String paymentCode;
    @XmlElement(name = "Weight", required = true)
    protected BigDecimal weight;
    @XmlElement(name = "Volumd3", required = true)
    protected BigDecimal volumd3;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "TypeOfGoods")
    protected String typeOfGoods;
    @XmlElement(name = "HandleCodeOfPackes")
    protected String handleCodeOfPackes;
    @XmlElement(name = "ConsignorPostCode")
    protected String consignorPostCode;
    @XmlElement(name = "ConsigneePostCode")
    protected String consigneePostCode;
    @XmlElement(name = "AcceptanceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acceptanceDate;
    @XmlElement(name = "NumberOfPackages")
    protected int numberOfPackages;
    @XmlElement(name = "UnitNumbers")
    protected int unitNumbers;
    @XmlElement(name = "UnitCode")
    protected String unitCode;
    @XmlElement(name = "LengthCm")
    protected int lengthCm;
    @XmlElement(name = "WidthCm")
    protected int widthCm;
    @XmlElement(name = "HeightCm")
    protected int heightCm;

    /**
     * Gets the value of the customnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomnumber() {
        return customnumber;
    }

    /**
     * Sets the value of the customnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomnumber(String value) {
        this.customnumber = value;
    }

    /**
     * Gets the value of the paymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCode() {
        return paymentCode;
    }

    /**
     * Sets the value of the paymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCode(String value) {
        this.paymentCode = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Gets the value of the volumd3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumd3() {
        return volumd3;
    }

    /**
     * Sets the value of the volumd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumd3(BigDecimal value) {
        this.volumd3 = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the typeOfGoods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfGoods() {
        return typeOfGoods;
    }

    /**
     * Sets the value of the typeOfGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfGoods(String value) {
        this.typeOfGoods = value;
    }

    /**
     * Gets the value of the handleCodeOfPackes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleCodeOfPackes() {
        return handleCodeOfPackes;
    }

    /**
     * Sets the value of the handleCodeOfPackes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleCodeOfPackes(String value) {
        this.handleCodeOfPackes = value;
    }

    /**
     * Gets the value of the consignorPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignorPostCode() {
        return consignorPostCode;
    }

    /**
     * Sets the value of the consignorPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignorPostCode(String value) {
        this.consignorPostCode = value;
    }

    /**
     * Gets the value of the consigneePostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneePostCode() {
        return consigneePostCode;
    }

    /**
     * Sets the value of the consigneePostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneePostCode(String value) {
        this.consigneePostCode = value;
    }

    /**
     * Gets the value of the acceptanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptanceDate() {
        return acceptanceDate;
    }

    /**
     * Sets the value of the acceptanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptanceDate(XMLGregorianCalendar value) {
        this.acceptanceDate = value;
    }

    /**
     * Gets the value of the numberOfPackages property.
     * 
     */
    public int getNumberOfPackages() {
        return numberOfPackages;
    }

    /**
     * Sets the value of the numberOfPackages property.
     * 
     */
    public void setNumberOfPackages(int value) {
        this.numberOfPackages = value;
    }

    /**
     * Gets the value of the unitNumbers property.
     * 
     */
    public int getUnitNumbers() {
        return unitNumbers;
    }

    /**
     * Sets the value of the unitNumbers property.
     * 
     */
    public void setUnitNumbers(int value) {
        this.unitNumbers = value;
    }

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the lengthCm property.
     * 
     */
    public int getLengthCm() {
        return lengthCm;
    }

    /**
     * Sets the value of the lengthCm property.
     * 
     */
    public void setLengthCm(int value) {
        this.lengthCm = value;
    }

    /**
     * Gets the value of the widthCm property.
     * 
     */
    public int getWidthCm() {
        return widthCm;
    }

    /**
     * Sets the value of the widthCm property.
     * 
     */
    public void setWidthCm(int value) {
        this.widthCm = value;
    }

    /**
     * Gets the value of the heightCm property.
     * 
     */
    public int getHeightCm() {
        return heightCm;
    }

    /**
     * Sets the value of the heightCm property.
     * 
     */
    public void setHeightCm(int value) {
        this.heightCm = value;
    }

}
