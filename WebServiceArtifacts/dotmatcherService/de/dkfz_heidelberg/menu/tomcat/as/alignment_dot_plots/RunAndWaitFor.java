
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
 *         &lt;element name="dotmatcher" type="{http://www.dkfz-heidelberg.de/menu/tomcat/as/alignment_dot_plots.dotmatcher}Tdotmatcher"/>
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
    "dotmatcher"
})
@XmlRootElement(name = "runAndWaitFor")
public class RunAndWaitFor {

    @XmlElement(required = true)
    protected Tdotmatcher dotmatcher;

    /**
     * Gets the value of the dotmatcher property.
     * 
     * @return
     *     possible object is
     *     {@link Tdotmatcher }
     *     
     */
    public Tdotmatcher getDotmatcher() {
        return dotmatcher;
    }

    /**
     * Sets the value of the dotmatcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tdotmatcher }
     *     
     */
    public void setDotmatcher(Tdotmatcher value) {
        this.dotmatcher = value;
    }

}
