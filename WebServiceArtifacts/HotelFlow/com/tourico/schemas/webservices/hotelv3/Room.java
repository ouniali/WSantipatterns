
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Room complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Room">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.tourico.com/webservices/hotelv3}RoomInfo">
 *       &lt;attribute name="seqNum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Room")
public class Room
    extends RoomInfo
{

    @XmlAttribute(name = "seqNum", required = true)
    protected int seqNum;

    /**
     * Gets the value of the seqNum property.
     * 
     */
    public int getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     */
    public void setSeqNum(int value) {
        this.seqNum = value;
    }

}
