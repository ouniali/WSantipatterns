
package org.cuahsi.waterml._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeSeriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceInfo" type="{http://www.cuahsi.org/waterML/1.0/}SourceInfoType" minOccurs="0"/>
 *         &lt;element name="variable" type="{http://www.cuahsi.org/waterML/1.0/}VariableInfoType" minOccurs="0"/>
 *         &lt;element name="values" type="{http://www.cuahsi.org/waterML/1.0/}TsValuesSingleVariableType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesType", propOrder = {
    "sourceInfo",
    "variable",
    "values"
})
public class TimeSeriesType {

    protected SourceInfoType sourceInfo;
    protected VariableInfoType variable;
    protected TsValuesSingleVariableType values;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the sourceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SourceInfoType }
     *     
     */
    public SourceInfoType getSourceInfo() {
        return sourceInfo;
    }

    /**
     * Sets the value of the sourceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceInfoType }
     *     
     */
    public void setSourceInfo(SourceInfoType value) {
        this.sourceInfo = value;
    }

    /**
     * Gets the value of the variable property.
     * 
     * @return
     *     possible object is
     *     {@link VariableInfoType }
     *     
     */
    public VariableInfoType getVariable() {
        return variable;
    }

    /**
     * Sets the value of the variable property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableInfoType }
     *     
     */
    public void setVariable(VariableInfoType value) {
        this.variable = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link TsValuesSingleVariableType }
     *     
     */
    public TsValuesSingleVariableType getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link TsValuesSingleVariableType }
     *     
     */
    public void setValues(TsValuesSingleVariableType value) {
        this.values = value;
    }

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

}
