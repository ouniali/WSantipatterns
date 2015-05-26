
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSC_ConsumerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSC_ConsumerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Consumer" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_ConsumerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSC_ConsumerType", propOrder = {
    "consumer"
})
public class ArrayOfSCConsumerType {

    @XmlElement(name = "Consumer")
    protected List<SCConsumerType> consumer;

    /**
     * Gets the value of the consumer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCConsumerType }
     * 
     * 
     */
    public List<SCConsumerType> getConsumer() {
        if (consumer == null) {
            consumer = new ArrayList<SCConsumerType>();
        }
        return this.consumer;
    }

}
