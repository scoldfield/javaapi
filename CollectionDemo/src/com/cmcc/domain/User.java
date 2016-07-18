package com.cmcc.domain;

//用于测试comparator类的比较方法
public class User {
	private String name;
	private Integer order;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", order=" + order + "]";
	}
}
