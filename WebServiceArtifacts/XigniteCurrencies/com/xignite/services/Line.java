
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Line complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Line">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineType" type="{http://www.xignite.com/services/}LineTypes"/>
 *         &lt;element name="From" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Line", propOrder = {
    "lineType",
    "from",
    "value1",
    "value2",
    "value3",
    "value4",
    "value5",
    "value6",
    "value7",
    "value8",
    "value9",
    "value10",
    "value11",
    "value12",
    "value13",
    "value14",
    "value15",
    "value16",
    "value17",
    "value18",
    "value19",
    "value20",
    "value21",
    "value22",
    "value23",
    "value24",
    "value25",
    "value26",
    "value27",
    "value28",
    "value29",
    "value30",
    "value31"
})
public class Line {

    @XmlElement(name = "LineType", required = true)
    @XmlSchemaType(name = "string")
    protected LineTypes lineType;
    @XmlElement(name = "From")
    protected String from;
    @XmlElement(name = "Value1")
    protected String value1;
    @XmlElement(name = "Value2")
    protected String value2;
    @XmlElement(name = "Value3")
    protected String value3;
    @XmlElement(name = "Value4")
    protected String value4;
    @XmlElement(name = "Value5")
    protected String value5;
    @XmlElement(name = "Value6")
    protected String value6;
    @XmlElement(name = "Value7")
    protected String value7;
    @XmlElement(name = "Value8")
    protected String value8;
    @XmlElement(name = "Value9")
    protected String value9;
    @XmlElement(name = "Value10")
    protected String value10;
    @XmlElement(name = "Value11")
    protected String value11;
    @XmlElement(name = "Value12")
    protected String value12;
    @XmlElement(name = "Value13")
    protected String value13;
    @XmlElement(name = "Value14")
    protected String value14;
    @XmlElement(name = "Value15")
    protected String value15;
    @XmlElement(name = "Value16")
    protected String value16;
    @XmlElement(name = "Value17")
    protected String value17;
    @XmlElement(name = "Value18")
    protected String value18;
    @XmlElement(name = "Value19")
    protected String value19;
    @XmlElement(name = "Value20")
    protected String value20;
    @XmlElement(name = "Value21")
    protected String value21;
    @XmlElement(name = "Value22")
    protected String value22;
    @XmlElement(name = "Value23")
    protected String value23;
    @XmlElement(name = "Value24")
    protected String value24;
    @XmlElement(name = "Value25")
    protected String value25;
    @XmlElement(name = "Value26")
    protected String value26;
    @XmlElement(name = "Value27")
    protected String value27;
    @XmlElement(name = "Value28")
    protected String value28;
    @XmlElement(name = "Value29")
    protected String value29;
    @XmlElement(name = "Value30")
    protected String value30;
    @XmlElement(name = "Value31")
    protected String value31;

    /**
     * Gets the value of the lineType property.
     * 
     * @return
     *     possible object is
     *     {@link LineTypes }
     *     
     */
    public LineTypes getLineType() {
        return lineType;
    }

