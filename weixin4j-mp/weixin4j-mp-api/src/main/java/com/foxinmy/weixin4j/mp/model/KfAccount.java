package com.foxinmy.weixin4j.mp.model;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.foxinmy.weixin4j.mp.type.KfOnlineStatus;

/**
 * 多客服账号信息
 * 
 * @className KfAccount
 * @author jy
 * @date 2014年11月16日
 * @since JDK 1.7
 * @see <a href="http://dkf.qq.com/document-3_1.html">多客服账号信息</a>
 */
public class KfAccount implements Serializable {

	private static final long serialVersionUID = -4565570894727129245L;

	@JSONField(name = "kf_account")
	// 客服账号@微信别名 微信别名如有修改，旧账号返回旧的微信别名，新增的账号返回新的微信别名
	private String account;
	@JSONField(name = "kf_nick")
	private String nickName;// 客服昵称
	@JSONField(name = "kf_id")
	private String id;// 客服工号
	@JSONField(name = "kf_headimg")
	private String headImg; //客服头像

	// 以下字段是调用在线客服状态返回的字段
	private KfOnlineStatus status; // 客服在线状态 1：pc在线，2：手机在线 若pc和手机同时在线则为 1+2=3
	@JSONField(name = "auto_accept")
	private int autoAccept;// 客服设置的最大自动接入数
	@JSONField(name = "accepted_case")
	private int acceptedCase;// 客服当前正在接待的会话数

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public KfOnlineStatus getStatus() {
		return status;
	}

	public void setStatus(int status) {
		if (status == 1) {
			this.status = KfOnlineStatus.PC;
		} else if (status == 2) {
			this.status = KfOnlineStatus.MOBILE;
		} else {
			this.status = KfOnlineStatus.BOTH;
		}
	}

	public int getAutoAccept() {
		return autoAccept;
	}

	public void setAutoAccept(int autoAccept) {
		this.autoAccept = autoAccept;
	}

	public int getAcceptedCase() {
		return acceptedCase;
	}

	public void setAcceptedCase(int acceptedCase) {
		this.acceptedCase = acceptedCase;
	}

	@Override
	public String toString() {
		return "KfAccount [account=" + account + ", nickName=" + nickName
				+ ", id=" + id + ", status=" + status + ", autoAccept="
				+ autoAccept + ", acceptedCase=" + acceptedCase + "]";
	}
}
