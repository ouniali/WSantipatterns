
package com.tourico.schemas.webservices.hotelv3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFormattedTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFormattedTextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormattedTextType" type="{http://schemas.tourico.com/webservices/hotelv3}FormattedTextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFormattedTextType", propOrder = {
    "formattedTextType"
})
public class ArrayOfFormattedTextType {

    @XmlElement(name = "FormattedTextType", nillable = true)
    protected List<FormattedTextType> formattedTextType;

    /**
     * Gets the value of the formattedTextType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formattedTextType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormattedTextType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedTextType }
     * 
     * 
     */
    public List<FormattedTextType> getFormattedTextType() {
        if (formattedTextType == null) {
            formattedTextType = new ArrayList<FormattedTextType>();
        }
        return this.formattedTextType;
    }

}
