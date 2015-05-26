
package tour.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Questionary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Questionary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuestionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Questionary", propOrder = {
    "questionCode"
})
@XmlSeeAlso({
    QuestionaryResponse.class
})
public abstract class Questionary {

    @XmlElement(name = "QuestionCode")
    protected String questionCode;

    /**
     * Gets the value of the questionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionCode() {
        return questionCode;
    }

    /**
     * Sets the value of the questionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionCode(String value) {
        this.questionCode = value;
    }

}
