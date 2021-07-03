package com.cht.ccbs.base.entities.bc.out;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bc_out_lb676t1 database table.
 * 
 */
@Entity
@Table(name="bc_out_lb676t1")
@NamedQuery(name="BcOutLb676t1.findAll", query="SELECT b FROM BcOutLb676t1 b")
public class BcOutLb676t1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="self_pk")
	private String selfPk;

	@Column(name="bill_month")
	private BigDecimal billMonth;

	private String cycle;

	@Column(name="share_rate_code")
	private String shareRateCode;

	@Column(name="share_rate_code_amt")
	private BigDecimal shareRateCodeAmt;

	public BcOutLb676t1() {
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

	public String getShareRateCode() {
		return this.shareRateCode;
	}

	public void setShareRateCode(String shareRateCode) {
		this.shareRateCode = shareRateCode;
	}

	public BigDecimal getShareRateCodeAmt() {
		return this.shareRateCodeAmt;
	}

	public void setShareRateCodeAmt(BigDecimal shareRateCodeAmt) {
		this.shareRateCodeAmt = shareRateCodeAmt;
	}

}