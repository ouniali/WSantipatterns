
package com.familytreemaker.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FactTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FactTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NAME"/>
 *               &lt;enumeration value="BIRT"/>
 *               &lt;enumeration value="DEAT"/>
 *               &lt;enumeration value="MARR"/>
 *               &lt;enumeration value="ADOP"/>
 *               &lt;enumeration value="ANUL"/>
 *               &lt;enumeration value="BAPM"/>
 *               &lt;enumeration value="BAPL"/>
 *               &lt;enumeration value="BARM"/>
 *               &lt;enumeration value="BASM"/>
 *               &lt;enumeration value="BLES"/>
 *               &lt;enumeration value="BURI"/>
 *               &lt;enumeration value="CAST"/>
 *               &lt;enumeration value="CENS"/>
 *               &lt;enumeration value="CHR"/>
 *               &lt;enumeration value="_CIRC"/>
 *               &lt;enumeration value="CONF"/>
 *               &lt;enumeration value="CONL"/>
 *               &lt;enumeration value="CREM"/>
 *               &lt;enumeration value="_DEG"/>
 *               &lt;enumeration value="DIV"/>
 *               &lt;enumeration value="EDUC"/>
 *               &lt;enumeration value="_ELEC"/>
 *               &lt;enumeration value="EMIG"/>
 *               &lt;enumeration value="_EMPLOY"/>
 *               &lt;enumeration value="ENDL"/>
 *               &lt;enumeration value="ENGA"/>
 *               &lt;enumeration value="_EXCM"/>
 *               &lt;enumeration value="FCOM"/>
 *               &lt;enumeration value="_FUN"/>
 *               &lt;enumeration value="GRAD"/>
 *               &lt;enumeration value="IMMI"/>
 *               &lt;enumeration value="_MILT"/>
 *               &lt;enumeration value="_MISN"/>
 *               &lt;enumeration value="NATU"/>
 *               &lt;enumeration value="ORDN"/>
 *               &lt;enumeration value="PROB"/>
 *               &lt;enumeration value="PROP"/>
 *               &lt;enumeration value="RETI"/>
 *               &lt;enumeration value="SLGC"/>
 *               &lt;enumeration value="_SEPR"/>
 *               &lt;enumeration value="WILL"/>
 *               &lt;enumeration value="ALIA"/>
 *               &lt;enumeration value="TITL"/>
 *               &lt;enumeration value="SEX"/>
 *               &lt;enumeration value="ADDR"/>
 *               &lt;enumeration value="EMAIL"/>
 *               &lt;enumeration value="_WEB"/>
 *               &lt;enumeration value="PHON"/>
 *               &lt;enumeration value="REFN"/>
 *               &lt;enumeration value="_MILTID"/>
 *               &lt;enumeration value="_HEIG"/>
 *               &lt;enumeration value="_WEIG"/>
 *               &lt;enumeration value="_DCAUSE"/>
 *               &lt;enumeration value="_MDCL"/>
 *               &lt;enumeration value="_DNA"/>
 *               &lt;enumeration value="NATI"/>
 *               &lt;enumeration value="OCCU"/>
 *               &lt;enumeration value="RELI"/>
 *               &lt;enumeration value="_SETT"/>
 *               &lt;enumeration value="CHRA"/>
 *               &lt;enumeration value="RESI"/>
 *               &lt;enumeration value="SLGS"/>
 *               &lt;enumeration value="MARL"/>
 *               &lt;enumeration value="MARC"/>
 *               &lt;enumeration value="MARB"/>
 *               &lt;enumeration value="MARS"/>
 *               &lt;enumeration value="DIVF"/>
 *               &lt;enumeration value="SSN"/>
 *               &lt;enumeration value="DSCR"/>
 *               &lt;enumeration value="AFN"/>
 *               &lt;enumeration value="_NAMS"/>
 *               &lt;enumeration value="ARVL"/>
 *               &lt;enumeration value="DPRT"/>
 *               &lt;enumeration value="EVEN"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FactTypeType", propOrder = {
    "name",
    "label"
})
public class FactTypeType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Label")
    protected String label;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

}
