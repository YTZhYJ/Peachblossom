package com.pytd.db.entity;
/**
 * 新闻展示序号表
 * 
 * @author zhang
 *
 */
public class DictSequence {

	private Long id;              //排序信息ID
	private int level;            //排序等级
	private String discription;   //排序描述
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	
}
