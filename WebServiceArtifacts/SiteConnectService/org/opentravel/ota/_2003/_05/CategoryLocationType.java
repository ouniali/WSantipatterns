
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CategoryLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Inside"/>
 *     &lt;enumeration value="Outside"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CategoryLocationType")
@XmlEnum
public enum CategoryLocationType {

    @XmlEnumValue("Inside")
    INSIDE("Inside"),
    @XmlEnumValue("Outside")
    OUTSIDE("Outside"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    CategoryLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryLocationType fromValue(String v) {
        for (CategoryLocationType c: CategoryLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
