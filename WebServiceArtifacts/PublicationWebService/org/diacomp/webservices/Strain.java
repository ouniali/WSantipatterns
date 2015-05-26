
package org.diacomp.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Strain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Strain">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.diacomp.org/webservices/}IDObject">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StrainDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Species" type="{http://www.diacomp.org/webservices/}Species" minOccurs="0"/>
 *         &lt;element name="MaternalStrainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackgroundStrainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BreedingProtocol" type="{http://www.diacomp.org/webservices/}Protocol" minOccurs="0"/>
 *         &lt;element name="TreatmentProtocol" type="{http://www.diacomp.org/webservices/}Protocol" minOccurs="0"/>
 *         &lt;element name="PhenotypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationMethodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DevelopmentStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BreedingTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsStandardFavorite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ConsortiumID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="IsPublic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MaleCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FemaleCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UnknownCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BreedingGenerations" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Strain", propOrder = {
    "name",
    "commonName",
    "strainDescription",
    "species",
    "maternalStrainName",
    "backgroundStrainName",
    "breedingProtocol",
    "treatmentProtocol",
    "phenotypeDescription",
    "creationMethodName",
    "developmentStatusName",
    "breedingTypeName",
    "isStandardFavorite",
    "consortiumID",
    "isPublic",
    "maleCount",
    "femaleCount",
    "unknownCount",
    "breedingGenerations"
})
public class Strain
    extends IDObject
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "CommonName")
    protected String commonName;
    @XmlElement(name = "StrainDescription")
    protected String strainDescription;
    @XmlElement(name = "Species")
    protected Species species;
    @XmlElement(name = "MaternalStrainName")
    protected String maternalStrainName;
    @XmlElement(name = "BackgroundStrainName")
    protected String backgroundStrainName;
    @XmlElement(name = "BreedingProtocol")
    protected Protocol breedingProtocol;
    @XmlElement(name = "TreatmentProtocol")
    protected Protocol treatmentProtocol;
    @XmlElement(name = "PhenotypeDescription")
    protected String phenotypeDescription;
    @XmlElement(name = "CreationMethodName")
    protected String creationMethodName;
    @XmlElement(name = "DevelopmentStatusName")
    protected String developmentStatusName;
    @XmlElement(name = "BreedingTypeName")
    protected String breedingTypeName;
    @XmlElement(name = "IsStandardFavorite")
    protected boolean isStandardFavorite;
    @XmlElement(name = "ConsortiumID", required = true)
    protected ID consortiumID;
    @XmlElement(name = "IsPublic")
    protected boolean isPublic;
    @XmlElement(name = "MaleCount")
    protected int maleCount;
    @XmlElement(name = "FemaleCount")
    protected int femaleCount;
    @XmlElement(name = "UnknownCount")
    protected int unknownCount;
    @XmlElement(name = "BreedingGenerations")
    protected short breedingGenerations;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the commonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * Sets the value of the commonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonName(String value) {
        this.commonName = value;
    }

    /**
     * Gets the value of the strainDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrainDescription() {
        return strainDescription;
    }

    /**
     * Sets the value of the strainDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrainDescription(String value) {
        this.strainDescription = value;
    }

    /**
     * Gets the value of the species property.
     * 
     * @return
     *     possible object is
     *     {@link Species }
     *     
     */
    public Species getSpecies() {
        return species;
    }

    /**
     * Sets the value of the species property.
     * 
     * @param value
     *     allowed object is
     *     {@link Species }
     *     
     */
    public void setSpecies(Species value) {
        this.species = value;
    }

    /**
     * Gets the value of the maternalStrainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaternalStrainName() {
        return maternalStrainName;
    }

    /**
     * Sets the value of the maternalStrainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaternalStrainName(String value) {
        this.maternalStrainName = value;
    }

    /**
     * Gets the value of the backgroundStrainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundStrainName() {
        return backgroundStrainName;
    }

    /**
     * Sets the value of the backgroundStrainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundStrainName(String value) {
        this.backgroundStrainName = value;
    }

    /**
     * Gets the value of the breedingProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link Protocol }
     *     
     */
    public Protocol getBreedingProtocol() {
        return breedingProtocol;
    }

    /**
     * Sets the value of the breedingProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protocol }
     *     
     */
    public void setBreedingProtocol(Protocol value) {
        this.breedingProtocol = value;
    }

    /**
     * Gets the value of the treatmentProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link Protocol }
     *     
     */
    public Protocol getTreatmentProtocol() {
        return treatmentProtocol;
    }

    /**
     * Sets the value of the treatmentProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protocol }
     *     
     */
    public void setTreatmentProtocol(Protocol value) {
        this.treatmentProtocol = value;
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
     * Gets the value of the creationMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationMethodName() {
        return creationMethodName;
    }

    /**
     * Sets the value of the creationMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationMethodName(String value) {
        this.creationMethodName = value;
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
     * Gets the value of the breedingTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreedingTypeName() {
        return breedingTypeName;
    }

    /**
     * Sets the value of the breedingTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreedingTypeName(String value) {
        this.breedingTypeName = value;
    }

    /**
     * Gets the value of the isStandardFavorite property.
     * 
     */
    public boolean isIsStandardFavorite() {
        return isStandardFavorite;
    }

    /**
     * Sets the value of the isStandardFavorite property.
     * 
     */
    public void setIsStandardFavorite(boolean value) {
        this.isStandardFavorite = value;
    }

    /**
     * Gets the value of the consortiumID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getConsortiumID() {
        return consortiumID;
    }

    /**
     * Sets the value of the consortiumID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setConsortiumID(ID value) {
        this.consortiumID = value;
    }

    /**
     * Gets the value of the isPublic property.
     * 
     */
    public boolean isIsPublic() {
        return isPublic;
    }

    /**
     * Sets the value of the isPublic property.
     * 
     */
    public void setIsPublic(boolean value) {
        this.isPublic = value;
    }

    /**
     * Gets the value of the maleCount property.
     * 
     */
    public int getMaleCount() {
        return maleCount;
    }

    /**
     * Sets the value of the maleCount property.
     * 
     */
    public void setMaleCount(int value) {
        this.maleCount = value;
    }

    /**
     * Gets the value of the femaleCount property.
     * 
     */
    public int getFemaleCount() {
        return femaleCount;
    }

    /**
     * Sets the value of the femaleCount property.
     * 
     */
    public void setFemaleCount(int value) {
        this.femaleCount = value;
    }

    /**
     * Gets the value of the unknownCount property.
     * 
     */
    public int getUnknownCount() {
        return unknownCount;
    }

    /**
     * Sets the value of the unknownCount property.
     * 
     */
    public void setUnknownCount(int value) {
        this.unknownCount = value;
    }

    /**
     * Gets the value of the breedingGenerations property.
     * 
     */
    public short getBreedingGenerations() {
        return breedingGenerations;
    }

    /**
     * Sets the value of the breedingGenerations property.
     * 
     */
    public void setBreedingGenerations(short value) {
        this.breedingGenerations = value;
    }

}
