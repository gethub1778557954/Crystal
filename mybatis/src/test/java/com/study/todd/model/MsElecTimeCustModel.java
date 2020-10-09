package com.study.todd.model;

import java.math.BigDecimal;
import java.util.Date;

public class MsElecTimeCustModel {
	/**
	 * 主键
	 */
 	private String elecArcId;

 	/**
 	 * 计量ID
 	 */
 	private String elecId;

 	/**
     * 结算日期
     */
    private Date settleTime;

    /**
     * elec_time
     */
    private String elecTime;

    /**
     * 用电企业id
     */
    private String customerId;

    /**
     * 用电企业类型
     */
    private String customerType;

    /**
     * 结算单元id
     */
    private String tradeCellId;

    /**
     * 用电户号
     */
    private String elecConsId;

    /**
     * 营销系统中计量点ID
     */
    private String meterId;

    /**
     * 实际用电量
     */
    private String consElec;

    /**
     * 正向电量
     */
    private String forwardElec;
    /**
     * 反向电量
     */
    private String backwardElec;

    /**
     * 冲红或冲正
     */
    private String exFlushRed;

    /**
     * 营销推送时间
     */
    private Date mkPushTime;

    /**
     *  确认状态
     */
    private String confirmStatus;

    /**
     * ex_check 是否校核
     */
    private String exCheck;

    /**
     * 版本号
     */
    private String settleVersion;

    /**
     * 所属市场
     */
    private String marketId;

    /**
     * 提取人
     */
    private String extractPerson;

    /**
     * 提取时间
     */
    private Date extractTime;

    /**
     * 结算日期
     */
    private Date settleDate;

    /**
     * 发布状态
     */
    private String releaseStatus;

    /**
     * 确认人
     */
    private String confirmPerson;

    /**
     * 确认时间
     */
    private Date confirmTime;



	public String getElecArcId() {
		return elecArcId;
	}

	public void setElecArcId(String elecArcId) {
		this.elecArcId = elecArcId;
	}

	public String getElecId() {
		return elecId;
	}

	public void setElecId(String elecId) {
		this.elecId = elecId;
	}

	public Date getSettleTime() {
		return settleTime;
	}

	public void setSettleTime(Date settleTime) {
		this.settleTime = settleTime;
	}



	public String getElecTime() {
		return elecTime;
	}

	public void setElecTime(String elecTime) {
		this.elecTime = elecTime;
	}

	public String getConsElec() {
		return consElec;
	}

	public void setConsElec(String consElec) {
		this.consElec = consElec;
	}

	public String getForwardElec() {
		return forwardElec;
	}

	public void setForwardElec(String forwardElec) {
		this.forwardElec = forwardElec;
	}

	public String getBackwardElec() {
		return backwardElec;
	}

	public void setBackwardElec(String backwardElec) {
		this.backwardElec = backwardElec;
	}

	public Date getMkPushTime() {
		return mkPushTime;
	}

	public void setMkPushTime(Date mkPushTime) {
		this.mkPushTime = mkPushTime;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getTradeCellId() {
		return tradeCellId;
	}

	public void setTradeCellId(String tradeCellId) {
		this.tradeCellId = tradeCellId;
	}

	public String getElecConsId() {
		return elecConsId;
	}

	public void setElecConsId(String elecConsId) {
		this.elecConsId = elecConsId;
	}

	public String getMeterId() {
		return meterId;
	}

	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}

	public String getExFlushRed() {
		return exFlushRed;
	}

	public void setExFlushRed(String exFlushRed) {
		this.exFlushRed = exFlushRed;
	}

	public String getConfirmStatus() {
		return confirmStatus;
	}

	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

	public String getExCheck() {
		return exCheck;
	}

	public void setExCheck(String exCheck) {
		this.exCheck = exCheck;
	}

	public String getSettleVersion() {
		return settleVersion;
	}

	public void setSettleVersion(String settleVersion) {
		this.settleVersion = settleVersion;
	}

	public String getMarketId() {
		return marketId;
	}

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}

	public String getExtractPerson() {
		return extractPerson;
	}

	public void setExtractPerson(String extractPerson) {
		this.extractPerson = extractPerson;
	}

	public Date getExtractTime() {
		return extractTime;
	}

	public void setExtractTime(Date extractTime) {
		this.extractTime = extractTime;
	}

	public Date getSettleDate() {
		return settleDate;
	}

	public void setSettleDate(Date settleDate) {
		this.settleDate = settleDate;
	}

	public String getReleaseStatus() {
		return releaseStatus;
	}

	public void setReleaseStatus(String releaseStatus) {
		this.releaseStatus = releaseStatus;
	}

	public String getConfirmPerson() {
		return confirmPerson;
	}

	public void setConfirmPerson(String confirmPerson) {
		this.confirmPerson = confirmPerson;
	}

	public Date getConfirmTime() {
		return confirmTime;
	}

	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}

	@Override
	public String toString() {
		return "MsElecTimeCustModel [elecArcId=" + elecArcId + ", elecId=" + elecId + ", settleTime=" + settleTime
				+ ", elecTime=" + elecTime + ", customerId=" + customerId + ", customerType=" + customerType
				+ ", tradeCellId=" + tradeCellId + ", elecConsId=" + elecConsId + ", meterId=" + meterId + ", consElec="
				+ consElec + ", forwardElec=" + forwardElec + ", backwardElec=" + backwardElec + ", exFlushRed="
				+ exFlushRed + ", mkPushTime=" + mkPushTime + ", confirmStatus=" + confirmStatus + ", exCheck="
				+ exCheck + ", settleVersion=" + settleVersion + ", marketId=" + marketId + ", extractPerson="
				+ extractPerson + ", extractTime=" + extractTime + ", settleDate=" + settleDate + ", releaseStatus="
				+ releaseStatus + ", confirmPerson=" + confirmPerson + ", confirmTime=" + confirmTime + "]";
	}



}
