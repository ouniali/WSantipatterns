
package de.dkfz_heidelberg.menu.tomcat.as.alignment_dot_plots;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TdotmatcherGraph_format.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TdotmatcherGraph_format">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="png"/>
 *     &lt;enumeration value="postscript"/>
 *     &lt;enumeration value="colourps"/>
 *     &lt;enumeration value="hpgl"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TdotmatcherGraph_format")
@XmlEnum
public enum TdotmatcherGraphFormat {

    @XmlEnumValue("png")
    PNG("png"),
    @XmlEnumValue("postscript")
    POSTSCRIPT("postscript"),
    @XmlEnumValue("colourps")
    COLOURPS("colourps"),
    @XmlEnumValue("hpgl")
    HPGL("hpgl");
    private final String value;

    TdotmatcherGraphFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdotmatcherGraphFormat fromValue(String v) {
        for (TdotmatcherGraphFormat c: TdotmatcherGraphFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
