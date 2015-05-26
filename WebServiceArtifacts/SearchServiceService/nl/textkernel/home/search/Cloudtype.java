
package nl.textkernel.home.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cloudtype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cloudtype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SPHERE"/>
 *     &lt;enumeration value="SPREAD"/>
 *     &lt;enumeration value="LIST"/>
 *     &lt;enumeration value="COLUMNS1"/>
 *     &lt;enumeration value="COLUMNS2"/>
 *     &lt;enumeration value="COLUMNS3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cloudtype")
@XmlEnum
public enum Cloudtype {

    SPHERE("SPHERE"),
    SPREAD("SPREAD"),
    LIST("LIST"),
    @XmlEnumValue("COLUMNS1")
    COLUMNS_1("COLUMNS1"),
    @XmlEnumValue("COLUMNS2")
    COLUMNS_2("COLUMNS2"),
    @XmlEnumValue("COLUMNS3")
    COLUMNS_3("COLUMNS3");
    private final String value;

    Cloudtype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Cloudtype fromValue(String v) {
        for (Cloudtype c: Cloudtype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
