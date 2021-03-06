package com.foxinmy.weixin4j.mp.datacube;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 数据统计:图文群发总数据
 * 
 * @className ArticleTotal
 * @author jy
 * @date 2015年1月30日
 * @since JDK 1.7
 * @see
 */
public class ArticleTotal implements Serializable {
	private static final long serialVersionUID = -6820948857241500950L;

	@JSONField(name = "ref_date")
	private String refDate; // 数据的日期
	/**
	 * 这里的msgid实际上是由msgid（图文消息id）和index（消息次序索引）组成， 例如12003_3，
	 * 其中12003是msgid，即一次群发的id消息的； 3为index，假设该次群发的图文消息共5个文章（因为可能为多图文）， 3表示5个中的第3个
	 */
	private String msgid;
	private String title;// 图文消息的标题
	private List<ArticleDatacube2> details;

	public String getRefDate() {
		return refDate;
	}

	public void setRefDate(String refDate) {
		this.refDate = refDate;
	}

	public String getMsgid() {
		return msgid;
	}

	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<ArticleDatacube2> getDetails() {
		return details;
	}

	public void setDetails(List<ArticleDatacube2> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "ArticleTotal [refDate=" + refDate + ", msgid=" + msgid
				+ ", title=" + title + ", details=" + details + "]";
	}
}
