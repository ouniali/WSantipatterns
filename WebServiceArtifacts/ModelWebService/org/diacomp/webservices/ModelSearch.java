
package org.diacomp.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ModelSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.diacomp.org/webservices/}ObjectSearch">
 *       &lt;sequence>
 *         &lt;element name="StrainID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="InvestigatorID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="TypeID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="SpeciesID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="DevelopmentStatusID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="CreatedFromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CreatedToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrderBy" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="RowCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelSearch", propOrder = {
    "strainID",
    "investigatorID",
    "typeID",
    "speciesID",
    "developmentStatusID",
    "createdFromDate",
    "createdToDate",
    "orderBy",
    "rowCount"
})
public class ModelSearch
    extends ObjectSearch
{

    @XmlElement(name = "StrainID", required = true)
    protected ID strainID;
    @XmlElement(name = "InvestigatorID", required = true)
    protected ID investigatorID;
    @XmlElement(name = "TypeID", required = true)
    protected ID typeID;
    @XmlElement(name = "SpeciesID", required = true)
    protected ID speciesID;
    @XmlElement(name = "DevelopmentStatusID", required = true)
    protected ID developmentStatusID;
    @XmlElement(name = "CreatedFromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdFromDate;
    @XmlElement(name = "CreatedToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdToDate;
    @XmlElement(name = "OrderBy")
    @XmlSchemaType(name = "unsignedByte")
    protected short orderBy;
    @XmlElement(name = "RowCount")
    protected int rowCount;

    /**
     * Gets the value of the strainID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getStrainID() {
        return strainID;
    }

    /**
     * Sets the value of the strainID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setStrainID(ID value) {
        this.strainID = value;
    }

    /**
     * Gets the value of the investigatorID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getInvestigatorID() {
        return investigatorID;
    }

    /**
     * Sets the value of the investigatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setInvestigatorID(ID value) {
        this.investigatorID = value;
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
     * Gets the value of the speciesID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getSpeciesID() {
        return speciesID;
    }

    /**
     * Sets the value of the speciesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setSpeciesID(ID value) {
        this.speciesID = value;
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
     * Gets the value of the createdFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedFromDate() {
        return createdFromDate;
    }

    /**
     * Sets the value of the createdFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedFromDate(XMLGregorianCalendar value) {
        this.createdFromDate = value;
    }

    /**
     * Gets the value of the createdToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedToDate() {
        return createdToDate;
    }

    /**
     * Sets the value of the createdToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedToDate(XMLGregorianCalendar value) {
        this.createdToDate = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     */
    public short getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     */
    public void setOrderBy(short value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the rowCount property.
     * 
     */
    public int getRowCount() {
        return rowCount;
    }

    /**
     * Sets the value of the rowCount property.
     * 
     */
    public void setRowCount(int value) {
        this.rowCount = value;
    }

}
