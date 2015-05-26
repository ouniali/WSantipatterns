
package com.peninsulatruck.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMovePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMovePoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovePoint" type="{http://peninsulatruck.com/WebServices/}MovePoint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMovePoint", propOrder = {
    "movePoint"
})
public class ArrayOfMovePoint {

    @XmlElement(name = "MovePoint", nillable = true)
    protected List<MovePoint> movePoint;

    /**
     * Gets the value of the movePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the movePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MovePoint }
     * 
     * 
     */
    public List<MovePoint> getMovePoint() {
        if (movePoint == null) {
            movePoint = new ArrayList<MovePoint>();
        }
        return this.movePoint;
    }

}
