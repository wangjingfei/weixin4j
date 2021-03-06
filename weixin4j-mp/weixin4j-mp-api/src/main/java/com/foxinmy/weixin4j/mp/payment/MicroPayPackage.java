package com.foxinmy.weixin4j.mp.payment;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.foxinmy.weixin4j.model.WeixinMpAccount;
import com.foxinmy.weixin4j.util.RandomUtil;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 刷卡支付
 * 
 * @className MicroPayPackage
 * @author jy
 * @date 2014年11月17日
 * @since JDK 1.7
 * @see
 */
@XStreamAlias("xml")
public class MicroPayPackage extends PayPackage {

	private static final long serialVersionUID = 8944928173669656177L;

	private String appid; // 微信分配的公众账号 必须
	@XStreamAlias("mch_id")
	@JSONField(name = "mch_id")
	private String mchId; // 微信支付分配的商户号 必须
	@XStreamAlias("device_info")
	@JSONField(name = "device_info")
	private String deviceInfo; // 微信支付分配的终端设备号 非必须
	@XStreamAlias("nonce_str")
	@JSONField(name = "nonce_str")
	private String nonceStr; // 随机字符串,不长于 32 位 必须
	private String sign; // 签名 必须
	@XStreamAlias("auth_code")
	@JSONField(name = "auth_code")
	private String authCode; // 扫码支付授权码 ,设备读取用 户微信中的条码或者二维码 信息

	public MicroPayPackage() {

	}

	public MicroPayPackage(WeixinMpAccount weixinAccount, String body,
			String attach, String outTradeNo, double totalFee,
			String spbillCreateIp, String authCode) {
		this(weixinAccount.getId(), weixinAccount.getMchId(), weixinAccount
				.getDeviceInfo(), RandomUtil.generateString(16), body, attach,
				outTradeNo, totalFee, spbillCreateIp, null, null, null,
				authCode);
	}

	public MicroPayPackage(String appid, String mchId, String deviceInfo,
			String nonceStr, String body, String attach, String outTradeNo,
			double totalFee, String spbillCreateIp, Date timeStart,
			Date timeExpire, String goodsTag, String authCode) {
		super(body, attach, outTradeNo, totalFee, spbillCreateIp, timeStart,
				timeExpire, goodsTag, null);
		this.appid = appid;
		this.mchId = mchId;
		this.deviceInfo = deviceInfo;
		this.nonceStr = nonceStr;
		this.authCode = authCode;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getMchId() {
		return mchId;
	}

	public void setMchId(String mchId) {
		this.mchId = mchId;
	}

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDevice_info(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getNonceStr() {
		return nonceStr;
	}

	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	@Override
	public String toString() {
		return "MicroPayPackage [appid=" + appid + ", mchId=" + mchId
				+ ", deviceInfo=" + deviceInfo + ", nonceStr=" + nonceStr
				+ ", sign=" + sign + ", authCode=" + authCode + ", "
				+ super.toString() + "]";
	}
}
