
package org.cuahsi.waterml._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CensorCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CensorCodeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="lt"/>
 *     &lt;enumeration value="gt"/>
 *     &lt;enumeration value="nc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CensorCodeEnum")
@XmlEnum
public enum CensorCodeEnum {

    @XmlEnumValue("lt")
    LT("lt"),
    @XmlEnumValue("gt")
    GT("gt"),
    @XmlEnumValue("nc")
    NC("nc");
    private final String value;

    CensorCodeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CensorCodeEnum fromValue(String v) {
        for (CensorCodeEnum c: CensorCodeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
