package com.cmcc.domain;

//����һ��ʵ�ֱȽϵ�����Ҫ�ڽ�����ʵ��Comparable�ӿڣ���ͨ��ʵ�����е�compareTo()������ʵ��
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
	
	//��Ҫʵ��Comparable���е�compareTo(����
	@Override
	public int compareTo(User4Comparable user) {
		return this.getOrder().compareTo(user.getOrder());
	}

}
