
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DetalheTarifa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetalheTarifa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataTarifa" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ValorDiaria" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalheTarifa", propOrder = {
    "dataTarifa",
    "valorDiaria"
})
public class DetalheTarifa {

    @XmlElement(name = "DataTarifa")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataTarifa;
    @XmlElement(name = "ValorDiaria")
    protected BigDecimal valorDiaria;

    /**
     * Gets the value of the dataTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTarifa() {
        return dataTarifa;
    }

    /**
     * Sets the value of the dataTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTarifa(XMLGregorianCalendar value) {
        this.dataTarifa = value;
    }

    /**
     * Gets the value of the valorDiaria property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDiaria() {
        return valorDiaria;
    }

    /**
     * Sets the value of the valorDiaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDiaria(BigDecimal value) {
        this.valorDiaria = value;
    }

}