    /**
     * Sets the value of the lineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineTypes }
     *     
     */
    public void setLineType(LineTypes value) {
        this.lineType = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the value1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue1() {
        return value1;
    }

    /**
     * Sets the value of the value1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue1(String value) {
        this.value1 = value;
    }

    /**
     * Gets the value of the value2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue2() {
        return value2;
    }

    /**
     * Sets the value of the value2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue2(String value) {
        this.value2 = value;
    }

    /**
     * Gets the value of the value3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue3() {
        return value3;
    }

    /**
     * Sets the value of the value3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue3(String value) {
        this.value3 = value;
    }

    /**
     * Gets the value of the value4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue4() {
        return value4;
    }

    /**
     * Sets the value of the value4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue4(String value) {
        this.value4 = value;
    }

    /**
     * Gets the value of the value5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue5() {
        return value5;
    }

    /**
     * Sets the value of the value5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue5(String value) {
        this.value5 = value;
    }

    /**
     * Gets the value of the value6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue6() {
        return value6;
    }

    /**
     * Sets the value of the value6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue6(String value) {
        this.value6 = value;
    }

    /**
     * Gets the value of the value7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue7() {
        return value7;
    }

    /**
     * Sets the value of the value7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue7(String value) {
        this.value7 = value;
    }

    /**
     * Gets the value of the value8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue8() {
        return value8;
    }

    /**
     * Sets the value of the value8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue8(String value) {
        this.value8 = value;
    }

    /**
     * Gets the value of the value9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue9() {
        return value9;
    }

    /**
     * Sets the value of the value9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue9(String value) {
        this.value9 = value;
    }

    /**
     * Gets the value of the value10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue10() {
        return value10;
    }

    /**
     * Sets the value of the value10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue10(String value) {
        this.value10 = value;
    }

    /**
     * Gets the value of the value11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue11() {
        return value11;
    }

    /**
     * Sets the value of the value11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue11(String value) {
        this.value11 = value;
    }

    /**
     * Gets the value of the value12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue12() {
        return value12;
    }

    /**
     * Sets the value of the value12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue12(String value) {
        this.value12 = value;
    }

    /**
     * Gets the value of the value13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue13() {
        return value13;
    }

    /**
     * Sets the value of the value13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue13(String value) {
        this.value13 = value;
    }

    /**
     * Gets the value of the value14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue14() {
        return value14;
    }

    /**
     * Sets the value of the value14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue14(String value) {
        this.value14 = value;
    }

    /**
     * Gets the value of the value15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue15() {
        return value15;
    }

    /**
     * Sets the value of the value15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue15(String value) {
        this.value15 = value;
    }

    /**
     * Gets the value of the value16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue16() {
        return value16;
    }

    /**
     * Sets the value of the value16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue16(String value) {
        this.value16 = value;
    }

    /**
     * Gets the value of the value17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue17() {
        return value17;
    }

    /**
     * Sets the value of the value17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue17(String value) {
        this.value17 = value;
    }

    /**
     * Gets the value of the value18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue18() {
        return value18;
    }

    /**
     * Sets the value of the value18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue18(String value) {
        this.value18 = value;
    }

    /**
     * Gets the value of the value19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue19() {
        return value19;
    }

    /**
     * Sets the value of the value19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue19(String value) {
        this.value19 = value;
    }

    /**
     * Gets the value of the value20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue20() {
        return value20;
    }

    /**
     * Sets the value of the value20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue20(String value) {
        this.value20 = value;
    }

    /**
     * Gets the value of the value21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue21() {
        return value21;
    }

    /**
     * Sets the value of the value21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue21(String value) {
        this.value21 = value;
    }

    /**
     * Gets the value of the value22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue22() {
        return value22;
    }

    /**
     * Sets the value of the value22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue22(String value) {
        this.value22 = value;
    }

    /**
     * Gets the value of the value23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue23() {
        return value23;
    }

    /**
     * Sets the value of the value23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue23(String value) {
        this.value23 = value;
    }

    /**
     * Gets the value of the value24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue24() {
        return value24;
    }

    /**
     * Sets the value of the value24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue24(String value) {
        this.value24 = value;
    }

    /**
     * Gets the value of the value25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue25() {
        return value25;
    }

    /**
     * Sets the value of the value25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue25(String value) {
        this.value25 = value;
    }

    /**
     * Gets the value of the value26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue26() {
        return value26;
    }

    /**
     * Sets the value of the value26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue26(String value) {
        this.value26 = value;
    }

    /**
     * Gets the value of the value27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue27() {
        return value27;
    }

    /**
     * Sets the value of the value27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue27(String value) {
        this.value27 = value;
    }

    /**
     * Gets the value of the value28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue28() {
        return value28;
    }

    /**
     * Sets the value of the value28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue28(String value) {
        this.value28 = value;
    }

    /**
     * Gets the value of the value29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue29() {
        return value29;
    }

    /**
     * Sets the value of the value29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue29(String value) {
        this.value29 = value;
    }

    /**
     * Gets the value of the value30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue30() {
        return value30;
    }

    /**
     * Sets the value of the value30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue30(String value) {
        this.value30 = value;
    }

    /**
     * Gets the value of the value31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue31() {
        return value31;
    }

    /**
     * Sets the value of the value31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue31(String value) {
        this.value31 = value;
    }

}
