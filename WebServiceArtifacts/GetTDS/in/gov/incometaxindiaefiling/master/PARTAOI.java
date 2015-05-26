
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
 *         &lt;element name="MethodOfAcct">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="4"/>
 *               &lt;enumeration value="MERC"/>
 *               &lt;enumeration value="CASH"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ChangeInAcctMethFlg">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="Y"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProfDeviatDueAcctMeth">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MethodOfValClgStk" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ValRawMaterial">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="1"/>
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValFinishedGoods">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="1"/>
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ChngStockValMetFlg">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="1"/>
 *                         &lt;enumeration value="N"/>
 *                         &lt;enumeration value="Y"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="EffectOnPL">
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
 *         &lt;element name="NoCredToPLAmt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Section28Items">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ProformaCreditsDue">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PrevYrEscalClaim">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OthItemInc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CapReceipt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotNoCredToPLAmt">
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
 *         &lt;element name="AmtDisallUs36">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StkInsurPrem">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="EmpHealthInsurPrem">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="EmpBonusCommSum">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="IntOnBorrCap">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ZeroCoupBondDisc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RecogPFContribAmt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AppSuperAnnFundAmt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AppGratFundAmt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OthFundAmt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BadDebtDoubtAmt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BadDebtDoubtProvn">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SpecResrvTranfr">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FamPlanPromoExp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="EmpContributionCredits">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OthDisallowances">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotAmtDisallUs36">
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
 *         &lt;element name="AmtDisallUs37">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PersonalExp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PoliticPartyExp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="LawVoilatPenalExp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OthPenalFineExp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OffenceExp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ContigentLiability">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AmtNotPartTotInc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OthAmtNotAllowUs37">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotAmtDisallUs37">
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
 *         &lt;element name="AmtDisallUs40">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NonCompChapXVIIBAmt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="STTAmt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FBTAmt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TaxAmtOnProfits">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="WTAmt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="IntSalBonPartner">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OthDisallow">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotAmtDisallUs40">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AmtDisallUs40PyNowAll">
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
 *         &lt;element name="AmtDisallUs40A">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AmtPaidUs40A2b">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AmtGT20kCash">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ProvPmtGrat">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ContToSetupTrust">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OthDisallow">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotAmtDisallUs40A">
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
 *         &lt;element name="AmtDisallUs43BPyNowAll">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}AmtUs43B"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AmtDisall43B">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://incometaxindiaefiling.gov.in/master}AmtUs43B"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AmtExciseCustomsVATOutstanding">
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
 *         &lt;element name="DeemedProfUs33ABs">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProfTaxAmtUs41">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PriorAmtIncCrDrPL">
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
    "methodOfAcct",
    "changeInAcctMethFlg",
    "profDeviatDueAcctMeth",
    "methodOfValClgStk",
    "noCredToPLAmt",
    "amtDisallUs36",
    "amtDisallUs37",
    "amtDisallUs40",
    "amtDisallUs40A",
    "amtDisallUs43BPyNowAll",
    "amtDisall43B",
    "amtExciseCustomsVATOutstanding",
    "deemedProfUs33ABs",
    "profTaxAmtUs41",
    "priorAmtIncCrDrPL"
})
@XmlRootElement(name = "PARTA_OI")
public class PARTAOI {

    @XmlElement(name = "MethodOfAcct", required = true, defaultValue = "MERC")
    protected String methodOfAcct;
    @XmlElement(name = "ChangeInAcctMethFlg", required = true, defaultValue = "N")
    protected String changeInAcctMethFlg;
    @XmlElement(name = "ProfDeviatDueAcctMeth", defaultValue = "0")
    protected long profDeviatDueAcctMeth;
    @XmlElement(name = "MethodOfValClgStk")
    protected PARTAOI.MethodOfValClgStk methodOfValClgStk;
    @XmlElement(name = "NoCredToPLAmt", required = true)
    protected PARTAOI.NoCredToPLAmt noCredToPLAmt;
    @XmlElement(name = "AmtDisallUs36", required = true)
    protected PARTAOI.AmtDisallUs36 amtDisallUs36;
    @XmlElement(name = "AmtDisallUs37", required = true)
    protected PARTAOI.AmtDisallUs37 amtDisallUs37;
    @XmlElement(name = "AmtDisallUs40", required = true)
    protected PARTAOI.AmtDisallUs40 amtDisallUs40;
    @XmlElement(name = "AmtDisallUs40A", required = true)
    protected PARTAOI.AmtDisallUs40A amtDisallUs40A;
    @XmlElement(name = "AmtDisallUs43BPyNowAll", required = true)
    protected PARTAOI.AmtDisallUs43BPyNowAll amtDisallUs43BPyNowAll;
    @XmlElement(name = "AmtDisall43B", required = true)
    protected PARTAOI.AmtDisall43B amtDisall43B;
    @XmlElement(name = "AmtExciseCustomsVATOutstanding", required = true)
    protected PARTAOI.AmtExciseCustomsVATOutstanding amtExciseCustomsVATOutstanding;
    @XmlElement(name = "DeemedProfUs33ABs", required = true, defaultValue = "0")
    protected BigInteger deemedProfUs33ABs;
    @XmlElement(name = "ProfTaxAmtUs41", required = true, defaultValue = "0")
    protected BigInteger profTaxAmtUs41;
    @XmlElement(name = "PriorAmtIncCrDrPL", defaultValue = "0")
    protected long priorAmtIncCrDrPL;

