package com.foxinmy.weixin4j.mp.model;

import java.io.Serializable;
import java.util.Date;

import com.foxinmy.weixin4j.mp.type.CustomRecordOperCode;

/**
 * 客服聊天记录
 * 
 * @className CustomRecord
 * @author jy
 * @date 2014年6月28日
 * @since JDK 1.7
 */
public class CustomRecord implements Serializable {

	private static final long serialVersionUID = -4024147769411601325L;
	private String worker;// 客服账号
	private String openid;// 用户的标识
	private CustomRecordOperCode opercode;// 操作ID（会话状态）
	private Date time;// 操作时间
	private String text;// 聊天记录

	public String getWorker() {
		return worker;
	}

	public void setWorker(String worker) {
		this.worker = worker;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public CustomRecordOperCode getOpercode() {
		return opercode;
	}

	public void setOpercode(int opercode) {
		this.opercode = CustomRecordOperCode.getOper(opercode);
	}

	public Date getTime() {
		return (Date) time.clone();
	}

	public void setTime(long time) {
		this.time = new Date(time * 1000l);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[CustomRecord worker=").append(worker);
		sb.append(" ,openid=").append(openid);
		sb.append(" ,opercode=").append(opercode);
		sb.append(" ,time=").append(time);
		sb.append(" ,text=").append(text);
		sb.append("]");
		return sb.toString();
	}
}
