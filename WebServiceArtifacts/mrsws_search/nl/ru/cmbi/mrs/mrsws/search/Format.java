
package nl.ru.cmbi.mrs.mrsws.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Format.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Format">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="plain"/>
 *     &lt;enumeration value="title"/>
 *     &lt;enumeration value="fasta"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Format")
@XmlEnum
public enum Format {

    @XmlEnumValue("plain")
    PLAIN("plain"),
    @XmlEnumValue("title")
    TITLE("title"),
    @XmlEnumValue("fasta")
    FASTA("fasta");
    private final String value;

    Format(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Format fromValue(String v) {
        for (Format c: Format.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
