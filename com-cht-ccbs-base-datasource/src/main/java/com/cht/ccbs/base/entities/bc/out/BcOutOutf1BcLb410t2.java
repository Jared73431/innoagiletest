package com.cht.ccbs.base.entities.bc.out;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bc_out_outf1_bc_lb410t2 database table.
 * 
 */
@Entity
@Table(name="bc_out_outf1_bc_lb410t2")
@NamedQuery(name="BcOutOutf1BcLb410t2.findAll", query="SELECT b FROM BcOutOutf1BcLb410t2 b")
public class BcOutOutf1BcLb410t2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="self_pk")
	private String selfPk;

	@Column(name="a_modem_charge")
	private BigDecimal aModemCharge;

	@Column(name="a_point_office_code")
	private String aPointOfficeCode;

	@Column(name="acc_no")
	private String accNo;

	@Column(name="actual_month")
	private BigDecimal actualMonth;

	@Column(name="adminis_all_type")
	private String adminisAllType;

	@Column(name="adminis_office_type")
	private String adminisOfficeType;

	@Column(name="adsl_annual_begin_date")
	private String adslAnnualBeginDate;

	@Column(name="adsl_annual_end_date")
	private String adslAnnualEndDate;

	@Column(name="adsl_broadband_payment_type")
	private String adslBroadbandPaymentType;

	@Column(name="adsl_discount_code")
	private String adslDiscountCode;

	@Column(name="adsl_old_discount")
	private BigDecimal adslOldDiscount;

	@Column(name="adsl_prepayment_balance")
	private BigDecimal adslPrepaymentBalance;

	@Column(name="adsl_speed_code")
	private String adslSpeedCode;

	@Column(name="adsl_sub_equip_count")
	private BigDecimal adslSubEquipCount;

	@Column(name="apply_idcard_no")
	private String applyIdcardNo;

	@Column(name="b_modem_charge")
	private BigDecimal bModemCharge;

	@Column(name="b_point_office_code")
	private String bPointOfficeCode;

	@Column(name="balance_forward")
	private BigDecimal balanceForward;

	@Column(name="basic_message")
	private BigDecimal basicMessage;

	@Column(name="bbc_discount")
	private BigDecimal bbcDiscount;

	@Column(name="best_mpro")
	private String bestMpro;

	@Column(name="best_package")
	private String bestPackage;

	@Column(name="bill_bar_code_type")
	private String billBarCodeType;

	@Column(name="bill_bu_group")
	private String billBuGroup;

	@Column(name="bill_code")
	private String billCode;

	@Column(name="bill_cycle_not_normal_type")
	private String billCycleNotNormalType;

	@Column(name="bill_delivery_type")
	private String billDeliveryType;

	@Column(name="bill_equip_no")
	private String billEquipNo;

	@Column(name="bill_idcard_no")
	private String billIdcardNo;

	@Column(name="bill_month")
	private BigDecimal billMonth;

	@Column(name="bill_office_code")
	private String billOfficeCode;

	@Column(name="bill_official_department")
	private String billOfficialDepartment;

	@Column(name="bill_share_type")
	private String billShareType;

	@Column(name="bill_test_equip_type")
	private String billTestEquipType;

	@Column(name="bill_total_amount")
	private BigDecimal billTotalAmount;

	@Column(name="billing_duration_begin_date")
	private String billingDurationBeginDate;

	@Column(name="billing_duration_end_date")
	private String billingDurationEndDate;

	@Column(name="billing_equip_no")
	private String billingEquipNo;

	@Column(name="billing_office_code")
	private String billingOfficeCode;

	@Column(name="bu_group")
	private String buGroup;

	@Column(name="business_bill_user_code")
	private String businessBillUserCode;

	@Column(name="call_detail_enclosure_type")
	private String callDetailEnclosureType;

	@Column(name="check_digit")
	private String checkDigit;

	@Column(name="circuit_type")
	private String circuitType;

	@Column(name="clg_type")
	private String clgType;

	@Column(name="cmvpn_discount_type")
	private String cmvpnDiscountType;

	@Column(name="community_id")
	private String communityId;

	@Column(name="community_id_type")
	private String communityIdType;

	@Column(name="counter_prepaid_last_rebate")
	private BigDecimal counterPrepaidLastRebate;

	@Column(name="counter_prepaid_this_rebate")
	private BigDecimal counterPrepaidThisRebate;

	@Column(name="counter_prepayment_balance")
	private BigDecimal counterPrepaymentBalance;

	@Column(name="credit_level")
	private String creditLevel;

	@Column(name="cvpn_discount")
	private BigDecimal cvpnDiscount;

	private String cycle;

	@Column(name="d5g_discount")
	private BigDecimal d5gDiscount;

	@Column(name="data_discount_type")
	private String dataDiscountType;

	@Column(name="data_process_type")
	private String dataProcessType;

	@Column(name="delete_date")
	private String deleteDate;

	@Column(name="delivery_no")
	private String deliveryNo;

	@Column(name="deposit_last_month_balance")
	private BigDecimal depositLastMonthBalance;

	@Column(name="deposit_this_month_balance")
	private BigDecimal depositThisMonthBalance;

	@Column(name="detail_offer_type")
	private String detailOfferType;

	@Column(name="did_print_type")
	private String didPrintType;

	@Column(name="did_trunk_mth_serv_discount")
	private BigDecimal didTrunkMthServDiscount;

	@Column(name="direct_debit_no")
	private String directDebitNo;

	@Column(name="disaster_type")
	private String disasterType;

	@Column(name="ebms_bill_type")
	private String ebmsBillType;

	@Column(name="elect_invoice_carrier_type")
	private String electInvoiceCarrierType;

	@Column(name="enterprise_broadband_discount")
	private BigDecimal enterpriseBroadbandDiscount;

	@Column(name="equip_no")
	private String equipNo;

	@Column(name="extension_discount")
	private BigDecimal extensionDiscount;

	@Column(name="ezvpn_discount_code_a")
	private String ezvpnDiscountCodeA;

	@Column(name="ezvpn_discount_code_b")
	private String ezvpnDiscountCodeB;

	@Column(name="f2_member_type")
	private String f2MemberType;

	@Column(name="fax_type")
	private String faxType;

	private String filler1;

	@Column(name="first_negative_amount")
	private BigDecimal firstNegativeAmount;

	@Column(name="fttb_speed_code")
	private String fttbSpeedCode;

	@Column(name="ftxhn_expire_notify_type")
	private String ftxhnExpireNotifyType;

	@Column(name="general_tax_total_amount")
	private BigDecimal generalTaxTotalAmount;

	@Column(name="group_office_code")
	private String groupOfficeCode;

	@Column(name="gsm_before_rebate_amount")
	private BigDecimal gsmBeforeRebateAmount;

	@Column(name="gsm_business_bill_id")
	private String gsmBusinessBillId;

	@Column(name="gsm_domestic_call_discount")
	private String gsmDomesticCallDiscount;

	@Column(name="gsm_inmarsat_discount")
	private BigDecimal gsmInmarsatDiscount;

	@Column(name="gsm_intl_charge_discount")
	private BigDecimal gsmIntlChargeDiscount;

	@Column(name="gsm_old_discount")
	private String gsmOldDiscount;

	@Column(name="gsm_project_discount")
	private BigDecimal gsmProjectDiscount;

	@Column(name="gsm_project_recharge_amount")
	private BigDecimal gsmProjectRechargeAmount;

	@Column(name="gsm_project_recharge_balance")
	private BigDecimal gsmProjectRechargeBalance;

	@Column(name="gsm_project_recharge_rebate")
	private BigDecimal gsmProjectRechargeRebate;

	@Column(name="gsm_project_type")
	private String gsmProjectType;

	@Column(name="gsm_sale_discount")
	private BigDecimal gsmSaleDiscount;

	@Column(name="gsm_satellite_discount")
	private BigDecimal gsmSatelliteDiscount;

	@Column(name="gsm_service_type")
	private String gsmServiceType;

	@Column(name="gsm_type")
	private String gsmType;

	@Column(name="gsm_vip_discount")
	private String gsmVipDiscount;

	@Column(name="has_call_detail")
	private String hasCallDetail;

	@Column(name="has_hinet_merged_bill")
	private String hasHinetMergedBill;

	@Column(name="has_in_merged_bill")
	private String hasInMergedBill;

	@Column(name="has_pager_merged_bill")
	private String hasPagerMergedBill;

	@Column(name="hdtv_last_prepayment_balance")
	private BigDecimal hdtvLastPrepaymentBalance;

	@Column(name="hdtv_this_prepayment_balance")
	private BigDecimal hdtvThisPrepaymentBalance;

	@Column(name="hdtv_this_rebate_amount")
	private BigDecimal hdtvThisRebateAmount;

	@Column(name="hi_building_agency")
	private String hiBuildingAgency;

	@Column(name="hinet_boundle_discount_code")
	private String hinetBoundleDiscountCode;

	@Column(name="hinet_op_class")
	private String hinetOpClass;

	@Column(name="hn_accumulated_point")
	private BigDecimal hnAccumulatedPoint;

	@Column(name="hn_available_point")
	private BigDecimal hnAvailablePoint;

	@Column(name="hn_deadline")
	private String hnDeadline;

	@Column(name="hn_discount_class")
	private String hnDiscountClass;

	@Column(name="hn_mdm_type")
	private String hnMdmType;

	@Column(name="hn_sub_equip_count")
	private BigDecimal hnSubEquipCount;

	@Column(name="hn_this_mth_added_point")
	private BigDecimal hnThisMthAddedPoint;

	@Column(name="hn_useed_point")
	private BigDecimal hnUseedPoint;

	@Column(name="hold_month")
	private BigDecimal holdMonth;

	@Column(name="icbi_bill_category")
	private String icbiBillCategory;

	@Column(name="in_batch_leased_discount")
	private String inBatchLeasedDiscount;

	@Column(name="in_discount")
	private String inDiscount;

	@Column(name="in_intl_charge_discount")
	private BigDecimal inIntlChargeDiscount;

	@Column(name="in_next_mth_project_discount")
	private String inNextMthProjectDiscount;

	@Column(name="in_notify_type")
	private String inNotifyType;

	@Column(name="in_old_discount")
	private String inOldDiscount;

	@Column(name="in_rent_type")
	private String inRentType;

	@Column(name="in_start_yymm")
	private String inStartYymm;

	@Column(name="in_stop_yymm")
	private String inStopYymm;

	@Column(name="in_this_mth_project_discount")
	private String inThisMthProjectDiscount;

	@Column(name="in_vip_discount")
	private String inVipDiscount;

	@Column(name="indoor_line_maint_charge_type")
	private String indoorLineMaintChargeType;

	@Column(name="install_date")
	private String installDate;

	@Column(name="intl_charge_same_eqp_amount")
	private BigDecimal intlChargeSameEqpAmount;

	@Column(name="intl_charge_same_id_amount")
	private BigDecimal intlChargeSameIdAmount;

	@Column(name="invoice_carrier_no")
	private String invoiceCarrierNo;

	@Column(name="invoice_charge_type")
	private String invoiceChargeType;

	@Column(name="invoice_donation_type")
	private String invoiceDonationType;

	@Column(name="ip_centrex_charge_type")
	private String ipCentrexChargeType;

	@Column(name="is_0800_call_detail")
	private String is0800CallDetail;

	@Column(name="is_4g_bundle_charge_separatation")
	private String is4gBundleChargeSeparatation;

	@Column(name="is_abate")
	private String isAbate;

	@Column(name="is_adjust_adsl_monthly_charge")
	private String isAdjustAdslMonthlyCharge;

	@Column(name="is_advertisement")
	private String isAdvertisement;

	@Column(name="is_applied_bill")
	private String isAppliedBill;

	@Column(name="is_applied_payment_notice")
	private String isAppliedPaymentNotice;

	@Column(name="is_applied_payment_result")
	private String isAppliedPaymentResult;

	@Column(name="is_applied_tform")
	private String isAppliedTform;

	@Column(name="is_bill_equip_no")
	private String isBillEquipNo;

	@Column(name="is_bundle")
	private String isBundle;

	@Column(name="is_business_bill")
	private String isBusinessBill;

	@Column(name="is_change_cycle")
	private String isChangeCycle;

	@Column(name="is_change_name")
	private String isChangeName;

	@Column(name="is_cmp")
	private String isCmp;

	@Column(name="is_community")
	private String isCommunity;

	@Column(name="is_counter_prepayment")
	private String isCounterPrepayment;

	@Column(name="is_deduct_untaxed_zero_charge")
	private String isDeductUntaxedZeroCharge;

	@Column(name="is_delivery_addr")
	private String isDeliveryAddr;

	@Column(name="is_direcpc")
	private String isDirecpc;

	@Column(name="is_discount_expiration_notice")
	private String isDiscountExpirationNotice;

	@Column(name="is_e_bill")
	private String isEBill;

	@Column(name="is_e_receipt")
	private String isEReceipt;

	@Column(name="is_ecomm_call_detail")
	private String isEcommCallDetail;

	@Column(name="is_equip_oneself_merged")
	private String isEquipOneselfMerged;

	@Column(name="is_hami_walet_app")
	private String isHamiWaletApp;

	@Column(name="is_hn_discount")
	private String isHnDiscount;

	@Column(name="is_included_untaxed_exp_code")
	private String isIncludedUntaxedExpCode;

	@Column(name="is_intl_call_detail")
	private String isIntlCallDetail;

	@Column(name="is_join")
	private String isJoin;

	@Column(name="is_l3w")
	private String isL3w;

	@Column(name="is_line_business_connect")
	private String isLineBusinessConnect;

	@Column(name="is_loc_call_detail_inquiry_charge")
	private String isLocCallDetailInquiryCharge;

	@Column(name="is_micro_payment_bill_separation")
	private String isMicroPaymentBillSeparation;

	@Column(name="is_mobile_deposit_refund")
	private String isMobileDepositRefund;

	@Column(name="is_mod")
	private String isMod;

	@Column(name="is_mod_call_detail")
	private String isModCallDetail;

	@Column(name="is_mod_recharge_voucher")
	private String isModRechargeVoucher;

	@Column(name="is_movement")
	private String isMovement;

	@Column(name="is_mpro")
	private String isMpro;

	@Column(name="is_no_add_dm")
	private String isNoAddDm;

	@Column(name="is_no_cht_group_dm")
	private String isNoChtGroupDm;

	@Column(name="is_no_show")
	private String isNoShow;

	@Column(name="is_notify")
	private String isNotify;

	@Column(name="is_official_used")
	private String isOfficialUsed;

	@Column(name="is_over_100")
	private String isOver100;

	@Column(name="is_over_l0_rate_item_limit")
	private String isOverL0RateItemLimit;

	@Column(name="is_over_l3_rate_item_limit")
	private String isOverL3RateItemLimit;

	@Column(name="is_over_two_month")
	private String isOverTwoMonth;

	@Column(name="is_pager_stop")
	private String isPagerStop;

	@Column(name="is_party")
	private String isParty;

	@Column(name="is_pbx_join")
	private String isPbxJoin;

	@Column(name="is_prepayment_bill")
	private String isPrepaymentBill;

	@Column(name="is_print_invoice_charge_desc")
	private String isPrintInvoiceChargeDesc;

	@Column(name="is_print_local_project")
	private String isPrintLocalProject;

	@Column(name="is_project_prepayment")
	private String isProjectPrepayment;

	@Column(name="is_prs_call_detail")
	private String isPrsCallDetail;

	@Column(name="is_refund")
	private String isRefund;

	@Column(name="is_refund_adsl_bundled_loc")
	private String isRefundAdslBundledLoc;

	@Column(name="is_refund_check")
	private String isRefundCheck;

	@Column(name="is_sms")
	private String isSms;

	@Column(name="is_transaction")
	private String isTransaction;

	@Column(name="is_transfer")
	private String isTransfer;

	@Column(name="is_world")
	private String isWorld;

	@Column(name="is_zero_bill")
	private String isZeroBill;

	@Column(name="item_count")
	private BigDecimal itemCount;

	@Column(name="l4v_type")
	private String l4vType;

	@Column(name="loc_adsl_discount")
	private BigDecimal locAdslDiscount;

	@Column(name="loc_charge_type")
	private String locChargeType;

	@Column(name="loc_cht_mobile_comm_charge")
	private BigDecimal locChtMobileCommCharge;

	@Column(name="loc_comm_charge_discount")
	private BigDecimal locCommChargeDiscount;

	@Column(name="loc_data_line_old_discount")
	private BigDecimal locDataLineOldDiscount;

	@Column(name="loc_data_line_vip_discount")
	private BigDecimal locDataLineVipDiscount;

	@Column(name="loc_db_type")
	private String locDbType;

	@Column(name="loc_gsm_discount")
	private BigDecimal locGsmDiscount;

	@Column(name="loc_inmarsat_discount")
	private BigDecimal locInmarsatDiscount;

	@Column(name="loc_intl_charge_3v_amount")
	private BigDecimal locIntlCharge3vAmount;

	@Column(name="loc_intl_charge_discount")
	private BigDecimal locIntlChargeDiscount;

	@Column(name="loc_leased_line_discount")
	private BigDecimal locLeasedLineDiscount;

	@Column(name="loc_network_charge_discount")
	private BigDecimal locNetworkChargeDiscount;

	@Column(name="loc_prepayment_balance")
	private BigDecimal locPrepaymentBalance;

	@Column(name="loc_satellite_discount")
	private BigDecimal locSatelliteDiscount;

	@Column(name="loc_std_discount")
	private BigDecimal locStdDiscount;

	@Column(name="long_distance_a_end_line_charge")
	private BigDecimal longDistanceAEndLineCharge;

	@Column(name="long_distance_b_end_line_charge")
	private BigDecimal longDistanceBEndLineCharge;

	@Column(name="mail_bill_type")
	private String mailBillType;

	@Column(name="mobile_transmission_volume")
	private BigDecimal mobileTransmissionVolume;

	@Column(name="mobile_vip_type")
	private String mobileVipType;

	@Column(name="mod_adsl_type")
	private String modAdslType;

	@Column(name="mod_b_chanel_discount")
	private BigDecimal modBChanelDiscount;

	@Column(name="mod_before_deduct_amount")
	private BigDecimal modBeforeDeductAmount;

	@Column(name="mod_discount_code")
	private String modDiscountCode;

	@Column(name="mod_gift_rebate_balance")
	private BigDecimal modGiftRebateBalance;

	@Column(name="mod_month_type")
	private String modMonthType;

	@Column(name="mod_old_discount_type")
	private String modOldDiscountType;

	@Column(name="mod_p_chanel_discount")
	private BigDecimal modPChanelDiscount;

	@Column(name="mod_payment_type")
	private String modPaymentType;

	@Column(name="mod_prepayment_end_yyymm")
	private String modPrepaymentEndYyymm;

	@Column(name="mod_prepayment_start_yyymm")
	private String modPrepaymentStartYyymm;

	@Column(name="mod_recharge_voucher_balance")
	private BigDecimal modRechargeVoucherBalance;

	@Column(name="mod_recharge_voucher_last_balance")
	private BigDecimal modRechargeVoucherLastBalance;

	@Column(name="mod_s_chanel_discount")
	private BigDecimal modSChanelDiscount;

	@Column(name="mod_s_usage_discount")
	private BigDecimal modSUsageDiscount;

	@Column(name="mod_stored_card_this_rebate")
	private BigDecimal modStoredCardThisRebate;

	@Column(name="msg_byday")
	private BigDecimal msgByday;

	@Column(name="n070_telcom_type")
	private String n070TelcomType;

	@Column(name="n1288_type")
	private String n1288Type;

	@Column(name="n3g_equip_type")
	private String n3gEquipType;

	@Column(name="n4g_share_plan_type")
	private String n4gSharePlanType;

	@Column(name="negagive_tax_total_amount")
	private BigDecimal negagiveTaxTotalAmount;

	@Column(name="new_old_cycle")
	private String newOldCycle;

	@Column(name="new_old_equip_no")
	private String newOldEquipNo;

	@Column(name="new_old_office_code")
	private String newOldOfficeCode;

	@Column(name="new_old_type")
	private String newOldType;

	@Column(name="np_telcom_type")
	private String npTelcomType;

	@Column(name="np_telno")
	private String npTelno;

	@Column(name="office_code")
	private String officeCode;

	@Column(name="op_class")
	private String opClass;

	@Column(name="op_code")
	private String opCode;

	@Column(name="other_discount_code")
	private String otherDiscountCode;

	@Column(name="other_gsm_discount")
	private BigDecimal otherGsmDiscount;

	@Column(name="other_sub_equip_count")
	private BigDecimal otherSubEquipCount;

	@Column(name="over_100_count")
	private BigDecimal over100Count;

	@Column(name="over_100_seq")
	private BigDecimal over100Seq;

	@Column(name="pay_bill_result_type")
	private String payBillResultType;

	@Column(name="pay_deadline")
	private BigDecimal payDeadline;

	@Column(name="payment_notice_delivery_type")
	private String paymentNoticeDeliveryType;

	@Column(name="payment_result_delivery_type")
	private String paymentResultDeliveryType;

	@Column(name="payment_type")
	private String paymentType;

	@Column(name="pbx_discount")
	private BigDecimal pbxDiscount;

	@Column(name="pbx_mass_type")
	private String pbxMassType;

	@Column(name="pbx_office_code")
	private String pbxOfficeCode;

	@Column(name="pbx_telno")
	private String pbxTelno;

	@Column(name="pbx_type")
	private String pbxType;

	@Column(name="poi_type")
	private String poiType;

	@Column(name="positive_tax_total_amount")
	private BigDecimal positiveTaxTotalAmount;

	@Column(name="prepayment_end_type")
	private String prepaymentEndType;

	@Column(name="project_prepayment_acc_no")
	private String projectPrepaymentAccNo;

	@Column(name="project_prepayment_deducted_amount")
	private BigDecimal projectPrepaymentDeductedAmount;

	@Column(name="receipt_no")
	private String receiptNo;

	@Column(name="recharge_voucher_type")
	private String rechargeVoucherType;

	@Column(name="rp_empdis_type")
	private String rpEmpdisType;

	@Column(name="rp_old_discount")
	private String rpOldDiscount;

	@Column(name="rp_start_yymm")
	private String rpStartYymm;

	@Column(name="rp_stop_yymm")
	private String rpStopYymm;

	@Column(name="rp_type")
	private String rpType;

	@Column(name="rp_vip_discount")
	private String rpVipDiscount;

	@Column(name="sms_batch_no")
	private String smsBatchNo;

	@Column(name="source_data_from")
	private String sourceDataFrom;

	@Column(name="spec_3v_amount")
	private BigDecimal spec3vAmount;

	@Column(name="spec_country_type")
	private String specCountryType;

	@Column(name="spec_discount")
	private BigDecimal specDiscount;

	@Column(name="spec_same_eqp_overseas_amount")
	private BigDecimal specSameEqpOverseasAmount;

	@Column(name="spec_same_id_amount")
	private BigDecimal specSameIdAmount;

	@Column(name="special_service_discount")
	private BigDecimal specialServiceDiscount;

	@Column(name="special_set_discount")
	private BigDecimal specialSetDiscount;

	@Column(name="speed_code")
	private String speedCode;

	@Column(name="sponsorship_balance")
	private BigDecimal sponsorshipBalance;

	@Column(name="sponsorship_project_rebate")
	private BigDecimal sponsorshipProjectRebate;

	@Column(name="status_code")
	private String statusCode;

	@Column(name="std_month_type")
	private String stdMonthType;

	@Column(name="std_offering_type")
	private String stdOfferingType;

	@Column(name="std_security_type")
	private String stdSecurityType;

	@Column(name="sub_equip_count")
	private BigDecimal subEquipCount;

	@Column(name="sub_hn_equip_no")
	private String subHnEquipNo;

	@Column(name="sub_negative_amount")
	private BigDecimal subNegativeAmount;

	@Column(name="sub_op_class")
	private String subOpClass;

	@Column(name="subs_type")
	private String subsType;

	@Column(name="tax_excluded_total_amount")
	private BigDecimal taxExcludedTotalAmount;

	@Column(name="tax_free_card_no")
	private String taxFreeCardNo;

	@Column(name="tax_free_is_mod_total_amount")
	private BigDecimal taxFreeIsModTotalAmount;

	@Column(name="tax_free_mod_total_amount")
	private BigDecimal taxFreeModTotalAmount;

	@Column(name="tax_free_total_amount")
	private BigDecimal taxFreeTotalAmount;

	@Column(name="tax_print_type")
	private String taxPrintType;

	@Column(name="tax_zero_total_amount")
	private BigDecimal taxZeroTotalAmount;

	@Column(name="tform_offer_type")
	private String tformOfferType;

	@Column(name="tie_city_circuit_discount")
	private BigDecimal tieCityCircuitDiscount;

	@Column(name="tie_city_circuit_vip_discount")
	private BigDecimal tieCityCircuitVipDiscount;

	@Column(name="tie_contract_discount")
	private BigDecimal tieContractDiscount;

	@Column(name="tie_intl_charge_discount")
	private BigDecimal tieIntlChargeDiscount;

	@Column(name="tie_old_discount")
	private BigDecimal tieOldDiscount;

	@Column(name="tie_special_discount")
	private BigDecimal tieSpecialDiscount;

	@Column(name="tie_type")
	private String tieType;

	@Column(name="tie_vip_discount")
	private BigDecimal tieVipDiscount;

	@Column(name="timely_bill_closed_date")
	private String timelyBillClosedDate;

	@Column(name="timely_bill_operator")
	private String timelyBillOperator;

	@Column(name="timely_bill_seq_no")
	private String timelyBillSeqNo;

	@Column(name="toll_charge")
	private BigDecimal tollCharge;

	@Column(name="total_amount")
	private BigDecimal totalAmount;

	@Column(name="total_bill_test_type")
	private String totalBillTestType;

	@Column(name="total_bill_type")
	private String totalBillType;

	@Column(name="total_tax")
	private BigDecimal totalTax;

	@Column(name="ums_discount")
	private BigDecimal umsDiscount;

	@Column(name="upgraded_equip_no")
	private String upgradedEquipNo;

	@Column(name="upgraded_office_code")
	private String upgradedOfficeCode;

	@Column(name="vip_type")
	private String vipType;

	@Column(name="voip_equip_type")
	private String voipEquipType;

	@Column(name="whosecall_flag")
	private String whosecallFlag;

	@Column(name="wlan_discount_code")
	private String wlanDiscountCode;

	public BcOutOutf1BcLb410t2() {
	}

	public String getSelfPk() {
		return this.selfPk;
	}

	public void setSelfPk(String selfPk) {
		this.selfPk = selfPk;
	}

	public BigDecimal getAModemCharge() {
		return this.aModemCharge;
	}

	public void setAModemCharge(BigDecimal aModemCharge) {
		this.aModemCharge = aModemCharge;
	}

	public String getAPointOfficeCode() {
		return this.aPointOfficeCode;
	}

	public void setAPointOfficeCode(String aPointOfficeCode) {
		this.aPointOfficeCode = aPointOfficeCode;
	}

	public String getAccNo() {
		return this.accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public BigDecimal getActualMonth() {
		return this.actualMonth;
	}

	public void setActualMonth(BigDecimal actualMonth) {
		this.actualMonth = actualMonth;
	}

	public String getAdminisAllType() {
		return this.adminisAllType;
	}

	public void setAdminisAllType(String adminisAllType) {
		this.adminisAllType = adminisAllType;
	}

	public String getAdminisOfficeType() {
		return this.adminisOfficeType;
	}

	public void setAdminisOfficeType(String adminisOfficeType) {
		this.adminisOfficeType = adminisOfficeType;
	}

	public String getAdslAnnualBeginDate() {
		return this.adslAnnualBeginDate;
	}

	public void setAdslAnnualBeginDate(String adslAnnualBeginDate) {
		this.adslAnnualBeginDate = adslAnnualBeginDate;
	}

	public String getAdslAnnualEndDate() {
		return this.adslAnnualEndDate;
	}

	public void setAdslAnnualEndDate(String adslAnnualEndDate) {
		this.adslAnnualEndDate = adslAnnualEndDate;
	}

	public String getAdslBroadbandPaymentType() {
		return this.adslBroadbandPaymentType;
	}

	public void setAdslBroadbandPaymentType(String adslBroadbandPaymentType) {
		this.adslBroadbandPaymentType = adslBroadbandPaymentType;
	}

	public String getAdslDiscountCode() {
		return this.adslDiscountCode;
	}

	public void setAdslDiscountCode(String adslDiscountCode) {
		this.adslDiscountCode = adslDiscountCode;
	}

	public BigDecimal getAdslOldDiscount() {
		return this.adslOldDiscount;
	}

	public void setAdslOldDiscount(BigDecimal adslOldDiscount) {
		this.adslOldDiscount = adslOldDiscount;
	}

	public BigDecimal getAdslPrepaymentBalance() {
		return this.adslPrepaymentBalance;
	}

	public void setAdslPrepaymentBalance(BigDecimal adslPrepaymentBalance) {
		this.adslPrepaymentBalance = adslPrepaymentBalance;
	}

	public String getAdslSpeedCode() {
		return this.adslSpeedCode;
	}

	public void setAdslSpeedCode(String adslSpeedCode) {
		this.adslSpeedCode = adslSpeedCode;
	}

	public BigDecimal getAdslSubEquipCount() {
		return this.adslSubEquipCount;
	}

	public void setAdslSubEquipCount(BigDecimal adslSubEquipCount) {
		this.adslSubEquipCount = adslSubEquipCount;
	}

	public String getApplyIdcardNo() {
		return this.applyIdcardNo;
	}

	public void setApplyIdcardNo(String applyIdcardNo) {
		this.applyIdcardNo = applyIdcardNo;
	}

	public BigDecimal getBModemCharge() {
		return this.bModemCharge;
	}

	public void setBModemCharge(BigDecimal bModemCharge) {
		this.bModemCharge = bModemCharge;
	}

	public String getBPointOfficeCode() {
		return this.bPointOfficeCode;
	}

	public void setBPointOfficeCode(String bPointOfficeCode) {
		this.bPointOfficeCode = bPointOfficeCode;
	}

	public BigDecimal getBalanceForward() {
		return this.balanceForward;
	}

	public void setBalanceForward(BigDecimal balanceForward) {
		this.balanceForward = balanceForward;
	}

	public BigDecimal getBasicMessage() {
		return this.basicMessage;
	}

	public void setBasicMessage(BigDecimal basicMessage) {
		this.basicMessage = basicMessage;
	}

	public BigDecimal getBbcDiscount() {
		return this.bbcDiscount;
	}

	public void setBbcDiscount(BigDecimal bbcDiscount) {
		this.bbcDiscount = bbcDiscount;
	}

	public String getBestMpro() {
		return this.bestMpro;
	}

	public void setBestMpro(String bestMpro) {
		this.bestMpro = bestMpro;
	}

	public String getBestPackage() {
		return this.bestPackage;
	}

	public void setBestPackage(String bestPackage) {
		this.bestPackage = bestPackage;
	}

	public String getBillBarCodeType() {
		return this.billBarCodeType;
	}

	public void setBillBarCodeType(String billBarCodeType) {
		this.billBarCodeType = billBarCodeType;
	}

	public String getBillBuGroup() {
		return this.billBuGroup;
	}

	public void setBillBuGroup(String billBuGroup) {
		this.billBuGroup = billBuGroup;
	}

	public String getBillCode() {
		return this.billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	public String getBillCycleNotNormalType() {
		return this.billCycleNotNormalType;
	}

	public void setBillCycleNotNormalType(String billCycleNotNormalType) {
		this.billCycleNotNormalType = billCycleNotNormalType;
	}

	public String getBillDeliveryType() {
		return this.billDeliveryType;
	}

	public void setBillDeliveryType(String billDeliveryType) {
		this.billDeliveryType = billDeliveryType;
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

	public String getBillOfficialDepartment() {
		return this.billOfficialDepartment;
	}

	public void setBillOfficialDepartment(String billOfficialDepartment) {
		this.billOfficialDepartment = billOfficialDepartment;
	}

	public String getBillShareType() {
		return this.billShareType;
	}

	public void setBillShareType(String billShareType) {
		this.billShareType = billShareType;
	}

	public String getBillTestEquipType() {
		return this.billTestEquipType;
	}

	public void setBillTestEquipType(String billTestEquipType) {
		this.billTestEquipType = billTestEquipType;
	}

	public BigDecimal getBillTotalAmount() {
		return this.billTotalAmount;
	}

	public void setBillTotalAmount(BigDecimal billTotalAmount) {
		this.billTotalAmount = billTotalAmount;
	}

	public String getBillingDurationBeginDate() {
		return this.billingDurationBeginDate;
	}

	public void setBillingDurationBeginDate(String billingDurationBeginDate) {
		this.billingDurationBeginDate = billingDurationBeginDate;
	}

	public String getBillingDurationEndDate() {
		return this.billingDurationEndDate;
	}

	public void setBillingDurationEndDate(String billingDurationEndDate) {
		this.billingDurationEndDate = billingDurationEndDate;
	}

	public String getBillingEquipNo() {
		return this.billingEquipNo;
	}

	public void setBillingEquipNo(String billingEquipNo) {
		this.billingEquipNo = billingEquipNo;
	}

	public String getBillingOfficeCode() {
		return this.billingOfficeCode;
	}

	public void setBillingOfficeCode(String billingOfficeCode) {
		this.billingOfficeCode = billingOfficeCode;
	}

	public String getBuGroup() {
		return this.buGroup;
	}

	public void setBuGroup(String buGroup) {
		this.buGroup = buGroup;
	}

	public String getBusinessBillUserCode() {
		return this.businessBillUserCode;
	}

	public void setBusinessBillUserCode(String businessBillUserCode) {
		this.businessBillUserCode = businessBillUserCode;
	}

	public String getCallDetailEnclosureType() {
		return this.callDetailEnclosureType;
	}

	public void setCallDetailEnclosureType(String callDetailEnclosureType) {
		this.callDetailEnclosureType = callDetailEnclosureType;
	}

	public String getCheckDigit() {
		return this.checkDigit;
	}

	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}

	public String getCircuitType() {
		return this.circuitType;
	}

	public void setCircuitType(String circuitType) {
		this.circuitType = circuitType;
	}

	public String getClgType() {
		return this.clgType;
	}

	public void setClgType(String clgType) {
		this.clgType = clgType;
	}

	public String getCmvpnDiscountType() {
		return this.cmvpnDiscountType;
	}

	public void setCmvpnDiscountType(String cmvpnDiscountType) {
		this.cmvpnDiscountType = cmvpnDiscountType;
	}

	public String getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getCommunityIdType() {
		return this.communityIdType;
	}

	public void setCommunityIdType(String communityIdType) {
		this.communityIdType = communityIdType;
	}

	public BigDecimal getCounterPrepaidLastRebate() {
		return this.counterPrepaidLastRebate;
	}

	public void setCounterPrepaidLastRebate(BigDecimal counterPrepaidLastRebate) {
		this.counterPrepaidLastRebate = counterPrepaidLastRebate;
	}

	public BigDecimal getCounterPrepaidThisRebate() {
		return this.counterPrepaidThisRebate;
	}

	public void setCounterPrepaidThisRebate(BigDecimal counterPrepaidThisRebate) {
		this.counterPrepaidThisRebate = counterPrepaidThisRebate;
	}

	public BigDecimal getCounterPrepaymentBalance() {
		return this.counterPrepaymentBalance;
	}

	public void setCounterPrepaymentBalance(BigDecimal counterPrepaymentBalance) {
		this.counterPrepaymentBalance = counterPrepaymentBalance;
	}

	public String getCreditLevel() {
		return this.creditLevel;
	}

	public void setCreditLevel(String creditLevel) {
		this.creditLevel = creditLevel;
	}

	public BigDecimal getCvpnDiscount() {
		return this.cvpnDiscount;
	}

	public void setCvpnDiscount(BigDecimal cvpnDiscount) {
		this.cvpnDiscount = cvpnDiscount;
	}

	public String getCycle() {
		return this.cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public BigDecimal getD5gDiscount() {
		return this.d5gDiscount;
	}

	public void setD5gDiscount(BigDecimal d5gDiscount) {
		this.d5gDiscount = d5gDiscount;
	}

	public String getDataDiscountType() {
		return this.dataDiscountType;
	}

	public void setDataDiscountType(String dataDiscountType) {
		this.dataDiscountType = dataDiscountType;
	}

	public String getDataProcessType() {
		return this.dataProcessType;
	}

	public void setDataProcessType(String dataProcessType) {
		this.dataProcessType = dataProcessType;
	}

	public String getDeleteDate() {
		return this.deleteDate;
	}

	public void setDeleteDate(String deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getDeliveryNo() {
		return this.deliveryNo;
	}

	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	public BigDecimal getDepositLastMonthBalance() {
		return this.depositLastMonthBalance;
	}

	public void setDepositLastMonthBalance(BigDecimal depositLastMonthBalance) {
		this.depositLastMonthBalance = depositLastMonthBalance;
	}

	public BigDecimal getDepositThisMonthBalance() {
		return this.depositThisMonthBalance;
	}

	public void setDepositThisMonthBalance(BigDecimal depositThisMonthBalance) {
		this.depositThisMonthBalance = depositThisMonthBalance;
	}

	public String getDetailOfferType() {
		return this.detailOfferType;
	}

	public void setDetailOfferType(String detailOfferType) {
		this.detailOfferType = detailOfferType;
	}

	public String getDidPrintType() {
		return this.didPrintType;
	}

	public void setDidPrintType(String didPrintType) {
		this.didPrintType = didPrintType;
	}

	public BigDecimal getDidTrunkMthServDiscount() {
		return this.didTrunkMthServDiscount;
	}

	public void setDidTrunkMthServDiscount(BigDecimal didTrunkMthServDiscount) {
		this.didTrunkMthServDiscount = didTrunkMthServDiscount;
	}

	public String getDirectDebitNo() {
		return this.directDebitNo;
	}

	public void setDirectDebitNo(String directDebitNo) {
		this.directDebitNo = directDebitNo;
	}

	public String getDisasterType() {
		return this.disasterType;
	}

	public void setDisasterType(String disasterType) {
		this.disasterType = disasterType;
	}

	public String getEbmsBillType() {
		return this.ebmsBillType;
	}

	public void setEbmsBillType(String ebmsBillType) {
		this.ebmsBillType = ebmsBillType;
	}

	public String getElectInvoiceCarrierType() {
		return this.electInvoiceCarrierType;
	}

	public void setElectInvoiceCarrierType(String electInvoiceCarrierType) {
		this.electInvoiceCarrierType = electInvoiceCarrierType;
	}

	public BigDecimal getEnterpriseBroadbandDiscount() {
		return this.enterpriseBroadbandDiscount;
	}

	public void setEnterpriseBroadbandDiscount(BigDecimal enterpriseBroadbandDiscount) {
		this.enterpriseBroadbandDiscount = enterpriseBroadbandDiscount;
	}

	public String getEquipNo() {
		return this.equipNo;
	}

	public void setEquipNo(String equipNo) {
		this.equipNo = equipNo;
	}

	public BigDecimal getExtensionDiscount() {
		return this.extensionDiscount;
	}

	public void setExtensionDiscount(BigDecimal extensionDiscount) {
		this.extensionDiscount = extensionDiscount;
	}

	public String getEzvpnDiscountCodeA() {
		return this.ezvpnDiscountCodeA;
	}

	public void setEzvpnDiscountCodeA(String ezvpnDiscountCodeA) {
		this.ezvpnDiscountCodeA = ezvpnDiscountCodeA;
	}

	public String getEzvpnDiscountCodeB() {
		return this.ezvpnDiscountCodeB;
	}

	public void setEzvpnDiscountCodeB(String ezvpnDiscountCodeB) {
		this.ezvpnDiscountCodeB = ezvpnDiscountCodeB;
	}

	public String getF2MemberType() {
		return this.f2MemberType;
	}

	public void setF2MemberType(String f2MemberType) {
		this.f2MemberType = f2MemberType;
	}

	public String getFaxType() {
		return this.faxType;
	}

	public void setFaxType(String faxType) {
		this.faxType = faxType;
	}

	public String getFiller1() {
		return this.filler1;
	}

	public void setFiller1(String filler1) {
		this.filler1 = filler1;
	}

	public BigDecimal getFirstNegativeAmount() {
		return this.firstNegativeAmount;
	}

	public void setFirstNegativeAmount(BigDecimal firstNegativeAmount) {
		this.firstNegativeAmount = firstNegativeAmount;
	}

	public String getFttbSpeedCode() {
		return this.fttbSpeedCode;
	}

	public void setFttbSpeedCode(String fttbSpeedCode) {
		this.fttbSpeedCode = fttbSpeedCode;
	}

	public String getFtxhnExpireNotifyType() {
		return this.ftxhnExpireNotifyType;
	}

	public void setFtxhnExpireNotifyType(String ftxhnExpireNotifyType) {
		this.ftxhnExpireNotifyType = ftxhnExpireNotifyType;
	}

	public BigDecimal getGeneralTaxTotalAmount() {
		return this.generalTaxTotalAmount;
	}

	public void setGeneralTaxTotalAmount(BigDecimal generalTaxTotalAmount) {
		this.generalTaxTotalAmount = generalTaxTotalAmount;
	}

	public String getGroupOfficeCode() {
		return this.groupOfficeCode;
	}

	public void setGroupOfficeCode(String groupOfficeCode) {
		this.groupOfficeCode = groupOfficeCode;
	}

	public BigDecimal getGsmBeforeRebateAmount() {
		return this.gsmBeforeRebateAmount;
	}

	public void setGsmBeforeRebateAmount(BigDecimal gsmBeforeRebateAmount) {
		this.gsmBeforeRebateAmount = gsmBeforeRebateAmount;
	}

	public String getGsmBusinessBillId() {
		return this.gsmBusinessBillId;
	}

	public void setGsmBusinessBillId(String gsmBusinessBillId) {
		this.gsmBusinessBillId = gsmBusinessBillId;
	}

	public String getGsmDomesticCallDiscount() {
		return this.gsmDomesticCallDiscount;
	}

	public void setGsmDomesticCallDiscount(String gsmDomesticCallDiscount) {
		this.gsmDomesticCallDiscount = gsmDomesticCallDiscount;
	}

	public BigDecimal getGsmInmarsatDiscount() {
		return this.gsmInmarsatDiscount;
	}

	public void setGsmInmarsatDiscount(BigDecimal gsmInmarsatDiscount) {
		this.gsmInmarsatDiscount = gsmInmarsatDiscount;
	}

	public BigDecimal getGsmIntlChargeDiscount() {
		return this.gsmIntlChargeDiscount;
	}

	public void setGsmIntlChargeDiscount(BigDecimal gsmIntlChargeDiscount) {
		this.gsmIntlChargeDiscount = gsmIntlChargeDiscount;
	}

	public String getGsmOldDiscount() {
		return this.gsmOldDiscount;
	}

	public void setGsmOldDiscount(String gsmOldDiscount) {
		this.gsmOldDiscount = gsmOldDiscount;
	}

	public BigDecimal getGsmProjectDiscount() {
		return this.gsmProjectDiscount;
	}

	public void setGsmProjectDiscount(BigDecimal gsmProjectDiscount) {
		this.gsmProjectDiscount = gsmProjectDiscount;
	}

	public BigDecimal getGsmProjectRechargeAmount() {
		return this.gsmProjectRechargeAmount;
	}

	public void setGsmProjectRechargeAmount(BigDecimal gsmProjectRechargeAmount) {
		this.gsmProjectRechargeAmount = gsmProjectRechargeAmount;
	}

	public BigDecimal getGsmProjectRechargeBalance() {
		return this.gsmProjectRechargeBalance;
	}

	public void setGsmProjectRechargeBalance(BigDecimal gsmProjectRechargeBalance) {
		this.gsmProjectRechargeBalance = gsmProjectRechargeBalance;
	}

	public BigDecimal getGsmProjectRechargeRebate() {
		return this.gsmProjectRechargeRebate;
	}

	public void setGsmProjectRechargeRebate(BigDecimal gsmProjectRechargeRebate) {
		this.gsmProjectRechargeRebate = gsmProjectRechargeRebate;
	}

	public String getGsmProjectType() {
		return this.gsmProjectType;
	}

	public void setGsmProjectType(String gsmProjectType) {
		this.gsmProjectType = gsmProjectType;
	}

	public BigDecimal getGsmSaleDiscount() {
		return this.gsmSaleDiscount;
	}

	public void setGsmSaleDiscount(BigDecimal gsmSaleDiscount) {
		this.gsmSaleDiscount = gsmSaleDiscount;
	}

	public BigDecimal getGsmSatelliteDiscount() {
		return this.gsmSatelliteDiscount;
	}

	public void setGsmSatelliteDiscount(BigDecimal gsmSatelliteDiscount) {
		this.gsmSatelliteDiscount = gsmSatelliteDiscount;
	}

	public String getGsmServiceType() {
		return this.gsmServiceType;
	}

	public void setGsmServiceType(String gsmServiceType) {
		this.gsmServiceType = gsmServiceType;
	}

	public String getGsmType() {
		return this.gsmType;
	}

	public void setGsmType(String gsmType) {
		this.gsmType = gsmType;
	}

	public String getGsmVipDiscount() {
		return this.gsmVipDiscount;
	}

	public void setGsmVipDiscount(String gsmVipDiscount) {
		this.gsmVipDiscount = gsmVipDiscount;
	}

	public String getHasCallDetail() {
		return this.hasCallDetail;
	}

	public void setHasCallDetail(String hasCallDetail) {
		this.hasCallDetail = hasCallDetail;
	}

	public String getHasHinetMergedBill() {
		return this.hasHinetMergedBill;
	}

	public void setHasHinetMergedBill(String hasHinetMergedBill) {
		this.hasHinetMergedBill = hasHinetMergedBill;
	}

	public String getHasInMergedBill() {
		return this.hasInMergedBill;
	}

	public void setHasInMergedBill(String hasInMergedBill) {
		this.hasInMergedBill = hasInMergedBill;
	}

	public String getHasPagerMergedBill() {
		return this.hasPagerMergedBill;
	}

	public void setHasPagerMergedBill(String hasPagerMergedBill) {
		this.hasPagerMergedBill = hasPagerMergedBill;
	}

	public BigDecimal getHdtvLastPrepaymentBalance() {
		return this.hdtvLastPrepaymentBalance;
	}

	public void setHdtvLastPrepaymentBalance(BigDecimal hdtvLastPrepaymentBalance) {
		this.hdtvLastPrepaymentBalance = hdtvLastPrepaymentBalance;
	}

	public BigDecimal getHdtvThisPrepaymentBalance() {
		return this.hdtvThisPrepaymentBalance;
	}

	public void setHdtvThisPrepaymentBalance(BigDecimal hdtvThisPrepaymentBalance) {
		this.hdtvThisPrepaymentBalance = hdtvThisPrepaymentBalance;
	}

	public BigDecimal getHdtvThisRebateAmount() {
		return this.hdtvThisRebateAmount;
	}

	public void setHdtvThisRebateAmount(BigDecimal hdtvThisRebateAmount) {
		this.hdtvThisRebateAmount = hdtvThisRebateAmount;
	}

	public String getHiBuildingAgency() {
		return this.hiBuildingAgency;
	}

	public void setHiBuildingAgency(String hiBuildingAgency) {
		this.hiBuildingAgency = hiBuildingAgency;
	}

	public String getHinetBoundleDiscountCode() {
		return this.hinetBoundleDiscountCode;
	}

	public void setHinetBoundleDiscountCode(String hinetBoundleDiscountCode) {
		this.hinetBoundleDiscountCode = hinetBoundleDiscountCode;
	}

	public String getHinetOpClass() {
		return this.hinetOpClass;
	}

	public void setHinetOpClass(String hinetOpClass) {
		this.hinetOpClass = hinetOpClass;
	}

	public BigDecimal getHnAccumulatedPoint() {
		return this.hnAccumulatedPoint;
	}

	public void setHnAccumulatedPoint(BigDecimal hnAccumulatedPoint) {
		this.hnAccumulatedPoint = hnAccumulatedPoint;
	}

	public BigDecimal getHnAvailablePoint() {
		return this.hnAvailablePoint;
	}

	public void setHnAvailablePoint(BigDecimal hnAvailablePoint) {
		this.hnAvailablePoint = hnAvailablePoint;
	}

	public String getHnDeadline() {
		return this.hnDeadline;
	}

	public void setHnDeadline(String hnDeadline) {
		this.hnDeadline = hnDeadline;
	}

	public String getHnDiscountClass() {
		return this.hnDiscountClass;
	}

	public void setHnDiscountClass(String hnDiscountClass) {
		this.hnDiscountClass = hnDiscountClass;
	}

	public String getHnMdmType() {
		return this.hnMdmType;
	}

	public void setHnMdmType(String hnMdmType) {
		this.hnMdmType = hnMdmType;
	}

	public BigDecimal getHnSubEquipCount() {
		return this.hnSubEquipCount;
	}

	public void setHnSubEquipCount(BigDecimal hnSubEquipCount) {
		this.hnSubEquipCount = hnSubEquipCount;
	}

	public BigDecimal getHnThisMthAddedPoint() {
		return this.hnThisMthAddedPoint;
	}

	public void setHnThisMthAddedPoint(BigDecimal hnThisMthAddedPoint) {
		this.hnThisMthAddedPoint = hnThisMthAddedPoint;
	}

	public BigDecimal getHnUseedPoint() {
		return this.hnUseedPoint;
	}

	public void setHnUseedPoint(BigDecimal hnUseedPoint) {
		this.hnUseedPoint = hnUseedPoint;
	}

	public BigDecimal getHoldMonth() {
		return this.holdMonth;
	}

	public void setHoldMonth(BigDecimal holdMonth) {
		this.holdMonth = holdMonth;
	}

	public String getIcbiBillCategory() {
		return this.icbiBillCategory;
	}

	public void setIcbiBillCategory(String icbiBillCategory) {
		this.icbiBillCategory = icbiBillCategory;
	}

	public String getInBatchLeasedDiscount() {
		return this.inBatchLeasedDiscount;
	}

	public void setInBatchLeasedDiscount(String inBatchLeasedDiscount) {
		this.inBatchLeasedDiscount = inBatchLeasedDiscount;
	}

	public String getInDiscount() {
		return this.inDiscount;
	}

	public void setInDiscount(String inDiscount) {
		this.inDiscount = inDiscount;
	}

	public BigDecimal getInIntlChargeDiscount() {
		return this.inIntlChargeDiscount;
	}

	public void setInIntlChargeDiscount(BigDecimal inIntlChargeDiscount) {
		this.inIntlChargeDiscount = inIntlChargeDiscount;
	}

	public String getInNextMthProjectDiscount() {
		return this.inNextMthProjectDiscount;
	}

	public void setInNextMthProjectDiscount(String inNextMthProjectDiscount) {
		this.inNextMthProjectDiscount = inNextMthProjectDiscount;
	}

	public String getInNotifyType() {
		return this.inNotifyType;
	}

	public void setInNotifyType(String inNotifyType) {
		this.inNotifyType = inNotifyType;
	}

	public String getInOldDiscount() {
		return this.inOldDiscount;
	}

	public void setInOldDiscount(String inOldDiscount) {
		this.inOldDiscount = inOldDiscount;
	}

	public String getInRentType() {
		return this.inRentType;
	}

	public void setInRentType(String inRentType) {
		this.inRentType = inRentType;
	}

	public String getInStartYymm() {
		return this.inStartYymm;
	}

	public void setInStartYymm(String inStartYymm) {
		this.inStartYymm = inStartYymm;
	}

	public String getInStopYymm() {
		return this.inStopYymm;
	}

	public void setInStopYymm(String inStopYymm) {
		this.inStopYymm = inStopYymm;
	}

	public String getInThisMthProjectDiscount() {
		return this.inThisMthProjectDiscount;
	}

	public void setInThisMthProjectDiscount(String inThisMthProjectDiscount) {
		this.inThisMthProjectDiscount = inThisMthProjectDiscount;
	}

	public String getInVipDiscount() {
		return this.inVipDiscount;
	}

	public void setInVipDiscount(String inVipDiscount) {
		this.inVipDiscount = inVipDiscount;
	}

	public String getIndoorLineMaintChargeType() {
		return this.indoorLineMaintChargeType;
	}

	public void setIndoorLineMaintChargeType(String indoorLineMaintChargeType) {
		this.indoorLineMaintChargeType = indoorLineMaintChargeType;
	}

	public String getInstallDate() {
		return this.installDate;
	}

	public void setInstallDate(String installDate) {
		this.installDate = installDate;
	}

	public BigDecimal getIntlChargeSameEqpAmount() {
		return this.intlChargeSameEqpAmount;
	}

	public void setIntlChargeSameEqpAmount(BigDecimal intlChargeSameEqpAmount) {
		this.intlChargeSameEqpAmount = intlChargeSameEqpAmount;
	}

	public BigDecimal getIntlChargeSameIdAmount() {
		return this.intlChargeSameIdAmount;
	}

	public void setIntlChargeSameIdAmount(BigDecimal intlChargeSameIdAmount) {
		this.intlChargeSameIdAmount = intlChargeSameIdAmount;
	}

	public String getInvoiceCarrierNo() {
		return this.invoiceCarrierNo;
	}

	public void setInvoiceCarrierNo(String invoiceCarrierNo) {
		this.invoiceCarrierNo = invoiceCarrierNo;
	}

	public String getInvoiceChargeType() {
		return this.invoiceChargeType;
	}

	public void setInvoiceChargeType(String invoiceChargeType) {
		this.invoiceChargeType = invoiceChargeType;
	}

	public String getInvoiceDonationType() {
		return this.invoiceDonationType;
	}

	public void setInvoiceDonationType(String invoiceDonationType) {
		this.invoiceDonationType = invoiceDonationType;
	}

	public String getIpCentrexChargeType() {
		return this.ipCentrexChargeType;
	}

	public void setIpCentrexChargeType(String ipCentrexChargeType) {
		this.ipCentrexChargeType = ipCentrexChargeType;
	}

	public String getIs0800CallDetail() {
		return this.is0800CallDetail;
	}

	public void setIs0800CallDetail(String is0800CallDetail) {
		this.is0800CallDetail = is0800CallDetail;
	}

	public String getIs4gBundleChargeSeparatation() {
		return this.is4gBundleChargeSeparatation;
	}

	public void setIs4gBundleChargeSeparatation(String is4gBundleChargeSeparatation) {
		this.is4gBundleChargeSeparatation = is4gBundleChargeSeparatation;
	}

	public String getIsAbate() {
		return this.isAbate;
	}

	public void setIsAbate(String isAbate) {
		this.isAbate = isAbate;
	}

	public String getIsAdjustAdslMonthlyCharge() {
		return this.isAdjustAdslMonthlyCharge;
	}

	public void setIsAdjustAdslMonthlyCharge(String isAdjustAdslMonthlyCharge) {
		this.isAdjustAdslMonthlyCharge = isAdjustAdslMonthlyCharge;
	}

	public String getIsAdvertisement() {
		return this.isAdvertisement;
	}

	public void setIsAdvertisement(String isAdvertisement) {
		this.isAdvertisement = isAdvertisement;
	}

	public String getIsAppliedBill() {
		return this.isAppliedBill;
	}

	public void setIsAppliedBill(String isAppliedBill) {
		this.isAppliedBill = isAppliedBill;
	}

	public String getIsAppliedPaymentNotice() {
		return this.isAppliedPaymentNotice;
	}

	public void setIsAppliedPaymentNotice(String isAppliedPaymentNotice) {
		this.isAppliedPaymentNotice = isAppliedPaymentNotice;
	}

	public String getIsAppliedPaymentResult() {
		return this.isAppliedPaymentResult;
	}

	public void setIsAppliedPaymentResult(String isAppliedPaymentResult) {
		this.isAppliedPaymentResult = isAppliedPaymentResult;
	}

	public String getIsAppliedTform() {
		return this.isAppliedTform;
	}

	public void setIsAppliedTform(String isAppliedTform) {
		this.isAppliedTform = isAppliedTform;
	}

	public String getIsBillEquipNo() {
		return this.isBillEquipNo;
	}

	public void setIsBillEquipNo(String isBillEquipNo) {
		this.isBillEquipNo = isBillEquipNo;
	}

	public String getIsBundle() {
		return this.isBundle;
	}

	public void setIsBundle(String isBundle) {
		this.isBundle = isBundle;
	}

	public String getIsBusinessBill() {
		return this.isBusinessBill;
	}

	public void setIsBusinessBill(String isBusinessBill) {
		this.isBusinessBill = isBusinessBill;
	}

	public String getIsChangeCycle() {
		return this.isChangeCycle;
	}

	public void setIsChangeCycle(String isChangeCycle) {
		this.isChangeCycle = isChangeCycle;
	}

	public String getIsChangeName() {
		return this.isChangeName;
	}

	public void setIsChangeName(String isChangeName) {
		this.isChangeName = isChangeName;
	}

	public String getIsCmp() {
		return this.isCmp;
	}

	public void setIsCmp(String isCmp) {
		this.isCmp = isCmp;
	}

	public String getIsCommunity() {
		return this.isCommunity;
	}

	public void setIsCommunity(String isCommunity) {
		this.isCommunity = isCommunity;
	}

	public String getIsCounterPrepayment() {
		return this.isCounterPrepayment;
	}

	public void setIsCounterPrepayment(String isCounterPrepayment) {
		this.isCounterPrepayment = isCounterPrepayment;
	}

	public String getIsDeductUntaxedZeroCharge() {
		return this.isDeductUntaxedZeroCharge;
	}

	public void setIsDeductUntaxedZeroCharge(String isDeductUntaxedZeroCharge) {
		this.isDeductUntaxedZeroCharge = isDeductUntaxedZeroCharge;
	}

	public String getIsDeliveryAddr() {
		return this.isDeliveryAddr;
	}

	public void setIsDeliveryAddr(String isDeliveryAddr) {
		this.isDeliveryAddr = isDeliveryAddr;
	}

	public String getIsDirecpc() {
		return this.isDirecpc;
	}

	public void setIsDirecpc(String isDirecpc) {
		this.isDirecpc = isDirecpc;
	}

	public String getIsDiscountExpirationNotice() {
		return this.isDiscountExpirationNotice;
	}

	public void setIsDiscountExpirationNotice(String isDiscountExpirationNotice) {
		this.isDiscountExpirationNotice = isDiscountExpirationNotice;
	}

	public String getIsEBill() {
		return this.isEBill;
	}

	public void setIsEBill(String isEBill) {
		this.isEBill = isEBill;
	}

	public String getIsEReceipt() {
		return this.isEReceipt;
	}

	public void setIsEReceipt(String isEReceipt) {
		this.isEReceipt = isEReceipt;
	}

	public String getIsEcommCallDetail() {
		return this.isEcommCallDetail;
	}

	public void setIsEcommCallDetail(String isEcommCallDetail) {
		this.isEcommCallDetail = isEcommCallDetail;
	}

	public String getIsEquipOneselfMerged() {
		return this.isEquipOneselfMerged;
	}

	public void setIsEquipOneselfMerged(String isEquipOneselfMerged) {
		this.isEquipOneselfMerged = isEquipOneselfMerged;
	}

	public String getIsHamiWaletApp() {
		return this.isHamiWaletApp;
	}

	public void setIsHamiWaletApp(String isHamiWaletApp) {
		this.isHamiWaletApp = isHamiWaletApp;
	}

	public String getIsHnDiscount() {
		return this.isHnDiscount;
	}

	public void setIsHnDiscount(String isHnDiscount) {
		this.isHnDiscount = isHnDiscount;
	}

	public String getIsIncludedUntaxedExpCode() {
		return this.isIncludedUntaxedExpCode;
	}

	public void setIsIncludedUntaxedExpCode(String isIncludedUntaxedExpCode) {
		this.isIncludedUntaxedExpCode = isIncludedUntaxedExpCode;
	}

	public String getIsIntlCallDetail() {
		return this.isIntlCallDetail;
	}

	public void setIsIntlCallDetail(String isIntlCallDetail) {
		this.isIntlCallDetail = isIntlCallDetail;
	}

	public String getIsJoin() {
		return this.isJoin;
	}

	public void setIsJoin(String isJoin) {
		this.isJoin = isJoin;
	}

	public String getIsL3w() {
		return this.isL3w;
	}

	public void setIsL3w(String isL3w) {
		this.isL3w = isL3w;
	}

	public String getIsLineBusinessConnect() {
		return this.isLineBusinessConnect;
	}

	public void setIsLineBusinessConnect(String isLineBusinessConnect) {
		this.isLineBusinessConnect = isLineBusinessConnect;
	}

	public String getIsLocCallDetailInquiryCharge() {
		return this.isLocCallDetailInquiryCharge;
	}

	public void setIsLocCallDetailInquiryCharge(String isLocCallDetailInquiryCharge) {
		this.isLocCallDetailInquiryCharge = isLocCallDetailInquiryCharge;
	}

	public String getIsMicroPaymentBillSeparation() {
		return this.isMicroPaymentBillSeparation;
	}

	public void setIsMicroPaymentBillSeparation(String isMicroPaymentBillSeparation) {
		this.isMicroPaymentBillSeparation = isMicroPaymentBillSeparation;
	}

	public String getIsMobileDepositRefund() {
		return this.isMobileDepositRefund;
	}

	public void setIsMobileDepositRefund(String isMobileDepositRefund) {
		this.isMobileDepositRefund = isMobileDepositRefund;
	}

	public String getIsMod() {
		return this.isMod;
	}

	public void setIsMod(String isMod) {
		this.isMod = isMod;
	}

	public String getIsModCallDetail() {
		return this.isModCallDetail;
	}

	public void setIsModCallDetail(String isModCallDetail) {
		this.isModCallDetail = isModCallDetail;
	}

	public String getIsModRechargeVoucher() {
		return this.isModRechargeVoucher;
	}

	public void setIsModRechargeVoucher(String isModRechargeVoucher) {
		this.isModRechargeVoucher = isModRechargeVoucher;
	}

	public String getIsMovement() {
		return this.isMovement;
	}

	public void setIsMovement(String isMovement) {
		this.isMovement = isMovement;
	}

	public String getIsMpro() {
		return this.isMpro;
	}

	public void setIsMpro(String isMpro) {
		this.isMpro = isMpro;
	}

	public String getIsNoAddDm() {
		return this.isNoAddDm;
	}

	public void setIsNoAddDm(String isNoAddDm) {
		this.isNoAddDm = isNoAddDm;
	}

	public String getIsNoChtGroupDm() {
		return this.isNoChtGroupDm;
	}

	public void setIsNoChtGroupDm(String isNoChtGroupDm) {
		this.isNoChtGroupDm = isNoChtGroupDm;
	}

	public String getIsNoShow() {
		return this.isNoShow;
	}

	public void setIsNoShow(String isNoShow) {
		this.isNoShow = isNoShow;
	}

	public String getIsNotify() {
		return this.isNotify;
	}

	public void setIsNotify(String isNotify) {
		this.isNotify = isNotify;
	}

	public String getIsOfficialUsed() {
		return this.isOfficialUsed;
	}

	public void setIsOfficialUsed(String isOfficialUsed) {
		this.isOfficialUsed = isOfficialUsed;
	}

	public String getIsOver100() {
		return this.isOver100;
	}

	public void setIsOver100(String isOver100) {
		this.isOver100 = isOver100;
	}

	public String getIsOverL0RateItemLimit() {
		return this.isOverL0RateItemLimit;
	}

	public void setIsOverL0RateItemLimit(String isOverL0RateItemLimit) {
		this.isOverL0RateItemLimit = isOverL0RateItemLimit;
	}

	public String getIsOverL3RateItemLimit() {
		return this.isOverL3RateItemLimit;
	}

	public void setIsOverL3RateItemLimit(String isOverL3RateItemLimit) {
		this.isOverL3RateItemLimit = isOverL3RateItemLimit;
	}

	public String getIsOverTwoMonth() {
		return this.isOverTwoMonth;
	}

	public void setIsOverTwoMonth(String isOverTwoMonth) {
		this.isOverTwoMonth = isOverTwoMonth;
	}

	public String getIsPagerStop() {
		return this.isPagerStop;
	}

	public void setIsPagerStop(String isPagerStop) {
		this.isPagerStop = isPagerStop;
	}

	public String getIsParty() {
		return this.isParty;
	}

	public void setIsParty(String isParty) {
		this.isParty = isParty;
	}

	public String getIsPbxJoin() {
		return this.isPbxJoin;
	}

	public void setIsPbxJoin(String isPbxJoin) {
		this.isPbxJoin = isPbxJoin;
	}

	public String getIsPrepaymentBill() {
		return this.isPrepaymentBill;
	}

	public void setIsPrepaymentBill(String isPrepaymentBill) {
		this.isPrepaymentBill = isPrepaymentBill;
	}

	public String getIsPrintInvoiceChargeDesc() {
		return this.isPrintInvoiceChargeDesc;
	}

	public void setIsPrintInvoiceChargeDesc(String isPrintInvoiceChargeDesc) {
		this.isPrintInvoiceChargeDesc = isPrintInvoiceChargeDesc;
	}

	public String getIsPrintLocalProject() {
		return this.isPrintLocalProject;
	}

	public void setIsPrintLocalProject(String isPrintLocalProject) {
		this.isPrintLocalProject = isPrintLocalProject;
	}

	public String getIsProjectPrepayment() {
		return this.isProjectPrepayment;
	}

	public void setIsProjectPrepayment(String isProjectPrepayment) {
		this.isProjectPrepayment = isProjectPrepayment;
	}

	public String getIsPrsCallDetail() {
		return this.isPrsCallDetail;
	}

	public void setIsPrsCallDetail(String isPrsCallDetail) {
		this.isPrsCallDetail = isPrsCallDetail;
	}

	public String getIsRefund() {
		return this.isRefund;
	}

	public void setIsRefund(String isRefund) {
		this.isRefund = isRefund;
	}

	public String getIsRefundAdslBundledLoc() {
		return this.isRefundAdslBundledLoc;
	}

	public void setIsRefundAdslBundledLoc(String isRefundAdslBundledLoc) {
		this.isRefundAdslBundledLoc = isRefundAdslBundledLoc;
	}

	public String getIsRefundCheck() {
		return this.isRefundCheck;
	}

	public void setIsRefundCheck(String isRefundCheck) {
		this.isRefundCheck = isRefundCheck;
	}

	public String getIsSms() {
		return this.isSms;
	}

	public void setIsSms(String isSms) {
		this.isSms = isSms;
	}

	public String getIsTransaction() {
		return this.isTransaction;
	}

	public void setIsTransaction(String isTransaction) {
		this.isTransaction = isTransaction;
	}

	public String getIsTransfer() {
		return this.isTransfer;
	}

	public void setIsTransfer(String isTransfer) {
		this.isTransfer = isTransfer;
	}

	public String getIsWorld() {
		return this.isWorld;
	}

	public void setIsWorld(String isWorld) {
		this.isWorld = isWorld;
	}

	public String getIsZeroBill() {
		return this.isZeroBill;
	}

	public void setIsZeroBill(String isZeroBill) {
		this.isZeroBill = isZeroBill;
	}

	public BigDecimal getItemCount() {
		return this.itemCount;
	}

	public void setItemCount(BigDecimal itemCount) {
		this.itemCount = itemCount;
	}

	public String getL4vType() {
		return this.l4vType;
	}

	public void setL4vType(String l4vType) {
		this.l4vType = l4vType;
	}

	public BigDecimal getLocAdslDiscount() {
		return this.locAdslDiscount;
	}

	public void setLocAdslDiscount(BigDecimal locAdslDiscount) {
		this.locAdslDiscount = locAdslDiscount;
	}

	public String getLocChargeType() {
		return this.locChargeType;
	}

	public void setLocChargeType(String locChargeType) {
		this.locChargeType = locChargeType;
	}

	public BigDecimal getLocChtMobileCommCharge() {
		return this.locChtMobileCommCharge;
	}

	public void setLocChtMobileCommCharge(BigDecimal locChtMobileCommCharge) {
		this.locChtMobileCommCharge = locChtMobileCommCharge;
	}

	public BigDecimal getLocCommChargeDiscount() {
		return this.locCommChargeDiscount;
	}

	public void setLocCommChargeDiscount(BigDecimal locCommChargeDiscount) {
		this.locCommChargeDiscount = locCommChargeDiscount;
	}

	public BigDecimal getLocDataLineOldDiscount() {
		return this.locDataLineOldDiscount;
	}

	public void setLocDataLineOldDiscount(BigDecimal locDataLineOldDiscount) {
		this.locDataLineOldDiscount = locDataLineOldDiscount;
	}

	public BigDecimal getLocDataLineVipDiscount() {
		return this.locDataLineVipDiscount;
	}

	public void setLocDataLineVipDiscount(BigDecimal locDataLineVipDiscount) {
		this.locDataLineVipDiscount = locDataLineVipDiscount;
	}

	public String getLocDbType() {
		return this.locDbType;
	}

	public void setLocDbType(String locDbType) {
		this.locDbType = locDbType;
	}

	public BigDecimal getLocGsmDiscount() {
		return this.locGsmDiscount;
	}

	public void setLocGsmDiscount(BigDecimal locGsmDiscount) {
		this.locGsmDiscount = locGsmDiscount;
	}

	public BigDecimal getLocInmarsatDiscount() {
		return this.locInmarsatDiscount;
	}

	public void setLocInmarsatDiscount(BigDecimal locInmarsatDiscount) {
		this.locInmarsatDiscount = locInmarsatDiscount;
	}

	public BigDecimal getLocIntlCharge3vAmount() {
		return this.locIntlCharge3vAmount;
	}

	public void setLocIntlCharge3vAmount(BigDecimal locIntlCharge3vAmount) {
		this.locIntlCharge3vAmount = locIntlCharge3vAmount;
	}

	public BigDecimal getLocIntlChargeDiscount() {
		return this.locIntlChargeDiscount;
	}

	public void setLocIntlChargeDiscount(BigDecimal locIntlChargeDiscount) {
		this.locIntlChargeDiscount = locIntlChargeDiscount;
	}

	public BigDecimal getLocLeasedLineDiscount() {
		return this.locLeasedLineDiscount;
	}

	public void setLocLeasedLineDiscount(BigDecimal locLeasedLineDiscount) {
		this.locLeasedLineDiscount = locLeasedLineDiscount;
	}

	public BigDecimal getLocNetworkChargeDiscount() {
		return this.locNetworkChargeDiscount;
	}

	public void setLocNetworkChargeDiscount(BigDecimal locNetworkChargeDiscount) {
		this.locNetworkChargeDiscount = locNetworkChargeDiscount;
	}

	public BigDecimal getLocPrepaymentBalance() {
		return this.locPrepaymentBalance;
	}

	public void setLocPrepaymentBalance(BigDecimal locPrepaymentBalance) {
		this.locPrepaymentBalance = locPrepaymentBalance;
	}

	public BigDecimal getLocSatelliteDiscount() {
		return this.locSatelliteDiscount;
	}

	public void setLocSatelliteDiscount(BigDecimal locSatelliteDiscount) {
		this.locSatelliteDiscount = locSatelliteDiscount;
	}

	public BigDecimal getLocStdDiscount() {
		return this.locStdDiscount;
	}

	public void setLocStdDiscount(BigDecimal locStdDiscount) {
		this.locStdDiscount = locStdDiscount;
	}

	public BigDecimal getLongDistanceAEndLineCharge() {
		return this.longDistanceAEndLineCharge;
	}

	public void setLongDistanceAEndLineCharge(BigDecimal longDistanceAEndLineCharge) {
		this.longDistanceAEndLineCharge = longDistanceAEndLineCharge;
	}

	public BigDecimal getLongDistanceBEndLineCharge() {
		return this.longDistanceBEndLineCharge;
	}

	public void setLongDistanceBEndLineCharge(BigDecimal longDistanceBEndLineCharge) {
		this.longDistanceBEndLineCharge = longDistanceBEndLineCharge;
	}

	public String getMailBillType() {
		return this.mailBillType;
	}

	public void setMailBillType(String mailBillType) {
		this.mailBillType = mailBillType;
	}

	public BigDecimal getMobileTransmissionVolume() {
		return this.mobileTransmissionVolume;
	}

	public void setMobileTransmissionVolume(BigDecimal mobileTransmissionVolume) {
		this.mobileTransmissionVolume = mobileTransmissionVolume;
	}

	public String getMobileVipType() {
		return this.mobileVipType;
	}

	public void setMobileVipType(String mobileVipType) {
		this.mobileVipType = mobileVipType;
	}

	public String getModAdslType() {
		return this.modAdslType;
	}

	public void setModAdslType(String modAdslType) {
		this.modAdslType = modAdslType;
	}

	public BigDecimal getModBChanelDiscount() {
		return this.modBChanelDiscount;
	}

	public void setModBChanelDiscount(BigDecimal modBChanelDiscount) {
		this.modBChanelDiscount = modBChanelDiscount;
	}

	public BigDecimal getModBeforeDeductAmount() {
		return this.modBeforeDeductAmount;
	}

	public void setModBeforeDeductAmount(BigDecimal modBeforeDeductAmount) {
		this.modBeforeDeductAmount = modBeforeDeductAmount;
	}

	public String getModDiscountCode() {
		return this.modDiscountCode;
	}

	public void setModDiscountCode(String modDiscountCode) {
		this.modDiscountCode = modDiscountCode;
	}

	public BigDecimal getModGiftRebateBalance() {
		return this.modGiftRebateBalance;
	}

	public void setModGiftRebateBalance(BigDecimal modGiftRebateBalance) {
		this.modGiftRebateBalance = modGiftRebateBalance;
	}

	public String getModMonthType() {
		return this.modMonthType;
	}

	public void setModMonthType(String modMonthType) {
		this.modMonthType = modMonthType;
	}

	public String getModOldDiscountType() {
		return this.modOldDiscountType;
	}

	public void setModOldDiscountType(String modOldDiscountType) {
		this.modOldDiscountType = modOldDiscountType;
	}

	public BigDecimal getModPChanelDiscount() {
		return this.modPChanelDiscount;
	}

	public void setModPChanelDiscount(BigDecimal modPChanelDiscount) {
		this.modPChanelDiscount = modPChanelDiscount;
	}

	public String getModPaymentType() {
		return this.modPaymentType;
	}

	public void setModPaymentType(String modPaymentType) {
		this.modPaymentType = modPaymentType;
	}

	public String getModPrepaymentEndYyymm() {
		return this.modPrepaymentEndYyymm;
	}

	public void setModPrepaymentEndYyymm(String modPrepaymentEndYyymm) {
		this.modPrepaymentEndYyymm = modPrepaymentEndYyymm;
	}

	public String getModPrepaymentStartYyymm() {
		return this.modPrepaymentStartYyymm;
	}

	public void setModPrepaymentStartYyymm(String modPrepaymentStartYyymm) {
		this.modPrepaymentStartYyymm = modPrepaymentStartYyymm;
	}

	public BigDecimal getModRechargeVoucherBalance() {
		return this.modRechargeVoucherBalance;
	}

	public void setModRechargeVoucherBalance(BigDecimal modRechargeVoucherBalance) {
		this.modRechargeVoucherBalance = modRechargeVoucherBalance;
	}

	public BigDecimal getModRechargeVoucherLastBalance() {
		return this.modRechargeVoucherLastBalance;
	}

	public void setModRechargeVoucherLastBalance(BigDecimal modRechargeVoucherLastBalance) {
		this.modRechargeVoucherLastBalance = modRechargeVoucherLastBalance;
	}

	public BigDecimal getModSChanelDiscount() {
		return this.modSChanelDiscount;
	}

	public void setModSChanelDiscount(BigDecimal modSChanelDiscount) {
		this.modSChanelDiscount = modSChanelDiscount;
	}

	public BigDecimal getModSUsageDiscount() {
		return this.modSUsageDiscount;
	}

	public void setModSUsageDiscount(BigDecimal modSUsageDiscount) {
		this.modSUsageDiscount = modSUsageDiscount;
	}

	public BigDecimal getModStoredCardThisRebate() {
		return this.modStoredCardThisRebate;
	}

	public void setModStoredCardThisRebate(BigDecimal modStoredCardThisRebate) {
		this.modStoredCardThisRebate = modStoredCardThisRebate;
	}

	public BigDecimal getMsgByday() {
		return this.msgByday;
	}

	public void setMsgByday(BigDecimal msgByday) {
		this.msgByday = msgByday;
	}

	public String getN070TelcomType() {
		return this.n070TelcomType;
	}

	public void setN070TelcomType(String n070TelcomType) {
		this.n070TelcomType = n070TelcomType;
	}

	public String getN1288Type() {
		return this.n1288Type;
	}

	public void setN1288Type(String n1288Type) {
		this.n1288Type = n1288Type;
	}

	public String getN3gEquipType() {
		return this.n3gEquipType;
	}

	public void setN3gEquipType(String n3gEquipType) {
		this.n3gEquipType = n3gEquipType;
	}

	public String getN4gSharePlanType() {
		return this.n4gSharePlanType;
	}

	public void setN4gSharePlanType(String n4gSharePlanType) {
		this.n4gSharePlanType = n4gSharePlanType;
	}

	public BigDecimal getNegagiveTaxTotalAmount() {
		return this.negagiveTaxTotalAmount;
	}

	public void setNegagiveTaxTotalAmount(BigDecimal negagiveTaxTotalAmount) {
		this.negagiveTaxTotalAmount = negagiveTaxTotalAmount;
	}

	public String getNewOldCycle() {
		return this.newOldCycle;
	}

	public void setNewOldCycle(String newOldCycle) {
		this.newOldCycle = newOldCycle;
	}

	public String getNewOldEquipNo() {
		return this.newOldEquipNo;
	}

	public void setNewOldEquipNo(String newOldEquipNo) {
		this.newOldEquipNo = newOldEquipNo;
	}

	public String getNewOldOfficeCode() {
		return this.newOldOfficeCode;
	}

	public void setNewOldOfficeCode(String newOldOfficeCode) {
		this.newOldOfficeCode = newOldOfficeCode;
	}

	public String getNewOldType() {
		return this.newOldType;
	}

	public void setNewOldType(String newOldType) {
		this.newOldType = newOldType;
	}

	public String getNpTelcomType() {
		return this.npTelcomType;
	}

	public void setNpTelcomType(String npTelcomType) {
		this.npTelcomType = npTelcomType;
	}

	public String getNpTelno() {
		return this.npTelno;
	}

	public void setNpTelno(String npTelno) {
		this.npTelno = npTelno;
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

	public String getOtherDiscountCode() {
		return this.otherDiscountCode;
	}

	public void setOtherDiscountCode(String otherDiscountCode) {
		this.otherDiscountCode = otherDiscountCode;
	}

	public BigDecimal getOtherGsmDiscount() {
		return this.otherGsmDiscount;
	}

	public void setOtherGsmDiscount(BigDecimal otherGsmDiscount) {
		this.otherGsmDiscount = otherGsmDiscount;
	}

	public BigDecimal getOtherSubEquipCount() {
		return this.otherSubEquipCount;
	}

	public void setOtherSubEquipCount(BigDecimal otherSubEquipCount) {
		this.otherSubEquipCount = otherSubEquipCount;
	}

	public BigDecimal getOver100Count() {
		return this.over100Count;
	}

	public void setOver100Count(BigDecimal over100Count) {
		this.over100Count = over100Count;
	}

	public BigDecimal getOver100Seq() {
		return this.over100Seq;
	}

	public void setOver100Seq(BigDecimal over100Seq) {
		this.over100Seq = over100Seq;
	}

	public String getPayBillResultType() {
		return this.payBillResultType;
	}

	public void setPayBillResultType(String payBillResultType) {
		this.payBillResultType = payBillResultType;
	}

	public BigDecimal getPayDeadline() {
		return this.payDeadline;
	}

	public void setPayDeadline(BigDecimal payDeadline) {
		this.payDeadline = payDeadline;
	}

	public String getPaymentNoticeDeliveryType() {
		return this.paymentNoticeDeliveryType;
	}

	public void setPaymentNoticeDeliveryType(String paymentNoticeDeliveryType) {
		this.paymentNoticeDeliveryType = paymentNoticeDeliveryType;
	}

	public String getPaymentResultDeliveryType() {
		return this.paymentResultDeliveryType;
	}

	public void setPaymentResultDeliveryType(String paymentResultDeliveryType) {
		this.paymentResultDeliveryType = paymentResultDeliveryType;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public BigDecimal getPbxDiscount() {
		return this.pbxDiscount;
	}

	public void setPbxDiscount(BigDecimal pbxDiscount) {
		this.pbxDiscount = pbxDiscount;
	}

	public String getPbxMassType() {
		return this.pbxMassType;
	}

	public void setPbxMassType(String pbxMassType) {
		this.pbxMassType = pbxMassType;
	}

	public String getPbxOfficeCode() {
		return this.pbxOfficeCode;
	}

	public void setPbxOfficeCode(String pbxOfficeCode) {
		this.pbxOfficeCode = pbxOfficeCode;
	}

	public String getPbxTelno() {
		return this.pbxTelno;
	}

	public void setPbxTelno(String pbxTelno) {
		this.pbxTelno = pbxTelno;
	}

	public String getPbxType() {
		return this.pbxType;
	}

	public void setPbxType(String pbxType) {
		this.pbxType = pbxType;
	}

	public String getPoiType() {
		return this.poiType;
	}

	public void setPoiType(String poiType) {
		this.poiType = poiType;
	}

	public BigDecimal getPositiveTaxTotalAmount() {
		return this.positiveTaxTotalAmount;
	}

	public void setPositiveTaxTotalAmount(BigDecimal positiveTaxTotalAmount) {
		this.positiveTaxTotalAmount = positiveTaxTotalAmount;
	}

	public String getPrepaymentEndType() {
		return this.prepaymentEndType;
	}

	public void setPrepaymentEndType(String prepaymentEndType) {
		this.prepaymentEndType = prepaymentEndType;
	}

	public String getProjectPrepaymentAccNo() {
		return this.projectPrepaymentAccNo;
	}

	public void setProjectPrepaymentAccNo(String projectPrepaymentAccNo) {
		this.projectPrepaymentAccNo = projectPrepaymentAccNo;
	}

	public BigDecimal getProjectPrepaymentDeductedAmount() {
		return this.projectPrepaymentDeductedAmount;
	}

	public void setProjectPrepaymentDeductedAmount(BigDecimal projectPrepaymentDeductedAmount) {
		this.projectPrepaymentDeductedAmount = projectPrepaymentDeductedAmount;
	}

	public String getReceiptNo() {
		return this.receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getRechargeVoucherType() {
		return this.rechargeVoucherType;
	}

	public void setRechargeVoucherType(String rechargeVoucherType) {
		this.rechargeVoucherType = rechargeVoucherType;
	}

	public String getRpEmpdisType() {
		return this.rpEmpdisType;
	}

	public void setRpEmpdisType(String rpEmpdisType) {
		this.rpEmpdisType = rpEmpdisType;
	}

	public String getRpOldDiscount() {
		return this.rpOldDiscount;
	}

	public void setRpOldDiscount(String rpOldDiscount) {
		this.rpOldDiscount = rpOldDiscount;
	}

	public String getRpStartYymm() {
		return this.rpStartYymm;
	}

	public void setRpStartYymm(String rpStartYymm) {
		this.rpStartYymm = rpStartYymm;
	}

	public String getRpStopYymm() {
		return this.rpStopYymm;
	}

	public void setRpStopYymm(String rpStopYymm) {
		this.rpStopYymm = rpStopYymm;
	}

	public String getRpType() {
		return this.rpType;
	}

	public void setRpType(String rpType) {
		this.rpType = rpType;
	}

	public String getRpVipDiscount() {
		return this.rpVipDiscount;
	}

	public void setRpVipDiscount(String rpVipDiscount) {
		this.rpVipDiscount = rpVipDiscount;
	}

	public String getSmsBatchNo() {
		return this.smsBatchNo;
	}

	public void setSmsBatchNo(String smsBatchNo) {
		this.smsBatchNo = smsBatchNo;
	}

	public String getSourceDataFrom() {
		return this.sourceDataFrom;
	}

	public void setSourceDataFrom(String sourceDataFrom) {
		this.sourceDataFrom = sourceDataFrom;
	}

	public BigDecimal getSpec3vAmount() {
		return this.spec3vAmount;
	}

	public void setSpec3vAmount(BigDecimal spec3vAmount) {
		this.spec3vAmount = spec3vAmount;
	}

	public String getSpecCountryType() {
		return this.specCountryType;
	}

	public void setSpecCountryType(String specCountryType) {
		this.specCountryType = specCountryType;
	}

	public BigDecimal getSpecDiscount() {
		return this.specDiscount;
	}

	public void setSpecDiscount(BigDecimal specDiscount) {
		this.specDiscount = specDiscount;
	}

	public BigDecimal getSpecSameEqpOverseasAmount() {
		return this.specSameEqpOverseasAmount;
	}

	public void setSpecSameEqpOverseasAmount(BigDecimal specSameEqpOverseasAmount) {
		this.specSameEqpOverseasAmount = specSameEqpOverseasAmount;
	}

	public BigDecimal getSpecSameIdAmount() {
		return this.specSameIdAmount;
	}

	public void setSpecSameIdAmount(BigDecimal specSameIdAmount) {
		this.specSameIdAmount = specSameIdAmount;
	}

	public BigDecimal getSpecialServiceDiscount() {
		return this.specialServiceDiscount;
	}

	public void setSpecialServiceDiscount(BigDecimal specialServiceDiscount) {
		this.specialServiceDiscount = specialServiceDiscount;
	}

	public BigDecimal getSpecialSetDiscount() {
		return this.specialSetDiscount;
	}

	public void setSpecialSetDiscount(BigDecimal specialSetDiscount) {
		this.specialSetDiscount = specialSetDiscount;
	}

	public String getSpeedCode() {
		return this.speedCode;
	}

	public void setSpeedCode(String speedCode) {
		this.speedCode = speedCode;
	}

	public BigDecimal getSponsorshipBalance() {
		return this.sponsorshipBalance;
	}

	public void setSponsorshipBalance(BigDecimal sponsorshipBalance) {
		this.sponsorshipBalance = sponsorshipBalance;
	}

	public BigDecimal getSponsorshipProjectRebate() {
		return this.sponsorshipProjectRebate;
	}

	public void setSponsorshipProjectRebate(BigDecimal sponsorshipProjectRebate) {
		this.sponsorshipProjectRebate = sponsorshipProjectRebate;
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStdMonthType() {
		return this.stdMonthType;
	}

	public void setStdMonthType(String stdMonthType) {
		this.stdMonthType = stdMonthType;
	}

	public String getStdOfferingType() {
		return this.stdOfferingType;
	}

	public void setStdOfferingType(String stdOfferingType) {
		this.stdOfferingType = stdOfferingType;
	}

	public String getStdSecurityType() {
		return this.stdSecurityType;
	}

	public void setStdSecurityType(String stdSecurityType) {
		this.stdSecurityType = stdSecurityType;
	}

	public BigDecimal getSubEquipCount() {
		return this.subEquipCount;
	}

	public void setSubEquipCount(BigDecimal subEquipCount) {
		this.subEquipCount = subEquipCount;
	}

	public String getSubHnEquipNo() {
		return this.subHnEquipNo;
	}

	public void setSubHnEquipNo(String subHnEquipNo) {
		this.subHnEquipNo = subHnEquipNo;
	}

	public BigDecimal getSubNegativeAmount() {
		return this.subNegativeAmount;
	}

	public void setSubNegativeAmount(BigDecimal subNegativeAmount) {
		this.subNegativeAmount = subNegativeAmount;
	}

	public String getSubOpClass() {
		return this.subOpClass;
	}

	public void setSubOpClass(String subOpClass) {
		this.subOpClass = subOpClass;
	}

	public String getSubsType() {
		return this.subsType;
	}

	public void setSubsType(String subsType) {
		this.subsType = subsType;
	}

	public BigDecimal getTaxExcludedTotalAmount() {
		return this.taxExcludedTotalAmount;
	}

	public void setTaxExcludedTotalAmount(BigDecimal taxExcludedTotalAmount) {
		this.taxExcludedTotalAmount = taxExcludedTotalAmount;
	}

	public String getTaxFreeCardNo() {
		return this.taxFreeCardNo;
	}

	public void setTaxFreeCardNo(String taxFreeCardNo) {
		this.taxFreeCardNo = taxFreeCardNo;
	}

	public BigDecimal getTaxFreeIsModTotalAmount() {
		return this.taxFreeIsModTotalAmount;
	}

	public void setTaxFreeIsModTotalAmount(BigDecimal taxFreeIsModTotalAmount) {
		this.taxFreeIsModTotalAmount = taxFreeIsModTotalAmount;
	}

	public BigDecimal getTaxFreeModTotalAmount() {
		return this.taxFreeModTotalAmount;
	}

	public void setTaxFreeModTotalAmount(BigDecimal taxFreeModTotalAmount) {
		this.taxFreeModTotalAmount = taxFreeModTotalAmount;
	}

	public BigDecimal getTaxFreeTotalAmount() {
		return this.taxFreeTotalAmount;
	}

	public void setTaxFreeTotalAmount(BigDecimal taxFreeTotalAmount) {
		this.taxFreeTotalAmount = taxFreeTotalAmount;
	}

	public String getTaxPrintType() {
		return this.taxPrintType;
	}

	public void setTaxPrintType(String taxPrintType) {
		this.taxPrintType = taxPrintType;
	}

	public BigDecimal getTaxZeroTotalAmount() {
		return this.taxZeroTotalAmount;
	}

	public void setTaxZeroTotalAmount(BigDecimal taxZeroTotalAmount) {
		this.taxZeroTotalAmount = taxZeroTotalAmount;
	}

	public String getTformOfferType() {
		return this.tformOfferType;
	}

	public void setTformOfferType(String tformOfferType) {
		this.tformOfferType = tformOfferType;
	}

	public BigDecimal getTieCityCircuitDiscount() {
		return this.tieCityCircuitDiscount;
	}

	public void setTieCityCircuitDiscount(BigDecimal tieCityCircuitDiscount) {
		this.tieCityCircuitDiscount = tieCityCircuitDiscount;
	}

	public BigDecimal getTieCityCircuitVipDiscount() {
		return this.tieCityCircuitVipDiscount;
	}

	public void setTieCityCircuitVipDiscount(BigDecimal tieCityCircuitVipDiscount) {
		this.tieCityCircuitVipDiscount = tieCityCircuitVipDiscount;
	}

	public BigDecimal getTieContractDiscount() {
		return this.tieContractDiscount;
	}

	public void setTieContractDiscount(BigDecimal tieContractDiscount) {
		this.tieContractDiscount = tieContractDiscount;
	}

	public BigDecimal getTieIntlChargeDiscount() {
		return this.tieIntlChargeDiscount;
	}

	public void setTieIntlChargeDiscount(BigDecimal tieIntlChargeDiscount) {
		this.tieIntlChargeDiscount = tieIntlChargeDiscount;
	}

	public BigDecimal getTieOldDiscount() {
		return this.tieOldDiscount;
	}

	public void setTieOldDiscount(BigDecimal tieOldDiscount) {
		this.tieOldDiscount = tieOldDiscount;
	}

	public BigDecimal getTieSpecialDiscount() {
		return this.tieSpecialDiscount;
	}

	public void setTieSpecialDiscount(BigDecimal tieSpecialDiscount) {
		this.tieSpecialDiscount = tieSpecialDiscount;
	}

	public String getTieType() {
		return this.tieType;
	}

	public void setTieType(String tieType) {
		this.tieType = tieType;
	}

	public BigDecimal getTieVipDiscount() {
		return this.tieVipDiscount;
	}

	public void setTieVipDiscount(BigDecimal tieVipDiscount) {
		this.tieVipDiscount = tieVipDiscount;
	}

	public String getTimelyBillClosedDate() {
		return this.timelyBillClosedDate;
	}

	public void setTimelyBillClosedDate(String timelyBillClosedDate) {
		this.timelyBillClosedDate = timelyBillClosedDate;
	}

	public String getTimelyBillOperator() {
		return this.timelyBillOperator;
	}

	public void setTimelyBillOperator(String timelyBillOperator) {
		this.timelyBillOperator = timelyBillOperator;
	}

	public String getTimelyBillSeqNo() {
		return this.timelyBillSeqNo;
	}

	public void setTimelyBillSeqNo(String timelyBillSeqNo) {
		this.timelyBillSeqNo = timelyBillSeqNo;
	}

	public BigDecimal getTollCharge() {
		return this.tollCharge;
	}

	public void setTollCharge(BigDecimal tollCharge) {
		this.tollCharge = tollCharge;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTotalBillTestType() {
		return this.totalBillTestType;
	}

	public void setTotalBillTestType(String totalBillTestType) {
		this.totalBillTestType = totalBillTestType;
	}

	public String getTotalBillType() {
		return this.totalBillType;
	}

	public void setTotalBillType(String totalBillType) {
		this.totalBillType = totalBillType;
	}

	public BigDecimal getTotalTax() {
		return this.totalTax;
	}

	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

	public BigDecimal getUmsDiscount() {
		return this.umsDiscount;
	}

	public void setUmsDiscount(BigDecimal umsDiscount) {
		this.umsDiscount = umsDiscount;
	}

	public String getUpgradedEquipNo() {
		return this.upgradedEquipNo;
	}

	public void setUpgradedEquipNo(String upgradedEquipNo) {
		this.upgradedEquipNo = upgradedEquipNo;
	}

	public String getUpgradedOfficeCode() {
		return this.upgradedOfficeCode;
	}

	public void setUpgradedOfficeCode(String upgradedOfficeCode) {
		this.upgradedOfficeCode = upgradedOfficeCode;
	}

	public String getVipType() {
		return this.vipType;
	}

	public void setVipType(String vipType) {
		this.vipType = vipType;
	}

	public String getVoipEquipType() {
		return this.voipEquipType;
	}

	public void setVoipEquipType(String voipEquipType) {
		this.voipEquipType = voipEquipType;
	}

	public String getWhosecallFlag() {
		return this.whosecallFlag;
	}

	public void setWhosecallFlag(String whosecallFlag) {
		this.whosecallFlag = whosecallFlag;
	}

	public String getWlanDiscountCode() {
		return this.wlanDiscountCode;
	}

	public void setWlanDiscountCode(String wlanDiscountCode) {
		this.wlanDiscountCode = wlanDiscountCode;
	}

}