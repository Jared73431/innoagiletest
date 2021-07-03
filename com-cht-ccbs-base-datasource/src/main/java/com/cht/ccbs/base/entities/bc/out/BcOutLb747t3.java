package com.cht.ccbs.base.entities.bc.out;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bc_out_lb747t3 database table.
 * 
 */
@Entity
@Table(name="bc_out_lb747t3")
@NamedQuery(name="BcOutLb747t3.findAll", query="SELECT b FROM BcOutLb747t3 b")
public class BcOutLb747t3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="self_pk")
	private String selfPk;

	@Column(name="bill_month")
	private BigDecimal billMonth;

	private String cycle;

	@Column(name="equip_no")
	private String equipNo;

	@Column(name="office_code")
	private String officeCode;

	@Column(name="rate_amount")
	private BigDecimal rateAmount;

	@Column(name="rate_code")
	private String rateCode;

	public BcOutLb747t3() {
	}

	public String getSelfPk() {
		return this.selfPk;
	}

	public void setSelfPk(String selfPk) {
		this.selfPk = selfPk;
	}

	public BigDecimal getBillMonth() {
		return this.billMonth;
	}

	public void setBillMonth(BigDecimal billMonth) {
		this.billMonth = billMonth;
	}

	public String getCycle() {
		return this.cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public String getEquipNo() {
		return this.equipNo;
	}

	public void setEquipNo(String equipNo) {
		this.equipNo = equipNo;
	}

	public String getOfficeCode() {
		return this.officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
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

}