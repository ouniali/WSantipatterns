
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
 *         &lt;element name="FundSrc">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PropFund">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PropCap">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ResrNSurp">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RevResr">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="CapResr">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="StatResr">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="OthResr">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TotResrNSurp">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TotPropFund">
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
 *                   &lt;element name="LoanFunds">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SecrLoan">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ForeignCurrLoan">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="RupeeLoan">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="FrmBank">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="FrmOthrs">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TotRupeeLoan">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TotSecrLoan">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="UnsecrLoan">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="FrmBank">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="FrmOthrs">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TotUnSecrLoan">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TotLoanFund">
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
 *                   &lt;element name="DeferredTax">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotFundSrc">
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
 *         &lt;element name="FundApply">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FixedAsset">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="GrossBlock">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Depreciation">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="NetBlock">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CapWrkProg">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TotFixedAsset">
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
 *                   &lt;element name="Investments">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LongTermInv">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="GovtOthSecQuoted">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="GovOthSecUnQoted">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TotLongTermInv">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TradeInv">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="EquityShares">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="PreferShares">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Debenture">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TotTradeInv">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TotInvestments">
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
 *                   &lt;element name="CurrAssetLoanAdv">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CurrAsset">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Inventories">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="StoresConsumables">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="RawMatl">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="StkInProcess">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="FinOrTradGood">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TotInventries">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="SndryDebtors">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="CashOrBankBal">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CashinHand">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="BankBal">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TotCashOrBankBal">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="OthCurrAsset">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TotCurrAsset">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LoanAdv">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AdvRecoverable">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Deposits">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="BalWithRevAuth">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TotLoanAdv">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TotCurrAssetLoanAdv">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CurrLiabilitiesProv">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CurrLiabilities">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SundryCred">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="LiabForLeasedAsset">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="AccrIntonLeasedAsset">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="AccrIntNotDue">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TotCurrLiabilities">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Provisions">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ITProvision">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="WTProvision">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ELSuperAnnGratProvision">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="OthProvision">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TotProvisions">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                       &lt;totalDigits value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TotCurrLiabilitiesProvision">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                             &lt;totalDigits value="14"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="NetCurrAsset">
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
 *                   &lt;element name="MiscAdjust">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MiscExpndr">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DefTaxAsset">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AccumaltedLosses">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TotMiscAdjust">
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
 *                   &lt;element name="TotFundApply">
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
 *         &lt;element name="NoBooksOfAccBS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TotSundryDbtAmt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotSundryCrdAmt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotStkInTradAmt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CashBalAmt">
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
    "fundSrc",
    "fundApply",
    "noBooksOfAccBS"
})
@XmlRootElement(name = "PARTA_BS")
public class PARTABS {

    @XmlElement(name = "FundSrc", required = true)
    protected PARTABS.FundSrc fundSrc;
    @XmlElement(name = "FundApply", required = true)
    protected PARTABS.FundApply fundApply;
    @XmlElement(name = "NoBooksOfAccBS")
    protected PARTABS.NoBooksOfAccBS noBooksOfAccBS;

    /**
     * Gets the value of the fundSrc property.
     * 
     * @return
     *     possible object is
     *     {@link PARTABS.FundSrc }
     *     
     */
    public PARTABS.FundSrc getFundSrc() {
        return fundSrc;
    }

    /**
     * Sets the value of the fundSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTABS.FundSrc }
     *     
     */
    public void setFundSrc(PARTABS.FundSrc value) {
        this.fundSrc = value;
    }

    /**
     * Gets the value of the fundApply property.
     * 
     * @return
     *     possible object is
     *     {@link PARTABS.FundApply }
     *     
     */
    public PARTABS.FundApply getFundApply() {
        return fundApply;
    }

    /**
     * Sets the value of the fundApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTABS.FundApply }
     *     
     */
    public void setFundApply(PARTABS.FundApply value) {
        this.fundApply = value;
    }

    /**
     * Gets the value of the noBooksOfAccBS property.
     * 
     * @return
     *     possible object is
     *     {@link PARTABS.NoBooksOfAccBS }
     *     
     */
    public PARTABS.NoBooksOfAccBS getNoBooksOfAccBS() {
        return noBooksOfAccBS;
    }

