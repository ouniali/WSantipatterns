
package trainticket.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eTrainTimeService.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eTrainTimeService">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="DAWN"/>
 *     &lt;enumeration value="MORNING"/>
 *     &lt;enumeration value="AFTERNOON"/>
 *     &lt;enumeration value="EVENING"/>
 *     &lt;enumeration value="SPECIFIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eTrainTimeService")
@XmlEnum
public enum ETrainTimeService {

    ALL,
    DAWN,
    MORNING,
    AFTERNOON,
    EVENING,
    SPECIFIC;

    public String value() {
        return name();
    }

    public static ETrainTimeService fromValue(String v) {
        return valueOf(v);
    }

}
