
package org.diacomp.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Model complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Model">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.diacomp.org/webservices/}IDObject">
 *       &lt;sequence>
 *         &lt;element name="Strain" type="{http://www.diacomp.org/webservices/}Strain" minOccurs="0"/>
 *         &lt;element name="Investigators" type="{http://www.diacomp.org/webservices/}ArrayOfInvestigator" minOccurs="0"/>
 *         &lt;element name="TypeID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="TypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiabetesTypeID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="DiabetesTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DevelopmentStatusID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="DevelopmentStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiabetesInduction" type="{http://www.diacomp.org/webservices/}Protocol" minOccurs="0"/>
 *         &lt;element name="ComplicationInduction" type="{http://www.diacomp.org/webservices/}Protocol" minOccurs="0"/>
 *         &lt;element name="PhenotypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="History" type="{http://www.diacomp.org/webservices/}ObjectHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Model", propOrder = {
    "strain",
    "investigators",
    "typeID",
    "typeName",
    "diabetesTypeID",
    "diabetesTypeName",
    "developmentStatusID",
    "developmentStatusName",
    "diabetesInduction",
    "complicationInduction",
    "phenotypeDescription",
    "history"
})
public class Model
    extends IDObject
{

    @XmlElement(name = "Strain")
    protected Strain strain;
    @XmlElement(name = "Investigators")
    protected ArrayOfInvestigator investigators;
    @XmlElement(name = "TypeID", required = true)
    protected ID typeID;
    @XmlElement(name = "TypeName")
    protected String typeName;
    @XmlElement(name = "DiabetesTypeID", required = true)
    protected ID diabetesTypeID;
    @XmlElement(name = "DiabetesTypeName")
    protected String diabetesTypeName;
    @XmlElement(name = "DevelopmentStatusID", required = true)
    protected ID developmentStatusID;
    @XmlElement(name = "DevelopmentStatusName")
    protected String developmentStatusName;
    @XmlElement(name = "DiabetesInduction")
    protected Protocol diabetesInduction;
    @XmlElement(name = "ComplicationInduction")
    protected Protocol complicationInduction;
    @XmlElement(name = "PhenotypeDescription")
    protected String phenotypeDescription;
    @XmlElement(name = "History")
    protected ObjectHistory history;

    /**
     * Gets the value of the strain property.
     * 
     * @return
     *     possible object is
     *     {@link Strain }
     *     
     */
    public Strain getStrain() {
        return strain;
    }

    /**
     * Sets the value of the strain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Strain }
     *     
     */
    public void setStrain(Strain value) {
        this.strain = value;
    }

    /**
     * Gets the value of the investigators property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvestigator }
     *     
     */
    public ArrayOfInvestigator getInvestigators() {
        return investigators;
    }

    /**
     * Sets the value of the investigators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvestigator }
     *     
     */
    public void setInvestigators(ArrayOfInvestigator value) {
        this.investigators = value;
    }

    /**
     * Gets the value of the typeID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getTypeID() {
        return typeID;
    }

    /**
     * Sets the value of the typeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setTypeID(ID value) {
        this.typeID = value;
    }

    /**
     * Gets the value of the typeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

    /**
     * Gets the value of the diabetesTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getDiabetesTypeID() {
        return diabetesTypeID;
    }

    /**
     * Sets the value of the diabetesTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setDiabetesTypeID(ID value) {
        this.diabetesTypeID = value;
    }

    /**
     * Gets the value of the diabetesTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiabetesTypeName() {
        return diabetesTypeName;
    }

    /**
     * Sets the value of the diabetesTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiabetesTypeName(String value) {
        this.diabetesTypeName = value;
    }

    /**
     * Gets the value of the developmentStatusID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getDevelopmentStatusID() {
        return developmentStatusID;
    }

    /**
     * Sets the value of the developmentStatusID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setDevelopmentStatusID(ID value) {
        this.developmentStatusID = value;
    }

    /**
     * Gets the value of the developmentStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopmentStatusName() {
        return developmentStatusName;
    }

    /**
     * Sets the value of the developmentStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopmentStatusName(String value) {
        this.developmentStatusName = value;
    }

    /**
     * Gets the value of the diabetesInduction property.
     * 
     * @return
     *     possible object is
     *     {@link Protocol }
     *     
     */
    public Protocol getDiabetesInduction() {
        return diabetesInduction;
    }

    /**
     * Sets the value of the diabetesInduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protocol }
     *     
     */
    public void setDiabetesInduction(Protocol value) {
        this.diabetesInduction = value;
    }

    /**
     * Gets the value of the complicationInduction property.
     * 
     * @return
     *     possible object is
     *     {@link Protocol }
     *     
     */
    public Protocol getComplicationInduction() {
        return complicationInduction;
    }

    /**
     * Sets the value of the complicationInduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protocol }
     *     
     */
    public void setComplicationInduction(Protocol value) {
        this.complicationInduction = value;
    }

    /**
     * Gets the value of the phenotypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhenotypeDescription() {
        return phenotypeDescription;
    }

    /**
     * Sets the value of the phenotypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhenotypeDescription(String value) {
        this.phenotypeDescription = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectHistory }
     *     
     */
    public ObjectHistory getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectHistory }
     *     
     */
    public void setHistory(ObjectHistory value) {
        this.history = value;
    }

}
