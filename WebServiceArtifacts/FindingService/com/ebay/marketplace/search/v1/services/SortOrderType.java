
package com.ebay.marketplace.search.v1.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortOrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BestMatch"/>
 *     &lt;enumeration value="CurrentPriceHighest"/>
 *     &lt;enumeration value="DistanceNearest"/>
 *     &lt;enumeration value="EndTimeSoonest"/>
 *     &lt;enumeration value="PricePlusShippingLowest"/>
 *     &lt;enumeration value="PricePlusShippingHighest"/>
 *     &lt;enumeration value="StartTimeNewest"/>
 *     &lt;enumeration value="BidCountMost"/>
 *     &lt;enumeration value="BidCountFewest"/>
 *     &lt;enumeration value="CountryAscending"/>
 *     &lt;enumeration value="CountryDescending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortOrderType")
@XmlEnum
public enum SortOrderType {


    /**
     * 
     * 								Sorts items by Best Match, which is based on community buying activity
     * 								and other relevance-based factors.
     * 								<br><br>
     * 								<span class="tablenote"><strong>Note:</strong>
     * 								eBay site search results sorted by Best Match may not match the API
     * 								search results sorted by Best Match. The site Best Match algorithm takes
     * 								into account additional factors, such as user information, not available
     * 								to the API.
     * 								</span>
     * 							
     * 
     */
    @XmlEnumValue("BestMatch")
    BEST_MATCH("BestMatch"),

    /**
     * 
     * 								Sorts items by their current price, with the highest price first.
     * 							
     * 
     */
    @XmlEnumValue("CurrentPriceHighest")
    CURRENT_PRICE_HIGHEST("CurrentPriceHighest"),

    /**
     * 
     * 								Sorts items by distance from the buyer in ascending order. The request
     * 								must also include a buyerPostalCode.
     * 							
     * 
     */
    @XmlEnumValue("DistanceNearest")
    DISTANCE_NEAREST("DistanceNearest"),

    /**
     * 
     * 								Sorts items by end time, with items ending soonest listed first.
     * 							
     * 
     */
    @XmlEnumValue("EndTimeSoonest")
    END_TIME_SOONEST("EndTimeSoonest"),

    /**
     * 
     * 								Sorts items by the combined cost of the item price plus the shipping
     * 								cost, with the lowest combined price items listed first. Items are
     * 								returned in the following groupings: lowest total-cost items (for items
     * 								where shipping was properly specified) appear first, followed by freight-
     * 								shipping items, and then items for which no shipping was specified. Each
     * 								group is sorted by price.
     * 							
     * 
     */
    @XmlEnumValue("PricePlusShippingLowest")
    PRICE_PLUS_SHIPPING_LOWEST("PricePlusShippingLowest"),

    /**
     * 
     * 								Sorts items by the combined cost of the item price plus the shipping
     * 								cost, with highest combined price items listed first. Items are returned
     * 								in the following groupings: highest total-cost items (for items where
     * 								shipping was properly specified) appear first, followed by freight-
     * 								shipping items, and then items for which no shipping was specified. Each
     * 								group is sorted by price.
     * 							
     * 
     */
    @XmlEnumValue("PricePlusShippingHighest")
    PRICE_PLUS_SHIPPING_HIGHEST("PricePlusShippingHighest"),

    /**
     * 
     * 								Sorts items by the start time, the most recently listed (newest) items
     * 								appear first.
     * 							
     * 
     */
    @XmlEnumValue("StartTimeNewest")
    START_TIME_NEWEST("StartTimeNewest"),

    /**
     * 
     * 								Sorts items by the number of bids they have received, with items that
     * 								have received the most bids first.
     * 								<br><br>
     * 								To sort by bid count, you must specify a listing type filter
     * 								to limit results to auction listings only (such as, <code>&
     * 								itemFilter.name=ListingType&itemFilter.value=Auction</code>).
     * 							
     * 
     */
    @XmlEnumValue("BidCountMost")
    BID_COUNT_MOST("BidCountMost"),

    /**
     * 
     * 								Sorts items by the number of bids they have received, with items that
     * 								have received the fewest bids first.
     * 								<br><br>
     * 								To sort by bid count, you must specify a listing type filter
     * 								to limit results to auction listings only (such as, <code>&
     * 								itemFilter.name=ListingType&itemFilter.value=Auction</code>).
     * 							
     * 
     */
    @XmlEnumValue("BidCountFewest")
    BID_COUNT_FEWEST("BidCountFewest"),

    /**
     * 
     * 								Sorts items available on the given site (as specified by <a
     * 								href="http://developer.ebay.com/DevZone/finding/Concepts/MakingACall.html#StandardURLParameters"
     * 								>global ID in the HTTP header or URL parameter</a>) by the
     * 								country in which they are located. For CountryAscending, items located in
     * 								the country most closely associated with the site appear first, followed
     * 								by items in related countries, and then items from other countries.
     * 								<br><br>
     * 								For example, when searching the Ireland site, items located in Ireland
     * 								(IE) will be returned first, followed by items located in related
     * 								countries like the United Kingdom (GB), the United States (US), Hong Kong
     * 								(HK), and Singapore (SG) next. Remaining items are sorted in alphabetical
     * 								order by English country name (regardless of the language for the site),
     * 								with some exceptions (for example, United States sorts first, APO/FPO sorts
     * 								near the end).
     * 								<br><br>
     * 								CountryAscending applies to the following sites only: Austria (EBAY-AT),
     * 								Belgium-French (EBAY-FRBE), Belgium-Netherlands (EBAY-NLBE), Germany
     * 								(EBAY-DE), Ireland (EBAY-IE), Netherlands (EBAY-NL), Poland (EBAY-PL),
     * 								Spain (EBAY-ES), and Switzerland (EBAY-CH).
     * 							
     * 
     */
    @XmlEnumValue("CountryAscending")
    COUNTRY_ASCENDING("CountryAscending"),

    /**
     * 
     * 								Sorts items available on the given site (as specified by global ID in
     * 								the HTTP header or URL parameter) by the country in which they are
     * 								located. For CountryDescending, items are sorted in reverse order of
     * 								CountryAscending. That is, items in countries not specifically related to
     * 								the site appear first, sorted in descending alphabetical order by English
     * 								country name. For example, when searching the Ireland site, items located
     * 								in countries like Yugoslavia or Uganda are returned first. Items located
     * 								in Ireland (IE) will be returned last.
     * 								<br><br>
     * 								CountryDescending applies to the following sites only: Austria (EBAY-AT),
     * 								Belgium-French (EBAY-FRBE), Belgium-Netherlands (EBAY-NLBE), Germany
     * 								(EBAY-DE), Ireland (EBAY-IE), Netherlands (EBAY-NL), Poland (EBAY-PL),
     * 								Spain (EBAY-ES), and Switzerland (EBAY-CH).
     * 							
     * 
     */
    @XmlEnumValue("CountryDescending")
    COUNTRY_DESCENDING("CountryDescending");
    private final String value;

    SortOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortOrderType fromValue(String v) {
        for (SortOrderType c: SortOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
