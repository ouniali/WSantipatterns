
package ro.bvb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BalanceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Company"/>
 *     &lt;enumeration value="Bank"/>
 *     &lt;enumeration value="Assurance"/>
 *     &lt;enumeration value="Fund"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BalanceTypeEnum")
@XmlEnum
public enum BalanceTypeEnum {

    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("Bank")
    BANK("Bank"),
    @XmlEnumValue("Assurance")
    ASSURANCE("Assurance"),
    @XmlEnumValue("Fund")
    FUND("Fund");
    private final String value;

    BalanceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BalanceTypeEnum fromValue(String v) {
        for (BalanceTypeEnum c: BalanceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
