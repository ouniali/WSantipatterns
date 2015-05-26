
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompartmentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompartmentTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSignificant"/>
 *     &lt;enumeration value="Family"/>
 *     &lt;enumeration value="Quite"/>
 *     &lt;enumeration value="Conference"/>
 *     &lt;enumeration value="CompartmentWithoutAnimals"/>
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="Video"/>
 *     &lt;enumeration value="Pram"/>
 *     &lt;enumeration value="WomanAndChild"/>
 *     &lt;enumeration value="EasyAccess"/>
 *     &lt;enumeration value="T2"/>
 *     &lt;enumeration value="T3"/>
 *     &lt;enumeration value="T4"/>
 *     &lt;enumeration value="T6"/>
 *     &lt;enumeration value="C2"/>
 *     &lt;enumeration value="C4"/>
 *     &lt;enumeration value="C5"/>
 *     &lt;enumeration value="C6"/>
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="Double"/>
 *     &lt;enumeration value="SingleSuite"/>
 *     &lt;enumeration value="DoubleSuite"/>
 *     &lt;enumeration value="Special"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompartmentTypeEnum")
@XmlEnum
public enum CompartmentTypeEnum {

    @XmlEnumValue("NotSignificant")
    NOT_SIGNIFICANT("NotSignificant"),
    @XmlEnumValue("Family")
    FAMILY("Family"),
    @XmlEnumValue("Quite")
    QUITE("Quite"),
    @XmlEnumValue("Conference")
    CONFERENCE("Conference"),
    @XmlEnumValue("CompartmentWithoutAnimals")
    COMPARTMENT_WITHOUT_ANIMALS("CompartmentWithoutAnimals"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Video")
    VIDEO("Video"),
    @XmlEnumValue("Pram")
    PRAM("Pram"),
    @XmlEnumValue("WomanAndChild")
    WOMAN_AND_CHILD("WomanAndChild"),
    @XmlEnumValue("EasyAccess")
    EASY_ACCESS("EasyAccess"),
    @XmlEnumValue("T2")
    T_2("T2"),
    @XmlEnumValue("T3")
    T_3("T3"),
    @XmlEnumValue("T4")
    T_4("T4"),
    @XmlEnumValue("T6")
    T_6("T6"),
    @XmlEnumValue("C2")
    C_2("C2"),
    @XmlEnumValue("C4")
    C_4("C4"),
    @XmlEnumValue("C5")
    C_5("C5"),
    @XmlEnumValue("C6")
    C_6("C6"),
    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("SingleSuite")
    SINGLE_SUITE("SingleSuite"),
    @XmlEnumValue("DoubleSuite")
    DOUBLE_SUITE("DoubleSuite"),
    @XmlEnumValue("Special")
    SPECIAL("Special"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    CompartmentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompartmentTypeEnum fromValue(String v) {
        for (CompartmentTypeEnum c: CompartmentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
