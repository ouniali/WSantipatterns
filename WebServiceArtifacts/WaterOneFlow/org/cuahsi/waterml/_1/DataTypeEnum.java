
package org.cuahsi.waterml._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dataTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Continuous"/>
 *     &lt;enumeration value="Instantaneous"/>
 *     &lt;enumeration value="Cumulative"/>
 *     &lt;enumeration value="Incremental"/>
 *     &lt;enumeration value="Average"/>
 *     &lt;enumeration value="Maximum"/>
 *     &lt;enumeration value="Minimum"/>
 *     &lt;enumeration value="Constant Over Interval"/>
 *     &lt;enumeration value="Categorical"/>
 *     &lt;enumeration value="Best Easy Systematic Estimator "/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dataTypeEnum")
@XmlEnum
public enum DataTypeEnum {

    @XmlEnumValue("Continuous")
    CONTINUOUS("Continuous"),
    @XmlEnumValue("Instantaneous")
    INSTANTANEOUS("Instantaneous"),
    @XmlEnumValue("Cumulative")
    CUMULATIVE("Cumulative"),
    @XmlEnumValue("Incremental")
    INCREMENTAL("Incremental"),
    @XmlEnumValue("Average")
    AVERAGE("Average"),
    @XmlEnumValue("Maximum")
    MAXIMUM("Maximum"),
    @XmlEnumValue("Minimum")
    MINIMUM("Minimum"),
    @XmlEnumValue("Constant Over Interval")
    CONSTANT_OVER_INTERVAL("Constant Over Interval"),
    @XmlEnumValue("Categorical")
    CATEGORICAL("Categorical"),
    @XmlEnumValue("Best Easy Systematic Estimator ")
    BEST_EASY_SYSTEMATIC_ESTIMATOR("Best Easy Systematic Estimator ");
    private final String value;

    DataTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeEnum fromValue(String v) {
        for (DataTypeEnum c: DataTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