    /**
     * Gets the value of the methodOfAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodOfAcct() {
        return methodOfAcct;
    }

    /**
     * Sets the value of the methodOfAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodOfAcct(String value) {
        this.methodOfAcct = value;
    }

    /**
     * Gets the value of the changeInAcctMethFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeInAcctMethFlg() {
        return changeInAcctMethFlg;
    }

    /**
     * Sets the value of the changeInAcctMethFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeInAcctMethFlg(String value) {
        this.changeInAcctMethFlg = value;
    }

    /**
     * Gets the value of the profDeviatDueAcctMeth property.
     * 
     */
    public long getProfDeviatDueAcctMeth() {
        return profDeviatDueAcctMeth;
    }

    /**
     * Sets the value of the profDeviatDueAcctMeth property.
     * 
     */
    public void setProfDeviatDueAcctMeth(long value) {
        this.profDeviatDueAcctMeth = value;
    }

    /**
     * Gets the value of the methodOfValClgStk property.
     * 
     * @return
     *     possible object is
     *     {@link PARTAOI.MethodOfValClgStk }
     *     
     */
    public PARTAOI.MethodOfValClgStk getMethodOfValClgStk() {
        return methodOfValClgStk;
    }

    /**
     * Sets the value of the methodOfValClgStk property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTAOI.MethodOfValClgStk }
     *     
     */
    public void setMethodOfValClgStk(PARTAOI.MethodOfValClgStk value) {
        this.methodOfValClgStk = value;
    }

    /**
     * Gets the value of the noCredToPLAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PARTAOI.NoCredToPLAmt }
     *     
     */
    public PARTAOI.NoCredToPLAmt getNoCredToPLAmt() {
        return noCredToPLAmt;
    }

    /**
     * Sets the value of the noCredToPLAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTAOI.NoCredToPLAmt }
     *     
     */
    public void setNoCredToPLAmt(PARTAOI.NoCredToPLAmt value) {
        this.noCredToPLAmt = value;
    }

    /**
     * Gets the value of the amtDisallUs36 property.
     * 
     * @return
     *     possible object is
     *     {@link PARTAOI.AmtDisallUs36 }
     *     
     */
    public PARTAOI.AmtDisallUs36 getAmtDisallUs36() {
        return amtDisallUs36;
    }

    /**
     * Sets the value of the amtDisallUs36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTAOI.AmtDisallUs36 }
     *     
     */
    public void setAmtDisallUs36(PARTAOI.AmtDisallUs36 value) {
        this.amtDisallUs36 = value;
    }

    /**
     * Gets the value of the amtDisallUs37 property.
     * 
     * @return
     *     possible object is
     *     {@link PARTAOI.AmtDisallUs37 }
     *     
     */
    public PARTAOI.AmtDisallUs37 getAmtDisallUs37() {
        return amtDisallUs37;
    }

    /**
     * Sets the value of the amtDisallUs37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTAOI.AmtDisallUs37 }
     *     
     */
    public void setAmtDisallUs37(PARTAOI.AmtDisallUs37 value) {
        this.amtDisallUs37 = value;
    }

    /**
     * Gets the value of the amtDisallUs40 property.
     * 
     * @return
     *     possible object is
     *     {@link PARTAOI.AmtDisallUs40 }
     *     
     */
    public PARTAOI.AmtDisallUs40 getAmtDisallUs40() {
        return amtDisallUs40;
    }

    /**
     * Sets the value of the amtDisallUs40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTAOI.AmtDisallUs40 }
     *     
     */
    public void setAmtDisallUs40(PARTAOI.AmtDisallUs40 value) {
        this.amtDisallUs40 = value;
    }

    /**
     * Gets the value of the amtDisallUs40A property.
     * 
     * @return
     *     possible object is
     *     {@link PARTAOI.AmtDisallUs40A }
     *     
     */
    public PARTAOI.AmtDisallUs40A getAmtDisallUs40A() {
        return amtDisallUs40A;
    }

    /**
     * Sets the value of the amtDisallUs40A property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTAOI.AmtDisallUs40A }
     *     
     */
    public void setAmtDisallUs40A(PARTAOI.AmtDisallUs40A value) {
        this.amtDisallUs40A = value;
    }

