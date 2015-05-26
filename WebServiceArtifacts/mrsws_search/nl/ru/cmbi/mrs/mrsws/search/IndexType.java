
package nl.ru.cmbi.mrs.mrsws.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndexType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndexType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unique"/>
 *     &lt;enumeration value="FullText"/>
 *     &lt;enumeration value="Number"/>
 *     &lt;enumeration value="Date"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndexType")
@XmlEnum
public enum IndexType {

    @XmlEnumValue("Unique")
    UNIQUE("Unique"),
    @XmlEnumValue("FullText")
    FULL_TEXT("FullText"),
    @XmlEnumValue("Number")
    NUMBER("Number"),
    @XmlEnumValue("Date")
    DATE("Date");
    private final String value;

    IndexType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndexType fromValue(String v) {
        for (IndexType c: IndexType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
