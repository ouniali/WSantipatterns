
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NYSE"/>
 *     &lt;enumeration value="AMEX"/>
 *     &lt;enumeration value="NASDAQCM"/>
 *     &lt;enumeration value="NASDAQGM"/>
 *     &lt;enumeration value="NASDAQGS"/>
 *     &lt;enumeration value="PINKSHEETS"/>
 *     &lt;enumeration value="OTCBB"/>
 *     &lt;enumeration value="OTHEROTC"/>
 *     &lt;enumeration value="AIM"/>
 *     &lt;enumeration value="AMMAN"/>
 *     &lt;enumeration value="AMSTERDAM"/>
 *     &lt;enumeration value="ASX"/>
 *     &lt;enumeration value="ATHENS"/>
 *     &lt;enumeration value="BAHRAIN"/>
 *     &lt;enumeration value="BANGKOK"/>
 *     &lt;enumeration value="BARCELONA"/>
 *     &lt;enumeration value="BEIRUT"/>
 *     &lt;enumeration value="BERLIN"/>
 *     &lt;enumeration value="BERMUDA"/>
 *     &lt;enumeration value="BILBAO"/>
 *     &lt;enumeration value="BOGOTA"/>
 *     &lt;enumeration value="BOSTWANA"/>
 *     &lt;enumeration value="BOVESPA"/>
 *     &lt;enumeration value="BRASTISLAVA"/>
 *     &lt;enumeration value="BREMEN"/>
 *     &lt;enumeration value="BRUSSELS"/>
 *     &lt;enumeration value="BUCHAREST"/>
 *     &lt;enumeration value="BUDAPEST"/>
 *     &lt;enumeration value="BUENOSAIRES"/>
 *     &lt;enumeration value="BULGARIA"/>
 *     &lt;enumeration value="CAIRO"/>
 *     &lt;enumeration value="CARACAS"/>
 *     &lt;enumeration value="CASABLANCA"/>
 *     &lt;enumeration value="COLOMBO"/>
 *     &lt;enumeration value="COPENHAGEN"/>
 *     &lt;enumeration value="CYPRUS"/>
 *     &lt;enumeration value="DARESSALAAM"/>
 *     &lt;enumeration value="DHAKA"/>
 *     &lt;enumeration value="DUSSELDORF"/>
 *     &lt;enumeration value="EASDAQ"/>
 *     &lt;enumeration value="EUWAX"/>
 *     &lt;enumeration value="FRANKFURT"/>
 *     &lt;enumeration value="FUKUOKA"/>
 *     &lt;enumeration value="GHANA"/>
 *     &lt;enumeration value="GRETAI"/>
 *     &lt;enumeration value="GUAYAQUIL"/>
 *     &lt;enumeration value="HAMBURG"/>
 *     &lt;enumeration value="HANOVER"/>
 *     &lt;enumeration value="HELSINKI"/>
 *     &lt;enumeration value="HIROSHIMA"/>
 *     &lt;enumeration value="HONGKONG"/>
 *     &lt;enumeration value="ICELAND"/>
 *     &lt;enumeration value="INDIA"/>
 *     &lt;enumeration value="IRISH"/>
 *     &lt;enumeration value="ISTANBUL"/>
 *     &lt;enumeration value="JAKARTA"/>
 *     &lt;enumeration value="JASDAQ"/>
 *     &lt;enumeration value="JOHANNESBURG"/>
 *     &lt;enumeration value="KARACHI"/>
 *     &lt;enumeration value="KOREA"/>
 *     &lt;enumeration value="KOSDAQ"/>
 *     &lt;enumeration value="KUALALUMPUR"/>
 *     &lt;enumeration value="KUWAIT"/>
 *     &lt;enumeration value="KYOTO"/>
 *     &lt;enumeration value="LIMA"/>
 *     &lt;enumeration value="LISBON"/>
 *     &lt;enumeration value="LJUBLJANA"/>
 *     &lt;enumeration value="LSE"/>
 *     &lt;enumeration value="LUSAKA"/>
 *     &lt;enumeration value="LUXEMBURG"/>
 *     &lt;enumeration value="MACEDONIA"/>
 *     &lt;enumeration value="MADRID"/>
 *     &lt;enumeration value="MALAWI"/>
 *     &lt;enumeration value="MALTA"/>
 *     &lt;enumeration value="MANILA"/>
 *     &lt;enumeration value="MEXICO"/>
 *     &lt;enumeration value="MILAN"/>
 *     &lt;enumeration value="MONTEVIDEO"/>
 *     &lt;enumeration value="MUMBAI"/>
 *     &lt;enumeration value="MUNICH"/>
 *     &lt;enumeration value="NAGOYA"/>
 *     &lt;enumeration value="NAIROBI"/>
 *     &lt;enumeration value="NAMIBIA"/>
 *     &lt;enumeration value="NASDAQ"/>
 *     &lt;enumeration value="NEWZEALAND"/>
 *     &lt;enumeration value="NIGERIA"/>
 *     &lt;enumeration value="NIIGATA"/>
 *     &lt;enumeration value="NCSX"/>
 *     &lt;enumeration value="OMAN"/>
 *     &lt;enumeration value="OSAKA"/>
 *     &lt;enumeration value="OSLO"/>
 *     &lt;enumeration value="PALESTINE"/>
 *     &lt;enumeration value="PARIS"/>
 *     &lt;enumeration value="PRAGUE"/>
 *     &lt;enumeration value="QUITO"/>
 *     &lt;enumeration value="RIGA"/>
 *     &lt;enumeration value="RIODEJANEIRO"/>
 *     &lt;enumeration value="RTSRUB"/>
 *     &lt;enumeration value="RTSUSD"/>
 *     &lt;enumeration value="SANTIAGO"/>
 *     &lt;enumeration value="SAPPORO"/>
 *     &lt;enumeration value="SHANGHAI"/>
 *     &lt;enumeration value="SHENZEN"/>
 *     &lt;enumeration value="SINGAPORE"/>
 *     &lt;enumeration value="STOCKHOLM"/>
 *     &lt;enumeration value="STPETERSBURG"/>
 *     &lt;enumeration value="STUTTGART"/>
 *     &lt;enumeration value="SURABAYA"/>
 *     &lt;enumeration value="SWAZILAND"/>
 *     &lt;enumeration value="SWISS"/>
 *     &lt;enumeration value="TAIWAN"/>
 *     &lt;enumeration value="TAIWANOTC"/>
 *     &lt;enumeration value="TALLINN"/>
 *     &lt;enumeration value="TEHRAN"/>
 *     &lt;enumeration value="TELAVIV"/>
 *     &lt;enumeration value="TOKYO"/>
 *     &lt;enumeration value="TSX"/>
 *     &lt;enumeration value="TSXV"/>
 *     &lt;enumeration value="VALENCIA"/>
 *     &lt;enumeration value="VIENNA"/>
 *     &lt;enumeration value="VILNIUS"/>
 *     &lt;enumeration value="VIRTX"/>
 *     &lt;enumeration value="WARSAW"/>
 *     &lt;enumeration value="XETRA"/>
 *     &lt;enumeration value="ZAGREB"/>
 *     &lt;enumeration value="ZIMBABWE"/>
 *     &lt;enumeration value="NASDAQNM"/>
 *     &lt;enumeration value="NASDAQSC"/>
 *     &lt;enumeration value="FUNDS"/>
 *     &lt;enumeration value="NYSEARCA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExchangeTypes")
