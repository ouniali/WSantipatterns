
package de.dkfz_heidelberg.menu.tomcat.as.alignment_dot_plots;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TdotmatcherResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TdotmatcherResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="report" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detailed_status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Graphics_container" type="{http://www.dkfz-heidelberg.de/menu/tomcat/as/alignment_dot_plots.dotmatcher}TdotmatcherResultGraphics_container" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TdotmatcherResult", propOrder = {
    "report",
    "detailedStatus",
    "graphicsContainer"
})
public class TdotmatcherResult {

    protected String report;
    @XmlElement(name = "detailed_status")
    protected Long detailedStatus;
    @XmlElement(name = "Graphics_container")
    protected TdotmatcherResultGraphicsContainer graphicsContainer;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReport(String value) {
        this.report = value;
    }

    /**
     * Gets the value of the detailedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDetailedStatus() {
        return detailedStatus;
    }

    /**
     * Sets the value of the detailedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDetailedStatus(Long value) {
        this.detailedStatus = value;
    }

    /**
     * Gets the value of the graphicsContainer property.
     * 
     * @return
     *     possible object is
     *     {@link TdotmatcherResultGraphicsContainer }
     *     
     */
    public TdotmatcherResultGraphicsContainer getGraphicsContainer() {
        return graphicsContainer;
    }

    /**
     * Sets the value of the graphicsContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdotmatcherResultGraphicsContainer }
     *     
     */
    public void setGraphicsContainer(TdotmatcherResultGraphicsContainer value) {
        this.graphicsContainer = value;
    }

}
