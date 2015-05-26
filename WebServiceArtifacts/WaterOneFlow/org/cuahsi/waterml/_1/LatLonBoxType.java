
package org.cuahsi.waterml._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LatLonBoxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LatLonBoxType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cuahsi.org/waterML/1.0/}GeogLocationType">
 *       &lt;sequence>
 *         &lt;element name="south" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="west" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="north" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="east" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatLonBoxType", propOrder = {
    "south",
    "west",
    "north",
    "east"
})
public class LatLonBoxType
    extends GeogLocationType
{

    protected double south;
    protected double west;
    protected double north;
    protected double east;

    /**
     * Gets the value of the south property.
     * 
     */
    public double getSouth() {
        return south;
    }

    /**
     * Sets the value of the south property.
     * 
     */
    public void setSouth(double value) {
        this.south = value;
    }

    /**
     * Gets the value of the west property.
     * 
     */
    public double getWest() {
        return west;
    }

    /**
     * Sets the value of the west property.
     * 
     */
    public void setWest(double value) {
        this.west = value;
    }

    /**
     * Gets the value of the north property.
     * 
     */
    public double getNorth() {
        return north;
    }

    /**
     * Sets the value of the north property.
     * 
     */
    public void setNorth(double value) {
        this.north = value;
    }

    /**
     * Gets the value of the east property.
     * 
     */
    public double getEast() {
        return east;
    }

    /**
     * Sets the value of the east property.
     * 
     */
    public void setEast(double value) {
        this.east = value;
    }

}