    /**
     * Sets the value of the noBooksOfAccBS property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTABS.NoBooksOfAccBS }
     *     
     */
    public void setNoBooksOfAccBS(PARTABS.NoBooksOfAccBS value) {
        this.noBooksOfAccBS = value;
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
     *         &lt;element name="FixedAsset">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="GrossBlock">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Depreciation">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="NetBlock">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CapWrkProg">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TotFixedAsset">
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
     *         &lt;element name="Investments">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LongTermInv">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="GovtOthSecQuoted">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="GovOthSecUnQoted">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="TotLongTermInv">
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
     *                   &lt;element name="TradeInv">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="EquityShares">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="PreferShares">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Debenture">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="TotTradeInv">
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
     *                   &lt;element name="TotInvestments">
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
     *         &lt;element name="CurrAssetLoanAdv">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CurrAsset">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Inventories">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="StoresConsumables">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="RawMatl">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="StkInProcess">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="FinOrTradGood">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="TotInventries">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="SndryDebtors">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="CashOrBankBal">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CashinHand">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="BankBal">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="TotCashOrBankBal">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="OthCurrAsset">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="TotCurrAsset">
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
     *                   &lt;element name="LoanAdv">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AdvRecoverable">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Deposits">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="BalWithRevAuth">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="TotLoanAdv">
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
     *                   &lt;element name="TotCurrAssetLoanAdv">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CurrLiabilitiesProv">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CurrLiabilities">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SundryCred">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="LiabForLeasedAsset">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="AccrIntonLeasedAsset">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="AccrIntNotDue">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="TotCurrLiabilities">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Provisions">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ITProvision">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="WTProvision">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="ELSuperAnnGratProvision">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="OthProvision">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="TotProvisions">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TotCurrLiabilitiesProvision">
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
     *                   &lt;element name="NetCurrAsset">
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
     *         &lt;element name="MiscAdjust">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MiscExpndr">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DefTaxAsset">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AccumaltedLosses">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TotMiscAdjust">
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
     *         &lt;element name="TotFundApply">
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
        "fixedAsset",
        "investments",
        "currAssetLoanAdv",
        "miscAdjust",
        "totFundApply"
    })
    public static class FundApply {

        @XmlElement(name = "FixedAsset", required = true)
        protected PARTABS.FundApply.FixedAsset fixedAsset;
        @XmlElement(name = "Investments", required = true)
        protected PARTABS.FundApply.Investments investments;
        @XmlElement(name = "CurrAssetLoanAdv", required = true)
        protected PARTABS.FundApply.CurrAssetLoanAdv currAssetLoanAdv;
        @XmlElement(name = "MiscAdjust", required = true)
        protected PARTABS.FundApply.MiscAdjust miscAdjust;
        @XmlElement(name = "TotFundApply", required = true, defaultValue = "0")
        protected BigInteger totFundApply;

        /**
         * Gets the value of the fixedAsset property.
         * 
         * @return
         *     possible object is
         *     {@link PARTABS.FundApply.FixedAsset }
         *     
         */
        public PARTABS.FundApply.FixedAsset getFixedAsset() {
            return fixedAsset;
        }

        /**
         * Sets the value of the fixedAsset property.
         * 
         * @param value
         *     allowed object is
         *     {@link PARTABS.FundApply.FixedAsset }
         *     
         */
        public void setFixedAsset(PARTABS.FundApply.FixedAsset value) {
            this.fixedAsset = value;
        }

        /**
         * Gets the value of the investments property.
         * 
         * @return
         *     possible object is
         *     {@link PARTABS.FundApply.Investments }
         *     
         */
        public PARTABS.FundApply.Investments getInvestments() {
            return investments;
        }

        /**
         * Sets the value of the investments property.
         * 
         * @param value
         *     allowed object is
         *     {@link PARTABS.FundApply.Investments }
         *     
         */
        public void setInvestments(PARTABS.FundApply.Investments value) {
            this.investments = value;
        }

        /**
         * Gets the value of the currAssetLoanAdv property.
         * 
         * @return
         *     possible object is
         *     {@link PARTABS.FundApply.CurrAssetLoanAdv }
         *     
         */
        public PARTABS.FundApply.CurrAssetLoanAdv getCurrAssetLoanAdv() {
            return currAssetLoanAdv;
        }

        /**
         * Sets the value of the currAssetLoanAdv property.
         * 
         * @param value
         *     allowed object is
         *     {@link PARTABS.FundApply.CurrAssetLoanAdv }
         *     
         */
        public void setCurrAssetLoanAdv(PARTABS.FundApply.CurrAssetLoanAdv value) {
            this.currAssetLoanAdv = value;
        }

        /**
         * Gets the value of the miscAdjust property.
         * 
         * @return
         *     possible object is
         *     {@link PARTABS.FundApply.MiscAdjust }
         *     
         */
        public PARTABS.FundApply.MiscAdjust getMiscAdjust() {
            return miscAdjust;
        }

        /**
         * Sets the value of the miscAdjust property.
         * 
         * @param value
         *     allowed object is
         *     {@link PARTABS.FundApply.MiscAdjust }
         *     
         */
        public void setMiscAdjust(PARTABS.FundApply.MiscAdjust value) {
            this.miscAdjust = value;
        }

        /**
         * Gets the value of the totFundApply property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotFundApply() {
            return totFundApply;
        }

        /**
         * Sets the value of the totFundApply property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotFundApply(BigInteger value) {
            this.totFundApply = value;
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
         *         &lt;element name="CurrAsset">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Inventories">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="StoresConsumables">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="RawMatl">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="StkInProcess">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="FinOrTradGood">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="TotInventries">
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
         *                   &lt;element name="SndryDebtors">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="CashOrBankBal">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CashinHand">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="BankBal">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="TotCashOrBankBal">
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
         *                   &lt;element name="OthCurrAsset">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="TotCurrAsset">
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
         *         &lt;element name="LoanAdv">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AdvRecoverable">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Deposits">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="BalWithRevAuth">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="TotLoanAdv">
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
         *         &lt;element name="TotCurrAssetLoanAdv">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CurrLiabilitiesProv">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CurrLiabilities">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="SundryCred">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="LiabForLeasedAsset">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="AccrIntonLeasedAsset">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="AccrIntNotDue">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="TotCurrLiabilities">
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
         *                   &lt;element name="Provisions">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ITProvision">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="WTProvision">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="ELSuperAnnGratProvision">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="OthProvision">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="TotProvisions">
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
         *                   &lt;element name="TotCurrLiabilitiesProvision">
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
         *         &lt;element name="NetCurrAsset">
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
            "currAsset",
            "loanAdv",
            "totCurrAssetLoanAdv",
            "currLiabilitiesProv",
            "netCurrAsset"
        })
        public static class CurrAssetLoanAdv {

            @XmlElement(name = "CurrAsset", required = true)
            protected PARTABS.FundApply.CurrAssetLoanAdv.CurrAsset currAsset;
            @XmlElement(name = "LoanAdv", required = true)
            protected PARTABS.FundApply.CurrAssetLoanAdv.LoanAdv loanAdv;
            @XmlElement(name = "TotCurrAssetLoanAdv", defaultValue = "0")
            protected long totCurrAssetLoanAdv;
            @XmlElement(name = "CurrLiabilitiesProv", required = true)
            protected PARTABS.FundApply.CurrAssetLoanAdv.CurrLiabilitiesProv currLiabilitiesProv;
            @XmlElement(name = "NetCurrAsset", defaultValue = "0")
            protected long netCurrAsset;

            /**
             * Gets the value of the currAsset property.
             * 
             * @return
             *     possible object is
             *     {@link PARTABS.FundApply.CurrAssetLoanAdv.CurrAsset }
             *     
             */
            public PARTABS.FundApply.CurrAssetLoanAdv.CurrAsset getCurrAsset() {
                return currAsset;
            }

            /**
             * Sets the value of the currAsset property.
             * 
             * @param value
             *     allowed object is
             *     {@link PARTABS.FundApply.CurrAssetLoanAdv.CurrAsset }
             *     
             */
            public void setCurrAsset(PARTABS.FundApply.CurrAssetLoanAdv.CurrAsset value) {
                this.currAsset = value;
            }

            /**
             * Gets the value of the loanAdv property.
             * 
             * @return
             *     possible object is
             *     {@link PARTABS.FundApply.CurrAssetLoanAdv.LoanAdv }
             *     
             */
            public PARTABS.FundApply.CurrAssetLoanAdv.LoanAdv getLoanAdv() {
                return loanAdv;
            }

            /**
             * Sets the value of the loanAdv property.
             * 
             * @param value
             *     allowed object is
             *     {@link PARTABS.FundApply.CurrAssetLoanAdv.LoanAdv }
             *     
             */
            public void setLoanAdv(PARTABS.FundApply.CurrAssetLoanAdv.LoanAdv value) {
                this.loanAdv = value;
            }

            /**
             * Gets the value of the totCurrAssetLoanAdv property.
             * 
             */
            public long getTotCurrAssetLoanAdv() {
                return totCurrAssetLoanAdv;
            }

            /**
             * Sets the value of the totCurrAssetLoanAdv property.
             * 
             */
            public void setTotCurrAssetLoanAdv(long value) {
                this.totCurrAssetLoanAdv = value;
            }

            /**
             * Gets the value of the currLiabilitiesProv property.
             * 
             * @return
             *     possible object is
             *     {@link PARTABS.FundApply.CurrAssetLoanAdv.CurrLiabilitiesProv }
             *     
             */
            public PARTABS.FundApply.CurrAssetLoanAdv.CurrLiabilitiesProv getCurrLiabilitiesProv() {
                return currLiabilitiesProv;
            }

            /**
             * Sets the value of the currLiabilitiesProv property.
             * 
             * @param value
             *     allowed object is
             *     {@link PARTABS.FundApply.CurrAssetLoanAdv.CurrLiabilitiesProv }
             *     
             */
            public void setCurrLiabilitiesProv(PARTABS.FundApply.CurrAssetLoanAdv.CurrLiabilitiesProv value) {
                this.currLiabilitiesProv = value;
            }

            /**
             * Gets the value of the netCurrAsset property.
             * 
             */
            public long getNetCurrAsset() {
                return netCurrAsset;
            }

            /**
             * Sets the value of the netCurrAsset property.
             * 
             */
            public void setNetCurrAsset(long value) {
                this.netCurrAsset = value;
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
             *         &lt;element name="Inventories">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="StoresConsumables">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="RawMatl">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="StkInProcess">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="FinOrTradGood">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="TotInventries">
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
             *         &lt;element name="SndryDebtors">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="CashOrBankBal">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CashinHand">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="BankBal">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="TotCashOrBankBal">
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
             *         &lt;element name="OthCurrAsset">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="TotCurrAsset">
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
                "inventories",
                "sndryDebtors",
                "cashOrBankBal",
                "othCurrAsset",
                "totCurrAsset"
            })
            public static class CurrAsset {

                @XmlElement(name = "Inventories", required = true)
                protected PARTABS.FundApply.CurrAssetLoanAdv.CurrAsset.Inventories inventories;
                @XmlElement(name = "SndryDebtors", required = true, defaultValue = "0")
                protected BigInteger sndryDebtors;
                @XmlElement(name = "CashOrBankBal", required = true)
                protected PARTABS.FundApply.CurrAssetLoanAdv.CurrAsset.CashOrBankBal cashOrBankBal;
                @XmlElement(name = "OthCurrAsset", defaultValue = "0")
                protected long othCurrAsset;
                @XmlElement(name = "TotCurrAsset", defaultValue = "0")
                protected long totCurrAsset;

                /**
                 * Gets the value of the inventories property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PARTABS.FundApply.CurrAssetLoanAdv.CurrAsset.Inventories }
                 *     
                 */
                public PARTABS.FundApply.CurrAssetLoanAdv.CurrAsset.Inventories getInventories() {
                    return inventories;
                }

                /**
                 * Sets the value of the inventories property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PARTABS.FundApply.CurrAssetLoanAdv.CurrAsset.Inventories }
                 *     
                 */
                public void setInventories(PARTABS.FundApply.CurrAssetLoanAdv.CurrAsset.Inventories value) {
                    this.inventories = value;
                }

                /**
                 * Gets the value of the sndryDebtors property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSndryDebtors() {
                    return sndryDebtors;
                }

                /**
                 * Sets the value of the sndryDebtors property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSndryDebtors(BigInteger value) {
                    this.sndryDebtors = value;
                }

                /**
                 * Gets the value of the cashOrBankBal property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PARTABS.FundApply.CurrAssetLoanAdv.CurrAsset.CashOrBankBal }
                 *     
                 */
                public PARTABS.FundApply.CurrAssetLoanAdv.CurrAsset.CashOrBankBal getCashOrBankBal() {
                    return cashOrBankBal;
                }

                /**
                 * Sets the value of the cashOrBankBal property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PARTABS.FundApply.CurrAssetLoanAdv.CurrAsset.CashOrBankBal }
                 *     
                 */
                public void setCashOrBankBal(PARTABS.FundApply.CurrAssetLoanAdv.CurrAsset.CashOrBankBal value) {
                    this.cashOrBankBal = value;
                }

                /**
                 * Gets the value of the othCurrAsset property.
                 * 
                 */
                public long getOthCurrAsset() {
                    return othCurrAsset;
                }

                /**
                 * Sets the value of the othCurrAsset property.
                 * 
                 */
                public void setOthCurrAsset(long value) {
                    this.othCurrAsset = value;
                }

                /**
                 * Gets the value of the totCurrAsset property.
                 * 
                 */
                public long getTotCurrAsset() {
                    return totCurrAsset;
                }

                /**
                 * Sets the value of the totCurrAsset property.
                 * 
                 */
                public void setTotCurrAsset(long value) {
                    this.totCurrAsset = value;
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
                 *         &lt;element name="CashinHand">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="BankBal">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="TotCashOrBankBal">
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
                    "cashinHand",
                    "bankBal",
                    "totCashOrBankBal"
                })
                public static class CashOrBankBal {

                    @XmlElement(name = "CashinHand", required = true, defaultValue = "0")
                    protected BigInteger cashinHand;
                    @XmlElement(name = "BankBal", defaultValue = "0")
                    protected long bankBal;
                    @XmlElement(name = "TotCashOrBankBal", defaultValue = "0")
                    protected long totCashOrBankBal;

                    /**
                     * Gets the value of the cashinHand property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getCashinHand() {
                        return cashinHand;
                    }

                    /**
                     * Sets the value of the cashinHand property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setCashinHand(BigInteger value) {
                        this.cashinHand = value;
                    }

                    /**
                     * Gets the value of the bankBal property.
                     * 
                     */
                    public long getBankBal() {
                        return bankBal;
                    }

                    /**
                     * Sets the value of the bankBal property.
                     * 
                     */
                    public void setBankBal(long value) {
                        this.bankBal = value;
                    }

                    /**
                     * Gets the value of the totCashOrBankBal property.
                     * 
                     */
                    public long getTotCashOrBankBal() {
                        return totCashOrBankBal;
                    }

                    /**
                     * Sets the value of the totCashOrBankBal property.
                     * 
                     */
                    public void setTotCashOrBankBal(long value) {
                        this.totCashOrBankBal = value;
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
                 *         &lt;element name="StoresConsumables">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="RawMatl">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="StkInProcess">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="FinOrTradGood">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="TotInventries">
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
                    "storesConsumables",
                    "rawMatl",
                    "stkInProcess",
                    "finOrTradGood",
                    "totInventries"
                })
                public static class Inventories {

                    @XmlElement(name = "StoresConsumables", required = true, defaultValue = "0")
                    protected BigInteger storesConsumables;
                    @XmlElement(name = "RawMatl", required = true, defaultValue = "0")
                    protected BigInteger rawMatl;
                    @XmlElement(name = "StkInProcess", required = true, defaultValue = "0")
                    protected BigInteger stkInProcess;
                    @XmlElement(name = "FinOrTradGood", required = true, defaultValue = "0")
                    protected BigInteger finOrTradGood;
                    @XmlElement(name = "TotInventries", required = true, defaultValue = "0")
                    protected BigInteger totInventries;

                    /**
                     * Gets the value of the storesConsumables property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getStoresConsumables() {
                        return storesConsumables;
                    }

                    /**
                     * Sets the value of the storesConsumables property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setStoresConsumables(BigInteger value) {
                        this.storesConsumables = value;
                    }

                    /**
                     * Gets the value of the rawMatl property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRawMatl() {
                        return rawMatl;
                    }

                    /**
                     * Sets the value of the rawMatl property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRawMatl(BigInteger value) {
                        this.rawMatl = value;
                    }

                    /**
                     * Gets the value of the stkInProcess property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getStkInProcess() {
                        return stkInProcess;
                    }

                    /**
                     * Sets the value of the stkInProcess property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setStkInProcess(BigInteger value) {
                        this.stkInProcess = value;
                    }

                    /**
                     * Gets the value of the finOrTradGood property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getFinOrTradGood() {
                        return finOrTradGood;
                    }

                    /**
                     * Sets the value of the finOrTradGood property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setFinOrTradGood(BigInteger value) {
                        this.finOrTradGood = value;
                    }

                    /**
                     * Gets the value of the totInventries property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getTotInventries() {
                        return totInventries;
                    }

                    /**
                     * Sets the value of the totInventries property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setTotInventries(BigInteger value) {
                        this.totInventries = value;
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
             *         &lt;element name="CurrLiabilities">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="SundryCred">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="LiabForLeasedAsset">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="AccrIntonLeasedAsset">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="AccrIntNotDue">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="TotCurrLiabilities">
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
             *         &lt;element name="Provisions">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ITProvision">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="WTProvision">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="ELSuperAnnGratProvision">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="OthProvision">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="TotProvisions">
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
             *         &lt;element name="TotCurrLiabilitiesProvision">
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
                "currLiabilities",
                "provisions",
                "totCurrLiabilitiesProvision"
            })
            public static class CurrLiabilitiesProv {

                @XmlElement(name = "CurrLiabilities", required = true)
                protected PARTABS.FundApply.CurrAssetLoanAdv.CurrLiabilitiesProv.CurrLiabilities currLiabilities;
                @XmlElement(name = "Provisions", required = true)
                protected PARTABS.FundApply.CurrAssetLoanAdv.CurrLiabilitiesProv.Provisions provisions;
                @XmlElement(name = "TotCurrLiabilitiesProvision", required = true, defaultValue = "0")
                protected BigInteger totCurrLiabilitiesProvision;

                /**
                 * Gets the value of the currLiabilities property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PARTABS.FundApply.CurrAssetLoanAdv.CurrLiabilitiesProv.CurrLiabilities }
                 *     
                 */
                public PARTABS.FundApply.CurrAssetLoanAdv.CurrLiabilitiesProv.CurrLiabilities getCurrLiabilities() {
                    return currLiabilities;
                }

                /**
                 * Sets the value of the currLiabilities property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PARTABS.FundApply.CurrAssetLoanAdv.CurrLiabilitiesProv.CurrLiabilities }
                 *     
                 */
                public void setCurrLiabilities(PARTABS.FundApply.CurrAssetLoanAdv.CurrLiabilitiesProv.CurrLiabilities value) {
                    this.currLiabilities = value;
                }

                /**
                 * Gets the value of the provisions property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PARTABS.FundApply.CurrAssetLoanAdv.CurrLiabilitiesProv.Provisions }
                 *     
                 */
                public PARTABS.FundApply.CurrAssetLoanAdv.CurrLiabilitiesProv.Provisions getProvisions() {
                    return provisions;
                }

                /**
                 * Sets the value of the provisions property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PARTABS.FundApply.CurrAssetLoanAdv.CurrLiabilitiesProv.Provisions }
                 *     
                 */
                public void setProvisions(PARTABS.FundApply.CurrAssetLoanAdv.CurrLiabilitiesProv.Provisions value) {
                    this.provisions = value;
                }

                /**
                 * Gets the value of the totCurrLiabilitiesProvision property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTotCurrLiabilitiesProvision() {
                    return totCurrLiabilitiesProvision;
                }

                /**
                 * Sets the value of the totCurrLiabilitiesProvision property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTotCurrLiabilitiesProvision(BigInteger value) {
                    this.totCurrLiabilitiesProvision = value;
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
                 *         &lt;element name="SundryCred">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="LiabForLeasedAsset">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="AccrIntonLeasedAsset">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="AccrIntNotDue">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="TotCurrLiabilities">
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
                    "sundryCred",
                    "liabForLeasedAsset",
                    "accrIntonLeasedAsset",
                    "accrIntNotDue",
                    "totCurrLiabilities"
                })
                public static class CurrLiabilities {

                    @XmlElement(name = "SundryCred", required = true, defaultValue = "0")
                    protected BigInteger sundryCred;
                    @XmlElement(name = "LiabForLeasedAsset", required = true, defaultValue = "0")
                    protected BigInteger liabForLeasedAsset;
                    @XmlElement(name = "AccrIntonLeasedAsset", required = true, defaultValue = "0")
                    protected BigInteger accrIntonLeasedAsset;
                    @XmlElement(name = "AccrIntNotDue", required = true, defaultValue = "0")
                    protected BigInteger accrIntNotDue;
                    @XmlElement(name = "TotCurrLiabilities", required = true, defaultValue = "0")
                    protected BigInteger totCurrLiabilities;

                    /**
                     * Gets the value of the sundryCred property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getSundryCred() {
                        return sundryCred;
                    }

                    /**
                     * Sets the value of the sundryCred property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setSundryCred(BigInteger value) {
                        this.sundryCred = value;
                    }

                    /**
                     * Gets the value of the liabForLeasedAsset property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getLiabForLeasedAsset() {
                        return liabForLeasedAsset;
                    }

                    /**
                     * Sets the value of the liabForLeasedAsset property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setLiabForLeasedAsset(BigInteger value) {
                        this.liabForLeasedAsset = value;
                    }

                    /**
                     * Gets the value of the accrIntonLeasedAsset property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getAccrIntonLeasedAsset() {
                        return accrIntonLeasedAsset;
                    }

                    /**
                     * Sets the value of the accrIntonLeasedAsset property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setAccrIntonLeasedAsset(BigInteger value) {
                        this.accrIntonLeasedAsset = value;
                    }

                    /**
                     * Gets the value of the accrIntNotDue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getAccrIntNotDue() {
                        return accrIntNotDue;
                    }

                    /**
                     * Sets the value of the accrIntNotDue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setAccrIntNotDue(BigInteger value) {
                        this.accrIntNotDue = value;
                    }

                    /**
                     * Gets the value of the totCurrLiabilities property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getTotCurrLiabilities() {
                        return totCurrLiabilities;
                    }

                    /**
                     * Sets the value of the totCurrLiabilities property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setTotCurrLiabilities(BigInteger value) {
                        this.totCurrLiabilities = value;
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
                 *         &lt;element name="ITProvision">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="WTProvision">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="ELSuperAnnGratProvision">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="OthProvision">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="TotProvisions">
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
                    "itProvision",
                    "wtProvision",
                    "elSuperAnnGratProvision",
                    "othProvision",
                    "totProvisions"
                })
                public static class Provisions {

                    @XmlElement(name = "ITProvision", required = true, defaultValue = "0")
                    protected BigInteger itProvision;
                    @XmlElement(name = "WTProvision", required = true, defaultValue = "0")
                    protected BigInteger wtProvision;
                    @XmlElement(name = "ELSuperAnnGratProvision", required = true, defaultValue = "0")
                    protected BigInteger elSuperAnnGratProvision;
                    @XmlElement(name = "OthProvision", required = true, defaultValue = "0")
                    protected BigInteger othProvision;
                    @XmlElement(name = "TotProvisions", required = true, defaultValue = "0")
                    protected BigInteger totProvisions;

                    /**
                     * Gets the value of the itProvision property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getITProvision() {
                        return itProvision;
                    }

                    /**
                     * Sets the value of the itProvision property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setITProvision(BigInteger value) {
                        this.itProvision = value;
                    }

                    /**
                     * Gets the value of the wtProvision property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getWTProvision() {
                        return wtProvision;
                    }

                    /**
                     * Sets the value of the wtProvision property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setWTProvision(BigInteger value) {
                        this.wtProvision = value;
                    }

                    /**
                     * Gets the value of the elSuperAnnGratProvision property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getELSuperAnnGratProvision() {
                        return elSuperAnnGratProvision;
                    }

                    /**
                     * Sets the value of the elSuperAnnGratProvision property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setELSuperAnnGratProvision(BigInteger value) {
                        this.elSuperAnnGratProvision = value;
                    }

                    /**
                     * Gets the value of the othProvision property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getOthProvision() {
                        return othProvision;
                    }

                    /**
                     * Sets the value of the othProvision property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setOthProvision(BigInteger value) {
                        this.othProvision = value;
                    }

                    /**
                     * Gets the value of the totProvisions property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getTotProvisions() {
                        return totProvisions;
                    }

                    /**
                     * Sets the value of the totProvisions property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setTotProvisions(BigInteger value) {
                        this.totProvisions = value;
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
             *         &lt;element name="AdvRecoverable">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Deposits">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="BalWithRevAuth">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="TotLoanAdv">
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
                "advRecoverable",
                "deposits",
                "balWithRevAuth",
                "totLoanAdv"
            })
            public static class LoanAdv {

                @XmlElement(name = "AdvRecoverable", required = true, defaultValue = "0")
                protected BigInteger advRecoverable;
                @XmlElement(name = "Deposits", required = true, defaultValue = "0")
                protected BigInteger deposits;
                @XmlElement(name = "BalWithRevAuth", required = true, defaultValue = "0")
                protected BigInteger balWithRevAuth;
                @XmlElement(name = "TotLoanAdv", required = true, defaultValue = "0")
                protected BigInteger totLoanAdv;

                /**
                 * Gets the value of the advRecoverable property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getAdvRecoverable() {
                    return advRecoverable;
                }

                /**
                 * Sets the value of the advRecoverable property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setAdvRecoverable(BigInteger value) {
                    this.advRecoverable = value;
                }

                /**
                 * Gets the value of the deposits property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDeposits() {
                    return deposits;
                }

                /**
                 * Sets the value of the deposits property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDeposits(BigInteger value) {
                    this.deposits = value;
                }

                /**
                 * Gets the value of the balWithRevAuth property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getBalWithRevAuth() {
                    return balWithRevAuth;
                }

                /**
                 * Sets the value of the balWithRevAuth property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setBalWithRevAuth(BigInteger value) {
                    this.balWithRevAuth = value;
                }

                /**
                 * Gets the value of the totLoanAdv property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTotLoanAdv() {
                    return totLoanAdv;
                }

                /**
                 * Sets the value of the totLoanAdv property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTotLoanAdv(BigInteger value) {
                    this.totLoanAdv = value;
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
         *         &lt;element name="GrossBlock">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Depreciation">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="NetBlock">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CapWrkProg">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TotFixedAsset">
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
            "grossBlock",
            "depreciation",
            "netBlock",
            "capWrkProg",
            "totFixedAsset"
        })
        public static class FixedAsset {

            @XmlElement(name = "GrossBlock", required = true, defaultValue = "0")
            protected BigInteger grossBlock;
            @XmlElement(name = "Depreciation", required = true, defaultValue = "0")
            protected BigInteger depreciation;
            @XmlElement(name = "NetBlock", required = true, defaultValue = "0")
            protected BigInteger netBlock;
            @XmlElement(name = "CapWrkProg", required = true, defaultValue = "0")
            protected BigInteger capWrkProg;
            @XmlElement(name = "TotFixedAsset", required = true, defaultValue = "0")
            protected BigInteger totFixedAsset;

            /**
             * Gets the value of the grossBlock property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getGrossBlock() {
                return grossBlock;
            }

            /**
             * Sets the value of the grossBlock property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setGrossBlock(BigInteger value) {
                this.grossBlock = value;
            }

            /**
             * Gets the value of the depreciation property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDepreciation() {
                return depreciation;
            }

            /**
             * Sets the value of the depreciation property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDepreciation(BigInteger value) {
                this.depreciation = value;
            }

            /**
             * Gets the value of the netBlock property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNetBlock() {
                return netBlock;
            }

            /**
             * Sets the value of the netBlock property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNetBlock(BigInteger value) {
                this.netBlock = value;
            }

            /**
             * Gets the value of the capWrkProg property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCapWrkProg() {
                return capWrkProg;
            }

            /**
             * Sets the value of the capWrkProg property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCapWrkProg(BigInteger value) {
                this.capWrkProg = value;
            }

            /**
             * Gets the value of the totFixedAsset property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotFixedAsset() {
                return totFixedAsset;
            }

            /**
             * Sets the value of the totFixedAsset property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotFixedAsset(BigInteger value) {
                this.totFixedAsset = value;
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
         *         &lt;element name="LongTermInv">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="GovtOthSecQuoted">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="GovOthSecUnQoted">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="TotLongTermInv">
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
         *         &lt;element name="TradeInv">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="EquityShares">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="PreferShares">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Debenture">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="TotTradeInv">
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
         *         &lt;element name="TotInvestments">
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
            "longTermInv",
            "tradeInv",
            "totInvestments"
        })
        public static class Investments {

            @XmlElement(name = "LongTermInv", required = true)
            protected PARTABS.FundApply.Investments.LongTermInv longTermInv;
            @XmlElement(name = "TradeInv", required = true)
            protected PARTABS.FundApply.Investments.TradeInv tradeInv;
            @XmlElement(name = "TotInvestments", required = true, defaultValue = "0")
            protected BigInteger totInvestments;

            /**
             * Gets the value of the longTermInv property.
             * 
             * @return
             *     possible object is
             *     {@link PARTABS.FundApply.Investments.LongTermInv }
             *     
             */
            public PARTABS.FundApply.Investments.LongTermInv getLongTermInv() {
                return longTermInv;
            }

            /**
             * Sets the value of the longTermInv property.
             * 
             * @param value
             *     allowed object is
             *     {@link PARTABS.FundApply.Investments.LongTermInv }
             *     
             */
            public void setLongTermInv(PARTABS.FundApply.Investments.LongTermInv value) {
                this.longTermInv = value;
            }

            /**
             * Gets the value of the tradeInv property.
             * 
             * @return
             *     possible object is
             *     {@link PARTABS.FundApply.Investments.TradeInv }
             *     
             */
            public PARTABS.FundApply.Investments.TradeInv getTradeInv() {
                return tradeInv;
            }

            /**
             * Sets the value of the tradeInv property.
             * 
             * @param value
             *     allowed object is
             *     {@link PARTABS.FundApply.Investments.TradeInv }
             *     
             */
            public void setTradeInv(PARTABS.FundApply.Investments.TradeInv value) {
                this.tradeInv = value;
            }

            /**
             * Gets the value of the totInvestments property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotInvestments() {
                return totInvestments;
            }

            /**
             * Sets the value of the totInvestments property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotInvestments(BigInteger value) {
                this.totInvestments = value;
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
             *         &lt;element name="GovtOthSecQuoted">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="GovOthSecUnQoted">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="TotLongTermInv">
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
                "govtOthSecQuoted",
                "govOthSecUnQoted",
                "totLongTermInv"
            })
            public static class LongTermInv {

                @XmlElement(name = "GovtOthSecQuoted", required = true, defaultValue = "0")
                protected BigInteger govtOthSecQuoted;
                @XmlElement(name = "GovOthSecUnQoted", required = true, defaultValue = "0")
                protected BigInteger govOthSecUnQoted;
                @XmlElement(name = "TotLongTermInv", required = true, defaultValue = "0")
                protected BigInteger totLongTermInv;

                /**
                 * Gets the value of the govtOthSecQuoted property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getGovtOthSecQuoted() {
                    return govtOthSecQuoted;
                }

                /**
                 * Sets the value of the govtOthSecQuoted property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setGovtOthSecQuoted(BigInteger value) {
                    this.govtOthSecQuoted = value;
                }

                /**
                 * Gets the value of the govOthSecUnQoted property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getGovOthSecUnQoted() {
                    return govOthSecUnQoted;
                }

                /**
                 * Sets the value of the govOthSecUnQoted property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setGovOthSecUnQoted(BigInteger value) {
                    this.govOthSecUnQoted = value;
                }

                /**
                 * Gets the value of the totLongTermInv property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTotLongTermInv() {
                    return totLongTermInv;
                }

                /**
                 * Sets the value of the totLongTermInv property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTotLongTermInv(BigInteger value) {
                    this.totLongTermInv = value;
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
             *         &lt;element name="EquityShares">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="PreferShares">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Debenture">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="TotTradeInv">
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
                "equityShares",
                "preferShares",
                "debenture",
                "totTradeInv"
            })
            public static class TradeInv {

                @XmlElement(name = "EquityShares", required = true, defaultValue = "0")
                protected BigInteger equityShares;
                @XmlElement(name = "PreferShares", required = true, defaultValue = "0")
                protected BigInteger preferShares;
                @XmlElement(name = "Debenture", required = true, defaultValue = "0")
                protected BigInteger debenture;
                @XmlElement(name = "TotTradeInv", required = true, defaultValue = "0")
                protected BigInteger totTradeInv;

                /**
                 * Gets the value of the equityShares property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getEquityShares() {
                    return equityShares;
                }

                /**
                 * Sets the value of the equityShares property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setEquityShares(BigInteger value) {
                    this.equityShares = value;
                }

                /**
                 * Gets the value of the preferShares property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getPreferShares() {
                    return preferShares;
                }

                /**
                 * Sets the value of the preferShares property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPreferShares(BigInteger value) {
                    this.preferShares = value;
                }

                /**
                 * Gets the value of the debenture property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDebenture() {
                    return debenture;
                }

                /**
                 * Sets the value of the debenture property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDebenture(BigInteger value) {
                    this.debenture = value;
                }

                /**
                 * Gets the value of the totTradeInv property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTotTradeInv() {
                    return totTradeInv;
                }

                /**
                 * Sets the value of the totTradeInv property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTotTradeInv(BigInteger value) {
                    this.totTradeInv = value;
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
         *         &lt;element name="MiscExpndr">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DefTaxAsset">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AccumaltedLosses">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TotMiscAdjust">
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
            "miscExpndr",
            "defTaxAsset",
            "accumaltedLosses",
            "totMiscAdjust"
        })
        public static class MiscAdjust {

            @XmlElement(name = "MiscExpndr", required = true, defaultValue = "0")
            protected BigInteger miscExpndr;
            @XmlElement(name = "DefTaxAsset", required = true, defaultValue = "0")
            protected BigInteger defTaxAsset;
            @XmlElement(name = "AccumaltedLosses", required = true, defaultValue = "0")
            protected BigInteger accumaltedLosses;
            @XmlElement(name = "TotMiscAdjust", required = true, defaultValue = "0")
            protected BigInteger totMiscAdjust;

            /**
             * Gets the value of the miscExpndr property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMiscExpndr() {
                return miscExpndr;
            }

            /**
             * Sets the value of the miscExpndr property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMiscExpndr(BigInteger value) {
                this.miscExpndr = value;
            }

            /**
             * Gets the value of the defTaxAsset property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDefTaxAsset() {
                return defTaxAsset;
            }

            /**
             * Sets the value of the defTaxAsset property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDefTaxAsset(BigInteger value) {
                this.defTaxAsset = value;
            }

            /**
             * Gets the value of the accumaltedLosses property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAccumaltedLosses() {
                return accumaltedLosses;
            }

            /**
             * Sets the value of the accumaltedLosses property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAccumaltedLosses(BigInteger value) {
                this.accumaltedLosses = value;
            }

            /**
             * Gets the value of the totMiscAdjust property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotMiscAdjust() {
                return totMiscAdjust;
            }

            /**
             * Sets the value of the totMiscAdjust property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotMiscAdjust(BigInteger value) {
                this.totMiscAdjust = value;
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
     *         &lt;element name="PropFund">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PropCap">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ResrNSurp">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RevResr">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="CapResr">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="StatResr">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="OthResr">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="TotResrNSurp">
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
     *                   &lt;element name="TotPropFund">
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
     *         &lt;element name="LoanFunds">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SecrLoan">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ForeignCurrLoan">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="RupeeLoan">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="FrmBank">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="FrmOthrs">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="TotRupeeLoan">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                             &lt;totalDigits value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TotSecrLoan">
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
     *                   &lt;element name="UnsecrLoan">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="FrmBank">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="FrmOthrs">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                                   &lt;totalDigits value="14"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="TotUnSecrLoan">
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
     *                   &lt;element name="TotLoanFund">
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
     *         &lt;element name="DeferredTax">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotFundSrc">
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
        "propFund",
        "loanFunds",
        "deferredTax",
        "totFundSrc"
    })
    public static class FundSrc {

        @XmlElement(name = "PropFund", required = true)
        protected PARTABS.FundSrc.PropFund propFund;
        @XmlElement(name = "LoanFunds", required = true)
        protected PARTABS.FundSrc.LoanFunds loanFunds;
        @XmlElement(name = "DeferredTax", required = true, defaultValue = "0")
        protected BigInteger deferredTax;
        @XmlElement(name = "TotFundSrc", defaultValue = "0")
        protected long totFundSrc;

        /**
         * Gets the value of the propFund property.
         * 
         * @return
         *     possible object is
         *     {@link PARTABS.FundSrc.PropFund }
         *     
         */
        public PARTABS.FundSrc.PropFund getPropFund() {
            return propFund;
        }

        /**
         * Sets the value of the propFund property.
         * 
         * @param value
         *     allowed object is
         *     {@link PARTABS.FundSrc.PropFund }
         *     
         */
        public void setPropFund(PARTABS.FundSrc.PropFund value) {
            this.propFund = value;
        }

        /**
         * Gets the value of the loanFunds property.
         * 
         * @return
         *     possible object is
         *     {@link PARTABS.FundSrc.LoanFunds }
         *     
         */
        public PARTABS.FundSrc.LoanFunds getLoanFunds() {
            return loanFunds;
        }

        /**
         * Sets the value of the loanFunds property.
         * 
         * @param value
         *     allowed object is
         *     {@link PARTABS.FundSrc.LoanFunds }
         *     
         */
        public void setLoanFunds(PARTABS.FundSrc.LoanFunds value) {
            this.loanFunds = value;
        }

        /**
         * Gets the value of the deferredTax property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDeferredTax() {
            return deferredTax;
        }

        /**
         * Sets the value of the deferredTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDeferredTax(BigInteger value) {
            this.deferredTax = value;
        }

        /**
         * Gets the value of the totFundSrc property.
         * 
         */
        public long getTotFundSrc() {
            return totFundSrc;
        }

        /**
         * Sets the value of the totFundSrc property.
         * 
         */
        public void setTotFundSrc(long value) {
            this.totFundSrc = value;
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
         *         &lt;element name="SecrLoan">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ForeignCurrLoan">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="RupeeLoan">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="FrmBank">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="FrmOthrs">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                                   &lt;totalDigits value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="TotRupeeLoan">
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
         *                   &lt;element name="TotSecrLoan">
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
         *         &lt;element name="UnsecrLoan">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="FrmBank">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="FrmOthrs">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="TotUnSecrLoan">
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
         *         &lt;element name="TotLoanFund">
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
            "secrLoan",
            "unsecrLoan",
            "totLoanFund"
        })
        public static class LoanFunds {

            @XmlElement(name = "SecrLoan", required = true)
            protected PARTABS.FundSrc.LoanFunds.SecrLoan secrLoan;
            @XmlElement(name = "UnsecrLoan", required = true)
            protected PARTABS.FundSrc.LoanFunds.UnsecrLoan unsecrLoan;
            @XmlElement(name = "TotLoanFund", required = true, defaultValue = "0")
            protected BigInteger totLoanFund;

            /**
             * Gets the value of the secrLoan property.
             * 
             * @return
             *     possible object is
             *     {@link PARTABS.FundSrc.LoanFunds.SecrLoan }
             *     
             */
            public PARTABS.FundSrc.LoanFunds.SecrLoan getSecrLoan() {
                return secrLoan;
            }

            /**
             * Sets the value of the secrLoan property.
             * 
             * @param value
             *     allowed object is
             *     {@link PARTABS.FundSrc.LoanFunds.SecrLoan }
             *     
             */
            public void setSecrLoan(PARTABS.FundSrc.LoanFunds.SecrLoan value) {
                this.secrLoan = value;
            }

            /**
             * Gets the value of the unsecrLoan property.
             * 
             * @return
             *     possible object is
             *     {@link PARTABS.FundSrc.LoanFunds.UnsecrLoan }
             *     
             */
            public PARTABS.FundSrc.LoanFunds.UnsecrLoan getUnsecrLoan() {
                return unsecrLoan;
            }

            /**
             * Sets the value of the unsecrLoan property.
             * 
             * @param value
             *     allowed object is
             *     {@link PARTABS.FundSrc.LoanFunds.UnsecrLoan }
             *     
             */
            public void setUnsecrLoan(PARTABS.FundSrc.LoanFunds.UnsecrLoan value) {
                this.unsecrLoan = value;
            }

            /**
             * Gets the value of the totLoanFund property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotLoanFund() {
                return totLoanFund;
            }

            /**
             * Sets the value of the totLoanFund property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotLoanFund(BigInteger value) {
                this.totLoanFund = value;
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
             *         &lt;element name="ForeignCurrLoan">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="RupeeLoan">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="FrmBank">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="FrmOthrs">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *                         &lt;totalDigits value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="TotRupeeLoan">
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
             *         &lt;element name="TotSecrLoan">
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
                "foreignCurrLoan",
                "rupeeLoan",
                "totSecrLoan"
            })
            public static class SecrLoan {

                @XmlElement(name = "ForeignCurrLoan", required = true, defaultValue = "0")
                protected BigInteger foreignCurrLoan;
                @XmlElement(name = "RupeeLoan", required = true)
                protected PARTABS.FundSrc.LoanFunds.SecrLoan.RupeeLoan rupeeLoan;
                @XmlElement(name = "TotSecrLoan", required = true, defaultValue = "0")
                protected BigInteger totSecrLoan;

                /**
                 * Gets the value of the foreignCurrLoan property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getForeignCurrLoan() {
                    return foreignCurrLoan;
                }

                /**
                 * Sets the value of the foreignCurrLoan property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setForeignCurrLoan(BigInteger value) {
                    this.foreignCurrLoan = value;
                }

                /**
                 * Gets the value of the rupeeLoan property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PARTABS.FundSrc.LoanFunds.SecrLoan.RupeeLoan }
                 *     
                 */
                public PARTABS.FundSrc.LoanFunds.SecrLoan.RupeeLoan getRupeeLoan() {
                    return rupeeLoan;
                }

                /**
                 * Sets the value of the rupeeLoan property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PARTABS.FundSrc.LoanFunds.SecrLoan.RupeeLoan }
                 *     
                 */
                public void setRupeeLoan(PARTABS.FundSrc.LoanFunds.SecrLoan.RupeeLoan value) {
                    this.rupeeLoan = value;
                }

                /**
                 * Gets the value of the totSecrLoan property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTotSecrLoan() {
                    return totSecrLoan;
                }

                /**
                 * Sets the value of the totSecrLoan property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTotSecrLoan(BigInteger value) {
                    this.totSecrLoan = value;
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
                 *         &lt;element name="FrmBank">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="FrmOthrs">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
                 *               &lt;totalDigits value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="TotRupeeLoan">
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
                    "frmBank",
                    "frmOthrs",
                    "totRupeeLoan"
                })
                public static class RupeeLoan {

                    @XmlElement(name = "FrmBank", required = true, defaultValue = "0")
                    protected BigInteger frmBank;
                    @XmlElement(name = "FrmOthrs", required = true, defaultValue = "0")
                    protected BigInteger frmOthrs;
                    @XmlElement(name = "TotRupeeLoan", required = true, defaultValue = "0")
                    protected BigInteger totRupeeLoan;

                    /**
                     * Gets the value of the frmBank property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getFrmBank() {
                        return frmBank;
                    }

                    /**
                     * Sets the value of the frmBank property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setFrmBank(BigInteger value) {
                        this.frmBank = value;
                    }

                    /**
                     * Gets the value of the frmOthrs property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getFrmOthrs() {
                        return frmOthrs;
                    }

                    /**
                     * Sets the value of the frmOthrs property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setFrmOthrs(BigInteger value) {
                        this.frmOthrs = value;
                    }

                    /**
                     * Gets the value of the totRupeeLoan property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getTotRupeeLoan() {
                        return totRupeeLoan;
                    }

                    /**
                     * Sets the value of the totRupeeLoan property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setTotRupeeLoan(BigInteger value) {
                        this.totRupeeLoan = value;
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
             *         &lt;element name="FrmBank">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="FrmOthrs">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="TotUnSecrLoan">
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
                "frmBank",
                "frmOthrs",
                "totUnSecrLoan"
            })
            public static class UnsecrLoan {

                @XmlElement(name = "FrmBank", required = true, defaultValue = "0")
                protected BigInteger frmBank;
                @XmlElement(name = "FrmOthrs", required = true, defaultValue = "0")
                protected BigInteger frmOthrs;
                @XmlElement(name = "TotUnSecrLoan", required = true, defaultValue = "0")
                protected BigInteger totUnSecrLoan;

                /**
                 * Gets the value of the frmBank property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getFrmBank() {
                    return frmBank;
                }

                /**
                 * Sets the value of the frmBank property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setFrmBank(BigInteger value) {
                    this.frmBank = value;
                }

                /**
                 * Gets the value of the frmOthrs property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getFrmOthrs() {
                    return frmOthrs;
                }

                /**
                 * Sets the value of the frmOthrs property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setFrmOthrs(BigInteger value) {
                    this.frmOthrs = value;
                }

                /**
                 * Gets the value of the totUnSecrLoan property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTotUnSecrLoan() {
                    return totUnSecrLoan;
                }

                /**
                 * Sets the value of the totUnSecrLoan property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTotUnSecrLoan(BigInteger value) {
                    this.totUnSecrLoan = value;
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
         *         &lt;element name="PropCap">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ResrNSurp">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RevResr">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="CapResr">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="StatResr">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="OthResr">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *                         &lt;totalDigits value="14"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="TotResrNSurp">
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
         *         &lt;element name="TotPropFund">
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
            "propCap",
            "resrNSurp",
            "totPropFund"
        })
        public static class PropFund {

            @XmlElement(name = "PropCap", defaultValue = "0")
            protected long propCap;
            @XmlElement(name = "ResrNSurp", required = true)
            protected PARTABS.FundSrc.PropFund.ResrNSurp resrNSurp;
            @XmlElement(name = "TotPropFund", defaultValue = "0")
            protected long totPropFund;

            /**
             * Gets the value of the propCap property.
             * 
             */
            public long getPropCap() {
                return propCap;
            }

            /**
             * Sets the value of the propCap property.
             * 
             */
            public void setPropCap(long value) {
                this.propCap = value;
            }

            /**
             * Gets the value of the resrNSurp property.
             * 
             * @return
             *     possible object is
             *     {@link PARTABS.FundSrc.PropFund.ResrNSurp }
             *     
             */
            public PARTABS.FundSrc.PropFund.ResrNSurp getResrNSurp() {
                return resrNSurp;
            }

            /**
             * Sets the value of the resrNSurp property.
             * 
             * @param value
             *     allowed object is
             *     {@link PARTABS.FundSrc.PropFund.ResrNSurp }
             *     
             */
            public void setResrNSurp(PARTABS.FundSrc.PropFund.ResrNSurp value) {
                this.resrNSurp = value;
            }

            /**
             * Gets the value of the totPropFund property.
             * 
             */
            public long getTotPropFund() {
                return totPropFund;
            }

            /**
             * Sets the value of the totPropFund property.
             * 
             */
            public void setTotPropFund(long value) {
                this.totPropFund = value;
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
             *         &lt;element name="RevResr">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="CapResr">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="StatResr">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="OthResr">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
             *               &lt;totalDigits value="14"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="TotResrNSurp">
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
                "revResr",
                "capResr",
                "statResr",
                "othResr",
                "totResrNSurp"
            })
            public static class ResrNSurp {

                @XmlElement(name = "RevResr", required = true, defaultValue = "0")
                protected BigInteger revResr;
                @XmlElement(name = "CapResr", required = true, defaultValue = "0")
                protected BigInteger capResr;
                @XmlElement(name = "StatResr", required = true, defaultValue = "0")
                protected BigInteger statResr;
                @XmlElement(name = "OthResr", required = true, defaultValue = "0")
                protected BigInteger othResr;
                @XmlElement(name = "TotResrNSurp", required = true, defaultValue = "0")
                protected BigInteger totResrNSurp;

                /**
                 * Gets the value of the revResr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getRevResr() {
                    return revResr;
                }

                /**
                 * Sets the value of the revResr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setRevResr(BigInteger value) {
                    this.revResr = value;
                }

                /**
                 * Gets the value of the capResr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCapResr() {
                    return capResr;
                }

                /**
                 * Sets the value of the capResr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCapResr(BigInteger value) {
                    this.capResr = value;
                }

                /**
                 * Gets the value of the statResr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getStatResr() {
                    return statResr;
                }

                /**
                 * Sets the value of the statResr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setStatResr(BigInteger value) {
                    this.statResr = value;
                }

                /**
                 * Gets the value of the othResr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getOthResr() {
                    return othResr;
                }

                /**
                 * Sets the value of the othResr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setOthResr(BigInteger value) {
                    this.othResr = value;
                }

                /**
                 * Gets the value of the totResrNSurp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTotResrNSurp() {
                    return totResrNSurp;
                }

                /**
                 * Sets the value of the totResrNSurp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTotResrNSurp(BigInteger value) {
                    this.totResrNSurp = value;
                }

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
     *         &lt;element name="TotSundryDbtAmt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotSundryCrdAmt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotStkInTradAmt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CashBalAmt">
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
        "totSundryDbtAmt",
        "totSundryCrdAmt",
        "totStkInTradAmt",
        "cashBalAmt"
    })
    public static class NoBooksOfAccBS {

        @XmlElement(name = "TotSundryDbtAmt", required = true, defaultValue = "0")
        protected BigInteger totSundryDbtAmt;
        @XmlElement(name = "TotSundryCrdAmt", required = true, defaultValue = "0")
        protected BigInteger totSundryCrdAmt;
        @XmlElement(name = "TotStkInTradAmt", required = true, defaultValue = "0")
        protected BigInteger totStkInTradAmt;
        @XmlElement(name = "CashBalAmt", required = true, defaultValue = "0")
        protected BigInteger cashBalAmt;

        /**
         * Gets the value of the totSundryDbtAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotSundryDbtAmt() {
            return totSundryDbtAmt;
        }

        /**
         * Sets the value of the totSundryDbtAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotSundryDbtAmt(BigInteger value) {
            this.totSundryDbtAmt = value;
        }

        /**
         * Gets the value of the totSundryCrdAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotSundryCrdAmt() {
            return totSundryCrdAmt;
        }

        /**
         * Sets the value of the totSundryCrdAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotSundryCrdAmt(BigInteger value) {
            this.totSundryCrdAmt = value;
        }

        /**
         * Gets the value of the totStkInTradAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotStkInTradAmt() {
            return totStkInTradAmt;
        }

        /**
         * Sets the value of the totStkInTradAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotStkInTradAmt(BigInteger value) {
            this.totStkInTradAmt = value;
        }

        /**
         * Gets the value of the cashBalAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCashBalAmt() {
            return cashBalAmt;
        }

        /**
         * Sets the value of the cashBalAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCashBalAmt(BigInteger value) {
            this.cashBalAmt = value;
        }

    }

}
