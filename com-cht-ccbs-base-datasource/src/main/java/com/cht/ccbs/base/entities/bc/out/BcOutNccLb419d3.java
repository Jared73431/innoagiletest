package com.cht.ccbs.base.entities.bc.out;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bc_out_ncc_lb419d3 database table.
 * 
 */
@Entity
@Table(name="bc_out_ncc_lb419d3")
@NamedQuery(name="BcOutNccLb419d3.findAll", query="SELECT b FROM BcOutNccLb419d3 b")
public class BcOutNccLb419d3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="self_pk")
	private String selfPk;

	@Column(name="amount_1")
	private BigDecimal amount1;

	@Column(name="amount_2")
	private BigDecimal amount2;

	@Column(name="amount_3")
	private BigDecimal amount3;

	@Column(name="batch_no")
	private String batchNo;

	private String cycle;

	@Column(name="equip_no")
	private String equipNo;

	@Column(name="office_code")
	private String officeCode;

	@Column(name="rate_code_1")
	private String rateCode1;

	@Column(name="rate_code_2")
	private String rateCode2;

	@Column(name="rate_code_3")
	private String rateCode3;

	@Column(name="tx_code")
	private String txCode;

	public BcOutNccLb419d3() {
	}

	public String getSelfPk() {
		return this.selfPk;
	}

	public void setSelfPk(String selfPk) {
		this.selfPk = selfPk;
	}

	public BigDecimal getAmount1() {
		return this.amount1;
	}

	public void setAmount1(BigDecimal amount1) {
		this.amount1 = amount1;
	}

	public BigDecimal getAmount2() {
		return this.amount2;
	}

	public void setAmount2(BigDecimal amount2) {
		this.amount2 = amount2;
	}

	public BigDecimal getAmount3() {
		return this.amount3;
	}

	public void setAmount3(BigDecimal amount3) {
		this.amount3 = amount3;
	}

	public String getBatchNo() {
		return this.batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
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

	public String getRateCode1() {
		return this.rateCode1;
	}

	public void setRateCode1(String rateCode1) {
		this.rateCode1 = rateCode1;
	}

	public String getRateCode2() {
		return this.rateCode2;
	}

	public void setRateCode2(String rateCode2) {
		this.rateCode2 = rateCode2;
	}

	public String getRateCode3() {
		return this.rateCode3;
	}

	public void setRateCode3(String rateCode3) {
		this.rateCode3 = rateCode3;
	}

	public String getTxCode() {
		return this.txCode;
	}

	public void setTxCode(String txCode) {
		this.txCode = txCode;
	}

}