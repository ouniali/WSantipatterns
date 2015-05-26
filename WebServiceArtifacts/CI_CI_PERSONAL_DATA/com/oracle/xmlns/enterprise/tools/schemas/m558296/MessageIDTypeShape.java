
package com.oracle.xmlns.enterprise.tools.schemas.m558296;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for MessageIDTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageIDTypeShape">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://xmlns.oracle.com/Enterprise/Tools/schemas/M558296.V1>MessageIDTypeDef">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageIDTypeShape", propOrder = {
    "value"
})
public class MessageIDTypeShape {

    @XmlValue
    protected int value;

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

}
