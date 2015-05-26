
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSJRateTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WSJRateTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PrimeRate"/>
 *     &lt;enumeration value="DiscountRate"/>
 *     &lt;enumeration value="FederalFunds"/>
 *     &lt;enumeration value="CallMoney"/>
 *     &lt;enumeration value="CommercialPaper"/>
 *     &lt;enumeration value="EuroCommercialPaper"/>
 *     &lt;enumeration value="DealerCommercialPaper"/>
 *     &lt;enumeration value="CertificatesofDeposit"/>
 *     &lt;enumeration value="BankersAcceptances"/>
 *     &lt;enumeration value="LondonLateEurodollars"/>
 *     &lt;enumeration value="LIBOR"/>
 *     &lt;enumeration value="EuroLibor"/>
 *     &lt;enumeration value="EURIBOR"/>
 *     &lt;enumeration value="ForeignPrimeRates"/>
 *     &lt;enumeration value="TreasuryBills"/>
 *     &lt;enumeration value="OvernightRepurchaseRate"/>
 *     &lt;enumeration value="FreddieMac"/>
 *     &lt;enumeration value="FannieMae"/>
 *     &lt;enumeration value="MerrillLynchReadyAssetsTrust"/>
 *     &lt;enumeration value="ConsumerPriceIndex"/>
 *     &lt;enumeration value="EuroDollars"/>
 *     &lt;enumeration value="LIBORSwaps"/>
 *     &lt;enumeration value="BarclaysCapitalUSCorpIndexesDoubleARated"/>
 *     &lt;enumeration value="TIIE28"/>
 *     &lt;enumeration value="TelerateLibor1Month"/>
 *     &lt;enumeration value="TelerateLibor3Month"/>
 *     &lt;enumeration value="FederalReserveDiscountBoston"/>
 *     &lt;enumeration value="FederalReserveDiscountNewYork"/>
 *     &lt;enumeration value="FederalReserveDiscountPhiladelphia"/>
 *     &lt;enumeration value="FederalReserveDiscountCleveland"/>
 *     &lt;enumeration value="FederalReserveDiscountRichmond"/>
 *     &lt;enumeration value="FederalReserveDiscountAtlanta"/>
 *     &lt;enumeration value="FederalReserveDiscountChicago"/>
 *     &lt;enumeration value="FederalReserveDiscountStLouis"/>
 *     &lt;enumeration value="FederalReserveDiscountMinneapolis"/>
 *     &lt;enumeration value="FederalReserveDiscountKansasCity"/>
 *     &lt;enumeration value="FederalReserveDiscountDallas"/>
 *     &lt;enumeration value="FederalReserveDiscountSanFrancisco"/>
 *     &lt;enumeration value="MarketRateMO"/>
 *     &lt;enumeration value="FormulaRateTN"/>
 *     &lt;enumeration value="ConnecticutDepositRateIndex"/>
 *     &lt;enumeration value="TBills6MonthInEffect6MonthsPriorToTheTransaction"/>
 *     &lt;enumeration value="TennesseeMaximumEffectiveRateOfInterest"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Libor1Month"/>
 *     &lt;enumeration value="Libor3Months"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WSJRateTypes")
@XmlEnum
public enum WSJRateTypes {