    /**
     * Gets the value of the amtDisallUs43BPyNowAll property.
     * 
     * @return
     *     possible object is
     *     {@link PARTAOI.AmtDisallUs43BPyNowAll }
     *     
     */
    public PARTAOI.AmtDisallUs43BPyNowAll getAmtDisallUs43BPyNowAll() {
        return amtDisallUs43BPyNowAll;
    }

    /**
     * Sets the value of the amtDisallUs43BPyNowAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTAOI.AmtDisallUs43BPyNowAll }
     *     
     */
    public void setAmtDisallUs43BPyNowAll(PARTAOI.AmtDisallUs43BPyNowAll value) {
        this.amtDisallUs43BPyNowAll = value;
    }

    /**
     * Gets the value of the amtDisall43B property.
     * 
     * @return
     *     possible object is
     *     {@link PARTAOI.AmtDisall43B }
     *     
     */
    public PARTAOI.AmtDisall43B getAmtDisall43B() {
        return amtDisall43B;
    }

    /**
     * Sets the value of the amtDisall43B property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTAOI.AmtDisall43B }
     *     
     */
    public void setAmtDisall43B(PARTAOI.AmtDisall43B value) {
        this.amtDisall43B = value;
    }

    /**
     * Gets the value of the amtExciseCustomsVATOutstanding property.
     * 
     * @return
     *     possible object is
     *     {@link PARTAOI.AmtExciseCustomsVATOutstanding }
     *     
     */
    public PARTAOI.AmtExciseCustomsVATOutstanding getAmtExciseCustomsVATOutstanding() {
        return amtExciseCustomsVATOutstanding;
    }

    /**
     * Sets the value of the amtExciseCustomsVATOutstanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTAOI.AmtExciseCustomsVATOutstanding }
     *     
     */
    public void setAmtExciseCustomsVATOutstanding(PARTAOI.AmtExciseCustomsVATOutstanding value) {
        this.amtExciseCustomsVATOutstanding = value;
    }

    /**
     * Gets the value of the deemedProfUs33ABs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeemedProfUs33ABs() {
        return deemedProfUs33ABs;
    }

    /**
     * Sets the value of the deemedProfUs33ABs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeemedProfUs33ABs(BigInteger value) {
        this.deemedProfUs33ABs = value;
    }

    /**
     * Gets the value of the profTaxAmtUs41 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProfTaxAmtUs41() {
        return profTaxAmtUs41;
    }

    /**
     * Sets the value of the profTaxAmtUs41 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProfTaxAmtUs41(BigInteger value) {
        this.profTaxAmtUs41 = value;
    }

    /**
     * Gets the value of the priorAmtIncCrDrPL property.
     * 
     */
    public long getPriorAmtIncCrDrPL() {
        return priorAmtIncCrDrPL;
    }

