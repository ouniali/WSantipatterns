
package com.inforcyl.services.v_1_3.faresearch.output.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.BookingCharge;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.CardTypeCharge;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.InsuranceData;
import com.inforcyl.services.xsd.Header;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.inforcyl.services.v_1_3.faresearch.output.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FareSearchOutputBookingCharge_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "bookingCharge");
    private final static QName _FareSearchOutputVatPercentage_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "vatPercentage");
    private final static QName _FareSearchOutputTravelShopFeeAmount_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "travelShopFeeAmount");
    private final static QName _FareSearchOutputValidDiscount_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "validDiscount");
    private final static QName _FareSearchOutputCodStadmImpu_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "codStadmImpu");
    private final static QName _FareSearchOutputCardTypeCharge_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "cardTypeCharge");
    private final static QName _FareSearchOutputCodTadmImpu_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "codTadmImpu");
    private final static QName _FareSearchOutputInsuranceData_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "insuranceData");
    private final static QName _FareSearchOutputInfo_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "info");
    private final static QName _FareSearchOutputMiniMod_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "miniMod");
    private final static QName _FareSearchOutputTotalChargesAmount_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "totalChargesAmount");
    private final static QName _FareSearchOutputHeader_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "header");
    private final static QName _FareSearchOutputCorrelationId_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "correlationId");
    private final static QName _FareSearchOutputManagementFees_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "managementFees");
    private final static QName _FareSearchOutputColaboratorFeeAmount_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "colaboratorFeeAmount");
    private final static QName _FareSearchOutputDescInfo_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "descInfo");
    private final static QName _FareSearchOutputOperatingBrand_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "operatingBrand");
    private final static QName _FareSearchOutputProduct_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "product");
    private final static QName _FareSearchOutputErrorMessage_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "errorMessage");
    private final static QName _FareSearchOutputMandatoryData_QNAME = new QName("http://output.faresearch.v_1_3.services.inforcyl.com/xsd", "mandatoryData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inforcyl.services.v_1_3.faresearch.output.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FareSearchOutput }
     * 
     */
    public FareSearchOutput createFareSearchOutput() {
        return new FareSearchOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingCharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "bookingCharge", scope = FareSearchOutput.class)
    public JAXBElement<BookingCharge> createFareSearchOutputBookingCharge(BookingCharge value) {
        return new JAXBElement<BookingCharge>(_FareSearchOutputBookingCharge_QNAME, BookingCharge.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "vatPercentage", scope = FareSearchOutput.class)
    public JAXBElement<Double> createFareSearchOutputVatPercentage(Double value) {
        return new JAXBElement<Double>(_FareSearchOutputVatPercentage_QNAME, Double.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "travelShopFeeAmount", scope = FareSearchOutput.class)
    public JAXBElement<Double> createFareSearchOutputTravelShopFeeAmount(Double value) {
        return new JAXBElement<Double>(_FareSearchOutputTravelShopFeeAmount_QNAME, Double.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "validDiscount", scope = FareSearchOutput.class)
    public JAXBElement<String> createFareSearchOutputValidDiscount(String value) {
        return new JAXBElement<String>(_FareSearchOutputValidDiscount_QNAME, String.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "codStadmImpu", scope = FareSearchOutput.class)
    public JAXBElement<String> createFareSearchOutputCodStadmImpu(String value) {
        return new JAXBElement<String>(_FareSearchOutputCodStadmImpu_QNAME, String.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardTypeCharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "cardTypeCharge", scope = FareSearchOutput.class)
    public JAXBElement<CardTypeCharge> createFareSearchOutputCardTypeCharge(CardTypeCharge value) {
        return new JAXBElement<CardTypeCharge>(_FareSearchOutputCardTypeCharge_QNAME, CardTypeCharge.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "codTadmImpu", scope = FareSearchOutput.class)
    public JAXBElement<String> createFareSearchOutputCodTadmImpu(String value) {
        return new JAXBElement<String>(_FareSearchOutputCodTadmImpu_QNAME, String.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "insuranceData", scope = FareSearchOutput.class)
    public JAXBElement<InsuranceData> createFareSearchOutputInsuranceData(InsuranceData value) {
        return new JAXBElement<InsuranceData>(_FareSearchOutputInsuranceData_QNAME, InsuranceData.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "info", scope = FareSearchOutput.class)
    public JAXBElement<String> createFareSearchOutputInfo(String value) {
        return new JAXBElement<String>(_FareSearchOutputInfo_QNAME, String.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "miniMod", scope = FareSearchOutput.class)
    public JAXBElement<Double> createFareSearchOutputMiniMod(Double value) {
        return new JAXBElement<Double>(_FareSearchOutputMiniMod_QNAME, Double.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "totalChargesAmount", scope = FareSearchOutput.class)
    public JAXBElement<Double> createFareSearchOutputTotalChargesAmount(Double value) {
        return new JAXBElement<Double>(_FareSearchOutputTotalChargesAmount_QNAME, Double.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "header", scope = FareSearchOutput.class)
    public JAXBElement<Header> createFareSearchOutputHeader(Header value) {
        return new JAXBElement<Header>(_FareSearchOutputHeader_QNAME, Header.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "correlationId", scope = FareSearchOutput.class)
    public JAXBElement<String> createFareSearchOutputCorrelationId(String value) {
        return new JAXBElement<String>(_FareSearchOutputCorrelationId_QNAME, String.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "managementFees", scope = FareSearchOutput.class)
    public JAXBElement<Double> createFareSearchOutputManagementFees(Double value) {
        return new JAXBElement<Double>(_FareSearchOutputManagementFees_QNAME, Double.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "colaboratorFeeAmount", scope = FareSearchOutput.class)
    public JAXBElement<Double> createFareSearchOutputColaboratorFeeAmount(Double value) {
        return new JAXBElement<Double>(_FareSearchOutputColaboratorFeeAmount_QNAME, Double.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "descInfo", scope = FareSearchOutput.class)
    public JAXBElement<String> createFareSearchOutputDescInfo(String value) {
        return new JAXBElement<String>(_FareSearchOutputDescInfo_QNAME, String.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "operatingBrand", scope = FareSearchOutput.class)
    public JAXBElement<String> createFareSearchOutputOperatingBrand(String value) {
        return new JAXBElement<String>(_FareSearchOutputOperatingBrand_QNAME, String.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "product", scope = FareSearchOutput.class)
    public JAXBElement<String> createFareSearchOutputProduct(String value) {
        return new JAXBElement<String>(_FareSearchOutputProduct_QNAME, String.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "errorMessage", scope = FareSearchOutput.class)
    public JAXBElement<String> createFareSearchOutputErrorMessage(String value) {
        return new JAXBElement<String>(_FareSearchOutputErrorMessage_QNAME, String.class, FareSearchOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "mandatoryData", scope = FareSearchOutput.class)
    public JAXBElement<String> createFareSearchOutputMandatoryData(String value) {
        return new JAXBElement<String>(_FareSearchOutputMandatoryData_QNAME, String.class, FareSearchOutput.class, value);
    }

}
