
package de.dkfz_heidelberg.menu.tomcat.as.alignment_dot_plots;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TdotmatcherBsequence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TdotmatcherBsequence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bsequence_direct_data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bsequence_usa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sformat2" type="{http://www.dkfz-heidelberg.de/menu/tomcat/as/alignment_dot_plots.dotmatcher}TdotmatcherBsequenceSformat2" minOccurs="0"/>
 *         &lt;element name="sbegin2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="send2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sprotein2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="snucleotide2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sreverse2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="slower2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supper2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TdotmatcherBsequence", propOrder = {
    "bsequenceDirectData",
    "bsequenceUsa",
    "sformat2",
    "sbegin2",
    "send2",
    "sprotein2",
    "snucleotide2",
    "sreverse2",
    "slower2",
    "supper2"
})
public class TdotmatcherBsequence {

    @XmlElement(name = "bsequence_direct_data")
    protected String bsequenceDirectData;
    @XmlElement(name = "bsequence_usa")
    protected String bsequenceUsa;
    @XmlSchemaType(name = "string")
    protected TdotmatcherBsequenceSformat2 sformat2;
    protected Long sbegin2;
    protected Long send2;
    protected Boolean sprotein2;
    protected Boolean snucleotide2;
    protected Boolean sreverse2;
    protected Boolean slower2;
    protected Boolean supper2;

    /**
     * Gets the value of the bsequenceDirectData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsequenceDirectData() {
        return bsequenceDirectData;
    }

    /**
     * Sets the value of the bsequenceDirectData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBsequenceDirectData(String value) {
        this.bsequenceDirectData = value;
    }

    /**
     * Gets the value of the bsequenceUsa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsequenceUsa() {
        return bsequenceUsa;
    }

    /**
     * Sets the value of the bsequenceUsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBsequenceUsa(String value) {
        this.bsequenceUsa = value;
    }

    /**
     * Gets the value of the sformat2 property.
     * 
     * @return
     *     possible object is
     *     {@link TdotmatcherBsequenceSformat2 }
     *     
     */
    public TdotmatcherBsequenceSformat2 getSformat2() {
        return sformat2;
    }

    /**
     * Sets the value of the sformat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdotmatcherBsequenceSformat2 }
     *     
     */
    public void setSformat2(TdotmatcherBsequenceSformat2 value) {
        this.sformat2 = value;
    }

    /**
     * Gets the value of the sbegin2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSbegin2() {
        return sbegin2;
    }

    /**
     * Sets the value of the sbegin2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSbegin2(Long value) {
        this.sbegin2 = value;
    }

    /**
     * Gets the value of the send2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSend2() {
        return send2;
    }

    /**
     * Sets the value of the send2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSend2(Long value) {
        this.send2 = value;
    }

    /**
     * Gets the value of the sprotein2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSprotein2() {
        return sprotein2;
    }

    /**
     * Sets the value of the sprotein2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSprotein2(Boolean value) {
        this.sprotein2 = value;
    }

    /**
     * Gets the value of the snucleotide2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSnucleotide2() {
        return snucleotide2;
    }

    /**
     * Sets the value of the snucleotide2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnucleotide2(Boolean value) {
        this.snucleotide2 = value;
    }

    /**
     * Gets the value of the sreverse2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSreverse2() {
        return sreverse2;
    }

    /**
     * Sets the value of the sreverse2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSreverse2(Boolean value) {
        this.sreverse2 = value;
    }

    /**
     * Gets the value of the slower2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSlower2() {
        return slower2;
    }

    /**
     * Sets the value of the slower2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSlower2(Boolean value) {
        this.slower2 = value;
    }

    /**
     * Gets the value of the supper2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupper2() {
        return supper2;
    }

    /**
     * Sets the value of the supper2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupper2(Boolean value) {
        this.supper2 = value;
    }

}
