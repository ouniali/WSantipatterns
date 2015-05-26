
package ro.bvb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Annual"/>
 *     &lt;enumeration value="Semestrial"/>
 *     &lt;enumeration value="Q1"/>
 *     &lt;enumeration value="Q3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportTypeEnum")
@XmlEnum
public enum ReportTypeEnum {

    @XmlEnumValue("Annual")
    ANNUAL("Annual"),
    @XmlEnumValue("Semestrial")
    SEMESTRIAL("Semestrial"),
    @XmlEnumValue("Q1")
    Q_1("Q1"),
    @XmlEnumValue("Q3")
    Q_3("Q3");
    private final String value;

    ReportTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportTypeEnum fromValue(String v) {
        for (ReportTypeEnum c: ReportTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
