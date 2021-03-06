package com.foxinmy.weixin4j.msg;

import com.foxinmy.weixin4j.model.BaseMsg;
import com.foxinmy.weixin4j.type.MessageType;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 图片消息
 * 
 * @className ImageMessage
 * @author jy.hu
 * @date 2014年4月6日
 * @since JDK 1.7
 * @see <a
 *      href="http://mp.weixin.qq.com/wiki/10/79502792eef98d6e0c6e1739da387346.html#.E5.9B.BE.E7.89.87.E6.B6.88.E6.81.AF">订阅号、服务号的图片消息</a>
 * @see <a
 *      href="http://qydev.weixin.qq.com/wiki/index.php?title=%E6%8E%A5%E6%94%B6%E6%99%AE%E9%80%9A%E6%B6%88%E6%81%AF#image.E6.B6.88.E6.81.AF">企业号的图片消息</a>
 */
public class ImageMessage extends BaseMsg {

	private static final long serialVersionUID = 8430800898756567016L;

	public ImageMessage() {
		super(MessageType.image.name());
	}

	@XStreamAlias("PicUrl")
	private String picUrl; // 图片链接
	@XStreamAlias("MediaId")
	private String mediaId; // 图片消息媒体id，可以调用多媒体文件下载接口拉取数据。

	public String getPicUrl() {
		return picUrl;
	}

	public String getMediaId() {
		return mediaId;
	}

	@Override
	public String toString() {
		return "ImageMessage [picUrl=" + picUrl + ", mediaId=" + mediaId + ", "
				+ super.toString() + "]";
	}
}
