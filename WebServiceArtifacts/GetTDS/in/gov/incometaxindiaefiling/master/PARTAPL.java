
package in.gov.incometaxindiaefiling.master;

import java.math.BigInteger;
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
 *         &lt;element name="CreditsToPL">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BusinessReceipts">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}ExciseCustomsVAT"/>
 *                   &lt;element name="OthIncome">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RentInc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Comissions">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Dividends">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="InterestInc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ProfitOnSaleFixedAsset">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ProfitOnInvChrSTT">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ProfitOnOthInv">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ProfitOnCurrFluct">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ProfitOnAgriIncome">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="MiscOthIncome">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TotOthIncome">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ClosingStock">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotCreditsToPL">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DebitsToPL">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OpeningStock">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Purchases">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DutyTaxPay">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://incometaxindiaefiling.gov.in/master}ExciseCustomsVAT"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Freight">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ConsumptionOfStores">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PowerFuel">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RentExpdr">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RepairsBldg">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RepairMach">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="EmployeeComp">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SalsWages">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Bonus">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="MedExpReimb">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="LeaveEncash">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="LeaveTravelBenft">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ContToSuperAnnFund">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ContToPF">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ContToGratFund">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ContToOthFund">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OthEmpBenftExpdr">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TotEmployeeComp">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Insurances">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MedInsur">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="LifeInsur">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="KeyManInsur">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OthInsur">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TotInsurances">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="StaffWelfareExp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Entertainment">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Hospitality">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Conference">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SalePromoExp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Advertisement">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CommissionExpdr">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="HotelBoardLodge">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TravelExp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ConveyanceExp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TelephoneExp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GuestHouseExp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ClubExp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FestivalCelebExp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Scholarship">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Gift">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Donation">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RatesTaxesPays">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://incometaxindiaefiling.gov.in/master}ExciseCustomsVAT"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AuditFee">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OtherExpenses">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BadDebt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ProvForBadDoubtDebt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OthProvisionsExpdr">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PBIDTA">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="InterestExpdr">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DepreciationAmort">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PBT">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TaxProvAppr">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProvForCurrTax">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ProvDefTax">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ProfitAfterTax">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BalBFPrevYr">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AmtAvlAppr">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TrfToReserves">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ProprietorAccBalTrf">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NoBooksOfAccPL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GrossReceipt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GrossProfit">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Expenses">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NetProfit">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
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
    "creditsToPL",
    "debitsToPL",
    "taxProvAppr",
    "noBooksOfAccPL"
})
@XmlRootElement(name = "PARTA_PL")
public class PARTAPL {

    @XmlElement(name = "CreditsToPL", required = true)
    protected PARTAPL.CreditsToPL creditsToPL;
    @XmlElement(name = "DebitsToPL", required = true)
    protected PARTAPL.DebitsToPL debitsToPL;
    @XmlElement(name = "TaxProvAppr", required = true)
    protected PARTAPL.TaxProvAppr taxProvAppr;
    @XmlElement(name = "NoBooksOfAccPL")
    protected PARTAPL.NoBooksOfAccPL noBooksOfAccPL;

    /**
     * Gets the value of the creditsToPL property.
     * 
     * @return
     *     possible object is
     *     {@link PARTAPL.CreditsToPL }
     *     
     */
    public PARTAPL.CreditsToPL getCreditsToPL() {
        return creditsToPL;
    }

    /**
     * Sets the value of the creditsToPL property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTAPL.CreditsToPL }
     *     
     */
    public void setCreditsToPL(PARTAPL.CreditsToPL value) {
        this.creditsToPL = value;
    }

    /**
     * Gets the value of the debitsToPL property.
     * 
     * @return
     *     possible object is
     *     {@link PARTAPL.DebitsToPL }
     *     
     */
    public PARTAPL.DebitsToPL getDebitsToPL() {
        return debitsToPL;
    }

    /**
     * Sets the value of the debitsToPL property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTAPL.DebitsToPL }
     *     
     */
    public void setDebitsToPL(PARTAPL.DebitsToPL value) {
        this.debitsToPL = value;
    }

    /**
     * Gets the value of the taxProvAppr property.
     * 
     * @return
     *     possible object is
     *     {@link PARTAPL.TaxProvAppr }
     *     
     */
    public PARTAPL.TaxProvAppr getTaxProvAppr() {
        return taxProvAppr;
    }

    /**
     * Sets the value of the taxProvAppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTAPL.TaxProvAppr }
     *     
     */
    public void setTaxProvAppr(PARTAPL.TaxProvAppr value) {
        this.taxProvAppr = value;
    }

    /**
     * Gets the value of the noBooksOfAccPL property.
     * 
     * @return
     *     possible object is
     *     {@link PARTAPL.NoBooksOfAccPL }
     *     
     */
    public PARTAPL.NoBooksOfAccPL getNoBooksOfAccPL() {
        return noBooksOfAccPL;
    }

