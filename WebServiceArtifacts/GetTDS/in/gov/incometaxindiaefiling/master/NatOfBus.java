
package in.gov.incometaxindiaefiling.master;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Business" maxOccurs="3">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Code">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="4"/>
 *                         &lt;enumeration value="0101"/>
 *                         &lt;enumeration value="0102"/>
 *                         &lt;enumeration value="0103"/>
 *                         &lt;enumeration value="0104"/>
 *                         &lt;enumeration value="0105"/>
 *                         &lt;enumeration value="0106"/>
 *                         &lt;enumeration value="0107"/>
 *                         &lt;enumeration value="0108"/>
 *                         &lt;enumeration value="0109"/>
 *                         &lt;enumeration value="0110"/>
 *                         &lt;enumeration value="0111"/>
 *                         &lt;enumeration value="0112"/>
 *                         &lt;enumeration value="0113"/>
 *                         &lt;enumeration value="0114"/>
 *                         &lt;enumeration value="0115"/>
 *                         &lt;enumeration value="0116"/>
 *                         &lt;enumeration value="0117"/>
 *                         &lt;enumeration value="0118"/>
 *                         &lt;enumeration value="0119"/>
 *                         &lt;enumeration value="0120"/>
 *                         &lt;enumeration value="0121"/>
 *                         &lt;enumeration value="0122"/>
 *                         &lt;enumeration value="0123"/>
 *                         &lt;enumeration value="0124"/>
 *                         &lt;enumeration value="0201"/>
 *                         &lt;enumeration value="0202"/>
 *                         &lt;enumeration value="0203"/>
 *                         &lt;enumeration value="0204"/>
 *                         &lt;enumeration value="0301"/>
 *                         &lt;enumeration value="0401"/>
 *                         &lt;enumeration value="0402"/>
 *                         &lt;enumeration value="0403"/>
 *                         &lt;enumeration value="0404"/>
 *                         &lt;enumeration value="0501"/>
 *                         &lt;enumeration value="0502"/>
 *                         &lt;enumeration value="0503"/>
 *                         &lt;enumeration value="0504"/>
 *                         &lt;enumeration value="0505"/>
 *                         &lt;enumeration value="0601"/>
 *                         &lt;enumeration value="0602"/>
 *                         &lt;enumeration value="0603"/>
 *                         &lt;enumeration value="0604"/>
 *                         &lt;enumeration value="0605"/>
 *                         &lt;enumeration value="0606"/>
 *                         &lt;enumeration value="0607"/>
 *                         &lt;enumeration value="0701"/>
 *                         &lt;enumeration value="0702"/>
 *                         &lt;enumeration value="0703"/>
 *                         &lt;enumeration value="0704"/>
 *                         &lt;enumeration value="0705"/>
 *                         &lt;enumeration value="0706"/>
 *                         &lt;enumeration value="0707"/>
 *                         &lt;enumeration value="0708"/>
 *                         &lt;enumeration value="0709"/>
 *                         &lt;enumeration value="0710"/>
 *                         &lt;enumeration value="0711"/>
 *                         &lt;enumeration value="0712"/>
 *                         &lt;enumeration value="0713"/>
 *                         &lt;enumeration value="0714"/>
 *                         &lt;enumeration value="0801"/>
 *                         &lt;enumeration value="0802"/>
 *                         &lt;enumeration value="0803"/>
 *                         &lt;enumeration value="0804"/>
 *                         &lt;enumeration value="0805"/>
 *                         &lt;enumeration value="0806"/>
 *                         &lt;enumeration value="0807"/>
 *                         &lt;enumeration value="0808"/>
 *                         &lt;enumeration value="0809"/>
 *                         &lt;enumeration value="0901"/>
 *                         &lt;enumeration value="0902"/>
 *                         &lt;enumeration value="0903"/>
 *                         &lt;enumeration value="0904"/>
 *                         &lt;enumeration value="0905"/>
 *                         &lt;enumeration value="0906"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Trade" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TradeName" maxOccurs="3">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="75"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "", propOrder = {
    "business"
})
@XmlRootElement(name = "NatOfBus")
public class NatOfBus {

    @XmlElement(name = "Business", required = true)
    protected List<NatOfBus.Business> business;

