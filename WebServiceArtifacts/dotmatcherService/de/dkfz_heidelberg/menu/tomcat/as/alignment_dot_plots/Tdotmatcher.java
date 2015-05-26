
package de.dkfz_heidelberg.menu.tomcat.as.alignment_dot_plots;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tdotmatcher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tdotmatcher">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asequence" type="{http://www.dkfz-heidelberg.de/menu/tomcat/as/alignment_dot_plots.dotmatcher}TdotmatcherAsequence"/>
 *         &lt;element name="bsequence" type="{http://www.dkfz-heidelberg.de/menu/tomcat/as/alignment_dot_plots.dotmatcher}TdotmatcherBsequence"/>
 *         &lt;element name="graph_format" type="{http://www.dkfz-heidelberg.de/menu/tomcat/as/alignment_dot_plots.dotmatcher}TdotmatcherGraph_format" minOccurs="0"/>
 *         &lt;element name="matrixfile" type="{http://www.dkfz-heidelberg.de/menu/tomcat/as/alignment_dot_plots.dotmatcher}TdotmatcherMatrixfile" minOccurs="0"/>
 *         &lt;element name="windowsize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tdotmatcher", propOrder = {
    "asequence",
    "bsequence",
    "graphFormat",
    "matrixfile",
    "windowsize",
    "threshold"
})
public class Tdotmatcher {

    @XmlElement(required = true)
    protected TdotmatcherAsequence asequence;
    @XmlElement(required = true)
    protected TdotmatcherBsequence bsequence;
    @XmlElement(name = "graph_format")
    @XmlSchemaType(name = "string")
    protected TdotmatcherGraphFormat graphFormat;
    protected TdotmatcherMatrixfile matrixfile;
    protected Long windowsize;
    protected Long threshold;

    /**
     * Gets the value of the asequence property.
     * 
     * @return
     *     possible object is
     *     {@link TdotmatcherAsequence }
     *     
     */
    public TdotmatcherAsequence getAsequence() {
        return asequence;
    }

    /**
     * Sets the value of the asequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdotmatcherAsequence }
     *     
     */
    public void setAsequence(TdotmatcherAsequence value) {
        this.asequence = value;
    }

    /**
     * Gets the value of the bsequence property.
     * 
     * @return
     *     possible object is
     *     {@link TdotmatcherBsequence }
     *     
     */
    public TdotmatcherBsequence getBsequence() {
        return bsequence;
    }

    /**
     * Sets the value of the bsequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdotmatcherBsequence }
     *     
     */
    public void setBsequence(TdotmatcherBsequence value) {
        this.bsequence = value;
    }

    /**
     * Gets the value of the graphFormat property.
     * 
     * @return
     *     possible object is
     *     {@link TdotmatcherGraphFormat }
     *     
     */
    public TdotmatcherGraphFormat getGraphFormat() {
        return graphFormat;
    }

    /**
     * Sets the value of the graphFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdotmatcherGraphFormat }
     *     
     */
    public void setGraphFormat(TdotmatcherGraphFormat value) {
        this.graphFormat = value;
    }

    /**
     * Gets the value of the matrixfile property.
     * 
     * @return
     *     possible object is
     *     {@link TdotmatcherMatrixfile }
     *     
     */
    public TdotmatcherMatrixfile getMatrixfile() {
        return matrixfile;
    }

    /**
     * Sets the value of the matrixfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdotmatcherMatrixfile }
     *     
     */
    public void setMatrixfile(TdotmatcherMatrixfile value) {
        this.matrixfile = value;
    }

    /**
     * Gets the value of the windowsize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWindowsize() {
        return windowsize;
    }

    /**
     * Sets the value of the windowsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWindowsize(Long value) {
        this.windowsize = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThreshold(Long value) {
        this.threshold = value;
    }

}
