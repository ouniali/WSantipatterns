
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoricalChart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricalChart">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}StockChart">
 *       &lt;sequence>
 *         &lt;element name="Future" type="{http://www.xignite.com/services/}Future" minOccurs="0"/>
 *         &lt;element name="ChartType" type="{http://www.xignite.com/services/}HistoricalChartTypes"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Style" type="{http://www.xignite.com/services/}StockChartStyles"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricalChart", propOrder = {
    "future",
    "chartType",
    "startDate",
    "endDate",
    "width",
    "height",
    "title",
    "style",
    "url"
})
public class HistoricalChart
    extends StockChart
{

    @XmlElement(name = "Future")
    protected Future future;
    @XmlElement(name = "ChartType", required = true)
    @XmlSchemaType(name = "string")
    protected HistoricalChartTypes chartType;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "Width")
    protected int width;
    @XmlElement(name = "Height")
    protected int height;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Style", required = true)
    @XmlSchemaType(name = "string")
    protected StockChartStyles style;
    @XmlElement(name = "Url")
    protected String url;

    /**
     * Gets the value of the future property.
     * 
     * @return
     *     possible object is
     *     {@link Future }
     *     
     */
    public Future getFuture() {
        return future;
    }

    /**
     * Sets the value of the future property.
     * 
     * @param value
     *     allowed object is
     *     {@link Future }
     *     
     */
    public void setFuture(Future value) {
        this.future = value;
    }

    /**
     * Gets the value of the chartType property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalChartTypes }
     *     
     */
    public HistoricalChartTypes getChartType() {
        return chartType;
    }

    /**
     * Sets the value of the chartType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalChartTypes }
     *     
     */
    public void setChartType(HistoricalChartTypes value) {
        this.chartType = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link StockChartStyles }
     *     
     */
    public StockChartStyles getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockChartStyles }
     *     
     */
    public void setStyle(StockChartStyles value) {
        this.style = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
