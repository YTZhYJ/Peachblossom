package com.pytd.db.entity;

import java.sql.Date;

/**
 * 新闻表
 * 
 * @author zhang
 *
 */
public class Message {

	private Long id;                       //信息的ID
	private String title;                  //消息标题
	private DictSequence sequence;             //消息顺序
	private String content;                //消息内容
	private Date releaseTime;              //发布时间
	private User operator;                 //操作人员
	private String attachment;             //附件
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public DictSequence getSequence() {
		return sequence;
	}
	public void setSequence(DictSequence sequence) {
		this.sequence = sequence;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public User getOperator() {
		return operator;
	}
	public void setOperator(User operator) {
		this.operator = operator;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	
}
