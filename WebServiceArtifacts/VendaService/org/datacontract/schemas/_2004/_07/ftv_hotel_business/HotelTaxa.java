
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelTaxa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelTaxa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_x003C_CodigoIsoMoeda_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_CodigoMoeda_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="_x003C_CodigoTaxa_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="_x003C_DescricaoMoeda_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_IndicadorIncluidoValor_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_NomeTaxa_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_SiglaMoeda_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_x003C_TipoTaxa_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="_x003C_ValorTaxa_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelTaxa", propOrder = {
    "x003CCodigoIsoMoedaX003EKBackingField",
    "x003CCodigoMoedaX003EKBackingField",
    "x003CCodigoTaxaX003EKBackingField",
    "x003CDescricaoMoedaX003EKBackingField",
    "x003CIndicadorIncluidoValorX003EKBackingField",
    "x003CNomeTaxaX003EKBackingField",
    "x003CSiglaMoedaX003EKBackingField",
    "x003CTipoTaxaX003EKBackingField",
    "x003CValorTaxaX003EKBackingField"
})
public class HotelTaxa {

    @XmlElement(name = "_x003C_CodigoIsoMoeda_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CCodigoIsoMoedaX003EKBackingField;
    @XmlElement(name = "_x003C_CodigoMoeda_x003E_k__BackingField", required = true, type = Long.class, nillable = true)
    protected Long x003CCodigoMoedaX003EKBackingField;
    @XmlElement(name = "_x003C_CodigoTaxa_x003E_k__BackingField", required = true, type = Long.class, nillable = true)
    protected Long x003CCodigoTaxaX003EKBackingField;
    @XmlElement(name = "_x003C_DescricaoMoeda_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CDescricaoMoedaX003EKBackingField;
    @XmlElement(name = "_x003C_IndicadorIncluidoValor_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CIndicadorIncluidoValorX003EKBackingField;
    @XmlElement(name = "_x003C_NomeTaxa_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CNomeTaxaX003EKBackingField;
    @XmlElement(name = "_x003C_SiglaMoeda_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CSiglaMoedaX003EKBackingField;
    @XmlElement(name = "_x003C_TipoTaxa_x003E_k__BackingField", required = true, type = Long.class, nillable = true)
    protected Long x003CTipoTaxaX003EKBackingField;
    @XmlElement(name = "_x003C_ValorTaxa_x003E_k__BackingField", required = true)
    protected BigDecimal x003CValorTaxaX003EKBackingField;

    /**
     * Gets the value of the x003CCodigoIsoMoedaX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CCodigoIsoMoedaX003EKBackingField() {
        return x003CCodigoIsoMoedaX003EKBackingField;
    }

    /**
     * Sets the value of the x003CCodigoIsoMoedaX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CCodigoIsoMoedaX003EKBackingField(String value) {
        this.x003CCodigoIsoMoedaX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CCodigoMoedaX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getX003CCodigoMoedaX003EKBackingField() {
        return x003CCodigoMoedaX003EKBackingField;
    }

    /**
     * Sets the value of the x003CCodigoMoedaX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setX003CCodigoMoedaX003EKBackingField(Long value) {
        this.x003CCodigoMoedaX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CCodigoTaxaX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getX003CCodigoTaxaX003EKBackingField() {
        return x003CCodigoTaxaX003EKBackingField;
    }

    /**
     * Sets the value of the x003CCodigoTaxaX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setX003CCodigoTaxaX003EKBackingField(Long value) {
        this.x003CCodigoTaxaX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CDescricaoMoedaX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CDescricaoMoedaX003EKBackingField() {
        return x003CDescricaoMoedaX003EKBackingField;
    }

    /**
     * Sets the value of the x003CDescricaoMoedaX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CDescricaoMoedaX003EKBackingField(String value) {
        this.x003CDescricaoMoedaX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CIndicadorIncluidoValorX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CIndicadorIncluidoValorX003EKBackingField() {
        return x003CIndicadorIncluidoValorX003EKBackingField;
    }

    /**
     * Sets the value of the x003CIndicadorIncluidoValorX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CIndicadorIncluidoValorX003EKBackingField(String value) {
        this.x003CIndicadorIncluidoValorX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CNomeTaxaX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CNomeTaxaX003EKBackingField() {
        return x003CNomeTaxaX003EKBackingField;
    }

    /**
     * Sets the value of the x003CNomeTaxaX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CNomeTaxaX003EKBackingField(String value) {
        this.x003CNomeTaxaX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CSiglaMoedaX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CSiglaMoedaX003EKBackingField() {
        return x003CSiglaMoedaX003EKBackingField;
    }

    /**
     * Sets the value of the x003CSiglaMoedaX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CSiglaMoedaX003EKBackingField(String value) {
        this.x003CSiglaMoedaX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CTipoTaxaX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getX003CTipoTaxaX003EKBackingField() {
        return x003CTipoTaxaX003EKBackingField;
    }

    /**
     * Sets the value of the x003CTipoTaxaX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setX003CTipoTaxaX003EKBackingField(Long value) {
        this.x003CTipoTaxaX003EKBackingField = value;
    }

    /**
     * Gets the value of the x003CValorTaxaX003EKBackingField property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getX003CValorTaxaX003EKBackingField() {
        return x003CValorTaxaX003EKBackingField;
    }

    /**
     * Sets the value of the x003CValorTaxaX003EKBackingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setX003CValorTaxaX003EKBackingField(BigDecimal value) {
        this.x003CValorTaxaX003EKBackingField = value;
    }

}
