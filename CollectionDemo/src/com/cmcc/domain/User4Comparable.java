package com.cmcc.domain;

//另外一种实现比较的是需要在将基类实现Comparable接口，并通过实现其中的compareTo()方法来实现
public class User4Comparable implements Comparable<User4Comparable> {

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
	
	//需要实现Comparable类中的compareTo(方法
	@Override
	public int compareTo(User4Comparable user) {
		return this.getOrder().compareTo(user.getOrder());
	}

}
