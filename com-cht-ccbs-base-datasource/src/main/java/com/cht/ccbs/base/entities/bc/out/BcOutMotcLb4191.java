package com.cht.ccbs.base.entities.bc.out;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BcOutMotcLb4191 implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6367299152257935282L;

	@Id
	@Column(name="cycle")
	private String cycle;

	@Column(name="bill_month")
	private Integer billMonth;

	@Column(name="lb419t1_cnt")
	private Integer bl419t1Cnt;

	@Column(name="lb419d2_cnt")
	private Integer lb419d2Cnt;

	@Column(name="lb419d3_cnt")
	private Integer lb419d3Cnt;

	@Column(name="lb419d4_cnt")
	private Integer lb419d4Cnt;

	@Column(name="wk_ntta_amt")
	private Integer wkNttaAmt;

	@Column(name="wk_ctta_amt")
	private Integer wkCttaAmt;

	@Column(name="wk_stta_amt")
	private Integer wkSttaAmt;

	@Column(name="wk_dci_amt")
	private Integer wkDciAmt;

	@Column(name="wl_bms_amt")
	private Integer wlBmsAmt;

	@Column(name="wk_3g_amt")
	private Integer wl3gAmt;

	@Column(name="wk_include_amt")
	private Integer wkImcludeAmt;

	@Column(name="wk_uninclude_amt")
	private Integer wkUnincludeAmt;

}
