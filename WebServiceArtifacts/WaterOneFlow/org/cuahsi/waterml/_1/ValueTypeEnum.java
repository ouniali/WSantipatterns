
package org.cuahsi.waterml._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valueTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="valueTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Field Observation"/>
 *     &lt;enumeration value="Sample"/>
 *     &lt;enumeration value="Model Simulation Result"/>
 *     &lt;enumeration value="Derived Value"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "valueTypeEnum")
@XmlEnum
public enum ValueTypeEnum {

    @XmlEnumValue("Field Observation")
    FIELD_OBSERVATION("Field Observation"),
    @XmlEnumValue("Sample")
    SAMPLE("Sample"),
    @XmlEnumValue("Model Simulation Result")
    MODEL_SIMULATION_RESULT("Model Simulation Result"),
    @XmlEnumValue("Derived Value")
    DERIVED_VALUE("Derived Value");
    private final String value;

    ValueTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueTypeEnum fromValue(String v) {
        for (ValueTypeEnum c: ValueTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
