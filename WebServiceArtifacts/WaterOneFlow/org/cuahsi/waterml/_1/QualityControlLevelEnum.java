
package org.cuahsi.waterml._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualityControlLevelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QualityControlLevelEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Raw data"/>
 *     &lt;enumeration value="Quality controlled data"/>
 *     &lt;enumeration value="Derived products"/>
 *     &lt;enumeration value="Interpreted products"/>
 *     &lt;enumeration value="Knowledge products"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QualityControlLevelEnum")
@XmlEnum
public enum QualityControlLevelEnum {

    @XmlEnumValue("Raw data")
    RAW_DATA("Raw data"),
    @XmlEnumValue("Quality controlled data")
    QUALITY_CONTROLLED_DATA("Quality controlled data"),
    @XmlEnumValue("Derived products")
    DERIVED_PRODUCTS("Derived products"),
    @XmlEnumValue("Interpreted products")
    INTERPRETED_PRODUCTS("Interpreted products"),
    @XmlEnumValue("Knowledge products")
    KNOWLEDGE_PRODUCTS("Knowledge products");
    private final String value;

    QualityControlLevelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualityControlLevelEnum fromValue(String v) {
        for (QualityControlLevelEnum c: QualityControlLevelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
