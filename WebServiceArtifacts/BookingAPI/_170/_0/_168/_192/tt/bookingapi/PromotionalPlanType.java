
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionalPlanType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionalPlanType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="LCCSpecialReturn"/>
 *     &lt;enumeration value="GDSSpecialReturn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionalPlanType")
@XmlEnum
public enum PromotionalPlanType {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("LCCSpecialReturn")
    LCC_SPECIAL_RETURN("LCCSpecialReturn"),
    @XmlEnumValue("GDSSpecialReturn")
    GDS_SPECIAL_RETURN("GDSSpecialReturn");
    private final String value;

    PromotionalPlanType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionalPlanType fromValue(String v) {
        for (PromotionalPlanType c: PromotionalPlanType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
