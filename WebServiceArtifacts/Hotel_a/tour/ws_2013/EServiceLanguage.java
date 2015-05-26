
package tour.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eServiceLanguage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eServiceLanguage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="pt_BR"/>
 *     &lt;enumeration value="en_US"/>
 *     &lt;enumeration value="es_ES"/>
 *     &lt;enumeration value="fr_FR"/>
 *     &lt;enumeration value="de_DE"/>
 *     &lt;enumeration value="it_IT"/>
 *     &lt;enumeration value="ja_JP"/>
 *     &lt;enumeration value="ko_KO"/>
 *     &lt;enumeration value="ru_RU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eServiceLanguage")
@XmlEnum
public enum EServiceLanguage {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("pt_BR")
    PT_BR("pt_BR"),
    @XmlEnumValue("en_US")
    EN_US("en_US"),
    @XmlEnumValue("es_ES")
    ES_ES("es_ES"),
    @XmlEnumValue("fr_FR")
    FR_FR("fr_FR"),
    @XmlEnumValue("de_DE")
    DE_DE("de_DE"),
    @XmlEnumValue("it_IT")
    IT_IT("it_IT"),
    @XmlEnumValue("ja_JP")
    JA_JP("ja_JP"),
    @XmlEnumValue("ko_KO")
    KO_KO("ko_KO"),
    @XmlEnumValue("ru_RU")
    RU_RU("ru_RU");
    private final String value;

    EServiceLanguage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EServiceLanguage fromValue(String v) {
        for (EServiceLanguage c: EServiceLanguage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
