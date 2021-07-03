package com.cht.ccbs.base.entities.bc.out;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bc_out_lb747t2 database table.
 * 
 */
@Entity
@Table(name="bc_out_lb747t2")
@NamedQuery(name="BcOutLb747t2.findAll", query="SELECT b FROM BcOutLb747t2 b")
public class BcOutLb747t2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="self_pk")
	private String selfPk;

	@Column(name="bill_month")
	private BigDecimal billMonth;

	@Column(name="business_cnt")
	private BigDecimal businessCnt;

	@Column(name="business_discount")
	private BigDecimal businessDiscount;

	@Column(name="business_discount1")
	private BigDecimal businessDiscount1;

	private String cycle;

	@Column(name="not_self_total_amount")
	private BigDecimal notSelfTotalAmount;

	@Column(name="not_share_amount")
	private BigDecimal notShareAmount;

	@Column(name="old_business_total_amount")
	private BigDecimal oldBusinessTotalAmount;

	@Column(name="pbx_business_cnt")
	private BigDecimal pbxBusinessCnt;

	@Column(name="pbx_business_discount")
	private BigDecimal pbxBusinessDiscount;

	@Column(name="pbx_business_discount1")
	private BigDecimal pbxBusinessDiscount1;

	@Column(name="pbx_business_total_amt")
	private BigDecimal pbxBusinessTotalAmt;

	@Column(name="pbx_start_flag")
	private String pbxStartFlag;

	@Column(name="project_total_amount")
	private BigDecimal projectTotalAmount;

	@Column(name="total_amount")
	private BigDecimal totalAmount;

	@Column(name="total_amount_dis")
	private BigDecimal totalAmountDis;

	@Column(name="total_amount_not_dis")
	private BigDecimal totalAmountNotDis;

	public BcOutLb747t2() {
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

	public BigDecimal getBusinessCnt() {
		return this.businessCnt;
	}

	public void setBusinessCnt(BigDecimal businessCnt) {
		this.businessCnt = businessCnt;
	}

	public BigDecimal getBusinessDiscount() {
		return this.businessDiscount;
	}

	public void setBusinessDiscount(BigDecimal businessDiscount) {
		this.businessDiscount = businessDiscount;
	}

	public BigDecimal getBusinessDiscount1() {
		return this.businessDiscount1;
	}

	public void setBusinessDiscount1(BigDecimal businessDiscount1) {
		this.businessDiscount1 = businessDiscount1;
	}

	public String getCycle() {
		return this.cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public BigDecimal getNotSelfTotalAmount() {
		return this.notSelfTotalAmount;
	}

	public void setNotSelfTotalAmount(BigDecimal notSelfTotalAmount) {
		this.notSelfTotalAmount = notSelfTotalAmount;
	}

	public BigDecimal getNotShareAmount() {
		return this.notShareAmount;
	}

	public void setNotShareAmount(BigDecimal notShareAmount) {
		this.notShareAmount = notShareAmount;
	}

	public BigDecimal getOldBusinessTotalAmount() {
		return this.oldBusinessTotalAmount;
	}

	public void setOldBusinessTotalAmount(BigDecimal oldBusinessTotalAmount) {
		this.oldBusinessTotalAmount = oldBusinessTotalAmount;
	}

	public BigDecimal getPbxBusinessCnt() {
		return this.pbxBusinessCnt;
	}

	public void setPbxBusinessCnt(BigDecimal pbxBusinessCnt) {
		this.pbxBusinessCnt = pbxBusinessCnt;
	}

	public BigDecimal getPbxBusinessDiscount() {
		return this.pbxBusinessDiscount;
	}

	public void setPbxBusinessDiscount(BigDecimal pbxBusinessDiscount) {
		this.pbxBusinessDiscount = pbxBusinessDiscount;
	}

	public BigDecimal getPbxBusinessDiscount1() {
		return this.pbxBusinessDiscount1;
	}

	public void setPbxBusinessDiscount1(BigDecimal pbxBusinessDiscount1) {
		this.pbxBusinessDiscount1 = pbxBusinessDiscount1;
	}

	public BigDecimal getPbxBusinessTotalAmt() {
		return this.pbxBusinessTotalAmt;
	}

	public void setPbxBusinessTotalAmt(BigDecimal pbxBusinessTotalAmt) {
		this.pbxBusinessTotalAmt = pbxBusinessTotalAmt;
	}

	public String getPbxStartFlag() {
		return this.pbxStartFlag;
	}

	public void setPbxStartFlag(String pbxStartFlag) {
		this.pbxStartFlag = pbxStartFlag;
	}

	public BigDecimal getProjectTotalAmount() {
		return this.projectTotalAmount;
	}

	public void setProjectTotalAmount(BigDecimal projectTotalAmount) {
		this.projectTotalAmount = projectTotalAmount;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getTotalAmountDis() {
		return this.totalAmountDis;
	}

	public void setTotalAmountDis(BigDecimal totalAmountDis) {
		this.totalAmountDis = totalAmountDis;
	}

	public BigDecimal getTotalAmountNotDis() {
		return this.totalAmountNotDis;
	}

	public void setTotalAmountNotDis(BigDecimal totalAmountNotDis) {
		this.totalAmountNotDis = totalAmountNotDis;
	}

}