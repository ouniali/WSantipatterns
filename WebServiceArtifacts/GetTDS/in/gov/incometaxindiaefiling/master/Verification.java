
package in.gov.incometaxindiaefiling.master;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Declaration">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AssesseeVerName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="127"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FatherName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="125"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AssesseeVerPAN">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="collapse"/>
 *                         &lt;length value="10"/>
 *                         &lt;pattern value="[A-Z][A-Z][A-Z][A-Z][A-Z]\d\d\d\d[A-Z]"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Place">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Date">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="2012-04-01"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "", propOrder = {
    "declaration",
    "place",
    "date"
})
@XmlRootElement(name = "Verification")
public class Verification {

    @XmlElement(name = "Declaration", required = true)
    protected Verification.Declaration declaration;
    @XmlElement(name = "Place", required = true)
    protected String place;
    @XmlElement(name = "Date", required = true)
    protected XMLGregorianCalendar date;

    /**
     * Gets the value of the declaration property.
     * 
     * @return
     *     possible object is
     *     {@link Verification.Declaration }
     *     
     */
    public Verification.Declaration getDeclaration() {
        return declaration;
    }

    /**
     * Sets the value of the declaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Verification.Declaration }
     *     
     */
    public void setDeclaration(Verification.Declaration value) {
        this.declaration = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
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
     *         &lt;element name="AssesseeVerName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="127"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FatherName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="125"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AssesseeVerPAN">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="collapse"/>
     *               &lt;length value="10"/>
     *               &lt;pattern value="[A-Z][A-Z][A-Z][A-Z][A-Z]\d\d\d\d[A-Z]"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
    @XmlType(name = "", propOrder = {
        "assesseeVerName",
        "fatherName",
        "assesseeVerPAN"
    })
    public static class Declaration {

        @XmlElement(name = "AssesseeVerName", required = true)
        protected String assesseeVerName;
        @XmlElement(name = "FatherName", required = true)
        protected String fatherName;
        @XmlElement(name = "AssesseeVerPAN", required = true)
        protected String assesseeVerPAN;

        /**
         * Gets the value of the assesseeVerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssesseeVerName() {
            return assesseeVerName;
        }

        /**
         * Sets the value of the assesseeVerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssesseeVerName(String value) {
            this.assesseeVerName = value;
        }

        /**
         * Gets the value of the fatherName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFatherName() {
            return fatherName;
        }

        /**
         * Sets the value of the fatherName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFatherName(String value) {
            this.fatherName = value;
        }

        /**
         * Gets the value of the assesseeVerPAN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssesseeVerPAN() {
            return assesseeVerPAN;
        }

        /**
         * Sets the value of the assesseeVerPAN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssesseeVerPAN(String value) {
            this.assesseeVerPAN = value;
        }

    }

}
