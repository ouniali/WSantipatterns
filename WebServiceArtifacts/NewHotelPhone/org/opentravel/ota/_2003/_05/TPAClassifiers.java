
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPAClassifiers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPAClassifiers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Sections" type="{http://www.opentravel.org/OTA/2003/05}SectionsClassifier" minOccurs="0"/>
 *           &lt;element name="Currencies" type="{http://www.opentravel.org/OTA/2003/05}CurrenciesClassifier" minOccurs="0"/>
 *           &lt;element name="Entities" type="{http://www.opentravel.org/OTA/2003/05}EntitiesClassifiers" minOccurs="0"/>
 *           &lt;element name="RoomTypes" type="{http://www.opentravel.org/OTA/2003/05}RoomTypesClassifier" minOccurs="0"/>
 *           &lt;element name="CreditCardTypes" type="{http://www.opentravel.org/OTA/2003/05}CreditCardsClassifier" minOccurs="0"/>
 *           &lt;element name="Guaranties" type="{http://www.opentravel.org/OTA/2003/05}GuarantiesClassifier" minOccurs="0"/>
 *           &lt;element name="SourcesOfBusiness" type="{http://www.opentravel.org/OTA/2003/05}SourcesOfBusinessClassifier" minOccurs="0"/>
 *           &lt;element name="MarketSegments" type="{http://www.opentravel.org/OTA/2003/05}MarketSegmentsClassifier" minOccurs="0"/>
 *           &lt;element name="Titles" type="{http://www.opentravel.org/OTA/2003/05}TitlesClassifier" minOccurs="0"/>
 *           &lt;element name="PriceRates" type="{http://www.opentravel.org/OTA/2003/05}PriceRatesClassifier" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPAClassifiers", propOrder = {
    "sectionsOrCurrenciesOrEntities"
})
public class TPAClassifiers {

    @XmlElements({
        @XmlElement(name = "Sections", type = SectionsClassifier.class),
        @XmlElement(name = "Currencies", type = CurrenciesClassifier.class),
        @XmlElement(name = "Entities", type = EntitiesClassifiers.class),
        @XmlElement(name = "RoomTypes", type = RoomTypesClassifier.class),
        @XmlElement(name = "CreditCardTypes", type = CreditCardsClassifier.class),
        @XmlElement(name = "Guaranties", type = GuarantiesClassifier.class),
        @XmlElement(name = "SourcesOfBusiness", type = SourcesOfBusinessClassifier.class),
        @XmlElement(name = "MarketSegments", type = MarketSegmentsClassifier.class),
        @XmlElement(name = "Titles", type = TitlesClassifier.class),
        @XmlElement(name = "PriceRates", type = PriceRatesClassifier.class)
    })
    protected List<Object> sectionsOrCurrenciesOrEntities;
    @XmlAttribute(name = "ID")
    protected String id;

    /**
     * Gets the value of the sectionsOrCurrenciesOrEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectionsOrCurrenciesOrEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectionsOrCurrenciesOrEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SectionsClassifier }
     * {@link CurrenciesClassifier }
     * {@link EntitiesClassifiers }
     * {@link RoomTypesClassifier }
     * {@link CreditCardsClassifier }
     * {@link GuarantiesClassifier }
     * {@link SourcesOfBusinessClassifier }
     * {@link MarketSegmentsClassifier }
     * {@link TitlesClassifier }
     * {@link PriceRatesClassifier }
     * 
     * 
     */
    public List<Object> getSectionsOrCurrenciesOrEntities() {
        if (sectionsOrCurrenciesOrEntities == null) {
            sectionsOrCurrenciesOrEntities = new ArrayList<Object>();
        }
        return this.sectionsOrCurrenciesOrEntities;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
