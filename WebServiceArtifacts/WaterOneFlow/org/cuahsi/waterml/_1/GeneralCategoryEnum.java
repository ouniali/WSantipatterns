
package org.cuahsi.waterml._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generalCategoryEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="generalCategoryEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Water Quality"/>
 *     &lt;enumeration value="Climate"/>
 *     &lt;enumeration value="Hydrology"/>
 *     &lt;enumeration value="Geology"/>
 *     &lt;enumeration value="Biota"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "generalCategoryEnum")
@XmlEnum
public enum GeneralCategoryEnum {

    @XmlEnumValue("Water Quality")
    WATER_QUALITY("Water Quality"),
    @XmlEnumValue("Climate")
    CLIMATE("Climate"),
    @XmlEnumValue("Hydrology")
    HYDROLOGY("Hydrology"),
    @XmlEnumValue("Geology")
    GEOLOGY("Geology"),
    @XmlEnumValue("Biota")
    BIOTA("Biota");
    private final String value;

    GeneralCategoryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneralCategoryEnum fromValue(String v) {
        for (GeneralCategoryEnum c: GeneralCategoryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
