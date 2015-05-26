
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIBORCurrencyTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LIBORCurrencyTypes">
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
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="BGN"/>
 *     &lt;enumeration value="HUF"/>
 *     &lt;enumeration value="CLP"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="CZK"/>
 *     &lt;enumeration value="KRW"/>
 *     &lt;enumeration value="TRL"/>
 *     &lt;enumeration value="MXN"/>
 *     &lt;enumeration value="ILS"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="MYR"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="THB"/>
 *     &lt;enumeration value="VND"/>
 *     &lt;enumeration value="IDR"/>
 *     &lt;enumeration value="TWD"/>
 *     &lt;enumeration value="ZAR"/>
 *     &lt;enumeration value="TRY"/>
 *     &lt;enumeration value="KZT"/>
 *     &lt;enumeration value="PKR"/>
 *     &lt;enumeration value="RUB"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="SKK"/>
 *     &lt;enumeration value="ARS"/>
 *     &lt;enumeration value="LVL"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="AED"/>
 *     &lt;enumeration value="JOD"/>
 *     &lt;enumeration value="EEK"/>
 *     &lt;enumeration value="LTL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LIBORCurrencyTypes")
@XmlEnum
public enum LIBORCurrencyTypes {

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
    HKD,
    BGN,
    HUF,
    CLP,
    INR,
    CZK,
    KRW,
    TRL,
    MXN,
    ILS,
    CNY,
    MYR,
    PHP,
    THB,
    VND,
    IDR,
    TWD,
    ZAR,
    TRY,
    KZT,
    PKR,
    RUB,
    BRL,
    SKK,
    ARS,
    LVL,
    COP,
    AED,
    JOD,
    EEK,
    LTL;

    public String value() {
        return name();
    }

    public static LIBORCurrencyTypes fromValue(String v) {
        return valueOf(v);
    }

}
