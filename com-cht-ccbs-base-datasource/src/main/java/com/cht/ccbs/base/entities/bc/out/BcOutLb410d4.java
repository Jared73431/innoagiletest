package com.cht.ccbs.base.entities.bc.out;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bc_out_lb410d4 database table.
 * 
 */
@Entity
@Table(name="bc_out_lb410d4")
@NamedQuery(name="BcOutLb410d4.findAll", query="SELECT b FROM BcOutLb410d4 b")
public class BcOutLb410d4 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="self_pk")
	private String selfPk;

	@Column(name="acc_no")
	private String accNo;

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

	@Column(name="bu_group")
	private String buGroup;

	@Column(name="c63_amount")
	private BigDecimal c63Amount;

	@Column(name="c68_amount")
	private BigDecimal c68Amount;

	@Column(name="c81_amount")
	private BigDecimal c81Amount;

	@Column(name="c89_amount")
	private BigDecimal c89Amount;

	private String cycle;

	@Column(name="delete_date")
	private String deleteDate;

	@Column(name="equip_no")
	private String equipNo;

	@Column(name="is_card_refund")
	private String isCardRefund;

	@Column(name="is_over_two_month")
	private String isOverTwoMonth;

	@Column(name="l85_amount")
	private BigDecimal l85Amount;

	@Column(name="l85_amt")
	private BigDecimal l85Amt;

	@Column(name="l85_code")
	private String l85Code;

	@Column(name="l86_amount")
	private BigDecimal l86Amount;

	@Column(name="l86_amt")
	private BigDecimal l86Amt;

	@Column(name="l86_code")
	private String l86Code;

	@Column(name="l87_amount")
	private BigDecimal l87Amount;

	@Column(name="l87_amt")
	private BigDecimal l87Amt;

	@Column(name="l87_code")
	private String l87Code;

	@Column(name="lmn_amount")
	private BigDecimal lmnAmount;

	@Column(name="lmn_amt")
	private BigDecimal lmnAmt;

	@Column(name="lmn_code")
	private String lmnCode;

	@Column(name="new_old_telno")
	private String newOldTelno;

	@Column(name="new_old_type")
	private String newOldType;

	@Column(name="office_code")
	private String officeCode;

	@Column(name="op_class")
	private String opClass;

	@Column(name="op_code")
	private String opCode;

	@Column(name="rate_amount")
	private BigDecimal rateAmount;

	@Column(name="rate_code")
	private String rateCode;

	@Column(name="status_code")
	private String statusCode;

	@Column(name="tax_print_type")
	private String taxPrintType;

	private String tax2;

	@Column(name="total_amount")
	private BigDecimal totalAmount;

	public BcOutLb410d4() {
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

	public String getBuGroup() {
		return this.buGroup;
	}

	public void setBuGroup(String buGroup) {
		this.buGroup = buGroup;
	}

	public BigDecimal getC63Amount() {
		return this.c63Amount;
	}

	public void setC63Amount(BigDecimal c63Amount) {
		this.c63Amount = c63Amount;
	}

	public BigDecimal getC68Amount() {
		return this.c68Amount;
	}

	public void setC68Amount(BigDecimal c68Amount) {
		this.c68Amount = c68Amount;
	}

	public BigDecimal getC81Amount() {
		return this.c81Amount;
	}

	public void setC81Amount(BigDecimal c81Amount) {
		this.c81Amount = c81Amount;
	}

	public BigDecimal getC89Amount() {
		return this.c89Amount;
	}

	public void setC89Amount(BigDecimal c89Amount) {
		this.c89Amount = c89Amount;
	}

	public String getCycle() {
		return this.cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public String getDeleteDate() {
		return this.deleteDate;
	}

	public void setDeleteDate(String deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getEquipNo() {
		return this.equipNo;
	}

	public void setEquipNo(String equipNo) {
		this.equipNo = equipNo;
	}

	public String getIsCardRefund() {
		return this.isCardRefund;
	}

	public void setIsCardRefund(String isCardRefund) {
		this.isCardRefund = isCardRefund;
	}

	public String getIsOverTwoMonth() {
		return this.isOverTwoMonth;
	}

	public void setIsOverTwoMonth(String isOverTwoMonth) {
		this.isOverTwoMonth = isOverTwoMonth;
	}

	public BigDecimal getL85Amount() {
		return this.l85Amount;
	}

	public void setL85Amount(BigDecimal l85Amount) {
		this.l85Amount = l85Amount;
	}

	public BigDecimal getL85Amt() {
		return this.l85Amt;
	}

	public void setL85Amt(BigDecimal l85Amt) {
		this.l85Amt = l85Amt;
	}

	public String getL85Code() {
		return this.l85Code;
	}

	public void setL85Code(String l85Code) {
		this.l85Code = l85Code;
	}

	public BigDecimal getL86Amount() {
		return this.l86Amount;
	}

	public void setL86Amount(BigDecimal l86Amount) {
		this.l86Amount = l86Amount;
	}

	public BigDecimal getL86Amt() {
		return this.l86Amt;
	}

	public void setL86Amt(BigDecimal l86Amt) {
		this.l86Amt = l86Amt;
	}

	public String getL86Code() {
		return this.l86Code;
	}

	public void setL86Code(String l86Code) {
		this.l86Code = l86Code;
	}

	public BigDecimal getL87Amount() {
		return this.l87Amount;
	}

	public void setL87Amount(BigDecimal l87Amount) {
		this.l87Amount = l87Amount;
	}

	public BigDecimal getL87Amt() {
		return this.l87Amt;
	}

	public void setL87Amt(BigDecimal l87Amt) {
		this.l87Amt = l87Amt;
	}

	public String getL87Code() {
		return this.l87Code;
	}

	public void setL87Code(String l87Code) {
		this.l87Code = l87Code;
	}

	public BigDecimal getLmnAmount() {
		return this.lmnAmount;
	}

	public void setLmnAmount(BigDecimal lmnAmount) {
		this.lmnAmount = lmnAmount;
	}

	public BigDecimal getLmnAmt() {
		return this.lmnAmt;
	}

	public void setLmnAmt(BigDecimal lmnAmt) {
		this.lmnAmt = lmnAmt;
	}

	public String getLmnCode() {
		return this.lmnCode;
	}

	public void setLmnCode(String lmnCode) {
		this.lmnCode = lmnCode;
	}

	public String getNewOldTelno() {
		return this.newOldTelno;
	}

	public void setNewOldTelno(String newOldTelno) {
		this.newOldTelno = newOldTelno;
	}

	public String getNewOldType() {
		return this.newOldType;
	}

	public void setNewOldType(String newOldType) {
		this.newOldType = newOldType;
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

	public String getOpCode() {
		return this.opCode;
	}

	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}

	public BigDecimal getRateAmount() {
		return this.rateAmount;
	}

	public void setRateAmount(BigDecimal rateAmount) {
		this.rateAmount = rateAmount;
	}

	public String getRateCode() {
		return this.rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getTaxPrintType() {
		return this.taxPrintType;
	}

	public void setTaxPrintType(String taxPrintType) {
		this.taxPrintType = taxPrintType;
	}

	public String getTax2() {
		return this.tax2;
	}

	public void setTax2(String tax2) {
		this.tax2 = tax2;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

}