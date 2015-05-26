
package org.cuahsi.waterml._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ValueSingleVariable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSingleVariable">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="qualifiers" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="censorCode" type="{http://www.cuahsi.org/waterML/1.0/}CensorCodeEnum" />
 *       &lt;attribute name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="qualityControlLevel" type="{http://www.cuahsi.org/waterML/1.0/}QualityControlLevelEnum" />
 *       &lt;attribute name="methodID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accuracyStdDev" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="codedVocabulary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="codedVocabularyTerm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sampleID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="offsetValue" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="offsetUnitsAbbreviation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="offsetDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="offsetUnitsCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="metadataDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSingleVariable", propOrder = {
    "value"
})
public class ValueSingleVariable {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "qualifiers")
    protected String qualifiers;
    @XmlAttribute(name = "censorCode")
    protected CensorCodeEnum censorCode;
    @XmlAttribute(name = "dateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlAttribute(name = "qualityControlLevel")
    protected QualityControlLevelEnum qualityControlLevel;
    @XmlAttribute(name = "methodID")
    protected String methodID;
    @XmlAttribute(name = "sourceID")
    protected String sourceID;
    @XmlAttribute(name = "accuracyStdDev")
    protected Double accuracyStdDev;
    @XmlAttribute(name = "codedVocabulary")
    protected Boolean codedVocabulary;
    @XmlAttribute(name = "codedVocabularyTerm")
    protected String codedVocabularyTerm;
    @XmlAttribute(name = "sampleID")
    protected String sampleID;
    @XmlAttribute(name = "offsetValue")
    protected Double offsetValue;
    @XmlAttribute(name = "offsetUnitsAbbreviation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String offsetUnitsAbbreviation;
    @XmlAttribute(name = "offsetDescription")
    protected String offsetDescription;
    @XmlAttribute(name = "offsetUnitsCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String offsetUnitsCode;
    @XmlAttribute(name = "oid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String oid;
    @XmlAttribute(name = "metadataDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar metadataDateTime;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the qualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifiers() {
        return qualifiers;
    }

    /**
     * Sets the value of the qualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifiers(String value) {
        this.qualifiers = value;
    }

    /**
     * Gets the value of the censorCode property.
     * 
     * @return
     *     possible object is
     *     {@link CensorCodeEnum }
     *     
     */
    public CensorCodeEnum getCensorCode() {
        return censorCode;
    }

    /**
     * Sets the value of the censorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CensorCodeEnum }
     *     
     */
    public void setCensorCode(CensorCodeEnum value) {
        this.censorCode = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the qualityControlLevel property.
     * 
     * @return
     *     possible object is
     *     {@link QualityControlLevelEnum }
     *     
     */
    public QualityControlLevelEnum getQualityControlLevel() {
        return qualityControlLevel;
    }

    /**
     * Sets the value of the qualityControlLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityControlLevelEnum }
     *     
     */
    public void setQualityControlLevel(QualityControlLevelEnum value) {
        this.qualityControlLevel = value;
    }

    /**
     * Gets the value of the methodID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodID() {
        return methodID;
    }

    /**
     * Sets the value of the methodID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodID(String value) {
        this.methodID = value;
    }

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceID(String value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the accuracyStdDev property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccuracyStdDev() {
        return accuracyStdDev;
    }

    /**
     * Sets the value of the accuracyStdDev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccuracyStdDev(Double value) {
        this.accuracyStdDev = value;
    }

    /**
     * Gets the value of the codedVocabulary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCodedVocabulary() {
        return codedVocabulary;
    }

    /**
     * Sets the value of the codedVocabulary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCodedVocabulary(Boolean value) {
        this.codedVocabulary = value;
    }

    /**
     * Gets the value of the codedVocabularyTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodedVocabularyTerm() {
        return codedVocabularyTerm;
    }

    /**
     * Sets the value of the codedVocabularyTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodedVocabularyTerm(String value) {
        this.codedVocabularyTerm = value;
    }

    /**
     * Gets the value of the sampleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleID() {
        return sampleID;
    }

    /**
     * Sets the value of the sampleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleID(String value) {
        this.sampleID = value;
    }

    /**
     * Gets the value of the offsetValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOffsetValue() {
        return offsetValue;
    }

    /**
     * Sets the value of the offsetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOffsetValue(Double value) {
        this.offsetValue = value;
    }

    /**
     * Gets the value of the offsetUnitsAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetUnitsAbbreviation() {
        return offsetUnitsAbbreviation;
    }

    /**
     * Sets the value of the offsetUnitsAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetUnitsAbbreviation(String value) {
        this.offsetUnitsAbbreviation = value;
    }

    /**
     * Gets the value of the offsetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetDescription() {
        return offsetDescription;
    }

    /**
     * Sets the value of the offsetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetDescription(String value) {
        this.offsetDescription = value;
    }

    /**
     * Gets the value of the offsetUnitsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetUnitsCode() {
        return offsetUnitsCode;
    }

    /**
     * Sets the value of the offsetUnitsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetUnitsCode(String value) {
        this.offsetUnitsCode = value;
    }

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOid(String value) {
        this.oid = value;
    }

    /**
     * Gets the value of the metadataDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMetadataDateTime() {
        return metadataDateTime;
    }

    /**
     * Sets the value of the metadataDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMetadataDateTime(XMLGregorianCalendar value) {
        this.metadataDateTime = value;
    }

}
