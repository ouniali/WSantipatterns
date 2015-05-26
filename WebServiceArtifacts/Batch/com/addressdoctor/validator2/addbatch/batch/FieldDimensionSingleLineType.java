
package com.addressdoctor.validator2.addbatch.batch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldDimensionSingleLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldDimensionSingleLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxLineLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldDimensionSingleLineType", propOrder = {
    "maxLineLength"
})
public class FieldDimensionSingleLineType {

    @XmlElement(name = "MaxLineLength")
    protected int maxLineLength;

    /**
     * Gets the value of the maxLineLength property.
     * 
     */
    public int getMaxLineLength() {
        return maxLineLength;
    }

    /**
     * Sets the value of the maxLineLength property.
     * 
     */
    public void setMaxLineLength(int value) {
        this.maxLineLength = value;
    }

}
