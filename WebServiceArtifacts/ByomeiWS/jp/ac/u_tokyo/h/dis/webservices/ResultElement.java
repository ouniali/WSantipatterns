
package jp.ac.u_tokyo.h.dis.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hyoki" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICD10_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICD10_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kokankodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recekodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kanribango" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kubun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sakuinyogo" type="{http://www.dis.h.u-tokyo.ac.jp/webservices/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultElement", propOrder = {
    "hyoki",
    "icd101",
    "icd102",
    "kokankodo",
    "recekodo",
    "kanribango",
    "kubun",
    "sakuinyogo"
})
public class ResultElement {

    protected String hyoki;
    @XmlElement(name = "ICD10_1")
    protected String icd101;
    @XmlElement(name = "ICD10_2")
    protected String icd102;
    protected String kokankodo;
    protected String recekodo;
    protected String kanribango;
    protected String kubun;
    protected ArrayOfString sakuinyogo;

    /**
     * Gets the value of the hyoki property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHyoki() {
        return hyoki;
    }

    /**
     * Sets the value of the hyoki property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyoki(String value) {
        this.hyoki = value;
    }

    /**
     * Gets the value of the icd101 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICD101() {
        return icd101;
    }

    /**
     * Sets the value of the icd101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICD101(String value) {
        this.icd101 = value;
    }

    /**
     * Gets the value of the icd102 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICD102() {
        return icd102;
    }

    /**
     * Sets the value of the icd102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICD102(String value) {
        this.icd102 = value;
    }

    /**
     * Gets the value of the kokankodo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKokankodo() {
        return kokankodo;
    }

    /**
     * Sets the value of the kokankodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKokankodo(String value) {
        this.kokankodo = value;
    }

    /**
     * Gets the value of the recekodo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecekodo() {
        return recekodo;
    }

    /**
     * Sets the value of the recekodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecekodo(String value) {
        this.recekodo = value;
    }

    /**
     * Gets the value of the kanribango property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKanribango() {
        return kanribango;
    }

    /**
     * Sets the value of the kanribango property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKanribango(String value) {
        this.kanribango = value;
    }

    /**
     * Gets the value of the kubun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKubun() {
        return kubun;
    }

    /**
     * Sets the value of the kubun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKubun(String value) {
        this.kubun = value;
    }

    /**
     * Gets the value of the sakuinyogo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getSakuinyogo() {
        return sakuinyogo;
    }

    /**
     * Sets the value of the sakuinyogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setSakuinyogo(ArrayOfString value) {
        this.sakuinyogo = value;
    }

}