    /**
     * Sets the value of the noBooksOfAccPL property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTAPL.NoBooksOfAccPL }
     *     
     */
    public void setNoBooksOfAccPL(PARTAPL.NoBooksOfAccPL value) {
        this.noBooksOfAccPL = value;
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
     *         &lt;element name="BusinessReceipts">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}ExciseCustomsVAT"/>
     *         &lt;element name="OthIncome">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RentInc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Comissions">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Dividends">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="InterestInc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ProfitOnSaleFixedAsset">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ProfitOnInvChrSTT">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ProfitOnOthInv">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ProfitOnCurrFluct">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ProfitOnAgriIncome">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="MiscOthIncome">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TotOthIncome">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ClosingStock">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotCreditsToPL">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
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
        "businessReceipts",
        "exciseCustomsVAT",
        "othIncome",
        "closingStock",
        "totCreditsToPL"
    })
    public static class CreditsToPL {

        @XmlElement(name = "BusinessReceipts", required = true, defaultValue = "0")
        protected BigInteger businessReceipts;
        @XmlElement(name = "ExciseCustomsVAT", required = true)
        protected ExciseCustomsVAT exciseCustomsVAT;
        @XmlElement(name = "OthIncome", required = true)
        protected PARTAPL.CreditsToPL.OthIncome othIncome;
        @XmlElement(name = "ClosingStock", required = true, defaultValue = "0")
        protected BigInteger closingStock;
        @XmlElement(name = "TotCreditsToPL", defaultValue = "0")
        protected long totCreditsToPL;

        /**
         * Gets the value of the businessReceipts property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBusinessReceipts() {
            return businessReceipts;
        }

        /**
         * Sets the value of the businessReceipts property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBusinessReceipts(BigInteger value) {
            this.businessReceipts = value;
        }

        /**
         * Gets the value of the exciseCustomsVAT property.
         * 
         * @return
         *     possible object is
         *     {@link ExciseCustomsVAT }
         *     
         */
        public ExciseCustomsVAT getExciseCustomsVAT() {
            return exciseCustomsVAT;
        }

        /**
         * Sets the value of the exciseCustomsVAT property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExciseCustomsVAT }
         *     
         */
        public void setExciseCustomsVAT(ExciseCustomsVAT value) {
            this.exciseCustomsVAT = value;
        }

        /**
         * Gets the value of the othIncome property.
         * 
         * @return
         *     possible object is
         *     {@link PARTAPL.CreditsToPL.OthIncome }
         *     
         */
        public PARTAPL.CreditsToPL.OthIncome getOthIncome() {
            return othIncome;
        }

        /**
         * Sets the value of the othIncome property.
         * 
         * @param value
         *     allowed object is
         *     {@link PARTAPL.CreditsToPL.OthIncome }
         *     
         */
        public void setOthIncome(PARTAPL.CreditsToPL.OthIncome value) {
            this.othIncome = value;
        }

        /**
         * Gets the value of the closingStock property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getClosingStock() {
            return closingStock;
        }

        /**
         * Sets the value of the closingStock property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setClosingStock(BigInteger value) {
            this.closingStock = value;
        }

        /**
         * Gets the value of the totCreditsToPL property.
         * 
         */
        public long getTotCreditsToPL() {
            return totCreditsToPL;
        }

        /**
         * Sets the value of the totCreditsToPL property.
         * 
         */
        public void setTotCreditsToPL(long value) {
            this.totCreditsToPL = value;
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
         *         &lt;element name="RentInc">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Comissions">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Dividends">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="InterestInc">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ProfitOnSaleFixedAsset">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ProfitOnInvChrSTT">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ProfitOnOthInv">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ProfitOnCurrFluct">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ProfitOnAgriIncome">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="MiscOthIncome">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TotOthIncome">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *               &lt;totalDigits value="14"/>
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
            "rentInc",
            "comissions",
            "dividends",
            "interestInc",
            "profitOnSaleFixedAsset",
            "profitOnInvChrSTT",
            "profitOnOthInv",
            "profitOnCurrFluct",
            "profitOnAgriIncome",
            "miscOthIncome",
            "totOthIncome"
        })
        public static class OthIncome {

            @XmlElement(name = "RentInc", required = true, defaultValue = "0")
            protected BigInteger rentInc;
            @XmlElement(name = "Comissions", required = true, defaultValue = "0")
            protected BigInteger comissions;
            @XmlElement(name = "Dividends", required = true, defaultValue = "0")
            protected BigInteger dividends;
            @XmlElement(name = "InterestInc", required = true, defaultValue = "0")
            protected BigInteger interestInc;
            @XmlElement(name = "ProfitOnSaleFixedAsset", defaultValue = "0")
            protected long profitOnSaleFixedAsset;
            @XmlElement(name = "ProfitOnInvChrSTT", defaultValue = "0")
            protected long profitOnInvChrSTT;
            @XmlElement(name = "ProfitOnOthInv", defaultValue = "0")
            protected long profitOnOthInv;
            @XmlElement(name = "ProfitOnCurrFluct", defaultValue = "0")
            protected long profitOnCurrFluct;
            @XmlElement(name = "ProfitOnAgriIncome", defaultValue = "0")
            protected long profitOnAgriIncome;
            @XmlElement(name = "MiscOthIncome", defaultValue = "0")
            protected long miscOthIncome;
            @XmlElement(name = "TotOthIncome", defaultValue = "0")
            protected long totOthIncome;

            /**
             * Gets the value of the rentInc property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRentInc() {
                return rentInc;
            }

            /**
             * Sets the value of the rentInc property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRentInc(BigInteger value) {
                this.rentInc = value;
            }

            /**
             * Gets the value of the comissions property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getComissions() {
                return comissions;
            }

            /**
             * Sets the value of the comissions property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setComissions(BigInteger value) {
                this.comissions = value;
            }

            /**
             * Gets the value of the dividends property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDividends() {
                return dividends;
            }

            /**
             * Sets the value of the dividends property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDividends(BigInteger value) {
                this.dividends = value;
            }

            /**
             * Gets the value of the interestInc property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getInterestInc() {
                return interestInc;
            }

            /**
             * Sets the value of the interestInc property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setInterestInc(BigInteger value) {
                this.interestInc = value;
            }

            /**
             * Gets the value of the profitOnSaleFixedAsset property.
             * 
             */
            public long getProfitOnSaleFixedAsset() {
                return profitOnSaleFixedAsset;
            }

            /**
             * Sets the value of the profitOnSaleFixedAsset property.
             * 
             */
            public void setProfitOnSaleFixedAsset(long value) {
                this.profitOnSaleFixedAsset = value;
            }

            /**
             * Gets the value of the profitOnInvChrSTT property.
             * 
             */
            public long getProfitOnInvChrSTT() {
                return profitOnInvChrSTT;
            }

            /**
             * Sets the value of the profitOnInvChrSTT property.
             * 
             */
            public void setProfitOnInvChrSTT(long value) {
                this.profitOnInvChrSTT = value;
            }

            /**
             * Gets the value of the profitOnOthInv property.
             * 
             */
            public long getProfitOnOthInv() {
                return profitOnOthInv;
            }

            /**
             * Sets the value of the profitOnOthInv property.
             * 
             */
            public void setProfitOnOthInv(long value) {
                this.profitOnOthInv = value;
            }

            /**
             * Gets the value of the profitOnCurrFluct property.
             * 
             */
            public long getProfitOnCurrFluct() {
                return profitOnCurrFluct;
            }

            /**
             * Sets the value of the profitOnCurrFluct property.
             * 
             */
            public void setProfitOnCurrFluct(long value) {
                this.profitOnCurrFluct = value;
            }

            /**
             * Gets the value of the profitOnAgriIncome property.
             * 
             */
            public long getProfitOnAgriIncome() {
                return profitOnAgriIncome;
            }

            /**
             * Sets the value of the profitOnAgriIncome property.
             * 
             */
            public void setProfitOnAgriIncome(long value) {
                this.profitOnAgriIncome = value;
            }

            /**
             * Gets the value of the miscOthIncome property.
             * 
             */
            public long getMiscOthIncome() {
                return miscOthIncome;
            }

            /**
             * Sets the value of the miscOthIncome property.
             * 
             */
            public void setMiscOthIncome(long value) {
                this.miscOthIncome = value;
            }

            /**
             * Gets the value of the totOthIncome property.
             * 
             */
            public long getTotOthIncome() {
                return totOthIncome;
            }

            /**
             * Sets the value of the totOthIncome property.
             * 
             */
            public void setTotOthIncome(long value) {
                this.totOthIncome = value;
            }

        }

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
     *         &lt;element name="OpeningStock">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Purchases">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DutyTaxPay">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}ExciseCustomsVAT"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Freight">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ConsumptionOfStores">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PowerFuel">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RentExpdr">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RepairsBldg">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RepairMach">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="EmployeeComp">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SalsWages">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Bonus">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="MedExpReimb">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="LeaveEncash">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="LeaveTravelBenft">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ContToSuperAnnFund">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ContToPF">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ContToGratFund">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ContToOthFund">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="OthEmpBenftExpdr">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TotEmployeeComp">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Insurances">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MedInsur">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="LifeInsur">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="KeyManInsur">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="OthInsur">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TotInsurances">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="StaffWelfareExp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Entertainment">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Hospitality">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Conference">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SalePromoExp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Advertisement">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CommissionExpdr">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="HotelBoardLodge">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TravelExp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ConveyanceExp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TelephoneExp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GuestHouseExp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ClubExp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FestivalCelebExp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Scholarship">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Gift">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Donation">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RatesTaxesPays">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}ExciseCustomsVAT"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AuditFee">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OtherExpenses">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BadDebt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ProvForBadDoubtDebt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OthProvisionsExpdr">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PBIDTA">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="InterestExpdr">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DepreciationAmort">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PBT">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
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
        "openingStock",
        "purchases",
        "dutyTaxPay",
        "freight",
        "consumptionOfStores",
        "powerFuel",
        "rentExpdr",
        "repairsBldg",
        "repairMach",
        "employeeComp",
        "insurances",
        "staffWelfareExp",
        "entertainment",
        "hospitality",
        "conference",
        "salePromoExp",
        "advertisement",
        "commissionExpdr",
        "hotelBoardLodge",
        "travelExp",
        "conveyanceExp",
        "telephoneExp",
        "guestHouseExp",
        "clubExp",
        "festivalCelebExp",
        "scholarship",
        "gift",
        "donation",
        "ratesTaxesPays",
        "auditFee",
        "otherExpenses",
        "badDebt",
        "provForBadDoubtDebt",
        "othProvisionsExpdr",
        "pbidta",
        "interestExpdr",
        "depreciationAmort",
        "pbt"
    })
    public static class DebitsToPL {

        @XmlElement(name = "OpeningStock", required = true, defaultValue = "0")
        protected BigInteger openingStock;
        @XmlElement(name = "Purchases", required = true, defaultValue = "0")
        protected BigInteger purchases;
        @XmlElement(name = "DutyTaxPay", required = true)
        protected PARTAPL.DebitsToPL.DutyTaxPay dutyTaxPay;
        @XmlElement(name = "Freight", required = true, defaultValue = "0")
        protected BigInteger freight;
        @XmlElement(name = "ConsumptionOfStores", required = true, defaultValue = "0")
        protected BigInteger consumptionOfStores;
        @XmlElement(name = "PowerFuel", required = true, defaultValue = "0")
        protected BigInteger powerFuel;
        @XmlElement(name = "RentExpdr", required = true, defaultValue = "0")
        protected BigInteger rentExpdr;
        @XmlElement(name = "RepairsBldg", required = true, defaultValue = "0")
        protected BigInteger repairsBldg;
        @XmlElement(name = "RepairMach", required = true, defaultValue = "0")
        protected BigInteger repairMach;
        @XmlElement(name = "EmployeeComp", required = true)
        protected PARTAPL.DebitsToPL.EmployeeComp employeeComp;
        @XmlElement(name = "Insurances", required = true)
        protected PARTAPL.DebitsToPL.Insurances insurances;
        @XmlElement(name = "StaffWelfareExp", required = true, defaultValue = "0")
        protected BigInteger staffWelfareExp;
        @XmlElement(name = "Entertainment", required = true, defaultValue = "0")
        protected BigInteger entertainment;
        @XmlElement(name = "Hospitality", required = true, defaultValue = "0")
        protected BigInteger hospitality;
        @XmlElement(name = "Conference", required = true, defaultValue = "0")
        protected BigInteger conference;
        @XmlElement(name = "SalePromoExp", required = true, defaultValue = "0")
        protected BigInteger salePromoExp;
        @XmlElement(name = "Advertisement", required = true, defaultValue = "0")
        protected BigInteger advertisement;
        @XmlElement(name = "CommissionExpdr", required = true, defaultValue = "0")
        protected BigInteger commissionExpdr;
        @XmlElement(name = "HotelBoardLodge", required = true, defaultValue = "0")
        protected BigInteger hotelBoardLodge;
        @XmlElement(name = "TravelExp", required = true, defaultValue = "0")
        protected BigInteger travelExp;
        @XmlElement(name = "ConveyanceExp", required = true, defaultValue = "0")
        protected BigInteger conveyanceExp;
        @XmlElement(name = "TelephoneExp", required = true, defaultValue = "0")
        protected BigInteger telephoneExp;
        @XmlElement(name = "GuestHouseExp", required = true, defaultValue = "0")
        protected BigInteger guestHouseExp;
        @XmlElement(name = "ClubExp", required = true, defaultValue = "0")
        protected BigInteger clubExp;
        @XmlElement(name = "FestivalCelebExp", required = true, defaultValue = "0")
        protected BigInteger festivalCelebExp;
        @XmlElement(name = "Scholarship", required = true, defaultValue = "0")
        protected BigInteger scholarship;
        @XmlElement(name = "Gift", required = true, defaultValue = "0")
        protected BigInteger gift;
        @XmlElement(name = "Donation", required = true, defaultValue = "0")
        protected BigInteger donation;
        @XmlElement(name = "RatesTaxesPays", required = true)
        protected PARTAPL.DebitsToPL.RatesTaxesPays ratesTaxesPays;
        @XmlElement(name = "AuditFee", required = true, defaultValue = "0")
        protected BigInteger auditFee;
        @XmlElement(name = "OtherExpenses", required = true, defaultValue = "0")
        protected BigInteger otherExpenses;
        @XmlElement(name = "BadDebt", required = true, defaultValue = "0")
        protected BigInteger badDebt;
        @XmlElement(name = "ProvForBadDoubtDebt", defaultValue = "0")
        protected long provForBadDoubtDebt;
        @XmlElement(name = "OthProvisionsExpdr", defaultValue = "0")
        protected long othProvisionsExpdr;
        @XmlElement(name = "PBIDTA", defaultValue = "0")
        protected long pbidta;
        @XmlElement(name = "InterestExpdr", required = true, defaultValue = "0")
        protected BigInteger interestExpdr;
        @XmlElement(name = "DepreciationAmort", required = true, defaultValue = "0")
        protected BigInteger depreciationAmort;
        @XmlElement(name = "PBT", defaultValue = "0")
        protected long pbt;

        /**
         * Gets the value of the openingStock property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOpeningStock() {
            return openingStock;
        }

        /**
         * Sets the value of the openingStock property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOpeningStock(BigInteger value) {
            this.openingStock = value;
        }

        /**
         * Gets the value of the purchases property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPurchases() {
            return purchases;
        }

        /**
         * Sets the value of the purchases property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPurchases(BigInteger value) {
            this.purchases = value;
        }

        /**
         * Gets the value of the dutyTaxPay property.
         * 
         * @return
         *     possible object is
         *     {@link PARTAPL.DebitsToPL.DutyTaxPay }
         *     
         */
        public PARTAPL.DebitsToPL.DutyTaxPay getDutyTaxPay() {
            return dutyTaxPay;
        }

        /**
         * Sets the value of the dutyTaxPay property.
         * 
         * @param value
         *     allowed object is
         *     {@link PARTAPL.DebitsToPL.DutyTaxPay }
         *     
         */
        public void setDutyTaxPay(PARTAPL.DebitsToPL.DutyTaxPay value) {
            this.dutyTaxPay = value;
        }

        /**
         * Gets the value of the freight property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFreight() {
            return freight;
        }

        /**
         * Sets the value of the freight property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFreight(BigInteger value) {
            this.freight = value;
        }

        /**
         * Gets the value of the consumptionOfStores property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getConsumptionOfStores() {
            return consumptionOfStores;
        }

        /**
         * Sets the value of the consumptionOfStores property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setConsumptionOfStores(BigInteger value) {
            this.consumptionOfStores = value;
        }

        /**
         * Gets the value of the powerFuel property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPowerFuel() {
            return powerFuel;
        }

        /**
         * Sets the value of the powerFuel property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPowerFuel(BigInteger value) {
            this.powerFuel = value;
        }

        /**
         * Gets the value of the rentExpdr property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRentExpdr() {
            return rentExpdr;
        }

        /**
         * Sets the value of the rentExpdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRentExpdr(BigInteger value) {
            this.rentExpdr = value;
        }

        /**
         * Gets the value of the repairsBldg property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRepairsBldg() {
            return repairsBldg;
        }

        /**
         * Sets the value of the repairsBldg property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRepairsBldg(BigInteger value) {
            this.repairsBldg = value;
        }

        /**
         * Gets the value of the repairMach property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRepairMach() {
            return repairMach;
        }

        /**
         * Sets the value of the repairMach property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRepairMach(BigInteger value) {
            this.repairMach = value;
        }

        /**
         * Gets the value of the employeeComp property.
         * 
         * @return
         *     possible object is
         *     {@link PARTAPL.DebitsToPL.EmployeeComp }
         *     
         */
        public PARTAPL.DebitsToPL.EmployeeComp getEmployeeComp() {
            return employeeComp;
        }

        /**
         * Sets the value of the employeeComp property.
         * 
         * @param value
         *     allowed object is
         *     {@link PARTAPL.DebitsToPL.EmployeeComp }
         *     
         */
        public void setEmployeeComp(PARTAPL.DebitsToPL.EmployeeComp value) {
            this.employeeComp = value;
        }

        /**
         * Gets the value of the insurances property.
         * 
         * @return
         *     possible object is
         *     {@link PARTAPL.DebitsToPL.Insurances }
         *     
         */
        public PARTAPL.DebitsToPL.Insurances getInsurances() {
            return insurances;
        }

        /**
         * Sets the value of the insurances property.
         * 
         * @param value
         *     allowed object is
         *     {@link PARTAPL.DebitsToPL.Insurances }
         *     
         */
        public void setInsurances(PARTAPL.DebitsToPL.Insurances value) {
            this.insurances = value;
        }

        /**
         * Gets the value of the staffWelfareExp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStaffWelfareExp() {
            return staffWelfareExp;
        }

        /**
         * Sets the value of the staffWelfareExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStaffWelfareExp(BigInteger value) {
            this.staffWelfareExp = value;
        }

        /**
         * Gets the value of the entertainment property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEntertainment() {
            return entertainment;
        }

        /**
         * Sets the value of the entertainment property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEntertainment(BigInteger value) {
            this.entertainment = value;
        }

        /**
         * Gets the value of the hospitality property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHospitality() {
            return hospitality;
        }

        /**
         * Sets the value of the hospitality property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHospitality(BigInteger value) {
            this.hospitality = value;
        }

        /**
         * Gets the value of the conference property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getConference() {
            return conference;
        }

        /**
         * Sets the value of the conference property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setConference(BigInteger value) {
            this.conference = value;
        }

        /**
         * Gets the value of the salePromoExp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSalePromoExp() {
            return salePromoExp;
        }

        /**
         * Sets the value of the salePromoExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSalePromoExp(BigInteger value) {
            this.salePromoExp = value;
        }

        /**
         * Gets the value of the advertisement property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAdvertisement() {
            return advertisement;
        }

        /**
         * Sets the value of the advertisement property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAdvertisement(BigInteger value) {
            this.advertisement = value;
        }

        /**
         * Gets the value of the commissionExpdr property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCommissionExpdr() {
            return commissionExpdr;
        }

        /**
         * Sets the value of the commissionExpdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCommissionExpdr(BigInteger value) {
            this.commissionExpdr = value;
        }

        /**
         * Gets the value of the hotelBoardLodge property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHotelBoardLodge() {
            return hotelBoardLodge;
        }

        /**
         * Sets the value of the hotelBoardLodge property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHotelBoardLodge(BigInteger value) {
            this.hotelBoardLodge = value;
        }

        /**
         * Gets the value of the travelExp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTravelExp() {
            return travelExp;
        }

        /**
         * Sets the value of the travelExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTravelExp(BigInteger value) {
            this.travelExp = value;
        }

        /**
         * Gets the value of the conveyanceExp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getConveyanceExp() {
            return conveyanceExp;
        }

        /**
         * Sets the value of the conveyanceExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setConveyanceExp(BigInteger value) {
            this.conveyanceExp = value;
        }

        /**
         * Gets the value of the telephoneExp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTelephoneExp() {
            return telephoneExp;
        }

        /**
         * Sets the value of the telephoneExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTelephoneExp(BigInteger value) {
            this.telephoneExp = value;
        }

        /**
         * Gets the value of the guestHouseExp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getGuestHouseExp() {
            return guestHouseExp;
        }

        /**
         * Sets the value of the guestHouseExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setGuestHouseExp(BigInteger value) {
            this.guestHouseExp = value;
        }

        /**
         * Gets the value of the clubExp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getClubExp() {
            return clubExp;
        }

        /**
         * Sets the value of the clubExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setClubExp(BigInteger value) {
            this.clubExp = value;
        }

        /**
         * Gets the value of the festivalCelebExp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFestivalCelebExp() {
            return festivalCelebExp;
        }

        /**
         * Sets the value of the festivalCelebExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFestivalCelebExp(BigInteger value) {
            this.festivalCelebExp = value;
        }

        /**
         * Gets the value of the scholarship property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getScholarship() {
            return scholarship;
        }

        /**
         * Sets the value of the scholarship property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setScholarship(BigInteger value) {
            this.scholarship = value;
        }

        /**
         * Gets the value of the gift property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getGift() {
            return gift;
        }

        /**
         * Sets the value of the gift property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setGift(BigInteger value) {
            this.gift = value;
        }

        /**
         * Gets the value of the donation property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDonation() {
            return donation;
        }

        /**
         * Sets the value of the donation property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDonation(BigInteger value) {
            this.donation = value;
        }

        /**
         * Gets the value of the ratesTaxesPays property.
         * 
         * @return
         *     possible object is
         *     {@link PARTAPL.DebitsToPL.RatesTaxesPays }
         *     
         */
        public PARTAPL.DebitsToPL.RatesTaxesPays getRatesTaxesPays() {
            return ratesTaxesPays;
        }

        /**
         * Sets the value of the ratesTaxesPays property.
         * 
         * @param value
         *     allowed object is
         *     {@link PARTAPL.DebitsToPL.RatesTaxesPays }
         *     
         */
        public void setRatesTaxesPays(PARTAPL.DebitsToPL.RatesTaxesPays value) {
            this.ratesTaxesPays = value;
        }

        /**
         * Gets the value of the auditFee property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAuditFee() {
            return auditFee;
        }

        /**
         * Sets the value of the auditFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAuditFee(BigInteger value) {
            this.auditFee = value;
        }

        /**
         * Gets the value of the otherExpenses property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOtherExpenses() {
            return otherExpenses;
        }

        /**
         * Sets the value of the otherExpenses property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOtherExpenses(BigInteger value) {
            this.otherExpenses = value;
        }

        /**
         * Gets the value of the badDebt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBadDebt() {
            return badDebt;
        }

        /**
         * Sets the value of the badDebt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBadDebt(BigInteger value) {
            this.badDebt = value;
        }

        /**
         * Gets the value of the provForBadDoubtDebt property.
         * 
         */
        public long getProvForBadDoubtDebt() {
            return provForBadDoubtDebt;
        }

        /**
         * Sets the value of the provForBadDoubtDebt property.
         * 
         */
        public void setProvForBadDoubtDebt(long value) {
            this.provForBadDoubtDebt = value;
        }

        /**
         * Gets the value of the othProvisionsExpdr property.
         * 
         */
        public long getOthProvisionsExpdr() {
            return othProvisionsExpdr;
        }

        /**
         * Sets the value of the othProvisionsExpdr property.
         * 
         */
        public void setOthProvisionsExpdr(long value) {
            this.othProvisionsExpdr = value;
        }

        /**
         * Gets the value of the pbidta property.
         * 
         */
        public long getPBIDTA() {
            return pbidta;
        }

        /**
         * Sets the value of the pbidta property.
         * 
         */
        public void setPBIDTA(long value) {
            this.pbidta = value;
        }

        /**
         * Gets the value of the interestExpdr property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getInterestExpdr() {
            return interestExpdr;
        }

        /**
         * Sets the value of the interestExpdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setInterestExpdr(BigInteger value) {
            this.interestExpdr = value;
        }

        /**
         * Gets the value of the depreciationAmort property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDepreciationAmort() {
            return depreciationAmort;
        }

        /**
         * Sets the value of the depreciationAmort property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDepreciationAmort(BigInteger value) {
            this.depreciationAmort = value;
        }

        /**
         * Gets the value of the pbt property.
         * 
         */
        public long getPBT() {
            return pbt;
        }

        /**
         * Sets the value of the pbt property.
         * 
         */
        public void setPBT(long value) {
            this.pbt = value;
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
         *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}ExciseCustomsVAT"/>
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
            "exciseCustomsVAT"
        })
        public static class DutyTaxPay {

            @XmlElement(name = "ExciseCustomsVAT", required = true)
            protected ExciseCustomsVAT exciseCustomsVAT;

            /**
             * Gets the value of the exciseCustomsVAT property.
             * 
             * @return
             *     possible object is
             *     {@link ExciseCustomsVAT }
             *     
             */
            public ExciseCustomsVAT getExciseCustomsVAT() {
                return exciseCustomsVAT;
            }

            /**
             * Sets the value of the exciseCustomsVAT property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExciseCustomsVAT }
             *     
             */
            public void setExciseCustomsVAT(ExciseCustomsVAT value) {
                this.exciseCustomsVAT = value;
            }

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
         *         &lt;element name="SalsWages">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Bonus">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="MedExpReimb">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="LeaveEncash">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="LeaveTravelBenft">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ContToSuperAnnFund">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ContToPF">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ContToGratFund">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ContToOthFund">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="OthEmpBenftExpdr">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TotEmployeeComp">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
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
            "salsWages",
            "bonus",
            "medExpReimb",
            "leaveEncash",
            "leaveTravelBenft",
            "contToSuperAnnFund",
            "contToPF",
            "contToGratFund",
            "contToOthFund",
            "othEmpBenftExpdr",
            "totEmployeeComp"
        })
        public static class EmployeeComp {

            @XmlElement(name = "SalsWages", required = true, defaultValue = "0")
            protected BigInteger salsWages;
            @XmlElement(name = "Bonus", required = true, defaultValue = "0")
            protected BigInteger bonus;
            @XmlElement(name = "MedExpReimb", required = true, defaultValue = "0")
            protected BigInteger medExpReimb;
            @XmlElement(name = "LeaveEncash", required = true, defaultValue = "0")
            protected BigInteger leaveEncash;
            @XmlElement(name = "LeaveTravelBenft", required = true, defaultValue = "0")
            protected BigInteger leaveTravelBenft;
            @XmlElement(name = "ContToSuperAnnFund", required = true, defaultValue = "0")
            protected BigInteger contToSuperAnnFund;
            @XmlElement(name = "ContToPF", required = true, defaultValue = "0")
            protected BigInteger contToPF;
            @XmlElement(name = "ContToGratFund", required = true, defaultValue = "0")
            protected BigInteger contToGratFund;
            @XmlElement(name = "ContToOthFund", required = true, defaultValue = "0")
            protected BigInteger contToOthFund;
            @XmlElement(name = "OthEmpBenftExpdr", required = true, defaultValue = "0")
            protected BigInteger othEmpBenftExpdr;
            @XmlElement(name = "TotEmployeeComp", required = true, defaultValue = "0")
            protected BigInteger totEmployeeComp;

            /**
             * Gets the value of the salsWages property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSalsWages() {
                return salsWages;
            }

            /**
             * Sets the value of the salsWages property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSalsWages(BigInteger value) {
                this.salsWages = value;
            }

            /**
             * Gets the value of the bonus property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getBonus() {
                return bonus;
            }

            /**
             * Sets the value of the bonus property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setBonus(BigInteger value) {
                this.bonus = value;
            }

            /**
             * Gets the value of the medExpReimb property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMedExpReimb() {
                return medExpReimb;
            }

            /**
             * Sets the value of the medExpReimb property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMedExpReimb(BigInteger value) {
                this.medExpReimb = value;
            }

            /**
             * Gets the value of the leaveEncash property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLeaveEncash() {
                return leaveEncash;
            }

            /**
             * Sets the value of the leaveEncash property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLeaveEncash(BigInteger value) {
                this.leaveEncash = value;
            }

            /**
             * Gets the value of the leaveTravelBenft property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLeaveTravelBenft() {
                return leaveTravelBenft;
            }

            /**
             * Sets the value of the leaveTravelBenft property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLeaveTravelBenft(BigInteger value) {
                this.leaveTravelBenft = value;
            }

            /**
             * Gets the value of the contToSuperAnnFund property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getContToSuperAnnFund() {
                return contToSuperAnnFund;
            }

            /**
             * Sets the value of the contToSuperAnnFund property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setContToSuperAnnFund(BigInteger value) {
                this.contToSuperAnnFund = value;
            }

            /**
             * Gets the value of the contToPF property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getContToPF() {
                return contToPF;
            }

            /**
             * Sets the value of the contToPF property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setContToPF(BigInteger value) {
                this.contToPF = value;
            }

            /**
             * Gets the value of the contToGratFund property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getContToGratFund() {
                return contToGratFund;
            }

            /**
             * Sets the value of the contToGratFund property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setContToGratFund(BigInteger value) {
                this.contToGratFund = value;
            }

            /**
             * Gets the value of the contToOthFund property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getContToOthFund() {
                return contToOthFund;
            }

            /**
             * Sets the value of the contToOthFund property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setContToOthFund(BigInteger value) {
                this.contToOthFund = value;
            }

            /**
             * Gets the value of the othEmpBenftExpdr property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getOthEmpBenftExpdr() {
                return othEmpBenftExpdr;
            }

            /**
             * Sets the value of the othEmpBenftExpdr property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setOthEmpBenftExpdr(BigInteger value) {
                this.othEmpBenftExpdr = value;
            }

            /**
             * Gets the value of the totEmployeeComp property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotEmployeeComp() {
                return totEmployeeComp;
            }

            /**
             * Sets the value of the totEmployeeComp property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotEmployeeComp(BigInteger value) {
                this.totEmployeeComp = value;
            }

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
         *         &lt;element name="MedInsur">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="LifeInsur">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="KeyManInsur">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="OthInsur">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TotInsurances">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
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
            "medInsur",
            "lifeInsur",
            "keyManInsur",
            "othInsur",
            "totInsurances"
        })
        public static class Insurances {

            @XmlElement(name = "MedInsur", required = true, defaultValue = "0")
            protected BigInteger medInsur;
            @XmlElement(name = "LifeInsur", required = true, defaultValue = "0")
            protected BigInteger lifeInsur;
            @XmlElement(name = "KeyManInsur", required = true, defaultValue = "0")
            protected BigInteger keyManInsur;
            @XmlElement(name = "OthInsur", required = true, defaultValue = "0")
            protected BigInteger othInsur;
            @XmlElement(name = "TotInsurances", required = true, defaultValue = "0")
            protected BigInteger totInsurances;

            /**
             * Gets the value of the medInsur property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMedInsur() {
                return medInsur;
            }

            /**
             * Sets the value of the medInsur property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMedInsur(BigInteger value) {
                this.medInsur = value;
            }

            /**
             * Gets the value of the lifeInsur property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLifeInsur() {
                return lifeInsur;
            }

            /**
             * Sets the value of the lifeInsur property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLifeInsur(BigInteger value) {
                this.lifeInsur = value;
            }

            /**
             * Gets the value of the keyManInsur property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getKeyManInsur() {
                return keyManInsur;
            }

            /**
             * Sets the value of the keyManInsur property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setKeyManInsur(BigInteger value) {
                this.keyManInsur = value;
            }

            /**
             * Gets the value of the othInsur property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getOthInsur() {
                return othInsur;
            }

            /**
             * Sets the value of the othInsur property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setOthInsur(BigInteger value) {
                this.othInsur = value;
            }

            /**
             * Gets the value of the totInsurances property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotInsurances() {
                return totInsurances;
            }

            /**
             * Sets the value of the totInsurances property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotInsurances(BigInteger value) {
                this.totInsurances = value;
            }

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
         *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}ExciseCustomsVAT"/>
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
            "exciseCustomsVAT"
        })
        public static class RatesTaxesPays {

            @XmlElement(name = "ExciseCustomsVAT", required = true)
            protected ExciseCustomsVAT exciseCustomsVAT;

            /**
             * Gets the value of the exciseCustomsVAT property.
             * 
             * @return
             *     possible object is
             *     {@link ExciseCustomsVAT }
             *     
             */
            public ExciseCustomsVAT getExciseCustomsVAT() {
                return exciseCustomsVAT;
            }

            /**
             * Sets the value of the exciseCustomsVAT property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExciseCustomsVAT }
             *     
             */
            public void setExciseCustomsVAT(ExciseCustomsVAT value) {
                this.exciseCustomsVAT = value;
            }

        }

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
     *         &lt;element name="GrossReceipt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GrossProfit">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Expenses">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NetProfit">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
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
        "grossReceipt",
        "grossProfit",
        "expenses",
        "netProfit"
    })
    public static class NoBooksOfAccPL {

        @XmlElement(name = "GrossReceipt", required = true, defaultValue = "0")
        protected BigInteger grossReceipt;
        @XmlElement(name = "GrossProfit", defaultValue = "0")
        protected long grossProfit;
        @XmlElement(name = "Expenses", required = true, defaultValue = "0")
        protected BigInteger expenses;
        @XmlElement(name = "NetProfit", defaultValue = "0")
        protected long netProfit;

        /**
         * Gets the value of the grossReceipt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getGrossReceipt() {
            return grossReceipt;
        }

        /**
         * Sets the value of the grossReceipt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setGrossReceipt(BigInteger value) {
            this.grossReceipt = value;
        }

        /**
         * Gets the value of the grossProfit property.
         * 
         */
        public long getGrossProfit() {
            return grossProfit;
        }

        /**
         * Sets the value of the grossProfit property.
         * 
         */
        public void setGrossProfit(long value) {
            this.grossProfit = value;
        }

        /**
         * Gets the value of the expenses property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getExpenses() {
            return expenses;
        }

        /**
         * Sets the value of the expenses property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setExpenses(BigInteger value) {
            this.expenses = value;
        }

        /**
         * Gets the value of the netProfit property.
         * 
         */
        public long getNetProfit() {
            return netProfit;
        }

        /**
         * Sets the value of the netProfit property.
         * 
         */
        public void setNetProfit(long value) {
            this.netProfit = value;
        }

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
     *         &lt;element name="ProvForCurrTax">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ProvDefTax">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ProfitAfterTax">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BalBFPrevYr">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AmtAvlAppr">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TrfToReserves">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ProprietorAccBalTrf">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
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
        "provForCurrTax",
        "provDefTax",
        "profitAfterTax",
        "balBFPrevYr",
        "amtAvlAppr",
        "trfToReserves",
        "proprietorAccBalTrf"
    })
    public static class TaxProvAppr {

        @XmlElement(name = "ProvForCurrTax", defaultValue = "0")
        protected long provForCurrTax;
        @XmlElement(name = "ProvDefTax", defaultValue = "0")
        protected long provDefTax;
        @XmlElement(name = "ProfitAfterTax", defaultValue = "0")
        protected long profitAfterTax;
        @XmlElement(name = "BalBFPrevYr", defaultValue = "0")
        protected long balBFPrevYr;
        @XmlElement(name = "AmtAvlAppr", defaultValue = "0")
        protected long amtAvlAppr;
        @XmlElement(name = "TrfToReserves", required = true, defaultValue = "0")
        protected BigInteger trfToReserves;
        @XmlElement(name = "ProprietorAccBalTrf", defaultValue = "0")
        protected long proprietorAccBalTrf;

        /**
         * Gets the value of the provForCurrTax property.
         * 
         */
        public long getProvForCurrTax() {
            return provForCurrTax;
        }

        /**
         * Sets the value of the provForCurrTax property.
         * 
         */
        public void setProvForCurrTax(long value) {
            this.provForCurrTax = value;
        }

        /**
         * Gets the value of the provDefTax property.
         * 
         */
        public long getProvDefTax() {
            return provDefTax;
        }

        /**
         * Sets the value of the provDefTax property.
         * 
         */
        public void setProvDefTax(long value) {
            this.provDefTax = value;
        }

        /**
         * Gets the value of the profitAfterTax property.
         * 
         */
        public long getProfitAfterTax() {
            return profitAfterTax;
        }

        /**
         * Sets the value of the profitAfterTax property.
         * 
         */
        public void setProfitAfterTax(long value) {
            this.profitAfterTax = value;
        }

        /**
         * Gets the value of the balBFPrevYr property.
         * 
         */
        public long getBalBFPrevYr() {
            return balBFPrevYr;
        }

        /**
         * Sets the value of the balBFPrevYr property.
         * 
         */
        public void setBalBFPrevYr(long value) {
            this.balBFPrevYr = value;
        }

        /**
         * Gets the value of the amtAvlAppr property.
         * 
         */
        public long getAmtAvlAppr() {
            return amtAvlAppr;
        }

        /**
         * Sets the value of the amtAvlAppr property.
         * 
         */
        public void setAmtAvlAppr(long value) {
            this.amtAvlAppr = value;
        }

        /**
         * Gets the value of the trfToReserves property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTrfToReserves() {
            return trfToReserves;
        }

        /**
         * Sets the value of the trfToReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTrfToReserves(BigInteger value) {
            this.trfToReserves = value;
        }

        /**
         * Gets the value of the proprietorAccBalTrf property.
         * 
         */
        public long getProprietorAccBalTrf() {
            return proprietorAccBalTrf;
        }

        /**
         * Sets the value of the proprietorAccBalTrf property.
         * 
         */
        public void setProprietorAccBalTrf(long value) {
            this.proprietorAccBalTrf = value;
        }

    }

}
