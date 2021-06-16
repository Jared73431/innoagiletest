package com.cht.ccbs.base.entities.bc.out;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bc_out_ncc_lb419d2_lb419d3 database table.
 * 
 */
@Entity
@Table(name="bc_out_ncc_lb419d2_lb419d3")
@NamedQuery(name="BcOutNccLb419d2Lb419d3.findAll", query="SELECT b FROM BcOutNccLb419d2Lb419d3 b")
public class BcOutNccLb419d2Lb419d3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="self_pk")
	private String selfPk;

	@Column(name="acc_no")
	private String accNo;

	@Column(name="adminis_office_type")
	private String adminisOfficeType;

	@Column(name="balance_forward")
	private BigDecimal balanceForward;

	@Column(name="bill_code")
	private String billCode;

	@Column(name="bill_equip_no")
	private String billEquipNo;

	@Column(name="bill_idcard_no")
	private String billIdcardNo;

	@Column(name="bill_month")
	private BigDecimal billMonth;

	@Column(name="bill_office_code")
	private String billOfficeCode;

	@Column(name="control_char")
	private String controlChar;

	@Column(name="delivery_no")
	private String deliveryNo;

	@Column(name="direct_debit_no")
	private String directDebitNo;

	@Column(name="equip_no")
	private String equipNo;

	@Column(name="general_tax_total_amount")
	private BigDecimal generalTaxTotalAmount;

	@Column(name="idcard_office_code")
	private String idcardOfficeCode;

	@Column(name="is_over_l3_rate_item_limit")
	private String isOverL3RateItemLimit;

	@Column(name="offering_type")
	private String offeringType;

	@Column(name="office_code")
	private String officeCode;

	@Column(name="op_class")
	private String opClass;

	@Column(name="overflag_y_or_n")
	private String overflagYOrN;

	@Column(name="pay_deadline")
	private BigDecimal payDeadline;

	@Column(name="pbx_type")
	private String pbxType;

	@Column(name="rate_amount1")
	private BigDecimal rateAmount1;

	@Column(name="rate_amount10")
	private BigDecimal rateAmount10;

	@Column(name="rate_amount11")
	private BigDecimal rateAmount11;

	@Column(name="rate_amount12")
	private BigDecimal rateAmount12;

	@Column(name="rate_amount13")
	private BigDecimal rateAmount13;

	@Column(name="rate_amount14")
	private BigDecimal rateAmount14;

	@Column(name="rate_amount15")
	private BigDecimal rateAmount15;

	@Column(name="rate_amount16")
	private BigDecimal rateAmount16;

	@Column(name="rate_amount17")
	private BigDecimal rateAmount17;

	@Column(name="rate_amount18")
	private BigDecimal rateAmount18;

	@Column(name="rate_amount19")
	private BigDecimal rateAmount19;

	@Column(name="rate_amount2")
	private BigDecimal rateAmount2;

	@Column(name="rate_amount20")
	private BigDecimal rateAmount20;

	@Column(name="rate_amount21")
	private BigDecimal rateAmount21;

	@Column(name="rate_amount22")
	private BigDecimal rateAmount22;

	@Column(name="rate_amount23")
	private BigDecimal rateAmount23;

	@Column(name="rate_amount24")
	private BigDecimal rateAmount24;

	@Column(name="rate_amount25")
	private BigDecimal rateAmount25;

	@Column(name="rate_amount26")
	private BigDecimal rateAmount26;

	@Column(name="rate_amount27")
	private BigDecimal rateAmount27;

	@Column(name="rate_amount28")
	private BigDecimal rateAmount28;

	@Column(name="rate_amount29")
	private BigDecimal rateAmount29;

	@Column(name="rate_amount3")
	private BigDecimal rateAmount3;

	@Column(name="rate_amount30")
	private BigDecimal rateAmount30;

	@Column(name="rate_amount4")
	private BigDecimal rateAmount4;

	@Column(name="rate_amount5")
	private BigDecimal rateAmount5;

	@Column(name="rate_amount6")
	private BigDecimal rateAmount6;

	@Column(name="rate_amount7")
	private BigDecimal rateAmount7;

	@Column(name="rate_amount8")
	private BigDecimal rateAmount8;

	@Column(name="rate_amount9")
	private BigDecimal rateAmount9;

	@Column(name="rate_code1")
	private String rateCode1;

	@Column(name="rate_code10")
	private String rateCode10;

	@Column(name="rate_code11")
	private String rateCode11;

	@Column(name="rate_code12")
	private String rateCode12;

	@Column(name="rate_code13")
	private String rateCode13;

	@Column(name="rate_code14")
	private String rateCode14;

	@Column(name="rate_code15")
	private String rateCode15;

	@Column(name="rate_code16")
	private String rateCode16;

	@Column(name="rate_code17")
	private String rateCode17;

	@Column(name="rate_code18")
	private String rateCode18;

	@Column(name="rate_code19")
	private String rateCode19;

	@Column(name="rate_code2")
	private String rateCode2;

	@Column(name="rate_code20")
	private String rateCode20;

	@Column(name="rate_code21")
	private String rateCode21;

	@Column(name="rate_code22")
	private String rateCode22;

	@Column(name="rate_code23")
	private String rateCode23;

	@Column(name="rate_code24")
	private String rateCode24;

	@Column(name="rate_code25")
	private String rateCode25;

	@Column(name="rate_code26")
	private String rateCode26;

	@Column(name="rate_code27")
	private String rateCode27;

	@Column(name="rate_code28")
	private String rateCode28;

	@Column(name="rate_code29")
	private String rateCode29;

	@Column(name="rate_code3")
	private String rateCode3;

	@Column(name="rate_code30")
	private String rateCode30;

	@Column(name="rate_code4")
	private String rateCode4;

	@Column(name="rate_code5")
	private String rateCode5;

	@Column(name="rate_code6")
	private String rateCode6;

	@Column(name="rate_code7")
	private String rateCode7;

	@Column(name="rate_code8")
	private String rateCode8;

	@Column(name="rate_code9")
	private String rateCode9;

	@Column(name="receipt_no")
	private String receiptNo;

	@Column(name="sub_op_class")
	private String subOpClass;

	@Column(name="tax_excluded_total_amount")
	private BigDecimal taxExcludedTotalAmount;

	@Column(name="tax_zero_total_amount")
	private BigDecimal taxZeroTotalAmount;

	@Column(name="total_amount")
	private BigDecimal totalAmount;

	@Column(name="total_tax")
	private BigDecimal totalTax;

	public BcOutNccLb419d2Lb419d3() {
	}

	public String getSelfPk() {
		return this.selfPk;
	}

	public void setSelfPk(String selfPk) {
		this.selfPk = selfPk;
	}

	public String getAccNo() {
		return this.accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAdminisOfficeType() {
		return this.adminisOfficeType;
	}

	public void setAdminisOfficeType(String adminisOfficeType) {
		this.adminisOfficeType = adminisOfficeType;
	}

	public BigDecimal getBalanceForward() {
		return this.balanceForward;
	}

	public void setBalanceForward(BigDecimal balanceForward) {
		this.balanceForward = balanceForward;
	}

	public String getBillCode() {
		return this.billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	public String getBillEquipNo() {
		return this.billEquipNo;
	}

	public void setBillEquipNo(String billEquipNo) {
		this.billEquipNo = billEquipNo;
	}

	public String getBillIdcardNo() {
		return this.billIdcardNo;
	}

	public void setBillIdcardNo(String billIdcardNo) {
		this.billIdcardNo = billIdcardNo;
	}

	public BigDecimal getBillMonth() {
		return this.billMonth;
	}

	public void setBillMonth(BigDecimal billMonth) {
		this.billMonth = billMonth;
	}

	public String getBillOfficeCode() {
		return this.billOfficeCode;
	}

	public void setBillOfficeCode(String billOfficeCode) {
		this.billOfficeCode = billOfficeCode;
	}

	public String getControlChar() {
		return this.controlChar;
	}

	public void setControlChar(String controlChar) {
		this.controlChar = controlChar;
	}

	public String getDeliveryNo() {
		return this.deliveryNo;
	}

	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	public String getDirectDebitNo() {
		return this.directDebitNo;
	}

	public void setDirectDebitNo(String directDebitNo) {
		this.directDebitNo = directDebitNo;
	}

	public String getEquipNo() {
		return this.equipNo;
	}

	public void setEquipNo(String equipNo) {
		this.equipNo = equipNo;
	}

	public BigDecimal getGeneralTaxTotalAmount() {
		return this.generalTaxTotalAmount;
	}

	public void setGeneralTaxTotalAmount(BigDecimal generalTaxTotalAmount) {
		this.generalTaxTotalAmount = generalTaxTotalAmount;
	}

	public String getIdcardOfficeCode() {
		return this.idcardOfficeCode;
	}

	public void setIdcardOfficeCode(String idcardOfficeCode) {
		this.idcardOfficeCode = idcardOfficeCode;
	}

	public String getIsOverL3RateItemLimit() {
		return this.isOverL3RateItemLimit;
	}

	public void setIsOverL3RateItemLimit(String isOverL3RateItemLimit) {
		this.isOverL3RateItemLimit = isOverL3RateItemLimit;
	}

	public String getOfferingType() {
		return this.offeringType;
	}

	public void setOfferingType(String offeringType) {
		this.offeringType = offeringType;
	}

	public String getOfficeCode() {
		return this.officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getOpClass() {
		return this.opClass;
	}

	public void setOpClass(String opClass) {
		this.opClass = opClass;
	}

	public String getOverflagYOrN() {
		return this.overflagYOrN;
	}

	public void setOverflagYOrN(String overflagYOrN) {
		this.overflagYOrN = overflagYOrN;
	}

	public BigDecimal getPayDeadline() {
		return this.payDeadline;
	}

	public void setPayDeadline(BigDecimal payDeadline) {
		this.payDeadline = payDeadline;
	}

	public String getPbxType() {
		return this.pbxType;
	}

	public void setPbxType(String pbxType) {
		this.pbxType = pbxType;
	}

	public BigDecimal getRateAmount1() {
		return this.rateAmount1;
	}

	public void setRateAmount1(BigDecimal rateAmount1) {
		this.rateAmount1 = rateAmount1;
	}

	public BigDecimal getRateAmount10() {
		return this.rateAmount10;
	}

	public void setRateAmount10(BigDecimal rateAmount10) {
		this.rateAmount10 = rateAmount10;
	}

	public BigDecimal getRateAmount11() {
		return this.rateAmount11;
	}

	public void setRateAmount11(BigDecimal rateAmount11) {
		this.rateAmount11 = rateAmount11;
	}

	public BigDecimal getRateAmount12() {
		return this.rateAmount12;
	}

	public void setRateAmount12(BigDecimal rateAmount12) {
		this.rateAmount12 = rateAmount12;
	}

	public BigDecimal getRateAmount13() {
		return this.rateAmount13;
	}

	public void setRateAmount13(BigDecimal rateAmount13) {
		this.rateAmount13 = rateAmount13;
	}

	public BigDecimal getRateAmount14() {
		return this.rateAmount14;
	}

	public void setRateAmount14(BigDecimal rateAmount14) {
		this.rateAmount14 = rateAmount14;
	}

	public BigDecimal getRateAmount15() {
		return this.rateAmount15;
	}

	public void setRateAmount15(BigDecimal rateAmount15) {
		this.rateAmount15 = rateAmount15;
	}

	public BigDecimal getRateAmount16() {
		return this.rateAmount16;
	}

	public void setRateAmount16(BigDecimal rateAmount16) {
		this.rateAmount16 = rateAmount16;
	}

	public BigDecimal getRateAmount17() {
		return this.rateAmount17;
	}

	public void setRateAmount17(BigDecimal rateAmount17) {
		this.rateAmount17 = rateAmount17;
	}

	public BigDecimal getRateAmount18() {
		return this.rateAmount18;
	}

	public void setRateAmount18(BigDecimal rateAmount18) {
		this.rateAmount18 = rateAmount18;
	}

	public BigDecimal getRateAmount19() {
		return this.rateAmount19;
	}

	public void setRateAmount19(BigDecimal rateAmount19) {
		this.rateAmount19 = rateAmount19;
	}

	public BigDecimal getRateAmount2() {
		return this.rateAmount2;
	}

	public void setRateAmount2(BigDecimal rateAmount2) {
		this.rateAmount2 = rateAmount2;
	}

	public BigDecimal getRateAmount20() {
		return this.rateAmount20;
	}

	public void setRateAmount20(BigDecimal rateAmount20) {
		this.rateAmount20 = rateAmount20;
	}

	public BigDecimal getRateAmount21() {
		return this.rateAmount21;
	}

	public void setRateAmount21(BigDecimal rateAmount21) {
		this.rateAmount21 = rateAmount21;
	}

	public BigDecimal getRateAmount22() {
		return this.rateAmount22;
	}

	public void setRateAmount22(BigDecimal rateAmount22) {
		this.rateAmount22 = rateAmount22;
	}

	public BigDecimal getRateAmount23() {
		return this.rateAmount23;
	}

	public void setRateAmount23(BigDecimal rateAmount23) {
		this.rateAmount23 = rateAmount23;
	}

	public BigDecimal getRateAmount24() {
		return this.rateAmount24;
	}

	public void setRateAmount24(BigDecimal rateAmount24) {
		this.rateAmount24 = rateAmount24;
	}

	public BigDecimal getRateAmount25() {
		return this.rateAmount25;
	}

	public void setRateAmount25(BigDecimal rateAmount25) {
		this.rateAmount25 = rateAmount25;
	}

	public BigDecimal getRateAmount26() {
		return this.rateAmount26;
	}

	public void setRateAmount26(BigDecimal rateAmount26) {
		this.rateAmount26 = rateAmount26;
	}

	public BigDecimal getRateAmount27() {
		return this.rateAmount27;
	}

	public void setRateAmount27(BigDecimal rateAmount27) {
		this.rateAmount27 = rateAmount27;
	}

	public BigDecimal getRateAmount28() {
		return this.rateAmount28;
	}

	public void setRateAmount28(BigDecimal rateAmount28) {
		this.rateAmount28 = rateAmount28;
	}

	public BigDecimal getRateAmount29() {
		return this.rateAmount29;
	}

	public void setRateAmount29(BigDecimal rateAmount29) {
		this.rateAmount29 = rateAmount29;
	}

	public BigDecimal getRateAmount3() {
		return this.rateAmount3;
	}

	public void setRateAmount3(BigDecimal rateAmount3) {
		this.rateAmount3 = rateAmount3;
	}

	public BigDecimal getRateAmount30() {
		return this.rateAmount30;
	}

	public void setRateAmount30(BigDecimal rateAmount30) {
		this.rateAmount30 = rateAmount30;
	}

	public BigDecimal getRateAmount4() {
		return this.rateAmount4;
	}

	public void setRateAmount4(BigDecimal rateAmount4) {
		this.rateAmount4 = rateAmount4;
	}

	public BigDecimal getRateAmount5() {
		return this.rateAmount5;
	}

	public void setRateAmount5(BigDecimal rateAmount5) {
		this.rateAmount5 = rateAmount5;
	}

	public BigDecimal getRateAmount6() {
		return this.rateAmount6;
	}

	public void setRateAmount6(BigDecimal rateAmount6) {
		this.rateAmount6 = rateAmount6;
	}

	public BigDecimal getRateAmount7() {
		return this.rateAmount7;
	}

	public void setRateAmount7(BigDecimal rateAmount7) {
		this.rateAmount7 = rateAmount7;
	}

	public BigDecimal getRateAmount8() {
		return this.rateAmount8;
	}

	public void setRateAmount8(BigDecimal rateAmount8) {
		this.rateAmount8 = rateAmount8;
	}

	public BigDecimal getRateAmount9() {
		return this.rateAmount9;
	}

	public void setRateAmount9(BigDecimal rateAmount9) {
		this.rateAmount9 = rateAmount9;
	}

	public String getRateCode1() {
		return this.rateCode1;
	}

	public void setRateCode1(String rateCode1) {
		this.rateCode1 = rateCode1;
	}

	public String getRateCode10() {
		return this.rateCode10;
	}

	public void setRateCode10(String rateCode10) {
		this.rateCode10 = rateCode10;
	}

	public String getRateCode11() {
		return this.rateCode11;
	}

	public void setRateCode11(String rateCode11) {
		this.rateCode11 = rateCode11;
	}

	public String getRateCode12() {
		return this.rateCode12;
	}

	public void setRateCode12(String rateCode12) {
		this.rateCode12 = rateCode12;
	}

	public String getRateCode13() {
		return this.rateCode13;
	}

	public void setRateCode13(String rateCode13) {
		this.rateCode13 = rateCode13;
	}

	public String getRateCode14() {
		return this.rateCode14;
	}

	public void setRateCode14(String rateCode14) {
		this.rateCode14 = rateCode14;
	}

	public String getRateCode15() {
		return this.rateCode15;
	}

	public void setRateCode15(String rateCode15) {
		this.rateCode15 = rateCode15;
	}

	public String getRateCode16() {
		return this.rateCode16;
	}

	public void setRateCode16(String rateCode16) {
		this.rateCode16 = rateCode16;
	}

	public String getRateCode17() {
		return this.rateCode17;
	}

	public void setRateCode17(String rateCode17) {
		this.rateCode17 = rateCode17;
	}

	public String getRateCode18() {
		return this.rateCode18;
	}

	public void setRateCode18(String rateCode18) {
		this.rateCode18 = rateCode18;
	}

	public String getRateCode19() {
		return this.rateCode19;
	}

	public void setRateCode19(String rateCode19) {
		this.rateCode19 = rateCode19;
	}

	public String getRateCode2() {
		return this.rateCode2;
	}

	public void setRateCode2(String rateCode2) {
		this.rateCode2 = rateCode2;
	}

	public String getRateCode20() {
		return this.rateCode20;
	}

	public void setRateCode20(String rateCode20) {
		this.rateCode20 = rateCode20;
	}

	public String getRateCode21() {
		return this.rateCode21;
	}

	public void setRateCode21(String rateCode21) {
		this.rateCode21 = rateCode21;
	}

	public String getRateCode22() {
		return this.rateCode22;
	}

	public void setRateCode22(String rateCode22) {
		this.rateCode22 = rateCode22;
	}

	public String getRateCode23() {
		return this.rateCode23;
	}

	public void setRateCode23(String rateCode23) {
		this.rateCode23 = rateCode23;
	}

	public String getRateCode24() {
		return this.rateCode24;
	}

	public void setRateCode24(String rateCode24) {
		this.rateCode24 = rateCode24;
	}

	public String getRateCode25() {
		return this.rateCode25;
	}

	public void setRateCode25(String rateCode25) {
		this.rateCode25 = rateCode25;
	}

	public String getRateCode26() {
		return this.rateCode26;
	}

	public void setRateCode26(String rateCode26) {
		this.rateCode26 = rateCode26;
	}

	public String getRateCode27() {
		return this.rateCode27;
	}

	public void setRateCode27(String rateCode27) {
		this.rateCode27 = rateCode27;
	}

	public String getRateCode28() {
		return this.rateCode28;
	}

	public void setRateCode28(String rateCode28) {
		this.rateCode28 = rateCode28;
	}

	public String getRateCode29() {
		return this.rateCode29;
	}

	public void setRateCode29(String rateCode29) {
		this.rateCode29 = rateCode29;
	}

	public String getRateCode3() {
		return this.rateCode3;
	}

	public void setRateCode3(String rateCode3) {
		this.rateCode3 = rateCode3;
	}

	public String getRateCode30() {
		return this.rateCode30;
	}

	public void setRateCode30(String rateCode30) {
		this.rateCode30 = rateCode30;
	}

	public String getRateCode4() {
		return this.rateCode4;
	}

	public void setRateCode4(String rateCode4) {
		this.rateCode4 = rateCode4;
	}

	public String getRateCode5() {
		return this.rateCode5;
	}

	public void setRateCode5(String rateCode5) {
		this.rateCode5 = rateCode5;
	}

	public String getRateCode6() {
		return this.rateCode6;
	}

	public void setRateCode6(String rateCode6) {
		this.rateCode6 = rateCode6;
	}

	public String getRateCode7() {
		return this.rateCode7;
	}

	public void setRateCode7(String rateCode7) {
		this.rateCode7 = rateCode7;
	}

	public String getRateCode8() {
		return this.rateCode8;
	}

	public void setRateCode8(String rateCode8) {
		this.rateCode8 = rateCode8;
	}

	public String getRateCode9() {
		return this.rateCode9;
	}

	public void setRateCode9(String rateCode9) {
		this.rateCode9 = rateCode9;
	}

	public String getReceiptNo() {
		return this.receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getSubOpClass() {
		return this.subOpClass;
	}

	public void setSubOpClass(String subOpClass) {
		this.subOpClass = subOpClass;
	}

	public BigDecimal getTaxExcludedTotalAmount() {
		return this.taxExcludedTotalAmount;
	}

	public void setTaxExcludedTotalAmount(BigDecimal taxExcludedTotalAmount) {
		this.taxExcludedTotalAmount = taxExcludedTotalAmount;
	}

	public BigDecimal getTaxZeroTotalAmount() {
		return this.taxZeroTotalAmount;
	}

	public void setTaxZeroTotalAmount(BigDecimal taxZeroTotalAmount) {
		this.taxZeroTotalAmount = taxZeroTotalAmount;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getTotalTax() {
		return this.totalTax;
	}

	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

}