    @XmlEnumValue("PrimeRate")
    PRIME_RATE("PrimeRate"),
    @XmlEnumValue("DiscountRate")
    DISCOUNT_RATE("DiscountRate"),
    @XmlEnumValue("FederalFunds")
    FEDERAL_FUNDS("FederalFunds"),
    @XmlEnumValue("CallMoney")
    CALL_MONEY("CallMoney"),
    @XmlEnumValue("CommercialPaper")
    COMMERCIAL_PAPER("CommercialPaper"),
    @XmlEnumValue("EuroCommercialPaper")
    EURO_COMMERCIAL_PAPER("EuroCommercialPaper"),
    @XmlEnumValue("DealerCommercialPaper")
    DEALER_COMMERCIAL_PAPER("DealerCommercialPaper"),
    @XmlEnumValue("CertificatesofDeposit")
    CERTIFICATESOF_DEPOSIT("CertificatesofDeposit"),
    @XmlEnumValue("BankersAcceptances")
    BANKERS_ACCEPTANCES("BankersAcceptances"),
    @XmlEnumValue("LondonLateEurodollars")
    LONDON_LATE_EURODOLLARS("LondonLateEurodollars"),
    LIBOR("LIBOR"),
    @XmlEnumValue("EuroLibor")
    EURO_LIBOR("EuroLibor"),
    EURIBOR("EURIBOR"),
    @XmlEnumValue("ForeignPrimeRates")
    FOREIGN_PRIME_RATES("ForeignPrimeRates"),
    @XmlEnumValue("TreasuryBills")
    TREASURY_BILLS("TreasuryBills"),
    @XmlEnumValue("OvernightRepurchaseRate")
    OVERNIGHT_REPURCHASE_RATE("OvernightRepurchaseRate"),
    @XmlEnumValue("FreddieMac")
    FREDDIE_MAC("FreddieMac"),
    @XmlEnumValue("FannieMae")
    FANNIE_MAE("FannieMae"),
    @XmlEnumValue("MerrillLynchReadyAssetsTrust")
    MERRILL_LYNCH_READY_ASSETS_TRUST("MerrillLynchReadyAssetsTrust"),
    @XmlEnumValue("ConsumerPriceIndex")
    CONSUMER_PRICE_INDEX("ConsumerPriceIndex"),
    @XmlEnumValue("EuroDollars")
    EURO_DOLLARS("EuroDollars"),
    @XmlEnumValue("LIBORSwaps")
    LIBOR_SWAPS("LIBORSwaps"),
    @XmlEnumValue("BarclaysCapitalUSCorpIndexesDoubleARated")
    BARCLAYS_CAPITAL_US_CORP_INDEXES_DOUBLE_A_RATED("BarclaysCapitalUSCorpIndexesDoubleARated"),
    @XmlEnumValue("TIIE28")
    TIIE_28("TIIE28"),
    @XmlEnumValue("TelerateLibor1Month")
    TELERATE_LIBOR_1_MONTH("TelerateLibor1Month"),
    @XmlEnumValue("TelerateLibor3Month")
    TELERATE_LIBOR_3_MONTH("TelerateLibor3Month"),
    @XmlEnumValue("FederalReserveDiscountBoston")
    FEDERAL_RESERVE_DISCOUNT_BOSTON("FederalReserveDiscountBoston"),
    @XmlEnumValue("FederalReserveDiscountNewYork")
    FEDERAL_RESERVE_DISCOUNT_NEW_YORK("FederalReserveDiscountNewYork"),
    @XmlEnumValue("FederalReserveDiscountPhiladelphia")
    FEDERAL_RESERVE_DISCOUNT_PHILADELPHIA("FederalReserveDiscountPhiladelphia"),
    @XmlEnumValue("FederalReserveDiscountCleveland")
    FEDERAL_RESERVE_DISCOUNT_CLEVELAND("FederalReserveDiscountCleveland"),
    @XmlEnumValue("FederalReserveDiscountRichmond")
    FEDERAL_RESERVE_DISCOUNT_RICHMOND("FederalReserveDiscountRichmond"),
    @XmlEnumValue("FederalReserveDiscountAtlanta")
    FEDERAL_RESERVE_DISCOUNT_ATLANTA("FederalReserveDiscountAtlanta"),
    @XmlEnumValue("FederalReserveDiscountChicago")
    FEDERAL_RESERVE_DISCOUNT_CHICAGO("FederalReserveDiscountChicago"),
    @XmlEnumValue("FederalReserveDiscountStLouis")
    FEDERAL_RESERVE_DISCOUNT_ST_LOUIS("FederalReserveDiscountStLouis"),
    @XmlEnumValue("FederalReserveDiscountMinneapolis")
    FEDERAL_RESERVE_DISCOUNT_MINNEAPOLIS("FederalReserveDiscountMinneapolis"),
    @XmlEnumValue("FederalReserveDiscountKansasCity")
    FEDERAL_RESERVE_DISCOUNT_KANSAS_CITY("FederalReserveDiscountKansasCity"),
    @XmlEnumValue("FederalReserveDiscountDallas")
    FEDERAL_RESERVE_DISCOUNT_DALLAS("FederalReserveDiscountDallas"),
    @XmlEnumValue("FederalReserveDiscountSanFrancisco")
    FEDERAL_RESERVE_DISCOUNT_SAN_FRANCISCO("FederalReserveDiscountSanFrancisco"),
    @XmlEnumValue("MarketRateMO")
    MARKET_RATE_MO("MarketRateMO"),
    @XmlEnumValue("FormulaRateTN")
    FORMULA_RATE_TN("FormulaRateTN"),
    @XmlEnumValue("ConnecticutDepositRateIndex")
    CONNECTICUT_DEPOSIT_RATE_INDEX("ConnecticutDepositRateIndex"),
    @XmlEnumValue("TBills6MonthInEffect6MonthsPriorToTheTransaction")
    T_BILLS_6_MONTH_IN_EFFECT_6_MONTHS_PRIOR_TO_THE_TRANSACTION("TBills6MonthInEffect6MonthsPriorToTheTransaction"),
    @XmlEnumValue("TennesseeMaximumEffectiveRateOfInterest")
    TENNESSEE_MAXIMUM_EFFECTIVE_RATE_OF_INTEREST("TennesseeMaximumEffectiveRateOfInterest"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Libor1Month")
    LIBOR_1_MONTH("Libor1Month"),
    @XmlEnumValue("Libor3Months")
    LIBOR_3_MONTHS("Libor3Months");
    private final String value;

    WSJRateTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WSJRateTypes fromValue(String v) {
        for (WSJRateTypes c: WSJRateTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
