
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
 *         &lt;element name="BusinessIncOthThanSpec">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProfBfrTaxPL">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NetPLFromSpecBus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NetPLFromSpecifiedBus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="IncRecCredPLOthHeads">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PLUs44sChapXIIG">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="IncCredPL">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FirmShareInc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AOPBOISharInc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OthExempInc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TotExempIncPL">
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
 *                   &lt;element name="BalancePLOthThanSpecBus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ExpDebToPLOthHeads">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ExpDebToPLExemptInc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotExpDebPL">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AdjustedPLOthThanSpecBus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DepreciationDebPLCosAct">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DepreciationAllowITAct32">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DepreciationAllowUs32_1_ii">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DepreciationAllowUs32_1_i">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TotDeprAllowITAct">
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
 *                   &lt;element name="AdjustPLAfterDeprOthSpecInc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AmtDebPLDisallowUs36">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AmtDebPLDisallowUs37">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AmtDebPLDisallowUs40">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AmtDebPLDisallowUs40A">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AmtDebPLDisallowUs43B">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="InterestDisAllowUs23SMEAct">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DeemIncUs41">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DeemIncUs3380HHD80IA">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OthItemDisallowUs28To44DA">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AnyOthIncNotInclInExpDisallowPL">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotAfterAddToPLDeprOthSpecInc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DeductUs32_1_iii">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DebPLUs35ExcessAmt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AmtDisallUs40NowAllow">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AmtDisallUs43BNowAllow">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DeductUs35AC">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DebPL35ACAmt">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AmtAllowUs35ACt">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ExcessAmtDeduct35AC">
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
 *                   &lt;element name="AnyOthAmtAllDeduct">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TotDeductionAmts">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PLAftAdjDedBusOthThanSpec">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DeemedProfitBusUs">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Section44AD">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Section44AE">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Section44AF">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Section44B">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Section44BB">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Section44BBA">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Section44BBB">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Section44D">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Section44DA">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ChapterXIIG">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FirstSchTAct">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TotDeemedProfitBusUs">
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
 *                   &lt;element name="ProfitLossBfrDeductUs10s">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DeductionUs10s">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Section10A">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Section10AA">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Section10B">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Section10BA">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                   &lt;totalDigits value="14"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TotDeductionUs10s">
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
 *                   &lt;element name="NetPLAftAdjBusOthThanSpec">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NetPLBusOthThanSpec7A7B7C">
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
 *         &lt;element name="SpecBusinessInc">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NetPLFrmSpecBus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AdditionUs28to44DA">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DeductUs28to44DA">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AdjustedPLFrmSpecuBus">
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
 *         &lt;element name="SpecifiedBusinessInc">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NetPLFrmSpecifiedBus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DeductionUs35AD">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                         &lt;totalDigits value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PLFrmSpecifiedBus">
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
 *         &lt;element name="IncChrgUnHdProftGain">
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
    "businessIncOthThanSpec",
    "specBusinessInc",
    "specifiedBusinessInc",
    "incChrgUnHdProftGain"
})
@XmlRootElement(name = "ITR4ScheduleBP")
public class ITR4ScheduleBP {

    @XmlElement(name = "BusinessIncOthThanSpec", required = true)
    protected ITR4ScheduleBP.BusinessIncOthThanSpec businessIncOthThanSpec;
    @XmlElement(name = "SpecBusinessInc", required = true)
    protected ITR4ScheduleBP.SpecBusinessInc specBusinessInc;
    @XmlElement(name = "SpecifiedBusinessInc", required = true)
    protected ITR4ScheduleBP.SpecifiedBusinessInc specifiedBusinessInc;
    @XmlElement(name = "IncChrgUnHdProftGain", defaultValue = "0")
    protected long incChrgUnHdProftGain;

    /**
     * Gets the value of the businessIncOthThanSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ITR4ScheduleBP.BusinessIncOthThanSpec }
     *     
     */
    public ITR4ScheduleBP.BusinessIncOthThanSpec getBusinessIncOthThanSpec() {
        return businessIncOthThanSpec;
    }

    /**
     * Sets the value of the businessIncOthThanSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ITR4ScheduleBP.BusinessIncOthThanSpec }
     *     
     */
    public void setBusinessIncOthThanSpec(ITR4ScheduleBP.BusinessIncOthThanSpec value) {
        this.businessIncOthThanSpec = value;
    }

    /**
     * Gets the value of the specBusinessInc property.
     * 
     * @return
     *     possible object is
     *     {@link ITR4ScheduleBP.SpecBusinessInc }
     *     
     */
    public ITR4ScheduleBP.SpecBusinessInc getSpecBusinessInc() {
        return specBusinessInc;
    }

    /**
     * Sets the value of the specBusinessInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ITR4ScheduleBP.SpecBusinessInc }
     *     
     */
    public void setSpecBusinessInc(ITR4ScheduleBP.SpecBusinessInc value) {
        this.specBusinessInc = value;
    }

    /**
     * Gets the value of the specifiedBusinessInc property.
     * 
     * @return
     *     possible object is
     *     {@link ITR4ScheduleBP.SpecifiedBusinessInc }
     *     
     */
    public ITR4ScheduleBP.SpecifiedBusinessInc getSpecifiedBusinessInc() {
        return specifiedBusinessInc;
    }

    /**
     * Sets the value of the specifiedBusinessInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ITR4ScheduleBP.SpecifiedBusinessInc }
     *     
     */
    public void setSpecifiedBusinessInc(ITR4ScheduleBP.SpecifiedBusinessInc value) {
        this.specifiedBusinessInc = value;
    }

    /**
     * Gets the value of the incChrgUnHdProftGain property.
     * 
     */
    public long getIncChrgUnHdProftGain() {
        return incChrgUnHdProftGain;
    }