@XmlEnum
public enum ExchangeTypes {

    NYSE,
    AMEX,
    NASDAQCM,
    NASDAQGM,
    NASDAQGS,
    PINKSHEETS,
    OTCBB,
    OTHEROTC,
    AIM,
    AMMAN,
    AMSTERDAM,
    ASX,
    ATHENS,
    BAHRAIN,
    BANGKOK,
    BARCELONA,
    BEIRUT,
    BERLIN,
    BERMUDA,
    BILBAO,
    BOGOTA,
    BOSTWANA,
    BOVESPA,
    BRASTISLAVA,
    BREMEN,
    BRUSSELS,
    BUCHAREST,
    BUDAPEST,
    BUENOSAIRES,
    BULGARIA,
    CAIRO,
    CARACAS,
    CASABLANCA,
    COLOMBO,
    COPENHAGEN,
    CYPRUS,
    DARESSALAAM,
    DHAKA,
    DUSSELDORF,
    EASDAQ,
    EUWAX,
    FRANKFURT,
    FUKUOKA,
    GHANA,
    GRETAI,
    GUAYAQUIL,
    HAMBURG,
    HANOVER,
    HELSINKI,
    HIROSHIMA,
    HONGKONG,
    ICELAND,
    INDIA,
    IRISH,
    ISTANBUL,
    JAKARTA,
    JASDAQ,
    JOHANNESBURG,
    KARACHI,
    KOREA,
    KOSDAQ,
    KUALALUMPUR,
    KUWAIT,
    KYOTO,
    LIMA,
    LISBON,
    LJUBLJANA,
    LSE,
    LUSAKA,
    LUXEMBURG,
    MACEDONIA,
    MADRID,
    MALAWI,
    MALTA,
    MANILA,
    MEXICO,
    MILAN,
    MONTEVIDEO,
    MUMBAI,
    MUNICH,
    NAGOYA,
    NAIROBI,
    NAMIBIA,
    NASDAQ,
    NEWZEALAND,
    NIGERIA,
    NIIGATA,
    NCSX,
    OMAN,
    OSAKA,
    OSLO,
    PALESTINE,
    PARIS,
    PRAGUE,
    QUITO,
    RIGA,
    RIODEJANEIRO,
    RTSRUB,
    RTSUSD,
    SANTIAGO,
    SAPPORO,
    SHANGHAI,
    SHENZEN,
    SINGAPORE,
    STOCKHOLM,
    STPETERSBURG,
    STUTTGART,
    SURABAYA,
    SWAZILAND,
    SWISS,
    TAIWAN,
    TAIWANOTC,
    TALLINN,
    TEHRAN,
    TELAVIV,
    TOKYO,
    TSX,
    TSXV,
    VALENCIA,
    VIENNA,
    VILNIUS,
    VIRTX,
    WARSAW,
    XETRA,
    ZAGREB,
    ZIMBABWE,
    NASDAQNM,
    NASDAQSC,
    FUNDS,
    NYSEARCA;

    public String value() {
        return name();
    }

    public static ExchangeTypes fromValue(String v) {
        return valueOf(v);
    }

}
