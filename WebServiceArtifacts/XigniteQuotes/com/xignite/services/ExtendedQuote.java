
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedQuote">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quote" type="{http://www.xignite.com/services/}StockQuote" minOccurs="0"/>
 *         &lt;element name="Statistics" type="{http://www.xignite.com/services/}StockStatistics" minOccurs="0"/>
 *         &lt;element name="Chart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="News" type="{http://www.xignite.com/services/}ArrayOfStockNews" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedQuote", propOrder = {
    "name",
    "exchange",
    "quote",
    "statistics",
    "chart",
    "news"
})
public class ExtendedQuote
    extends Common
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Exchange")
    protected String exchange;
    @XmlElement(name = "Quote")
    protected StockQuote quote;
    @XmlElement(name = "Statistics")
    protected StockStatistics statistics;
    @XmlElement(name = "Chart")
    protected String chart;
    @XmlElement(name = "News")
    protected ArrayOfStockNews news;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchange(String value) {
        this.exchange = value;
    }

    /**
     * Gets the value of the quote property.
     * 
     * @return
     *     possible object is
     *     {@link StockQuote }
     *     
     */
    public StockQuote getQuote() {
        return quote;
    }

    /**
     * Sets the value of the quote property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockQuote }
     *     
     */
    public void setQuote(StockQuote value) {
        this.quote = value;
    }

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link StockStatistics }
     *     
     */
    public StockStatistics getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockStatistics }
     *     
     */
    public void setStatistics(StockStatistics value) {
        this.statistics = value;
    }

    /**
     * Gets the value of the chart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChart() {
        return chart;
    }

    /**
     * Sets the value of the chart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChart(String value) {
        this.chart = value;
    }

    /**
     * Gets the value of the news property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStockNews }
     *     
     */
    public ArrayOfStockNews getNews() {
        return news;
    }

    /**
     * Sets the value of the news property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStockNews }
     *     
     */
    public void setNews(ArrayOfStockNews value) {
        this.news = value;
    }

}