    /**
     * Sets the value of the incChrgUnHdProftGain property.
     * 
     */
    public void setIncChrgUnHdProftGain(long value) {
        this.incChrgUnHdProftGain = value;
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
     *         &lt;element name="ProfBfrTaxPL">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NetPLFromSpecBus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NetPLFromSpecifiedBus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IncRecCredPLOthHeads">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PLUs44sChapXIIG">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IncCredPL">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FirmShareInc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AOPBOISharInc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="OthExempInc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TotExempIncPL">
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
     *         &lt;element name="BalancePLOthThanSpecBus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ExpDebToPLOthHeads">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ExpDebToPLExemptInc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotExpDebPL">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AdjustedPLOthThanSpecBus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DepreciationDebPLCosAct">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DepreciationAllowITAct32">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DepreciationAllowUs32_1_ii">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DepreciationAllowUs32_1_i">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TotDeprAllowITAct">
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
     *         &lt;element name="AdjustPLAfterDeprOthSpecInc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AmtDebPLDisallowUs36">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AmtDebPLDisallowUs37">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AmtDebPLDisallowUs40">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AmtDebPLDisallowUs40A">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AmtDebPLDisallowUs43B">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="InterestDisAllowUs23SMEAct">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DeemIncUs41">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DeemIncUs3380HHD80IA">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OthItemDisallowUs28To44DA">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AnyOthIncNotInclInExpDisallowPL">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotAfterAddToPLDeprOthSpecInc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DeductUs32_1_iii">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DebPLUs35ExcessAmt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AmtDisallUs40NowAllow">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AmtDisallUs43BNowAllow">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DeductUs35AC">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DebPL35ACAmt">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AmtAllowUs35ACt">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ExcessAmtDeduct35AC">
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
     *         &lt;element name="AnyOthAmtAllDeduct">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TotDeductionAmts">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PLAftAdjDedBusOthThanSpec">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DeemedProfitBusUs">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Section44AD">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Section44AE">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Section44AF">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Section44B">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Section44BB">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Section44BBA">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Section44BBB">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Section44D">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Section44DA">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ChapterXIIG">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FirstSchTAct">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TotDeemedProfitBusUs">
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
     *         &lt;element name="ProfitLossBfrDeductUs10s">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DeductionUs10s">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Section10A">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Section10AA">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Section10B">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Section10BA">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *                         &lt;totalDigits value="14"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TotDeductionUs10s">
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
     *         &lt;element name="NetPLAftAdjBusOthThanSpec">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NetPLBusOthThanSpec7A7B7C">
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
        "profBfrTaxPL",
        "netPLFromSpecBus",
        "netPLFromSpecifiedBus",
        "incRecCredPLOthHeads",
        "plUs44SChapXIIG",
        "incCredPL",
        "balancePLOthThanSpecBus",
        "expDebToPLOthHeads",
        "expDebToPLExemptInc",
        "totExpDebPL",
        "adjustedPLOthThanSpecBus",
        "depreciationDebPLCosAct",
        "depreciationAllowITAct32",
        "adjustPLAfterDeprOthSpecInc",
        "amtDebPLDisallowUs36",
        "amtDebPLDisallowUs37",
        "amtDebPLDisallowUs40",
        "amtDebPLDisallowUs40A",
        "amtDebPLDisallowUs43B",
        "interestDisAllowUs23SMEAct",
        "deemIncUs41",
        "deemIncUs3380HHD80IA",
        "othItemDisallowUs28To44DA",
        "anyOthIncNotInclInExpDisallowPL",
        "totAfterAddToPLDeprOthSpecInc",
        "deductUs321Iii",
        "debPLUs35ExcessAmt",
        "amtDisallUs40NowAllow",
        "amtDisallUs43BNowAllow",
        "deductUs35AC",
        "anyOthAmtAllDeduct",
        "totDeductionAmts",
        "plAftAdjDedBusOthThanSpec",
        "deemedProfitBusUs",
        "profitLossBfrDeductUs10S",
        "deductionUs10S",
        "netPLAftAdjBusOthThanSpec",
        "netPLBusOthThanSpec7A7B7C"
    })
    public static class BusinessIncOthThanSpec {

        @XmlElement(name = "ProfBfrTaxPL", defaultValue = "0")
        protected long profBfrTaxPL;
        @XmlElement(name = "NetPLFromSpecBus", defaultValue = "0")
        protected long netPLFromSpecBus;
        @XmlElement(name = "NetPLFromSpecifiedBus", defaultValue = "0")
        protected long netPLFromSpecifiedBus;
        @XmlElement(name = "IncRecCredPLOthHeads", defaultValue = "0")
        protected long incRecCredPLOthHeads;
        @XmlElement(name = "PLUs44sChapXIIG", defaultValue = "0")
        protected long plUs44SChapXIIG;
        @XmlElement(name = "IncCredPL", required = true)
        protected ITR4ScheduleBP.BusinessIncOthThanSpec.IncCredPL incCredPL;
        @XmlElement(name = "BalancePLOthThanSpecBus", defaultValue = "0")
        protected long balancePLOthThanSpecBus;
        @XmlElement(name = "ExpDebToPLOthHeads", required = true, defaultValue = "0")
        protected BigInteger expDebToPLOthHeads;
        @XmlElement(name = "ExpDebToPLExemptInc", required = true, defaultValue = "0")
        protected BigInteger expDebToPLExemptInc;
        @XmlElement(name = "TotExpDebPL", required = true, defaultValue = "0")
        protected BigInteger totExpDebPL;
        @XmlElement(name = "AdjustedPLOthThanSpecBus", defaultValue = "0")
        protected long adjustedPLOthThanSpecBus;
        @XmlElement(name = "DepreciationDebPLCosAct", required = true, defaultValue = "0")
        protected BigInteger depreciationDebPLCosAct;
        @XmlElement(name = "DepreciationAllowITAct32", required = true)
        protected ITR4ScheduleBP.BusinessIncOthThanSpec.DepreciationAllowITAct32 depreciationAllowITAct32;
        @XmlElement(name = "AdjustPLAfterDeprOthSpecInc", defaultValue = "0")
        protected long adjustPLAfterDeprOthSpecInc;
        @XmlElement(name = "AmtDebPLDisallowUs36", required = true, defaultValue = "0")
        protected BigInteger amtDebPLDisallowUs36;
        @XmlElement(name = "AmtDebPLDisallowUs37", required = true, defaultValue = "0")
        protected BigInteger amtDebPLDisallowUs37;
        @XmlElement(name = "AmtDebPLDisallowUs40", required = true, defaultValue = "0")
        protected BigInteger amtDebPLDisallowUs40;
        @XmlElement(name = "AmtDebPLDisallowUs40A", required = true, defaultValue = "0")
        protected BigInteger amtDebPLDisallowUs40A;
        @XmlElement(name = "AmtDebPLDisallowUs43B", required = true, defaultValue = "0")
        protected BigInteger amtDebPLDisallowUs43B;
        @XmlElement(name = "InterestDisAllowUs23SMEAct", required = true, defaultValue = "0")
        protected BigInteger interestDisAllowUs23SMEAct;
        @XmlElement(name = "DeemIncUs41", required = true, defaultValue = "0")
        protected BigInteger deemIncUs41;
        @XmlElement(name = "DeemIncUs3380HHD80IA", required = true, defaultValue = "0")
        protected BigInteger deemIncUs3380HHD80IA;
        @XmlElement(name = "OthItemDisallowUs28To44DA", required = true, defaultValue = "0")
        protected BigInteger othItemDisallowUs28To44DA;
        @XmlElement(name = "AnyOthIncNotInclInExpDisallowPL", defaultValue = "0")
        protected long anyOthIncNotInclInExpDisallowPL;
        @XmlElement(name = "TotAfterAddToPLDeprOthSpecInc", defaultValue = "0")
        protected long totAfterAddToPLDeprOthSpecInc;
        @XmlElement(name = "DeductUs32_1_iii", required = true, defaultValue = "0")
        protected BigInteger deductUs321Iii;
        @XmlElement(name = "DebPLUs35ExcessAmt", required = true, defaultValue = "0")
        protected BigInteger debPLUs35ExcessAmt;
        @XmlElement(name = "AmtDisallUs40NowAllow", required = true, defaultValue = "0")
        protected BigInteger amtDisallUs40NowAllow;
        @XmlElement(name = "AmtDisallUs43BNowAllow", required = true, defaultValue = "0")
        protected BigInteger amtDisallUs43BNowAllow;
        @XmlElement(name = "DeductUs35AC", required = true)
        protected ITR4ScheduleBP.BusinessIncOthThanSpec.DeductUs35AC deductUs35AC;
        @XmlElement(name = "AnyOthAmtAllDeduct", required = true, defaultValue = "0")
        protected BigInteger anyOthAmtAllDeduct;
        @XmlElement(name = "TotDeductionAmts", required = true, defaultValue = "0")
        protected BigInteger totDeductionAmts;
        @XmlElement(name = "PLAftAdjDedBusOthThanSpec", defaultValue = "0")
        protected long plAftAdjDedBusOthThanSpec;
        @XmlElement(name = "DeemedProfitBusUs", required = true)
        protected ITR4ScheduleBP.BusinessIncOthThanSpec.DeemedProfitBusUs deemedProfitBusUs;
        @XmlElement(name = "ProfitLossBfrDeductUs10s", defaultValue = "0")
        protected long profitLossBfrDeductUs10S;
        @XmlElement(name = "DeductionUs10s", required = true)
        protected ITR4ScheduleBP.BusinessIncOthThanSpec.DeductionUs10S deductionUs10S;
        @XmlElement(name = "NetPLAftAdjBusOthThanSpec", defaultValue = "0")
        protected long netPLAftAdjBusOthThanSpec;
        @XmlElement(name = "NetPLBusOthThanSpec7A7B7C", defaultValue = "0")
        protected long netPLBusOthThanSpec7A7B7C;

        /**
         * Gets the value of the profBfrTaxPL property.
         * 
         */
        public long getProfBfrTaxPL() {
            return profBfrTaxPL;
        }

        /**
         * Sets the value of the profBfrTaxPL property.
         * 
         */
        public void setProfBfrTaxPL(long value) {
            this.profBfrTaxPL = value;
        }

        /**
         * Gets the value of the netPLFromSpecBus property.
         * 
         */
        public long getNetPLFromSpecBus() {
            return netPLFromSpecBus;
        }

        /**
         * Sets the value of the netPLFromSpecBus property.
         * 
         */
        public void setNetPLFromSpecBus(long value) {
            this.netPLFromSpecBus = value;
        }

        /**
         * Gets the value of the netPLFromSpecifiedBus property.
         * 
         */
        public long getNetPLFromSpecifiedBus() {
            return netPLFromSpecifiedBus;
        }

        /**
         * Sets the value of the netPLFromSpecifiedBus property.
         * 
         */
        public void setNetPLFromSpecifiedBus(long value) {
            this.netPLFromSpecifiedBus = value;
        }

        /**
         * Gets the value of the incRecCredPLOthHeads property.
         * 
         */
        public long getIncRecCredPLOthHeads() {
            return incRecCredPLOthHeads;
        }

        /**
         * Sets the value of the incRecCredPLOthHeads property.
         * 
         */
        public void setIncRecCredPLOthHeads(long value) {
            this.incRecCredPLOthHeads = value;
        }

        /**
         * Gets the value of the plUs44SChapXIIG property.
         * 
         */
        public long getPLUs44SChapXIIG() {
            return plUs44SChapXIIG;
        }

        /**
         * Sets the value of the plUs44SChapXIIG property.
         * 
         */
        public void setPLUs44SChapXIIG(long value) {
            this.plUs44SChapXIIG = value;
        }

        /**
         * Gets the value of the incCredPL property.
         * 
         * @return
         *     possible object is
         *     {@link ITR4ScheduleBP.BusinessIncOthThanSpec.IncCredPL }
         *     
         */
        public ITR4ScheduleBP.BusinessIncOthThanSpec.IncCredPL getIncCredPL() {
            return incCredPL;
        }

        /**
         * Sets the value of the incCredPL property.
         * 
         * @param value
         *     allowed object is
         *     {@link ITR4ScheduleBP.BusinessIncOthThanSpec.IncCredPL }
         *     
         */
        public void setIncCredPL(ITR4ScheduleBP.BusinessIncOthThanSpec.IncCredPL value) {
            this.incCredPL = value;
        }

        /**
         * Gets the value of the balancePLOthThanSpecBus property.
         * 
         */
        public long getBalancePLOthThanSpecBus() {
            return balancePLOthThanSpecBus;
        }

        /**
         * Sets the value of the balancePLOthThanSpecBus property.
         * 
         */
        public void setBalancePLOthThanSpecBus(long value) {
            this.balancePLOthThanSpecBus = value;
        }

        /**
         * Gets the value of the expDebToPLOthHeads property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getExpDebToPLOthHeads() {
            return expDebToPLOthHeads;
        }

        /**
         * Sets the value of the expDebToPLOthHeads property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setExpDebToPLOthHeads(BigInteger value) {
            this.expDebToPLOthHeads = value;
        }

        /**
         * Gets the value of the expDebToPLExemptInc property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getExpDebToPLExemptInc() {
            return expDebToPLExemptInc;
        }

        /**
         * Sets the value of the expDebToPLExemptInc property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setExpDebToPLExemptInc(BigInteger value) {
            this.expDebToPLExemptInc = value;
        }

        /**
         * Gets the value of the totExpDebPL property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotExpDebPL() {
            return totExpDebPL;
        }

        /**
         * Sets the value of the totExpDebPL property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotExpDebPL(BigInteger value) {
            this.totExpDebPL = value;
        }

        /**
         * Gets the value of the adjustedPLOthThanSpecBus property.
         * 
         */
        public long getAdjustedPLOthThanSpecBus() {
            return adjustedPLOthThanSpecBus;
        }

        /**
         * Sets the value of the adjustedPLOthThanSpecBus property.
         * 
         */
        public void setAdjustedPLOthThanSpecBus(long value) {
            this.adjustedPLOthThanSpecBus = value;
        }

        /**
         * Gets the value of the depreciationDebPLCosAct property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDepreciationDebPLCosAct() {
            return depreciationDebPLCosAct;
        }

        /**
         * Sets the value of the depreciationDebPLCosAct property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDepreciationDebPLCosAct(BigInteger value) {
            this.depreciationDebPLCosAct = value;
        }

        /**
         * Gets the value of the depreciationAllowITAct32 property.
         * 
         * @return
         *     possible object is
         *     {@link ITR4ScheduleBP.BusinessIncOthThanSpec.DepreciationAllowITAct32 }
         *     
         */
        public ITR4ScheduleBP.BusinessIncOthThanSpec.DepreciationAllowITAct32 getDepreciationAllowITAct32() {
            return depreciationAllowITAct32;
        }

        /**
         * Sets the value of the depreciationAllowITAct32 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ITR4ScheduleBP.BusinessIncOthThanSpec.DepreciationAllowITAct32 }
         *     
         */
        public void setDepreciationAllowITAct32(ITR4ScheduleBP.BusinessIncOthThanSpec.DepreciationAllowITAct32 value) {
            this.depreciationAllowITAct32 = value;
        }

        /**
         * Gets the value of the adjustPLAfterDeprOthSpecInc property.
         * 
         */
        public long getAdjustPLAfterDeprOthSpecInc() {
            return adjustPLAfterDeprOthSpecInc;
        }

        /**
         * Sets the value of the adjustPLAfterDeprOthSpecInc property.
         * 
         */
        public void setAdjustPLAfterDeprOthSpecInc(long value) {
            this.adjustPLAfterDeprOthSpecInc = value;
        }

        /**
         * Gets the value of the amtDebPLDisallowUs36 property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmtDebPLDisallowUs36() {
            return amtDebPLDisallowUs36;
        }

        /**
         * Sets the value of the amtDebPLDisallowUs36 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmtDebPLDisallowUs36(BigInteger value) {
            this.amtDebPLDisallowUs36 = value;
        }

        /**
         * Gets the value of the amtDebPLDisallowUs37 property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmtDebPLDisallowUs37() {
            return amtDebPLDisallowUs37;
        }

        /**
         * Sets the value of the amtDebPLDisallowUs37 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmtDebPLDisallowUs37(BigInteger value) {
            this.amtDebPLDisallowUs37 = value;
        }

        /**
         * Gets the value of the amtDebPLDisallowUs40 property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmtDebPLDisallowUs40() {
            return amtDebPLDisallowUs40;
        }

        /**
         * Sets the value of the amtDebPLDisallowUs40 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmtDebPLDisallowUs40(BigInteger value) {
            this.amtDebPLDisallowUs40 = value;
        }

        /**
         * Gets the value of the amtDebPLDisallowUs40A property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmtDebPLDisallowUs40A() {
            return amtDebPLDisallowUs40A;
        }

        /**
         * Sets the value of the amtDebPLDisallowUs40A property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmtDebPLDisallowUs40A(BigInteger value) {
            this.amtDebPLDisallowUs40A = value;
        }

        /**
         * Gets the value of the amtDebPLDisallowUs43B property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmtDebPLDisallowUs43B() {
            return amtDebPLDisallowUs43B;
        }

        /**
         * Sets the value of the amtDebPLDisallowUs43B property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmtDebPLDisallowUs43B(BigInteger value) {
            this.amtDebPLDisallowUs43B = value;
        }

        /**
         * Gets the value of the interestDisAllowUs23SMEAct property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getInterestDisAllowUs23SMEAct() {
            return interestDisAllowUs23SMEAct;
        }

        /**
         * Sets the value of the interestDisAllowUs23SMEAct property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setInterestDisAllowUs23SMEAct(BigInteger value) {
            this.interestDisAllowUs23SMEAct = value;
        }

        /**
         * Gets the value of the deemIncUs41 property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDeemIncUs41() {
            return deemIncUs41;
        }

        /**
         * Sets the value of the deemIncUs41 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDeemIncUs41(BigInteger value) {
            this.deemIncUs41 = value;
        }

        /**
         * Gets the value of the deemIncUs3380HHD80IA property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDeemIncUs3380HHD80IA() {
            return deemIncUs3380HHD80IA;
        }

        /**
         * Sets the value of the deemIncUs3380HHD80IA property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDeemIncUs3380HHD80IA(BigInteger value) {
            this.deemIncUs3380HHD80IA = value;
        }

        /**
         * Gets the value of the othItemDisallowUs28To44DA property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOthItemDisallowUs28To44DA() {
            return othItemDisallowUs28To44DA;
        }

        /**
         * Sets the value of the othItemDisallowUs28To44DA property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOthItemDisallowUs28To44DA(BigInteger value) {
            this.othItemDisallowUs28To44DA = value;
        }

        /**
         * Gets the value of the anyOthIncNotInclInExpDisallowPL property.
         * 
         */
        public long getAnyOthIncNotInclInExpDisallowPL() {
            return anyOthIncNotInclInExpDisallowPL;
        }

        /**
         * Sets the value of the anyOthIncNotInclInExpDisallowPL property.
         * 
         */
        public void setAnyOthIncNotInclInExpDisallowPL(long value) {
            this.anyOthIncNotInclInExpDisallowPL = value;
        }

        /**
         * Gets the value of the totAfterAddToPLDeprOthSpecInc property.
         * 
         */
        public long getTotAfterAddToPLDeprOthSpecInc() {
            return totAfterAddToPLDeprOthSpecInc;
        }

        /**
         * Sets the value of the totAfterAddToPLDeprOthSpecInc property.
         * 
         */
        public void setTotAfterAddToPLDeprOthSpecInc(long value) {
            this.totAfterAddToPLDeprOthSpecInc = value;
        }

        /**
         * Gets the value of the deductUs321Iii property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDeductUs321Iii() {
            return deductUs321Iii;
        }

        /**
         * Sets the value of the deductUs321Iii property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDeductUs321Iii(BigInteger value) {
            this.deductUs321Iii = value;
        }

        /**
         * Gets the value of the debPLUs35ExcessAmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDebPLUs35ExcessAmt() {
            return debPLUs35ExcessAmt;
        }

        /**
         * Sets the value of the debPLUs35ExcessAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDebPLUs35ExcessAmt(BigInteger value) {
            this.debPLUs35ExcessAmt = value;
        }

        /**
         * Gets the value of the amtDisallUs40NowAllow property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmtDisallUs40NowAllow() {
            return amtDisallUs40NowAllow;
        }

        /**
         * Sets the value of the amtDisallUs40NowAllow property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmtDisallUs40NowAllow(BigInteger value) {
            this.amtDisallUs40NowAllow = value;
        }

        /**
         * Gets the value of the amtDisallUs43BNowAllow property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmtDisallUs43BNowAllow() {
            return amtDisallUs43BNowAllow;
        }

        /**
         * Sets the value of the amtDisallUs43BNowAllow property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmtDisallUs43BNowAllow(BigInteger value) {
            this.amtDisallUs43BNowAllow = value;
        }

        /**
         * Gets the value of the deductUs35AC property.
         * 
         * @return
         *     possible object is
         *     {@link ITR4ScheduleBP.BusinessIncOthThanSpec.DeductUs35AC }
         *     
         */
        public ITR4ScheduleBP.BusinessIncOthThanSpec.DeductUs35AC getDeductUs35AC() {
            return deductUs35AC;
        }

        /**
         * Sets the value of the deductUs35AC property.
         * 
         * @param value
         *     allowed object is
         *     {@link ITR4ScheduleBP.BusinessIncOthThanSpec.DeductUs35AC }
         *     
         */
        public void setDeductUs35AC(ITR4ScheduleBP.BusinessIncOthThanSpec.DeductUs35AC value) {
            this.deductUs35AC = value;
        }

        /**
         * Gets the value of the anyOthAmtAllDeduct property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAnyOthAmtAllDeduct() {
            return anyOthAmtAllDeduct;
        }

        /**
         * Sets the value of the anyOthAmtAllDeduct property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAnyOthAmtAllDeduct(BigInteger value) {
            this.anyOthAmtAllDeduct = value;
        }

        /**
         * Gets the value of the totDeductionAmts property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotDeductionAmts() {
            return totDeductionAmts;
        }

        /**
         * Sets the value of the totDeductionAmts property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotDeductionAmts(BigInteger value) {
            this.totDeductionAmts = value;
        }

        /**
         * Gets the value of the plAftAdjDedBusOthThanSpec property.
         * 
         */
        public long getPLAftAdjDedBusOthThanSpec() {
            return plAftAdjDedBusOthThanSpec;
        }

        /**
         * Sets the value of the plAftAdjDedBusOthThanSpec property.
         * 
         */
        public void setPLAftAdjDedBusOthThanSpec(long value) {
            this.plAftAdjDedBusOthThanSpec = value;
        }

        /**
         * Gets the value of the deemedProfitBusUs property.
         * 
         * @return
         *     possible object is
         *     {@link ITR4ScheduleBP.BusinessIncOthThanSpec.DeemedProfitBusUs }
         *     
         */
        public ITR4ScheduleBP.BusinessIncOthThanSpec.DeemedProfitBusUs getDeemedProfitBusUs() {
            return deemedProfitBusUs;
        }

        /**
         * Sets the value of the deemedProfitBusUs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ITR4ScheduleBP.BusinessIncOthThanSpec.DeemedProfitBusUs }
         *     
         */
        public void setDeemedProfitBusUs(ITR4ScheduleBP.BusinessIncOthThanSpec.DeemedProfitBusUs value) {
            this.deemedProfitBusUs = value;
        }

        /**
         * Gets the value of the profitLossBfrDeductUs10S property.
         * 
         */
        public long getProfitLossBfrDeductUs10S() {
            return profitLossBfrDeductUs10S;
        }

        /**
         * Sets the value of the profitLossBfrDeductUs10S property.
         * 
         */
        public void setProfitLossBfrDeductUs10S(long value) {
            this.profitLossBfrDeductUs10S = value;
        }

        /**
         * Gets the value of the deductionUs10S property.
         * 
         * @return
         *     possible object is
         *     {@link ITR4ScheduleBP.BusinessIncOthThanSpec.DeductionUs10S }
         *     
         */
        public ITR4ScheduleBP.BusinessIncOthThanSpec.DeductionUs10S getDeductionUs10S() {
            return deductionUs10S;
        }

        /**
         * Sets the value of the deductionUs10S property.
         * 
         * @param value
         *     allowed object is
         *     {@link ITR4ScheduleBP.BusinessIncOthThanSpec.DeductionUs10S }
         *     
         */
        public void setDeductionUs10S(ITR4ScheduleBP.BusinessIncOthThanSpec.DeductionUs10S value) {
            this.deductionUs10S = value;
        }

        /**
         * Gets the value of the netPLAftAdjBusOthThanSpec property.
         * 
         */
        public long getNetPLAftAdjBusOthThanSpec() {
            return netPLAftAdjBusOthThanSpec;
        }

        /**
         * Sets the value of the netPLAftAdjBusOthThanSpec property.
         * 
         */
        public void setNetPLAftAdjBusOthThanSpec(long value) {
            this.netPLAftAdjBusOthThanSpec = value;
        }

        /**
         * Gets the value of the netPLBusOthThanSpec7A7B7C property.
         * 
         */
        public long getNetPLBusOthThanSpec7A7B7C() {
            return netPLBusOthThanSpec7A7B7C;
        }

        /**
         * Sets the value of the netPLBusOthThanSpec7A7B7C property.
         * 
         */
        public void setNetPLBusOthThanSpec7A7B7C(long value) {
            this.netPLBusOthThanSpec7A7B7C = value;
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
         *         &lt;element name="DebPL35ACAmt">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AmtAllowUs35ACt">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ExcessAmtDeduct35AC">
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
            "debPL35ACAmt",
            "amtAllowUs35ACt",
            "excessAmtDeduct35AC"
        })
        public static class DeductUs35AC {

            @XmlElement(name = "DebPL35ACAmt", required = true, defaultValue = "0")
            protected BigInteger debPL35ACAmt;
            @XmlElement(name = "AmtAllowUs35ACt", required = true, defaultValue = "0")
            protected BigInteger amtAllowUs35ACt;
            @XmlElement(name = "ExcessAmtDeduct35AC", required = true, defaultValue = "0")
            protected BigInteger excessAmtDeduct35AC;

            /**
             * Gets the value of the debPL35ACAmt property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDebPL35ACAmt() {
                return debPL35ACAmt;
            }

            /**
             * Sets the value of the debPL35ACAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDebPL35ACAmt(BigInteger value) {
                this.debPL35ACAmt = value;
            }

            /**
             * Gets the value of the amtAllowUs35ACt property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAmtAllowUs35ACt() {
                return amtAllowUs35ACt;
            }

            /**
             * Sets the value of the amtAllowUs35ACt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAmtAllowUs35ACt(BigInteger value) {
                this.amtAllowUs35ACt = value;
            }

            /**
             * Gets the value of the excessAmtDeduct35AC property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getExcessAmtDeduct35AC() {
                return excessAmtDeduct35AC;
            }

            /**
             * Sets the value of the excessAmtDeduct35AC property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setExcessAmtDeduct35AC(BigInteger value) {
                this.excessAmtDeduct35AC = value;
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
         *         &lt;element name="Section10A">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Section10AA">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Section10B">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Section10BA">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TotDeductionUs10s">
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
            "section10A",
            "section10AA",
            "section10B",
            "section10BA",
            "totDeductionUs10S"
        })
        public static class DeductionUs10S {

            @XmlElement(name = "Section10A", required = true, defaultValue = "0")
            protected BigInteger section10A;
            @XmlElement(name = "Section10AA", required = true, defaultValue = "0")
            protected BigInteger section10AA;
            @XmlElement(name = "Section10B", required = true, defaultValue = "0")
            protected BigInteger section10B;
            @XmlElement(name = "Section10BA", required = true, defaultValue = "0")
            protected BigInteger section10BA;
            @XmlElement(name = "TotDeductionUs10s", required = true, defaultValue = "0")
            protected BigInteger totDeductionUs10S;

            /**
             * Gets the value of the section10A property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSection10A() {
                return section10A;
            }

            /**
             * Sets the value of the section10A property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSection10A(BigInteger value) {
                this.section10A = value;
            }

            /**
             * Gets the value of the section10AA property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSection10AA() {
                return section10AA;
            }

            /**
             * Sets the value of the section10AA property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSection10AA(BigInteger value) {
                this.section10AA = value;
            }

            /**
             * Gets the value of the section10B property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSection10B() {
                return section10B;
            }

            /**
             * Sets the value of the section10B property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSection10B(BigInteger value) {
                this.section10B = value;
            }

            /**
             * Gets the value of the section10BA property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSection10BA() {
                return section10BA;
            }

            /**
             * Sets the value of the section10BA property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSection10BA(BigInteger value) {
                this.section10BA = value;
            }

            /**
             * Gets the value of the totDeductionUs10S property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotDeductionUs10S() {
                return totDeductionUs10S;
            }

            /**
             * Sets the value of the totDeductionUs10S property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotDeductionUs10S(BigInteger value) {
                this.totDeductionUs10S = value;
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
         *         &lt;element name="Section44AD">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Section44AE">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Section44AF">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Section44B">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Section44BB">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Section44BBA">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Section44BBB">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Section44D">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Section44DA">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ChapterXIIG">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FirstSchTAct">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TotDeemedProfitBusUs">
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
            "section44AD",
            "section44AE",
            "section44AF",
            "section44B",
            "section44BB",
            "section44BBA",
            "section44BBB",
            "section44D",
            "section44DA",
            "chapterXIIG",
            "firstSchTAct",
            "totDeemedProfitBusUs"
        })
        public static class DeemedProfitBusUs {

            @XmlElement(name = "Section44AD", required = true, defaultValue = "0")
            protected BigInteger section44AD;
            @XmlElement(name = "Section44AE", required = true, defaultValue = "0")
            protected BigInteger section44AE;
            @XmlElement(name = "Section44AF", required = true, defaultValue = "0")
            protected BigInteger section44AF;
            @XmlElement(name = "Section44B", required = true, defaultValue = "0")
            protected BigInteger section44B;
            @XmlElement(name = "Section44BB", required = true, defaultValue = "0")
            protected BigInteger section44BB;
            @XmlElement(name = "Section44BBA", required = true, defaultValue = "0")
            protected BigInteger section44BBA;
            @XmlElement(name = "Section44BBB", required = true, defaultValue = "0")
            protected BigInteger section44BBB;
            @XmlElement(name = "Section44D", required = true, defaultValue = "0")
            protected BigInteger section44D;
            @XmlElement(name = "Section44DA", required = true, defaultValue = "0")
            protected BigInteger section44DA;
            @XmlElement(name = "ChapterXIIG", required = true, defaultValue = "0")
            protected BigInteger chapterXIIG;
            @XmlElement(name = "FirstSchTAct", required = true, defaultValue = "0")
            protected BigInteger firstSchTAct;
            @XmlElement(name = "TotDeemedProfitBusUs", required = true, defaultValue = "0")
            protected BigInteger totDeemedProfitBusUs;

            /**
             * Gets the value of the section44AD property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSection44AD() {
                return section44AD;
            }

            /**
             * Sets the value of the section44AD property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSection44AD(BigInteger value) {
                this.section44AD = value;
            }

            /**
             * Gets the value of the section44AE property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSection44AE() {
                return section44AE;
            }

            /**
             * Sets the value of the section44AE property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSection44AE(BigInteger value) {
                this.section44AE = value;
            }

            /**
             * Gets the value of the section44AF property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSection44AF() {
                return section44AF;
            }

            /**
             * Sets the value of the section44AF property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSection44AF(BigInteger value) {
                this.section44AF = value;
            }

            /**
             * Gets the value of the section44B property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSection44B() {
                return section44B;
            }

            /**
             * Sets the value of the section44B property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSection44B(BigInteger value) {
                this.section44B = value;
            }

            /**
             * Gets the value of the section44BB property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSection44BB() {
                return section44BB;
            }

            /**
             * Sets the value of the section44BB property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSection44BB(BigInteger value) {
                this.section44BB = value;
            }

            /**
             * Gets the value of the section44BBA property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSection44BBA() {
                return section44BBA;
            }

            /**
             * Sets the value of the section44BBA property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSection44BBA(BigInteger value) {
                this.section44BBA = value;
            }

            /**
             * Gets the value of the section44BBB property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSection44BBB() {
                return section44BBB;
            }

            /**
             * Sets the value of the section44BBB property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSection44BBB(BigInteger value) {
                this.section44BBB = value;
            }

            /**
             * Gets the value of the section44D property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSection44D() {
                return section44D;
            }

            /**
             * Sets the value of the section44D property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSection44D(BigInteger value) {
                this.section44D = value;
            }

            /**
             * Gets the value of the section44DA property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSection44DA() {
                return section44DA;
            }

            /**
             * Sets the value of the section44DA property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSection44DA(BigInteger value) {
                this.section44DA = value;
            }

            /**
             * Gets the value of the chapterXIIG property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getChapterXIIG() {
                return chapterXIIG;
            }

            /**
             * Sets the value of the chapterXIIG property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setChapterXIIG(BigInteger value) {
                this.chapterXIIG = value;
            }

            /**
             * Gets the value of the firstSchTAct property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getFirstSchTAct() {
                return firstSchTAct;
            }

            /**
             * Sets the value of the firstSchTAct property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setFirstSchTAct(BigInteger value) {
                this.firstSchTAct = value;
            }

            /**
             * Gets the value of the totDeemedProfitBusUs property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotDeemedProfitBusUs() {
                return totDeemedProfitBusUs;
            }

            /**
             * Sets the value of the totDeemedProfitBusUs property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotDeemedProfitBusUs(BigInteger value) {
                this.totDeemedProfitBusUs = value;
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
         *         &lt;element name="DepreciationAllowUs32_1_ii">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DepreciationAllowUs32_1_i">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TotDeprAllowITAct">
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
            "depreciationAllowUs321Ii",
            "depreciationAllowUs321I",
            "totDeprAllowITAct"
        })
        public static class DepreciationAllowITAct32 {

            @XmlElement(name = "DepreciationAllowUs32_1_ii", required = true, defaultValue = "0")
            protected BigInteger depreciationAllowUs321Ii;
            @XmlElement(name = "DepreciationAllowUs32_1_i", required = true, defaultValue = "0")
            protected BigInteger depreciationAllowUs321I;
            @XmlElement(name = "TotDeprAllowITAct", required = true, defaultValue = "0")
            protected BigInteger totDeprAllowITAct;

            /**
             * Gets the value of the depreciationAllowUs321Ii property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDepreciationAllowUs321Ii() {
                return depreciationAllowUs321Ii;
            }

            /**
             * Sets the value of the depreciationAllowUs321Ii property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDepreciationAllowUs321Ii(BigInteger value) {
                this.depreciationAllowUs321Ii = value;
            }

            /**
             * Gets the value of the depreciationAllowUs321I property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDepreciationAllowUs321I() {
                return depreciationAllowUs321I;
            }

            /**
             * Sets the value of the depreciationAllowUs321I property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDepreciationAllowUs321I(BigInteger value) {
                this.depreciationAllowUs321I = value;
            }

            /**
             * Gets the value of the totDeprAllowITAct property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotDeprAllowITAct() {
                return totDeprAllowITAct;
            }

            /**
             * Sets the value of the totDeprAllowITAct property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotDeprAllowITAct(BigInteger value) {
                this.totDeprAllowITAct = value;
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
         *         &lt;element name="FirmShareInc">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AOPBOISharInc">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="OthExempInc">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
         *               &lt;totalDigits value="14"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TotExempIncPL">
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
            "firmShareInc",
            "aopboiSharInc",
            "othExempInc",
            "totExempIncPL"
        })
        public static class IncCredPL {

            @XmlElement(name = "FirmShareInc", defaultValue = "0")
            protected long firmShareInc;
            @XmlElement(name = "AOPBOISharInc", defaultValue = "0")
            protected long aopboiSharInc;
            @XmlElement(name = "OthExempInc", required = true, defaultValue = "0")
            protected BigInteger othExempInc;
            @XmlElement(name = "TotExempIncPL", defaultValue = "0")
            protected long totExempIncPL;

            /**
             * Gets the value of the firmShareInc property.
             * 
             */
            public long getFirmShareInc() {
                return firmShareInc;
            }

            /**
             * Sets the value of the firmShareInc property.
             * 
             */
            public void setFirmShareInc(long value) {
                this.firmShareInc = value;
            }

            /**
             * Gets the value of the aopboiSharInc property.
             * 
             */
            public long getAOPBOISharInc() {
                return aopboiSharInc;
            }

            /**
             * Sets the value of the aopboiSharInc property.
             * 
             */
            public void setAOPBOISharInc(long value) {
                this.aopboiSharInc = value;
            }

            /**
             * Gets the value of the othExempInc property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getOthExempInc() {
                return othExempInc;
            }

            /**
             * Sets the value of the othExempInc property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setOthExempInc(BigInteger value) {
                this.othExempInc = value;
            }

            /**
             * Gets the value of the totExempIncPL property.
             * 
             */
            public long getTotExempIncPL() {
                return totExempIncPL;
            }

            /**
             * Sets the value of the totExempIncPL property.
             * 
             */
            public void setTotExempIncPL(long value) {
                this.totExempIncPL = value;
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
     *         &lt;element name="NetPLFrmSpecBus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AdditionUs28to44DA">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DeductUs28to44DA">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AdjustedPLFrmSpecuBus">
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
        "netPLFrmSpecBus",
        "additionUs28To44DA",
        "deductUs28To44DA",
        "adjustedPLFrmSpecuBus"
    })
    public static class SpecBusinessInc {

        @XmlElement(name = "NetPLFrmSpecBus", defaultValue = "0")
        protected long netPLFrmSpecBus;
        @XmlElement(name = "AdditionUs28to44DA", required = true, defaultValue = "0")
        protected BigInteger additionUs28To44DA;
        @XmlElement(name = "DeductUs28to44DA", required = true, defaultValue = "0")
        protected BigInteger deductUs28To44DA;
        @XmlElement(name = "AdjustedPLFrmSpecuBus", defaultValue = "0")
        protected long adjustedPLFrmSpecuBus;

        /**
         * Gets the value of the netPLFrmSpecBus property.
         * 
         */
        public long getNetPLFrmSpecBus() {
            return netPLFrmSpecBus;
        }

        /**
         * Sets the value of the netPLFrmSpecBus property.
         * 
         */
        public void setNetPLFrmSpecBus(long value) {
            this.netPLFrmSpecBus = value;
        }

        /**
         * Gets the value of the additionUs28To44DA property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAdditionUs28To44DA() {
            return additionUs28To44DA;
        }

        /**
         * Sets the value of the additionUs28To44DA property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAdditionUs28To44DA(BigInteger value) {
            this.additionUs28To44DA = value;
        }

        /**
         * Gets the value of the deductUs28To44DA property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDeductUs28To44DA() {
            return deductUs28To44DA;
        }

        /**
         * Sets the value of the deductUs28To44DA property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDeductUs28To44DA(BigInteger value) {
            this.deductUs28To44DA = value;
        }

        /**
         * Gets the value of the adjustedPLFrmSpecuBus property.
         * 
         */
        public long getAdjustedPLFrmSpecuBus() {
            return adjustedPLFrmSpecuBus;
        }

        /**
         * Sets the value of the adjustedPLFrmSpecuBus property.
         * 
         */
        public void setAdjustedPLFrmSpecuBus(long value) {
            this.adjustedPLFrmSpecuBus = value;
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
     *         &lt;element name="NetPLFrmSpecifiedBus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DeductionUs35AD">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
     *               &lt;totalDigits value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PLFrmSpecifiedBus">
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
        "netPLFrmSpecifiedBus",
        "deductionUs35AD",
        "plFrmSpecifiedBus"
    })
    public static class SpecifiedBusinessInc {

        @XmlElement(name = "NetPLFrmSpecifiedBus", defaultValue = "0")
        protected long netPLFrmSpecifiedBus;
        @XmlElement(name = "DeductionUs35AD", required = true, defaultValue = "0")
        protected BigInteger deductionUs35AD;
        @XmlElement(name = "PLFrmSpecifiedBus", defaultValue = "0")
        protected long plFrmSpecifiedBus;

        /**
         * Gets the value of the netPLFrmSpecifiedBus property.
         * 
         */
        public long getNetPLFrmSpecifiedBus() {
            return netPLFrmSpecifiedBus;
        }

        /**
         * Sets the value of the netPLFrmSpecifiedBus property.
         * 
         */
        public void setNetPLFrmSpecifiedBus(long value) {
            this.netPLFrmSpecifiedBus = value;
        }

        /**
         * Gets the value of the deductionUs35AD property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDeductionUs35AD() {
            return deductionUs35AD;
        }

        /**
         * Sets the value of the deductionUs35AD property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDeductionUs35AD(BigInteger value) {
            this.deductionUs35AD = value;
        }

        /**
         * Gets the value of the plFrmSpecifiedBus property.
         * 
         */
        public long getPLFrmSpecifiedBus() {
            return plFrmSpecifiedBus;
        }

        /**
         * Sets the value of the plFrmSpecifiedBus property.
         * 
         */
        public void setPLFrmSpecifiedBus(long value) {
            this.plFrmSpecifiedBus = value;
        }

    }

}
