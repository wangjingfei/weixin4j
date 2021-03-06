package com.foxinmy.weixin4j.msg;

import com.foxinmy.weixin4j.model.BaseMsg;
import com.foxinmy.weixin4j.type.MessageType;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 文本消息
 * 
 * @className TextMessage
 * @author jy.hu
 * @date 2014年4月6日
 * @since JDK 1.7
 * @see <a
 *      href="http://mp.weixin.qq.com/wiki/10/79502792eef98d6e0c6e1739da387346.html#.E6.96.87.E6.9C.AC.E6.B6.88.E6.81.AF">订阅号、服务号的文本消息</a>
 * @see <a
 *      href="http://qydev.weixin.qq.com/wiki/index.php?title=%E6%8E%A5%E6%94%B6%E6%99%AE%E9%80%9A%E6%B6%88%E6%81%AF#text.E6.B6.88.E6.81.AF">企业号的文本消息</a>
 */
public class TextMessage extends BaseMsg {

	private static final long serialVersionUID = -7018053906644190260L;

	public TextMessage() {
		super(MessageType.text.name());
	}

	@XStreamAlias("Content")
	private String content; // 消息内容

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "TextMessage [content=" + content + ", " + super.toString()
				+ "]";
	}
}
