package com.cht.ccbs.base.entities.bc.out;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.*;

@Getter
@Setter
public class BcOutNccLb419d2Lb419d3 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1707783760416259280L;

	@Id
	@Column(name = "control_char")
	private String controlChar;  

	@Column(name = "adminis_office_type")
	private String adminisOfficeType;

	@Column(name = "direct_debit_no")
	private String directDebitNo;

	@Column(name = "acc_no")
	private String accNo;

	@Column(name = "bill_office_code")
	private String billOfficeCode;

	@Column(name = "bill_equip_no")
	private String billEquipNo;

	@Column(name = "equip_no")
	private String equipNo;

	@Column(name = "bill_code")
	private String billCode;

	@Column(name = "bill_month")
	private String billMonth;

	@Column(name = "pay_deadline")
	private String payDeadline;

	@Column(name = "pbx_type")
	private String pbxType;

	@Column(name = "total_amount")
	private Integer totalAmount;

	@Column(name = "rate_item")
	private String rateItem;

	@Column(name = "total_tax")
	private Integer totalTax;

	@Column(name = "balance_foreard")
	private String balanceForward;

	@Column(name = "bill_idcard_no")
	private String BillIdcardNo;

	@Column(name = "receipt_no")
	private String receiptNo;

	@Column(name = "idcard_office_code")
	private String idcardOfficeCode;

	@Column(name = "delivery_no")
	private String deliveryNo;

	@Column(name = "offering_type")
	private String offeringType;

	@Column(name = "op_class")
	private String opClass;

	@Column(name = "sub_op_class")
	private String subOpClass;

	@Column(name = "general_tax_total_amount")
	private String generalTaxTotalAmount;

	@Column(name = "tax_zero_total_amount")
	private String taxZeroTotalAmount;

	@Column(name = "tax_excluded_total_amount")
	private String taxExcludedTotalAmount;

	@Column(name = "office_code")
	private String officeCode;

	@Column(name = "is_over_l3_rate_item_limit")
	private String isOverL3rateItemLimit;

	@Column(name = "overflag_y_or_n")
	private String overflagYOrN;

	@Column(name = "filler")
	private String filler;
}
