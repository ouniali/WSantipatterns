
package com.addressdoctor.validator2.addbatch.batch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Parameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Parameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryOfOrigin" type="{http://validator2.AddressDoctor.com/addBatch/Batch}CountryOfOriginType"/>
 *         &lt;element name="StreetWithHNo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CountryType" type="{http://validator2.AddressDoctor.com/addBatch/Batch}CountryType"/>
 *         &lt;element name="LineSeparator" type="{http://validator2.AddressDoctor.com/addBatch/Batch}LineSeparatorType"/>
 *         &lt;element name="PreferredLanguage" type="{http://validator2.AddressDoctor.com/addBatch/Batch}PreferredLanguageType"/>
 *         &lt;element name="Capitalization" type="{http://validator2.AddressDoctor.com/addBatch/Batch}CapitalizationType"/>
 *         &lt;element name="FormattedAddressWithOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ParsedInput" type="{http://validator2.AddressDoctor.com/addBatch/Batch}ParsedInputType"/>
 *         &lt;element name="RemoveDiacritics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FieldDimensions" type="{http://validator2.AddressDoctor.com/addBatch/Batch}FieldDimensionsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameters", propOrder = {
    "countryOfOrigin",
    "streetWithHNo",
    "countryType",
    "lineSeparator",
    "preferredLanguage",
    "capitalization",
    "formattedAddressWithOrganization",
    "parsedInput",
    "removeDiacritics",
    "fieldDimensions"
})
public class Parameters {

    @XmlElement(name = "CountryOfOrigin", required = true)
    @XmlSchemaType(name = "string")
    protected CountryOfOriginType countryOfOrigin;
    @XmlElement(name = "StreetWithHNo")
    protected boolean streetWithHNo;
    @XmlElement(name = "CountryType", required = true)
    @XmlSchemaType(name = "string")
    protected CountryType countryType;
    @XmlElement(name = "LineSeparator", required = true)
    @XmlSchemaType(name = "string")
    protected LineSeparatorType lineSeparator;
    @XmlElement(name = "PreferredLanguage", required = true)
    @XmlSchemaType(name = "string")
    protected PreferredLanguageType preferredLanguage;
    @XmlElement(name = "Capitalization", required = true)
    @XmlSchemaType(name = "string")
    protected CapitalizationType capitalization;
    @XmlElement(name = "FormattedAddressWithOrganization")
    protected boolean formattedAddressWithOrganization;
    @XmlElement(name = "ParsedInput", required = true)
    @XmlSchemaType(name = "string")
    protected ParsedInputType parsedInput;
    @XmlElement(name = "RemoveDiacritics")
    protected boolean removeDiacritics;
    @XmlElement(name = "FieldDimensions")
    protected FieldDimensionsRequest fieldDimensions;

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link CountryOfOriginType }
     *     
     */
    public CountryOfOriginType getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the value of the countryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryOfOriginType }
     *     
     */
    public void setCountryOfOrigin(CountryOfOriginType value) {
        this.countryOfOrigin = value;
    }

    /**
     * Gets the value of the streetWithHNo property.
     * 
     */
    public boolean isStreetWithHNo() {
        return streetWithHNo;
    }

    /**
     * Sets the value of the streetWithHNo property.
     * 
     */
    public void setStreetWithHNo(boolean value) {
        this.streetWithHNo = value;
    }

    /**
     * Gets the value of the countryType property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountryType() {
        return countryType;
    }

    /**
     * Sets the value of the countryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountryType(CountryType value) {
        this.countryType = value;
    }

    /**
     * Gets the value of the lineSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link LineSeparatorType }
     *     
     */
    public LineSeparatorType getLineSeparator() {
        return lineSeparator;
    }

    /**
     * Sets the value of the lineSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineSeparatorType }
     *     
     */
    public void setLineSeparator(LineSeparatorType value) {
        this.lineSeparator = value;
    }

    /**
     * Gets the value of the preferredLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredLanguageType }
     *     
     */
    public PreferredLanguageType getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Sets the value of the preferredLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredLanguageType }
     *     
     */
    public void setPreferredLanguage(PreferredLanguageType value) {
        this.preferredLanguage = value;
    }

    /**
     * Gets the value of the capitalization property.
     * 
     * @return
     *     possible object is
     *     {@link CapitalizationType }
     *     
     */
    public CapitalizationType getCapitalization() {
        return capitalization;
    }

    /**
     * Sets the value of the capitalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapitalizationType }
     *     
     */
    public void setCapitalization(CapitalizationType value) {
        this.capitalization = value;
    }

    /**
     * Gets the value of the formattedAddressWithOrganization property.
     * 
     */
    public boolean isFormattedAddressWithOrganization() {
        return formattedAddressWithOrganization;
    }

    /**
     * Sets the value of the formattedAddressWithOrganization property.
     * 
     */
    public void setFormattedAddressWithOrganization(boolean value) {
        this.formattedAddressWithOrganization = value;
    }

    /**
     * Gets the value of the parsedInput property.
     * 
     * @return
     *     possible object is
     *     {@link ParsedInputType }
     *     
     */
    public ParsedInputType getParsedInput() {
        return parsedInput;
    }

    /**
     * Sets the value of the parsedInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParsedInputType }
     *     
     */
    public void setParsedInput(ParsedInputType value) {
        this.parsedInput = value;
    }

    /**
     * Gets the value of the removeDiacritics property.
     * 
     */
    public boolean isRemoveDiacritics() {
        return removeDiacritics;
    }

    /**
     * Sets the value of the removeDiacritics property.
     * 
     */
    public void setRemoveDiacritics(boolean value) {
        this.removeDiacritics = value;
    }

    /**
     * Gets the value of the fieldDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDimensionsRequest }
     *     
     */
    public FieldDimensionsRequest getFieldDimensions() {
        return fieldDimensions;
    }

    /**
     * Sets the value of the fieldDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDimensionsRequest }
     *     
     */
    public void setFieldDimensions(FieldDimensionsRequest value) {
        this.fieldDimensions = value;
    }

}
