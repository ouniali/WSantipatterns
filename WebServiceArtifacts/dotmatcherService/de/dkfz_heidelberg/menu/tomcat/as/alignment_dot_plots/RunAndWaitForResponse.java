
package de.dkfz_heidelberg.menu.tomcat.as.alignment_dot_plots;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dotmatcherResult" type="{http://www.dkfz-heidelberg.de/menu/tomcat/as/alignment_dot_plots.dotmatcher}TdotmatcherResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dotmatcherResult"
})
@XmlRootElement(name = "runAndWaitForResponse")
public class RunAndWaitForResponse {

    @XmlElement(required = true)
    protected TdotmatcherResult dotmatcherResult;

    /**
     * Gets the value of the dotmatcherResult property.
     * 
     * @return
     *     possible object is
     *     {@link TdotmatcherResult }
     *     
     */
    public TdotmatcherResult getDotmatcherResult() {
        return dotmatcherResult;
    }

    /**
     * Sets the value of the dotmatcherResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdotmatcherResult }
     *     
     */
    public void setDotmatcherResult(TdotmatcherResult value) {
        this.dotmatcherResult = value;
    }

}
