
package nl.textkernel.home.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guitype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="guitype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIXED"/>
 *     &lt;enumeration value="CLOUD"/>
 *     &lt;enumeration value="TEXTFIELD"/>
 *     &lt;enumeration value="LOCATION"/>
 *     &lt;enumeration value="PROJECT"/>
 *     &lt;enumeration value="GROUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "guitype")
@XmlEnum
public enum Guitype {

    FIXED,
    CLOUD,
    TEXTFIELD,
    LOCATION,
    PROJECT,
    GROUP;

    public String value() {
        return name();
    }

    public static Guitype fromValue(String v) {
        return valueOf(v);
    }

}
