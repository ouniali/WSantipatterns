
package de.dkfz_heidelberg.menu.tomcat.as.alignment_dot_plots;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TdotmatcherAsequence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TdotmatcherAsequence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asequence_direct_data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asequence_usa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sformat1" type="{http://www.dkfz-heidelberg.de/menu/tomcat/as/alignment_dot_plots.dotmatcher}TdotmatcherAsequenceSformat1" minOccurs="0"/>
 *         &lt;element name="sbegin1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="send1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sprotein1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="snucleotide1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sreverse1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="slower1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supper1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TdotmatcherAsequence", propOrder = {
    "asequenceDirectData",
    "asequenceUsa",
    "sformat1",
    "sbegin1",
    "send1",
    "sprotein1",
    "snucleotide1",
    "sreverse1",
    "slower1",
    "supper1"
})
public class TdotmatcherAsequence {

    @XmlElement(name = "asequence_direct_data")
    protected String asequenceDirectData;
    @XmlElement(name = "asequence_usa")
    protected String asequenceUsa;
    @XmlSchemaType(name = "string")
    protected TdotmatcherAsequenceSformat1 sformat1;
    protected Long sbegin1;
    protected Long send1;
    protected Boolean sprotein1;
    protected Boolean snucleotide1;
    protected Boolean sreverse1;
    protected Boolean slower1;
    protected Boolean supper1;

    /**
     * Gets the value of the asequenceDirectData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsequenceDirectData() {
        return asequenceDirectData;
    }

    /**
     * Sets the value of the asequenceDirectData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsequenceDirectData(String value) {
        this.asequenceDirectData = value;
    }

    /**
     * Gets the value of the asequenceUsa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsequenceUsa() {
        return asequenceUsa;
    }

    /**
     * Sets the value of the asequenceUsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsequenceUsa(String value) {
        this.asequenceUsa = value;
    }

    /**
     * Gets the value of the sformat1 property.
     * 
     * @return
     *     possible object is
     *     {@link TdotmatcherAsequenceSformat1 }
     *     
     */
    public TdotmatcherAsequenceSformat1 getSformat1() {
        return sformat1;
    }

    /**
     * Sets the value of the sformat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdotmatcherAsequenceSformat1 }
     *     
     */
    public void setSformat1(TdotmatcherAsequenceSformat1 value) {
        this.sformat1 = value;
    }

    /**
     * Gets the value of the sbegin1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSbegin1() {
        return sbegin1;
    }

    /**
     * Sets the value of the sbegin1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSbegin1(Long value) {
        this.sbegin1 = value;
    }

    /**
     * Gets the value of the send1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSend1() {
        return send1;
    }

    /**
     * Sets the value of the send1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSend1(Long value) {
        this.send1 = value;
    }

    /**
     * Gets the value of the sprotein1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSprotein1() {
        return sprotein1;
    }

    /**
     * Sets the value of the sprotein1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSprotein1(Boolean value) {
        this.sprotein1 = value;
    }

    /**
     * Gets the value of the snucleotide1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSnucleotide1() {
        return snucleotide1;
    }

    /**
     * Sets the value of the snucleotide1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnucleotide1(Boolean value) {
        this.snucleotide1 = value;
    }

    /**
     * Gets the value of the sreverse1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSreverse1() {
        return sreverse1;
    }

    /**
     * Sets the value of the sreverse1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSreverse1(Boolean value) {
        this.sreverse1 = value;
    }

    /**
     * Gets the value of the slower1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSlower1() {
        return slower1;
    }

    /**
     * Sets the value of the slower1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSlower1(Boolean value) {
        this.slower1 = value;
    }

    /**
     * Gets the value of the supper1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupper1() {
        return supper1;
    }

    /**
     * Sets the value of the supper1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupper1(Boolean value) {
        this.supper1 = value;
    }

}
