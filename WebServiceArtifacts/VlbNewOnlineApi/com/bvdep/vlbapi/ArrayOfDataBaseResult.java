
package com.bvdep.vlbapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDataBaseResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDataBaseResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataBaseResult" type="{http://vlbapi.bvdep.com/}DataBaseResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDataBaseResult", propOrder = {
    "dataBaseResult"
})
public class ArrayOfDataBaseResult {

    @XmlElement(name = "DataBaseResult")
    protected List<DataBaseResult> dataBaseResult;

    /**
     * Gets the value of the dataBaseResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataBaseResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataBaseResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataBaseResult }
     * 
     * 
     */
    public List<DataBaseResult> getDataBaseResult() {
        if (dataBaseResult == null) {
            dataBaseResult = new ArrayList<DataBaseResult>();
        }
        return this.dataBaseResult;
    }

}
