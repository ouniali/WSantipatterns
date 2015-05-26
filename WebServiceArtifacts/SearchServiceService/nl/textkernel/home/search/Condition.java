
package nl.textkernel.home.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for condition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="condition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FAVORED"/>
 *     &lt;enumeration value="STRONGLY_FAVORED"/>
 *     &lt;enumeration value="REQUIRED"/>
 *     &lt;enumeration value="BANNED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "condition")
@XmlEnum
public enum Condition {

    FAVORED,
    STRONGLY_FAVORED,
    REQUIRED,
    BANNED;

    public String value() {
        return name();
    }

    public static Condition fromValue(String v) {
        return valueOf(v);
    }

}
