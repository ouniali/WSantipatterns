
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwapCurrencyTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SwapCurrencyTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="ISK"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="CZK"/>
 *     &lt;enumeration value="HUF"/>
 *     &lt;enumeration value="SAR"/>
 *     &lt;enumeration value="THB"/>
 *     &lt;enumeration value="TWD"/>
 *     &lt;enumeration value="ZAR"/>
 *     &lt;enumeration value="MXN"/>
 *     &lt;enumeration value="KRW"/>
 *     &lt;enumeration value="SKK"/>
 *     &lt;enumeration value="TRY"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="IDR"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="MYR"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="CNY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SwapCurrencyTypes")
@XmlEnum
public enum SwapCurrencyTypes {

    USD,
    EUR,
    GBP,
    CHF,
    JPY,
    AUD,
    CAD,
    DKK,
    NZD,
    NOK,
    ISK,
    SGD,
    PLN,
    SEK,
    CZK,
    HUF,
    SAR,
    THB,
    TWD,
    ZAR,
    MXN,
    KRW,
    SKK,
    TRY,
    HKD,
    IDR,
    INR,
    MYR,
    PHP,
    CNY;

    public String value() {
        return name();
    }

    public static SwapCurrencyTypes fromValue(String v) {
        return valueOf(v);
    }

}
