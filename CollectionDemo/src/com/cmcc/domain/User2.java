package com.cmcc.domain;

//用于测试comparator类的比较方法
public class User2 {
	private String name;
	private Integer order;
	private Integer age;
	private Integer grade;
	
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", order=" + order + "]";
	}
}
