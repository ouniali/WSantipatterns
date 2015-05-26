
package nl.lumc.conceptprofilemining.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for supportingDocumentsWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="supportingDocumentsWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cuiOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuiMember" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SupportingDocumentsList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://services.conceptprofilemining.lumc.nl/}SupportingDocument" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supportingDocumentsWrapper", propOrder = {
    "cuiOwner",
    "cuiMember",
    "originalSize",
    "supportingDocumentsList"
})
public class SupportingDocumentsWrapper {

    protected String cuiOwner;
    protected String cuiMember;
    protected Integer originalSize;
    @XmlElement(name = "SupportingDocumentsList")
    protected SupportingDocumentsWrapper.SupportingDocumentsList supportingDocumentsList;

    /**
     * Gets the value of the cuiOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuiOwner() {
        return cuiOwner;
    }

    /**
     * Sets the value of the cuiOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuiOwner(String value) {
        this.cuiOwner = value;
    }

    /**
     * Gets the value of the cuiMember property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuiMember() {
        return cuiMember;
    }

    /**
     * Sets the value of the cuiMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuiMember(String value) {
        this.cuiMember = value;
    }

    /**
     * Gets the value of the originalSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOriginalSize() {
        return originalSize;
    }

    /**
     * Sets the value of the originalSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOriginalSize(Integer value) {
        this.originalSize = value;
    }

    /**
     * Gets the value of the supportingDocumentsList property.
     * 
     * @return
     *     possible object is
     *     {@link SupportingDocumentsWrapper.SupportingDocumentsList }
     *     
     */
    public SupportingDocumentsWrapper.SupportingDocumentsList getSupportingDocumentsList() {
        return supportingDocumentsList;
    }

    /**
     * Sets the value of the supportingDocumentsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportingDocumentsWrapper.SupportingDocumentsList }
     *     
     */
    public void setSupportingDocumentsList(SupportingDocumentsWrapper.SupportingDocumentsList value) {
        this.supportingDocumentsList = value;
    }


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
     *         &lt;element ref="{http://services.conceptprofilemining.lumc.nl/}SupportingDocument" maxOccurs="unbounded" minOccurs="0"/>
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
        "supportingDocument"
    })
    public static class SupportingDocumentsList {

        @XmlElement(name = "SupportingDocument", namespace = "http://services.conceptprofilemining.lumc.nl/")
        protected List<SupportingDocument> supportingDocument;

        /**
         * Gets the value of the supportingDocument property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supportingDocument property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupportingDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SupportingDocument }
         * 
         * 
         */
        public List<SupportingDocument> getSupportingDocument() {
            if (supportingDocument == null) {
                supportingDocument = new ArrayList<SupportingDocument>();
            }
            return this.supportingDocument;
        }

    }

}
