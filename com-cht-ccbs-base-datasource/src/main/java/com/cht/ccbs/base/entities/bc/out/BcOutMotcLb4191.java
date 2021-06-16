package com.cht.ccbs.base.entities.bc.out;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bc_out_motc_lb4191 database table.
 * 
 */
@Entity
@Table(name="bc_out_motc_lb4191")
@NamedQuery(name="BcOutMotcLb4191.findAll", query="SELECT b FROM BcOutMotcLb4191 b")
public class BcOutMotcLb4191 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="self_pk")
	private String selfPk;

	@Column(name="bill_month")
	private BigDecimal billMonth;

	private String cycle;

	@Column(name="lb419d2_cnt")
	private BigDecimal lb419d2Cnt;

	@Column(name="lb419d3_cnt")
	private BigDecimal lb419d3Cnt;

	@Column(name="lb419d4_cnt")
	private BigDecimal lb419d4Cnt;

	@Column(name="lb419t1_cnt")
	private BigDecimal lb419t1Cnt;

	@Column(name="wk_3g_amt")
	private BigDecimal wk3gAmt;

	@Column(name="wk_bms_amt")
	private BigDecimal wkBmsAmt;

	@Column(name="wk_ctta_amt")
	private BigDecimal wkCttaAmt;

	@Column(name="wk_dci_amt")
	private BigDecimal wkDciAmt;

	@Column(name="wk_include_amt")
	private BigDecimal wkIncludeAmt;

	@Column(name="wk_ntta_amt")
	private BigDecimal wkNttaAmt;

	@Column(name="wk_stta_amt")
	private BigDecimal wkSttaAmt;

	@Column(name="wk_uninclude_amt")
	private BigDecimal wkUnincludeAmt;

	public BcOutMotcLb4191() {
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

	public BigDecimal getLb419d2Cnt() {
		return this.lb419d2Cnt;
	}

	public void setLb419d2Cnt(BigDecimal lb419d2Cnt) {
		this.lb419d2Cnt = lb419d2Cnt;
	}

	public BigDecimal getLb419d3Cnt() {
		return this.lb419d3Cnt;
	}

	public void setLb419d3Cnt(BigDecimal lb419d3Cnt) {
		this.lb419d3Cnt = lb419d3Cnt;
	}

	public BigDecimal getLb419d4Cnt() {
		return this.lb419d4Cnt;
	}

	public void setLb419d4Cnt(BigDecimal lb419d4Cnt) {
		this.lb419d4Cnt = lb419d4Cnt;
	}

	public BigDecimal getLb419t1Cnt() {
		return this.lb419t1Cnt;
	}

	public void setLb419t1Cnt(BigDecimal lb419t1Cnt) {
		this.lb419t1Cnt = lb419t1Cnt;
	}

	public BigDecimal getWk3gAmt() {
		return this.wk3gAmt;
	}

	public void setWk3gAmt(BigDecimal wk3gAmt) {
		this.wk3gAmt = wk3gAmt;
	}

	public BigDecimal getWkBmsAmt() {
		return this.wkBmsAmt;
	}

	public void setWkBmsAmt(BigDecimal wkBmsAmt) {
		this.wkBmsAmt = wkBmsAmt;
	}

	public BigDecimal getWkCttaAmt() {
		return this.wkCttaAmt;
	}

	public void setWkCttaAmt(BigDecimal wkCttaAmt) {
		this.wkCttaAmt = wkCttaAmt;
	}

	public BigDecimal getWkDciAmt() {
		return this.wkDciAmt;
	}

	public void setWkDciAmt(BigDecimal wkDciAmt) {
		this.wkDciAmt = wkDciAmt;
	}

	public BigDecimal getWkIncludeAmt() {
		return this.wkIncludeAmt;
	}

	public void setWkIncludeAmt(BigDecimal wkIncludeAmt) {
		this.wkIncludeAmt = wkIncludeAmt;
	}

	public BigDecimal getWkNttaAmt() {
		return this.wkNttaAmt;
	}

	public void setWkNttaAmt(BigDecimal wkNttaAmt) {
		this.wkNttaAmt = wkNttaAmt;
	}

	public BigDecimal getWkSttaAmt() {
		return this.wkSttaAmt;
	}

	public void setWkSttaAmt(BigDecimal wkSttaAmt) {
		this.wkSttaAmt = wkSttaAmt;
	}

	public BigDecimal getWkUnincludeAmt() {
		return this.wkUnincludeAmt;
	}

	public void setWkUnincludeAmt(BigDecimal wkUnincludeAmt) {
		this.wkUnincludeAmt = wkUnincludeAmt;
	}

}