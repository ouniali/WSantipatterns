
package nl.textkernel.home.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datatype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="datatype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="NUMERIC"/>
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="CODE"/>
 *     &lt;enumeration value="LOCATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "datatype")
@XmlEnum
public enum Datatype {

    TEXT,
    NUMERIC,
    DATE,
    CODE,
    LOCATION;

    public String value() {
        return name();
    }

    public static Datatype fromValue(String v) {
        return valueOf(v);
    }

}