    /**
     * Gets the value of the business property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the business property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusiness().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NatOfBus.Business }
     * 
     * 
     */
    public List<NatOfBus.Business> getBusiness() {
        if (business == null) {
            business = new ArrayList<NatOfBus.Business>();
        }
        return this.business;
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
     *         &lt;element name="Code">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="4"/>
     *               &lt;enumeration value="0101"/>
     *               &lt;enumeration value="0102"/>
     *               &lt;enumeration value="0103"/>
     *               &lt;enumeration value="0104"/>
     *               &lt;enumeration value="0105"/>
     *               &lt;enumeration value="0106"/>
     *               &lt;enumeration value="0107"/>
     *               &lt;enumeration value="0108"/>
     *               &lt;enumeration value="0109"/>
     *               &lt;enumeration value="0110"/>
     *               &lt;enumeration value="0111"/>
     *               &lt;enumeration value="0112"/>
     *               &lt;enumeration value="0113"/>
     *               &lt;enumeration value="0114"/>
     *               &lt;enumeration value="0115"/>
     *               &lt;enumeration value="0116"/>
     *               &lt;enumeration value="0117"/>
     *               &lt;enumeration value="0118"/>
     *               &lt;enumeration value="0119"/>
     *               &lt;enumeration value="0120"/>
     *               &lt;enumeration value="0121"/>
     *               &lt;enumeration value="0122"/>
     *               &lt;enumeration value="0123"/>
     *               &lt;enumeration value="0124"/>
     *               &lt;enumeration value="0201"/>
     *               &lt;enumeration value="0202"/>
     *               &lt;enumeration value="0203"/>
     *               &lt;enumeration value="0204"/>
     *               &lt;enumeration value="0301"/>
     *               &lt;enumeration value="0401"/>
     *               &lt;enumeration value="0402"/>
     *               &lt;enumeration value="0403"/>
     *               &lt;enumeration value="0404"/>
     *               &lt;enumeration value="0501"/>
     *               &lt;enumeration value="0502"/>
     *               &lt;enumeration value="0503"/>
     *               &lt;enumeration value="0504"/>
     *               &lt;enumeration value="0505"/>
     *               &lt;enumeration value="0601"/>
     *               &lt;enumeration value="0602"/>
     *               &lt;enumeration value="0603"/>
     *               &lt;enumeration value="0604"/>
     *               &lt;enumeration value="0605"/>
     *               &lt;enumeration value="0606"/>
     *               &lt;enumeration value="0607"/>
     *               &lt;enumeration value="0701"/>
     *               &lt;enumeration value="0702"/>
     *               &lt;enumeration value="0703"/>
     *               &lt;enumeration value="0704"/>
     *               &lt;enumeration value="0705"/>
     *               &lt;enumeration value="0706"/>
     *               &lt;enumeration value="0707"/>
     *               &lt;enumeration value="0708"/>
     *               &lt;enumeration value="0709"/>
     *               &lt;enumeration value="0710"/>
     *               &lt;enumeration value="0711"/>
     *               &lt;enumeration value="0712"/>
     *               &lt;enumeration value="0713"/>
     *               &lt;enumeration value="0714"/>
     *               &lt;enumeration value="0801"/>
     *               &lt;enumeration value="0802"/>
     *               &lt;enumeration value="0803"/>
     *               &lt;enumeration value="0804"/>
     *               &lt;enumeration value="0805"/>
     *               &lt;enumeration value="0806"/>
     *               &lt;enumeration value="0807"/>
     *               &lt;enumeration value="0808"/>
     *               &lt;enumeration value="0809"/>
     *               &lt;enumeration value="0901"/>
     *               &lt;enumeration value="0902"/>
     *               &lt;enumeration value="0903"/>
     *               &lt;enumeration value="0904"/>
     *               &lt;enumeration value="0905"/>
     *               &lt;enumeration value="0906"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Trade" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TradeName" maxOccurs="3">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="75"/>
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "code",
        "trade"
    })
    public static class Business {

        @XmlElement(name = "Code", required = true, defaultValue = "0101")
        protected String code;
        @XmlElement(name = "Trade")
        protected NatOfBus.Business.Trade trade;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the trade property.
         * 
         * @return
         *     possible object is
         *     {@link NatOfBus.Business.Trade }
         *     
         */
        public NatOfBus.Business.Trade getTrade() {
            return trade;
        }

        /**
         * Sets the value of the trade property.
         * 
         * @param value
         *     allowed object is
         *     {@link NatOfBus.Business.Trade }
         *     
         */
        public void setTrade(NatOfBus.Business.Trade value) {
            this.trade = value;
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
         *         &lt;element name="TradeName" maxOccurs="3">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="75"/>
         *               &lt;minLength value="1"/>
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
            "tradeName"
        })
        public static class Trade {

            @XmlElement(name = "TradeName", required = true)
            protected List<String> tradeName;

            /**
             * Gets the value of the tradeName property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tradeName property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTradeName().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getTradeName() {
                if (tradeName == null) {
                    tradeName = new ArrayList<String>();
                }
                return this.tradeName;
            }

        }

    }

}
