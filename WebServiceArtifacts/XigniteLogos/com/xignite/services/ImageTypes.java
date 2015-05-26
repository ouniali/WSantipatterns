
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GIF"/>
 *     &lt;enumeration value="JPG"/>
 *     &lt;enumeration value="EPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageTypes")
@XmlEnum
public enum ImageTypes {

    GIF,
    JPG,
    EPS;

    public String value() {
        return name();
    }

    public static ImageTypes fromValue(String v) {
        return valueOf(v);
    }

}
