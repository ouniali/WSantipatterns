
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccommodationClassEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccommodationClassEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FirstClass"/>
 *     &lt;enumeration value="SecondClass"/>
 *     &lt;enumeration value="Premium"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Leisure"/>
 *     &lt;enumeration value="Coach"/>
 *     &lt;enumeration value="Deluxe"/>
 *     &lt;enumeration value="GranClasse"/>
 *     &lt;enumeration value="SoftClass"/>
 *     &lt;enumeration value="HardClass"/>
 *     &lt;enumeration value="SpecialClass"/>
 *     &lt;enumeration value="HighGradeSoftClass"/>
 *     &lt;enumeration value="MixedHardClass"/>
 *     &lt;enumeration value="MixedSoftClass"/>
 *     &lt;enumeration value="SoftCompartmentClass"/>
 *     &lt;enumeration value="HardCompartmentClass"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccommodationClassEnum")
@XmlEnum
public enum AccommodationClassEnum {

    @XmlEnumValue("FirstClass")
    FIRST_CLASS("FirstClass"),
    @XmlEnumValue("SecondClass")
    SECOND_CLASS("SecondClass"),
    @XmlEnumValue("Premium")
    PREMIUM("Premium"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Leisure")
    LEISURE("Leisure"),
    @XmlEnumValue("Coach")
    COACH("Coach"),
    @XmlEnumValue("Deluxe")
    DELUXE("Deluxe"),
    @XmlEnumValue("GranClasse")
    GRAN_CLASSE("GranClasse"),
    @XmlEnumValue("SoftClass")
    SOFT_CLASS("SoftClass"),
    @XmlEnumValue("HardClass")
    HARD_CLASS("HardClass"),
    @XmlEnumValue("SpecialClass")
    SPECIAL_CLASS("SpecialClass"),
    @XmlEnumValue("HighGradeSoftClass")
    HIGH_GRADE_SOFT_CLASS("HighGradeSoftClass"),
    @XmlEnumValue("MixedHardClass")
    MIXED_HARD_CLASS("MixedHardClass"),
    @XmlEnumValue("MixedSoftClass")
    MIXED_SOFT_CLASS("MixedSoftClass"),
    @XmlEnumValue("SoftCompartmentClass")
    SOFT_COMPARTMENT_CLASS("SoftCompartmentClass"),
    @XmlEnumValue("HardCompartmentClass")
    HARD_COMPARTMENT_CLASS("HardCompartmentClass"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    AccommodationClassEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccommodationClassEnum fromValue(String v) {
        for (AccommodationClassEnum c: AccommodationClassEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