    /**
     * Sets the value of the priorAmtIncCrDrPL property.
     * 
     */
    public void setPriorAmtIncCrDrPL(long value) {
        this.priorAmtIncCrDrPL = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}AmtUs43B"/>
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
        "amtUs43B"
    })
    public static class AmtDisall43B {

        @XmlElement(name = "AmtUs43B", required = true)
        protected AmtUs43B amtUs43B;

        /**
         * Gets the value of the amtUs43B property.
         * 
         * @return
         *     possible object is
         *     {@link AmtUs43B }
         *     
         */
        public AmtUs43B getAmtUs43B() {
            return amtUs43B;
        }

        /**
         * Sets the value of the amtUs43B property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmtUs43B }
         *     
         */
        public void setAmtUs43B(AmtUs43B value) {
            this.amtUs43B = value;
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
     *         &lt;element name="StkInsurPrem">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="EmpHealthInsurPrem">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="EmpBonusCommSum">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IntOnBorrCap">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ZeroCoupBondDisc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RecogPFContribAmt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AppSuperAnnFundAmt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AppGratFundAmt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OthFundAmt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BadDebtDoubtAmt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BadDebtDoubtProvn">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SpecResrvTranfr">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FamPlanPromoExp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="EmpContributionCredits">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OthDisallowances">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotAmtDisallUs36">
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
        "stkInsurPrem",
        "empHealthInsurPrem",
        "empBonusCommSum",
        "intOnBorrCap",
        "zeroCoupBondDisc",
        "recogPFContribAmt",
        "appSuperAnnFundAmt",
        "appGratFundAmt",
        "othFundAmt",
        "badDebtDoubtAmt",
        "badDebtDoubtProvn",
        "specResrvTranfr",
        "famPlanPromoExp",
        "empContributionCredits",
        "othDisallowances",
        "totAmtDisallUs36"
    })
    public static class AmtDisallUs36 {

        @XmlElement(name = "StkInsurPrem", required = true, defaultValue = "0")
        protected BigInteger stkInsurPrem;
        @XmlElement(name = "EmpHealthInsurPrem", required = true, defaultValue = "0")
        protected BigInteger empHealthInsurPrem;
        @XmlElement(name = "EmpBonusCommSum", required = true, defaultValue = "0")
        protected BigInteger empBonusCommSum;
        @XmlElement(name = "IntOnBorrCap", required = true, defaultValue = "0")
        protected BigInteger intOnBorrCap;
        @XmlElement(name = "ZeroCoupBondDisc", required = true, defaultValue = "0")
        protected BigInteger zeroCoupBondDisc;
        @XmlElement(name = "RecogPFContribAmt", required = true, defaultValue = "0")
        protected BigInteger recogPFContribAmt;
        @XmlElement(name = "AppSuperAnnFundAmt", required = true, defaultValue = "0")
        protected BigInteger appSuperAnnFundAmt;
        @XmlElement(name = "AppGratFundAmt", required = true, defaultValue = "0")
        protected BigInteger appGratFundAmt;
        @XmlElement(name = "OthFundAmt", required = true, defaultValue = "0")
        protected BigInteger othFundAmt;
        @XmlElement(name = "BadDebtDoubtAmt", required = true, defaultValue = "0")
        protected BigInteger badDebtDoubtAmt;
        @XmlElement(name = "BadDebtDoubtProvn", required = true, defaultValue = "0")
        protected BigInteger badDebtDoubtProvn;
        @XmlElement(name = "SpecResrvTranfr", required = true, defaultValue = "0")
        protected BigInteger specResrvTranfr;
        @XmlElement(name = "FamPlanPromoExp", required = true, defaultValue = "0")
        protected BigInteger famPlanPromoExp;
        @XmlElement(name = "EmpContributionCredits", required = true, defaultValue = "0")
        protected BigInteger empContributionCredits;
        @XmlElement(name = "OthDisallowances", required = true, defaultValue = "0")
        protected BigInteger othDisallowances;
        @XmlElement(name = "TotAmtDisallUs36", required = true, defaultValue = "0")
        protected BigInteger totAmtDisallUs36;

        /**
         * Gets the value of the stkInsurPrem property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStkInsurPrem() {
            return stkInsurPrem;
        }

        /**
         * Sets the value of the stkInsurPrem property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStkInsurPrem(BigInteger value) {
            this.stkInsurPrem = value;
        }

        /**
         * Gets the value of the empHealthInsurPrem property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEmpHealthInsurPrem() {
            return empHealthInsurPrem;
        }

        /**
         * Sets the value of the empHealthInsurPrem property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEmpHealthInsurPrem(BigInteger value) {
            this.empHealthInsurPrem = value;
        }

        /**
         * Gets the value of the empBonusCommSum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEmpBonusCommSum() {
            return empBonusCommSum;
        }

        /**
         * Sets the value of the empBonusCommSum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEmpBonusCommSum(BigInteger value) {
            this.empBonusCommSum = value;
        }

        /**
         * Gets the value of the intOnBorrCap property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIntOnBorrCap() {
            return intOnBorrCap;
        }

        /**
         * Sets the value of the intOnBorrCap property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIntOnBorrCap(BigInteger value) {
            this.intOnBorrCap = value;
        }

        /**
         * Gets the value of the zeroCoupBondDisc property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getZeroCoupBondDisc() {
            return zeroCoupBondDisc;
        }

        /**
         * Sets the value of the zeroCoupBondDisc property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setZeroCoupBondDisc(BigInteger value) {
            this.zeroCoupBondDisc = value;
        }

        /**
         * Gets the value of the recogPFContribAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRecogPFContribAmt() {
            return recogPFContribAmt;
        }

        /**
         * Sets the value of the recogPFContribAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRecogPFContribAmt(BigInteger value) {
            this.recogPFContribAmt = value;
        }

        /**
         * Gets the value of the appSuperAnnFundAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAppSuperAnnFundAmt() {
            return appSuperAnnFundAmt;
        }

        /**
         * Sets the value of the appSuperAnnFundAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAppSuperAnnFundAmt(BigInteger value) {
            this.appSuperAnnFundAmt = value;
        }

        /**
         * Gets the value of the appGratFundAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAppGratFundAmt() {
            return appGratFundAmt;
        }

        /**
         * Sets the value of the appGratFundAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAppGratFundAmt(BigInteger value) {
            this.appGratFundAmt = value;
        }

        /**
         * Gets the value of the othFundAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOthFundAmt() {
            return othFundAmt;
        }

        /**
         * Sets the value of the othFundAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOthFundAmt(BigInteger value) {
            this.othFundAmt = value;
        }

        /**
         * Gets the value of the badDebtDoubtAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBadDebtDoubtAmt() {
            return badDebtDoubtAmt;
        }

        /**
         * Sets the value of the badDebtDoubtAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBadDebtDoubtAmt(BigInteger value) {
            this.badDebtDoubtAmt = value;
        }

        /**
         * Gets the value of the badDebtDoubtProvn property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBadDebtDoubtProvn() {
            return badDebtDoubtProvn;
        }

        /**
         * Sets the value of the badDebtDoubtProvn property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBadDebtDoubtProvn(BigInteger value) {
            this.badDebtDoubtProvn = value;
        }

        /**
         * Gets the value of the specResrvTranfr property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSpecResrvTranfr() {
            return specResrvTranfr;
        }

        /**
         * Sets the value of the specResrvTranfr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSpecResrvTranfr(BigInteger value) {
            this.specResrvTranfr = value;
        }

        /**
         * Gets the value of the famPlanPromoExp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFamPlanPromoExp() {
            return famPlanPromoExp;
        }

        /**
         * Sets the value of the famPlanPromoExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFamPlanPromoExp(BigInteger value) {
            this.famPlanPromoExp = value;
        }

        /**
         * Gets the value of the empContributionCredits property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEmpContributionCredits() {
            return empContributionCredits;
        }

        /**
         * Sets the value of the empContributionCredits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEmpContributionCredits(BigInteger value) {
            this.empContributionCredits = value;
        }

        /**
         * Gets the value of the othDisallowances property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOthDisallowances() {
            return othDisallowances;
        }

        /**
         * Sets the value of the othDisallowances property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOthDisallowances(BigInteger value) {
            this.othDisallowances = value;
        }

        /**
         * Gets the value of the totAmtDisallUs36 property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotAmtDisallUs36() {
            return totAmtDisallUs36;
        }

        /**
         * Sets the value of the totAmtDisallUs36 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotAmtDisallUs36(BigInteger value) {
            this.totAmtDisallUs36 = value;
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
     *         &lt;element name="PersonalExp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PoliticPartyExp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="LawVoilatPenalExp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OthPenalFineExp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OffenceExp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ContigentLiability">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AmtNotPartTotInc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OthAmtNotAllowUs37">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotAmtDisallUs37">
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
        "personalExp",
        "politicPartyExp",
        "lawVoilatPenalExp",
        "othPenalFineExp",
        "offenceExp",
        "contigentLiability",
        "amtNotPartTotInc",
        "othAmtNotAllowUs37",
        "totAmtDisallUs37"
    })
    public static class AmtDisallUs37 {

        @XmlElement(name = "PersonalExp", required = true, defaultValue = "0")
        protected BigInteger personalExp;
        @XmlElement(name = "PoliticPartyExp", required = true, defaultValue = "0")
        protected BigInteger politicPartyExp;
        @XmlElement(name = "LawVoilatPenalExp", required = true, defaultValue = "0")
        protected BigInteger lawVoilatPenalExp;
        @XmlElement(name = "OthPenalFineExp", required = true, defaultValue = "0")
        protected BigInteger othPenalFineExp;
        @XmlElement(name = "OffenceExp", required = true, defaultValue = "0")
        protected BigInteger offenceExp;
        @XmlElement(name = "ContigentLiability", required = true, defaultValue = "0")
        protected BigInteger contigentLiability;
        @XmlElement(name = "AmtNotPartTotInc", required = true, defaultValue = "0")
        protected BigInteger amtNotPartTotInc;
        @XmlElement(name = "OthAmtNotAllowUs37", required = true, defaultValue = "0")
        protected BigInteger othAmtNotAllowUs37;
        @XmlElement(name = "TotAmtDisallUs37", required = true, defaultValue = "0")
        protected BigInteger totAmtDisallUs37;

        /**
         * Gets the value of the personalExp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPersonalExp() {
            return personalExp;
        }

        /**
         * Sets the value of the personalExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPersonalExp(BigInteger value) {
            this.personalExp = value;
        }

        /**
         * Gets the value of the politicPartyExp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPoliticPartyExp() {
            return politicPartyExp;
        }

        /**
         * Sets the value of the politicPartyExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPoliticPartyExp(BigInteger value) {
            this.politicPartyExp = value;
        }

        /**
         * Gets the value of the lawVoilatPenalExp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLawVoilatPenalExp() {
            return lawVoilatPenalExp;
        }

        /**
         * Sets the value of the lawVoilatPenalExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLawVoilatPenalExp(BigInteger value) {
            this.lawVoilatPenalExp = value;
        }

        /**
         * Gets the value of the othPenalFineExp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOthPenalFineExp() {
            return othPenalFineExp;
        }

        /**
         * Sets the value of the othPenalFineExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOthPenalFineExp(BigInteger value) {
            this.othPenalFineExp = value;
        }

        /**
         * Gets the value of the offenceExp property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOffenceExp() {
            return offenceExp;
        }

        /**
         * Sets the value of the offenceExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOffenceExp(BigInteger value) {
            this.offenceExp = value;
        }

        /**
         * Gets the value of the contigentLiability property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getContigentLiability() {
            return contigentLiability;
        }

        /**
         * Sets the value of the contigentLiability property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setContigentLiability(BigInteger value) {
            this.contigentLiability = value;
        }

        /**
         * Gets the value of the amtNotPartTotInc property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmtNotPartTotInc() {
            return amtNotPartTotInc;
        }

        /**
         * Sets the value of the amtNotPartTotInc property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmtNotPartTotInc(BigInteger value) {
            this.amtNotPartTotInc = value;
        }

        /**
         * Gets the value of the othAmtNotAllowUs37 property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOthAmtNotAllowUs37() {
            return othAmtNotAllowUs37;
        }

        /**
         * Sets the value of the othAmtNotAllowUs37 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOthAmtNotAllowUs37(BigInteger value) {
            this.othAmtNotAllowUs37 = value;
        }

        /**
         * Gets the value of the totAmtDisallUs37 property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotAmtDisallUs37() {
            return totAmtDisallUs37;
        }

        /**
         * Sets the value of the totAmtDisallUs37 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotAmtDisallUs37(BigInteger value) {
            this.totAmtDisallUs37 = value;
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
     *         &lt;element name="NonCompChapXVIIBAmt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="STTAmt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FBTAmt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TaxAmtOnProfits">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="WTAmt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IntSalBonPartner">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OthDisallow">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotAmtDisallUs40">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AmtDisallUs40PyNowAll">
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
        "nonCompChapXVIIBAmt",
        "sttAmt",
        "fbtAmt",
        "taxAmtOnProfits",
        "wtAmt",
        "intSalBonPartner",
        "othDisallow",
        "totAmtDisallUs40",
        "amtDisallUs40PyNowAll"
    })
    public static class AmtDisallUs40 {

        @XmlElement(name = "NonCompChapXVIIBAmt", required = true, defaultValue = "0")
        protected BigInteger nonCompChapXVIIBAmt;
        @XmlElement(name = "STTAmt", required = true, defaultValue = "0")
        protected BigInteger sttAmt;
        @XmlElement(name = "FBTAmt", required = true, defaultValue = "0")
        protected BigInteger fbtAmt;
        @XmlElement(name = "TaxAmtOnProfits", required = true, defaultValue = "0")
        protected BigInteger taxAmtOnProfits;
        @XmlElement(name = "WTAmt", required = true, defaultValue = "0")
        protected BigInteger wtAmt;
        @XmlElement(name = "IntSalBonPartner", required = true, defaultValue = "0")
        protected BigInteger intSalBonPartner;
        @XmlElement(name = "OthDisallow", required = true, defaultValue = "0")
        protected BigInteger othDisallow;
        @XmlElement(name = "TotAmtDisallUs40", required = true, defaultValue = "0")
        protected BigInteger totAmtDisallUs40;
        @XmlElement(name = "AmtDisallUs40PyNowAll", required = true, defaultValue = "0")
        protected BigInteger amtDisallUs40PyNowAll;

        /**
         * Gets the value of the nonCompChapXVIIBAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNonCompChapXVIIBAmt() {
            return nonCompChapXVIIBAmt;
        }

        /**
         * Sets the value of the nonCompChapXVIIBAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNonCompChapXVIIBAmt(BigInteger value) {
            this.nonCompChapXVIIBAmt = value;
        }

        /**
         * Gets the value of the sttAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSTTAmt() {
            return sttAmt;
        }

        /**
         * Sets the value of the sttAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSTTAmt(BigInteger value) {
            this.sttAmt = value;
        }

        /**
         * Gets the value of the fbtAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFBTAmt() {
            return fbtAmt;
        }

        /**
         * Sets the value of the fbtAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFBTAmt(BigInteger value) {
            this.fbtAmt = value;
        }

        /**
         * Gets the value of the taxAmtOnProfits property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTaxAmtOnProfits() {
            return taxAmtOnProfits;
        }

        /**
         * Sets the value of the taxAmtOnProfits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTaxAmtOnProfits(BigInteger value) {
            this.taxAmtOnProfits = value;
        }

        /**
         * Gets the value of the wtAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWTAmt() {
            return wtAmt;
        }

        /**
         * Sets the value of the wtAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWTAmt(BigInteger value) {
            this.wtAmt = value;
        }

        /**
         * Gets the value of the intSalBonPartner property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIntSalBonPartner() {
            return intSalBonPartner;
        }

        /**
         * Sets the value of the intSalBonPartner property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIntSalBonPartner(BigInteger value) {
            this.intSalBonPartner = value;
        }

        /**
         * Gets the value of the othDisallow property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOthDisallow() {
            return othDisallow;
        }

        /**
         * Sets the value of the othDisallow property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOthDisallow(BigInteger value) {
            this.othDisallow = value;
        }

        /**
         * Gets the value of the totAmtDisallUs40 property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotAmtDisallUs40() {
            return totAmtDisallUs40;
        }

        /**
         * Sets the value of the totAmtDisallUs40 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotAmtDisallUs40(BigInteger value) {
            this.totAmtDisallUs40 = value;
        }

        /**
         * Gets the value of the amtDisallUs40PyNowAll property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmtDisallUs40PyNowAll() {
            return amtDisallUs40PyNowAll;
        }

        /**
         * Sets the value of the amtDisallUs40PyNowAll property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmtDisallUs40PyNowAll(BigInteger value) {
            this.amtDisallUs40PyNowAll = value;
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
     *         &lt;element name="AmtPaidUs40A2b">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AmtGT20kCash">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ProvPmtGrat">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ContToSetupTrust">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OthDisallow">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotAmtDisallUs40A">
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
        "amtPaidUs40A2B",
        "amtGT20KCash",
        "provPmtGrat",
        "contToSetupTrust",
        "othDisallow",
        "totAmtDisallUs40A"
    })
    public static class AmtDisallUs40A {

        @XmlElement(name = "AmtPaidUs40A2b", required = true, defaultValue = "0")
        protected BigInteger amtPaidUs40A2B;
        @XmlElement(name = "AmtGT20kCash", required = true, defaultValue = "0")
        protected BigInteger amtGT20KCash;
        @XmlElement(name = "ProvPmtGrat", required = true, defaultValue = "0")
        protected BigInteger provPmtGrat;
        @XmlElement(name = "ContToSetupTrust", required = true, defaultValue = "0")
        protected BigInteger contToSetupTrust;
        @XmlElement(name = "OthDisallow", required = true, defaultValue = "0")
        protected BigInteger othDisallow;
        @XmlElement(name = "TotAmtDisallUs40A", required = true, defaultValue = "0")
        protected BigInteger totAmtDisallUs40A;

        /**
         * Gets the value of the amtPaidUs40A2B property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmtPaidUs40A2B() {
            return amtPaidUs40A2B;
        }

        /**
         * Sets the value of the amtPaidUs40A2B property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmtPaidUs40A2B(BigInteger value) {
            this.amtPaidUs40A2B = value;
        }

        /**
         * Gets the value of the amtGT20KCash property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmtGT20KCash() {
            return amtGT20KCash;
        }

        /**
         * Sets the value of the amtGT20KCash property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmtGT20KCash(BigInteger value) {
            this.amtGT20KCash = value;
        }

        /**
         * Gets the value of the provPmtGrat property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getProvPmtGrat() {
            return provPmtGrat;
        }

        /**
         * Sets the value of the provPmtGrat property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setProvPmtGrat(BigInteger value) {
            this.provPmtGrat = value;
        }

        /**
         * Gets the value of the contToSetupTrust property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getContToSetupTrust() {
            return contToSetupTrust;
        }

        /**
         * Sets the value of the contToSetupTrust property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setContToSetupTrust(BigInteger value) {
            this.contToSetupTrust = value;
        }

        /**
         * Gets the value of the othDisallow property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOthDisallow() {
            return othDisallow;
        }

        /**
         * Sets the value of the othDisallow property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOthDisallow(BigInteger value) {
            this.othDisallow = value;
        }

        /**
         * Gets the value of the totAmtDisallUs40A property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotAmtDisallUs40A() {
            return totAmtDisallUs40A;
        }

        /**
         * Sets the value of the totAmtDisallUs40A property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotAmtDisallUs40A(BigInteger value) {
            this.totAmtDisallUs40A = value;
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
     *         &lt;element ref="{http://incometaxindiaefiling.gov.in/master}AmtUs43B"/>
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
        "amtUs43B"
    })
    public static class AmtDisallUs43BPyNowAll {

        @XmlElement(name = "AmtUs43B", required = true)
        protected AmtUs43B amtUs43B;

        /**
         * Gets the value of the amtUs43B property.
         * 
         * @return
         *     possible object is
         *     {@link AmtUs43B }
         *     
         */
        public AmtUs43B getAmtUs43B() {
            return amtUs43B;
        }

        /**
         * Sets the value of the amtUs43B property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmtUs43B }
         *     
         */
        public void setAmtUs43B(AmtUs43B value) {
            this.amtUs43B = value;
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
    public static class AmtExciseCustomsVATOutstanding {

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
     *         &lt;element name="ValRawMaterial">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="1"/>
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *               &lt;enumeration value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ValFinishedGoods">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="1"/>
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *               &lt;enumeration value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ChngStockValMetFlg">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="1"/>
     *               &lt;enumeration value="N"/>
     *               &lt;enumeration value="Y"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="EffectOnPL">
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
        "valRawMaterial",
        "valFinishedGoods",
        "chngStockValMetFlg",
        "effectOnPL"
    })
    public static class MethodOfValClgStk {

        @XmlElement(name = "ValRawMaterial", required = true, defaultValue = "1")
        protected String valRawMaterial;
        @XmlElement(name = "ValFinishedGoods", required = true, defaultValue = "1")
        protected String valFinishedGoods;
        @XmlElement(name = "ChngStockValMetFlg", required = true, defaultValue = "N")
        protected String chngStockValMetFlg;
        @XmlElement(name = "EffectOnPL", defaultValue = "0")
        protected long effectOnPL;

        /**
         * Gets the value of the valRawMaterial property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValRawMaterial() {
            return valRawMaterial;
        }

        /**
         * Sets the value of the valRawMaterial property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValRawMaterial(String value) {
            this.valRawMaterial = value;
        }

        /**
         * Gets the value of the valFinishedGoods property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValFinishedGoods() {
            return valFinishedGoods;
        }

        /**
         * Sets the value of the valFinishedGoods property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValFinishedGoods(String value) {
            this.valFinishedGoods = value;
        }

        /**
         * Gets the value of the chngStockValMetFlg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChngStockValMetFlg() {
            return chngStockValMetFlg;
        }

        /**
         * Sets the value of the chngStockValMetFlg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChngStockValMetFlg(String value) {
            this.chngStockValMetFlg = value;
        }

        /**
         * Gets the value of the effectOnPL property.
         * 
         */
        public long getEffectOnPL() {
            return effectOnPL;
        }

        /**
         * Sets the value of the effectOnPL property.
         * 
         */
        public void setEffectOnPL(long value) {
            this.effectOnPL = value;
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
     *         &lt;element name="Section28Items">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ProformaCreditsDue">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PrevYrEscalClaim">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OthItemInc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CapReceipt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotNoCredToPLAmt">
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
        "section28Items",
        "proformaCreditsDue",
        "prevYrEscalClaim",
        "othItemInc",
        "capReceipt",
        "totNoCredToPLAmt"
    })
    public static class NoCredToPLAmt {

        @XmlElement(name = "Section28Items", required = true, defaultValue = "0")
        protected BigInteger section28Items;
        @XmlElement(name = "ProformaCreditsDue", required = true, defaultValue = "0")
        protected BigInteger proformaCreditsDue;
        @XmlElement(name = "PrevYrEscalClaim", required = true, defaultValue = "0")
        protected BigInteger prevYrEscalClaim;
        @XmlElement(name = "OthItemInc", required = true, defaultValue = "0")
        protected BigInteger othItemInc;
        @XmlElement(name = "CapReceipt", required = true, defaultValue = "0")
        protected BigInteger capReceipt;
        @XmlElement(name = "TotNoCredToPLAmt", required = true, defaultValue = "0")
        protected BigInteger totNoCredToPLAmt;

        /**
         * Gets the value of the section28Items property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSection28Items() {
            return section28Items;
        }

        /**
         * Sets the value of the section28Items property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSection28Items(BigInteger value) {
            this.section28Items = value;
        }

        /**
         * Gets the value of the proformaCreditsDue property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getProformaCreditsDue() {
            return proformaCreditsDue;
        }

        /**
         * Sets the value of the proformaCreditsDue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setProformaCreditsDue(BigInteger value) {
            this.proformaCreditsDue = value;
        }

        /**
         * Gets the value of the prevYrEscalClaim property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPrevYrEscalClaim() {
            return prevYrEscalClaim;
        }

        /**
         * Sets the value of the prevYrEscalClaim property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPrevYrEscalClaim(BigInteger value) {
            this.prevYrEscalClaim = value;
        }

        /**
         * Gets the value of the othItemInc property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOthItemInc() {
            return othItemInc;
        }

        /**
         * Sets the value of the othItemInc property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOthItemInc(BigInteger value) {
            this.othItemInc = value;
        }

        /**
         * Gets the value of the capReceipt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCapReceipt() {
            return capReceipt;
        }

        /**
         * Sets the value of the capReceipt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCapReceipt(BigInteger value) {
            this.capReceipt = value;
        }

        /**
         * Gets the value of the totNoCredToPLAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotNoCredToPLAmt() {
            return totNoCredToPLAmt;
        }

        /**
         * Sets the value of the totNoCredToPLAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotNoCredToPLAmt(BigInteger value) {
            this.totNoCredToPLAmt = value;
        }

    }

}
