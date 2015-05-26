
package fr.u_strasbg.vizier.xml.votable_1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINKContentrole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LINKContentrole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="query"/>
 *     &lt;enumeration value="hints"/>
 *     &lt;enumeration value="doc"/>
 *     &lt;enumeration value="location"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LINKContentrole")
@XmlEnum
public enum LINKContentrole {

    @XmlEnumValue("query")
    QUERY("query"),
    @XmlEnumValue("hints")
    HINTS("hints"),
    @XmlEnumValue("doc")
    DOC("doc"),
    @XmlEnumValue("location")
    LOCATION("location");
    private final String value;

    LINKContentrole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LINKContentrole fromValue(String v) {
        for (LINKContentrole c: LINKContentrole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
