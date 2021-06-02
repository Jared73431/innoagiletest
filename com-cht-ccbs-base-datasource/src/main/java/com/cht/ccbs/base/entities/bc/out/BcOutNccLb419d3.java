package com.cht.ccbs.base.entities.bc.out;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BcOutNccLb419d3 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3921740726144012456L;


	@Id
	@Column(name="cycle")
	private String cycle;

	@Column(name="batch_no")
	private String batchNo;

	@Column(name="office_code")
	private String officeCode;

	@Column(name="equip_no")
	private String equipNo;

	@Column(name="rate_Code_1")
	private String rateCode1;

	@Column(name="amount_1")
	private Integer amount1;

	@Column(name="rate_code_2")
	private String rateCode2;

	@Column(name="amount_2")
	private String amount2;

	@Column(name="rate_code_3")
	private String rateCode3;

	@Column(name="amount_3")
	private Integer amount3;

	@Column(name = "filler")
	private String filler;

}
