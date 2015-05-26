
package com.flightaware.flightxml.soap.flightxml2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MapFlightExRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapFlightExRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faFlightID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mapHeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mapWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="layer_on" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="layer_off" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="show_data_blocks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="show_airports" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="airports_expand_view" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="latlon_box" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapFlightExRequest", propOrder = {
    "faFlightID",
    "mapHeight",
    "mapWidth",
    "layerOn",
    "layerOff",
    "showDataBlocks",
    "showAirports",
    "airportsExpandView",
    "latlonBox"
})
public class MapFlightExRequest {

    @XmlElement(required = true)
    protected String faFlightID;
    protected int mapHeight;
    protected int mapWidth;
    @XmlElement(name = "layer_on", required = true)
    protected List<String> layerOn;
    @XmlElement(name = "layer_off", required = true)
    protected List<String> layerOff;
    @XmlElement(name = "show_data_blocks")
    protected boolean showDataBlocks;
    @XmlElement(name = "show_airports")
    protected boolean showAirports;
    @XmlElement(name = "airports_expand_view")
    protected boolean airportsExpandView;
    @XmlElement(name = "latlon_box", type = Float.class)
    protected List<Float> latlonBox;

    /**
     * Gets the value of the faFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaFlightID() {
        return faFlightID;
    }

    /**
     * Sets the value of the faFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaFlightID(String value) {
        this.faFlightID = value;
    }

    /**
     * Gets the value of the mapHeight property.
     * 
     */
    public int getMapHeight() {
        return mapHeight;
    }

    /**
     * Sets the value of the mapHeight property.
     * 
     */
    public void setMapHeight(int value) {
        this.mapHeight = value;
    }

    /**
     * Gets the value of the mapWidth property.
     * 
     */
    public int getMapWidth() {
        return mapWidth;
    }

    /**
     * Sets the value of the mapWidth property.
     * 
     */
    public void setMapWidth(int value) {
        this.mapWidth = value;
    }

    /**
     * Gets the value of the layerOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layerOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayerOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLayerOn() {
        if (layerOn == null) {
            layerOn = new ArrayList<String>();
        }
        return this.layerOn;
    }

    /**
     * Gets the value of the layerOff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layerOff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayerOff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLayerOff() {
        if (layerOff == null) {
            layerOff = new ArrayList<String>();
        }
        return this.layerOff;
    }

    /**
     * Gets the value of the showDataBlocks property.
     * 
     */
    public boolean isShowDataBlocks() {
        return showDataBlocks;
    }

    /**
     * Sets the value of the showDataBlocks property.
     * 
     */
    public void setShowDataBlocks(boolean value) {
        this.showDataBlocks = value;
    }

    /**
     * Gets the value of the showAirports property.
     * 
     */
    public boolean isShowAirports() {
        return showAirports;
    }

    /**
     * Sets the value of the showAirports property.
     * 
     */
    public void setShowAirports(boolean value) {
        this.showAirports = value;
    }

    /**
     * Gets the value of the airportsExpandView property.
     * 
     */
    public boolean isAirportsExpandView() {
        return airportsExpandView;
    }

    /**
     * Sets the value of the airportsExpandView property.
     * 
     */
    public void setAirportsExpandView(boolean value) {
        this.airportsExpandView = value;
    }

    /**
     * Gets the value of the latlonBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the latlonBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLatlonBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getLatlonBox() {
        if (latlonBox == null) {
            latlonBox = new ArrayList<Float>();
        }
        return this.latlonBox;
    }

}
