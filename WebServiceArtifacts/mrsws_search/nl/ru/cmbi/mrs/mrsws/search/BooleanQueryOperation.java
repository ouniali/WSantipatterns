
package nl.ru.cmbi.mrs.mrsws.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BooleanQueryOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BooleanQueryOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LE"/>
 *     &lt;enumeration value="EQ"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="UNION"/>
 *     &lt;enumeration value="INTERSECTION"/>
 *     &lt;enumeration value="NOT"/>
 *     &lt;enumeration value="ADJACENT"/>
 *     &lt;enumeration value="CONTAINSSTRING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BooleanQueryOperation")
@XmlEnum
public enum BooleanQueryOperation {

    CONTAINS,
    LT,
    LE,
    EQ,
    GT,
    GE,
    UNION,
    INTERSECTION,
    NOT,
    ADJACENT,
    CONTAINSSTRING;

    public String value() {
        return name();
    }

    public static BooleanQueryOperation fromValue(String v) {
        return valueOf(v);
    }

}
