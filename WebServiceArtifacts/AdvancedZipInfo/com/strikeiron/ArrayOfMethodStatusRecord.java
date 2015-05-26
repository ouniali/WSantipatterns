
package com.strikeiron;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMethodStatusRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMethodStatusRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MethodStatusRecord" type="{http://www.strikeiron.com}MethodStatusRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMethodStatusRecord", propOrder = {
    "methodStatusRecord"
})
public class ArrayOfMethodStatusRecord {

    @XmlElement(name = "MethodStatusRecord", nillable = true)
    protected List<MethodStatusRecord> methodStatusRecord;

    /**
     * Gets the value of the methodStatusRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodStatusRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodStatusRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MethodStatusRecord }
     * 
     * 
     */
    public List<MethodStatusRecord> getMethodStatusRecord() {
        if (methodStatusRecord == null) {
            methodStatusRecord = new ArrayList<MethodStatusRecord>();
        }
        return this.methodStatusRecord;
    }

}
